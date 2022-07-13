package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerVpnConfiguration extends VpnConfiguration implements Parsable {
    /** Whether or not to enable always-on VPN connection. */
    private Boolean _alwaysOn;
    /** If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected. */
    private Boolean _alwaysOnLockdown;
    /** Android VPN connection type. */
    private AndroidVpnConnectionType _connectionType;
    /** Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValue> _customData;
    /** Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements. */
    private java.util.List<KeyValuePair> _customKeyValueData;
    /** Tenant level settings for the Derived Credentials to be used for authentication. */
    private DeviceManagementDerivedCredentialSettings _derivedCredentialSettings;
    /** Identity certificate for client authentication when authentication method is certificate. */
    private AndroidDeviceOwnerCertificateProfileBase _identityCertificate;
    /** Microsoft Tunnel site ID. */
    private String _microsoftTunnelSiteId;
    /** Proxy server. */
    private VpnProxyServer _proxyServer;
    /** Targeted mobile apps. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _targetedMobileApps;
    /** Targeted App package IDs. */
    private java.util.List<String> _targetedPackageIds;
    /**
     * Instantiates a new AndroidDeviceOwnerVpnConfiguration and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerVpnConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerVpnConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerVpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerVpnConfiguration();
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
     * Gets the connectionType property value. Android VPN connection type.
     * @return a androidVpnConnectionType
     */
    @javax.annotation.Nullable
    public AndroidVpnConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the customData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this._customData;
    }
    /**
     * Gets the customKeyValueData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this._customKeyValueData;
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this._derivedCredentialSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerVpnConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alwaysOn", (n) -> { currentObject.setAlwaysOn(n.getBooleanValue()); });
            this.put("alwaysOnLockdown", (n) -> { currentObject.setAlwaysOnLockdown(n.getBooleanValue()); });
            this.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(AndroidVpnConnectionType.class)); });
            this.put("customData", (n) -> { currentObject.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("customKeyValueData", (n) -> { currentObject.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("derivedCredentialSettings", (n) -> { currentObject.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(AndroidDeviceOwnerCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelSiteId", (n) -> { currentObject.setMicrosoftTunnelSiteId(n.getStringValue()); });
            this.put("proxyServer", (n) -> { currentObject.setProxyServer(n.getObjectValue(VpnProxyServer::createFromDiscriminatorValue)); });
            this.put("targetedMobileApps", (n) -> { currentObject.setTargetedMobileApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("targetedPackageIds", (n) -> { currentObject.setTargetedPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a androidDeviceOwnerCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerCertificateProfileBase getIdentityCertificate() {
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
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeCollectionOfObjectValues("customData", this.getCustomData());
        writer.writeCollectionOfObjectValues("customKeyValueData", this.getCustomKeyValueData());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("microsoftTunnelSiteId", this.getMicrosoftTunnelSiteId());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
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
     * Sets the connectionType property value. Android VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    public void setConnectionType(@javax.annotation.Nullable final AndroidVpnConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the customData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     * @return a void
     */
    public void setCustomData(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._customData = value;
    }
    /**
     * Sets the customKeyValueData property value. Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     * @return a void
     */
    public void setCustomKeyValueData(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._customKeyValueData = value;
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     * @return a void
     */
    public void setDerivedCredentialSettings(@javax.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this._derivedCredentialSettings = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidDeviceOwnerCertificateProfileBase value) {
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
