package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user. This profile provides limited and simpler security types than Enterprise Wi-Fi profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWorkProfileWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidWorkProfileWiFiConfiguration} and sets the default values.
     */
    public AndroidWorkProfileWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidWorkProfileWiFiConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration": return new AndroidWorkProfileEnterpriseWiFiConfiguration();
            }
        }
        return new AndroidWorkProfileWiFiConfiguration();
    }
    /**
     * Gets the connectAutomatically property value. When set to true, device will connect automatically to the Wi-Fi network when in range, skipping the user prompt. When false, user will need to connect manually through Settings on the Android device. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.backingStore.get("connectAutomatically");
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. When false, device will not automatically connect to hidden networks. Default value is false.
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
        deserializerMap.put("proxySettings", (n) -> { this.setProxySettings(n.getEnumValue(WiFiProxySetting::forValue)); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { this.setWiFiSecurityType(n.getEnumValue(AndroidWiFiSecurityType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the networkName property value. The name of the Wi-Fi network.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.backingStore.get("networkName");
    }
    /**
     * Gets the preSharedKey property value. Specify the pre-shared key for a WEP or WPA personal Wi-Fi network. Restrictions depend on the value set for wiFiSecurityType. If WEP type security is used, then preSharedKey must be a valid passphrase (5 or 13 characters) or a valid HEX key (10 or 26 hexidecimal characters). If WPA security type is used, then preSharedKey can be any string between 8 and 64 characters long.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.backingStore.get("preSharedKey");
    }
    /**
     * Gets the preSharedKeyIsSet property value. When set to true, indicates that the pre-shared key is configured. When set to false, indicates that pre-shared key is not configured (any values set for preSharedKey will be ignored). Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreSharedKeyIsSet() {
        return this.backingStore.get("preSharedKeyIsSet");
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.backingStore.get("proxyAutomaticConfigurationUrl");
    }
    /**
     * Gets the proxySettings property value. Wi-Fi Proxy Settings.
     * @return a {@link WiFiProxySetting}
     */
    @jakarta.annotation.Nullable
    public WiFiProxySetting getProxySettings() {
        return this.backingStore.get("proxySettings");
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
     * Gets the wiFiSecurityType property value. The possible security types for Android Wi-Fi profiles. Default value 'Open', indicates no authentication required for the network. The security protocols supported are WEP, WPA and WPA2. 'WpaEnterprise' and 'Wpa2Enterprise' options are available for Enterprise Wi-Fi profiles. 'Wep' and 'WpaPersonal' (supports WPA and WPA2) options are available for Basic Wi-Fi profiles.
     * @return a {@link AndroidWiFiSecurityType}
     */
    @jakarta.annotation.Nullable
    public AndroidWiFiSecurityType getWiFiSecurityType() {
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
        writer.writeEnumValue("proxySettings", this.getProxySettings());
        writer.writeStringValue("ssid", this.getSsid());
        writer.writeEnumValue("wiFiSecurityType", this.getWiFiSecurityType());
    }
    /**
     * Sets the connectAutomatically property value. When set to true, device will connect automatically to the Wi-Fi network when in range, skipping the user prompt. When false, user will need to connect manually through Settings on the Android device. Default value is false.
     * @param value Value to set for the connectAutomatically property.
     */
    public void setConnectAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectAutomatically", value);
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. When false, device will not automatically connect to hidden networks. Default value is false.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     */
    public void setConnectWhenNetworkNameIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectWhenNetworkNameIsHidden", value);
    }
    /**
     * Sets the networkName property value. The name of the Wi-Fi network.
     * @param value Value to set for the networkName property.
     */
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkName", value);
    }
    /**
     * Sets the preSharedKey property value. Specify the pre-shared key for a WEP or WPA personal Wi-Fi network. Restrictions depend on the value set for wiFiSecurityType. If WEP type security is used, then preSharedKey must be a valid passphrase (5 or 13 characters) or a valid HEX key (10 or 26 hexidecimal characters). If WPA security type is used, then preSharedKey can be any string between 8 and 64 characters long.
     * @param value Value to set for the preSharedKey property.
     */
    public void setPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preSharedKey", value);
    }
    /**
     * Sets the preSharedKeyIsSet property value. When set to true, indicates that the pre-shared key is configured. When set to false, indicates that pre-shared key is not configured (any values set for preSharedKey will be ignored). Default value is false.
     * @param value Value to set for the preSharedKeyIsSet property.
     */
    public void setPreSharedKeyIsSet(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preSharedKeyIsSet", value);
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     */
    public void setProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proxyAutomaticConfigurationUrl", value);
    }
    /**
     * Sets the proxySettings property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySettings property.
     */
    public void setProxySettings(@jakarta.annotation.Nullable final WiFiProxySetting value) {
        this.backingStore.set("proxySettings", value);
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     */
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ssid", value);
    }
    /**
     * Sets the wiFiSecurityType property value. The possible security types for Android Wi-Fi profiles. Default value 'Open', indicates no authentication required for the network. The security protocols supported are WEP, WPA and WPA2. 'WpaEnterprise' and 'Wpa2Enterprise' options are available for Enterprise Wi-Fi profiles. 'Wep' and 'WpaPersonal' (supports WPA and WPA2) options are available for Basic Wi-Fi profiles.
     * @param value Value to set for the wiFiSecurityType property.
     */
    public void setWiFiSecurityType(@jakarta.annotation.Nullable final AndroidWiFiSecurityType value) {
        this.backingStore.set("wiFiSecurityType", value);
    }
}
