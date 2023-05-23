package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventRegistrationQuestion extends Entity implements Parsable {
    /** The answerChoices property */
    private java.util.List<String> answerChoices;
    /** The answerInputType property */
    private VirtualEventRegistrationQuestionAnswerInputType answerInputType;
    /** The displayName property */
    private String displayName;
    /** The isRequired property */
    private Boolean isRequired;
    /**
     * Instantiates a new virtualEventRegistrationQuestion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventRegistrationQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventRegistrationQuestion
     */
    @javax.annotation.Nonnull
    public static VirtualEventRegistrationQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationQuestion();
    }
    /**
     * Gets the answerChoices property value. The answerChoices property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAnswerChoices() {
        return this.answerChoices;
    }
    /**
     * Gets the answerInputType property value. The answerInputType property
     * @return a virtualEventRegistrationQuestionAnswerInputType
     */
    @javax.annotation.Nullable
    public VirtualEventRegistrationQuestionAnswerInputType getAnswerInputType() {
        return this.answerInputType;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerChoices", (n) -> { this.setAnswerChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(VirtualEventRegistrationQuestionAnswerInputType.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. The isRequired property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("answerChoices", this.getAnswerChoices());
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
    }
    /**
     * Sets the answerChoices property value. The answerChoices property
     * @param value Value to set for the answerChoices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswerChoices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.answerChoices = value;
    }
    /**
     * Sets the answerInputType property value. The answerInputType property
     * @param value Value to set for the answerInputType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswerInputType(@javax.annotation.Nullable final VirtualEventRegistrationQuestionAnswerInputType value) {
        this.answerInputType = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isRequired property value. The isRequired property
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
}
