package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalStage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApprovalStage} and sets the default values.
     */
    public ApprovalStage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalStage}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageDynamicApprovalStage": return new AccessPackageDynamicApprovalStage();
            }
        }
        return new ApprovalStage();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApprovalStageTimeOutInDays() {
        return this.backingStore.get("approvalStageTimeOutInDays");
    }
    /**
     * Gets the approverInformationVisibility property value. The approverInformationVisibility property
     * @return a {@link ApproverInformationVisibility}
     */
    @jakarta.annotation.Nullable
    public ApproverInformationVisibility getApproverInformationVisibility() {
        return this.backingStore.get("approverInformationVisibility");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the escalationApprovers property value. The users who are asked to approve requests if escalation is enabled and the primary approvers don&apos;t respond before the escalation time. This property can be a collection of singleUser, groupMembers, requestorManager, internalSponsors, and externalSponsors. When you create or update a policy, if there are no escalation approvers, or escalation approvers aren&apos;t required for the stage, assign an empty collection to this property.
     * @return a {@link java.util.List<UserSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSet> getEscalationApprovers() {
        return this.backingStore.get("escalationApprovers");
    }
    /**
     * Gets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEscalationTimeInMinutes() {
        return this.backingStore.get("escalationTimeInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("approvalStageTimeOutInDays", (n) -> { this.setApprovalStageTimeOutInDays(n.getIntegerValue()); });
        deserializerMap.put("approverInformationVisibility", (n) -> { this.setApproverInformationVisibility(n.getEnumValue(ApproverInformationVisibility::forValue)); });
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this.backingStore.get("isApproverJustificationRequired");
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this.backingStore.get("isEscalationEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the primaryApprovers property value. The users who are asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors, externalSponsors, and targetUserSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @return a {@link java.util.List<UserSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSet> getPrimaryApprovers() {
        return this.backingStore.get("primaryApprovers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("approvalStageTimeOutInDays", this.getApprovalStageTimeOutInDays());
        writer.writeEnumValue("approverInformationVisibility", this.getApproverInformationVisibility());
        writer.writeCollectionOfObjectValues("escalationApprovers", this.getEscalationApprovers());
        writer.writeIntegerValue("escalationTimeInMinutes", this.getEscalationTimeInMinutes());
        writer.writeBooleanValue("isApproverJustificationRequired", this.getIsApproverJustificationRequired());
        writer.writeBooleanValue("isEscalationEnabled", this.getIsEscalationEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("primaryApprovers", this.getPrimaryApprovers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the approvalStageTimeOutInDays property.
     */
    public void setApprovalStageTimeOutInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("approvalStageTimeOutInDays", value);
    }
    /**
     * Sets the approverInformationVisibility property value. The approverInformationVisibility property
     * @param value Value to set for the approverInformationVisibility property.
     */
    public void setApproverInformationVisibility(@jakarta.annotation.Nullable final ApproverInformationVisibility value) {
        this.backingStore.set("approverInformationVisibility", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the escalationApprovers property value. The users who are asked to approve requests if escalation is enabled and the primary approvers don&apos;t respond before the escalation time. This property can be a collection of singleUser, groupMembers, requestorManager, internalSponsors, and externalSponsors. When you create or update a policy, if there are no escalation approvers, or escalation approvers aren&apos;t required for the stage, assign an empty collection to this property.
     * @param value Value to set for the escalationApprovers property.
     */
    public void setEscalationApprovers(@jakarta.annotation.Nullable final java.util.List<UserSet> value) {
        this.backingStore.set("escalationApprovers", value);
    }
    /**
     * Sets the escalationTimeInMinutes property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the escalationTimeInMinutes property.
     */
    public void setEscalationTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("escalationTimeInMinutes", value);
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     */
    public void setIsApproverJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApproverJustificationRequired", value);
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalation approvers are configured in this approval stage.
     * @param value Value to set for the isEscalationEnabled property.
     */
    public void setIsEscalationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEscalationEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryApprovers property value. The users who are asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors, externalSponsors, and targetUserSponsors. When creating or updating a policy, include at least one userSet in this collection.
     * @param value Value to set for the primaryApprovers property.
     */
    public void setPrimaryApprovers(@jakarta.annotation.Nullable final java.util.List<UserSet> value) {
        this.backingStore.set("primaryApprovers", value);
    }
}
