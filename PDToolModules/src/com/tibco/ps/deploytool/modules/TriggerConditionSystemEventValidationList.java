//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.13 at 12:40:03 PM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TriggerConditionSystemEventValidationList.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TriggerConditionSystemEventValidationList"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CacheRefreshFailure"/&amp;gt;
 *     &amp;lt;enumeration value="CacheRefreshSuccess"/&amp;gt;
 *     &amp;lt;enumeration value="DataSourceDown"/&amp;gt;
 *     &amp;lt;enumeration value="DataSourceUp"/&amp;gt;
 *     &amp;lt;enumeration value="RequestFailure"/&amp;gt;
 *     &amp;lt;enumeration value="RequestInactive"/&amp;gt;
 *     &amp;lt;enumeration value="RequestRunForTooLong"/&amp;gt;
 *     &amp;lt;enumeration value="ResourceLock"/&amp;gt;
 *     &amp;lt;enumeration value="ResourceUnlock"/&amp;gt;
 *     &amp;lt;enumeration value="RequestsSpike"/&amp;gt;
 *     &amp;lt;enumeration value="ErrorsSpike"/&amp;gt;
 *     &amp;lt;enumeration value="FailedLoginSpike"/&amp;gt;
 *     &amp;lt;enumeration value="StatisticsGatheringFailure"/&amp;gt;
 *     &amp;lt;enumeration value="ServerStart"/&amp;gt;
 *     &amp;lt;enumeration value="ServerStop"/&amp;gt;
 *     &amp;lt;enumeration value="TransactionFailure"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TriggerConditionSystemEventValidationList")
@XmlEnum
public enum TriggerConditionSystemEventValidationList {

    @XmlEnumValue("CacheRefreshFailure")
    CACHE_REFRESH_FAILURE("CacheRefreshFailure"),
    @XmlEnumValue("CacheRefreshSuccess")
    CACHE_REFRESH_SUCCESS("CacheRefreshSuccess"),
    @XmlEnumValue("DataSourceDown")
    DATA_SOURCE_DOWN("DataSourceDown"),
    @XmlEnumValue("DataSourceUp")
    DATA_SOURCE_UP("DataSourceUp"),
    @XmlEnumValue("RequestFailure")
    REQUEST_FAILURE("RequestFailure"),
    @XmlEnumValue("RequestInactive")
    REQUEST_INACTIVE("RequestInactive"),
    @XmlEnumValue("RequestRunForTooLong")
    REQUEST_RUN_FOR_TOO_LONG("RequestRunForTooLong"),
    @XmlEnumValue("ResourceLock")
    RESOURCE_LOCK("ResourceLock"),
    @XmlEnumValue("ResourceUnlock")
    RESOURCE_UNLOCK("ResourceUnlock"),
    @XmlEnumValue("RequestsSpike")
    REQUESTS_SPIKE("RequestsSpike"),
    @XmlEnumValue("ErrorsSpike")
    ERRORS_SPIKE("ErrorsSpike"),
    @XmlEnumValue("FailedLoginSpike")
    FAILED_LOGIN_SPIKE("FailedLoginSpike"),
    @XmlEnumValue("StatisticsGatheringFailure")
    STATISTICS_GATHERING_FAILURE("StatisticsGatheringFailure"),
    @XmlEnumValue("ServerStart")
    SERVER_START("ServerStart"),
    @XmlEnumValue("ServerStop")
    SERVER_STOP("ServerStop"),
    @XmlEnumValue("TransactionFailure")
    TRANSACTION_FAILURE("TransactionFailure");
    private final String value;

    TriggerConditionSystemEventValidationList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerConditionSystemEventValidationList fromValue(String v) {
        for (TriggerConditionSystemEventValidationList c: TriggerConditionSystemEventValidationList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
