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
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AccessPackageAssignmentRequestRequirements and sets the default values.
     */
    public AccessPackageAssignmentRequestRequirements() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAssignmentRequestRequirements
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestRequirements createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestRequirements();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the existingAnswers property value. Answers that have already been provided.
     * @return a java.util.List<AccessPackageAnswer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getExistingAnswers() {
        return this.backingStore.get("existingAnswers");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("existingAnswers", (n) -> { this.setExistingAnswers(n.getCollectionOfObjectValues(AccessPackageAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("isApprovalRequired", (n) -> { this.setIsApprovalRequired(n.getBooleanValue()); });
        deserializerMap.put("isApprovalRequiredForExtension", (n) -> { this.setIsApprovalRequiredForExtension(n.getBooleanValue()); });
        deserializerMap.put("isCustomAssignmentScheduleAllowed", (n) -> { this.setIsCustomAssignmentScheduleAllowed(n.getBooleanValue()); });
        deserializerMap.put("isRequestorJustificationRequired", (n) -> { this.setIsRequestorJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyDescription", (n) -> { this.setPolicyDescription(n.getStringValue()); });
        deserializerMap.put("policyDisplayName", (n) -> { this.setPolicyDisplayName(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiableCredentialRequirementStatus", (n) -> { this.setVerifiableCredentialRequirementStatus(n.getObjectValue(VerifiableCredentialRequirementStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApprovalRequired property value. Indicates whether a request must be approved by an approver.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this.backingStore.get("isApprovalRequired");
    }
    /**
     * Gets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForExtension() {
        return this.backingStore.get("isApprovalRequiredForExtension");
    }
    /**
     * Gets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomAssignmentScheduleAllowed() {
        return this.backingStore.get("isCustomAssignmentScheduleAllowed");
    }
    /**
     * Gets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequestorJustificationRequired() {
        return this.backingStore.get("isRequestorJustificationRequired");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyDescription() {
        return this.backingStore.get("policyDescription");
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyDisplayName() {
        return this.backingStore.get("policyDisplayName");
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @return a java.util.List<AccessPackageQuestion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.backingStore.get("questions");
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the verifiableCredentialRequirementStatus property value. The status of the process to process the verifiable credential, if any.
     * @return a VerifiableCredentialRequirementStatus
     */
    @jakarta.annotation.Nullable
    public VerifiableCredentialRequirementStatus getVerifiableCredentialRequirementStatus() {
        return this.backingStore.get("verifiableCredentialRequirementStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("existingAnswers", this.getExistingAnswers());
        writer.writeBooleanValue("isApprovalRequired", this.getIsApprovalRequired());
        writer.writeBooleanValue("isApprovalRequiredForExtension", this.getIsApprovalRequiredForExtension());
        writer.writeBooleanValue("isCustomAssignmentScheduleAllowed", this.getIsCustomAssignmentScheduleAllowed());
        writer.writeBooleanValue("isRequestorJustificationRequired", this.getIsRequestorJustificationRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyDescription", this.getPolicyDescription());
        writer.writeStringValue("policyDisplayName", this.getPolicyDisplayName());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("verifiableCredentialRequirementStatus", this.getVerifiableCredentialRequirementStatus());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the existingAnswers property value. Answers that have already been provided.
     * @param value Value to set for the existingAnswers property.
     */
    public void setExistingAnswers(@jakarta.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this.backingStore.set("existingAnswers", value);
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether a request must be approved by an approver.
     * @param value Value to set for the isApprovalRequired property.
     */
    public void setIsApprovalRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequired", value);
    }
    /**
     * Sets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @param value Value to set for the isApprovalRequiredForExtension property.
     */
    public void setIsApprovalRequiredForExtension(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequiredForExtension", value);
    }
    /**
     * Sets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the isCustomAssignmentScheduleAllowed property.
     */
    public void setIsCustomAssignmentScheduleAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCustomAssignmentScheduleAllowed", value);
    }
    /**
     * Sets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @param value Value to set for the isRequestorJustificationRequired property.
     */
    public void setIsRequestorJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequestorJustificationRequired", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     */
    public void setPolicyDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyDescription", value);
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     */
    public void setPolicyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyDisplayName", value);
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.backingStore.set("questions", value);
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the verifiableCredentialRequirementStatus property value. The status of the process to process the verifiable credential, if any.
     * @param value Value to set for the verifiableCredentialRequirementStatus property.
     */
    public void setVerifiableCredentialRequirementStatus(@jakarta.annotation.Nullable final VerifiableCredentialRequirementStatus value) {
        this.backingStore.set("verifiableCredentialRequirementStatus", value);
    }
}
