package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistrationQuestion extends Entity implements Parsable {
    /**
     * Answer input type of the custom registration question.
     */
    private AnswerInputType answerInputType;
    /**
     * Answer options when answerInputType is radioButton.
     */
    private java.util.List<String> answerOptions;
    /**
     * Display name of the custom registration question.
     */
    private String displayName;
    /**
     * Indicates whether the question is required. Default value is false.
     */
    private Boolean isRequired;
    /**
     * Instantiates a new meetingRegistrationQuestion and sets the default values.
     */
    public MeetingRegistrationQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingRegistrationQuestion
     */
    @jakarta.annotation.Nonnull
    public static MeetingRegistrationQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrationQuestion();
    }
    /**
     * Gets the answerInputType property value. Answer input type of the custom registration question.
     * @return a answerInputType
     */
    @jakarta.annotation.Nullable
    public AnswerInputType getAnswerInputType() {
        return this.answerInputType;
    }
    /**
     * Gets the answerOptions property value. Answer options when answerInputType is radioButton.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAnswerOptions() {
        return this.answerOptions;
    }
    /**
     * Gets the displayName property value. Display name of the custom registration question.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(AnswerInputType.class)); });
        deserializerMap.put("answerOptions", (n) -> { this.setAnswerOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates whether the question is required. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeCollectionOfPrimitiveValues("answerOptions", this.getAnswerOptions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
    }
    /**
     * Sets the answerInputType property value. Answer input type of the custom registration question.
     * @param value Value to set for the answerInputType property.
     */
    public void setAnswerInputType(@jakarta.annotation.Nullable final AnswerInputType value) {
        this.answerInputType = value;
    }
    /**
     * Sets the answerOptions property value. Answer options when answerInputType is radioButton.
     * @param value Value to set for the answerOptions property.
     */
    public void setAnswerOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.answerOptions = value;
    }
    /**
     * Sets the displayName property value. Display name of the custom registration question.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isRequired property value. Indicates whether the question is required. Default value is false.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
}
