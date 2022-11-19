package com.microsoft.graph.models;

import com.microsoft.graph.models.IosikEv2VpnConfiguration;
import com.microsoft.graph.models.IosVpnConfiguration;
import com.microsoft.graph.models.MacOSVpnConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleVpnConfiguration extends DeviceConfiguration implements Parsable {
    /** Associated Domains */
    private java.util.List<String> _associatedDomains;
    /** VPN Authentication Method. */
    private VpnAuthenticationMethod _authenticationMethod;
    /** Connection name displayed to the user. */
    private String _connectionName;
    /** Apple VPN connection type. */
    private AppleVpnConnectionType _connectionType;
    /** Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValue> _customData;
    /** Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValuePair> _customKeyValueData;
    /** Toggle to prevent user from disabling automatic VPN in the Settings app */
    private Boolean _disableOnDemandUserOverride;
    /** Whether to disconnect after on-demand connection idles */
    private Boolean _disconnectOnIdle;
    /** The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535 */
    private Integer _disconnectOnIdleTimerInSeconds;
    /** Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device. */
    private Boolean _enablePerApp;
    /** Send all network traffic through VPN. */
    private Boolean _enableSplitTunneling;
    /** Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated */
    private java.util.List<String> _excludedDomains;
    /** Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin */
    private String _identifier;
    /** Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. */
    private String _loginGroupOrDomain;
    /** On-Demand Rules. This collection can contain a maximum of 500 elements. */
    private java.util.List<VpnOnDemandRule> _onDemandRules;
    /** Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation. */
    private Boolean _optInToDeviceIdSharing;
    /** Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel. */
    private VpnProviderType _providerType;
    /** Proxy Server. */
    private VpnProxyServer _proxyServer;
    /** Realm when connection type is set to Pulse Secure. */
    private String _realm;
    /** Role when connection type is set to Pulse Secure. */
    private String _role;
    /** Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection. */
    private java.util.List<String> _safariDomains;
    /** VPN Server definition. */
    private VpnServer _server;
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
        return this._associatedDomains;
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
     * Gets the connectionType property value. Apple VPN connection type.
     * @return a appleVpnConnectionType
     */
    @javax.annotation.Nullable
    public AppleVpnConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this._customData;
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this._customKeyValueData;
    }
    /**
     * Gets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableOnDemandUserOverride() {
        return this._disableOnDemandUserOverride;
    }
    /**
     * Gets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisconnectOnIdle() {
        return this._disconnectOnIdle;
    }
    /**
     * Gets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisconnectOnIdleTimerInSeconds() {
        return this._disconnectOnIdleTimerInSeconds;
    }
    /**
     * Gets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnablePerApp() {
        return this._enablePerApp;
    }
    /**
     * Gets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this._enableSplitTunneling;
    }
    /**
     * Gets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedDomains() {
        return this._excludedDomains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleVpnConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedDomains", (n) -> { currentObject.setAssociatedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("connectionName", (n) -> { currentObject.setConnectionName(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(AppleVpnConnectionType.class)); });
        deserializerMap.put("customData", (n) -> { currentObject.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("customKeyValueData", (n) -> { currentObject.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("disableOnDemandUserOverride", (n) -> { currentObject.setDisableOnDemandUserOverride(n.getBooleanValue()); });
        deserializerMap.put("disconnectOnIdle", (n) -> { currentObject.setDisconnectOnIdle(n.getBooleanValue()); });
        deserializerMap.put("disconnectOnIdleTimerInSeconds", (n) -> { currentObject.setDisconnectOnIdleTimerInSeconds(n.getIntegerValue()); });
        deserializerMap.put("enablePerApp", (n) -> { currentObject.setEnablePerApp(n.getBooleanValue()); });
        deserializerMap.put("enableSplitTunneling", (n) -> { currentObject.setEnableSplitTunneling(n.getBooleanValue()); });
        deserializerMap.put("excludedDomains", (n) -> { currentObject.setExcludedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identifier", (n) -> { currentObject.setIdentifier(n.getStringValue()); });
        deserializerMap.put("loginGroupOrDomain", (n) -> { currentObject.setLoginGroupOrDomain(n.getStringValue()); });
        deserializerMap.put("onDemandRules", (n) -> { currentObject.setOnDemandRules(n.getCollectionOfObjectValues(VpnOnDemandRule::createFromDiscriminatorValue)); });
        deserializerMap.put("optInToDeviceIdSharing", (n) -> { currentObject.setOptInToDeviceIdSharing(n.getBooleanValue()); });
        deserializerMap.put("providerType", (n) -> { currentObject.setProviderType(n.getEnumValue(VpnProviderType.class)); });
        deserializerMap.put("proxyServer", (n) -> { currentObject.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("realm", (n) -> { currentObject.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { currentObject.setRole(n.getStringValue()); });
        deserializerMap.put("safariDomains", (n) -> { currentObject.setSafariDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("server", (n) -> { currentObject.setServer(n.getObjectValue(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this._identifier;
    }
    /**
     * Gets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginGroupOrDomain() {
        return this._loginGroupOrDomain;
    }
    /**
     * Gets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @return a vpnOnDemandRule
     */
    @javax.annotation.Nullable
    public java.util.List<VpnOnDemandRule> getOnDemandRules() {
        return this._onDemandRules;
    }
    /**
     * Gets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOptInToDeviceIdSharing() {
        return this._optInToDeviceIdSharing;
    }
    /**
     * Gets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @return a vpnProviderType
     */
    @javax.annotation.Nullable
    public VpnProviderType getProviderType() {
        return this._providerType;
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
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
     * Gets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSafariDomains() {
        return this._safariDomains;
    }
    /**
     * Gets the server property value. VPN Server definition.
     * @return a vpnServer
     */
    @javax.annotation.Nullable
    public VpnServer getServer() {
        return this._server;
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
        this._associatedDomains = value;
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final VpnAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionName(@javax.annotation.Nullable final String value) {
        this._connectionName = value;
    }
    /**
     * Sets the connectionType property value. Apple VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionType(@javax.annotation.Nullable final AppleVpnConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomData(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._customData = value;
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomKeyValueData(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._customKeyValueData = value;
    }
    /**
     * Sets the disableOnDemandUserOverride property value. Toggle to prevent user from disabling automatic VPN in the Settings app
     * @param value Value to set for the disableOnDemandUserOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableOnDemandUserOverride(@javax.annotation.Nullable final Boolean value) {
        this._disableOnDemandUserOverride = value;
    }
    /**
     * Sets the disconnectOnIdle property value. Whether to disconnect after on-demand connection idles
     * @param value Value to set for the disconnectOnIdle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisconnectOnIdle(@javax.annotation.Nullable final Boolean value) {
        this._disconnectOnIdle = value;
    }
    /**
     * Sets the disconnectOnIdleTimerInSeconds property value. The length of time in seconds to wait before disconnecting an on-demand connection. Valid values 0 to 65535
     * @param value Value to set for the disconnectOnIdleTimerInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisconnectOnIdleTimerInSeconds(@javax.annotation.Nullable final Integer value) {
        this._disconnectOnIdleTimerInSeconds = value;
    }
    /**
     * Sets the enablePerApp property value. Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device.
     * @param value Value to set for the enablePerApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnablePerApp(@javax.annotation.Nullable final Boolean value) {
        this._enablePerApp = value;
    }
    /**
     * Sets the enableSplitTunneling property value. Send all network traffic through VPN.
     * @param value Value to set for the enableSplitTunneling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSplitTunneling(@javax.annotation.Nullable final Boolean value) {
        this._enableSplitTunneling = value;
    }
    /**
     * Sets the excludedDomains property value. Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated
     * @param value Value to set for the excludedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedDomains = value;
    }
    /**
     * Sets the identifier property value. Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this._identifier = value;
    }
    /**
     * Sets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @param value Value to set for the loginGroupOrDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginGroupOrDomain(@javax.annotation.Nullable final String value) {
        this._loginGroupOrDomain = value;
    }
    /**
     * Sets the onDemandRules property value. On-Demand Rules. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the onDemandRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnDemandRules(@javax.annotation.Nullable final java.util.List<VpnOnDemandRule> value) {
        this._onDemandRules = value;
    }
    /**
     * Sets the optInToDeviceIdSharing property value. Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation.
     * @param value Value to set for the optInToDeviceIdSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptInToDeviceIdSharing(@javax.annotation.Nullable final Boolean value) {
        this._optInToDeviceIdSharing = value;
    }
    /**
     * Sets the providerType property value. Provider type for per-app VPN. Possible values are: notConfigured, appProxy, packetTunnel.
     * @param value Value to set for the providerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderType(@javax.annotation.Nullable final VpnProviderType value) {
        this._providerType = value;
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyServer(@javax.annotation.Nullable final VpnProxyServer value) {
        this._proxyServer = value;
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealm(@javax.annotation.Nullable final String value) {
        this._realm = value;
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final String value) {
        this._role = value;
    }
    /**
     * Sets the safariDomains property value. Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection.
     * @param value Value to set for the safariDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._safariDomains = value;
    }
    /**
     * Sets the server property value. VPN Server definition.
     * @param value Value to set for the server property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServer(@javax.annotation.Nullable final VpnServer value) {
        this._server = value;
    }
}
