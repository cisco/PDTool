//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessRightsValidationList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessRightsValidationList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ACCESS_TOOLS"/&gt;
 *     &lt;enumeration value="MODIFY_ALL_CONFIG"/&gt;
 *     &lt;enumeration value="MODIFY_ALL_RESOURCES"/&gt;
 *     &lt;enumeration value="MODIFY_ALL_STATUS"/&gt;
 *     &lt;enumeration value="MODIFY_ALL_USERS"/&gt;
 *     &lt;enumeration value="READ_ALL_CONFIG"/&gt;
 *     &lt;enumeration value="READ_ALL_RESOURCES"/&gt;
 *     &lt;enumeration value="READ_ALL_STATUS"/&gt;
 *     &lt;enumeration value="READ_ALL_USERS"/&gt;
 *     &lt;enumeration value="UNLOCK_RESOURCE"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessRightsValidationList")
@XmlEnum
public enum AccessRightsValidationList {

    NONE,
    ACCESS_TOOLS,
    MODIFY_ALL_CONFIG,
    MODIFY_ALL_RESOURCES,
    MODIFY_ALL_STATUS,
    MODIFY_ALL_USERS,
    READ_ALL_CONFIG,
    READ_ALL_RESOURCES,
    READ_ALL_STATUS,
    READ_ALL_USERS,
    UNLOCK_RESOURCE,
    DM;

    public String value() {
        return name();
    }

    public static AccessRightsValidationList fromValue(String v) {
        return valueOf(v);
    }

}