package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewDecision extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewDecision} and sets the default values.
     */
    public AccessReviewDecision() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewDecision}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewDecision createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewDecision();
    }
    /**
     * Gets the accessRecommendation property value. The feature- generated recommendation shown to the reviewer, one of Approve, Deny or NotAvailable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessRecommendation() {
        return this.backingStore.get("accessRecommendation");
    }
    /**
     * Gets the accessReviewId property value. The feature-generated ID of the access review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessReviewId() {
        return this.backingStore.get("accessReviewId");
    }
    /**
     * Gets the appliedBy property value. When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was autoapplied, the userPrincipalName is empty.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getAppliedBy() {
        return this.backingStore.get("appliedBy");
    }
    /**
     * Gets the appliedDateTime property value. The date and time when the review decision was applied.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppliedDateTime() {
        return this.backingStore.get("appliedDateTime");
    }
    /**
     * Gets the applyResult property value. The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplyResult() {
        return this.backingStore.get("applyResult");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the reviewedBy property value. The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getReviewedBy() {
        return this.backingStore.get("reviewedBy");
    }
    /**
     * Gets the reviewedDateTime property value. The reviewedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this.backingStore.get("reviewedDateTime");
    }
    /**
     * Gets the reviewResult property value. The result of the review, one of NotReviewed, Deny, DontKnow or Approve.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReviewResult() {
        return this.backingStore.get("reviewResult");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccessRecommendation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessRecommendation", value);
    }
    /**
     * Sets the accessReviewId property value. The feature-generated ID of the access review.
     * @param value Value to set for the accessReviewId property.
     */
    public void setAccessReviewId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessReviewId", value);
    }
    /**
     * Sets the appliedBy property value. When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was autoapplied, the userPrincipalName is empty.
     * @param value Value to set for the appliedBy property.
     */
    public void setAppliedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("appliedBy", value);
    }
    /**
     * Sets the appliedDateTime property value. The date and time when the review decision was applied.
     * @param value Value to set for the appliedDateTime property.
     */
    public void setAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("appliedDateTime", value);
    }
    /**
     * Sets the applyResult property value. The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported.
     * @param value Value to set for the applyResult property.
     */
    public void setApplyResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applyResult", value);
    }
    /**
     * Sets the justification property value. The reviewer's business justification, if supplied.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the reviewedBy property value. The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty.
     * @param value Value to set for the reviewedBy property.
     */
    public void setReviewedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("reviewedBy", value);
    }
    /**
     * Sets the reviewedDateTime property value. The reviewedDateTime property
     * @param value Value to set for the reviewedDateTime property.
     */
    public void setReviewedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewedDateTime", value);
    }
    /**
     * Sets the reviewResult property value. The result of the review, one of NotReviewed, Deny, DontKnow or Approve.
     * @param value Value to set for the reviewResult property.
     */
    public void setReviewResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewResult", value);
    }
}
