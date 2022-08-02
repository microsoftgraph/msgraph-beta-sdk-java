package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Answers that have already been provided. */
    private java.util.List<AccessPackageAnswer> _existingAnswers;
    /** Indicates whether a request must be approved by an approver. */
    private Boolean _isApprovalRequired;
    /** Indicates whether approval is required when a user tries to extend their access. */
    private Boolean _isApprovalRequiredForExtension;
    /** Indicates whether the requestor is allowed to set a custom schedule. */
    private Boolean _isCustomAssignmentScheduleAllowed;
    /** Indicates whether a requestor must supply justification when submitting an assignment request. */
    private Boolean _isRequestorJustificationRequired;
    /** The OdataType property */
    private String _odataType;
    /** The description of the policy that the user is trying to request access using. */
    private String _policyDescription;
    /** The display name of the policy that the user is trying to request access using. */
    private String _policyDisplayName;
    /** The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request. */
    private String _policyId;
    /** Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion. */
    private java.util.List<AccessPackageQuestion> _questions;
    /** Schedule restrictions enforced, if any. */
    private RequestSchedule _schedule;
    /**
     * Instantiates a new accessPackageAssignmentRequestRequirements and sets the default values.
     * @return a void
     */
    public AccessPackageAssignmentRequestRequirements() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestRequirements");
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
        return this._additionalData;
    }
    /**
     * Gets the existingAnswers property value. Answers that have already been provided.
     * @return a accessPackageAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getExistingAnswers() {
        return this._existingAnswers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentRequestRequirements currentObject = this;
        return new HashMap<>(11) {{
            this.put("existingAnswers", (n) -> { currentObject.setExistingAnswers(n.getCollectionOfObjectValues(AccessPackageAnswer::createFromDiscriminatorValue)); });
            this.put("isApprovalRequired", (n) -> { currentObject.setIsApprovalRequired(n.getBooleanValue()); });
            this.put("isApprovalRequiredForExtension", (n) -> { currentObject.setIsApprovalRequiredForExtension(n.getBooleanValue()); });
            this.put("isCustomAssignmentScheduleAllowed", (n) -> { currentObject.setIsCustomAssignmentScheduleAllowed(n.getBooleanValue()); });
            this.put("isRequestorJustificationRequired", (n) -> { currentObject.setIsRequestorJustificationRequired(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("policyDescription", (n) -> { currentObject.setPolicyDescription(n.getStringValue()); });
            this.put("policyDisplayName", (n) -> { currentObject.setPolicyDisplayName(n.getStringValue()); });
            this.put("policyId", (n) -> { currentObject.setPolicyId(n.getStringValue()); });
            this.put("questions", (n) -> { currentObject.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isApprovalRequired property value. Indicates whether a request must be approved by an approver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this._isApprovalRequired;
    }
    /**
     * Gets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForExtension() {
        return this._isApprovalRequiredForExtension;
    }
    /**
     * Gets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCustomAssignmentScheduleAllowed() {
        return this._isCustomAssignmentScheduleAllowed;
    }
    /**
     * Gets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequestorJustificationRequired() {
        return this._isRequestorJustificationRequired;
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
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDescription() {
        return this._policyDescription;
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDisplayName() {
        return this._policyDisplayName;
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this._policyId;
    }
    /**
     * Gets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this._questions;
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the existingAnswers property value. Answers that have already been provided.
     * @param value Value to set for the existingAnswers property.
     * @return a void
     */
    public void setExistingAnswers(@javax.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this._existingAnswers = value;
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether a request must be approved by an approver.
     * @param value Value to set for the isApprovalRequired property.
     * @return a void
     */
    public void setIsApprovalRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequired = value;
    }
    /**
     * Sets the isApprovalRequiredForExtension property value. Indicates whether approval is required when a user tries to extend their access.
     * @param value Value to set for the isApprovalRequiredForExtension property.
     * @return a void
     */
    public void setIsApprovalRequiredForExtension(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForExtension = value;
    }
    /**
     * Sets the isCustomAssignmentScheduleAllowed property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the isCustomAssignmentScheduleAllowed property.
     * @return a void
     */
    public void setIsCustomAssignmentScheduleAllowed(@javax.annotation.Nullable final Boolean value) {
        this._isCustomAssignmentScheduleAllowed = value;
    }
    /**
     * Sets the isRequestorJustificationRequired property value. Indicates whether a requestor must supply justification when submitting an assignment request.
     * @param value Value to set for the isRequestorJustificationRequired property.
     * @return a void
     */
    public void setIsRequestorJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequestorJustificationRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     * @return a void
     */
    public void setPolicyDescription(@javax.annotation.Nullable final String value) {
        this._policyDescription = value;
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     * @return a void
     */
    public void setPolicyDisplayName(@javax.annotation.Nullable final String value) {
        this._policyDisplayName = value;
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this._policyId = value;
    }
    /**
     * Sets the questions property value. Questions that are configured on the policy. The questions can be required or optional; callers can determine whether a question is required or optional based on the isRequired property on accessPackageQuestion.
     * @param value Value to set for the questions property.
     * @return a void
     */
    public void setQuestions(@javax.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this._questions = value;
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final RequestSchedule value) {
        this._schedule = value;
    }
}
