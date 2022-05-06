package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkInterface implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Description of the NIC (e.g. Ethernet adapter, Wireless LAN adapter Local Area Connection <#>, etc.).  */
    private String _description;
    /** Last IPv4 address associated with this NIC.  */
    private String _ipV4Address;
    /** Last Public (aka global) IPv6 address associated with this NIC.  */
    private String _ipV6Address;
    /** Last local (link-local or site-local) IPv6 address associated with this NIC.  */
    private String _localIpV6Address;
    /** MAC address of the NIC on this host.  */
    private String _macAddress;
    /**
     * Instantiates a new networkInterface and sets the default values.
     * @return a void
     */
    public NetworkInterface() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkInterface
     */
    @javax.annotation.Nonnull
    public static NetworkInterface createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkInterface();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the description property value. Description of the NIC (e.g. Ethernet adapter, Wireless LAN adapter Local Area Connection <#>, etc.).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NetworkInterface currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("ipV4Address", (n) -> { currentObject.setIpV4Address(n.getStringValue()); });
            this.put("ipV6Address", (n) -> { currentObject.setIpV6Address(n.getStringValue()); });
            this.put("localIpV6Address", (n) -> { currentObject.setLocalIpV6Address(n.getStringValue()); });
            this.put("macAddress", (n) -> { currentObject.setMacAddress(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ipV4Address property value. Last IPv4 address associated with this NIC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpV4Address() {
        return this._ipV4Address;
    }
    /**
     * Gets the ipV6Address property value. Last Public (aka global) IPv6 address associated with this NIC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpV6Address() {
        return this._ipV6Address;
    }
    /**
     * Gets the localIpV6Address property value. Last local (link-local or site-local) IPv6 address associated with this NIC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalIpV6Address() {
        return this._localIpV6Address;
    }
    /**
     * Gets the macAddress property value. MAC address of the NIC on this host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacAddress() {
        return this._macAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("ipV4Address", this.getIpV4Address());
        writer.writeStringValue("ipV6Address", this.getIpV6Address());
        writer.writeStringValue("localIpV6Address", this.getLocalIpV6Address());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. Description of the NIC (e.g. Ethernet adapter, Wireless LAN adapter Local Area Connection <#>, etc.).
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the ipV4Address property value. Last IPv4 address associated with this NIC.
     * @param value Value to set for the ipV4Address property.
     * @return a void
     */
    public void setIpV4Address(@javax.annotation.Nullable final String value) {
        this._ipV4Address = value;
    }
    /**
     * Sets the ipV6Address property value. Last Public (aka global) IPv6 address associated with this NIC.
     * @param value Value to set for the ipV6Address property.
     * @return a void
     */
    public void setIpV6Address(@javax.annotation.Nullable final String value) {
        this._ipV6Address = value;
    }
    /**
     * Sets the localIpV6Address property value. Last local (link-local or site-local) IPv6 address associated with this NIC.
     * @param value Value to set for the localIpV6Address property.
     * @return a void
     */
    public void setLocalIpV6Address(@javax.annotation.Nullable final String value) {
        this._localIpV6Address = value;
    }
    /**
     * Sets the macAddress property value. MAC address of the NIC on this host.
     * @param value Value to set for the macAddress property.
     * @return a void
     */
    public void setMacAddress(@javax.annotation.Nullable final String value) {
        this._macAddress = value;
    }
}
