//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Introspect Data Source Plan Entry Type: Provides an iteration of detailed entries for introspection.
 * 		
 * 
 * <p>Java class for IntrospectDataSourcePlanEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrospectDataSourcePlanEntriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="planEntry" type="{http://www.tibco.com/ps/deploytool/modules}IntrospectDataSourcePlanEntryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrospectDataSourcePlanEntriesType", propOrder = {
    "planEntry"
})
public class IntrospectDataSourcePlanEntriesType {

    protected IntrospectDataSourcePlanEntryType planEntry;

    /**
     * Gets the value of the planEntry property.
     * 
     * @return
     *     possible object is
     *     {@link IntrospectDataSourcePlanEntryType }
     *     
     */
    public IntrospectDataSourcePlanEntryType getPlanEntry() {
        return planEntry;
    }

    /**
     * Sets the value of the planEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntrospectDataSourcePlanEntryType }
     *     
     */
    public void setPlanEntry(IntrospectDataSourcePlanEntryType value) {
        this.planEntry = value;
    }

}
