package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReview extends Entity implements Parsable {
    /**
     * Instantiates a new AccessReview and sets the default values.
     */
    public AccessReview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReview
     */
    @jakarta.annotation.Nonnull
    public static AccessReview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReview();
    }
    /**
     * Gets the businessFlowTemplateId property value. The business flow template identifier. Required on create.  This value is case sensitive.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBusinessFlowTemplateId() {
        return this.backingStore.get("businessFlowTemplateId");
    }
    /**
     * Gets the createdBy property value. The user who created this review.
     * @return a UserIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the decisions property value. The collection of decisions for this access review.
     * @return a java.util.List<AccessReviewDecision>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewDecision> getDecisions() {
        return this.backingStore.get("decisions");
    }
    /**
     * Gets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The access review name. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<AccessReview>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReview> getInstances() {
        return this.backingStore.get("instances");
    }
    /**
     * Gets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @return a java.util.List<AccessReviewDecision>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewDecision> getMyDecisions() {
        return this.backingStore.get("myDecisions");
    }
    /**
     * Gets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getReviewedEntity() {
        return this.backingStore.get("reviewedEntity");
    }
    /**
     * Gets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @return a java.util.List<AccessReviewReviewer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewer> getReviewers() {
        return this.backingStore.get("reviewers");
    }
    /**
     * Gets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewerType() {
        return this.backingStore.get("reviewerType");
    }
    /**
     * Gets the settings property value. The settings of an accessReview, see type definition below.
     * @return a AccessReviewSettings
     */
    @jakarta.annotation.Nullable
    public AccessReviewSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setBusinessFlowTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("businessFlowTemplateId", value);
    }
    /**
     * Sets the createdBy property value. The user who created this review.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the decisions property value. The collection of decisions for this access review.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this.backingStore.set("decisions", value);
    }
    /**
     * Sets the description property value. The description provided by the access review creator, to show to the reviewers.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The access review name. Required on create.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endDateTime property value. The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the instances property value. The collection of access reviews instances past, present and future, if this object is a recurring access review.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<AccessReview> value) {
        this.backingStore.set("instances", value);
    }
    /**
     * Sets the myDecisions property value. The collection of decisions for the caller, if the caller is a reviewer.
     * @param value Value to set for the myDecisions property.
     */
    public void setMyDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewDecision> value) {
        this.backingStore.set("myDecisions", value);
    }
    /**
     * Sets the reviewedEntity property value. The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     * @param value Value to set for the reviewedEntity property.
     */
    public void setReviewedEntity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("reviewedEntity", value);
    }
    /**
     * Sets the reviewers property value. The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewer> value) {
        this.backingStore.set("reviewers", value);
    }
    /**
     * Sets the reviewerType property value. The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     * @param value Value to set for the reviewerType property.
     */
    public void setReviewerType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewerType", value);
    }
    /**
     * Sets the settings property value. The settings of an accessReview, see type definition below.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final AccessReviewSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the startDateTime property value. The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
