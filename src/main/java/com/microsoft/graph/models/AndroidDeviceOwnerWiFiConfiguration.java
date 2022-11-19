package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidDeviceOwnerEnterpriseWiFiConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /** Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. */
    private Boolean _connectAutomatically;
    /** When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. */
    private Boolean _connectWhenNetworkNameIsHidden;
    /** Network Name */
    private String _networkName;
    /** This is the pre-shared key for WPA Personal Wi-Fi network. */
    private String _preSharedKey;
    /** This is the pre-shared key for WPA Personal Wi-Fi network. */
    private Boolean _preSharedKeyIsSet;
    /** Specify the proxy server configuration script URL. */
    private String _proxyAutomaticConfigurationUrl;
    /** List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com. */
    private String _proxyExclusionList;
    /** Specify the proxy server IP address. Android documentation does not specify IPv4 or IPv6. For example: 192.168.1.1. */
    private String _proxyManualAddress;
    /** Specify the proxy server port. */
    private Integer _proxyManualPort;
    /** Wi-Fi Proxy Settings. */
    private WiFiProxySetting _proxySettings;
    /** This is the name of the Wi-Fi network that is broadcast to all devices. */
    private String _ssid;
    /** Wi-Fi Security Types for Android Device Owner. */
    private AndroidDeviceOwnerWiFiSecurityType _wiFiSecurityType;
    /**
     * Instantiates a new AndroidDeviceOwnerWiFiConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration": return new AndroidDeviceOwnerEnterpriseWiFiConfiguration();
            }
        }
        return new AndroidDeviceOwnerWiFiConfiguration();
    }
    /**
     * Gets the connectAutomatically property value. Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this._connectAutomatically;
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this._connectWhenNetworkNameIsHidden;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerWiFiConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectAutomatically", (n) -> { currentObject.setConnectAutomatically(n.getBooleanValue()); });
        deserializerMap.put("connectWhenNetworkNameIsHidden", (n) -> { currentObject.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
        deserializerMap.put("networkName", (n) -> { currentObject.setNetworkName(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { currentObject.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("preSharedKeyIsSet", (n) -> { currentObject.setPreSharedKeyIsSet(n.getBooleanValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { currentObject.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxyExclusionList", (n) -> { currentObject.setProxyExclusionList(n.getStringValue()); });
        deserializerMap.put("proxyManualAddress", (n) -> { currentObject.setProxyManualAddress(n.getStringValue()); });
        deserializerMap.put("proxyManualPort", (n) -> { currentObject.setProxyManualPort(n.getIntegerValue()); });
        deserializerMap.put("proxySettings", (n) -> { currentObject.setProxySettings(n.getEnumValue(WiFiProxySetting.class)); });
        deserializerMap.put("ssid", (n) -> { currentObject.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { currentObject.setWiFiSecurityType(n.getEnumValue(AndroidDeviceOwnerWiFiSecurityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkName() {
        return this._networkName;
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreSharedKey() {
        return this._preSharedKey;
    }
    /**
     * Gets the preSharedKeyIsSet property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreSharedKeyIsSet() {
        return this._preSharedKeyIsSet;
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. Specify the proxy server configuration script URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this._proxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyExclusionList() {
        return this._proxyExclusionList;
    }
    /**
     * Gets the proxyManualAddress property value. Specify the proxy server IP address. Android documentation does not specify IPv4 or IPv6. For example: 192.168.1.1.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyManualAddress() {
        return this._proxyManualAddress;
    }
    /**
     * Gets the proxyManualPort property value. Specify the proxy server port.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProxyManualPort() {
        return this._proxyManualPort;
    }
    /**
     * Gets the proxySettings property value. Wi-Fi Proxy Settings.
     * @return a wiFiProxySetting
     */
    @javax.annotation.Nullable
    public WiFiProxySetting getProxySettings() {
        return this._proxySettings;
    }
    /**
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSsid() {
        return this._ssid;
    }
    /**
     * Gets the wiFiSecurityType property value. Wi-Fi Security Types for Android Device Owner.
     * @return a androidDeviceOwnerWiFiSecurityType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerWiFiSecurityType getWiFiSecurityType() {
        return this._wiFiSecurityType;
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
        writer.writeBooleanValue("connectAutomatically", this.getConnectAutomatically());
        writer.writeBooleanValue("connectWhenNetworkNameIsHidden", this.getConnectWhenNetworkNameIsHidden());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeStringValue("preSharedKey", this.getPreSharedKey());
        writer.writeBooleanValue("preSharedKeyIsSet", this.getPreSharedKeyIsSet());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
        writer.writeStringValue("proxyExclusionList", this.getProxyExclusionList());
        writer.writeStringValue("proxyManualAddress", this.getProxyManualAddress());
        writer.writeIntegerValue("proxyManualPort", this.getProxyManualPort());
        writer.writeEnumValue("proxySettings", this.getProxySettings());
        writer.writeStringValue("ssid", this.getSsid());
        writer.writeEnumValue("wiFiSecurityType", this.getWiFiSecurityType());
    }
    /**
     * Sets the connectAutomatically property value. Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     * @param value Value to set for the connectAutomatically property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectAutomatically(@javax.annotation.Nullable final Boolean value) {
        this._connectAutomatically = value;
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectWhenNetworkNameIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._connectWhenNetworkNameIsHidden = value;
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkName(@javax.annotation.Nullable final String value) {
        this._networkName = value;
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreSharedKey(@javax.annotation.Nullable final String value) {
        this._preSharedKey = value;
    }
    /**
     * Sets the preSharedKeyIsSet property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKeyIsSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreSharedKeyIsSet(@javax.annotation.Nullable final Boolean value) {
        this._preSharedKeyIsSet = value;
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. Specify the proxy server configuration script URL.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._proxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @param value Value to set for the proxyExclusionList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyExclusionList(@javax.annotation.Nullable final String value) {
        this._proxyExclusionList = value;
    }
    /**
     * Sets the proxyManualAddress property value. Specify the proxy server IP address. Android documentation does not specify IPv4 or IPv6. For example: 192.168.1.1.
     * @param value Value to set for the proxyManualAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyManualAddress(@javax.annotation.Nullable final String value) {
        this._proxyManualAddress = value;
    }
    /**
     * Sets the proxyManualPort property value. Specify the proxy server port.
     * @param value Value to set for the proxyManualPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyManualPort(@javax.annotation.Nullable final Integer value) {
        this._proxyManualPort = value;
    }
    /**
     * Sets the proxySettings property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxySettings(@javax.annotation.Nullable final WiFiProxySetting value) {
        this._proxySettings = value;
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsid(@javax.annotation.Nullable final String value) {
        this._ssid = value;
    }
    /**
     * Sets the wiFiSecurityType property value. Wi-Fi Security Types for Android Device Owner.
     * @param value Value to set for the wiFiSecurityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiSecurityType(@javax.annotation.Nullable final AndroidDeviceOwnerWiFiSecurityType value) {
        this._wiFiSecurityType = value;
    }
}
