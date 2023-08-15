package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
public class WindowsWifiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Specify whether the wifi connection should connect automatically when in range.
     */
    private Boolean connectAutomatically;
    /**
     * Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     */
    private Boolean connectToPreferredNetwork;
    /**
     * Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     */
    private Boolean connectWhenNetworkNameIsHidden;
    /**
     * Specify whether to force FIPS compliance.
     */
    private Boolean forceFIPSCompliance;
    /**
     * Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     */
    private MeteredConnectionLimitType meteredConnectionLimit;
    /**
     * Specify the network configuration name.
     */
    private String networkName;
    /**
     * This is the pre-shared key for WPA Personal Wi-Fi network.
     */
    private String preSharedKey;
    /**
     * Specify the URL for the proxy server configuration script.
     */
    private String proxyAutomaticConfigurationUrl;
    /**
     * Specify the IP address for the proxy server.
     */
    private String proxyManualAddress;
    /**
     * Specify the port for the proxy server.
     */
    private Integer proxyManualPort;
    /**
     * Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     */
    private WiFiProxySetting proxySetting;
    /**
     * Specify the SSID of the wifi connection.
     */
    private String ssid;
    /**
     * Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     */
    private WiFiSecurityType wifiSecurityType;
    /**
     * Instantiates a new windowsWifiConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsWifiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsWifiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsWifiConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsWifiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration": return new WindowsWifiEnterpriseEAPConfiguration();
            }
        }
        return new WindowsWifiConfiguration();
    }
    /**
     * Gets the connectAutomatically property value. Specify whether the wifi connection should connect automatically when in range.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.connectAutomatically;
    }
    /**
     * Gets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectToPreferredNetwork() {
        return this.connectToPreferredNetwork;
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this.connectWhenNetworkNameIsHidden;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectAutomatically", (n) -> { this.setConnectAutomatically(n.getBooleanValue()); });
        deserializerMap.put("connectToPreferredNetwork", (n) -> { this.setConnectToPreferredNetwork(n.getBooleanValue()); });
        deserializerMap.put("connectWhenNetworkNameIsHidden", (n) -> { this.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
        deserializerMap.put("forceFIPSCompliance", (n) -> { this.setForceFIPSCompliance(n.getBooleanValue()); });
        deserializerMap.put("meteredConnectionLimit", (n) -> { this.setMeteredConnectionLimit(n.getEnumValue(MeteredConnectionLimitType.class)); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { this.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { this.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxyManualAddress", (n) -> { this.setProxyManualAddress(n.getStringValue()); });
        deserializerMap.put("proxyManualPort", (n) -> { this.setProxyManualPort(n.getIntegerValue()); });
        deserializerMap.put("proxySetting", (n) -> { this.setProxySetting(n.getEnumValue(WiFiProxySetting.class)); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wifiSecurityType", (n) -> { this.setWifiSecurityType(n.getEnumValue(WiFiSecurityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getForceFIPSCompliance() {
        return this.forceFIPSCompliance;
    }
    /**
     * Gets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @return a meteredConnectionLimitType
     */
    @jakarta.annotation.Nullable
    public MeteredConnectionLimitType getMeteredConnectionLimit() {
        return this.meteredConnectionLimit;
    }
    /**
     * Gets the networkName property value. Specify the network configuration name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.networkName;
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.preSharedKey;
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.proxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProxyManualAddress() {
        return this.proxyManualAddress;
    }
    /**
     * Gets the proxyManualPort property value. Specify the port for the proxy server.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getProxyManualPort() {
        return this.proxyManualPort;
    }
    /**
     * Gets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @return a wiFiProxySetting
     */
    @jakarta.annotation.Nullable
    public WiFiProxySetting getProxySetting() {
        return this.proxySetting;
    }
    /**
     * Gets the ssid property value. Specify the SSID of the wifi connection.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSsid() {
        return this.ssid;
    }
    /**
     * Gets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @return a wiFiSecurityType
     */
    @jakarta.annotation.Nullable
    public WiFiSecurityType getWifiSecurityType() {
        return this.wifiSecurityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("connectAutomatically", this.getConnectAutomatically());
        writer.writeBooleanValue("connectToPreferredNetwork", this.getConnectToPreferredNetwork());
        writer.writeBooleanValue("connectWhenNetworkNameIsHidden", this.getConnectWhenNetworkNameIsHidden());
        writer.writeBooleanValue("forceFIPSCompliance", this.getForceFIPSCompliance());
        writer.writeEnumValue("meteredConnectionLimit", this.getMeteredConnectionLimit());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeStringValue("preSharedKey", this.getPreSharedKey());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
        writer.writeStringValue("proxyManualAddress", this.getProxyManualAddress());
        writer.writeIntegerValue("proxyManualPort", this.getProxyManualPort());
        writer.writeEnumValue("proxySetting", this.getProxySetting());
        writer.writeStringValue("ssid", this.getSsid());
        writer.writeEnumValue("wifiSecurityType", this.getWifiSecurityType());
    }
    /**
     * Sets the connectAutomatically property value. Specify whether the wifi connection should connect automatically when in range.
     * @param value Value to set for the connectAutomatically property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.connectAutomatically = value;
    }
    /**
     * Sets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @param value Value to set for the connectToPreferredNetwork property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectToPreferredNetwork(@jakarta.annotation.Nullable final Boolean value) {
        this.connectToPreferredNetwork = value;
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectWhenNetworkNameIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.connectWhenNetworkNameIsHidden = value;
    }
    /**
     * Sets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @param value Value to set for the forceFIPSCompliance property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setForceFIPSCompliance(@jakarta.annotation.Nullable final Boolean value) {
        this.forceFIPSCompliance = value;
    }
    /**
     * Sets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @param value Value to set for the meteredConnectionLimit property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeteredConnectionLimit(@jakarta.annotation.Nullable final MeteredConnectionLimitType value) {
        this.meteredConnectionLimit = value;
    }
    /**
     * Sets the networkName property value. Specify the network configuration name.
     * @param value Value to set for the networkName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.networkName = value;
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.preSharedKey = value;
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.proxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @param value Value to set for the proxyManualAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxyManualAddress(@jakarta.annotation.Nullable final String value) {
        this.proxyManualAddress = value;
    }
    /**
     * Sets the proxyManualPort property value. Specify the port for the proxy server.
     * @param value Value to set for the proxyManualPort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxyManualPort(@jakarta.annotation.Nullable final Integer value) {
        this.proxyManualPort = value;
    }
    /**
     * Sets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @param value Value to set for the proxySetting property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxySetting(@jakarta.annotation.Nullable final WiFiProxySetting value) {
        this.proxySetting = value;
    }
    /**
     * Sets the ssid property value. Specify the SSID of the wifi connection.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.ssid = value;
    }
    /**
     * Sets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @param value Value to set for the wifiSecurityType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWifiSecurityType(@jakarta.annotation.Nullable final WiFiSecurityType value) {
        this.wifiSecurityType = value;
    }
}
