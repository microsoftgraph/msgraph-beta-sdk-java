package com.microsoft.graph.beta.models.devicemanagement;

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
public class RuleCondition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RuleCondition} and sets the default values.
     */
    public RuleCondition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RuleCondition}
     */
    @jakarta.annotation.Nonnull
    public static RuleCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleCondition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the aggregation property value. The built-in aggregation method for the rule condition. The possible values are: count, percentage, affectedCloudPcCount, affectedCloudPcPercentage, unknownFutureValue.
     * @return a {@link AggregationType}
     */
    @jakarta.annotation.Nullable
    public AggregationType getAggregation() {
        return this.backingStore.get("aggregation");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the conditionCategory property value. The property that the rule condition monitors. Possible values are:  provisionFailures, imageUploadFailures, azureNetworkConnectionCheckFailures, cloudPcInGracePeriod, frontlineInsufficientLicenses, cloudPcConnectionErrors, cloudPcHostHealthCheckFailures, cloudPcZoneOutage, unknownFutureValue.
     * @return a {@link ConditionCategory}
     */
    @jakarta.annotation.Nullable
    public ConditionCategory getConditionCategory() {
        return this.backingStore.get("conditionCategory");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("aggregation", (n) -> { this.setAggregation(n.getEnumValue(AggregationType::forValue)); });
        deserializerMap.put("conditionCategory", (n) -> { this.setConditionCategory(n.getEnumValue(ConditionCategory::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(OperatorType::forValue)); });
        deserializerMap.put("relationshipType", (n) -> { this.setRelationshipType(n.getEnumValue(RelationshipType::forValue)); });
        deserializerMap.put("thresholdValue", (n) -> { this.setThresholdValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operator property value. The built-in operator for the rule condition. The possible values are: greaterOrEqual, equal, greater, less, lessOrEqual, notEqual, unknownFutureValue.
     * @return a {@link OperatorType}
     */
    @jakarta.annotation.Nullable
    public OperatorType getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the relationshipType property value. The relationship type.  Possible values are: and, or.
     * @return a {@link RelationshipType}
     */
    @jakarta.annotation.Nullable
    public RelationshipType getRelationshipType() {
        return this.backingStore.get("relationshipType");
    }
    /**
     * Gets the thresholdValue property value. The threshold value of the alert condition. The threshold value can be a number in string form or string like 'WestUS'.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThresholdValue() {
        return this.backingStore.get("thresholdValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("aggregation", this.getAggregation());
        writer.writeEnumValue("conditionCategory", this.getConditionCategory());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeEnumValue("relationshipType", this.getRelationshipType());
        writer.writeStringValue("thresholdValue", this.getThresholdValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the aggregation property value. The built-in aggregation method for the rule condition. The possible values are: count, percentage, affectedCloudPcCount, affectedCloudPcPercentage, unknownFutureValue.
     * @param value Value to set for the aggregation property.
     */
    public void setAggregation(@jakarta.annotation.Nullable final AggregationType value) {
        this.backingStore.set("aggregation", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the conditionCategory property value. The property that the rule condition monitors. Possible values are:  provisionFailures, imageUploadFailures, azureNetworkConnectionCheckFailures, cloudPcInGracePeriod, frontlineInsufficientLicenses, cloudPcConnectionErrors, cloudPcHostHealthCheckFailures, cloudPcZoneOutage, unknownFutureValue.
     * @param value Value to set for the conditionCategory property.
     */
    public void setConditionCategory(@jakarta.annotation.Nullable final ConditionCategory value) {
        this.backingStore.set("conditionCategory", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operator property value. The built-in operator for the rule condition. The possible values are: greaterOrEqual, equal, greater, less, lessOrEqual, notEqual, unknownFutureValue.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final OperatorType value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the relationshipType property value. The relationship type.  Possible values are: and, or.
     * @param value Value to set for the relationshipType property.
     */
    public void setRelationshipType(@jakarta.annotation.Nullable final RelationshipType value) {
        this.backingStore.set("relationshipType", value);
    }
    /**
     * Sets the thresholdValue property value. The threshold value of the alert condition. The threshold value can be a number in string form or string like 'WestUS'.
     * @param value Value to set for the thresholdValue property.
     */
    public void setThresholdValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thresholdValue", value);
    }
}
