package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidForWorkWiFiConfiguration extends DeviceConfiguration implements Parsable {
    /** Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. */
    private Boolean _connectAutomatically;
    /** When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. */
    private Boolean _connectWhenNetworkNameIsHidden;
    /** Network Name */
    private String _networkName;
    /** This is the name of the Wi-Fi network that is broadcast to all devices. */
    private String _ssid;
    /** Indicates whether Wi-Fi endpoint uses an EAP based security type. Possible values are: open, wpaEnterprise, wpa2Enterprise. */
    private AndroidWiFiSecurityType _wiFiSecurityType;
    /**
     * Instantiates a new AndroidForWorkWiFiConfiguration and sets the default values.
     * @return a void
     */
    public AndroidForWorkWiFiConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidForWorkEnterpriseWiFiConfiguration": return new AndroidForWorkEnterpriseWiFiConfiguration();
            }
        }
        return new AndroidForWorkWiFiConfiguration();
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
        final AndroidForWorkWiFiConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("connectAutomatically", (n) -> { currentObject.setConnectAutomatically(n.getBooleanValue()); });
            this.put("connectWhenNetworkNameIsHidden", (n) -> { currentObject.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
            this.put("networkName", (n) -> { currentObject.setNetworkName(n.getStringValue()); });
            this.put("ssid", (n) -> { currentObject.setSsid(n.getStringValue()); });
            this.put("wiFiSecurityType", (n) -> { currentObject.setWiFiSecurityType(n.getEnumValue(AndroidWiFiSecurityType.class)); });
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
     * Gets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSsid() {
        return this._ssid;
    }
    /**
     * Gets the wiFiSecurityType property value. Indicates whether Wi-Fi endpoint uses an EAP based security type. Possible values are: open, wpaEnterprise, wpa2Enterprise.
     * @return a androidWiFiSecurityType
     */
    @javax.annotation.Nullable
    public AndroidWiFiSecurityType getWiFiSecurityType() {
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
     * Sets the connectWhenNetworkNameIsHidden property value. When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
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
     * Sets the ssid property value. This is the name of the Wi-Fi network that is broadcast to all devices.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    public void setSsid(@javax.annotation.Nullable final String value) {
        this._ssid = value;
    }
    /**
     * Sets the wiFiSecurityType property value. Indicates whether Wi-Fi endpoint uses an EAP based security type. Possible values are: open, wpaEnterprise, wpa2Enterprise.
     * @param value Value to set for the wiFiSecurityType property.
     * @return a void
     */
    public void setWiFiSecurityType(@javax.annotation.Nullable final AndroidWiFiSecurityType value) {
        this._wiFiSecurityType = value;
    }
}
