//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * &lt;complexType name="RebindResourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceType" type="{http://www.tibco.com/ps/deploytool/modules}ResourceTypeSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="rebindRules" type="{http://www.tibco.com/ps/deploytool/modules}RebindRuleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    @XmlSchemaType(name = "string")
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
