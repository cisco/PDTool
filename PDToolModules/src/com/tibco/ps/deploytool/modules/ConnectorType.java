//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 12:55:18 AM EST 
//


package com.tibco.ps.deploytool.modules;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Connector Type: Documentation goes here.
 * 			
 * 
 * <p>Java class for ConnectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectorType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="JMS"/>
 *               &lt;enumeration value="HTTP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectorAnnotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useJNDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="jndiContextFactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jndiProviderUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jndiUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jndiPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jmsClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minPool" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxPool" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="poolTimeout" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="jndiProperties" type="{http://www.tibco.com/ps/deploytool/modules}AttributeDefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorType", propOrder = {
    "id",
    "connectorName",
    "connectorType",
    "groupName",
    "connectorAnnotation",
    "useJNDI",
    "jndiContextFactory",
    "jndiProviderUrl",
    "jndiUser",
    "jndiPassword",
    "encryptedPassword",
    "jmsClientID",
    "minPool",
    "maxPool",
    "poolTimeout",
    "jndiProperties"
})
public class ConnectorType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String connectorName;
    @XmlElement(required = true)
    protected String connectorType;
    protected String groupName;
    protected String connectorAnnotation;
    protected Boolean useJNDI;
    protected String jndiContextFactory;
    protected String jndiProviderUrl;
    protected String jndiUser;
    protected String jndiPassword;
    protected String encryptedPassword;
    protected String jmsClientID;
    protected BigInteger minPool;
    protected BigInteger maxPool;
    protected BigInteger poolTimeout;
    protected List<AttributeDefType> jndiProperties;

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
     * Gets the value of the connectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorName() {
        return connectorName;
    }

    /**
     * Sets the value of the connectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorName(String value) {
        this.connectorName = value;
    }

    /**
     * Gets the value of the connectorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorType() {
        return connectorType;
    }

    /**
     * Sets the value of the connectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorType(String value) {
        this.connectorType = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the connectorAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorAnnotation() {
        return connectorAnnotation;
    }

    /**
     * Sets the value of the connectorAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorAnnotation(String value) {
        this.connectorAnnotation = value;
    }

    /**
     * Gets the value of the useJNDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseJNDI() {
        return useJNDI;
    }

    /**
     * Sets the value of the useJNDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseJNDI(Boolean value) {
        this.useJNDI = value;
    }

    /**
     * Gets the value of the jndiContextFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiContextFactory() {
        return jndiContextFactory;
    }

    /**
     * Sets the value of the jndiContextFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiContextFactory(String value) {
        this.jndiContextFactory = value;
    }

    /**
     * Gets the value of the jndiProviderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiProviderUrl() {
        return jndiProviderUrl;
    }

    /**
     * Sets the value of the jndiProviderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiProviderUrl(String value) {
        this.jndiProviderUrl = value;
    }

    /**
     * Gets the value of the jndiUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiUser() {
        return jndiUser;
    }

    /**
     * Sets the value of the jndiUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiUser(String value) {
        this.jndiUser = value;
    }

    /**
     * Gets the value of the jndiPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiPassword() {
        return jndiPassword;
    }

    /**
     * Sets the value of the jndiPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiPassword(String value) {
        this.jndiPassword = value;
    }

    /**
     * Gets the value of the encryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * Sets the value of the encryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPassword(String value) {
        this.encryptedPassword = value;
    }

    /**
     * Gets the value of the jmsClientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsClientID() {
        return jmsClientID;
    }

    /**
     * Sets the value of the jmsClientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsClientID(String value) {
        this.jmsClientID = value;
    }

    /**
     * Gets the value of the minPool property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinPool() {
        return minPool;
    }

    /**
     * Sets the value of the minPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinPool(BigInteger value) {
        this.minPool = value;
    }

    /**
     * Gets the value of the maxPool property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPool() {
        return maxPool;
    }

    /**
     * Sets the value of the maxPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPool(BigInteger value) {
        this.maxPool = value;
    }

    /**
     * Gets the value of the poolTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoolTimeout() {
        return poolTimeout;
    }

    /**
     * Sets the value of the poolTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoolTimeout(BigInteger value) {
        this.poolTimeout = value;
    }

    /**
     * Gets the value of the jndiProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jndiProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJndiProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDefType }
     * 
     * 
     */
    public List<AttributeDefType> getJndiProperties() {
        if (jndiProperties == null) {
            jndiProperties = new ArrayList<AttributeDefType>();
        }
        return this.jndiProperties;
    }

}