package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActionStep implements AdditionalDataHolder, Parsable {
    /**
     * A link to the documentation or Azure portal page that is associated with the action step.
     */
    private ActionUrl actionUrl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the position for this action in the order of the collection of actions to be taken.
     */
    private Long stepNumber;
    /**
     * Friendly description of the action to take.
     */
    private String text;
    /**
     * Instantiates a new actionStep and sets the default values.
     */
    public ActionStep() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a actionStep
     */
    @jakarta.annotation.Nonnull
    public static ActionStep createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActionStep();
    }
    /**
     * Gets the actionUrl property value. A link to the documentation or Azure portal page that is associated with the action step.
     * @return a actionUrl
     */
    @jakarta.annotation.Nullable
    public ActionUrl getActionUrl() {
        return this.actionUrl;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("actionUrl", (n) -> { this.setActionUrl(n.getObjectValue(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("stepNumber", (n) -> { this.setStepNumber(n.getLongValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
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
     * Gets the stepNumber property value. Indicates the position for this action in the order of the collection of actions to be taken.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getStepNumber() {
        return this.stepNumber;
    }
    /**
     * Gets the text property value. Friendly description of the action to take.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actionUrl", this.getActionUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("stepNumber", this.getStepNumber());
        writer.writeStringValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionUrl property value. A link to the documentation or Azure portal page that is associated with the action step.
     * @param value Value to set for the actionUrl property.
     */
    public void setActionUrl(@jakarta.annotation.Nullable final ActionUrl value) {
        this.actionUrl = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the stepNumber property value. Indicates the position for this action in the order of the collection of actions to be taken.
     * @param value Value to set for the stepNumber property.
     */
    public void setStepNumber(@jakarta.annotation.Nullable final Long value) {
        this.stepNumber = value;
    }
    /**
     * Sets the text property value. Friendly description of the action to take.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
}
