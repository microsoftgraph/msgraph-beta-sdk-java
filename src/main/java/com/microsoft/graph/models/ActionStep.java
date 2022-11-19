package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ActionStep implements AdditionalDataHolder, Parsable {
    /** The actionUrl property */
    private ActionUrl _actionUrl;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The stepNumber property */
    private Long _stepNumber;
    /** The text property */
    private String _text;
    /**
     * Instantiates a new actionStep and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ActionStep() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.actionStep");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a actionStep
     */
    @javax.annotation.Nonnull
    public static ActionStep createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActionStep();
    }
    /**
     * Gets the actionUrl property value. The actionUrl property
     * @return a actionUrl
     */
    @javax.annotation.Nullable
    public ActionUrl getActionUrl() {
        return this._actionUrl;
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
        final ActionStep currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("actionUrl", (n) -> { currentObject.setActionUrl(n.getObjectValue(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("stepNumber", (n) -> { currentObject.setStepNumber(n.getLongValue()); });
        deserializerMap.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
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
     * Gets the stepNumber property value. The stepNumber property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getStepNumber() {
        return this._stepNumber;
    }
    /**
     * Gets the text property value. The text property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actionUrl", this.getActionUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("stepNumber", this.getStepNumber());
        writer.writeStringValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionUrl property value. The actionUrl property
     * @param value Value to set for the actionUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionUrl(@javax.annotation.Nullable final ActionUrl value) {
        this._actionUrl = value;
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
     * Sets the stepNumber property value. The stepNumber property
     * @param value Value to set for the stepNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStepNumber(@javax.annotation.Nullable final Long value) {
        this._stepNumber = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
}
