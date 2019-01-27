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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Marks a resource dependency for rebinding on import. When a rebindable resource is imported 
 * 				a reminder and the [Description] are displayed on the command line. The -rebind option must 
 * 				be specified on import for that action to take place on import. That message is also displayed 
 * 				in Studio to prompt designation of a new resource (path) as the resource dependency.  Rebinding 
 * 				must be done after the import unless this option specifies the new resource for rebinding during import.
 * 			
 * 
 * <p>Java class for ArchiveRebindablePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveRebindablePathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rebindablePaths" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="descripiton" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "ArchiveRebindablePathType", propOrder = {
    "rebindablePaths"
})
public class ArchiveRebindablePathType {

    @XmlElement(required = true)
    protected List<ArchiveRebindablePathType.RebindablePaths> rebindablePaths;

    /**
     * Gets the value of the rebindablePaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebindablePaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebindablePaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiveRebindablePathType.RebindablePaths }
     * 
     * 
     */
    public List<ArchiveRebindablePathType.RebindablePaths> getRebindablePaths() {
        if (rebindablePaths == null) {
            rebindablePaths = new ArrayList<ArchiveRebindablePathType.RebindablePaths>();
        }
        return this.rebindablePaths;
    }


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
     *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="descripiton" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "path",
        "descripiton"
    })
    public static class RebindablePaths {

        @XmlElement(required = true)
        protected String path;
        @XmlElement(required = true)
        protected String descripiton;

        /**
         * Gets the value of the path property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * Sets the value of the path property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
        }

        /**
         * Gets the value of the descripiton property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripiton() {
            return descripiton;
        }

        /**
         * Sets the value of the descripiton property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripiton(String value) {
            this.descripiton = value;
        }

    }

}