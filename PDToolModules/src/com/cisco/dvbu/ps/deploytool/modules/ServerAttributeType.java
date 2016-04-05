//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 07:38:40 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Server Attribute Type: Documentation goes here.
 * 			
 * 
 * <p>Java class for ServerAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}AttributeTypeSimpleType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueArray" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ServerAttributeValueArray" minOccurs="0"/>
 *         &lt;element name="valueList" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ServerAttributeValueList" minOccurs="0"/>
 *         &lt;element name="valueMap" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ServerAttributeValueMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerAttributeType", propOrder = {
    "id",
    "name",
    "type",
    "value",
    "valueArray",
    "valueList",
    "valueMap"
})
public class ServerAttributeType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected AttributeTypeSimpleType type;
    protected String value;
    protected ServerAttributeValueArray valueArray;
    protected ServerAttributeValueList valueList;
    protected ServerAttributeValueMap valueMap;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeSimpleType }
     *     
     */
    public AttributeTypeSimpleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeSimpleType }
     *     
     */
    public void setType(AttributeTypeSimpleType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueArray property.
     * 
     * @return
     *     possible object is
     *     {@link ServerAttributeValueArray }
     *     
     */
    public ServerAttributeValueArray getValueArray() {
        return valueArray;
    }

    /**
     * Sets the value of the valueArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerAttributeValueArray }
     *     
     */
    public void setValueArray(ServerAttributeValueArray value) {
        this.valueArray = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link ServerAttributeValueList }
     *     
     */
    public ServerAttributeValueList getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerAttributeValueList }
     *     
     */
    public void setValueList(ServerAttributeValueList value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the valueMap property.
     * 
     * @return
     *     possible object is
     *     {@link ServerAttributeValueMap }
     *     
     */
    public ServerAttributeValueMap getValueMap() {
        return valueMap;
    }

    /**
     * Sets the value of the valueMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerAttributeValueMap }
     *     
     */
    public void setValueMap(ServerAttributeValueMap value) {
        this.valueMap = value;
    }

}
