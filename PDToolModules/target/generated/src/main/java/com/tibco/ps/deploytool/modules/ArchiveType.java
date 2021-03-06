//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.16 at 10:25:54 AM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Archive Type: Defines the inputs required to process the archive command.
 * 			
 * 
 * <p>Java class for ArchiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="archiveMethod" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveMethodSimpleType"/&gt;
 *         &lt;element name="archiveFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="includeDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resources" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveResourceType" minOccurs="0"/&gt;
 *         &lt;element name="encrypt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeaccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeallusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includerequiredusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includecaching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includejars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includesourceinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includestatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="messagesonly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overridelocks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pkgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="printinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printroots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printcontents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="setAttributes" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveResourceModificationType" minOccurs="0"/&gt;
 *         &lt;element name="users" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveExportSecurityType" minOccurs="0"/&gt;
 *         &lt;element name="verbose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quiet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="excludeJars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nosourceinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mergeusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nocaching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nocachepolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="noscheduling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="createcachetables" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="updateCacheTables" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reintrospect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reintrospectNone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rebindableResources" type="{http://www.tibco.com/ps/deploytool/modules}ArchiveRebindablePathType" minOccurs="0"/&gt;
 *         &lt;element name="sso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sspi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="spn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="krb5Conf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encryptionPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genopt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeParentResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreEncryption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveType", propOrder = {

})
public class ArchiveType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, defaultValue = "CAR")
    @XmlSchemaType(name = "string")
    protected ArchiveMethodSimpleType archiveMethod;
    @XmlElement(required = true)
    protected String archiveFileName;
    @XmlElement(defaultValue = "true")
    protected Boolean includeDependencies;
    protected ArchiveResourceType resources;
    @XmlElement(defaultValue = "false")
    protected Boolean encrypt;
    protected String description;
    @XmlElement(defaultValue = "false")
    protected Boolean includeaccess;
    @XmlElement(defaultValue = "false")
    protected Boolean includeallusers;
    @XmlElement(defaultValue = "false")
    protected Boolean includerequiredusers;
    @XmlElement(defaultValue = "false")
    protected Boolean includecaching;
    @XmlElement(defaultValue = "true")
    protected Boolean includejars;
    @XmlElement(defaultValue = "false")
    protected Boolean includesourceinfo;
    @XmlElement(defaultValue = "false")
    protected Boolean includestatistics;
    @XmlElement(defaultValue = "false")
    protected Boolean messagesonly;
    @XmlElement(defaultValue = "false")
    protected Boolean overridelocks;
    @XmlElement(defaultValue = "false")
    protected Boolean overwrite;
    @XmlElement(defaultValue = "Composite Server Archive File via PD Tool")
    protected String pkgName;
    @XmlElement(defaultValue = "false")
    protected Boolean printinfo;
    @XmlElement(defaultValue = "false")
    protected Boolean printroots;
    @XmlElement(defaultValue = "false")
    protected Boolean printusers;
    @XmlElement(defaultValue = "false")
    protected Boolean printcontents;
    @XmlElement(defaultValue = "false")
    protected Boolean printreferences;
    protected ArchiveResourceModificationType setAttributes;
    protected ArchiveExportSecurityType users;
    @XmlElement(defaultValue = "false")
    protected Boolean verbose;
    @XmlElement(defaultValue = "false")
    protected Boolean quiet;
    @XmlElement(defaultValue = "false")
    protected Boolean excludeJars;
    @XmlElement(defaultValue = "false")
    protected Boolean nosourceinfo;
    @XmlElement(defaultValue = "false")
    protected Boolean mergeusers;
    @XmlElement(defaultValue = "false")
    protected Boolean nocaching;
    @XmlElement(defaultValue = "false")
    protected Boolean nocachepolicy;
    @XmlElement(defaultValue = "false")
    protected Boolean noscheduling;
    @XmlElement(defaultValue = "false")
    protected Boolean createcachetables;
    @XmlElement(defaultValue = "false")
    protected Boolean updateCacheTables;
    @XmlElement(defaultValue = "false")
    protected Boolean reintrospect;
    @XmlElement(defaultValue = "false")
    protected Boolean reintrospectNone;
    protected ArchiveRebindablePathType rebindableResources;
    @XmlElement(defaultValue = "false")
    protected Boolean sso;
    @XmlElement(defaultValue = "false")
    protected Boolean sspi;
    protected String spn;
    protected String krb5Conf;
    protected String optfile;
    protected String encryptionPassword;
    protected String genopt;
    @XmlElement(defaultValue = "false")
    protected Boolean includeParentResources;
    @XmlElement(defaultValue = "true")
    protected Boolean ignoreEncryption;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the archiveMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveMethodSimpleType }
     *     
     */
    public ArchiveMethodSimpleType getArchiveMethod() {
        return archiveMethod;
    }

    /**
     * Sets the value of the archiveMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveMethodSimpleType }
     *     
     */
    public void setArchiveMethod(ArchiveMethodSimpleType value) {
        this.archiveMethod = value;
    }

    /**
     * Gets the value of the archiveFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveFileName() {
        return archiveFileName;
    }

    /**
     * Sets the value of the archiveFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveFileName(String value) {
        this.archiveFileName = value;
    }

    /**
     * Gets the value of the includeDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDependencies() {
        return includeDependencies;
    }

    /**
     * Sets the value of the includeDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDependencies(Boolean value) {
        this.includeDependencies = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveResourceType }
     *     
     */
    public ArchiveResourceType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveResourceType }
     *     
     */
    public void setResources(ArchiveResourceType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the encrypt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypt() {
        return encrypt;
    }

    /**
     * Sets the value of the encrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypt(Boolean value) {
        this.encrypt = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the includeaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeaccess() {
        return includeaccess;
    }

    /**
     * Sets the value of the includeaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeaccess(Boolean value) {
        this.includeaccess = value;
    }

    /**
     * Gets the value of the includeallusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeallusers() {
        return includeallusers;
    }

    /**
     * Sets the value of the includeallusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeallusers(Boolean value) {
        this.includeallusers = value;
    }

    /**
     * Gets the value of the includerequiredusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluderequiredusers() {
        return includerequiredusers;
    }

    /**
     * Sets the value of the includerequiredusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluderequiredusers(Boolean value) {
        this.includerequiredusers = value;
    }

    /**
     * Gets the value of the includecaching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludecaching() {
        return includecaching;
    }

    /**
     * Sets the value of the includecaching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludecaching(Boolean value) {
        this.includecaching = value;
    }

    /**
     * Gets the value of the includejars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludejars() {
        return includejars;
    }

    /**
     * Sets the value of the includejars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludejars(Boolean value) {
        this.includejars = value;
    }

    /**
     * Gets the value of the includesourceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesourceinfo() {
        return includesourceinfo;
    }

    /**
     * Sets the value of the includesourceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesourceinfo(Boolean value) {
        this.includesourceinfo = value;
    }

    /**
     * Gets the value of the includestatistics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludestatistics() {
        return includestatistics;
    }

    /**
     * Sets the value of the includestatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludestatistics(Boolean value) {
        this.includestatistics = value;
    }

    /**
     * Gets the value of the messagesonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessagesonly() {
        return messagesonly;
    }

    /**
     * Sets the value of the messagesonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessagesonly(Boolean value) {
        this.messagesonly = value;
    }

    /**
     * Gets the value of the overridelocks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridelocks() {
        return overridelocks;
    }

    /**
     * Sets the value of the overridelocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridelocks(Boolean value) {
        this.overridelocks = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Gets the value of the pkgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * Sets the value of the pkgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgName(String value) {
        this.pkgName = value;
    }

    /**
     * Gets the value of the printinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintinfo() {
        return printinfo;
    }

    /**
     * Sets the value of the printinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintinfo(Boolean value) {
        this.printinfo = value;
    }

    /**
     * Gets the value of the printroots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintroots() {
        return printroots;
    }

    /**
     * Sets the value of the printroots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintroots(Boolean value) {
        this.printroots = value;
    }

    /**
     * Gets the value of the printusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintusers() {
        return printusers;
    }

    /**
     * Sets the value of the printusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintusers(Boolean value) {
        this.printusers = value;
    }

    /**
     * Gets the value of the printcontents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintcontents() {
        return printcontents;
    }

    /**
     * Sets the value of the printcontents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintcontents(Boolean value) {
        this.printcontents = value;
    }

    /**
     * Gets the value of the printreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintreferences() {
        return printreferences;
    }

    /**
     * Sets the value of the printreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintreferences(Boolean value) {
        this.printreferences = value;
    }

    /**
     * Gets the value of the setAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveResourceModificationType }
     *     
     */
    public ArchiveResourceModificationType getSetAttributes() {
        return setAttributes;
    }

    /**
     * Sets the value of the setAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveResourceModificationType }
     *     
     */
    public void setSetAttributes(ArchiveResourceModificationType value) {
        this.setAttributes = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveExportSecurityType }
     *     
     */
    public ArchiveExportSecurityType getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveExportSecurityType }
     *     
     */
    public void setUsers(ArchiveExportSecurityType value) {
        this.users = value;
    }

    /**
     * Gets the value of the verbose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerbose() {
        return verbose;
    }

    /**
     * Sets the value of the verbose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerbose(Boolean value) {
        this.verbose = value;
    }

    /**
     * Gets the value of the quiet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuiet() {
        return quiet;
    }

    /**
     * Sets the value of the quiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuiet(Boolean value) {
        this.quiet = value;
    }

    /**
     * Gets the value of the excludeJars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeJars() {
        return excludeJars;
    }

    /**
     * Sets the value of the excludeJars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeJars(Boolean value) {
        this.excludeJars = value;
    }

    /**
     * Gets the value of the nosourceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNosourceinfo() {
        return nosourceinfo;
    }

    /**
     * Sets the value of the nosourceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNosourceinfo(Boolean value) {
        this.nosourceinfo = value;
    }

    /**
     * Gets the value of the mergeusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeusers() {
        return mergeusers;
    }

    /**
     * Sets the value of the mergeusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeusers(Boolean value) {
        this.mergeusers = value;
    }

    /**
     * Gets the value of the nocaching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNocaching() {
        return nocaching;
    }

    /**
     * Sets the value of the nocaching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNocaching(Boolean value) {
        this.nocaching = value;
    }

    /**
     * Gets the value of the nocachepolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNocachepolicy() {
        return nocachepolicy;
    }

    /**
     * Sets the value of the nocachepolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNocachepolicy(Boolean value) {
        this.nocachepolicy = value;
    }

    /**
     * Gets the value of the noscheduling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoscheduling() {
        return noscheduling;
    }

    /**
     * Sets the value of the noscheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoscheduling(Boolean value) {
        this.noscheduling = value;
    }

    /**
     * Gets the value of the createcachetables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatecachetables() {
        return createcachetables;
    }

    /**
     * Sets the value of the createcachetables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatecachetables(Boolean value) {
        this.createcachetables = value;
    }

    /**
     * Gets the value of the updateCacheTables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateCacheTables() {
        return updateCacheTables;
    }

    /**
     * Sets the value of the updateCacheTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCacheTables(Boolean value) {
        this.updateCacheTables = value;
    }

    /**
     * Gets the value of the reintrospect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReintrospect() {
        return reintrospect;
    }

    /**
     * Sets the value of the reintrospect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReintrospect(Boolean value) {
        this.reintrospect = value;
    }

    /**
     * Gets the value of the reintrospectNone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReintrospectNone() {
        return reintrospectNone;
    }

    /**
     * Sets the value of the reintrospectNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReintrospectNone(Boolean value) {
        this.reintrospectNone = value;
    }

    /**
     * Gets the value of the rebindableResources property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveRebindablePathType }
     *     
     */
    public ArchiveRebindablePathType getRebindableResources() {
        return rebindableResources;
    }

    /**
     * Sets the value of the rebindableResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveRebindablePathType }
     *     
     */
    public void setRebindableResources(ArchiveRebindablePathType value) {
        this.rebindableResources = value;
    }

    /**
     * Gets the value of the sso property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSso() {
        return sso;
    }

    /**
     * Sets the value of the sso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSso(Boolean value) {
        this.sso = value;
    }

    /**
     * Gets the value of the sspi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSspi() {
        return sspi;
    }

    /**
     * Sets the value of the sspi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSspi(Boolean value) {
        this.sspi = value;
    }

    /**
     * Gets the value of the spn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpn() {
        return spn;
    }

    /**
     * Sets the value of the spn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpn(String value) {
        this.spn = value;
    }

    /**
     * Gets the value of the krb5Conf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrb5Conf() {
        return krb5Conf;
    }

    /**
     * Sets the value of the krb5Conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrb5Conf(String value) {
        this.krb5Conf = value;
    }

    /**
     * Gets the value of the optfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptfile() {
        return optfile;
    }

    /**
     * Sets the value of the optfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptfile(String value) {
        this.optfile = value;
    }

    /**
     * Gets the value of the encryptionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassword() {
        return encryptionPassword;
    }

    /**
     * Sets the value of the encryptionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionPassword(String value) {
        this.encryptionPassword = value;
    }

    /**
     * Gets the value of the genopt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenopt() {
        return genopt;
    }

    /**
     * Sets the value of the genopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenopt(String value) {
        this.genopt = value;
    }

    /**
     * Gets the value of the includeParentResources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeParentResources() {
        return includeParentResources;
    }

    /**
     * Sets the value of the includeParentResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeParentResources(Boolean value) {
        this.includeParentResources = value;
    }

    /**
     * Gets the value of the ignoreEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreEncryption() {
        return ignoreEncryption;
    }

    /**
     * Sets the value of the ignoreEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEncryption(Boolean value) {
        this.ignoreEncryption = value;
    }

}
