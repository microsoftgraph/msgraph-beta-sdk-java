package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItem extends Entity implements Parsable {
    /**
     * The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     */
    private String accessReviewId;
    /**
     * The identifier of the user who applied the decision. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. Read-only.
     */
    private UserIdentity appliedBy;
    /**
     * The timestamp when the approval decision was applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     */
    private OffsetDateTime appliedDateTime;
    /**
     * The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     */
    private String applyResult;
    /**
     * Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     */
    private String decision;
    /**
     * Insights are recommendations to reviewers on whether to approve or deny a decision. There can be multiple insights associated with an accessReviewInstanceDecisionItem.
     */
    private java.util.List<GovernanceInsight> insights;
    /**
     * There is exactly one accessReviewInstance associated with each decision. The instance is the parent of the decision item, representing the recurrence of the access review the decision is made on.
     */
    private AccessReviewInstance instance;
    /**
     * Justification left by the reviewer when they made the decision.
     */
    private String justification;
    /**
     * Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     */
    private Identity principal;
    /**
     * Link to the principal object. For example: https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     */
    private String principalLink;
    /**
     * Every decision item in an access review represents a principal's membership to a resource. This property provides the details of the membership. For example, whether the principal has direct access or indirect access to the resource. Supports $select. Read-only.
     */
    private DecisionItemPrincipalResourceMembership principalResourceMembership;
    /**
     * A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     */
    private String recommendation;
    /**
     * Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     */
    private AccessReviewInstanceDecisionItemResource resource;
    /**
     * A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     */
    private String resourceLink;
    /**
     * The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     */
    private UserIdentity reviewedBy;
    /**
     * The timestamp when the review decision occurred. Supports $select. Read-only.
     */
    private OffsetDateTime reviewedDateTime;
    /**
     * The target of this specific decision. Decision targets can be of different types  each one with its own specific properties. See accessReviewInstanceDecisionItemTarget. Read-only.  This property has been replaced by the principal and resource properties in v1.0.
     */
    private AccessReviewInstanceDecisionItemTarget target;
    /**
     * Instantiates a new accessReviewInstanceDecisionItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewInstanceDecisionItem
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItem();
    }
    /**
     * Gets the accessReviewId property value. The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccessReviewId() {
        return this.accessReviewId;
    }
    /**
     * Gets the appliedBy property value. The identifier of the user who applied the decision. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. Read-only.
     * @return a userIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getAppliedBy() {
        return this.appliedBy;
    }
    /**
     * Gets the appliedDateTime property value. The timestamp when the approval decision was applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppliedDateTime() {
        return this.appliedDateTime;
    }
    /**
     * Gets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplyResult() {
        return this.applyResult;
    }
    /**
     * Gets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDecision() {
        return this.decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessReviewId", (n) -> { this.setAccessReviewId(n.getStringValue()); });
        deserializerMap.put("appliedBy", (n) -> { this.setAppliedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("appliedDateTime", (n) -> { this.setAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("applyResult", (n) -> { this.setApplyResult(n.getStringValue()); });
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getStringValue()); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getCollectionOfObjectValues(GovernanceInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("instance", (n) -> { this.setInstance(n.getObjectValue(AccessReviewInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("principalLink", (n) -> { this.setPrincipalLink(n.getStringValue()); });
        deserializerMap.put("principalResourceMembership", (n) -> { this.setPrincipalResourceMembership(n.getObjectValue(DecisionItemPrincipalResourceMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendation", (n) -> { this.setRecommendation(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(AccessReviewInstanceDecisionItemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLink", (n) -> { this.setResourceLink(n.getStringValue()); });
        deserializerMap.put("reviewedBy", (n) -> { this.setReviewedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedDateTime", (n) -> { this.setReviewedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(AccessReviewInstanceDecisionItemTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. Insights are recommendations to reviewers on whether to approve or deny a decision. There can be multiple insights associated with an accessReviewInstanceDecisionItem.
     * @return a governanceInsight
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceInsight> getInsights() {
        return this.insights;
    }
    /**
     * Gets the instance property value. There is exactly one accessReviewInstance associated with each decision. The instance is the parent of the decision item, representing the recurrence of the access review the decision is made on.
     * @return a accessReviewInstance
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstance getInstance() {
        return this.instance;
    }
    /**
     * Gets the justification property value. Justification left by the reviewer when they made the decision.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @return a identity
     */
    @jakarta.annotation.Nullable
    public Identity getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalLink property value. Link to the principal object. For example: https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrincipalLink() {
        return this.principalLink;
    }
    /**
     * Gets the principalResourceMembership property value. Every decision item in an access review represents a principal's membership to a resource. This property provides the details of the membership. For example, whether the principal has direct access or indirect access to the resource. Supports $select. Read-only.
     * @return a decisionItemPrincipalResourceMembership
     */
    @jakarta.annotation.Nullable
    public DecisionItemPrincipalResourceMembership getPrincipalResourceMembership() {
        return this.principalResourceMembership;
    }
    /**
     * Gets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecommendation() {
        return this.recommendation;
    }
    /**
     * Gets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @return a accessReviewInstanceDecisionItemResource
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemResource getResource() {
        return this.resource;
    }
    /**
     * Gets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceLink() {
        return this.resourceLink;
    }
    /**
     * Gets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @return a userIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getReviewedBy() {
        return this.reviewedBy;
    }
    /**
     * Gets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this.reviewedDateTime;
    }
    /**
     * Gets the target property value. The target of this specific decision. Decision targets can be of different types  each one with its own specific properties. See accessReviewInstanceDecisionItemTarget. Read-only.  This property has been replaced by the principal and resource properties in v1.0.
     * @return a accessReviewInstanceDecisionItemTarget
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemTarget getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessReviewId", this.getAccessReviewId());
        writer.writeObjectValue("appliedBy", this.getAppliedBy());
        writer.writeOffsetDateTimeValue("appliedDateTime", this.getAppliedDateTime());
        writer.writeStringValue("applyResult", this.getApplyResult());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
        writer.writeObjectValue("instance", this.getInstance());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalLink", this.getPrincipalLink());
        writer.writeObjectValue("principalResourceMembership", this.getPrincipalResourceMembership());
        writer.writeStringValue("recommendation", this.getRecommendation());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceLink", this.getResourceLink());
        writer.writeObjectValue("reviewedBy", this.getReviewedBy());
        writer.writeOffsetDateTimeValue("reviewedDateTime", this.getReviewedDateTime());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the accessReviewId property value. The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     * @param value Value to set for the accessReviewId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccessReviewId(@jakarta.annotation.Nullable final String value) {
        this.accessReviewId = value;
    }
    /**
     * Sets the appliedBy property value. The identifier of the user who applied the decision. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. Read-only.
     * @param value Value to set for the appliedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppliedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.appliedBy = value;
    }
    /**
     * Sets the appliedDateTime property value. The timestamp when the approval decision was applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @param value Value to set for the appliedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appliedDateTime = value;
    }
    /**
     * Sets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the applyResult property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApplyResult(@jakarta.annotation.Nullable final String value) {
        this.applyResult = value;
    }
    /**
     * Sets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @param value Value to set for the decision property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDecision(@jakarta.annotation.Nullable final String value) {
        this.decision = value;
    }
    /**
     * Sets the insights property value. Insights are recommendations to reviewers on whether to approve or deny a decision. There can be multiple insights associated with an accessReviewInstanceDecisionItem.
     * @param value Value to set for the insights property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInsights(@jakarta.annotation.Nullable final java.util.List<GovernanceInsight> value) {
        this.insights = value;
    }
    /**
     * Sets the instance property value. There is exactly one accessReviewInstance associated with each decision. The instance is the parent of the decision item, representing the recurrence of the access review the decision is made on.
     * @param value Value to set for the instance property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstance(@jakarta.annotation.Nullable final AccessReviewInstance value) {
        this.instance = value;
    }
    /**
     * Sets the justification property value. Justification left by the reviewer when they made the decision.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipal(@jakarta.annotation.Nullable final Identity value) {
        this.principal = value;
    }
    /**
     * Sets the principalLink property value. Link to the principal object. For example: https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @param value Value to set for the principalLink property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipalLink(@jakarta.annotation.Nullable final String value) {
        this.principalLink = value;
    }
    /**
     * Sets the principalResourceMembership property value. Every decision item in an access review represents a principal's membership to a resource. This property provides the details of the membership. For example, whether the principal has direct access or indirect access to the resource. Supports $select. Read-only.
     * @param value Value to set for the principalResourceMembership property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipalResourceMembership(@jakarta.annotation.Nullable final DecisionItemPrincipalResourceMembership value) {
        this.principalResourceMembership = value;
    }
    /**
     * Sets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the recommendation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecommendation(@jakarta.annotation.Nullable final String value) {
        this.recommendation = value;
    }
    /**
     * Sets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResource(@jakarta.annotation.Nullable final AccessReviewInstanceDecisionItemResource value) {
        this.resource = value;
    }
    /**
     * Sets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @param value Value to set for the resourceLink property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceLink(@jakarta.annotation.Nullable final String value) {
        this.resourceLink = value;
    }
    /**
     * Sets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @param value Value to set for the reviewedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReviewedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.reviewedBy = value;
    }
    /**
     * Sets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @param value Value to set for the reviewedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReviewedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reviewedDateTime = value;
    }
    /**
     * Sets the target property value. The target of this specific decision. Decision targets can be of different types  each one with its own specific properties. See accessReviewInstanceDecisionItemTarget. Read-only.  This property has been replaced by the principal and resource properties in v1.0.
     * @param value Value to set for the target property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTarget(@jakarta.annotation.Nullable final AccessReviewInstanceDecisionItemTarget value) {
        this.target = value;
    }
}
