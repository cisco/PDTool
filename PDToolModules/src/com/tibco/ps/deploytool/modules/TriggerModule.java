//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 12:55:18 AM EST 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="triggerList" type="{http://www.tibco.com/ps/deploytool/modules}TriggerListType"/>
 *         &lt;element name="scheduleList" type="{http://www.tibco.com/ps/deploytool/modules}TriggerScheduleListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "triggerList",
    "scheduleList"
})
@XmlRootElement(name = "TriggerModule")
public class TriggerModule {

    @XmlElement(required = true)
    protected TriggerListType triggerList;
    @XmlElement(required = true)
    protected TriggerScheduleListType scheduleList;

    /**
     * Gets the value of the triggerList property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerListType }
     *     
     */
    public TriggerListType getTriggerList() {
        return triggerList;
    }

    /**
     * Sets the value of the triggerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerListType }
     *     
     */
    public void setTriggerList(TriggerListType value) {
        this.triggerList = value;
    }

    /**
     * Gets the value of the scheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerScheduleListType }
     *     
     */
    public TriggerScheduleListType getScheduleList() {
        return scheduleList;
    }

    /**
     * Sets the value of the scheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerScheduleListType }
     *     
     */
    public void setScheduleList(TriggerScheduleListType value) {
        this.scheduleList = value;
    }

}