//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.12.29 at 07:37:11 AM CET 
//


package org.dhcpcluster.config.xml.data;

import java.net.InetAddress;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dhcpcluster.config.xml.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Giaddr_QNAME = new QName("", "giaddr");
    private final static QName _ValueRaw64_QNAME = new QName("", "value-raw64");
    private final static QName _ValueRawhex_QNAME = new QName("", "value-rawhex");
    private final static QName _ValueInt_QNAME = new QName("", "value-int");
    private final static QName _ValueByte_QNAME = new QName("", "value-byte");
    private final static QName _Mirror_QNAME = new QName("", "mirror");
    private final static QName _ValueInet_QNAME = new QName("", "value-inet");
    private final static QName _ValueShort_QNAME = new QName("", "value-short");
    private final static QName _OptionsOptionTimeServers_QNAME = new QName("", "option-time-servers");
    private final static QName _OptionsOptionHostName_QNAME = new QName("", "option-host-name");
    private final static QName _OptionsOptionRouters_QNAME = new QName("", "option-routers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dhcpcluster.config.xml.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DhcpServer.Topology.Subnet.Range }
     * 
     */
    public DhcpServer.Topology.Subnet.Range createDhcpServerTopologySubnetRange() {
        return new DhcpServer.Topology.Subnet.Range();
    }

    /**
     * Create an instance of {@link OptionGeneric }
     * 
     */
    public OptionGeneric createOptionGeneric() {
        return new OptionGeneric();
    }

    /**
     * Create an instance of {@link DhcpServer }
     * 
     */
    public DhcpServer createDhcpServer() {
        return new DhcpServer();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd.Threads }
     * 
     */
    public DhcpServer.FrontEnd.Threads createDhcpServerFrontEndThreads() {
        return new DhcpServer.FrontEnd.Threads();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link org.dhcpcluster.config.xml.data.Subnet }
     * 
     */
    public org.dhcpcluster.config.xml.data.Subnet createSubnet() {
        return new org.dhcpcluster.config.xml.data.Subnet();
    }

    /**
     * Create an instance of {@link Filter.FilterAlwaysFalse }
     * 
     */
    public Filter.FilterAlwaysFalse createFilterFilterAlwaysFalse() {
        return new Filter.FilterAlwaysFalse();
    }

    /**
     * Create an instance of {@link TypeFilterRoot }
     * 
     */
    public TypeFilterRoot createTypeFilterRoot() {
        return new TypeFilterRoot();
    }

    /**
     * Create an instance of {@link DhcpServer.Topology }
     * 
     */
    public DhcpServer.Topology createDhcpServerTopology() {
        return new DhcpServer.Topology();
    }

    /**
     * Create an instance of {@link TypeOptionInet }
     * 
     */
    public TypeOptionInet createTypeOptionInet() {
        return new TypeOptionInet();
    }

    /**
     * Create an instance of {@link DhcpServer.Topology.Subnet }
     * 
     */
    public DhcpServer.Topology.Subnet createDhcpServerTopologySubnet() {
        return new DhcpServer.Topology.Subnet();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd.Listen }
     * 
     */
    public DhcpServer.FrontEnd.Listen createDhcpServerFrontEndListen() {
        return new DhcpServer.FrontEnd.Listen();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Server }
     * 
     */
    public DhcpServer.Global.Server createDhcpServerGlobalServer() {
        return new DhcpServer.Global.Server();
    }

    /**
     * Create an instance of {@link Static }
     * 
     */
    public Static createStatic() {
        return new Static();
    }

    /**
     * Create an instance of {@link TypeOptionInets }
     * 
     */
    public TypeOptionInets createTypeOptionInets() {
        return new TypeOptionInets();
    }

    /**
     * Create an instance of {@link Filter.FilterNumOption }
     * 
     */
    public Filter.FilterNumOption createFilterFilterNumOption() {
        return new Filter.FilterNumOption();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link Filter.FilterAlwaysTrue }
     * 
     */
    public Filter.FilterAlwaysTrue createFilterFilterAlwaysTrue() {
        return new Filter.FilterAlwaysTrue();
    }

    /**
     * Create an instance of {@link Filter.FilterStringOption }
     * 
     */
    public Filter.FilterStringOption createFilterFilterStringOption() {
        return new Filter.FilterStringOption();
    }

    /**
     * Create an instance of {@link DhcpServer.Global }
     * 
     */
    public DhcpServer.Global createDhcpServerGlobal() {
        return new DhcpServer.Global();
    }

    /**
     * Create an instance of {@link Filter.FilterNot }
     * 
     */
    public Filter.FilterNot createFilterFilterNot() {
        return new Filter.FilterNot();
    }

    /**
     * Create an instance of {@link Filter.FilterOr }
     * 
     */
    public Filter.FilterOr createFilterFilterOr() {
        return new Filter.FilterOr();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Classes }
     * 
     */
    public DhcpServer.Global.Classes createDhcpServerGlobalClasses() {
        return new DhcpServer.Global.Classes();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Classes.Class }
     * 
     */
    public DhcpServer.Global.Classes.Class createDhcpServerGlobalClassesClass() {
        return new DhcpServer.Global.Classes.Class();
    }

    /**
     * Create an instance of {@link Filter.FilterAnd }
     * 
     */
    public Filter.FilterAnd createFilterFilterAnd() {
        return new Filter.FilterAnd();
    }

    /**
     * Create an instance of {@link TypeNodeSubnet }
     * 
     */
    public TypeNodeSubnet createTypeNodeSubnet() {
        return new TypeNodeSubnet();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd }
     * 
     */
    public DhcpServer.FrontEnd createDhcpServerFrontEnd() {
        return new DhcpServer.FrontEnd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "giaddr")
    public JAXBElement<String> createGiaddr(String value) {
        return new JAXBElement<String>(_Giaddr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-raw64")
    public JAXBElement<byte[]> createValueRaw64(byte[] value) {
        return new JAXBElement<byte[]>(_ValueRaw64_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-rawhex")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createValueRawhex(byte[] value) {
        return new JAXBElement<byte[]>(_ValueRawhex_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-int")
    public JAXBElement<Integer> createValueInt(Integer value) {
        return new JAXBElement<Integer>(_ValueInt_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-byte")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Byte> createValueByte(Byte value) {
        return new JAXBElement<Byte>(_ValueByte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mirror")
    public JAXBElement<EmptyType> createMirror(EmptyType value) {
        return new JAXBElement<EmptyType>(_Mirror_QNAME, EmptyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InetAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-inet")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<InetAddress> createValueInet(InetAddress value) {
        return new JAXBElement<InetAddress>(_ValueInet_QNAME, InetAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-short")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Short> createValueShort(Short value) {
        return new JAXBElement<Short>(_ValueShort_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-time-servers", scope = Options.class)
    public JAXBElement<TypeOptionInets> createOptionsOptionTimeServers(TypeOptionInets value) {
        return new JAXBElement<TypeOptionInets>(_OptionsOptionTimeServers_QNAME, TypeOptionInets.class, Options.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-host-name", scope = Options.class)
    public JAXBElement<TypeOptionInet> createOptionsOptionHostName(TypeOptionInet value) {
        return new JAXBElement<TypeOptionInet>(_OptionsOptionHostName_QNAME, TypeOptionInet.class, Options.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-routers", scope = Options.class)
    public JAXBElement<TypeOptionInets> createOptionsOptionRouters(TypeOptionInets value) {
        return new JAXBElement<TypeOptionInets>(_OptionsOptionRouters_QNAME, TypeOptionInets.class, Options.class, value);
    }

}