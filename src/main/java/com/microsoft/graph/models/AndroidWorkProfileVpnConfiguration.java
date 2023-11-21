package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWorkProfileVpnConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AndroidWorkProfileVpnConfiguration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileVpnConfiguration();
    }
    /**
     * Gets the alwaysOn property value. Whether or not to enable always-on VPN connection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAlwaysOn() {
        return this.backingStore.get("alwaysOn");
    }
    /**
     * Gets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAlwaysOnLockdown() {
        return this.backingStore.get("alwaysOnLockdown");
    }
    /**
     * Gets the authenticationMethod property value. VPN Authentication Method.
     * @return a VpnAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionName() {
        return this.backingStore.get("connectionName");
    }
    /**
     * Gets the connectionType property value. Android Work Profile VPN connection type.
     * @return a AndroidWorkProfileVpnConnectionType
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileVpnConnectionType getConnectionType() {
        return this.backingStore.get("connectionType");
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.backingStore.get("customData");
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.backingStore.get("customKeyValueData");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("proxyExclusionList", (n) -> { this.setProxyExclusionList(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFingerprint() {
        return this.backingStore.get("fingerprint");
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a AndroidWorkProfileCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this.backingStore.get("microsoftTunnelSiteId");
    }
    /**
     * Gets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProxyExclusionList() {
        return this.backingStore.get("proxyExclusionList");
    }
    /**
     * Gets the proxyServer property value. Proxy server.
     * @return a VpnProxyServer
     */
    @jakarta.annotation.Nullable
    public VpnProxyServer getProxyServer() {
        return this.backingStore.get("proxyServer");
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.backingStore.get("realm");
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<VpnServer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this.backingStore.get("servers");
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this.backingStore.get("targetedMobileApps");
    }
    /**
     * Gets the targetedPackageIds property value. Targeted App package IDs.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetedPackageIds() {
        return this.backingStore.get("targetedPackageIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfPrimitiveValues("proxyExclusionList", this.getProxyExclusionList());
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
     */
    public void setAlwaysOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("alwaysOn", value);
    }
    /**
     * Sets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the alwaysOnLockdown property.
     */
    public void setAlwaysOnLockdown(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("alwaysOnLockdown", value);
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final VpnAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     */
    public void setConnectionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectionName", value);
    }
    /**
     * Sets the connectionType property value. Android Work Profile VPN connection type.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final AndroidWorkProfileVpnConnectionType value) {
        this.backingStore.set("connectionType", value);
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("customData", value);
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     */
    public void setCustomKeyValueData(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("customKeyValueData", value);
    }
    /**
     * Sets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @param value Value to set for the fingerprint property.
     */
    public void setFingerprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fingerprint", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     */
    public void setMicrosoftTunnelSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("microsoftTunnelSiteId", value);
    }
    /**
     * Sets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @param value Value to set for the proxyExclusionList property.
     */
    public void setProxyExclusionList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("proxyExclusionList", value);
    }
    /**
     * Sets the proxyServer property value. Proxy server.
     * @param value Value to set for the proxyServer property.
     */
    public void setProxyServer(@jakarta.annotation.Nullable final VpnProxyServer value) {
        this.backingStore.set("proxyServer", value);
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("realm", value);
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     */
    public void setServers(@jakarta.annotation.Nullable final java.util.List<VpnServer> value) {
        this.backingStore.set("servers", value);
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     */
    public void setTargetedMobileApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("targetedMobileApps", value);
    }
    /**
     * Sets the targetedPackageIds property value. Targeted App package IDs.
     * @param value Value to set for the targetedPackageIds property.
     */
    public void setTargetedPackageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("targetedPackageIds", value);
    }
}
