package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpressionEvaluationDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents expression which has been evaluated.
     */
    private String expression;
    /**
     * Represents the details of the evaluation of the expression.
     */
    private java.util.List<ExpressionEvaluationDetails> expressionEvaluationDetails;
    /**
     * Represents the value of the result of the current expression.
     */
    private Boolean expressionResult;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines the name of the property and the value of that property.
     */
    private PropertyToEvaluate propertyToEvaluate;
    /**
     * Instantiates a new expressionEvaluationDetails and sets the default values.
     */
    public ExpressionEvaluationDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a expressionEvaluationDetails
     */
    @jakarta.annotation.Nonnull
    public static ExpressionEvaluationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpressionEvaluationDetails();
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
     * Gets the expression property value. Represents expression which has been evaluated.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExpression() {
        return this.expression;
    }
    /**
     * Gets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @return a expressionEvaluationDetails
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExpressionEvaluationDetails> getExpressionEvaluationDetails() {
        return this.expressionEvaluationDetails;
    }
    /**
     * Gets the expressionResult property value. Represents the value of the result of the current expression.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExpressionResult() {
        return this.expressionResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("expression", (n) -> { this.setExpression(n.getStringValue()); });
        deserializerMap.put("expressionEvaluationDetails", (n) -> { this.setExpressionEvaluationDetails(n.getCollectionOfObjectValues(ExpressionEvaluationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("expressionResult", (n) -> { this.setExpressionResult(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyToEvaluate", (n) -> { this.setPropertyToEvaluate(n.getObjectValue(PropertyToEvaluate::createFromDiscriminatorValue)); });
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
     * Gets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @return a propertyToEvaluate
     */
    @jakarta.annotation.Nullable
    public PropertyToEvaluate getPropertyToEvaluate() {
        return this.propertyToEvaluate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeCollectionOfObjectValues("expressionEvaluationDetails", this.getExpressionEvaluationDetails());
        writer.writeBooleanValue("expressionResult", this.getExpressionResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("propertyToEvaluate", this.getPropertyToEvaluate());
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
     * Sets the expression property value. Represents expression which has been evaluated.
     * @param value Value to set for the expression property.
     */
    public void setExpression(@jakarta.annotation.Nullable final String value) {
        this.expression = value;
    }
    /**
     * Sets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @param value Value to set for the expressionEvaluationDetails property.
     */
    public void setExpressionEvaluationDetails(@jakarta.annotation.Nullable final java.util.List<ExpressionEvaluationDetails> value) {
        this.expressionEvaluationDetails = value;
    }
    /**
     * Sets the expressionResult property value. Represents the value of the result of the current expression.
     * @param value Value to set for the expressionResult property.
     */
    public void setExpressionResult(@jakarta.annotation.Nullable final Boolean value) {
        this.expressionResult = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @param value Value to set for the propertyToEvaluate property.
     */
    public void setPropertyToEvaluate(@jakarta.annotation.Nullable final PropertyToEvaluate value) {
        this.propertyToEvaluate = value;
    }
}
