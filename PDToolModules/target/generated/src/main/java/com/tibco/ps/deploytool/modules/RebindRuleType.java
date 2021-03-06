//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Rebind Rule Type: The Rebind Rule Type provides a way of identifying the old (source) path and type and the new (target) path and type.
 * 			
 * 
 * <p>Java class for RebindRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebindRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oldType" type="{http://www.tibco.com/ps/deploytool/modules}ResourceTypeSimpleType"/&gt;
 *         &lt;element name="newPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newType" type="{http://www.tibco.com/ps/deploytool/modules}ResourceTypeSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebindRuleType", propOrder = {
    "oldPath",
    "oldType",
    "newPath",
    "newType"
})
public class RebindRuleType {

    @XmlElement(required = true)
    protected String oldPath;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceTypeSimpleType oldType;
    @XmlElement(required = true)
    protected String newPath;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceTypeSimpleType newType;

    /**
     * Gets the value of the oldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPath() {
        return oldPath;
    }

    /**
     * Sets the value of the oldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPath(String value) {
        this.oldPath = value;
    }

    /**
     * Gets the value of the oldType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public ResourceTypeSimpleType getOldType() {
        return oldType;
    }

    /**
     * Sets the value of the oldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public void setOldType(ResourceTypeSimpleType value) {
        this.oldType = value;
    }

    /**
     * Gets the value of the newPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPath() {
        return newPath;
    }

    /**
     * Sets the value of the newPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPath(String value) {
        this.newPath = value;
    }

    /**
     * Gets the value of the newType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public ResourceTypeSimpleType getNewType() {
        return newType;
    }

    /**
     * Sets the value of the newType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public void setNewType(ResourceTypeSimpleType value) {
        this.newType = value;
    }

}
