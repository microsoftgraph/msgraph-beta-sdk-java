package com.microsoft.graph.sites.item.informationprotection.datalosspreventionpolicies.evaluate;

import com.microsoft.graph.models.DlpEvaluationInput;
import com.microsoft.graph.models.DlpNotification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EvaluatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The evaluationInput property
     */
    private DlpEvaluationInput evaluationInput;
    /**
     * The notificationInfo property
     */
    private DlpNotification notificationInfo;
    /**
     * The target property
     */
    private String target;
    /**
     * Instantiates a new evaluatePostRequestBody and sets the default values.
     */
    public EvaluatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
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
     * Gets the evaluationInput property value. The evaluationInput property
     * @return a dlpEvaluationInput
     */
    @jakarta.annotation.Nullable
    public DlpEvaluationInput getEvaluationInput() {
        return this.evaluationInput;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("evaluationInput", (n) -> { this.setEvaluationInput(n.getObjectValue(DlpEvaluationInput::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationInfo", (n) -> { this.setNotificationInfo(n.getObjectValue(DlpNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationInfo property value. The notificationInfo property
     * @return a dlpNotification
     */
    @jakarta.annotation.Nullable
    public DlpNotification getNotificationInfo() {
        return this.notificationInfo;
    }
    /**
     * Gets the target property value. The target property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("evaluationInput", this.getEvaluationInput());
        writer.writeObjectValue("notificationInfo", this.getNotificationInfo());
        writer.writeStringValue("target", this.getTarget());
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
     * Sets the evaluationInput property value. The evaluationInput property
     * @param value Value to set for the evaluationInput property.
     */
    public void setEvaluationInput(@jakarta.annotation.Nullable final DlpEvaluationInput value) {
        this.evaluationInput = value;
    }
    /**
     * Sets the notificationInfo property value. The notificationInfo property
     * @param value Value to set for the notificationInfo property.
     */
    public void setNotificationInfo(@jakarta.annotation.Nullable final DlpNotification value) {
        this.notificationInfo = value;
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final String value) {
        this.target = value;
    }
}
