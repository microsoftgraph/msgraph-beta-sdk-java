package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user. This profile provides limited and simpler security types than Enterprise Wi-Fi profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidWiFiConfiguration} and sets the default values.
     */
    public AndroidWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidWiFiConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidEnterpriseWiFiConfiguration": return new AndroidEnterpriseWiFiConfiguration();
            }
        }
        return new AndroidWiFiConfiguration();
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
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { this.setWiFiSecurityType(n.getEnumValue(AndroidWiFiSecurityType::forValue)); });
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
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSsid() {
        return this.backingStore.get("ssid");
    }
    /**
     * Gets the wiFiSecurityType property value. The possible security types for Android Wi-Fi profiles. Default value &apos;Open&apos;, indicates no authentication required for the network. The security protocols supported are WEP, WPA and WPA2. &apos;WpaEnterprise&apos; and &apos;Wpa2Enterprise&apos; options are available for Enterprise Wi-Fi profiles. &apos;Wep&apos; and &apos;WpaPersonal&apos; (supports WPA and WPA2) options are available for Basic Wi-Fi profiles.
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
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     */
    public void setSsid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ssid", value);
    }
    /**
     * Sets the wiFiSecurityType property value. The possible security types for Android Wi-Fi profiles. Default value &apos;Open&apos;, indicates no authentication required for the network. The security protocols supported are WEP, WPA and WPA2. &apos;WpaEnterprise&apos; and &apos;Wpa2Enterprise&apos; options are available for Enterprise Wi-Fi profiles. &apos;Wep&apos; and &apos;WpaPersonal&apos; (supports WPA and WPA2) options are available for Basic Wi-Fi profiles.
     * @param value Value to set for the wiFiSecurityType property.
     */
    public void setWiFiSecurityType(@jakarta.annotation.Nullable final AndroidWiFiSecurityType value) {
        this.backingStore.set("wiFiSecurityType", value);
    }
}
