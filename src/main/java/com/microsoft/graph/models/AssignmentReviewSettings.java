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
public class AssignmentReviewSettings implements AdditionalDataHolder, Parsable {
    /** The default decision to apply if the request is not reviewed within the period specified in durationInDays. The possible values are: acceptAccessRecommendation, keepAccess, removeAccess, and unknownFutureValue.  */
    private AccessReviewTimeoutBehavior _accessReviewTimeoutBehavior;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The number of days within which reviewers should provide input.  */
    private Integer _durationInDays;
    /** Specifies whether to display recommendations to the reviewer. The default value is true  */
    private Boolean _isAccessRecommendationEnabled;
    /** Specifies whether the reviewer must provide justification for the approval. The default value is true.  */
    private Boolean _isApprovalJustificationRequired;
    /** If true, access reviews are required for assignments from this policy.  */
    private Boolean _isEnabled;
    /** The interval for recurrence, such as monthly or quarterly.  */
    private String _recurrenceType;
    /** If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.  */
    private java.util.List<UserSet> _reviewers;
    /** Who should be asked to do the review, either Self or Reviewers.  */
    private String _reviewerType;
    /** When the first review should start.  */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new assignmentReviewSettings and sets the default values.
     * @return a void
     */
    public AssignmentReviewSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentReviewSettings
     */
    @javax.annotation.Nonnull
    public static AssignmentReviewSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentReviewSettings();
    }
    /**
     * Gets the accessReviewTimeoutBehavior property value. The default decision to apply if the request is not reviewed within the period specified in durationInDays. The possible values are: acceptAccessRecommendation, keepAccess, removeAccess, and unknownFutureValue.
     * @return a accessReviewTimeoutBehavior
     */
    @javax.annotation.Nullable
    public AccessReviewTimeoutBehavior getAccessReviewTimeoutBehavior() {
        return this._accessReviewTimeoutBehavior;
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
     * Gets the durationInDays property value. The number of days within which reviewers should provide input.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInDays() {
        return this._durationInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignmentReviewSettings currentObject = this;
        return new HashMap<>(9) {{
            this.put("accessReviewTimeoutBehavior", (n) -> { currentObject.setAccessReviewTimeoutBehavior(n.getEnumValue(AccessReviewTimeoutBehavior.class)); });
            this.put("durationInDays", (n) -> { currentObject.setDurationInDays(n.getIntegerValue()); });
            this.put("isAccessRecommendationEnabled", (n) -> { currentObject.setIsAccessRecommendationEnabled(n.getBooleanValue()); });
            this.put("isApprovalJustificationRequired", (n) -> { currentObject.setIsApprovalJustificationRequired(n.getBooleanValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("recurrenceType", (n) -> { currentObject.setRecurrenceType(n.getStringValue()); });
            this.put("reviewers", (n) -> { currentObject.setReviewers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
            this.put("reviewerType", (n) -> { currentObject.setReviewerType(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the isAccessRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAccessRecommendationEnabled() {
        return this._isAccessRecommendationEnabled;
    }
    /**
     * Gets the isApprovalJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalJustificationRequired() {
        return this._isApprovalJustificationRequired;
    }
    /**
     * Gets the isEnabled property value. If true, access reviews are required for assignments from this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the recurrenceType property value. The interval for recurrence, such as monthly or quarterly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecurrenceType() {
        return this._recurrenceType;
    }
    /**
     * Gets the reviewers property value. If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.
     * @return a userSet
     */
    @javax.annotation.Nullable
    public java.util.List<UserSet> getReviewers() {
        return this._reviewers;
    }
    /**
     * Gets the reviewerType property value. Who should be asked to do the review, either Self or Reviewers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewerType() {
        return this._reviewerType;
    }
    /**
     * Gets the startDateTime property value. When the first review should start.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessReviewTimeoutBehavior", this.getAccessReviewTimeoutBehavior());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeBooleanValue("isAccessRecommendationEnabled", this.getIsAccessRecommendationEnabled());
        writer.writeBooleanValue("isApprovalJustificationRequired", this.getIsApprovalJustificationRequired());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("recurrenceType", this.getRecurrenceType());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeStringValue("reviewerType", this.getReviewerType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviewTimeoutBehavior property value. The default decision to apply if the request is not reviewed within the period specified in durationInDays. The possible values are: acceptAccessRecommendation, keepAccess, removeAccess, and unknownFutureValue.
     * @param value Value to set for the accessReviewTimeoutBehavior property.
     * @return a void
     */
    public void setAccessReviewTimeoutBehavior(@javax.annotation.Nullable final AccessReviewTimeoutBehavior value) {
        this._accessReviewTimeoutBehavior = value;
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
     * Sets the durationInDays property value. The number of days within which reviewers should provide input.
     * @param value Value to set for the durationInDays property.
     * @return a void
     */
    public void setDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._durationInDays = value;
    }
    /**
     * Sets the isAccessRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true
     * @param value Value to set for the isAccessRecommendationEnabled property.
     * @return a void
     */
    public void setIsAccessRecommendationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isAccessRecommendationEnabled = value;
    }
    /**
     * Sets the isApprovalJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @param value Value to set for the isApprovalJustificationRequired property.
     * @return a void
     */
    public void setIsApprovalJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalJustificationRequired = value;
    }
    /**
     * Sets the isEnabled property value. If true, access reviews are required for assignments from this policy.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the recurrenceType property value. The interval for recurrence, such as monthly or quarterly.
     * @param value Value to set for the recurrenceType property.
     * @return a void
     */
    public void setRecurrenceType(@javax.annotation.Nullable final String value) {
        this._recurrenceType = value;
    }
    /**
     * Sets the reviewers property value. If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    public void setReviewers(@javax.annotation.Nullable final java.util.List<UserSet> value) {
        this._reviewers = value;
    }
    /**
     * Sets the reviewerType property value. Who should be asked to do the review, either Self or Reviewers.
     * @param value Value to set for the reviewerType property.
     * @return a void
     */
    public void setReviewerType(@javax.annotation.Nullable final String value) {
        this._reviewerType = value;
    }
    /**
     * Sets the startDateTime property value. When the first review should start.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
