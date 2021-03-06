//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.13 at 12:40:03 PM EDT 
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
 * &lt;p&gt;Java class for ArchiveResourceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArchiveResourceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="relocate" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveRelocateResourcePathType"/&amp;gt;
 *         &amp;lt;element name="rebind" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveRebindResourcePathType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the exportOrRelocateOrRebind property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExportOrRelocateOrRebind().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
