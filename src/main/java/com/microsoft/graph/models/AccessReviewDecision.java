package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class AccessReviewDecision extends Entity implements Parsable {
    /** The feature- generated recommendation shown to the reviewer, one of Approve, Deny or NotAvailable. */
    private String _accessRecommendation;
    /** The feature-generated id of the access review. */
    private String _accessReviewId;
    /** When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was auto-applied, the userPrincipalName is empty. */
    private UserIdentity _appliedBy;
    /** The date and time when the review decision was applied. */
    private OffsetDateTime _appliedDateTime;
    /** The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported. */
    private String _applyResult;
    /** The reviewer's business justification, if supplied. */
    private String _justification;
    /** The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty. */
    private UserIdentity _reviewedBy;
    /** The reviewedDateTime property */
    private OffsetDateTime _reviewedDateTime;
    /** The result of the review, one of NotReviewed, Deny, DontKnow or Approve. */
    private String _reviewResult;
    /**
     * Instantiates a new accessReviewDecision and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewDecision() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewDecision
     */
    @javax.annotation.Nonnull
    public static AccessReviewDecision createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewDecision();
    }
    /**
     * Gets the accessRecommendation property value. The feature- generated recommendation shown to the reviewer, one of Approve, Deny or NotAvailable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessRecommendation() {
        return this._accessRecommendation;
    }
    /**
     * Gets the accessReviewId property value. The feature-generated id of the access review.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessReviewId() {
        return this._accessReviewId;
    }
    /**
     * Gets the appliedBy property value. When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was auto-applied, the userPrincipalName is empty.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getAppliedBy() {
        return this._appliedBy;
    }
    /**
     * Gets the appliedDateTime property value. The date and time when the review decision was applied.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAppliedDateTime() {
        return this._appliedDateTime;
    }
    /**
     * Gets the applyResult property value. The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplyResult() {
        return this._applyResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessRecommendation", (n) -> { this.setAccessRecommendation(n.getStringValue()); });
        deserializerMap.put("accessReviewId", (n) -> { this.setAccessReviewId(n.getStringValue()); });
        deserializerMap.put("appliedBy", (n) -> { this.setAppliedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("appliedDateTime", (n) -> { this.setAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("applyResult", (n) -> { this.setApplyResult(n.getStringValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("reviewedBy", (n) -> { this.setReviewedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedDateTime", (n) -> { this.setReviewedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewResult", (n) -> { this.setReviewResult(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The reviewer's business justification, if supplied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the reviewedBy property value. The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getReviewedBy() {
        return this._reviewedBy;
    }
    /**
     * Gets the reviewedDateTime property value. The reviewedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this._reviewedDateTime;
    }
    /**
     * Gets the reviewResult property value. The result of the review, one of NotReviewed, Deny, DontKnow or Approve.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewResult() {
        return this._reviewResult;
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
        writer.writeStringValue("accessRecommendation", this.getAccessRecommendation());
        writer.writeStringValue("accessReviewId", this.getAccessReviewId());
        writer.writeObjectValue("appliedBy", this.getAppliedBy());
        writer.writeOffsetDateTimeValue("appliedDateTime", this.getAppliedDateTime());
        writer.writeStringValue("applyResult", this.getApplyResult());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("reviewedBy", this.getReviewedBy());
        writer.writeOffsetDateTimeValue("reviewedDateTime", this.getReviewedDateTime());
        writer.writeStringValue("reviewResult", this.getReviewResult());
    }
    /**
     * Sets the accessRecommendation property value. The feature- generated recommendation shown to the reviewer, one of Approve, Deny or NotAvailable.
     * @param value Value to set for the accessRecommendation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessRecommendation(@javax.annotation.Nullable final String value) {
        this._accessRecommendation = value;
    }
    /**
     * Sets the accessReviewId property value. The feature-generated id of the access review.
     * @param value Value to set for the accessReviewId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessReviewId(@javax.annotation.Nullable final String value) {
        this._accessReviewId = value;
    }
    /**
     * Sets the appliedBy property value. When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was auto-applied, the userPrincipalName is empty.
     * @param value Value to set for the appliedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._appliedBy = value;
    }
    /**
     * Sets the appliedDateTime property value. The date and time when the review decision was applied.
     * @param value Value to set for the appliedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._appliedDateTime = value;
    }
    /**
     * Sets the applyResult property value. The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported.
     * @param value Value to set for the applyResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyResult(@javax.annotation.Nullable final String value) {
        this._applyResult = value;
    }
    /**
     * Sets the justification property value. The reviewer's business justification, if supplied.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the reviewedBy property value. The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty.
     * @param value Value to set for the reviewedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._reviewedBy = value;
    }
    /**
     * Sets the reviewedDateTime property value. The reviewedDateTime property
     * @param value Value to set for the reviewedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewedDateTime = value;
    }
    /**
     * Sets the reviewResult property value. The result of the review, one of NotReviewed, Deny, DontKnow or Approve.
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewResult(@javax.annotation.Nullable final String value) {
        this._reviewResult = value;
    }
}
