//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.27 at 10:21:47 AM CEST 
//


package org.dhcpcluster.config.xml.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for type-option-shorts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type-option-shorts">
 *   &lt;complexContent>
 *     &lt;extension base="{}option-generic">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}value-short"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type-option-shorts", propOrder = {
    "valueShort"
})
public class TypeOptionShorts
    extends OptionGeneric
{

    @XmlElement(name = "value-short", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected List<Short> valueShort;

    /**
     * Gets the value of the valueShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Short> getValueShort() {
        if (valueShort == null) {
            valueShort = new ArrayList<Short>();
        }
        return this.valueShort;
    }

}
