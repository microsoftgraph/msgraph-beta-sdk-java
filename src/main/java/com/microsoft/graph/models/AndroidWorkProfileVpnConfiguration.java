package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileVpnConfiguration extends DeviceConfiguration implements Parsable {
    /** Whether or not to enable always-on VPN connection. */
    private Boolean _alwaysOn;
    /** If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected. */
    private Boolean _alwaysOnLockdown;
    /** VPN Authentication Method. */
    private VpnAuthenticationMethod _authenticationMethod;
    /** Connection name displayed to the user. */
    private String _connectionName;
    /** Android Work Profile VPN connection type. */
    private AndroidWorkProfileVpnConnectionType _connectionType;
    /** Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValue> _customData;
    /** Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValuePair> _customKeyValueData;
    /** Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN. */
    private String _fingerprint;
    /** Identity certificate for client authentication when authentication method is certificate. */
    private AndroidWorkProfileCertificateProfileBase _identityCertificate;
    /** Microsoft Tunnel site ID. */
    private String _microsoftTunnelSiteId;
    /** Proxy server. */
    private VpnProxyServer _proxyServer;
    /** Realm when connection type is set to Pulse Secure. */
    private String _realm;
    /** Role when connection type is set to Pulse Secure. */
    private String _role;
    /** List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. */
    private java.util.List<VpnServer> _servers;
    /** Targeted mobile apps. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _targetedMobileApps;
    /** Targeted App package IDs. */
    private java.util.List<String> _targetedPackageIds;
    /**
     * Instantiates a new AndroidWorkProfileVpnConfiguration and sets the default values.
     * @return a void
     */
    public AndroidWorkProfileVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileVpnConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileVpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileVpnConfiguration();
    }
    /**
     * Gets the alwaysOn property value. Whether or not to enable always-on VPN connection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAlwaysOn() {
        return this._alwaysOn;
    }
    /**
     * Gets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAlwaysOnLockdown() {
        return this._alwaysOnLockdown;
    }
    /**
     * Gets the authenticationMethod property value. VPN Authentication Method.
     * @return a vpnAuthenticationMethod
     */
    @javax.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return this._connectionName;
    }
    /**
     * Gets the connectionType property value. Android Work Profile VPN connection type.
     * @return a androidWorkProfileVpnConnectionType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileVpnConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this._customData;
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this._customKeyValueData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileVpnConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alwaysOn", (n) -> { currentObject.setAlwaysOn(n.getBooleanValue()); });
            this.put("alwaysOnLockdown", (n) -> { currentObject.setAlwaysOnLockdown(n.getBooleanValue()); });
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
            this.put("connectionName", (n) -> { currentObject.setConnectionName(n.getStringValue()); });
            this.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(AndroidWorkProfileVpnConnectionType.class)); });
            this.put("customData", (n) -> { currentObject.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("customKeyValueData", (n) -> { currentObject.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("fingerprint", (n) -> { currentObject.setFingerprint(n.getStringValue()); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelSiteId", (n) -> { currentObject.setMicrosoftTunnelSiteId(n.getStringValue()); });
            this.put("proxyServer", (n) -> { currentObject.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
            this.put("realm", (n) -> { currentObject.setRealm(n.getStringValue()); });
            this.put("role", (n) -> { currentObject.setRole(n.getStringValue()); });
            this.put("servers", (n) -> { currentObject.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
            this.put("targetedMobileApps", (n) -> { currentObject.setTargetedMobileApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("targetedPackageIds", (n) -> { currentObject.setTargetedPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFingerprint() {
        return this._fingerprint;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a androidWorkProfileCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this._microsoftTunnelSiteId;
    }
    /**
     * Gets the proxyServer property value. Proxy server.
     * @return a vpnProxyServer
     */
    @javax.annotation.Nullable
    public VpnProxyServer getProxyServer() {
        return this._proxyServer;
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this._realm;
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this._role;
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a vpnServer
     */
    @javax.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this._servers;
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this._targetedMobileApps;
    }
    /**
     * Gets the targetedPackageIds property value. Targeted App package IDs.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetedPackageIds() {
        return this._targetedPackageIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("alwaysOn", this.getAlwaysOn());
        writer.writeBooleanValue("alwaysOnLockdown", this.getAlwaysOnLockdown());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("connectionName", this.getConnectionName());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeCollectionOfObjectValues("customData", this.getCustomData());
        writer.writeCollectionOfObjectValues("customKeyValueData", this.getCustomKeyValueData());
        writer.writeStringValue("fingerprint", this.getFingerprint());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("microsoftTunnelSiteId", this.getMicrosoftTunnelSiteId());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeStringValue("role", this.getRole());
        writer.writeCollectionOfObjectValues("servers", this.getServers());
        writer.writeCollectionOfObjectValues("targetedMobileApps", this.getTargetedMobileApps());
        writer.writeCollectionOfPrimitiveValues("targetedPackageIds", this.getTargetedPackageIds());
    }
    /**
     * Sets the alwaysOn property value. Whether or not to enable always-on VPN connection.
     * @param value Value to set for the alwaysOn property.
     * @return a void
     */
    public void setAlwaysOn(@javax.annotation.Nullable final Boolean value) {
        this._alwaysOn = value;
    }
    /**
     * Sets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the alwaysOnLockdown property.
     * @return a void
     */
    public void setAlwaysOnLockdown(@javax.annotation.Nullable final Boolean value) {
        this._alwaysOnLockdown = value;
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final VpnAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     * @return a void
     */
    public void setConnectionName(@javax.annotation.Nullable final String value) {
        this._connectionName = value;
    }
    /**
     * Sets the connectionType property value. Android Work Profile VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    public void setConnectionType(@javax.annotation.Nullable final AndroidWorkProfileVpnConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     * @return a void
     */
    public void setCustomData(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._customData = value;
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     * @return a void
     */
    public void setCustomKeyValueData(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._customKeyValueData = value;
    }
    /**
     * Sets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @param value Value to set for the fingerprint property.
     * @return a void
     */
    public void setFingerprint(@javax.annotation.Nullable final String value) {
        this._fingerprint = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     * @return a void
     */
    public void setMicrosoftTunnelSiteId(@javax.annotation.Nullable final String value) {
        this._microsoftTunnelSiteId = value;
    }
    /**
     * Sets the proxyServer property value. Proxy server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    public void setProxyServer(@javax.annotation.Nullable final VpnProxyServer value) {
        this._proxyServer = value;
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     * @return a void
     */
    public void setRealm(@javax.annotation.Nullable final String value) {
        this._realm = value;
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final String value) {
        this._role = value;
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     * @return a void
     */
    public void setServers(@javax.annotation.Nullable final java.util.List<VpnServer> value) {
        this._servers = value;
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     * @return a void
     */
    public void setTargetedMobileApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._targetedMobileApps = value;
    }
    /**
     * Sets the targetedPackageIds property value. Targeted App package IDs.
     * @param value Value to set for the targetedPackageIds property.
     * @return a void
     */
    public void setTargetedPackageIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._targetedPackageIds = value;
    }
}
