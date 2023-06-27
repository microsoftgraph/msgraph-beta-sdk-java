package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileVpnConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Whether or not to enable always-on VPN connection.
     */
    private Boolean alwaysOn;
    /**
     * If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     */
    private Boolean alwaysOnLockdown;
    /**
     * VPN Authentication Method.
     */
    private VpnAuthenticationMethod authenticationMethod;
    /**
     * Connection name displayed to the user.
     */
    private String connectionName;
    /**
     * Android Work Profile VPN connection type.
     */
    private AndroidWorkProfileVpnConnectionType connectionType;
    /**
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    private java.util.List<KeyValue> customData;
    /**
     * Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     */
    private java.util.List<KeyValuePair> customKeyValueData;
    /**
     * Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     */
    private String fingerprint;
    /**
     * Identity certificate for client authentication when authentication method is certificate.
     */
    private AndroidWorkProfileCertificateProfileBase identityCertificate;
    /**
     * Microsoft Tunnel site ID.
     */
    private String microsoftTunnelSiteId;
    /**
     * Proxy server.
     */
    private VpnProxyServer proxyServer;
    /**
     * Realm when connection type is set to Pulse Secure.
     */
    private String realm;
    /**
     * Role when connection type is set to Pulse Secure.
     */
    private String role;
    /**
     * List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<VpnServer> servers;
    /**
     * Targeted mobile apps. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<AppListItem> targetedMobileApps;
    /**
     * Targeted App package IDs.
     */
    private java.util.List<String> targetedPackageIds;
    /**
     * Instantiates a new AndroidWorkProfileVpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.alwaysOn;
    }
    /**
     * Gets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAlwaysOnLockdown() {
        return this.alwaysOnLockdown;
    }
    /**
     * Gets the authenticationMethod property value. VPN Authentication Method.
     * @return a VpnAuthenticationMethod
     */
    @javax.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return this.connectionName;
    }
    /**
     * Gets the connectionType property value. Android Work Profile VPN connection type.
     * @return a AndroidWorkProfileVpnConnectionType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileVpnConnectionType getConnectionType() {
        return this.connectionType;
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.customData;
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.customKeyValueData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alwaysOn", (n) -> { this.setAlwaysOn(n.getBooleanValue()); });
        deserializerMap.put("alwaysOnLockdown", (n) -> { this.setAlwaysOnLockdown(n.getBooleanValue()); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("connectionName", (n) -> { this.setConnectionName(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(AndroidWorkProfileVpnConnectionType.class)); });
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("customKeyValueData", (n) -> { this.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("fingerprint", (n) -> { this.setFingerprint(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSiteId", (n) -> { this.setMicrosoftTunnelSiteId(n.getStringValue()); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { this.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedMobileApps", (n) -> { this.setTargetedMobileApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedPackageIds", (n) -> { this.setTargetedPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a androidWorkProfileCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificate() {
        return this.identityCertificate;
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this.microsoftTunnelSiteId;
    }
    /**
     * Gets the proxyServer property value. Proxy server.
     * @return a vpnProxyServer
     */
    @javax.annotation.Nullable
    public VpnProxyServer getProxyServer() {
        return this.proxyServer;
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this.realm;
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a VpnServer
     */
    @javax.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this.servers;
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this.targetedMobileApps;
    }
    /**
     * Gets the targetedPackageIds property value. Targeted App package IDs.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetedPackageIds() {
        return this.targetedPackageIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAlwaysOn(@javax.annotation.Nullable final Boolean value) {
        this.alwaysOn = value;
    }
    /**
     * Sets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the alwaysOnLockdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlwaysOnLockdown(@javax.annotation.Nullable final Boolean value) {
        this.alwaysOnLockdown = value;
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final VpnAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionName(@javax.annotation.Nullable final String value) {
        this.connectionName = value;
    }
    /**
     * Sets the connectionType property value. Android Work Profile VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionType(@javax.annotation.Nullable final AndroidWorkProfileVpnConnectionType value) {
        this.connectionType = value;
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomData(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this.customData = value;
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomKeyValueData(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.customKeyValueData = value;
    }
    /**
     * Sets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @param value Value to set for the fingerprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFingerprint(@javax.annotation.Nullable final String value) {
        this.fingerprint = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this.identityCertificate = value;
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelSiteId(@javax.annotation.Nullable final String value) {
        this.microsoftTunnelSiteId = value;
    }
    /**
     * Sets the proxyServer property value. Proxy server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyServer(@javax.annotation.Nullable final VpnProxyServer value) {
        this.proxyServer = value;
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealm(@javax.annotation.Nullable final String value) {
        this.realm = value;
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServers(@javax.annotation.Nullable final java.util.List<VpnServer> value) {
        this.servers = value;
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedMobileApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.targetedMobileApps = value;
    }
    /**
     * Sets the targetedPackageIds property value. Targeted App package IDs.
     * @param value Value to set for the targetedPackageIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedPackageIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.targetedPackageIds = value;
    }
}
