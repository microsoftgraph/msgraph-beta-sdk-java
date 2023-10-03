package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkHardwareDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * MAC address.
     */
    private java.util.List<String> macAddresses;
    /**
     * Device manufacturer.
     */
    private String manufacturer;
    /**
     * Devie model.
     */
    private String model;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Device serial number.
     */
    private String serialNumber;
    /**
     * The unique identifier for the device.
     */
    private String uniqueId;
    /**
     * Instantiates a new TeamworkHardwareDetail and sets the default values.
     */
    public TeamworkHardwareDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkHardwareDetail
     */
    @jakarta.annotation.Nonnull
    public static TeamworkHardwareDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("macAddresses", (n) -> { this.setMacAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("uniqueId", (n) -> { this.setUniqueId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the macAddresses property value. MAC address.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMacAddresses() {
        return this.macAddresses;
    }
    /**
     * Gets the manufacturer property value. Device manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. Devie model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serialNumber property value. Device serial number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the uniqueId property value. The unique identifier for the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUniqueId() {
        return this.uniqueId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("macAddresses", this.getMacAddresses());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the macAddresses property value. MAC address.
     * @param value Value to set for the macAddresses property.
     */
    public void setMacAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.macAddresses = value;
    }
    /**
     * Sets the manufacturer property value. Device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. Devie model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serialNumber property value. Device serial number.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the uniqueId property value. The unique identifier for the device.
     * @param value Value to set for the uniqueId property.
     */
    public void setUniqueId(@jakarta.annotation.Nullable final String value) {
        this.uniqueId = value;
    }
}
