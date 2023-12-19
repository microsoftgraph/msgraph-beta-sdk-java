package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Apple VPN configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleVpnConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AppleVpnConfiguration and sets the default values.
     */
    public AppleVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.appleVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleVpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AppleVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosikEv2VpnConfiguration": return new IosikEv2VpnConfiguration();
                case "#microsoft.graph.iosVpnConfiguration": return new IosVpnConfiguration();
                case "#microsoft.graph.macOSVpnConfiguration": return new MacOSVpnConfiguration();
            }
        }
        return new AppleVpnConfiguration();
    }
    /**
     * Gets the associatedDomains property value. Associated Domains
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedDomains() {
        return this.backingStore.get("associatedDomains");
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
     * Gets the connectionType property value. Apple VPN connection type.
     * @return a AppleVpnConnectionType
     */
    @jakarta.annotation.Nullable
    public AppleVpnConnectionType getConnectionType() {
        return this.backingStore.get("connectionType");
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.backingStore.get("customData");
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.backingStore.get("customKeyValueData");
    }
    /**
     * Gets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableOnDemandUserOverride() {
        return this.backingStore.get("disableOnDemandUserOverride");
    }
    /**
     * Gets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisconnectOnIdle() {
        return this.backingStore.get("disconnectOnIdle");
    }
    /**
     * Gets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDisconnectOnIdleTimerInSeconds() {
        return this.backingStore.get("disconnectOnIdleTimerInSeconds");
    }
    /**
     * Gets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnablePerApp() {
        return this.backingStore.get("enablePerApp");
    }
    /**
     * Gets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this.backingStore.get("enableSplitTunneling");
    }
    /**
     * Gets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedDomains() {
        return this.backingStore.get("excludedDomains");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedDomains", (n) -> { this.setAssociatedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod::forValue)); });
        deserializerMap.put("connectionName", (n) -> { this.setConnectionName(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(AppleVpnConnectionType::forValue)); });
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("customKeyValueData", (n) -> { this.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("disableOnDemandUserOverride", (n) -> { this.setDisableOnDemandUserOverride(n.getBooleanValue()); });
        deserializerMap.put("disconnectOnIdle", (n) -> { this.setDisconnectOnIdle(n.getBooleanValue()); });
        deserializerMap.put("disconnectOnIdleTimerInSeconds", (n) -> { this.setDisconnectOnIdleTimerInSeconds(n.getIntegerValue()); });
        deserializerMap.put("enablePerApp", (n) -> { this.setEnablePerApp(n.getBooleanValue()); });
        deserializerMap.put("enableSplitTunneling", (n) -> { this.setEnableSplitTunneling(n.getBooleanValue()); });
        deserializerMap.put("excludedDomains", (n) -> { this.setExcludedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("loginGroupOrDomain", (n) -> { this.setLoginGroupOrDomain(n.getStringValue()); });
        deserializerMap.put("onDemandRules", (n) -> { this.setOnDemandRules(n.getCollectionOfObjectValues(VpnOnDemandRule::createFromDiscriminatorValue)); });
        deserializerMap.put("optInToDeviceIdSharing", (n) -> { this.setOptInToDeviceIdSharing(n.getBooleanValue()); });
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getEnumValue(AppleVpnConfigurationProviderType::forValue)); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("safariDomains", (n) -> { this.setSafariDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("server", (n) -> { this.setServer(n.getObjectValue(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLoginGroupOrDomain() {
        return this.backingStore.get("loginGroupOrDomain");
    }
    /**
     * Gets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<VpnOnDemandRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnOnDemandRule> getOnDemandRules() {
        return this.backingStore.get("onDemandRules");
    }
    /**
     * Gets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOptInToDeviceIdSharing() {
        return this.backingStore.get("optInToDeviceIdSharing");
    }
    /**
     * Gets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @return a AppleVpnConfigurationProviderType
     */
    @jakarta.annotation.Nullable
    public AppleVpnConfigurationProviderType getProviderType() {
        return this.backingStore.get("providerType");
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
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
     * Gets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSafariDomains() {
        return this.backingStore.get("safariDomains");
    }
    /**
     * Gets the server property value. VPN Server definition.
     * @return a VpnServer
     */
    @jakarta.annotation.Nullable
    public VpnServer getServer() {
        return this.backingStore.get("server");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("associatedDomains", this.getAssociatedDomains());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("connectionName", this.getConnectionName());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeCollectionOfObjectValues("customData", this.getCustomData());
        writer.writeCollectionOfObjectValues("customKeyValueData", this.getCustomKeyValueData());
        writer.writeBooleanValue("disableOnDemandUserOverride", this.getDisableOnDemandUserOverride());
        writer.writeBooleanValue("disconnectOnIdle", this.getDisconnectOnIdle());
        writer.writeIntegerValue("disconnectOnIdleTimerInSeconds", this.getDisconnectOnIdleTimerInSeconds());
        writer.writeBooleanValue("enablePerApp", this.getEnablePerApp());
        writer.writeBooleanValue("enableSplitTunneling", this.getEnableSplitTunneling());
        writer.writeCollectionOfPrimitiveValues("excludedDomains", this.getExcludedDomains());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("loginGroupOrDomain", this.getLoginGroupOrDomain());
        writer.writeCollectionOfObjectValues("onDemandRules", this.getOnDemandRules());
        writer.writeBooleanValue("optInToDeviceIdSharing", this.getOptInToDeviceIdSharing());
        writer.writeEnumValue("providerType", this.getProviderType());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeStringValue("role", this.getRole());
        writer.writeCollectionOfPrimitiveValues("safariDomains", this.getSafariDomains());
        writer.writeObjectValue("server", this.getServer());
    }
    /**
     * Sets the associatedDomains property value. Associated Domains
     * @param value Value to set for the associatedDomains property.
     */
    public void setAssociatedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedDomains", value);
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
     * Sets the connectionType property value. Apple VPN connection type.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final AppleVpnConnectionType value) {
        this.backingStore.set("connectionType", value);
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("customData", value);
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     */
    public void setCustomKeyValueData(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("customKeyValueData", value);
    }
    /**
     * Sets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @param value Value to set for the disableOnDemandUserOverride property.
     */
    public void setDisableOnDemandUserOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableOnDemandUserOverride", value);
    }
    /**
     * Sets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @param value Value to set for the disconnectOnIdle property.
     */
    public void setDisconnectOnIdle(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disconnectOnIdle", value);
    }
    /**
     * Sets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @param value Value to set for the disconnectOnIdleTimerInSeconds property.
     */
    public void setDisconnectOnIdleTimerInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("disconnectOnIdleTimerInSeconds", value);
    }
    /**
     * Sets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @param value Value to set for the enablePerApp property.
     */
    public void setEnablePerApp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enablePerApp", value);
    }
    /**
     * Sets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @param value Value to set for the enableSplitTunneling property.
     */
    public void setEnableSplitTunneling(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSplitTunneling", value);
    }
    /**
     * Sets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @param value Value to set for the excludedDomains property.
     */
    public void setExcludedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludedDomains", value);
    }
    /**
     * Sets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @param value Value to set for the loginGroupOrDomain property.
     */
    public void setLoginGroupOrDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("loginGroupOrDomain", value);
    }
    /**
     * Sets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the onDemandRules property.
     */
    public void setOnDemandRules(@jakarta.annotation.Nullable final java.util.List<VpnOnDemandRule> value) {
        this.backingStore.set("onDemandRules", value);
    }
    /**
     * Sets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @param value Value to set for the optInToDeviceIdSharing property.
     */
    public void setOptInToDeviceIdSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("optInToDeviceIdSharing", value);
    }
    /**
     * Sets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @param value Value to set for the providerType property.
     */
    public void setProviderType(@jakarta.annotation.Nullable final AppleVpnConfigurationProviderType value) {
        this.backingStore.set("providerType", value);
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
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
     * Sets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @param value Value to set for the safariDomains property.
     */
    public void setSafariDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("safariDomains", value);
    }
    /**
     * Sets the server property value. VPN Server definition.
     * @param value Value to set for the server property.
     */
    public void setServer(@jakarta.annotation.Nullable final VpnServer value) {
        this.backingStore.set("server", value);
    }
}
