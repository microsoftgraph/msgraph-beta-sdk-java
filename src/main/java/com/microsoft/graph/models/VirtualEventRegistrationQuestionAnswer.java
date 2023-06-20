package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventRegistrationQuestionAnswer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Boolean answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is boolean. */
    private Boolean booleanValue;
    /** Display name of the registration question. */
    private String displayName;
    /** Collection of text answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is multiChoice. */
    private java.util.List<String> multiChoiceValues;
    /** The OdataType property */
    private String odataType;
    /** id of the virtualEventRegistrationQuestion. */
    private String questionId;
    /** Text answer of the virtualEventRegistrationQuestion. Appears when answerInputType is text, multilineText or singleChoice. */
    private String value;
    /**
     * Instantiates a new virtualEventRegistrationQuestionAnswer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventRegistrationQuestionAnswer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventRegistrationQuestionAnswer
     */
    @javax.annotation.Nonnull
    public static VirtualEventRegistrationQuestionAnswer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationQuestionAnswer();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the booleanValue property value. Boolean answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is boolean.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }
    /**
     * Gets the displayName property value. Display name of the registration question.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("booleanValue", (n) -> { this.setBooleanValue(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("multiChoiceValues", (n) -> { this.setMultiChoiceValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("questionId", (n) -> { this.setQuestionId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multiChoiceValues property value. Collection of text answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is multiChoice.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMultiChoiceValues() {
        return this.multiChoiceValues;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the questionId property value. id of the virtualEventRegistrationQuestion.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuestionId() {
        return this.questionId;
    }
    /**
     * Gets the value property value. Text answer of the virtualEventRegistrationQuestion. Appears when answerInputType is text, multilineText or singleChoice.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("booleanValue", this.getBooleanValue());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("multiChoiceValues", this.getMultiChoiceValues());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("questionId", this.getQuestionId());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the booleanValue property value. Boolean answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is boolean.
     * @param value Value to set for the booleanValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBooleanValue(@javax.annotation.Nullable final Boolean value) {
        this.booleanValue = value;
    }
    /**
     * Sets the displayName property value. Display name of the registration question.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the multiChoiceValues property value. Collection of text answer of the virtualEventRegistrationQuestion. Only appears when answerInputType is multiChoice.
     * @param value Value to set for the multiChoiceValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiChoiceValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this.multiChoiceValues = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the questionId property value. id of the virtualEventRegistrationQuestion.
     * @param value Value to set for the questionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestionId(@javax.annotation.Nullable final String value) {
        this.questionId = value;
    }
    /**
     * Sets the value property value. Text answer of the virtualEventRegistrationQuestion. Appears when answerInputType is text, multilineText or singleChoice.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this.value = value;
    }
}
