//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.14 at 07:17:38 AM CET 
//


package org.dhcpcluster.config.xml.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for type-option-byte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type-option-byte">
 *   &lt;complexContent>
 *     &lt;extension base="{}option-generic">
 *       &lt;sequence>
 *         &lt;element ref="{}value-byte"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type-option-byte", propOrder = {
    "valueByte"
})
public class TypeOptionByte
    extends OptionGeneric
{

    @XmlElement(name = "value-byte", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Byte valueByte;

    /**
     * Gets the value of the valueByte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Byte getValueByte() {
        return valueByte;
    }

    /**
     * Sets the value of the valueByte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueByte(Byte value) {
        this.valueByte = value;
    }

}
