//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 07:38:40 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Schedule Type: Documentation goes here.
 * 			
 * 
 * <p>Java class for TriggerScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerModeValidationList" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerPeriodValidationList" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fromTimeInADay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="endTimeInADay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="recurringDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isCluster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerScheduleType", propOrder = {
    "scheduleId",
    "mode",
    "startTime",
    "period",
    "count",
    "fromTimeInADay",
    "endTimeInADay",
    "recurringDay",
    "isCluster"
})
public class TriggerScheduleType {

    @XmlElement(required = true)
    protected String scheduleId;
    protected TriggerModeValidationList mode;
    protected XMLGregorianCalendar startTime;
    protected TriggerPeriodValidationList period;
    protected BigInteger count;
    protected BigInteger fromTimeInADay;
    protected BigInteger endTimeInADay;
    protected BigInteger recurringDay;
    protected Boolean isCluster;

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerModeValidationList }
     *     
     */
    public TriggerModeValidationList getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerModeValidationList }
     *     
     */
    public void setMode(TriggerModeValidationList value) {
        this.mode = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerPeriodValidationList }
     *     
     */
    public TriggerPeriodValidationList getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerPeriodValidationList }
     *     
     */
    public void setPeriod(TriggerPeriodValidationList value) {
        this.period = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the fromTimeInADay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromTimeInADay() {
        return fromTimeInADay;
    }

    /**
     * Sets the value of the fromTimeInADay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromTimeInADay(BigInteger value) {
        this.fromTimeInADay = value;
    }

    /**
     * Gets the value of the endTimeInADay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndTimeInADay() {
        return endTimeInADay;
    }

    /**
     * Sets the value of the endTimeInADay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndTimeInADay(BigInteger value) {
        this.endTimeInADay = value;
    }

    /**
     * Gets the value of the recurringDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecurringDay() {
        return recurringDay;
    }

    /**
     * Sets the value of the recurringDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecurringDay(BigInteger value) {
        this.recurringDay = value;
    }

    /**
     * Gets the value of the isCluster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCluster() {
        return isCluster;
    }

    /**
     * Sets the value of the isCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCluster(Boolean value) {
        this.isCluster = value;
    }

}
