/*
 *	This file is part of dhcp4java, a DHCP API for the Java language.
 *	(c) 2006 Stephan Hadinger
 *
 *	This library is free software; you can redistribute it and/or
 *	modify it under the terms of the GNU Lesser General Public
 *	License as published by the Free Software Foundation; either
 *	version 2.1 of the License, or (at your option) any later version.
 *
 *	This library is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *	Lesser General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public
 *	License along with this library; if not, write to the Free Software
 *	Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.dhcp4java.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.dhcp4java.DHCPCoreServer;
import org.dhcp4java.DHCPServerInitException;
import org.dhcp4java.DHCPServlet;
import org.dhcp4java.server.config.ConfigException;
import org.dhcp4java.server.config.GenericConfigReader;
import org.dhcp4java.server.config.FrontendConfig;
import org.dhcp4java.server.config.GlobalConfig;
import org.dhcp4java.server.config.TopologyConfig;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 * This is the main class for DHCP Cluster Server (FrontEnd).
 * 
 * <p>This class is responsible for loading all configuration parameters,
 * and launching the server engine.
 * 
 * <p>Bootstrap is done through a properties file.
 * 
 * @author Stephan Hadinger
 * @version 0.71
 */
public class DHCPClusterNode implements Serializable, Runnable {

    private static final long serialVersionUID = 1L;
    
	private static final Logger logger = Logger.getLogger(DHCPClusterNode.class.getName().toLowerCase());

	private final Properties					bootstrapProps;
	
	private GenericConfigReader				configReader = null;
	
	/* 3 Levels of configuration */
	private AtomicReference<FrontendConfig>	frontendConfig = new AtomicReference<FrontendConfig>();
	private AtomicReference<GlobalConfig>		globalConfig = new AtomicReference<GlobalConfig>();
	private AtomicReference<TopologyConfig>	topologyConfig = new AtomicReference<TopologyConfig>();
	
	/* The DHCP Servlet used */
	private DHCPServlet						internalServlet;
	
	/* The DHCP Server Core used */
	private DHCPCoreServer						internalServer;
	
	/* Thread called when Finalizing */
	private Thread								finalizerThread;
	
	/* Batch update of leases */
	private Executor							leaseBgExecutor;
	
	/* Back-End */
	// TODO
	
	/**
	 * Constructor for the <tt>DHCPClusterNode</tt>.
	 * 
	 * <p>This is the main object running the server. It is responsible for loading the configuration,
	 * initializing the server and running it. It should support dynamic reload of topology configuration
	 * without a full server restart.
	 * 
	 * <p>If you are connected to a database, it must be running.
	 * 
	 * <p>Application launch is done through a command-line wrapper.
	 */
	public DHCPClusterNode(Properties bootstrapProps) throws ConfigException, DHCPServerInitException {
		this.bootstrapProps = bootstrapProps;
		
		try {
			// instanciate config reader object
			String configReaderClassName = this.bootstrapProps.getProperty(CONFIG_READER);
			if (configReaderClassName == null) {
				throw new ConfigException("no '"+CONFIG_READER+"' parameter in "+DHCPD_PROPERTIES);
			}
			Class configReaderClassname = Class.forName(configReaderClassName);

			Class[] constrSignature = { };
			Object[] constrParams = { };
			configReader = (GenericConfigReader) configReaderClassname.getConstructor(constrSignature).newInstance(constrParams);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Unable to load configuration", e);
			throw new ConfigException("Unable to load configuration", e);
		}
		
		configReader.init(this, bootstrapProps);
		frontendConfig.set(configReader.getFrontEndConfig());
		globalConfig.set(configReader.getGlobalConfig());
		topologyConfig.set(configReader.getTopologyConfig());
		// check configuration
		if (frontendConfig.get() == null) {
			throw new NullPointerException("frontendConfig is null");
		}
		if (globalConfig.get() == null) {
			throw new NullPointerException("globalConfig is null");
		}
		if (topologyConfig.get() == null) {
			throw new NullPointerException("topologyConfig is null");
		}
		
		// instanciate DHCP Servlet
		internalServlet = new MainServlet(this);
		
		// prepare parameters for server
		Properties serverProps = new Properties();
		FrontendConfig frontConf = frontendConfig.get();
		serverProps.setProperty(DHCPCoreServer.SERVER_ADDRESS, frontConf.getListenIp().getHostAddress()+":"+frontConf.getListenPort());
		serverProps.setProperty(DHCPCoreServer.SERVER_THREADS, Integer.toString(frontConf.getThreadsNb()));
		serverProps.setProperty(DHCPCoreServer.SERVER_THREADS_MAX, Integer.toString(frontConf.getThreadsMax()));
		serverProps.setProperty(DHCPCoreServer.SERVER_THREADS_KEEPALIVE, Integer.toString(frontConf.getThreadsKeepalive()));
		
		// now initializing the server
		internalServer = DHCPCoreServer.initServer(internalServlet, serverProps);
		// intitalization complete
	}
	
	public void init() {
		
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		// TODO ready to run
	}



	/**
	 * Causes a topology reload.
	 * 
	 * <p>This method enforces no reentratn reloads
	 */
	public void triggerReloadTopologyConfig() {
		// TODO
		TopologyConfig newTopologyConfig = configReader.reloadTopologyConfig();
		if (newTopologyConfig != null) {
			topologyConfig.set(newTopologyConfig);
		}
	}
	
	
	/**
	 * @return Returns the frontendConfig.
	 */
	public FrontendConfig getFrontendConfig() {
		return frontendConfig.get();
	}
	/**
	 * @param frontendConfig The frontendConfig to set.
	 */
	protected void setFrontendConfig(FrontendConfig frontendConfig) {
		this.frontendConfig.set(frontendConfig);
	}
	/**
	 * @return Returns the globalConfig.
	 */
	public GlobalConfig getGlobalConfig() {
		return globalConfig.get();
	}
	/**
	 * @param globalConfig The globalConfig to set.
	 */
	protected void setGlobalConfig(GlobalConfig globalConfig) {
		this.globalConfig.set(globalConfig);
	}
	/**
	 * @return Returns the topologyConfig.
	 */
	public TopologyConfig getTopologyConfig() {
		return topologyConfig.get();
	}
	/**
	 * @param topologyConfig The topologyConfig to set.
	 */
	protected void setTopologyConfig(TopologyConfig topologyConfig) {
		this.topologyConfig.set(topologyConfig);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, URISyntaxException, ConfigException, DHCPServerInitException {
		// set all logging levels
    	LogManager.getLogManager().readConfiguration(ClassLoader.getSystemResourceAsStream("logging.properties"));
    	
    	// parse command-line options
    	ClusterOptions bean = new ClusterOptions();
    	CmdLineParser parser = new CmdLineParser(bean);
    	try {
    		parser.parseArgument(args);
    	} catch (CmdLineException e) {
    		System.err.println(e.getMessage());
    		System.err.println("java -jar dhcpcluster.jar [options...] arguments...");
    		parser.printUsage(System.err);
    		return;
    	}
    	
    	// read bootstrap properties
    	FileInputStream bootstrapFile = null;
    	if (bean.bootstrapConfigFile != null) {
    		bootstrapFile = new FileInputStream(bean.bootstrapConfigFile);
    	} else {
    		bootstrapFile = new FileInputStream("./"+CONFIG_DIR+"/"+DHCPD_PROPERTIES);
    	}
    	
    	Properties props = new Properties();
    	props.load(bootstrapFile);

    	DHCPClusterNode cluster = new DHCPClusterNode(props);
    	cluster.run();
    }

	private static final String CONFIG_DIR = "config";
	private static final String DHCPD_PROPERTIES = "DHCPd.properties";
	private static final String CONFIG_READER = "config.reader";
}

class ClusterOptions {
	
	@Option(name="-c", usage="Bootstrap config filename")
	public File bootstrapConfigFile;
}
