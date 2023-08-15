package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Number Range definition.
 */
public class NumberRange implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Lower number.
     */
    private Integer lowerNumber;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Upper number.
     */
    private Integer upperNumber;
    /**
     * Instantiates a new numberRange and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public NumberRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a numberRange
     */
    @jakarta.annotation.Nonnull
    public static NumberRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberRange();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("lowerNumber", (n) -> { this.setLowerNumber(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("upperNumber", (n) -> { this.setUpperNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lowerNumber property value. Lower number.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getLowerNumber() {
        return this.lowerNumber;
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
     * Gets the upperNumber property value. Upper number.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpperNumber() {
        return this.upperNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("lowerNumber", this.getLowerNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("upperNumber", this.getUpperNumber());
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
     * Sets the lowerNumber property value. Lower number.
     * @param value Value to set for the lowerNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLowerNumber(@jakarta.annotation.Nullable final Integer value) {
        this.lowerNumber = value;
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
     * Sets the upperNumber property value. Upper number.
     * @param value Value to set for the upperNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpperNumber(@jakarta.annotation.Nullable final Integer value) {
        this.upperNumber = value;
    }
}
