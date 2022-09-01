package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OathTokenMetadata implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The enabled property */
    private Boolean _enabled;
    /** The manufacturer property */
    private String _manufacturer;
    /** The manufacturerProperties property */
    private java.util.List<KeyValue> _manufacturerProperties;
    /** The OdataType property */
    private String _odataType;
    /** The serialNumber property */
    private String _serialNumber;
    /** The tokenType property */
    private String _tokenType;
    /**
     * Instantiates a new oathTokenMetadata and sets the default values.
     * @return a void
     */
    public OathTokenMetadata() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.oathTokenMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oathTokenMetadata
     */
    @javax.annotation.Nonnull
    public static OathTokenMetadata createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OathTokenMetadata();
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
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OathTokenMetadata currentObject = this;
        return new HashMap<>(6) {{
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("manufacturerProperties", (n) -> { currentObject.setManufacturerProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("tokenType", (n) -> { currentObject.setTokenType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the manufacturerProperties property value. The manufacturerProperties property
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getManufacturerProperties() {
        return this._manufacturerProperties;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the serialNumber property value. The serialNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the tokenType property value. The tokenType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenType() {
        return this._tokenType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the manufacturerProperties property value. The manufacturerProperties property
     * @param value Value to set for the manufacturerProperties property.
     * @return a void
     */
    public void setManufacturerProperties(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._manufacturerProperties = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the serialNumber property value. The serialNumber property
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     * @return a void
     */
    public void setTokenType(@javax.annotation.Nullable final String value) {
        this._tokenType = value;
    }
}
