package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationQuestion extends Entity implements Parsable {
    /**
     * Instantiates a new VirtualEventRegistrationQuestion and sets the default values.
     */
    public VirtualEventRegistrationQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventRegistrationQuestion
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationQuestion();
    }
    /**
     * Gets the answerChoices property value. Answer choices when answerInputType is singleChoice or multiChoice.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAnswerChoices() {
        return this.BackingStore.get("answerChoices");
    }
    /**
     * Gets the answerInputType property value. Input type of the registration question answer.
     * @return a VirtualEventRegistrationQuestionAnswerInputType
     */
    @jakarta.annotation.Nullable
    public VirtualEventRegistrationQuestionAnswerInputType getAnswerInputType() {
        return this.BackingStore.get("answerInputType");
    }
    /**
     * Gets the displayName property value. Display name of the registration question.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerChoices", (n) -> { this.setAnswerChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(VirtualEventRegistrationQuestionAnswerInputType.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates whether the question is required to answer. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.BackingStore.get("isRequired");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("answerChoices", this.getAnswerChoices());
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
    }
    /**
     * Sets the answerChoices property value. Answer choices when answerInputType is singleChoice or multiChoice.
     * @param value Value to set for the answerChoices property.
     */
    public void setAnswerChoices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("answerChoices", value);
    }
    /**
     * Sets the answerInputType property value. Input type of the registration question answer.
     * @param value Value to set for the answerInputType property.
     */
    public void setAnswerInputType(@jakarta.annotation.Nullable final VirtualEventRegistrationQuestionAnswerInputType value) {
        this.BackingStore.set("answerInputType", value);
    }
    /**
     * Sets the displayName property value. Display name of the registration question.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the isRequired property value. Indicates whether the question is required to answer. Default value is false.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isRequired", value);
    }
}
