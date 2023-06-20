package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleVpnConfiguration extends DeviceConfiguration implements Parsable {
    /** Associated Domains */
    private java.util.List<String> associatedDomains;
    /** VPN Authentication Method. */
    private VpnAuthenticationMethod authenticationMethod;
    /** Connection name displayed to the user. */
    private String connectionName;
    /** Apple VPN connection type. */
    private AppleVpnConnectionType connectionType;
    /** Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValue> customData;
    /** Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValuePair> customKeyValueData;
    /** Toggle to prevent user from disabling automatic VPN in the Settings app */
    private Boolean disableOnDemandUserOverride;
    /** Whether to disconnect after on-demand connection idles */
    private Boolean disconnectOnIdle;
    /** The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535 */
    private Integer disconnectOnIdleTimerInSeconds;
    /** Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device. */
    private Boolean enablePerApp;
    /** Send all network traffic through VPN. */
    private Boolean enableSplitTunneling;
    /** Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated */
    private java.util.List<String> excludedDomains;
    /** Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin */
    private String identifier;
    /** Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. */
    private String loginGroupOrDomain;
    /** On-Demand Rules. This collection can contain a maximum of 500 elements. */
    private java.util.List<VpnOnDemandRule> onDemandRules;
    /** Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation. */
    private Boolean optInToDeviceIdSharing;
    /** Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel. */
    private VpnProviderType providerType;
    /** Proxy Server. */
    private VpnProxyServer proxyServer;
    /** Realm when connection type is set to Pulse Secure. */
    private String realm;
    /** Role when connection type is set to Pulse Secure. */
    private String role;
    /** Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection. */
    private java.util.List<String> safariDomains;
    /** VPN Server definition. */
    private VpnServer server;
    /**
     * Instantiates a new AppleVpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppleVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.appleVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleVpnConfiguration
     */
    @javax.annotation.Nonnull
    public static AppleVpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssociatedDomains() {
        return this.associatedDomains;
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
     * Gets the connectionType property value. Apple VPN connection type.
     * @return a AppleVpnConnectionType
     */
    @javax.annotation.Nullable
    public AppleVpnConnectionType getConnectionType() {
        return this.connectionType;
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.customData;
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.customKeyValueData;
    }
    /**
     * Gets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableOnDemandUserOverride() {
        return this.disableOnDemandUserOverride;
    }
    /**
     * Gets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisconnectOnIdle() {
        return this.disconnectOnIdle;
    }
    /**
     * Gets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisconnectOnIdleTimerInSeconds() {
        return this.disconnectOnIdleTimerInSeconds;
    }
    /**
     * Gets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnablePerApp() {
        return this.enablePerApp;
    }
    /**
     * Gets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this.enableSplitTunneling;
    }
    /**
     * Gets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedDomains() {
        return this.excludedDomains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedDomains", (n) -> { this.setAssociatedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("connectionName", (n) -> { this.setConnectionName(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(AppleVpnConnectionType.class)); });
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
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getEnumValue(VpnProviderType.class)); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("safariDomains", (n) -> { this.setSafariDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("server", (n) -> { this.setServer(n.getObjectValue(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Gets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginGroupOrDomain() {
        return this.loginGroupOrDomain;
    }
    /**
     * Gets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @return a vpnOnDemandRule
     */
    @javax.annotation.Nullable
    public java.util.List<VpnOnDemandRule> getOnDemandRules() {
        return this.onDemandRules;
    }
    /**
     * Gets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOptInToDeviceIdSharing() {
        return this.optInToDeviceIdSharing;
    }
    /**
     * Gets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @return a vpnProviderType
     */
    @javax.annotation.Nullable
    public VpnProviderType getProviderType() {
        return this.providerType;
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
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
     * Gets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSafariDomains() {
        return this.safariDomains;
    }
    /**
     * Gets the server property value. VPN Server definition.
     * @return a VpnServer
     */
    @javax.annotation.Nullable
    public VpnServer getServer() {
        return this.server;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssociatedDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.associatedDomains = value;
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
     * Sets the connectionType property value. Apple VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionType(@javax.annotation.Nullable final AppleVpnConnectionType value) {
        this.connectionType = value;
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomData(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this.customData = value;
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomKeyValueData(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.customKeyValueData = value;
    }
    /**
     * Sets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @param value Value to set for the disableOnDemandUserOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableOnDemandUserOverride(@javax.annotation.Nullable final Boolean value) {
        this.disableOnDemandUserOverride = value;
    }
    /**
     * Sets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @param value Value to set for the disconnectOnIdle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisconnectOnIdle(@javax.annotation.Nullable final Boolean value) {
        this.disconnectOnIdle = value;
    }
    /**
     * Sets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @param value Value to set for the disconnectOnIdleTimerInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisconnectOnIdleTimerInSeconds(@javax.annotation.Nullable final Integer value) {
        this.disconnectOnIdleTimerInSeconds = value;
    }
    /**
     * Sets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @param value Value to set for the enablePerApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnablePerApp(@javax.annotation.Nullable final Boolean value) {
        this.enablePerApp = value;
    }
    /**
     * Sets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @param value Value to set for the enableSplitTunneling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSplitTunneling(@javax.annotation.Nullable final Boolean value) {
        this.enableSplitTunneling = value;
    }
    /**
     * Sets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @param value Value to set for the excludedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludedDomains = value;
    }
    /**
     * Sets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @param value Value to set for the loginGroupOrDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginGroupOrDomain(@javax.annotation.Nullable final String value) {
        this.loginGroupOrDomain = value;
    }
    /**
     * Sets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the onDemandRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnDemandRules(@javax.annotation.Nullable final java.util.List<VpnOnDemandRule> value) {
        this.onDemandRules = value;
    }
    /**
     * Sets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @param value Value to set for the optInToDeviceIdSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptInToDeviceIdSharing(@javax.annotation.Nullable final Boolean value) {
        this.optInToDeviceIdSharing = value;
    }
    /**
     * Sets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @param value Value to set for the providerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderType(@javax.annotation.Nullable final VpnProviderType value) {
        this.providerType = value;
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
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
     * Sets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @param value Value to set for the safariDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.safariDomains = value;
    }
    /**
     * Sets the server property value. VPN Server definition.
     * @param value Value to set for the server property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServer(@javax.annotation.Nullable final VpnServer value) {
        this.server = value;
    }
}
