package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represent result summary for assignment filter evaluation
 */
public class AssignmentFilterEvaluationSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The admin defined name for assignment filter.
     */
    private String assignmentFilterDisplayName;
    /**
     * Unique identifier for the assignment filter object
     */
    private String assignmentFilterId;
    /**
     * The time the assignment filter was last modified.
     */
    private OffsetDateTime assignmentFilterLastModifiedDateTime;
    /**
     * Supported platform types.
     */
    private DevicePlatformType assignmentFilterPlatform;
    /**
     * Represents type of the assignment filter.
     */
    private DeviceAndAppManagementAssignmentFilterType assignmentFilterType;
    /**
     * A collection of filter types and their corresponding evaluation results.
     */
    private java.util.List<AssignmentFilterTypeAndEvaluationResult> assignmentFilterTypeAndEvaluationResults;
    /**
     * The time assignment filter was evaluated.
     */
    private OffsetDateTime evaluationDateTime;
    /**
     * Supported evaluation results for filter.
     */
    private AssignmentFilterEvaluationResult evaluationResult;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new AssignmentFilterEvaluationSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluationSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignmentFilterEvaluationSummary
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterEvaluationSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterEvaluationSummary();
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
     * Gets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentFilterDisplayName() {
        return this.assignmentFilterDisplayName;
    }
    /**
     * Gets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentFilterId() {
        return this.assignmentFilterId;
    }
    /**
     * Gets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignmentFilterLastModifiedDateTime() {
        return this.assignmentFilterLastModifiedDateTime;
    }
    /**
     * Gets the assignmentFilterPlatform property value. Supported platform types.
     * @return a DevicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getAssignmentFilterPlatform() {
        return this.assignmentFilterPlatform;
    }
    /**
     * Gets the assignmentFilterType property value. Represents type of the assignment filter.
     * @return a DeviceAndAppManagementAssignmentFilterType
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getAssignmentFilterType() {
        return this.assignmentFilterType;
    }
    /**
     * Gets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @return a assignmentFilterTypeAndEvaluationResult
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterTypeAndEvaluationResult> getAssignmentFilterTypeAndEvaluationResults() {
        return this.assignmentFilterTypeAndEvaluationResults;
    }
    /**
     * Gets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEvaluationDateTime() {
        return this.evaluationDateTime;
    }
    /**
     * Gets the evaluationResult property value. Supported evaluation results for filter.
     * @return a AssignmentFilterEvaluationResult
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluationResult getEvaluationResult() {
        return this.evaluationResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @param value Value to set for the assignmentFilterDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterDisplayName(@javax.annotation.Nullable final String value) {
        this.assignmentFilterDisplayName = value;
    }
    /**
     * Sets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @param value Value to set for the assignmentFilterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterId(@javax.annotation.Nullable final String value) {
        this.assignmentFilterId = value;
    }
    /**
     * Sets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @param value Value to set for the assignmentFilterLastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.assignmentFilterLastModifiedDateTime = value;
    }
    /**
     * Sets the assignmentFilterPlatform property value. Supported platform types.
     * @param value Value to set for the assignmentFilterPlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this.assignmentFilterPlatform = value;
    }
    /**
     * Sets the assignmentFilterType property value. Represents type of the assignment filter.
     * @param value Value to set for the assignmentFilterType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterType(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this.assignmentFilterType = value;
    }
    /**
     * Sets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @param value Value to set for the assignmentFilterTypeAndEvaluationResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterTypeAndEvaluationResults(@javax.annotation.Nullable final java.util.List<AssignmentFilterTypeAndEvaluationResult> value) {
        this.assignmentFilterTypeAndEvaluationResults = value;
    }
    /**
     * Sets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @param value Value to set for the evaluationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.evaluationDateTime = value;
    }
    /**
     * Sets the evaluationResult property value. Supported evaluation results for filter.
     * @param value Value to set for the evaluationResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluationResult(@javax.annotation.Nullable final AssignmentFilterEvaluationResult value) {
        this.evaluationResult = value;
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
}
