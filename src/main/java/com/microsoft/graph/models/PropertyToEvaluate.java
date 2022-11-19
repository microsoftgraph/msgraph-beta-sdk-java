package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PropertyToEvaluate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Provides the property name. */
    private String _propertyName;
    /** Provides the property value. */
    private String _propertyValue;
    /**
     * Instantiates a new propertyToEvaluate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PropertyToEvaluate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.propertyToEvaluate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a propertyToEvaluate
     */
    @javax.annotation.Nonnull
    public static PropertyToEvaluate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyToEvaluate();
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
        final PropertyToEvaluate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyName", (n) -> { currentObject.setPropertyName(n.getStringValue()); });
        deserializerMap.put("propertyValue", (n) -> { currentObject.setPropertyValue(n.getStringValue()); });
        return deserializerMap
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
     * Gets the propertyName property value. Provides the property name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPropertyName() {
        return this._propertyName;
    }
    /**
     * Gets the propertyValue property value. Provides the property value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPropertyValue() {
        return this._propertyValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeStringValue("propertyValue", this.getPropertyValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the propertyName property value. Provides the property name.
     * @param value Value to set for the propertyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropertyName(@javax.annotation.Nullable final String value) {
        this._propertyName = value;
    }
    /**
     * Sets the propertyValue property value. Provides the property value.
     * @param value Value to set for the propertyValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropertyValue(@javax.annotation.Nullable final String value) {
        this._propertyValue = value;
    }
}
