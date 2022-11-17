package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApprovalStage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of days that a request can be pending a response before it is automatically denied. */
    private Integer _approvalStageTimeOutInDays;
    /** If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection. */
    private java.util.List<UserSet> _escalationApprovers;
    /** If escalation is required, the time a request can be pending a response from a primary approver. */
    private Integer _escalationTimeInMinutes;
    /** Indicates whether the approver is required to provide a justification for approving a request. */
    private Boolean _isApproverJustificationRequired;
    /** If true, then one or more escalation approvers are configured in this approval stage. */
    private Boolean _isEscalationEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors. When creating or updating a policy, include at least one userSet in this collection. */
    private java.util.List<UserSet> _primaryApprovers;
    /**
     * Instantiates a new approvalStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApprovalStage() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.approvalStage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalStage
     */
    @javax.annotation.Nonnull
    public static ApprovalStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalStage();
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
     * Gets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getApprovalStageTimeOutInDays() {
        return this._approvalStageTimeOutInDays;
    }
    /**
     * Gets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection.
     * @return a userSet
     */
    @javax.annotation.Nullable
    public java.util.List<UserSet> getEscalationApprovers() {
        return this._escalationApprovers;
    }
    /**
     * Gets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEscalationTimeInMinutes() {
        return this._escalationTimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApprovalStage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("approvalStageTimeOutInDays", (n) -> { currentObject.setApprovalStageTimeOutInDays(n.getIntegerValue()); });
            this.put("escalationApprovers", (n) -> { currentObject.setEscalationApprovers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
            this.put("escalationTimeInMinutes", (n) -> { currentObject.setEscalationTimeInMinutes(n.getIntegerValue()); });
            this.put("isApproverJustificationRequired", (n) -> { currentObject.setIsApproverJustificationRequired(n.getBooleanValue()); });
            this.put("isEscalationEnabled", (n) -> { currentObject.setIsEscalationEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("primaryApprovers", (n) -> { currentObject.setPrimaryApprovers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this._isApproverJustificationRequired;
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this._isEscalationEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the primaryApprovers property value. The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @return a userSet
     */
    @javax.annotation.Nullable
    public java.util.List<UserSet> getPrimaryApprovers() {
        return this._primaryApprovers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the approvalStageTimeOutInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalStageTimeOutInDays(@javax.annotation.Nullable final Integer value) {
        this._approvalStageTimeOutInDays = value;
    }
    /**
     * Sets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. This can be a collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors.  When creating or updating a policy, if there are no escalation approvers, or escalation approvers are not required for the stage, the value of this property should be an empty collection.
     * @param value Value to set for the escalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationApprovers(@javax.annotation.Nullable final java.util.List<UserSet> value) {
        this._escalationApprovers = value;
    }
    /**
     * Sets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the escalationTimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._escalationTimeInMinutes = value;
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApproverJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApproverJustificationRequired = value;
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @param value Value to set for the isEscalationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEscalationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEscalationEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the primaryApprovers property value. The users who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors and externalSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @param value Value to set for the primaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryApprovers(@javax.annotation.Nullable final java.util.List<UserSet> value) {
        this._primaryApprovers = value;
    }
}
