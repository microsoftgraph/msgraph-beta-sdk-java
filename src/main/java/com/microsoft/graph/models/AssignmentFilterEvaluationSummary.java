package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represent result summary for assignment filter evaluation  */
public class AssignmentFilterEvaluationSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The admin defined name for assignment filter.  */
    private String _assignmentFilterDisplayName;
    /** Unique identifier for the assignment filter object  */
    private String _assignmentFilterId;
    /** The time the assignment filter was last modified.  */
    private OffsetDateTime _assignmentFilterLastModifiedDateTime;
    /** The platform for which this assignment filter is created. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.  */
    private DevicePlatformType _assignmentFilterPlatform;
    /** Indicate filter type either include or exclude. Possible values are: none, include, exclude.  */
    private DeviceAndAppManagementAssignmentFilterType _assignmentFilterType;
    /** A collection of filter types and their corresponding evaluation results.  */
    private java.util.List<AssignmentFilterTypeAndEvaluationResult> _assignmentFilterTypeAndEvaluationResults;
    /** The time assignment filter was evaluated.  */
    private OffsetDateTime _evaluationDateTime;
    /** Assignment filter evaluation result. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated.  */
    private AssignmentFilterEvaluationResult _evaluationResult;
    /**
     * Instantiates a new assignmentFilterEvaluationSummary and sets the default values.
     * @return a void
     */
    public AssignmentFilterEvaluationSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterEvaluationSummary
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
        return this._additionalData;
    }
    /**
     * Gets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentFilterDisplayName() {
        return this._assignmentFilterDisplayName;
    }
    /**
     * Gets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentFilterId() {
        return this._assignmentFilterId;
    }
    /**
     * Gets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignmentFilterLastModifiedDateTime() {
        return this._assignmentFilterLastModifiedDateTime;
    }
    /**
     * Gets the assignmentFilterPlatform property value. The platform for which this assignment filter is created. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getAssignmentFilterPlatform() {
        return this._assignmentFilterPlatform;
    }
    /**
     * Gets the assignmentFilterType property value. Indicate filter type either include or exclude. Possible values are: none, include, exclude.
     * @return a deviceAndAppManagementAssignmentFilterType
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getAssignmentFilterType() {
        return this._assignmentFilterType;
    }
    /**
     * Gets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @return a assignmentFilterTypeAndEvaluationResult
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterTypeAndEvaluationResult> getAssignmentFilterTypeAndEvaluationResults() {
        return this._assignmentFilterTypeAndEvaluationResults;
    }
    /**
     * Gets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEvaluationDateTime() {
        return this._evaluationDateTime;
    }
    /**
     * Gets the evaluationResult property value. Assignment filter evaluation result. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated.
     * @return a assignmentFilterEvaluationResult
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluationResult getEvaluationResult() {
        return this._evaluationResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignmentFilterEvaluationSummary currentObject = this;
        return new HashMap<>(8) {{
            this.put("assignmentFilterDisplayName", (n) -> { currentObject.setAssignmentFilterDisplayName(n.getStringValue()); });
            this.put("assignmentFilterId", (n) -> { currentObject.setAssignmentFilterId(n.getStringValue()); });
            this.put("assignmentFilterLastModifiedDateTime", (n) -> { currentObject.setAssignmentFilterLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("assignmentFilterPlatform", (n) -> { currentObject.setAssignmentFilterPlatform(n.getEnumValue(DevicePlatformType.class)); });
            this.put("assignmentFilterType", (n) -> { currentObject.setAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
            this.put("assignmentFilterTypeAndEvaluationResults", (n) -> { currentObject.setAssignmentFilterTypeAndEvaluationResults(n.getCollectionOfObjectValues(AssignmentFilterTypeAndEvaluationResult::createFromDiscriminatorValue)); });
            this.put("evaluationDateTime", (n) -> { currentObject.setEvaluationDateTime(n.getOffsetDateTimeValue()); });
            this.put("evaluationResult", (n) -> { currentObject.setEvaluationResult(n.getEnumValue(AssignmentFilterEvaluationResult.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignmentFilterDisplayName property value. The admin defined name for assignment filter.
     * @param value Value to set for the assignmentFilterDisplayName property.
     * @return a void
     */
    public void setAssignmentFilterDisplayName(@javax.annotation.Nullable final String value) {
        this._assignmentFilterDisplayName = value;
    }
    /**
     * Sets the assignmentFilterId property value. Unique identifier for the assignment filter object
     * @param value Value to set for the assignmentFilterId property.
     * @return a void
     */
    public void setAssignmentFilterId(@javax.annotation.Nullable final String value) {
        this._assignmentFilterId = value;
    }
    /**
     * Sets the assignmentFilterLastModifiedDateTime property value. The time the assignment filter was last modified.
     * @param value Value to set for the assignmentFilterLastModifiedDateTime property.
     * @return a void
     */
    public void setAssignmentFilterLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._assignmentFilterLastModifiedDateTime = value;
    }
    /**
     * Sets the assignmentFilterPlatform property value. The platform for which this assignment filter is created. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @param value Value to set for the assignmentFilterPlatform property.
     * @return a void
     */
    public void setAssignmentFilterPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._assignmentFilterPlatform = value;
    }
    /**
     * Sets the assignmentFilterType property value. Indicate filter type either include or exclude. Possible values are: none, include, exclude.
     * @param value Value to set for the assignmentFilterType property.
     * @return a void
     */
    public void setAssignmentFilterType(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this._assignmentFilterType = value;
    }
    /**
     * Sets the assignmentFilterTypeAndEvaluationResults property value. A collection of filter types and their corresponding evaluation results.
     * @param value Value to set for the assignmentFilterTypeAndEvaluationResults property.
     * @return a void
     */
    public void setAssignmentFilterTypeAndEvaluationResults(@javax.annotation.Nullable final java.util.List<AssignmentFilterTypeAndEvaluationResult> value) {
        this._assignmentFilterTypeAndEvaluationResults = value;
    }
    /**
     * Sets the evaluationDateTime property value. The time assignment filter was evaluated.
     * @param value Value to set for the evaluationDateTime property.
     * @return a void
     */
    public void setEvaluationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._evaluationDateTime = value;
    }
    /**
     * Sets the evaluationResult property value. Assignment filter evaluation result. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated.
     * @param value Value to set for the evaluationResult property.
     * @return a void
     */
    public void setEvaluationResult(@javax.annotation.Nullable final AssignmentFilterEvaluationResult value) {
        this._evaluationResult = value;
    }
}
