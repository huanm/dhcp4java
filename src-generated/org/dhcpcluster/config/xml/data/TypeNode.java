//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.27 at 10:21:47 AM CEST 
//


package org.dhcpcluster.config.xml.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type-node complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type-node">
 *   &lt;complexContent>
 *     &lt;extension base="{}type-node-subnet">
 *       &lt;all>
 *         &lt;element name="policy" type="{}policyType" minOccurs="0"/>
 *         &lt;element ref="{}sub-nodes" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type-node", propOrder = {
    "policy",
    "subNodes"
})
@XmlSeeAlso({
    Node.class
})
public class TypeNode
    extends TypeNodeSubnet
{

    protected PolicyType policy;
    @XmlElement(name = "sub-nodes")
    protected SubNodes subNodes;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicy(PolicyType value) {
        this.policy = value;
    }

    /**
     * Gets the value of the subNodes property.
     * 
     * @return
     *     possible object is
     *     {@link SubNodes }
     *     
     */
    public SubNodes getSubNodes() {
        return subNodes;
    }

    /**
     * Sets the value of the subNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubNodes }
     *     
     */
    public void setSubNodes(SubNodes value) {
        this.subNodes = value;
    }

}
