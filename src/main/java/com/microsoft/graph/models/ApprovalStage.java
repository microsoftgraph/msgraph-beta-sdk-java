package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApprovalStage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of days that a request can be pending a response before it is automatically denied.
     */
    private Integer approvalStageTimeOutInDays;
    /**
     * If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection.
     */
    private java.util.List<UserSet> escalationApprovers;
    /**
     * If escalation is required, the time a request can be pending a response from a primary approver.
     */
    private Integer escalationTimeInMinutes;
    /**
     * Indicates whether the approver is required to provide a justification for approving a request.
     */
    private Boolean isApproverJustificationRequired;
    /**
     * If true, then one or more escalation approvers are configured in this approval stage.
     */
    private Boolean isEscalationEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors, externalSponsors and targetUserSponsors. When creating or updating a policy, include at least one userSet in this collection.
     */
    private java.util.List<UserSet> primaryApprovers;
    /**
     * Instantiates a new approvalStage and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ApprovalStage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalStage
     */
    @jakarta.annotation.Nonnull
    public static ApprovalStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalStage();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getApprovalStageTimeOutInDays() {
        return this.approvalStageTimeOutInDays;
    }
    /**
     * Gets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection.
     * @return a userSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSet> getEscalationApprovers() {
        return this.escalationApprovers;
    }
    /**
     * Gets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEscalationTimeInMinutes() {
        return this.escalationTimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("approvalStageTimeOutInDays", (n) -> { this.setApprovalStageTimeOutInDays(n.getIntegerValue()); });
        deserializerMap.put("escalationApprovers", (n) -> { this.setEscalationApprovers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
        deserializerMap.put("escalationTimeInMinutes", (n) -> { this.setEscalationTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("isApproverJustificationRequired", (n) -> { this.setIsApproverJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isEscalationEnabled", (n) -> { this.setIsEscalationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryApprovers", (n) -> { this.setPrimaryApprovers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this.isApproverJustificationRequired;
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this.isEscalationEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the primaryApprovers property value. The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors, externalSponsors and targetUserSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @return a userSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSet> getPrimaryApprovers() {
        return this.primaryApprovers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("approvalStageTimeOutInDays", this.getApprovalStageTimeOutInDays());
        writer.writeCollectionOfObjectValues("escalationApprovers", this.getEscalationApprovers());
        writer.writeIntegerValue("escalationTimeInMinutes", this.getEscalationTimeInMinutes());
        writer.writeBooleanValue("isApproverJustificationRequired", this.getIsApproverJustificationRequired());
        writer.writeBooleanValue("isEscalationEnabled", this.getIsEscalationEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("primaryApprovers", this.getPrimaryApprovers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the approvalStageTimeOutInDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApprovalStageTimeOutInDays(@jakarta.annotation.Nullable final Integer value) {
        this.approvalStageTimeOutInDays = value;
    }
    /**
     * Sets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection.
     * @param value Value to set for the escalationApprovers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEscalationApprovers(@jakarta.annotation.Nullable final java.util.List<UserSet> value) {
        this.escalationApprovers = value;
    }
    /**
     * Sets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the escalationTimeInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEscalationTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.escalationTimeInMinutes = value;
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsApproverJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isApproverJustificationRequired = value;
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @param value Value to set for the isEscalationEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsEscalationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEscalationEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the primaryApprovers property value. The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors, externalSponsors and targetUserSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @param value Value to set for the primaryApprovers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrimaryApprovers(@jakarta.annotation.Nullable final java.util.List<UserSet> value) {
        this.primaryApprovers = value;
    }
}
