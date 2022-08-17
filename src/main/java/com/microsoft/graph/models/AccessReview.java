package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AccessReview extends Entity implements Parsable {
    /** The business flow template identifier. Required on create.  This value is case sensitive. */
    private String _businessFlowTemplateId;
    /** The user who created this review. */
    private UserIdentity _createdBy;
    /** The collection of decisions for this access review. */
    private java.util.List<AccessReviewDecision> _decisions;
    /** The description provided by the access review creator, to show to the reviewers. */
    private String _description;
    /** The access review name. Required on create. */
    private String _displayName;
    /** The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create. */
    private OffsetDateTime _endDateTime;
    /** The collection of access reviews instances past, present and future, if this object is a recurring access review. */
    private java.util.List<AccessReview> _instances;
    /** The collection of decisions for the caller, if the caller is a reviewer. */
    private java.util.List<AccessReviewDecision> _myDecisions;
    /** The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create. */
    private Identity _reviewedEntity;
    /** The collection of reviewers for an access review, if access review reviewerType is of type delegated. */
    private java.util.List<AccessReviewReviewer> _reviewers;
    /** The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create. */
    private String _reviewerType;
    /** The settings of an accessReview, see type definition below. */
    private AccessReviewSettings _settings;
    /** The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create. */
    private OffsetDateTime _startDateTime;
    /** This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. */
    private String _status;
    /**
     * Instantiates a new accessReview and sets the default values.
     * @return a void
     */
    public AccessReview() {
        super();
        this.setOdataType("#microsoft.graph.accessReview");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReview
     */
    @javax.annotation.Nonnull
    public static AccessReview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReview();
    }
    /**
     * Gets the businessFlowTemplateId property value. The business flow template identifier. Required on create.  This value is case sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBusinessFlowTemplateId() {
        return this._businessFlowTemplateId;
    }
    /**
     * Gets the createdBy property value. The user who created this review.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the decisions property value. The collection of decisions for this access review.
     * @return a accessReviewDecision
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewDecision> getDecisions() {
        return this._decisions;
    }
    /**
     * Gets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The access review name. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReview currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("businessFlowTemplateId", (n) -> { currentObject.setBusinessFlowTemplateId(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
            this.put("decisions", (n) -> { currentObject.setDecisions(n.getCollectionOfObjectValues(AccessReviewDecision::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("instances", (n) -> { currentObject.setInstances(n.getCollectionOfObjectValues(AccessReview::createFromDiscriminatorValue)); });
            this.put("myDecisions", (n) -> { currentObject.setMyDecisions(n.getCollectionOfObjectValues(AccessReviewDecision::createFromDiscriminatorValue)); });
            this.put("reviewedEntity", (n) -> { currentObject.setReviewedEntity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("reviewers", (n) -> { currentObject.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewer::createFromDiscriminatorValue)); });
            this.put("reviewerType", (n) -> { currentObject.setReviewerType(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(AccessReviewSettings::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the instances property value. The collection of access reviews instances past, present and future, if this object is a recurring access review.
     * @return a accessReview
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReview> getInstances() {
        return this._instances;
    }
    /**
     * Gets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @return a accessReviewDecision
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewDecision> getMyDecisions() {
        return this._myDecisions;
    }
    /**
     * Gets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getReviewedEntity() {
        return this._reviewedEntity;
    }
    /**
     * Gets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @return a accessReviewReviewer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewer> getReviewers() {
        return this._reviewers;
    }
    /**
     * Gets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewerType() {
        return this._reviewerType;
    }
    /**
     * Gets the settings property value. The settings of an accessReview, see type definition below.
     * @return a accessReviewSettings
     */
    @javax.annotation.Nullable
    public AccessReviewSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("businessFlowTemplateId", this.getBusinessFlowTemplateId());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
        writer.writeCollectionOfObjectValues("myDecisions", this.getMyDecisions());
        writer.writeObjectValue("reviewedEntity", this.getReviewedEntity());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeStringValue("reviewerType", this.getReviewerType());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the businessFlowTemplateId property value. The business flow template identifier. Required on create.  This value is case sensitive.
     * @param value Value to set for the businessFlowTemplateId property.
     * @return a void
     */
    public void setBusinessFlowTemplateId(@javax.annotation.Nullable final String value) {
        this._businessFlowTemplateId = value;
    }
    /**
     * Sets the createdBy property value. The user who created this review.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the decisions property value. The collection of decisions for this access review.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    public void setDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this._decisions = value;
    }
    /**
     * Sets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The access review name. Required on create.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the instances property value. The collection of access reviews instances past, present and future, if this object is a recurring access review.
     * @param value Value to set for the instances property.
     * @return a void
     */
    public void setInstances(@javax.annotation.Nullable final java.util.List<AccessReview> value) {
        this._instances = value;
    }
    /**
     * Sets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @param value Value to set for the myDecisions property.
     * @return a void
     */
    public void setMyDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this._myDecisions = value;
    }
    /**
     * Sets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @param value Value to set for the reviewedEntity property.
     * @return a void
     */
    public void setReviewedEntity(@javax.annotation.Nullable final Identity value) {
        this._reviewedEntity = value;
    }
    /**
     * Sets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    public void setReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewer> value) {
        this._reviewers = value;
    }
    /**
     * Sets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @param value Value to set for the reviewerType property.
     * @return a void
     */
    public void setReviewerType(@javax.annotation.Nullable final String value) {
        this._reviewerType = value;
    }
    /**
     * Sets the settings property value. The settings of an accessReview, see type definition below.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final AccessReviewSettings value) {
        this._settings = value;
    }
    /**
     * Sets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
