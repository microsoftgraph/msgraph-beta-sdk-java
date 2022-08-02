package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10VpnConfiguration extends WindowsVpnConfiguration implements Parsable {
    /** Associated Apps. This collection can contain a maximum of 10000 elements. */
    private java.util.List<Windows10AssociatedApps> _associatedApps;
    /** Windows 10 VPN connection types. */
    private Windows10VpnAuthenticationMethod _authenticationMethod;
    /** VPN connection types. */
    private Windows10VpnConnectionType _connectionType;
    /** Cryptography Suite security settings for IKEv2 VPN in Windows10 and above */
    private CryptographySuite _cryptographySuite;
    /** DNS rules. This collection can contain a maximum of 1000 elements. */
    private java.util.List<VpnDnsRule> _dnsRules;
    /** Specify DNS suffixes to add to the DNS search list to properly route short names. */
    private java.util.List<String> _dnsSuffixes;
    /** Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array) */
    private byte[] _eapXml;
    /** Enable Always On mode. */
    private Boolean _enableAlwaysOn;
    /** Enable conditional access. */
    private Boolean _enableConditionalAccess;
    /** Enable device tunnel. */
    private Boolean _enableDeviceTunnel;
    /** Enable IP address registration with internal DNS. */
    private Boolean _enableDnsRegistration;
    /** Enable single sign-on (SSO) with alternate certificate. */
    private Boolean _enableSingleSignOnWithAlternateCertificate;
    /** Enable split tunneling. */
    private Boolean _enableSplitTunneling;
    /** Identity certificate for client authentication when authentication method is certificate. */
    private WindowsCertificateProfileBase _identityCertificate;
    /** ID of the Microsoft Tunnel site associated with the VPN profile. */
    private String _microsoftTunnelSiteId;
    /** Only associated Apps can use connection (per-app VPN). */
    private Boolean _onlyAssociatedAppsCanUseConnection;
    /** Profile target type. Possible values are: user, device, autoPilotDevice. */
    private Windows10VpnProfileTarget _profileTarget;
    /** Proxy Server. */
    private Windows10VpnProxyServer _proxyServer;
    /** Remember user credentials. */
    private Boolean _rememberUserCredentials;
    /** Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements. */
    private java.util.List<VpnRoute> _routes;
    /** Single sign-on Extended Key Usage (EKU). */
    private ExtendedKeyUsage _singleSignOnEku;
    /** Single sign-on issuer hash. */
    private String _singleSignOnIssuerHash;
    /** Traffic rules. This collection can contain a maximum of 1000 elements. */
    private java.util.List<VpnTrafficRule> _trafficRules;
    /** Trusted Network Domains */
    private java.util.List<String> _trustedNetworkDomains;
    /** Windows Information Protection (WIP) domain to associate with this connection. */
    private String _windowsInformationProtectionDomain;
    /**
     * Instantiates a new Windows10VpnConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Windows10VpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10VpnConfiguration();
    }
    /**
     * Gets the associatedApps property value. Associated Apps. This collection can contain a maximum of 10000 elements.
     * @return a windows10AssociatedApps
     */
    @javax.annotation.Nullable
    public java.util.List<Windows10AssociatedApps> getAssociatedApps() {
        return this._associatedApps;
    }
    /**
     * Gets the authenticationMethod property value. Windows 10 VPN connection types.
     * @return a windows10VpnAuthenticationMethod
     */
    @javax.annotation.Nullable
    public Windows10VpnAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the connectionType property value. VPN connection types.
     * @return a windows10VpnConnectionType
     */
    @javax.annotation.Nullable
    public Windows10VpnConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the cryptographySuite property value. Cryptography Suite security settings for IKEv2 VPN in Windows10 and above
     * @return a cryptographySuite
     */
    @javax.annotation.Nullable
    public CryptographySuite getCryptographySuite() {
        return this._cryptographySuite;
    }
    /**
     * Gets the dnsRules property value. DNS rules. This collection can contain a maximum of 1000 elements.
     * @return a vpnDnsRule
     */
    @javax.annotation.Nullable
    public java.util.List<VpnDnsRule> getDnsRules() {
        return this._dnsRules;
    }
    /**
     * Gets the dnsSuffixes property value. Specify DNS suffixes to add to the DNS search list to properly route short names.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsSuffixes() {
        return this._dnsSuffixes;
    }
    /**
     * Gets the eapXml property value. Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getEapXml() {
        return this._eapXml;
    }
    /**
     * Gets the enableAlwaysOn property value. Enable Always On mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAlwaysOn() {
        return this._enableAlwaysOn;
    }
    /**
     * Gets the enableConditionalAccess property value. Enable conditional access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableConditionalAccess() {
        return this._enableConditionalAccess;
    }
    /**
     * Gets the enableDeviceTunnel property value. Enable device tunnel.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableDeviceTunnel() {
        return this._enableDeviceTunnel;
    }
    /**
     * Gets the enableDnsRegistration property value. Enable IP address registration with internal DNS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableDnsRegistration() {
        return this._enableDnsRegistration;
    }
    /**
     * Gets the enableSingleSignOnWithAlternateCertificate property value. Enable single sign-on (SSO) with alternate certificate.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSingleSignOnWithAlternateCertificate() {
        return this._enableSingleSignOnWithAlternateCertificate;
    }
    /**
     * Gets the enableSplitTunneling property value. Enable split tunneling.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this._enableSplitTunneling;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10VpnConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("associatedApps", (n) -> { currentObject.setAssociatedApps(n.getCollectionOfObjectValues(Windows10AssociatedApps::createFromDiscriminatorValue)); });
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(Windows10VpnAuthenticationMethod.class)); });
            this.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(Windows10VpnConnectionType.class)); });
            this.put("cryptographySuite", (n) -> { currentObject.setCryptographySuite(n.getObjectValue(CryptographySuite::createFromDiscriminatorValue)); });
            this.put("dnsRules", (n) -> { currentObject.setDnsRules(n.getCollectionOfObjectValues(VpnDnsRule::createFromDiscriminatorValue)); });
            this.put("dnsSuffixes", (n) -> { currentObject.setDnsSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("eapXml", (n) -> { currentObject.setEapXml(n.getByteArrayValue()); });
            this.put("enableAlwaysOn", (n) -> { currentObject.setEnableAlwaysOn(n.getBooleanValue()); });
            this.put("enableConditionalAccess", (n) -> { currentObject.setEnableConditionalAccess(n.getBooleanValue()); });
            this.put("enableDeviceTunnel", (n) -> { currentObject.setEnableDeviceTunnel(n.getBooleanValue()); });
            this.put("enableDnsRegistration", (n) -> { currentObject.setEnableDnsRegistration(n.getBooleanValue()); });
            this.put("enableSingleSignOnWithAlternateCertificate", (n) -> { currentObject.setEnableSingleSignOnWithAlternateCertificate(n.getBooleanValue()); });
            this.put("enableSplitTunneling", (n) -> { currentObject.setEnableSplitTunneling(n.getBooleanValue()); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelSiteId", (n) -> { currentObject.setMicrosoftTunnelSiteId(n.getStringValue()); });
            this.put("onlyAssociatedAppsCanUseConnection", (n) -> { currentObject.setOnlyAssociatedAppsCanUseConnection(n.getBooleanValue()); });
            this.put("profileTarget", (n) -> { currentObject.setProfileTarget(n.getEnumValue(Windows10VpnProfileTarget.class)); });
            this.put("proxyServer", (n) -> { currentObject.setProxyServer(n.getObjectValue(Windows10VpnProxyServer::createFromDiscriminatorValue)); });
            this.put("rememberUserCredentials", (n) -> { currentObject.setRememberUserCredentials(n.getBooleanValue()); });
            this.put("routes", (n) -> { currentObject.setRoutes(n.getCollectionOfObjectValues(VpnRoute::createFromDiscriminatorValue)); });
            this.put("singleSignOnEku", (n) -> { currentObject.setSingleSignOnEku(n.getObjectValue(ExtendedKeyUsage::createFromDiscriminatorValue)); });
            this.put("singleSignOnIssuerHash", (n) -> { currentObject.setSingleSignOnIssuerHash(n.getStringValue()); });
            this.put("trafficRules", (n) -> { currentObject.setTrafficRules(n.getCollectionOfObjectValues(VpnTrafficRule::createFromDiscriminatorValue)); });
            this.put("trustedNetworkDomains", (n) -> { currentObject.setTrustedNetworkDomains(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("windowsInformationProtectionDomain", (n) -> { currentObject.setWindowsInformationProtectionDomain(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a windowsCertificateProfileBase
     */
    @javax.annotation.Nullable
    public WindowsCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the microsoftTunnelSiteId property value. ID of the Microsoft Tunnel site associated with the VPN profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this._microsoftTunnelSiteId;
    }
    /**
     * Gets the onlyAssociatedAppsCanUseConnection property value. Only associated Apps can use connection (per-app VPN).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnlyAssociatedAppsCanUseConnection() {
        return this._onlyAssociatedAppsCanUseConnection;
    }
    /**
     * Gets the profileTarget property value. Profile target type. Possible values are: user, device, autoPilotDevice.
     * @return a windows10VpnProfileTarget
     */
    @javax.annotation.Nullable
    public Windows10VpnProfileTarget getProfileTarget() {
        return this._profileTarget;
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
     * @return a windows10VpnProxyServer
     */
    @javax.annotation.Nullable
    public Windows10VpnProxyServer getProxyServer() {
        return this._proxyServer;
    }
    /**
     * Gets the rememberUserCredentials property value. Remember user credentials.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRememberUserCredentials() {
        return this._rememberUserCredentials;
    }
    /**
     * Gets the routes property value. Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.
     * @return a vpnRoute
     */
    @javax.annotation.Nullable
    public java.util.List<VpnRoute> getRoutes() {
        return this._routes;
    }
    /**
     * Gets the singleSignOnEku property value. Single sign-on Extended Key Usage (EKU).
     * @return a extendedKeyUsage
     */
    @javax.annotation.Nullable
    public ExtendedKeyUsage getSingleSignOnEku() {
        return this._singleSignOnEku;
    }
    /**
     * Gets the singleSignOnIssuerHash property value. Single sign-on issuer hash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSingleSignOnIssuerHash() {
        return this._singleSignOnIssuerHash;
    }
    /**
     * Gets the trafficRules property value. Traffic rules. This collection can contain a maximum of 1000 elements.
     * @return a vpnTrafficRule
     */
    @javax.annotation.Nullable
    public java.util.List<VpnTrafficRule> getTrafficRules() {
        return this._trafficRules;
    }
    /**
     * Gets the trustedNetworkDomains property value. Trusted Network Domains
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTrustedNetworkDomains() {
        return this._trustedNetworkDomains;
    }
    /**
     * Gets the windowsInformationProtectionDomain property value. Windows Information Protection (WIP) domain to associate with this connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindowsInformationProtectionDomain() {
        return this._windowsInformationProtectionDomain;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAssociatedApps(@javax.annotation.Nullable final java.util.List<Windows10AssociatedApps> value) {
        this._associatedApps = value;
    }
    /**
     * Sets the authenticationMethod property value. Windows 10 VPN connection types.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final Windows10VpnAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the connectionType property value. VPN connection types.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    public void setConnectionType(@javax.annotation.Nullable final Windows10VpnConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the cryptographySuite property value. Cryptography Suite security settings for IKEv2 VPN in Windows10 and above
     * @param value Value to set for the cryptographySuite property.
     * @return a void
     */
    public void setCryptographySuite(@javax.annotation.Nullable final CryptographySuite value) {
        this._cryptographySuite = value;
    }
    /**
     * Sets the dnsRules property value. DNS rules. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the dnsRules property.
     * @return a void
     */
    public void setDnsRules(@javax.annotation.Nullable final java.util.List<VpnDnsRule> value) {
        this._dnsRules = value;
    }
    /**
     * Sets the dnsSuffixes property value. Specify DNS suffixes to add to the DNS search list to properly route short names.
     * @param value Value to set for the dnsSuffixes property.
     * @return a void
     */
    public void setDnsSuffixes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dnsSuffixes = value;
    }
    /**
     * Sets the eapXml property value. Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)
     * @param value Value to set for the eapXml property.
     * @return a void
     */
    public void setEapXml(@javax.annotation.Nullable final byte[] value) {
        this._eapXml = value;
    }
    /**
     * Sets the enableAlwaysOn property value. Enable Always On mode.
     * @param value Value to set for the enableAlwaysOn property.
     * @return a void
     */
    public void setEnableAlwaysOn(@javax.annotation.Nullable final Boolean value) {
        this._enableAlwaysOn = value;
    }
    /**
     * Sets the enableConditionalAccess property value. Enable conditional access.
     * @param value Value to set for the enableConditionalAccess property.
     * @return a void
     */
    public void setEnableConditionalAccess(@javax.annotation.Nullable final Boolean value) {
        this._enableConditionalAccess = value;
    }
    /**
     * Sets the enableDeviceTunnel property value. Enable device tunnel.
     * @param value Value to set for the enableDeviceTunnel property.
     * @return a void
     */
    public void setEnableDeviceTunnel(@javax.annotation.Nullable final Boolean value) {
        this._enableDeviceTunnel = value;
    }
    /**
     * Sets the enableDnsRegistration property value. Enable IP address registration with internal DNS.
     * @param value Value to set for the enableDnsRegistration property.
     * @return a void
     */
    public void setEnableDnsRegistration(@javax.annotation.Nullable final Boolean value) {
        this._enableDnsRegistration = value;
    }
    /**
     * Sets the enableSingleSignOnWithAlternateCertificate property value. Enable single sign-on (SSO) with alternate certificate.
     * @param value Value to set for the enableSingleSignOnWithAlternateCertificate property.
     * @return a void
     */
    public void setEnableSingleSignOnWithAlternateCertificate(@javax.annotation.Nullable final Boolean value) {
        this._enableSingleSignOnWithAlternateCertificate = value;
    }
    /**
     * Sets the enableSplitTunneling property value. Enable split tunneling.
     * @param value Value to set for the enableSplitTunneling property.
     * @return a void
     */
    public void setEnableSplitTunneling(@javax.annotation.Nullable final Boolean value) {
        this._enableSplitTunneling = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    public void setIdentityCertificate(@javax.annotation.Nullable final WindowsCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the microsoftTunnelSiteId property value. ID of the Microsoft Tunnel site associated with the VPN profile.
     * @param value Value to set for the microsoftTunnelSiteId property.
     * @return a void
     */
    public void setMicrosoftTunnelSiteId(@javax.annotation.Nullable final String value) {
        this._microsoftTunnelSiteId = value;
    }
    /**
     * Sets the onlyAssociatedAppsCanUseConnection property value. Only associated Apps can use connection (per-app VPN).
     * @param value Value to set for the onlyAssociatedAppsCanUseConnection property.
     * @return a void
     */
    public void setOnlyAssociatedAppsCanUseConnection(@javax.annotation.Nullable final Boolean value) {
        this._onlyAssociatedAppsCanUseConnection = value;
    }
    /**
     * Sets the profileTarget property value. Profile target type. Possible values are: user, device, autoPilotDevice.
     * @param value Value to set for the profileTarget property.
     * @return a void
     */
    public void setProfileTarget(@javax.annotation.Nullable final Windows10VpnProfileTarget value) {
        this._profileTarget = value;
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    public void setProxyServer(@javax.annotation.Nullable final Windows10VpnProxyServer value) {
        this._proxyServer = value;
    }
    /**
     * Sets the rememberUserCredentials property value. Remember user credentials.
     * @param value Value to set for the rememberUserCredentials property.
     * @return a void
     */
    public void setRememberUserCredentials(@javax.annotation.Nullable final Boolean value) {
        this._rememberUserCredentials = value;
    }
    /**
     * Sets the routes property value. Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the routes property.
     * @return a void
     */
    public void setRoutes(@javax.annotation.Nullable final java.util.List<VpnRoute> value) {
        this._routes = value;
    }
    /**
     * Sets the singleSignOnEku property value. Single sign-on Extended Key Usage (EKU).
     * @param value Value to set for the singleSignOnEku property.
     * @return a void
     */
    public void setSingleSignOnEku(@javax.annotation.Nullable final ExtendedKeyUsage value) {
        this._singleSignOnEku = value;
    }
    /**
     * Sets the singleSignOnIssuerHash property value. Single sign-on issuer hash.
     * @param value Value to set for the singleSignOnIssuerHash property.
     * @return a void
     */
    public void setSingleSignOnIssuerHash(@javax.annotation.Nullable final String value) {
        this._singleSignOnIssuerHash = value;
    }
    /**
     * Sets the trafficRules property value. Traffic rules. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the trafficRules property.
     * @return a void
     */
    public void setTrafficRules(@javax.annotation.Nullable final java.util.List<VpnTrafficRule> value) {
        this._trafficRules = value;
    }
    /**
     * Sets the trustedNetworkDomains property value. Trusted Network Domains
     * @param value Value to set for the trustedNetworkDomains property.
     * @return a void
     */
    public void setTrustedNetworkDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedNetworkDomains = value;
    }
    /**
     * Sets the windowsInformationProtectionDomain property value. Windows Information Protection (WIP) domain to associate with this connection.
     * @param value Value to set for the windowsInformationProtectionDomain property.
     * @return a void
     */
    public void setWindowsInformationProtectionDomain(@javax.annotation.Nullable final String value) {
        this._windowsInformationProtectionDomain = value;
    }
}
