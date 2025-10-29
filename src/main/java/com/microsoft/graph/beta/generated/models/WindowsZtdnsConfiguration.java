package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Zero Trust DNS configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsZtdnsConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WindowsZtdnsConfiguration} and sets the default values.
     */
    public WindowsZtdnsConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsZtdnsConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsZtdnsConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static WindowsZtdnsConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsZtdnsConfiguration();
    }
    /**
     * Gets the auditModeEnabled property value. Indicates the audit operational mode. When true, unsecured traffic will be logged but not blocked. When false, unsecured DNS traffic will be blocked unless specifically exempted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAuditModeEnabled() {
        return this.backingStore.get("auditModeEnabled");
    }
    /**
     * Gets the exemptionRules property value. Exemptions to the ZTDNS rules, allowing access to specific addresses or subnets via unsecured lookup. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<WindowsZtdnsExemptionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsZtdnsExemptionRule> getExemptionRules() {
        return this.backingStore.get("exemptionRules");
    }
    /**
     * Gets the extendedKeyUsagesForClientAuthentication property value. Extended key usage definitions for client authentication with secure DNS servers. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<ExtendedKeyUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsagesForClientAuthentication() {
        return this.backingStore.get("extendedKeyUsagesForClientAuthentication");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("auditModeEnabled", (n) -> { this.setAuditModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("exemptionRules", (n) -> { this.setExemptionRules(n.getCollectionOfObjectValues(WindowsZtdnsExemptionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("extendedKeyUsagesForClientAuthentication", (n) -> { this.setExtendedKeyUsagesForClientAuthentication(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("hostsFileResolutionEnabled", (n) -> { this.setHostsFileResolutionEnabled(n.getBooleanValue()); });
        deserializerMap.put("loopbackDnsForwarderEnabled", (n) -> { this.setLoopbackDnsForwarderEnabled(n.getBooleanValue()); });
        deserializerMap.put("loopbackTrafficBlocked", (n) -> { this.setLoopbackTrafficBlocked(n.getBooleanValue()); });
        deserializerMap.put("maximumConnectionTimeInSeconds", (n) -> { this.setMaximumConnectionTimeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("rootCertificatesForClientValidation", (n) -> { this.setRootCertificatesForClientValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificatesForServerValidation", (n) -> { this.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("secureDnsServers", (n) -> { this.setSecureDnsServers(n.getCollectionOfObjectValues(WindowsZtdnsSecureDnsServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostsFileResolutionEnabled property value. Indicates whether the DNS Client can resolve queries using the hosts file.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHostsFileResolutionEnabled() {
        return this.backingStore.get("hostsFileResolutionEnabled");
    }
    /**
     * Gets the loopbackDnsForwarderEnabled property value. Creates a localhost DNS server for securely forwarding plaintext queries to trusted DNS servers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoopbackDnsForwarderEnabled() {
        return this.backingStore.get("loopbackDnsForwarderEnabled");
    }
    /**
     * Gets the loopbackTrafficBlocked property value. Indicates whether traffic to loopback addresses should be blocked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLoopbackTrafficBlocked() {
        return this.backingStore.get("loopbackTrafficBlocked");
    }
    /**
     * Gets the maximumConnectionTimeInSeconds property value. Maximum time in seconds for which connections to an IP address will be allowed after successful name resolution. Valid values 30 to 604800
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumConnectionTimeInSeconds() {
        return this.backingStore.get("maximumConnectionTimeInSeconds");
    }
    /**
     * Gets the rootCertificatesForClientValidation property value. Root certificates for client authentication. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<Windows81TrustedRootCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForClientValidation() {
        return this.backingStore.get("rootCertificatesForClientValidation");
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<Windows81TrustedRootCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this.backingStore.get("rootCertificatesForServerValidation");
    }
    /**
     * Gets the secureDnsServers property value. Collection of secure DNS servers used to resolve ZTDNS queries. Must contain at least one item. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<WindowsZtdnsSecureDnsServer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsZtdnsSecureDnsServer> getSecureDnsServers() {
        return this.backingStore.get("secureDnsServers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("auditModeEnabled", this.getAuditModeEnabled());
        writer.writeCollectionOfObjectValues("exemptionRules", this.getExemptionRules());
        writer.writeCollectionOfObjectValues("extendedKeyUsagesForClientAuthentication", this.getExtendedKeyUsagesForClientAuthentication());
        writer.writeBooleanValue("hostsFileResolutionEnabled", this.getHostsFileResolutionEnabled());
        writer.writeBooleanValue("loopbackDnsForwarderEnabled", this.getLoopbackDnsForwarderEnabled());
        writer.writeBooleanValue("loopbackTrafficBlocked", this.getLoopbackTrafficBlocked());
        writer.writeIntegerValue("maximumConnectionTimeInSeconds", this.getMaximumConnectionTimeInSeconds());
        writer.writeCollectionOfObjectValues("rootCertificatesForClientValidation", this.getRootCertificatesForClientValidation());
        writer.writeCollectionOfObjectValues("rootCertificatesForServerValidation", this.getRootCertificatesForServerValidation());
        writer.writeCollectionOfObjectValues("secureDnsServers", this.getSecureDnsServers());
    }
    /**
     * Sets the auditModeEnabled property value. Indicates the audit operational mode. When true, unsecured traffic will be logged but not blocked. When false, unsecured DNS traffic will be blocked unless specifically exempted.
     * @param value Value to set for the auditModeEnabled property.
     */
    public void setAuditModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("auditModeEnabled", value);
    }
    /**
     * Sets the exemptionRules property value. Exemptions to the ZTDNS rules, allowing access to specific addresses or subnets via unsecured lookup. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the exemptionRules property.
     */
    public void setExemptionRules(@jakarta.annotation.Nullable final java.util.List<WindowsZtdnsExemptionRule> value) {
        this.backingStore.set("exemptionRules", value);
    }
    /**
     * Sets the extendedKeyUsagesForClientAuthentication property value. Extended key usage definitions for client authentication with secure DNS servers. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsagesForClientAuthentication property.
     */
    public void setExtendedKeyUsagesForClientAuthentication(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.backingStore.set("extendedKeyUsagesForClientAuthentication", value);
    }
    /**
     * Sets the hostsFileResolutionEnabled property value. Indicates whether the DNS Client can resolve queries using the hosts file.
     * @param value Value to set for the hostsFileResolutionEnabled property.
     */
    public void setHostsFileResolutionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hostsFileResolutionEnabled", value);
    }
    /**
     * Sets the loopbackDnsForwarderEnabled property value. Creates a localhost DNS server for securely forwarding plaintext queries to trusted DNS servers.
     * @param value Value to set for the loopbackDnsForwarderEnabled property.
     */
    public void setLoopbackDnsForwarderEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("loopbackDnsForwarderEnabled", value);
    }
    /**
     * Sets the loopbackTrafficBlocked property value. Indicates whether traffic to loopback addresses should be blocked.
     * @param value Value to set for the loopbackTrafficBlocked property.
     */
    public void setLoopbackTrafficBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("loopbackTrafficBlocked", value);
    }
    /**
     * Sets the maximumConnectionTimeInSeconds property value. Maximum time in seconds for which connections to an IP address will be allowed after successful name resolution. Valid values 30 to 604800
     * @param value Value to set for the maximumConnectionTimeInSeconds property.
     */
    public void setMaximumConnectionTimeInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumConnectionTimeInSeconds", value);
    }
    /**
     * Sets the rootCertificatesForClientValidation property value. Root certificates for client authentication. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForClientValidation property.
     */
    public void setRootCertificatesForClientValidation(@jakarta.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this.backingStore.set("rootCertificatesForClientValidation", value);
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     */
    public void setRootCertificatesForServerValidation(@jakarta.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this.backingStore.set("rootCertificatesForServerValidation", value);
    }
    /**
     * Sets the secureDnsServers property value. Collection of secure DNS servers used to resolve ZTDNS queries. Must contain at least one item. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the secureDnsServers property.
     */
    public void setSecureDnsServers(@jakarta.annotation.Nullable final java.util.List<WindowsZtdnsSecureDnsServer> value) {
        this.backingStore.set("secureDnsServers", value);
    }
}
