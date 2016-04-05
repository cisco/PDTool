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
 * 			Introspect Data Source Type: Provides a way to introspect a data source. 
 * 			Introspection is the process of analyzing resources in a data source and creating resources withing the CIS that represent them.
 * 		
 * 
 * <p>Java class for IntrospectDataSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrospectDataSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runInBackgroundTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reportDetail">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SUMMARY"/>
 *               &lt;enumeration value="SIMPLE"/>
 *               &lt;enumeration value="SIMPLE_COMPRESSED"/>
 *               &lt;enumeration value="FULL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="plan" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}IntrospectDataSourcePlanType"/>
 *         &lt;element name="genericAttribute" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}AttributeDefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrospectDataSourceType", propOrder = {
    "id",
    "resourcePath",
    "runInBackgroundTransaction",
    "reportDetail",
    "plan",
    "genericAttribute"
})
public class IntrospectDataSourceType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String resourcePath;
    @XmlElement(defaultValue = "false")
    protected Boolean runInBackgroundTransaction;
    @XmlElement(required = true)
    protected String reportDetail;
    @XmlElement(required = true)
    protected IntrospectDataSourcePlanType plan;
    protected List<AttributeDefType> genericAttribute;

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
     * Gets the value of the runInBackgroundTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunInBackgroundTransaction() {
        return runInBackgroundTransaction;
    }

    /**
     * Sets the value of the runInBackgroundTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunInBackgroundTransaction(Boolean value) {
        this.runInBackgroundTransaction = value;
    }

    /**
     * Gets the value of the reportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDetail() {
        return reportDetail;
    }

    /**
     * Sets the value of the reportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDetail(String value) {
        this.reportDetail = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link IntrospectDataSourcePlanType }
     *     
     */
    public IntrospectDataSourcePlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntrospectDataSourcePlanType }
     *     
     */
    public void setPlan(IntrospectDataSourcePlanType value) {
        this.plan = value;
    }

    /**
     * Gets the value of the genericAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDefType }
     * 
     * 
     */
    public List<AttributeDefType> getGenericAttribute() {
        if (genericAttribute == null) {
            genericAttribute = new ArrayList<AttributeDefType>();
        }
        return this.genericAttribute;
    }

}
