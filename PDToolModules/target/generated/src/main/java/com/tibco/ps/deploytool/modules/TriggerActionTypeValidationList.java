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
 * <p>Java class for TriggerActionTypeValidationList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerActionTypeValidationList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROCEDURE"/&gt;
 *     &lt;enumeration value="STATISTICS"/&gt;
 *     &lt;enumeration value="REINTROSPECT"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerActionTypeValidationList")
@XmlEnum
public enum TriggerActionTypeValidationList {

    PROCEDURE,
    STATISTICS,
    REINTROSPECT,
    EMAIL;

    public String value() {
        return name();
    }

    public static TriggerActionTypeValidationList fromValue(String v) {
        return valueOf(v);
    }

}
