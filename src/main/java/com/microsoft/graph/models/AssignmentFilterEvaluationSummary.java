package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represent result summary for assignment filter evaluation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentFilterEvaluationSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AssignmentFilterEvaluationSummary and sets the default values.
     */
    public AssignmentFilterEvaluationSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignmentFilterEvaluationSummary
     */
    @jakarta.annotation.Nonnull
    public static AssignmentFilterEvaluationSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterEvaluationSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentFilterDisplayName() {
        return this.backingStore.get("assignmentFilterDisplayName");
    }
    /**
     * Gets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentFilterId() {
        return this.backingStore.get("assignmentFilterId");
    }
    /**
     * Gets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignmentFilterLastModifiedDateTime() {
        return this.backingStore.get("assignmentFilterLastModifiedDateTime");
    }
    /**
     * Gets the assignmentFilterPlatform property value. Supported platform types.
     * @return a DevicePlatformType
     */
    @jakarta.annotation.Nullable
    public DevicePlatformType getAssignmentFilterPlatform() {
        return this.backingStore.get("assignmentFilterPlatform");
    }
    /**
     * Gets the assignmentFilterType property value. Represents type of the assignment filter.
     * @return a DeviceAndAppManagementAssignmentFilterType
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getAssignmentFilterType() {
        return this.backingStore.get("assignmentFilterType");
    }
    /**
     * Gets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @return a java.util.List<AssignmentFilterTypeAndEvaluationResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentFilterTypeAndEvaluationResult> getAssignmentFilterTypeAndEvaluationResults() {
        return this.backingStore.get("assignmentFilterTypeAndEvaluationResults");
    }
    /**
     * Gets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEvaluationDateTime() {
        return this.backingStore.get("evaluationDateTime");
    }
    /**
     * Gets the evaluationResult property value. Supported evaluation results for filter.
     * @return a AssignmentFilterEvaluationResult
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterEvaluationResult getEvaluationResult() {
        return this.backingStore.get("evaluationResult");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("assignmentFilterDisplayName", (n) -> { this.setAssignmentFilterDisplayName(n.getStringValue()); });
        deserializerMap.put("assignmentFilterId", (n) -> { this.setAssignmentFilterId(n.getStringValue()); });
        deserializerMap.put("assignmentFilterLastModifiedDateTime", (n) -> { this.setAssignmentFilterLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignmentFilterPlatform", (n) -> { this.setAssignmentFilterPlatform(n.getEnumValue(DevicePlatformType.class)); });
        deserializerMap.put("assignmentFilterType", (n) -> { this.setAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
        deserializerMap.put("assignmentFilterTypeAndEvaluationResults", (n) -> { this.setAssignmentFilterTypeAndEvaluationResults(n.getCollectionOfObjectValues(AssignmentFilterTypeAndEvaluationResult::createFromDiscriminatorValue)); });
        deserializerMap.put("evaluationDateTime", (n) -> { this.setEvaluationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("evaluationResult", (n) -> { this.setEvaluationResult(n.getEnumValue(AssignmentFilterEvaluationResult.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignmentFilterDisplayName", this.getAssignmentFilterDisplayName());
        writer.writeStringValue("assignmentFilterId", this.getAssignmentFilterId());
        writer.writeOffsetDateTimeValue("assignmentFilterLastModifiedDateTime", this.getAssignmentFilterLastModifiedDateTime());
        writer.writeEnumValue("assignmentFilterPlatform", this.getAssignmentFilterPlatform());
        writer.writeEnumValue("assignmentFilterType", this.getAssignmentFilterType());
        writer.writeCollectionOfObjectValues("assignmentFilterTypeAndEvaluationResults", this.getAssignmentFilterTypeAndEvaluationResults());
        writer.writeOffsetDateTimeValue("evaluationDateTime", this.getEvaluationDateTime());
        writer.writeEnumValue("evaluationResult", this.getEvaluationResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @param value Value to set for the assignmentFilterDisplayName property.
     */
    public void setAssignmentFilterDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentFilterDisplayName", value);
    }
    /**
     * Sets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @param value Value to set for the assignmentFilterId property.
     */
    public void setAssignmentFilterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentFilterId", value);
    }
    /**
     * Sets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @param value Value to set for the assignmentFilterLastModifiedDateTime property.
     */
    public void setAssignmentFilterLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("assignmentFilterLastModifiedDateTime", value);
    }
    /**
     * Sets the assignmentFilterPlatform property value. Supported platform types.
     * @param value Value to set for the assignmentFilterPlatform property.
     */
    public void setAssignmentFilterPlatform(@jakarta.annotation.Nullable final DevicePlatformType value) {
        this.backingStore.set("assignmentFilterPlatform", value);
    }
    /**
     * Sets the assignmentFilterType property value. Represents type of the assignment filter.
     * @param value Value to set for the assignmentFilterType property.
     */
    public void setAssignmentFilterType(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this.backingStore.set("assignmentFilterType", value);
    }
    /**
     * Sets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @param value Value to set for the assignmentFilterTypeAndEvaluationResults property.
     */
    public void setAssignmentFilterTypeAndEvaluationResults(@jakarta.annotation.Nullable final java.util.List<AssignmentFilterTypeAndEvaluationResult> value) {
        this.backingStore.set("assignmentFilterTypeAndEvaluationResults", value);
    }
    /**
     * Sets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @param value Value to set for the evaluationDateTime property.
     */
    public void setEvaluationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("evaluationDateTime", value);
    }
    /**
     * Sets the evaluationResult property value. Supported evaluation results for filter.
     * @param value Value to set for the evaluationResult property.
     */
    public void setEvaluationResult(@jakarta.annotation.Nullable final AssignmentFilterEvaluationResult value) {
        this.backingStore.set("evaluationResult", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
