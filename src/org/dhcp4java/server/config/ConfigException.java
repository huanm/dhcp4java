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
package org.dhcp4java.server.config;

/**
 * Thrown to indicate there was a problem starting the DHCP Server.
 * 
 * @author Stephan Hadinger
 * @version 0.60
 */
public class ConfigException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 *
	 */
	public ConfigException() {
		super();
	}
	
    /**
     * @param message
     */
    public ConfigException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ConfigException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}