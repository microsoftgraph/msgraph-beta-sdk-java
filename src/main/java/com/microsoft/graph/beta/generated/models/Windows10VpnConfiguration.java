package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Windows 10 device (desktop or mobile) to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10VpnConfiguration extends WindowsVpnConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10VpnConfiguration and sets the default values.
     */
    public Windows10VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10VpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10VpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10VpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10VpnConfiguration();
    }
    /**
     * Gets the associatedApps property value. Associated Apps. This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<Windows10AssociatedApps>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows10AssociatedApps> getAssociatedApps() {
        return this.backingStore.get("associatedApps");
    }
    /**
     * Gets the authenticationMethod property value. Windows 10 VPN connection types.
     * @return a Windows10VpnAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public Windows10VpnAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the connectionType property value. VPN connection types.
     * @return a Windows10VpnConnectionType
     */
    @jakarta.annotation.Nullable
    public Windows10VpnConnectionType getConnectionType() {
        return this.backingStore.get("connectionType");
    }
    /**
     * Gets the cryptographySuite property value. Cryptography Suite security settings for IKEv2 VPN in Windows10 and above
     * @return a CryptographySuite
     */
    @jakarta.annotation.Nullable
    public CryptographySuite getCryptographySuite() {
        return this.backingStore.get("cryptographySuite");
    }
    /**
     * Gets the dnsRules property value. DNS rules. This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<VpnDnsRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnDnsRule> getDnsRules() {
        return this.backingStore.get("dnsRules");
    }
    /**
     * Gets the dnsSuffixes property value. Specify DNS suffixes to add to the DNS search list to properly route short names.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsSuffixes() {
        return this.backingStore.get("dnsSuffixes");
    }
    /**
     * Gets the eapXml property value. Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getEapXml() {
        return this.backingStore.get("eapXml");
    }
    /**
     * Gets the enableAlwaysOn property value. Enable Always On mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAlwaysOn() {
        return this.backingStore.get("enableAlwaysOn");
    }
    /**
     * Gets the enableConditionalAccess property value. Enable conditional access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableConditionalAccess() {
        return this.backingStore.get("enableConditionalAccess");
    }
    /**
     * Gets the enableDeviceTunnel property value. Enable device tunnel.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableDeviceTunnel() {
        return this.backingStore.get("enableDeviceTunnel");
    }
    /**
     * Gets the enableDnsRegistration property value. Enable IP address registration with internal DNS.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableDnsRegistration() {
        return this.backingStore.get("enableDnsRegistration");
    }
    /**
     * Gets the enableSingleSignOnWithAlternateCertificate property value. Enable single sign-on (SSO) with alternate certificate.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSingleSignOnWithAlternateCertificate() {
        return this.backingStore.get("enableSingleSignOnWithAlternateCertificate");
    }
    /**
     * Gets the enableSplitTunneling property value. Enable split tunneling.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this.backingStore.get("enableSplitTunneling");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedApps", (n) -> { this.setAssociatedApps(n.getCollectionOfObjectValues(Windows10AssociatedApps::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(Windows10VpnAuthenticationMethod::forValue)); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(Windows10VpnConnectionType::forValue)); });
        deserializerMap.put("cryptographySuite", (n) -> { this.setCryptographySuite(n.getObjectValue(CryptographySuite::createFromDiscriminatorValue)); });
        deserializerMap.put("dnsRules", (n) -> { this.setDnsRules(n.getCollectionOfObjectValues(VpnDnsRule::createFromDiscriminatorValue)); });
        deserializerMap.put("dnsSuffixes", (n) -> { this.setDnsSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("eapXml", (n) -> { this.setEapXml(n.getByteArrayValue()); });
        deserializerMap.put("enableAlwaysOn", (n) -> { this.setEnableAlwaysOn(n.getBooleanValue()); });
        deserializerMap.put("enableConditionalAccess", (n) -> { this.setEnableConditionalAccess(n.getBooleanValue()); });
        deserializerMap.put("enableDeviceTunnel", (n) -> { this.setEnableDeviceTunnel(n.getBooleanValue()); });
        deserializerMap.put("enableDnsRegistration", (n) -> { this.setEnableDnsRegistration(n.getBooleanValue()); });
        deserializerMap.put("enableSingleSignOnWithAlternateCertificate", (n) -> { this.setEnableSingleSignOnWithAlternateCertificate(n.getBooleanValue()); });
        deserializerMap.put("enableSplitTunneling", (n) -> { this.setEnableSplitTunneling(n.getBooleanValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSiteId", (n) -> { this.setMicrosoftTunnelSiteId(n.getStringValue()); });
        deserializerMap.put("onlyAssociatedAppsCanUseConnection", (n) -> { this.setOnlyAssociatedAppsCanUseConnection(n.getBooleanValue()); });
        deserializerMap.put("profileTarget", (n) -> { this.setProfileTarget(n.getEnumValue(Windows10VpnConfigurationProfileTarget::forValue)); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(Windows10VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("rememberUserCredentials", (n) -> { this.setRememberUserCredentials(n.getBooleanValue()); });
        deserializerMap.put("routes", (n) -> { this.setRoutes(n.getCollectionOfObjectValues(VpnRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnEku", (n) -> { this.setSingleSignOnEku(n.getObjectValue(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnIssuerHash", (n) -> { this.setSingleSignOnIssuerHash(n.getStringValue()); });
        deserializerMap.put("trafficRules", (n) -> { this.setTrafficRules(n.getCollectionOfObjectValues(VpnTrafficRule::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedNetworkDomains", (n) -> { this.setTrustedNetworkDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("windowsInformationProtectionDomain", (n) -> { this.setWindowsInformationProtectionDomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a WindowsCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public WindowsCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the microsoftTunnelSiteId property value. ID of the Microsoft Tunnel site associated with the VPN profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this.backingStore.get("microsoftTunnelSiteId");
    }
    /**
     * Gets the onlyAssociatedAppsCanUseConnection property value. Only associated Apps can use connection (per-app VPN).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnlyAssociatedAppsCanUseConnection() {
        return this.backingStore.get("onlyAssociatedAppsCanUseConnection");
    }
    /**
     * Gets the profileTarget property value. Profile target type. Possible values are: user, device, autoPilotDevice.
     * @return a Windows10VpnConfigurationProfileTarget
     */
    @jakarta.annotation.Nullable
    public Windows10VpnConfigurationProfileTarget getProfileTarget() {
        return this.backingStore.get("profileTarget");
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
     * @return a Windows10VpnProxyServer
     */
    @jakarta.annotation.Nullable
    public Windows10VpnProxyServer getProxyServer() {
        return this.backingStore.get("proxyServer");
    }
    /**
     * Gets the rememberUserCredentials property value. Remember user credentials.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRememberUserCredentials() {
        return this.backingStore.get("rememberUserCredentials");
    }
    /**
     * Gets the routes property value. Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<VpnRoute>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnRoute> getRoutes() {
        return this.backingStore.get("routes");
    }
    /**
     * Gets the singleSignOnEku property value. Single sign-on Extended Key Usage (EKU).
     * @return a ExtendedKeyUsage
     */
    @jakarta.annotation.Nullable
    public ExtendedKeyUsage getSingleSignOnEku() {
        return this.backingStore.get("singleSignOnEku");
    }
    /**
     * Gets the singleSignOnIssuerHash property value. Single sign-on issuer hash.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSingleSignOnIssuerHash() {
        return this.backingStore.get("singleSignOnIssuerHash");
    }
    /**
     * Gets the trafficRules property value. Traffic rules. This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<VpnTrafficRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnTrafficRule> getTrafficRules() {
        return this.backingStore.get("trafficRules");
    }
    /**
     * Gets the trustedNetworkDomains property value. Trusted Network Domains
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrustedNetworkDomains() {
        return this.backingStore.get("trustedNetworkDomains");
    }
    /**
     * Gets the windowsInformationProtectionDomain property value. Windows Information Protection (WIP) domain to associate with this connection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindowsInformationProtectionDomain() {
        return this.backingStore.get("windowsInformationProtectionDomain");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("associatedApps", this.getAssociatedApps());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeObjectValue("cryptographySuite", this.getCryptographySuite());
        writer.writeCollectionOfObjectValues("dnsRules", this.getDnsRules());
        writer.writeCollectionOfPrimitiveValues("dnsSuffixes", this.getDnsSuffixes());
        writer.writeByteArrayValue("eapXml", this.getEapXml());
        writer.writeBooleanValue("enableAlwaysOn", this.getEnableAlwaysOn());
        writer.writeBooleanValue("enableConditionalAccess", this.getEnableConditionalAccess());
        writer.writeBooleanValue("enableDeviceTunnel", this.getEnableDeviceTunnel());
        writer.writeBooleanValue("enableDnsRegistration", this.getEnableDnsRegistration());
        writer.writeBooleanValue("enableSingleSignOnWithAlternateCertificate", this.getEnableSingleSignOnWithAlternateCertificate());
        writer.writeBooleanValue("enableSplitTunneling", this.getEnableSplitTunneling());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("microsoftTunnelSiteId", this.getMicrosoftTunnelSiteId());
        writer.writeBooleanValue("onlyAssociatedAppsCanUseConnection", this.getOnlyAssociatedAppsCanUseConnection());
        writer.writeEnumValue("profileTarget", this.getProfileTarget());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
        writer.writeBooleanValue("rememberUserCredentials", this.getRememberUserCredentials());
        writer.writeCollectionOfObjectValues("routes", this.getRoutes());
        writer.writeObjectValue("singleSignOnEku", this.getSingleSignOnEku());
        writer.writeStringValue("singleSignOnIssuerHash", this.getSingleSignOnIssuerHash());
        writer.writeCollectionOfObjectValues("trafficRules", this.getTrafficRules());
        writer.writeCollectionOfPrimitiveValues("trustedNetworkDomains", this.getTrustedNetworkDomains());
        writer.writeStringValue("windowsInformationProtectionDomain", this.getWindowsInformationProtectionDomain());
    }
    /**
     * Sets the associatedApps property value. Associated Apps. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the associatedApps property.
     */
    public void setAssociatedApps(@jakarta.annotation.Nullable final java.util.List<Windows10AssociatedApps> value) {
        this.backingStore.set("associatedApps", value);
    }
    /**
     * Sets the authenticationMethod property value. Windows 10 VPN connection types.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final Windows10VpnAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the connectionType property value. VPN connection types.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final Windows10VpnConnectionType value) {
        this.backingStore.set("connectionType", value);
    }
    /**
     * Sets the cryptographySuite property value. Cryptography Suite security settings for IKEv2 VPN in Windows10 and above
     * @param value Value to set for the cryptographySuite property.
     */
    public void setCryptographySuite(@jakarta.annotation.Nullable final CryptographySuite value) {
        this.backingStore.set("cryptographySuite", value);
    }
    /**
     * Sets the dnsRules property value. DNS rules. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the dnsRules property.
     */
    public void setDnsRules(@jakarta.annotation.Nullable final java.util.List<VpnDnsRule> value) {
        this.backingStore.set("dnsRules", value);
    }
    /**
     * Sets the dnsSuffixes property value. Specify DNS suffixes to add to the DNS search list to properly route short names.
     * @param value Value to set for the dnsSuffixes property.
     */
    public void setDnsSuffixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dnsSuffixes", value);
    }
    /**
     * Sets the eapXml property value. Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)
     * @param value Value to set for the eapXml property.
     */
    public void setEapXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("eapXml", value);
    }
    /**
     * Sets the enableAlwaysOn property value. Enable Always On mode.
     * @param value Value to set for the enableAlwaysOn property.
     */
    public void setEnableAlwaysOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableAlwaysOn", value);
    }
    /**
     * Sets the enableConditionalAccess property value. Enable conditional access.
     * @param value Value to set for the enableConditionalAccess property.
     */
    public void setEnableConditionalAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableConditionalAccess", value);
    }
    /**
     * Sets the enableDeviceTunnel property value. Enable device tunnel.
     * @param value Value to set for the enableDeviceTunnel property.
     */
    public void setEnableDeviceTunnel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableDeviceTunnel", value);
    }
    /**
     * Sets the enableDnsRegistration property value. Enable IP address registration with internal DNS.
     * @param value Value to set for the enableDnsRegistration property.
     */
    public void setEnableDnsRegistration(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableDnsRegistration", value);
    }
    /**
     * Sets the enableSingleSignOnWithAlternateCertificate property value. Enable single sign-on (SSO) with alternate certificate.
     * @param value Value to set for the enableSingleSignOnWithAlternateCertificate property.
     */
    public void setEnableSingleSignOnWithAlternateCertificate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSingleSignOnWithAlternateCertificate", value);
    }
    /**
     * Sets the enableSplitTunneling property value. Enable split tunneling.
     * @param value Value to set for the enableSplitTunneling property.
     */
    public void setEnableSplitTunneling(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSplitTunneling", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final WindowsCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the microsoftTunnelSiteId property value. ID of the Microsoft Tunnel site associated with the VPN profile.
     * @param value Value to set for the microsoftTunnelSiteId property.
     */
    public void setMicrosoftTunnelSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("microsoftTunnelSiteId", value);
    }
    /**
     * Sets the onlyAssociatedAppsCanUseConnection property value. Only associated Apps can use connection (per-app VPN).
     * @param value Value to set for the onlyAssociatedAppsCanUseConnection property.
     */
    public void setOnlyAssociatedAppsCanUseConnection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onlyAssociatedAppsCanUseConnection", value);
    }
    /**
     * Sets the profileTarget property value. Profile target type. Possible values are: user, device, autoPilotDevice.
     * @param value Value to set for the profileTarget property.
     */
    public void setProfileTarget(@jakarta.annotation.Nullable final Windows10VpnConfigurationProfileTarget value) {
        this.backingStore.set("profileTarget", value);
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
     * @param value Value to set for the proxyServer property.
     */
    public void setProxyServer(@jakarta.annotation.Nullable final Windows10VpnProxyServer value) {
        this.backingStore.set("proxyServer", value);
    }
    /**
     * Sets the rememberUserCredentials property value. Remember user credentials.
     * @param value Value to set for the rememberUserCredentials property.
     */
    public void setRememberUserCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("rememberUserCredentials", value);
    }
    /**
     * Sets the routes property value. Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the routes property.
     */
    public void setRoutes(@jakarta.annotation.Nullable final java.util.List<VpnRoute> value) {
        this.backingStore.set("routes", value);
    }
    /**
     * Sets the singleSignOnEku property value. Single sign-on Extended Key Usage (EKU).
     * @param value Value to set for the singleSignOnEku property.
     */
    public void setSingleSignOnEku(@jakarta.annotation.Nullable final ExtendedKeyUsage value) {
        this.backingStore.set("singleSignOnEku", value);
    }
    /**
     * Sets the singleSignOnIssuerHash property value. Single sign-on issuer hash.
     * @param value Value to set for the singleSignOnIssuerHash property.
     */
    public void setSingleSignOnIssuerHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("singleSignOnIssuerHash", value);
    }
    /**
     * Sets the trafficRules property value. Traffic rules. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the trafficRules property.
     */
    public void setTrafficRules(@jakarta.annotation.Nullable final java.util.List<VpnTrafficRule> value) {
        this.backingStore.set("trafficRules", value);
    }
    /**
     * Sets the trustedNetworkDomains property value. Trusted Network Domains
     * @param value Value to set for the trustedNetworkDomains property.
     */
    public void setTrustedNetworkDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("trustedNetworkDomains", value);
    }
    /**
     * Sets the windowsInformationProtectionDomain property value. Windows Information Protection (WIP) domain to associate with this connection.
     * @param value Value to set for the windowsInformationProtectionDomain property.
     */
    public void setWindowsInformationProtectionDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windowsInformationProtectionDomain", value);
    }
}
