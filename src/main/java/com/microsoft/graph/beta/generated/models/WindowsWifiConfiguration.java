package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsWifiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsWifiConfiguration and sets the default values.
     */
    public WindowsWifiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsWifiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWifiConfiguration
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.backingStore.get("connectAutomatically");
    }
    /**
     * Gets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectToPreferredNetwork() {
        return this.backingStore.get("connectToPreferredNetwork");
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this.backingStore.get("connectWhenNetworkNameIsHidden");
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
        deserializerMap.put("meteredConnectionLimit", (n) -> { this.setMeteredConnectionLimit(n.getEnumValue(WindowsWifiConfigurationMeteredConnectionLimit::forValue)); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { this.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { this.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxyManualAddress", (n) -> { this.setProxyManualAddress(n.getStringValue()); });
        deserializerMap.put("proxyManualPort", (n) -> { this.setProxyManualPort(n.getIntegerValue()); });
        deserializerMap.put("proxySetting", (n) -> { this.setProxySetting(n.getEnumValue(WindowsWifiConfigurationProxySetting::forValue)); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wifiSecurityType", (n) -> { this.setWifiSecurityType(n.getEnumValue(WindowsWifiConfigurationWifiSecurityType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getForceFIPSCompliance() {
        return this.backingStore.get("forceFIPSCompliance");
    }
    /**
     * Gets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @return a WindowsWifiConfigurationMeteredConnectionLimit
     */
    @jakarta.annotation.Nullable
    public WindowsWifiConfigurationMeteredConnectionLimit getMeteredConnectionLimit() {
        return this.backingStore.get("meteredConnectionLimit");
    }
    /**
     * Gets the networkName property value. Specify the network configuration name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.backingStore.get("networkName");
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.backingStore.get("preSharedKey");
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.backingStore.get("proxyAutomaticConfigurationUrl");
    }
    /**
     * Gets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyManualAddress() {
        return this.backingStore.get("proxyManualAddress");
    }
    /**
     * Gets the proxyManualPort property value. Specify the port for the proxy server.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProxyManualPort() {
        return this.backingStore.get("proxyManualPort");
    }
    /**
     * Gets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @return a WindowsWifiConfigurationProxySetting
     */
    @jakarta.annotation.Nullable
    public WindowsWifiConfigurationProxySetting getProxySetting() {
        return this.backingStore.get("proxySetting");
    }
    /**
     * Gets the ssid property value. Specify the SSID of the wifi connection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSsid() {
        return this.backingStore.get("ssid");
    }
    /**
     * Gets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @return a WindowsWifiConfigurationWifiSecurityType
     */
    @jakarta.annotation.Nullable
    public WindowsWifiConfigurationWifiSecurityType getWifiSecurityType() {
        return this.backingStore.get("wifiSecurityType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setConnectAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectAutomatically", value);
    }
    /**
     * Sets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @param value Value to set for the connectToPreferredNetwork property.
     */
    public void setConnectToPreferredNetwork(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectToPreferredNetwork", value);
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     */
    public void setConnectWhenNetworkNameIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectWhenNetworkNameIsHidden", value);
    }
    /**
     * Sets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @param value Value to set for the forceFIPSCompliance property.
     */
    public void setForceFIPSCompliance(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("forceFIPSCompliance", value);
    }
    /**
     * Sets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @param value Value to set for the meteredConnectionLimit property.
     */
    public void setMeteredConnectionLimit(@jakarta.annotation.Nullable final WindowsWifiConfigurationMeteredConnectionLimit value) {
        this.backingStore.set("meteredConnectionLimit", value);
    }
    /**
     * Sets the networkName property value. Specify the network configuration name.
     * @param value Value to set for the networkName property.
     */
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkName", value);
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     */
    public void setPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preSharedKey", value);
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     */
    public void setProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyAutomaticConfigurationUrl", value);
    }
    /**
     * Sets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @param value Value to set for the proxyManualAddress property.
     */
    public void setProxyManualAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyManualAddress", value);
    }
    /**
     * Sets the proxyManualPort property value. Specify the port for the proxy server.
     * @param value Value to set for the proxyManualPort property.
     */
    public void setProxyManualPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("proxyManualPort", value);
    }
    /**
     * Sets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @param value Value to set for the proxySetting property.
     */
    public void setProxySetting(@jakarta.annotation.Nullable final WindowsWifiConfigurationProxySetting value) {
        this.backingStore.set("proxySetting", value);
    }
    /**
     * Sets the ssid property value. Specify the SSID of the wifi connection.
     * @param value Value to set for the ssid property.
     */
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ssid", value);
    }
    /**
     * Sets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @param value Value to set for the wifiSecurityType property.
     */
    public void setWifiSecurityType(@jakarta.annotation.Nullable final WindowsWifiConfigurationWifiSecurityType value) {
        this.backingStore.set("wifiSecurityType", value);
    }
}
