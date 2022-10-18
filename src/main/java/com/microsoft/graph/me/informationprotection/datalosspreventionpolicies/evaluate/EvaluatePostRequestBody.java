package com.microsoft.graph.me.informationprotection.datalosspreventionpolicies.evaluate;

import com.microsoft.graph.models.DlpEvaluationInput;
import com.microsoft.graph.models.DlpNotification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the evaluate method. */
public class EvaluatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The evaluationInput property */
    private DlpEvaluationInput _evaluationInput;
    /** The notificationInfo property */
    private DlpNotification _notificationInfo;
    /** The target property */
    private String _target;
    /**
     * Instantiates a new evaluatePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EvaluatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
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
     * Gets the evaluationInput property value. The evaluationInput property
     * @return a dlpEvaluationInput
     */
    @javax.annotation.Nullable
    public DlpEvaluationInput getEvaluationInput() {
        return this._evaluationInput;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluatePostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("evaluationInput", (n) -> { currentObject.setEvaluationInput(n.getObjectValue(DlpEvaluationInput::createFromDiscriminatorValue)); });
            this.put("notificationInfo", (n) -> { currentObject.setNotificationInfo(n.getObjectValue(DlpNotification::createFromDiscriminatorValue)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notificationInfo property value. The notificationInfo property
     * @return a dlpNotification
     */
    @javax.annotation.Nullable
    public DlpNotification getNotificationInfo() {
        return this._notificationInfo;
    }
    /**
     * Gets the target property value. The target property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("evaluationInput", this.getEvaluationInput());
        writer.writeObjectValue("notificationInfo", this.getNotificationInfo());
        writer.writeStringValue("target", this.getTarget());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the evaluationInput property value. The evaluationInput property
     * @param value Value to set for the evaluationInput property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluationInput(@javax.annotation.Nullable final DlpEvaluationInput value) {
        this._evaluationInput = value;
    }
    /**
     * Sets the notificationInfo property value. The notificationInfo property
     * @param value Value to set for the notificationInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationInfo(@javax.annotation.Nullable final DlpNotification value) {
        this._notificationInfo = value;
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final String value) {
        this._target = value;
    }
}
