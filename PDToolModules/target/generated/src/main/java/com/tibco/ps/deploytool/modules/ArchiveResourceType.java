//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Archive Resource Type: 
 * 					1. "export" element is required for export,
 * 					2. "relocate" and "rebind" are optional for backup and restore,
 * 						but must be present if "resources" node is present in Archive definition.
 * 			
 * 
 * <p>Java class for ArchiveResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveResourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relocate" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveRelocateResourcePathType"/&gt;
 *         &lt;element name="rebind" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveRebindResourcePathType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveResourceType", propOrder = {
    "exportOrRelocateOrRebind"
})
public class ArchiveResourceType {

    @XmlElements({
        @XmlElement(name = "export", type = String.class),
        @XmlElement(name = "relocate", type = ArchiveRelocateResourcePathType.class),
        @XmlElement(name = "rebind", type = ArchiveRebindResourcePathType.class)
    })
    protected List<Object> exportOrRelocateOrRebind;

    /**
     * Gets the value of the exportOrRelocateOrRebind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOrRelocateOrRebind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportOrRelocateOrRebind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link ArchiveRelocateResourcePathType }
     * {@link ArchiveRebindResourcePathType }
     * 
     * 
     */
    public List<Object> getExportOrRelocateOrRebind() {
        if (exportOrRelocateOrRebind == null) {
            exportOrRelocateOrRebind = new ArrayList<Object>();
        }
        return this.exportOrRelocateOrRebind;
    }

}