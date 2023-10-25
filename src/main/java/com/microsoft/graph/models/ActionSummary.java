package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActionSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assigned property
     */
    private Integer assigned;
    /**
     * The available property
     */
    private Integer available;
    /**
     * The exercised property
     */
    private Integer exercised;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ActionSummary and sets the default values.
     */
    public ActionSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActionSummary
     */
    @jakarta.annotation.Nonnull
    public static ActionSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActionSummary();
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
     * Gets the assigned property value. The assigned property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAssigned() {
        return this.assigned;
    }
    /**
     * Gets the available property value. The available property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAvailable() {
        return this.available;
    }
    /**
     * Gets the exercised property value. The exercised property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExercised() {
        return this.exercised;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assigned", (n) -> { this.setAssigned(n.getIntegerValue()); });
        deserializerMap.put("available", (n) -> { this.setAvailable(n.getIntegerValue()); });
        deserializerMap.put("exercised", (n) -> { this.setExercised(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("assigned", this.getAssigned());
        writer.writeIntegerValue("available", this.getAvailable());
        writer.writeIntegerValue("exercised", this.getExercised());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the assigned property value. The assigned property
     * @param value Value to set for the assigned property.
     */
    public void setAssigned(@jakarta.annotation.Nullable final Integer value) {
        this.assigned = value;
    }
    /**
     * Sets the available property value. The available property
     * @param value Value to set for the available property.
     */
    public void setAvailable(@jakarta.annotation.Nullable final Integer value) {
        this.available = value;
    }
    /**
     * Sets the exercised property value. The exercised property
     * @param value Value to set for the exercised property.
     */
    public void setExercised(@jakarta.annotation.Nullable final Integer value) {
        this.exercised = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
