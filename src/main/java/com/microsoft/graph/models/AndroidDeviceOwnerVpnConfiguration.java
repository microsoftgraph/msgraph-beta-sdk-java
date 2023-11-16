package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android Fully Managed device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerVpnConfiguration extends VpnConfiguration implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerVpnConfiguration and sets the default values.
     */
    public AndroidDeviceOwnerVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerVpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerVpnConfiguration();
    }
    /**
     * Gets the alwaysOn property value. Whether or not to enable always-on VPN connection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAlwaysOn() {
        return this.BackingStore.get("alwaysOn");
    }
    /**
     * Gets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAlwaysOnLockdown() {
        return this.BackingStore.get("alwaysOnLockdown");
    }
    /**
     * Gets the connectionType property value. Android VPN connection type.
     * @return a AndroidVpnConnectionType
     */
    @jakarta.annotation.Nullable
    public AndroidVpnConnectionType getConnectionType() {
        return this.BackingStore.get("connectionType");
    }
    /**
     * Gets the customData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.BackingStore.get("customData");
    }
    /**
     * Gets the customKeyValueData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.BackingStore.get("customKeyValueData");
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a DeviceManagementDerivedCredentialSettings
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.BackingStore.get("derivedCredentialSettings");
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
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(AndroidVpnConnectionType.class)); });
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("customKeyValueData", (n) -> { this.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidDeviceOwnerCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSiteId", (n) -> { this.setMicrosoftTunnelSiteId(n.getStringValue()); });
        deserializerMap.put("proxyExclusionList", (n) -> { this.setProxyExclusionList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedMobileApps", (n) -> { this.setTargetedMobileApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedPackageIds", (n) -> { this.setTargetedPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a AndroidDeviceOwnerCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerCertificateProfileBase getIdentityCertificate() {
        return this.BackingStore.get("identityCertificate");
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this.BackingStore.get("microsoftTunnelSiteId");
    }
    /**
     * Gets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProxyExclusionList() {
        return this.BackingStore.get("proxyExclusionList");
    }
    /**
     * Gets the proxyServer property value. Proxy server.
     * @return a VpnProxyServer
     */
    @jakarta.annotation.Nullable
    public VpnProxyServer getProxyServer() {
        return this.BackingStore.get("proxyServer");
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this.BackingStore.get("targetedMobileApps");
    }
    /**
     * Gets the targetedPackageIds property value. Targeted App package IDs.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetedPackageIds() {
        return this.BackingStore.get("targetedPackageIds");
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
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeCollectionOfObjectValues("customData", this.getCustomData());
        writer.writeCollectionOfObjectValues("customKeyValueData", this.getCustomKeyValueData());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("microsoftTunnelSiteId", this.getMicrosoftTunnelSiteId());
        writer.writeCollectionOfPrimitiveValues("proxyExclusionList", this.getProxyExclusionList());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
        writer.writeCollectionOfObjectValues("targetedMobileApps", this.getTargetedMobileApps());
        writer.writeCollectionOfPrimitiveValues("targetedPackageIds", this.getTargetedPackageIds());
    }
    /**
     * Sets the alwaysOn property value. Whether or not to enable always-on VPN connection.
     * @param value Value to set for the alwaysOn property.
     */
    public void setAlwaysOn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("alwaysOn", value);
    }
    /**
     * Sets the alwaysOnLockdown property value. If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the alwaysOnLockdown property.
     */
    public void setAlwaysOnLockdown(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("alwaysOnLockdown", value);
    }
    /**
     * Sets the connectionType property value. Android VPN connection type.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final AndroidVpnConnectionType value) {
        this.BackingStore.set("connectionType", value);
    }
    /**
     * Sets the customData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.BackingStore.set("customData", value);
    }
    /**
     * Sets the customKeyValueData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     */
    public void setCustomKeyValueData(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.BackingStore.set("customKeyValueData", value);
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.BackingStore.set("derivedCredentialSettings", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidDeviceOwnerCertificateProfileBase value) {
        this.BackingStore.set("identityCertificate", value);
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     */
    public void setMicrosoftTunnelSiteId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("microsoftTunnelSiteId", value);
    }
    /**
     * Sets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @param value Value to set for the proxyExclusionList property.
     */
    public void setProxyExclusionList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("proxyExclusionList", value);
    }
    /**
     * Sets the proxyServer property value. Proxy server.
     * @param value Value to set for the proxyServer property.
     */
    public void setProxyServer(@jakarta.annotation.Nullable final VpnProxyServer value) {
        this.BackingStore.set("proxyServer", value);
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     */
    public void setTargetedMobileApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.BackingStore.set("targetedMobileApps", value);
    }
    /**
     * Sets the targetedPackageIds property value. Targeted App package IDs.
     * @param value Value to set for the targetedPackageIds property.
     */
    public void setTargetedPackageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("targetedPackageIds", value);
    }
}
