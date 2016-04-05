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
 * 				Regression Queries Type: A list of regression queries.
 * 			
 * 
 * <p>Java class for RegressionQueriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionQueriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regressionQuery" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionQueryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionQueriesType", propOrder = {
    "regressionQuery"
})
public class RegressionQueriesType {

    @XmlElement(required = true)
    protected List<RegressionQueryType> regressionQuery;

    /**
     * Gets the value of the regressionQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regressionQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegressionQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegressionQueryType }
     * 
     * 
     */
    public List<RegressionQueryType> getRegressionQuery() {
        if (regressionQuery == null) {
            regressionQuery = new ArrayList<RegressionQueryType>();
        }
        return this.regressionQuery;
    }

}
