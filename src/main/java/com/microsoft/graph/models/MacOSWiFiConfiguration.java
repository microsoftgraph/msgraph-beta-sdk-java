package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the macOS device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new MacOSWiFiConfiguration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static MacOSWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.BackingStore.get("connectAutomatically");
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this.BackingStore.get("connectWhenNetworkNameIsHidden");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectAutomatically", (n) -> { this.setConnectAutomatically(n.getBooleanValue()); });
        deserializerMap.put("connectWhenNetworkNameIsHidden", (n) -> { this.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { this.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { this.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxyManualAddress", (n) -> { this.setProxyManualAddress(n.getStringValue()); });
        deserializerMap.put("proxyManualPort", (n) -> { this.setProxyManualPort(n.getIntegerValue()); });
        deserializerMap.put("proxySettings", (n) -> { this.setProxySettings(n.getEnumValue(WiFiProxySetting.class)); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { this.setWiFiSecurityType(n.getEnumValue(WiFiSecurityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.BackingStore.get("networkName");
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.BackingStore.get("preSharedKey");
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.BackingStore.get("proxyAutomaticConfigurationUrl");
    }
    /**
     * Gets the proxyManualAddress property value. IP Address or DNS hostname of the proxy server when manual configuration is selected.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProxyManualAddress() {
        return this.BackingStore.get("proxyManualAddress");
    }
    /**
     * Gets the proxyManualPort property value. Port of the proxy server when manual configuration is selected.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProxyManualPort() {
        return this.BackingStore.get("proxyManualPort");
    }
    /**
     * Gets the proxySettings property value. Wi-Fi Proxy Settings.
     * @return a WiFiProxySetting
     */
    @jakarta.annotation.Nullable
    public WiFiProxySetting getProxySettings() {
        return this.BackingStore.get("proxySettings");
    }
    /**
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSsid() {
        return this.BackingStore.get("ssid");
    }
    /**
     * Gets the wiFiSecurityType property value. Wi-Fi Security Types.
     * @return a WiFiSecurityType
     */
    @jakarta.annotation.Nullable
    public WiFiSecurityType getWiFiSecurityType() {
        return this.BackingStore.get("wiFiSecurityType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConnectAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("connectAutomatically", value);
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     */
    public void setConnectWhenNetworkNameIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("connectWhenNetworkNameIsHidden", value);
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     */
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("networkName", value);
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     */
    public void setPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("preSharedKey", value);
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     */
    public void setProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("proxyAutomaticConfigurationUrl", value);
    }
    /**
     * Sets the proxyManualAddress property value. IP Address or DNS hostname of the proxy server when manual configuration is selected.
     * @param value Value to set for the proxyManualAddress property.
     */
    public void setProxyManualAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("proxyManualAddress", value);
    }
    /**
     * Sets the proxyManualPort property value. Port of the proxy server when manual configuration is selected.
     * @param value Value to set for the proxyManualPort property.
     */
    public void setProxyManualPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("proxyManualPort", value);
    }
    /**
     * Sets the proxySettings property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySettings property.
     */
    public void setProxySettings(@jakarta.annotation.Nullable final WiFiProxySetting value) {
        this.BackingStore.set("proxySettings", value);
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     */
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ssid", value);
    }
    /**
     * Sets the wiFiSecurityType property value. Wi-Fi Security Types.
     * @param value Value to set for the wiFiSecurityType property.
     */
    public void setWiFiSecurityType(@jakarta.annotation.Nullable final WiFiSecurityType value) {
        this.BackingStore.set("wiFiSecurityType", value);
    }
}
