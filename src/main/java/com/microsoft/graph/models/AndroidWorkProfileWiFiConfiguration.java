package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /** Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. */
    private Boolean connectAutomatically;
    /** When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. */
    private Boolean connectWhenNetworkNameIsHidden;
    /** Network Name */
    private String networkName;
    /** This is the name of the Wi-Fi network that is broadcast to all devices. */
    private String ssid;
    /** Wi-Fi Security Types for Android. */
    private AndroidWiFiSecurityType wiFiSecurityType;
    /**
     * Instantiates a new AndroidWorkProfileWiFiConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the connectAutomatically property value. Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this.connectAutomatically;
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this.connectWhenNetworkNameIsHidden;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectAutomatically", (n) -> { this.setConnectAutomatically(n.getBooleanValue()); });
        deserializerMap.put("connectWhenNetworkNameIsHidden", (n) -> { this.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("ssid", (n) -> { this.setSsid(n.getStringValue()); });
        deserializerMap.put("wiFiSecurityType", (n) -> { this.setWiFiSecurityType(n.getEnumValue(AndroidWiFiSecurityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkName() {
        return this.networkName;
    }
    /**
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSsid() {
        return this.ssid;
    }
    /**
     * Gets the wiFiSecurityType property value. Wi-Fi Security Types for Android.
     * @return a androidWiFiSecurityType
     */
    @javax.annotation.Nullable
    public AndroidWiFiSecurityType getWiFiSecurityType() {
        return this.wiFiSecurityType;
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
        this.connectAutomatically = value;
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectWhenNetworkNameIsHidden(@javax.annotation.Nullable final Boolean value) {
        this.connectWhenNetworkNameIsHidden = value;
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkName(@javax.annotation.Nullable final String value) {
        this.networkName = value;
    }
    /**
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsid(@javax.annotation.Nullable final String value) {
        this.ssid = value;
    }
    /**
     * Sets the wiFiSecurityType property value. Wi-Fi Security Types for Android.
     * @param value Value to set for the wiFiSecurityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiSecurityType(@javax.annotation.Nullable final AndroidWiFiSecurityType value) {
        this.wiFiSecurityType = value;
    }
}
