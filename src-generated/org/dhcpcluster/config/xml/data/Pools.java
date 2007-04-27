//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.27 at 10:21:47 AM CEST 
//


package org.dhcpcluster.config.xml.data;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="range">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}empty-type">
 *                 &lt;attribute name="start" use="required" type="{}inet-address" />
 *                 &lt;attribute name="end" use="required" type="{}inet-address" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="static">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}empty-type">
 *                 &lt;attribute name="address" use="required" type="{}inet-address" />
 *                 &lt;attribute name="ethernet" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rangeOrStatic"
})
@XmlRootElement(name = "pools")
public class Pools {

    @XmlElements({
        @XmlElement(name = "static", type = Pools.Static.class),
        @XmlElement(name = "range", type = Pools.Range.class)
    })
    protected List<EmptyType> rangeOrStatic;

    /**
     * Gets the value of the rangeOrStatic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeOrStatic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeOrStatic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pools.Static }
     * {@link Pools.Range }
     * 
     * 
     */
    public List<EmptyType> getRangeOrStatic() {
        if (rangeOrStatic == null) {
            rangeOrStatic = new ArrayList<EmptyType>();
        }
        return this.rangeOrStatic;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}empty-type">
     *       &lt;attribute name="start" use="required" type="{}inet-address" />
     *       &lt;attribute name="end" use="required" type="{}inet-address" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Range
        extends EmptyType
    {

        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected InetAddress start;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected InetAddress end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public InetAddress getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(InetAddress value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public InetAddress getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(InetAddress value) {
            this.end = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}empty-type">
     *       &lt;attribute name="address" use="required" type="{}inet-address" />
     *       &lt;attribute name="ethernet" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Static
        extends EmptyType
    {

        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected InetAddress address;
        @XmlAttribute
        protected String ethernet;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public InetAddress getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(InetAddress value) {
            this.address = value;
        }

        /**
         * Gets the value of the ethernet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEthernet() {
            return ethernet;
        }

        /**
         * Sets the value of the ethernet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEthernet(String value) {
            this.ethernet = value;
        }

    }

}
