package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PayloadCoachmark implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The coachmark location.
     */
    private CoachmarkLocation coachmarkLocation;
    /**
     * The description about the coachmark.
     */
    private String description;
    /**
     * The coachmark indicator.
     */
    private String indicator;
    /**
     * Indicates whether the coachmark is valid or not.
     */
    private Boolean isValid;
    /**
     * The coachmark language.
     */
    private String language;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The coachmark order.
     */
    private String order;
    /**
     * Instantiates a new payloadCoachmark and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PayloadCoachmark() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a payloadCoachmark
     */
    @jakarta.annotation.Nonnull
    public static PayloadCoachmark createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadCoachmark();
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
     * Gets the coachmarkLocation property value. The coachmark location.
     * @return a coachmarkLocation
     */
    @jakarta.annotation.Nullable
    public CoachmarkLocation getCoachmarkLocation() {
        return this.coachmarkLocation;
    }
    /**
     * Gets the description property value. The description about the coachmark.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("coachmarkLocation", (n) -> { this.setCoachmarkLocation(n.getObjectValue(CoachmarkLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("indicator", (n) -> { this.setIndicator(n.getStringValue()); });
        deserializerMap.put("isValid", (n) -> { this.setIsValid(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indicator property value. The coachmark indicator.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIndicator() {
        return this.indicator;
    }
    /**
     * Gets the isValid property value. Indicates whether the coachmark is valid or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValid() {
        return this.isValid;
    }
    /**
     * Gets the language property value. The coachmark language.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
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
     * Gets the order property value. The coachmark order.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrder() {
        return this.order;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("coachmarkLocation", this.getCoachmarkLocation());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("indicator", this.getIndicator());
        writer.writeBooleanValue("isValid", this.getIsValid());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("order", this.getOrder());
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
     * Sets the coachmarkLocation property value. The coachmark location.
     * @param value Value to set for the coachmarkLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCoachmarkLocation(@jakarta.annotation.Nullable final CoachmarkLocation value) {
        this.coachmarkLocation = value;
    }
    /**
     * Sets the description property value. The description about the coachmark.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the indicator property value. The coachmark indicator.
     * @param value Value to set for the indicator property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIndicator(@jakarta.annotation.Nullable final String value) {
        this.indicator = value;
    }
    /**
     * Sets the isValid property value. Indicates whether the coachmark is valid or not.
     * @param value Value to set for the isValid property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsValid(@jakarta.annotation.Nullable final Boolean value) {
        this.isValid = value;
    }
    /**
     * Sets the language property value. The coachmark language.
     * @param value Value to set for the language property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
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
     * Sets the order property value. The coachmark order.
     * @param value Value to set for the order property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOrder(@jakarta.annotation.Nullable final String value) {
        this.order = value;
    }
}
