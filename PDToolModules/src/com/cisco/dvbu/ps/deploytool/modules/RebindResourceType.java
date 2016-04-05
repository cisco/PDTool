//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 07:38:40 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Rebind Resource Type: The Rebind Resource Type provides a structure to define which resource to perform a 
 * 				rebind on.  This resource may contain one or more resources that it uses (invokes).  For example a SQL procedure
 * 				may invoke another procedure and two views.  If the underlying resource change folders, then a rebind would need
 * 				to be performed.  The rebind rules type is used to provide an iteration resources to rebind to.  The rules identify
 * 				the the old resource path/type and the new resource path/type.
 * 			
 * 
 * <p>Java class for RebindResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebindResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceType" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceTypeSimpleType" minOccurs="0"/>
 *         &lt;element name="rebindRules" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RebindRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebindResourceType", propOrder = {
    "id",
    "resourcePath",
    "resourceType",
    "rebindRules"
})
public class RebindResourceType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String resourcePath;
    protected ResourceTypeSimpleType resourceType;
    protected List<RebindRuleType> rebindRules;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the resourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the value of the resourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePath(String value) {
        this.resourcePath = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public ResourceTypeSimpleType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public void setResourceType(ResourceTypeSimpleType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the rebindRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebindRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebindRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RebindRuleType }
     * 
     * 
     */
    public List<RebindRuleType> getRebindRules() {
        if (rebindRules == null) {
            rebindRules = new ArrayList<RebindRuleType>();
        }
        return this.rebindRules;
    }

}
