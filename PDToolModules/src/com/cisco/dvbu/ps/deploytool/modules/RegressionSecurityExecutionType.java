//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 07:38:40 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				These security options provide the user with the ability to refine how the regression security is executed.
 * 			
 * 
 * <p>Java class for RegressionSecurityExecutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityExecutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityPlanIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityOverallRatingException" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="securityExecutionErrorException" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionSecurityExecutionType", propOrder = {
    "securityPlanIds",
    "securityOverallRatingException",
    "securityExecutionErrorException"
})
public class RegressionSecurityExecutionType {

    protected String securityPlanIds;
    protected String securityOverallRatingException;
    protected String securityExecutionErrorException;

    /**
     * Gets the value of the securityPlanIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPlanIds() {
        return securityPlanIds;
    }

    /**
     * Sets the value of the securityPlanIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPlanIds(String value) {
        this.securityPlanIds = value;
    }

    /**
     * Gets the value of the securityOverallRatingException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityOverallRatingException() {
        return securityOverallRatingException;
    }

    /**
     * Sets the value of the securityOverallRatingException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityOverallRatingException(String value) {
        this.securityOverallRatingException = value;
    }

    /**
     * Gets the value of the securityExecutionErrorException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityExecutionErrorException() {
        return securityExecutionErrorException;
    }

    /**
     * Sets the value of the securityExecutionErrorException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityExecutionErrorException(String value) {
        this.securityExecutionErrorException = value;
    }

}
