package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Answers that have already been provided. */
    private java.util.List<AccessPackageAnswer> existingAnswers;
    /** Indicates whether a request must be approved by an approver. */
    private Boolean isApprovalRequired;
    /** Indicates whether approval is required when a user tries to extend their access. */
    private Boolean isApprovalRequiredForExtension;
    /** Indicates whether the requestor is allowed to set a custom schedule. */
    private Boolean isCustomAssignmentScheduleAllowed;
    /** Indicates whether a requestor must supply justification when submitting an assignment request. */
    private Boolean isRequestorJustificationRequired;
    /** The OdataType property */
    private String odataType;
    /** The description of the policy that the user is trying to request access using. */
    private String policyDescription;
    /** The display name of the policy that the user is trying to request access using. */
    private String policyDisplayName;
    /** The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request. */
    private String policyId;
    /** Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion. */
    private java.util.List<AccessPackageQuestion> questions;
    /** Schedule restrictions enforced, if any. */
    private RequestSchedule schedule;
    /** The status of the process to process the verifiable credential, if any. */
    private VerifiableCredentialRequirementStatus verifiableCredentialRequirementStatus;
    /**
     * Instantiates a new accessPackageAssignmentRequestRequirements and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentRequestRequirements() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestRequirements
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentRequestRequirements createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestRequirements();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the existingAnswers property value. Answers that have already been provided.
     * @return a accessPackageAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getExistingAnswers() {
        return this.existingAnswers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this.isApprovalRequired;
    }
    /**
     * Gets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForExtension() {
        return this.isApprovalRequiredForExtension;
    }
    /**
     * Gets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCustomAssignmentScheduleAllowed() {
        return this.isCustomAssignmentScheduleAllowed;
    }
    /**
     * Gets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequestorJustificationRequired() {
        return this.isRequestorJustificationRequired;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDescription() {
        return this.policyDescription;
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDisplayName() {
        return this.policyDisplayName;
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the verifiableCredentialRequirementStatus property value. The status of the process to process the verifiable credential, if any.
     * @return a verifiableCredentialRequirementStatus
     */
    @javax.annotation.Nullable
    public VerifiableCredentialRequirementStatus getVerifiableCredentialRequirementStatus() {
        return this.verifiableCredentialRequirementStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the existingAnswers property value. Answers that have already been provided.
     * @param value Value to set for the existingAnswers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExistingAnswers(@javax.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this.existingAnswers = value;
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether a request must be approved by an approver.
     * @param value Value to set for the isApprovalRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApprovalRequired(@javax.annotation.Nullable final Boolean value) {
        this.isApprovalRequired = value;
    }
    /**
     * Sets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @param value Value to set for the isApprovalRequiredForExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApprovalRequiredForExtension(@javax.annotation.Nullable final Boolean value) {
        this.isApprovalRequiredForExtension = value;
    }
    /**
     * Sets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the isCustomAssignmentScheduleAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCustomAssignmentScheduleAllowed(@javax.annotation.Nullable final Boolean value) {
        this.isCustomAssignmentScheduleAllowed = value;
    }
    /**
     * Sets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @param value Value to set for the isRequestorJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequestorJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this.isRequestorJustificationRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyDescription(@javax.annotation.Nullable final String value) {
        this.policyDescription = value;
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyDisplayName(@javax.annotation.Nullable final String value) {
        this.policyDisplayName = value;
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @param value Value to set for the questions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestions(@javax.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final RequestSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the verifiableCredentialRequirementStatus property value. The status of the process to process the verifiable credential, if any.
     * @param value Value to set for the verifiableCredentialRequirementStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiableCredentialRequirementStatus(@javax.annotation.Nullable final VerifiableCredentialRequirementStatus value) {
        this.verifiableCredentialRequirementStatus = value;
    }
}
