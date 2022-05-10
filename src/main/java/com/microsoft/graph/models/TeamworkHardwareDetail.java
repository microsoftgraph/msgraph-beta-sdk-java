package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkHardwareDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** MAC address. */
    private java.util.List<String> _macAddresses;
    /** Device manufacturer. */
    private String _manufacturer;
    /** Devie model. */
    private String _model;
    /** Device serial number. */
    private String _serialNumber;
    /** The unique identifier for the device. */
    private String _uniqueId;
    /**
     * Instantiates a new teamworkHardwareDetail and sets the default values.
     * @return a void
     */
    public TeamworkHardwareDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkHardwareDetail
     */
    @javax.annotation.Nonnull
    public static TeamworkHardwareDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareDetail();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkHardwareDetail currentObject = this;
        return new HashMap<>(5) {{
            this.put("macAddresses", (n) -> { currentObject.setMacAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("uniqueId", (n) -> { currentObject.setUniqueId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the macAddresses property value. MAC address.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMacAddresses() {
        return this._macAddresses;
    }
    /**
     * Gets the manufacturer property value. Device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. Devie model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the serialNumber property value. Device serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the uniqueId property value. The unique identifier for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueId() {
        return this._uniqueId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("macAddresses", this.getMacAddresses());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("uniqueId", this.getUniqueId());
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
     * Sets the macAddresses property value. MAC address.
     * @param value Value to set for the macAddresses property.
     * @return a void
     */
    public void setMacAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._macAddresses = value;
    }
    /**
     * Sets the manufacturer property value. Device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. Devie model.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the serialNumber property value. Device serial number.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the uniqueId property value. The unique identifier for the device.
     * @param value Value to set for the uniqueId property.
     * @return a void
     */
    public void setUniqueId(@javax.annotation.Nullable final String value) {
        this._uniqueId = value;
    }
}
