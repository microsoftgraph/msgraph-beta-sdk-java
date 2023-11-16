package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpressionEvaluationDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ExpressionEvaluationDetails and sets the default values.
     */
    public ExpressionEvaluationDetails() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExpressionEvaluationDetails
     */
    @jakarta.annotation.Nonnull
    public static ExpressionEvaluationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpressionEvaluationDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the expression property value. Represents expression which has been evaluated.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpression() {
        return this.BackingStore.get("expression");
    }
    /**
     * Gets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @return a java.util.List<ExpressionEvaluationDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExpressionEvaluationDetails> getExpressionEvaluationDetails() {
        return this.BackingStore.get("expressionEvaluationDetails");
    }
    /**
     * Gets the expressionResult property value. Represents the value of the result of the current expression.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExpressionResult() {
        return this.BackingStore.get("expressionResult");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @return a PropertyToEvaluate
     */
    @jakarta.annotation.Nullable
    public PropertyToEvaluate getPropertyToEvaluate() {
        return this.BackingStore.get("propertyToEvaluate");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the expression property value. Represents expression which has been evaluated.
     * @param value Value to set for the expression property.
     */
    public void setExpression(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("expression", value);
    }
    /**
     * Sets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @param value Value to set for the expressionEvaluationDetails property.
     */
    public void setExpressionEvaluationDetails(@jakarta.annotation.Nullable final java.util.List<ExpressionEvaluationDetails> value) {
        this.BackingStore.set("expressionEvaluationDetails", value);
    }
    /**
     * Sets the expressionResult property value. Represents the value of the result of the current expression.
     * @param value Value to set for the expressionResult property.
     */
    public void setExpressionResult(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("expressionResult", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @param value Value to set for the propertyToEvaluate property.
     */
    public void setPropertyToEvaluate(@jakarta.annotation.Nullable final PropertyToEvaluate value) {
        this.BackingStore.set("propertyToEvaluate", value);
    }
}
