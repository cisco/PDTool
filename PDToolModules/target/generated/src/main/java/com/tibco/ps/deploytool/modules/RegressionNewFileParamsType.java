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
 * 				Parameter settings for generating a new regression test file.
 * 			
 * 
 * <p>Java class for RegressionNewFileParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionNewFileParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createQueries"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="createProcedures"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="createWS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="createSoapType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="all"/&gt;
 *               &lt;enumeration value="soap11"/&gt;
 *               &lt;enumeration value="soap12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="useDefaultViewQuery"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="useDefaultProcQuery"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="useDefaultWSQuery"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publishedViewQry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="publishedProcQry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useAllDatasources"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="yes"/&gt;
 *               &lt;enumeration value="no"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datasources" type="{http://www.tibco.com/ps/deploytool/modules}RegressionDatasourcesType" minOccurs="0"/&gt;
 *         &lt;element name="resources" type="{http://www.tibco.com/ps/deploytool/modules}RegressionResourcesType" minOccurs="0"/&gt;
 *         &lt;element name="securityGenerationOptions" type="{http://www.tibco.com/ps/deploytool/modules}RegressionSecurityGenerationOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="defaultProcParamValues" type="{http://www.tibco.com/ps/deploytool/modules}RegressionDefaultProcParamsValType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionNewFileParamsType", propOrder = {
    "createQueries",
    "createProcedures",
    "createWS",
    "createSoapType",
    "useDefaultViewQuery",
    "useDefaultProcQuery",
    "useDefaultWSQuery",
    "publishedViewQry",
    "publishedProcQry",
    "useAllDatasources",
    "datasources",
    "resources",
    "securityGenerationOptions",
    "defaultProcParamValues"
})
public class RegressionNewFileParamsType {

    @XmlElement(required = true)
    protected String createQueries;
    @XmlElement(required = true)
    protected String createProcedures;
    @XmlElement(required = true)
    protected String createWS;
    @XmlElement(required = true)
    protected String createSoapType;
    @XmlElement(required = true)
    protected String useDefaultViewQuery;
    @XmlElement(required = true)
    protected String useDefaultProcQuery;
    @XmlElement(required = true)
    protected String useDefaultWSQuery;
    @XmlElement(required = true)
    protected String publishedViewQry;
    @XmlElement(required = true)
    protected String publishedProcQry;
    @XmlElement(required = true)
    protected String useAllDatasources;
    protected RegressionDatasourcesType datasources;
    protected RegressionResourcesType resources;
    protected RegressionSecurityGenerationOptionsType securityGenerationOptions;
    protected RegressionDefaultProcParamsValType defaultProcParamValues;

    /**
     * Gets the value of the createQueries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateQueries() {
        return createQueries;
    }

    /**
     * Sets the value of the createQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateQueries(String value) {
        this.createQueries = value;
    }

    /**
     * Gets the value of the createProcedures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateProcedures() {
        return createProcedures;
    }

    /**
     * Sets the value of the createProcedures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateProcedures(String value) {
        this.createProcedures = value;
    }

    /**
     * Gets the value of the createWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateWS() {
        return createWS;
    }

    /**
     * Sets the value of the createWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateWS(String value) {
        this.createWS = value;
    }

    /**
     * Gets the value of the createSoapType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateSoapType() {
        return createSoapType;
    }

    /**
     * Sets the value of the createSoapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateSoapType(String value) {
        this.createSoapType = value;
    }

    /**
     * Gets the value of the useDefaultViewQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDefaultViewQuery() {
        return useDefaultViewQuery;
    }

    /**
     * Sets the value of the useDefaultViewQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDefaultViewQuery(String value) {
        this.useDefaultViewQuery = value;
    }

    /**
     * Gets the value of the useDefaultProcQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDefaultProcQuery() {
        return useDefaultProcQuery;
    }

    /**
     * Sets the value of the useDefaultProcQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDefaultProcQuery(String value) {
        this.useDefaultProcQuery = value;
    }

    /**
     * Gets the value of the useDefaultWSQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDefaultWSQuery() {
        return useDefaultWSQuery;
    }

    /**
     * Sets the value of the useDefaultWSQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDefaultWSQuery(String value) {
        this.useDefaultWSQuery = value;
    }

    /**
     * Gets the value of the publishedViewQry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedViewQry() {
        return publishedViewQry;
    }

    /**
     * Sets the value of the publishedViewQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedViewQry(String value) {
        this.publishedViewQry = value;
    }

    /**
     * Gets the value of the publishedProcQry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedProcQry() {
        return publishedProcQry;
    }

    /**
     * Sets the value of the publishedProcQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedProcQry(String value) {
        this.publishedProcQry = value;
    }

    /**
     * Gets the value of the useAllDatasources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAllDatasources() {
        return useAllDatasources;
    }

    /**
     * Sets the value of the useAllDatasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAllDatasources(String value) {
        this.useAllDatasources = value;
    }

    /**
     * Gets the value of the datasources property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionDatasourcesType }
     *     
     */
    public RegressionDatasourcesType getDatasources() {
        return datasources;
    }

    /**
     * Sets the value of the datasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionDatasourcesType }
     *     
     */
    public void setDatasources(RegressionDatasourcesType value) {
        this.datasources = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionResourcesType }
     *     
     */
    public RegressionResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionResourcesType }
     *     
     */
    public void setResources(RegressionResourcesType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the securityGenerationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionSecurityGenerationOptionsType }
     *     
     */
    public RegressionSecurityGenerationOptionsType getSecurityGenerationOptions() {
        return securityGenerationOptions;
    }

    /**
     * Sets the value of the securityGenerationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionSecurityGenerationOptionsType }
     *     
     */
    public void setSecurityGenerationOptions(RegressionSecurityGenerationOptionsType value) {
        this.securityGenerationOptions = value;
    }

    /**
     * Gets the value of the defaultProcParamValues property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionDefaultProcParamsValType }
     *     
     */
    public RegressionDefaultProcParamsValType getDefaultProcParamValues() {
        return defaultProcParamValues;
    }

    /**
     * Sets the value of the defaultProcParamValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionDefaultProcParamsValType }
     *     
     */
    public void setDefaultProcParamValues(RegressionDefaultProcParamsValType value) {
        this.defaultProcParamValues = value;
    }

}
