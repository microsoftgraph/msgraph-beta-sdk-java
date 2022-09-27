package com.microsoft.graph.models;

import com.microsoft.graph.models.MacOSEnterpriseWiFiConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /** Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. */
    private Boolean _connectAutomatically;
    /** Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. */
    private Boolean _connectWhenNetworkNameIsHidden;
    /** Network Name */
    private String _networkName;
    /** This is the pre-shared key for WPA Personal Wi-Fi network. */
    private String _preSharedKey;
    /** URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file. */
    private String _proxyAutomaticConfigurationUrl;
    /** IP Address or DNS hostname of the proxy server when manual configuration is selected. */
    private String _proxyManualAddress;
    /** Port of the proxy server when manual configuration is selected. */
    private Integer _proxyManualPort;
    /** Wi-Fi Proxy Settings. */
    private WiFiProxySetting _proxySettings;
    /** This is the name of the Wi-Fi network that is broadcast to all devices. */
    private String _ssid;
    /** Wi-Fi Security Types. */
    private WiFiSecurityType _wiFiSecurityType;
    /**
     * Instantiates a new MacOSWiFiConfiguration and sets the default values.
     * @return a void
     */
    public MacOSWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.macOSEnterpriseWiFiConfiguration": return new MacOSEnterpriseWiFiConfiguration();
            }
        }
        return new MacOSWiFiConfiguration();
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
     * Gets the connectWhenNetworkNameIsHidden property value. Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
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
        final MacOSWiFiConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("connectAutomatically", (n) -> { currentObject.setConnectAutomatically(n.getBooleanValue()); });
            this.put("connectWhenNetworkNameIsHidden", (n) -> { currentObject.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
            this.put("networkName", (n) -> { currentObject.setNetworkName(n.getStringValue()); });
            this.put("preSharedKey", (n) -> { currentObject.setPreSharedKey(n.getStringValue()); });
            this.put("proxyAutomaticConfigurationUrl", (n) -> { currentObject.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
            this.put("proxyManualAddress", (n) -> { currentObject.setProxyManualAddress(n.getStringValue()); });
            this.put("proxyManualPort", (n) -> { currentObject.setProxyManualPort(n.getIntegerValue()); });
            this.put("proxySettings", (n) -> { currentObject.setProxySettings(n.getEnumValue(WiFiProxySetting.class)); });
            this.put("ssid", (n) -> { currentObject.setSsid(n.getStringValue()); });
            this.put("wiFiSecurityType", (n) -> { currentObject.setWiFiSecurityType(n.getEnumValue(WiFiSecurityType.class)); });
        }};
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
     * Gets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this._proxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the proxyManualAddress property value. IP Address or DNS hostname of the proxy server when manual configuration is selected.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyManualAddress() {
        return this._proxyManualAddress;
    }
    /**
     * Gets the proxyManualPort property value. Port of the proxy server when manual configuration is selected.
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
     * Gets the wiFiSecurityType property value. Wi-Fi Security Types.
     * @return a wiFiSecurityType
     */
    @javax.annotation.Nullable
    public WiFiSecurityType getWiFiSecurityType() {
        return this._wiFiSecurityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("connectAutomatically", this.getConnectAutomatically());
        writer.writeBooleanValue("connectWhenNetworkNameIsHidden", this.getConnectWhenNetworkNameIsHidden());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeStringValue("preSharedKey", this.getPreSharedKey());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
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
    public void setConnectAutomatically(@javax.annotation.Nullable final Boolean value) {
        this._connectAutomatically = value;
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     * @return a void
     */
    public void setConnectWhenNetworkNameIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._connectWhenNetworkNameIsHidden = value;
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     * @return a void
     */
    public void setNetworkName(@javax.annotation.Nullable final String value) {
        this._networkName = value;
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     * @return a void
     */
    public void setPreSharedKey(@javax.annotation.Nullable final String value) {
        this._preSharedKey = value;
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     * @return a void
     */
    public void setProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._proxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the proxyManualAddress property value. IP Address or DNS hostname of the proxy server when manual configuration is selected.
     * @param value Value to set for the proxyManualAddress property.
     * @return a void
     */
    public void setProxyManualAddress(@javax.annotation.Nullable final String value) {
        this._proxyManualAddress = value;
    }
    /**
     * Sets the proxyManualPort property value. Port of the proxy server when manual configuration is selected.
     * @param value Value to set for the proxyManualPort property.
     * @return a void
     */
    public void setProxyManualPort(@javax.annotation.Nullable final Integer value) {
        this._proxyManualPort = value;
    }
    /**
     * Sets the proxySettings property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySettings property.
     * @return a void
     */
    public void setProxySettings(@javax.annotation.Nullable final WiFiProxySetting value) {
        this._proxySettings = value;
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    public void setSsid(@javax.annotation.Nullable final String value) {
        this._ssid = value;
    }
    /**
     * Sets the wiFiSecurityType property value. Wi-Fi Security Types.
     * @param value Value to set for the wiFiSecurityType property.
     * @return a void
     */
    public void setWiFiSecurityType(@javax.annotation.Nullable final WiFiSecurityType value) {
        this._wiFiSecurityType = value;
    }
}
