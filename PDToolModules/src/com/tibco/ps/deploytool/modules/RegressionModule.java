//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 12:55:18 AM EST 
//


package com.tibco.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="regressionTest" type="{http://www.tibco.com/ps/deploytool/modules}RegressionTestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regressionQueries" type="{http://www.tibco.com/ps/deploytool/modules}RegressionQueriesType" minOccurs="0"/>
 *         &lt;element name="regressionSecurity" type="{http://www.tibco.com/ps/deploytool/modules}RegressionSecurityType" minOccurs="0"/>
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
    "regressionTest",
    "regressionQueries",
    "regressionSecurity"
})
@XmlRootElement(name = "RegressionModule")
public class RegressionModule {

    protected List<RegressionTestType> regressionTest;
    protected RegressionQueriesType regressionQueries;
    protected RegressionSecurityType regressionSecurity;

    /**
     * Gets the value of the regressionTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regressionTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegressionTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegressionTestType }
     * 
     * 
     */
    public List<RegressionTestType> getRegressionTest() {
        if (regressionTest == null) {
            regressionTest = new ArrayList<RegressionTestType>();
        }
        return this.regressionTest;
    }

    /**
     * Gets the value of the regressionQueries property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionQueriesType }
     *     
     */
    public RegressionQueriesType getRegressionQueries() {
        return regressionQueries;
    }

    /**
     * Sets the value of the regressionQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionQueriesType }
     *     
     */
    public void setRegressionQueries(RegressionQueriesType value) {
        this.regressionQueries = value;
    }

    /**
     * Gets the value of the regressionSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionSecurityType }
     *     
     */
    public RegressionSecurityType getRegressionSecurity() {
        return regressionSecurity;
    }

    /**
     * Sets the value of the regressionSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionSecurityType }
     *     
     */
    public void setRegressionSecurity(RegressionSecurityType value) {
        this.regressionSecurity = value;
    }

}