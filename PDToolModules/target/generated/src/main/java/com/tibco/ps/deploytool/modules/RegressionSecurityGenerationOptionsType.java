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
 * &lt;complexType name="RegressionSecurityGenerationOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pathToTargetRegressionXML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="encryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domainFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NOEXEC"/&gt;
 *               &lt;enumeration value="OVERWRITE"/&gt;
 *               &lt;enumeration value="APPEND"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="queryMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NOEXEC"/&gt;
 *               &lt;enumeration value="OVERWRITE"/&gt;
 *               &lt;enumeration value="APPEND"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NOEXEC"/&gt;
 *               &lt;enumeration value="OVERWRITE"/&gt;
 *               &lt;enumeration value="APPEND"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planModeType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SINGLEPLAN"/&gt;
 *               &lt;enumeration value="MULTIPLAN"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planIdPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planGenerateExpectedOutcome"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flattenSecurityUsersXML"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flattenSecurityQueryQueriesXML"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flattenSecurityQueryProceduresXML"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flattenSecurityQueryWebServicesXML"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flattenSecurityPlansXML"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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