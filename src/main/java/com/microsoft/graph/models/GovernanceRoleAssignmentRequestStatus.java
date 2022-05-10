package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceRoleAssignmentRequestStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The status of the role assignment request. The value can be InProgress or Closed. */
    private String _status;
    /** The details of the status of the role assignment request. It represents the evaluation results of different rules. */
    private java.util.List<KeyValue> _statusDetails;
    /** The sub status of the role assignment request. The values can be Accepted, PendingEvaluation, Granted, Denied, PendingProvisioning, Provisioned, PendingRevocation, Revoked, Canceled, Failed, PendingApprovalProvisioning, PendingApproval, FailedAsResourceIsLocked, PendingAdminDecision, AdminApproved, AdminDenied, TimedOut, and ProvisioningStarted. */
    private String _subStatus;
    /**
     * Instantiates a new governanceRoleAssignmentRequestStatus and sets the default values.
     * @return a void
     */
    public GovernanceRoleAssignmentRequestStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRoleAssignmentRequestStatus
     */
    @javax.annotation.Nonnull
    public static GovernanceRoleAssignmentRequestStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleAssignmentRequestStatus();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceRoleAssignmentRequestStatus currentObject = this;
        return new HashMap<>(3) {{
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("subStatus", (n) -> { currentObject.setSubStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the status property value. The status of the role assignment request. The value can be InProgress or Closed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetails property value. The details of the status of the role assignment request. It represents the evaluation results of different rules.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Gets the subStatus property value. The sub status of the role assignment request. The values can be Accepted, PendingEvaluation, Granted, Denied, PendingProvisioning, Provisioned, PendingRevocation, Revoked, Canceled, Failed, PendingApprovalProvisioning, PendingApproval, FailedAsResourceIsLocked, PendingAdminDecision, AdminApproved, AdminDenied, TimedOut, and ProvisioningStarted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubStatus() {
        return this._subStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("statusDetails", this.getStatusDetails());
        writer.writeStringValue("subStatus", this.getSubStatus());
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
     * Sets the status property value. The status of the role assignment request. The value can be InProgress or Closed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the statusDetails property value. The details of the status of the role assignment request. It represents the evaluation results of different rules.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._statusDetails = value;
    }
    /**
     * Sets the subStatus property value. The sub status of the role assignment request. The values can be Accepted, PendingEvaluation, Granted, Denied, PendingProvisioning, Provisioned, PendingRevocation, Revoked, Canceled, Failed, PendingApprovalProvisioning, PendingApproval, FailedAsResourceIsLocked, PendingAdminDecision, AdminApproved, AdminDenied, TimedOut, and ProvisioningStarted.
     * @param value Value to set for the subStatus property.
     * @return a void
     */
    public void setSubStatus(@javax.annotation.Nullable final String value) {
        this._subStatus = value;
    }
}
