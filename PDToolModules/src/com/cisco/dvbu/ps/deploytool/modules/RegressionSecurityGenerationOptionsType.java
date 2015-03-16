//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.11 at 11:22:31 AM PDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				These security options provide the user with the ability to refine how the regression security XML section of the
 * 				RegressionModule.xml is generated.
 * 			
 * 
 * <p>Java class for RegressionSecurityGenerationOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityGenerationOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pathToTargetRegressionXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NOEXEC"/>
 *               &lt;enumeration value="OVERWRITE"/>
 *               &lt;enumeration value="APPEND"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="queryMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NOEXEC"/>
 *               &lt;enumeration value="OVERWRITE"/>
 *               &lt;enumeration value="APPEND"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NOEXEC"/>
 *               &lt;enumeration value="OVERWRITE"/>
 *               &lt;enumeration value="APPEND"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planModeType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SINGLEPLAN"/>
 *               &lt;enumeration value="MULTIPLAN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planGenerateExpectedOutcome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flattenSecurityUsersXML">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flattenSecurityQueryQueriesXML">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flattenSecurityQueryProceduresXML">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flattenSecurityQueryWebServicesXML">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flattenSecurityPlansXML">
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
@XmlType(name = "RegressionSecurityGenerationOptionsType", propOrder = {
    "pathToTargetRegressionXML",
    "encryptedPassword",
    "userFilter",
    "domainFilter",
    "userMode",
    "queryMode",
    "planMode",
    "planModeType",
    "planIdPrefix",
    "planGenerateExpectedOutcome",
    "flattenSecurityUsersXML",
    "flattenSecurityQueryQueriesXML",
    "flattenSecurityQueryProceduresXML",
    "flattenSecurityQueryWebServicesXML",
    "flattenSecurityPlansXML"
})
public class RegressionSecurityGenerationOptionsType {

    @XmlElement(required = true)
    protected String pathToTargetRegressionXML;
    protected String encryptedPassword;
    protected String userFilter;
    protected String domainFilter;
    @XmlElement(required = true)
    protected String userMode;
    @XmlElement(required = true)
    protected String queryMode;
    @XmlElement(required = true)
    protected String planMode;
    @XmlElement(required = true)
    protected String planModeType;
    protected String planIdPrefix;
    @XmlElement(required = true)
    protected String planGenerateExpectedOutcome;
    @XmlElement(required = true)
    protected String flattenSecurityUsersXML;
    @XmlElement(required = true)
    protected String flattenSecurityQueryQueriesXML;
    @XmlElement(required = true)
    protected String flattenSecurityQueryProceduresXML;
    @XmlElement(required = true)
    protected String flattenSecurityQueryWebServicesXML;
    @XmlElement(required = true)
    protected String flattenSecurityPlansXML;

    /**
     * Gets the value of the pathToTargetRegressionXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathToTargetRegressionXML() {
        return pathToTargetRegressionXML;
    }

    /**
     * Sets the value of the pathToTargetRegressionXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathToTargetRegressionXML(String value) {
        this.pathToTargetRegressionXML = value;
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
     * Gets the value of the userFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFilter() {
        return userFilter;
    }

    /**
     * Sets the value of the userFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFilter(String value) {
        this.userFilter = value;
    }

    /**
     * Gets the value of the domainFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainFilter() {
        return domainFilter;
    }

    /**
     * Sets the value of the domainFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainFilter(String value) {
        this.domainFilter = value;
    }

    /**
     * Gets the value of the userMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMode() {
        return userMode;
    }

    /**
     * Sets the value of the userMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMode(String value) {
        this.userMode = value;
    }

    /**
     * Gets the value of the queryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * Sets the value of the queryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMode(String value) {
        this.queryMode = value;
    }

    /**
     * Gets the value of the planMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanMode() {
        return planMode;
    }

    /**
     * Sets the value of the planMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanMode(String value) {
        this.planMode = value;
    }

    /**
     * Gets the value of the planModeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanModeType() {
        return planModeType;
    }

    /**
     * Sets the value of the planModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanModeType(String value) {
        this.planModeType = value;
    }

    /**
     * Gets the value of the planIdPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanIdPrefix() {
        return planIdPrefix;
    }

    /**
     * Sets the value of the planIdPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanIdPrefix(String value) {
        this.planIdPrefix = value;
    }

    /**
     * Gets the value of the planGenerateExpectedOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGenerateExpectedOutcome() {
        return planGenerateExpectedOutcome;
    }

    /**
     * Sets the value of the planGenerateExpectedOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanGenerateExpectedOutcome(String value) {
        this.planGenerateExpectedOutcome = value;
    }

    /**
     * Gets the value of the flattenSecurityUsersXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlattenSecurityUsersXML() {
        return flattenSecurityUsersXML;
    }

    /**
     * Sets the value of the flattenSecurityUsersXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlattenSecurityUsersXML(String value) {
        this.flattenSecurityUsersXML = value;
    }

    /**
     * Gets the value of the flattenSecurityQueryQueriesXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlattenSecurityQueryQueriesXML() {
        return flattenSecurityQueryQueriesXML;
    }

    /**
     * Sets the value of the flattenSecurityQueryQueriesXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlattenSecurityQueryQueriesXML(String value) {
        this.flattenSecurityQueryQueriesXML = value;
    }

    /**
     * Gets the value of the flattenSecurityQueryProceduresXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlattenSecurityQueryProceduresXML() {
        return flattenSecurityQueryProceduresXML;
    }

    /**
     * Sets the value of the flattenSecurityQueryProceduresXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlattenSecurityQueryProceduresXML(String value) {
        this.flattenSecurityQueryProceduresXML = value;
    }

    /**
     * Gets the value of the flattenSecurityQueryWebServicesXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlattenSecurityQueryWebServicesXML() {
        return flattenSecurityQueryWebServicesXML;
    }

    /**
     * Sets the value of the flattenSecurityQueryWebServicesXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlattenSecurityQueryWebServicesXML(String value) {
        this.flattenSecurityQueryWebServicesXML = value;
    }

    /**
     * Gets the value of the flattenSecurityPlansXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlattenSecurityPlansXML() {
        return flattenSecurityPlansXML;
    }

    /**
     * Sets the value of the flattenSecurityPlansXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlattenSecurityPlansXML(String value) {
        this.flattenSecurityPlansXML = value;
    }

}