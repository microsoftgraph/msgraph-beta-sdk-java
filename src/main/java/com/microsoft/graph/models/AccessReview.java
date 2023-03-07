package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReview extends Entity implements Parsable {
    /** The business flow template identifier. Required on create.  This value is case sensitive. */
    private String businessFlowTemplateId;
    /** The user who created this review. */
    private UserIdentity createdBy;
    /** The collection of decisions for this access review. */
    private java.util.List<AccessReviewDecision> decisions;
    /** The description provided by the access review creator, to show to the reviewers. */
    private String description;
    /** The access review name. Required on create. */
    private String displayName;
    /** The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create. */
    private OffsetDateTime endDateTime;
    /** The collection of access reviews instances past, present and future, if this object is a recurring access review. */
    private java.util.List<AccessReview> instances;
    /** The collection of decisions for the caller, if the caller is a reviewer. */
    private java.util.List<AccessReviewDecision> myDecisions;
    /** The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create. */
    private Identity reviewedEntity;
    /** The collection of reviewers for an access review, if access review reviewerType is of type delegated. */
    private java.util.List<AccessReviewReviewer> reviewers;
    /** The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create. */
    private String reviewerType;
    /** The settings of an accessReview, see type definition below. */
    private AccessReviewSettings settings;
    /** The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create. */
    private OffsetDateTime startDateTime;
    /** This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. */
    private String status;
    /**
     * Instantiates a new accessReview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReview() {
        super();
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
        return this.businessFlowTemplateId;
    }
    /**
     * Gets the createdBy property value. The user who created this review.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the decisions property value. The collection of decisions for this access review.
     * @return a accessReviewDecision
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewDecision> getDecisions() {
        return this.decisions;
    }
    /**
     * Gets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The access review name. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("businessFlowTemplateId", (n) -> { this.setBusinessFlowTemplateId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfObjectValues(AccessReviewDecision::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(AccessReview::createFromDiscriminatorValue)); });
        deserializerMap.put("myDecisions", (n) -> { this.setMyDecisions(n.getCollectionOfObjectValues(AccessReviewDecision::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedEntity", (n) -> { this.setReviewedEntity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewer::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewerType", (n) -> { this.setReviewerType(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(AccessReviewSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instances property value. The collection of access reviews instances past, present and future, if this object is a recurring access review.
     * @return a accessReview
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReview> getInstances() {
        return this.instances;
    }
    /**
     * Gets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @return a accessReviewDecision
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewDecision> getMyDecisions() {
        return this.myDecisions;
    }
    /**
     * Gets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getReviewedEntity() {
        return this.reviewedEntity;
    }
    /**
     * Gets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @return a accessReviewReviewer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewer> getReviewers() {
        return this.reviewers;
    }
    /**
     * Gets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewerType() {
        return this.reviewerType;
    }
    /**
     * Gets the settings property value. The settings of an accessReview, see type definition below.
     * @return a accessReviewSettings
     */
    @javax.annotation.Nullable
    public AccessReviewSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setBusinessFlowTemplateId(@javax.annotation.Nullable final String value) {
        this.businessFlowTemplateId = value;
    }
    /**
     * Sets the createdBy property value. The user who created this review.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the decisions property value. The collection of decisions for this access review.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this.decisions = value;
    }
    /**
     * Sets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The access review name. Required on create.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the instances property value. The collection of access reviews instances past, present and future, if this object is a recurring access review.
     * @param value Value to set for the instances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstances(@javax.annotation.Nullable final java.util.List<AccessReview> value) {
        this.instances = value;
    }
    /**
     * Sets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @param value Value to set for the myDecisions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMyDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this.myDecisions = value;
    }
    /**
     * Sets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @param value Value to set for the reviewedEntity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedEntity(@javax.annotation.Nullable final Identity value) {
        this.reviewedEntity = value;
    }
    /**
     * Sets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewer> value) {
        this.reviewers = value;
    }
    /**
     * Sets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @param value Value to set for the reviewerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewerType(@javax.annotation.Nullable final String value) {
        this.reviewerType = value;
    }
    /**
     * Sets the settings property value. The settings of an accessReview, see type definition below.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final AccessReviewSettings value) {
        this.settings = value;
    }
    /**
     * Sets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
