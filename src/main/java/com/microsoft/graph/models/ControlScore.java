package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ControlScore implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The controlCategory property
     */
    private String controlCategory;
    /**
     * The controlName property
     */
    private String controlName;
    /**
     * The description property
     */
    private String description;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The score property
     */
    private Double score;
    /**
     * Instantiates a new controlScore and sets the default values.
     */
    public ControlScore() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a controlScore
     */
    @jakarta.annotation.Nonnull
    public static ControlScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ControlScore();
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
     * Gets the controlCategory property value. The controlCategory property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getControlCategory() {
        return this.controlCategory;
    }
    /**
     * Gets the controlName property value. The controlName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getControlName() {
        return this.controlName;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("controlCategory", (n) -> { this.setControlCategory(n.getStringValue()); });
        deserializerMap.put("controlName", (n) -> { this.setControlName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getDoubleValue()); });
        return deserializerMap;
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
     * Gets the score property value. The score property
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getScore() {
        return this.score;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("controlCategory", this.getControlCategory());
        writer.writeStringValue("controlName", this.getControlName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("score", this.getScore());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the controlCategory property value. The controlCategory property
     * @param value Value to set for the controlCategory property.
     */
    public void setControlCategory(@jakarta.annotation.Nullable final String value) {
        this.controlCategory = value;
    }
    /**
     * Sets the controlName property value. The controlName property
     * @param value Value to set for the controlName property.
     */
    public void setControlName(@jakarta.annotation.Nullable final String value) {
        this.controlName = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the score property value. The score property
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Double value) {
        this.score = value;
    }
}
