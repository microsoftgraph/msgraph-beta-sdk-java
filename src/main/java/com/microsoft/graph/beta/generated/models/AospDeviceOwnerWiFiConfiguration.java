package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the AOSP device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user. This profile provides limited and simpler security types than Enterprise Wi-Fi profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AospDeviceOwnerWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AospDeviceOwnerWiFiConfiguration} and sets the default values.
     */
    public AospDeviceOwnerWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.aospDeviceOwnerWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AospDeviceOwnerWiFiConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AospDeviceOwnerWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.aospDeviceOwnerEnterpriseWiFiConfiguration": return new AospDeviceOwnerEnterpriseWiFiConfiguration();
            }
        }
        return new AospDeviceOwnerWiFiConfiguration();
    }
    /**
     * Gets the connectAutomatically property value. Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.backingStore.get("connectAutomatically");
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn&apos;t broadcast its SSID to all devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this.backingStore.get("connectWhenNetworkNameIsHidden");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectAutomatically", (n) -> { this.setConnectAutomatically(n.getBooleanValue()); });
        deserializerMap.put("connectWhenNetworkNameIsHidden", (n) -> { this.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { this.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("preSharedKeyIsSet", (n) -> { this.setPreSharedKeyIsSet(n.getBooleanValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { this.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxyExclusionList", (n) -> { this.setProxyExclusionList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("proxyManualAddress", (n) -> { this.setProxyManualAddress(n.getStringValue()); });
        deserializerMap.put("proxyManualPort", (n) -> { this.setProxyManualPort(n.getIntegerValue()); });
        deserializerMap.put("proxySetting", (n) -> { this.setProxySetting(n.getEnumValue(WiFiProxySetting::forValue)); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { this.setWiFiSecurityType(n.getEnumValue(AospDeviceOwnerWiFiSecurityType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.backingStore.get("networkName");
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.backingStore.get("preSharedKey");
    }
    /**
     * Gets the preSharedKeyIsSet property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreSharedKeyIsSet() {
        return this.backingStore.get("preSharedKeyIsSet");
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. Specify the proxy server configuration script URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.backingStore.get("proxyAutomaticConfigurationUrl");
    }
    /**
     * Gets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProxyExclusionList() {
        return this.backingStore.get("proxyExclusionList");
    }
    /**
     * Gets the proxyManualAddress property value. Specify the proxy server IP address. Both IPv4 and IPv6 addresses are supported. For example: 192.168.1.1.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProxyManualAddress() {
        return this.backingStore.get("proxyManualAddress");
    }
    /**
     * Gets the proxyManualPort property value. Specify the proxy server port.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProxyManualPort() {
        return this.backingStore.get("proxyManualPort");
    }
    /**
     * Gets the proxySetting property value. Wi-Fi Proxy Settings.
     * @return a {@link WiFiProxySetting}
     */
    @jakarta.annotation.Nullable
    public WiFiProxySetting getProxySetting() {
        return this.backingStore.get("proxySetting");
    }
    /**
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSsid() {
        return this.backingStore.get("ssid");
    }
    /**
     * Gets the wiFiSecurityType property value. Wi-Fi Security Types for AOSP Device Owner.
     * @return a {@link AospDeviceOwnerWiFiSecurityType}
     */
    @jakarta.annotation.Nullable
    public AospDeviceOwnerWiFiSecurityType getWiFiSecurityType() {
        return this.backingStore.get("wiFiSecurityType");
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
        writer.writeBooleanValue("preSharedKeyIsSet", this.getPreSharedKeyIsSet());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
        writer.writeCollectionOfPrimitiveValues("proxyExclusionList", this.getProxyExclusionList());
        writer.writeStringValue("proxyManualAddress", this.getProxyManualAddress());
        writer.writeIntegerValue("proxyManualPort", this.getProxyManualPort());
        writer.writeEnumValue("proxySetting", this.getProxySetting());
        writer.writeStringValue("ssid", this.getSsid());
        writer.writeEnumValue("wiFiSecurityType", this.getWiFiSecurityType());
    }
    /**
     * Sets the connectAutomatically property value. Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     * @param value Value to set for the connectAutomatically property.
     */
    public void setConnectAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectAutomatically", value);
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn&apos;t broadcast its SSID to all devices.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     */
    public void setConnectWhenNetworkNameIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectWhenNetworkNameIsHidden", value);
    }
    /**
     * Sets the networkName property value. Network Name
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
     * Sets the preSharedKeyIsSet property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKeyIsSet property.
     */
    public void setPreSharedKeyIsSet(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preSharedKeyIsSet", value);
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. Specify the proxy server configuration script URL.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     */
    public void setProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyAutomaticConfigurationUrl", value);
    }
    /**
     * Sets the proxyExclusionList property value. List of hosts to exclude using the proxy on connections for. These hosts can use wildcards such as .example.com.
     * @param value Value to set for the proxyExclusionList property.
     */
    public void setProxyExclusionList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("proxyExclusionList", value);
    }
    /**
     * Sets the proxyManualAddress property value. Specify the proxy server IP address. Both IPv4 and IPv6 addresses are supported. For example: 192.168.1.1.
     * @param value Value to set for the proxyManualAddress property.
     */
    public void setProxyManualAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyManualAddress", value);
    }
    /**
     * Sets the proxyManualPort property value. Specify the proxy server port.
     * @param value Value to set for the proxyManualPort property.
     */
    public void setProxyManualPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("proxyManualPort", value);
    }
    /**
     * Sets the proxySetting property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySetting property.
     */
    public void setProxySetting(@jakarta.annotation.Nullable final WiFiProxySetting value) {
        this.backingStore.set("proxySetting", value);
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     */
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ssid", value);
    }
    /**
     * Sets the wiFiSecurityType property value. Wi-Fi Security Types for AOSP Device Owner.
     * @param value Value to set for the wiFiSecurityType property.
     */
    public void setWiFiSecurityType(@jakarta.annotation.Nullable final AospDeviceOwnerWiFiSecurityType value) {
        this.backingStore.set("wiFiSecurityType", value);
    }
}
