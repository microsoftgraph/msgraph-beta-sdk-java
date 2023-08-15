package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OathTokenMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The manufacturer property
     */
    private String manufacturer;
    /**
     * The manufacturerProperties property
     */
    private java.util.List<KeyValue> manufacturerProperties;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The serialNumber property
     */
    private String serialNumber;
    /**
     * The tokenType property
     */
    private String tokenType;
    /**
     * Instantiates a new oathTokenMetadata and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OathTokenMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oathTokenMetadata
     */
    @jakarta.annotation.Nonnull
    public static OathTokenMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OathTokenMetadata();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("manufacturerProperties", (n) -> { this.setManufacturerProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the manufacturerProperties property value. The manufacturerProperties property
     * @return a keyValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getManufacturerProperties() {
        return this.manufacturerProperties;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serialNumber property value. The serialNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the tokenType property value. The tokenType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTokenType() {
        return this.tokenType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeCollectionOfObjectValues("manufacturerProperties", this.getManufacturerProperties());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("tokenType", this.getTokenType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the manufacturerProperties property value. The manufacturerProperties property
     * @param value Value to set for the manufacturerProperties property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturerProperties(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.manufacturerProperties = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serialNumber property value. The serialNumber property
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
