package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GenericError;
public class WorkloadActionDeploymentStatus implements AdditionalDataHolder, Parsable {
    /** The unique identifier for the workload action. Required. Read-only. */
    private String _actionId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The identifier of any policy that was created by applying the workload action. Optional. Read-only. */
    private String _deployedPolicyId;
    /** The detailed information for exceptions that occur when deploying the workload action. Optional. Required. */
    private GenericError _error;
    /** The excludeGroups property */
    private java.util.List<String> _excludeGroups;
    /** The includeAllUsers property */
    private Boolean _includeAllUsers;
    /** The includeGroups property */
    private java.util.List<String> _includeGroups;
    /** The date and time the workload action was last deployed. Optional. */
    private OffsetDateTime _lastDeploymentDateTime;
    /** The status property */
    private WorkloadActionStatus _status;
    /**
     * Instantiates a new workloadActionDeploymentStatus and sets the default values.
     * @return a void
     */
    public WorkloadActionDeploymentStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadActionDeploymentStatus
     */
    @javax.annotation.Nonnull
    public static WorkloadActionDeploymentStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadActionDeploymentStatus();
    }
    /**
     * Gets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionId() {
        return this._actionId;
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
     * Gets the deployedPolicyId property value. The identifier of any policy that was created by applying the workload action. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeployedPolicyId() {
        return this._deployedPolicyId;
    }
    /**
     * Gets the error property value. The detailed information for exceptions that occur when deploying the workload action. Optional. Required.
     * @return a genericError
     */
    @javax.annotation.Nullable
    public GenericError getError() {
        return this._error;
    }
    /**
     * Gets the excludeGroups property value. The excludeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this._excludeGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkloadActionDeploymentStatus currentObject = this;
        return new HashMap<>(8) {{
            this.put("actionId", (n) -> { currentObject.setActionId(n.getStringValue()); });
            this.put("deployedPolicyId", (n) -> { currentObject.setDeployedPolicyId(n.getStringValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(GenericError::createFromDiscriminatorValue)); });
            this.put("excludeGroups", (n) -> { currentObject.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeAllUsers", (n) -> { currentObject.setIncludeAllUsers(n.getBooleanValue()); });
            this.put("includeGroups", (n) -> { currentObject.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("lastDeploymentDateTime", (n) -> { currentObject.setLastDeploymentDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(WorkloadActionStatus.class)); });
        }};
    }
    /**
     * Gets the includeAllUsers property value. The includeAllUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeAllUsers() {
        return this._includeAllUsers;
    }
    /**
     * Gets the includeGroups property value. The includeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this._includeGroups;
    }
    /**
     * Gets the lastDeploymentDateTime property value. The date and time the workload action was last deployed. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDeploymentDateTime() {
        return this._lastDeploymentDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a workloadActionStatus
     */
    @javax.annotation.Nullable
    public WorkloadActionStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeStringValue("deployedPolicyId", this.getDeployedPolicyId());
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeBooleanValue("includeAllUsers", this.getIncludeAllUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeOffsetDateTimeValue("lastDeploymentDateTime", this.getLastDeploymentDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @param value Value to set for the actionId property.
     * @return a void
     */
    public void setActionId(@javax.annotation.Nullable final String value) {
        this._actionId = value;
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
     * Sets the deployedPolicyId property value. The identifier of any policy that was created by applying the workload action. Optional. Read-only.
     * @param value Value to set for the deployedPolicyId property.
     * @return a void
     */
    public void setDeployedPolicyId(@javax.annotation.Nullable final String value) {
        this._deployedPolicyId = value;
    }
    /**
     * Sets the error property value. The detailed information for exceptions that occur when deploying the workload action. Optional. Required.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final GenericError value) {
        this._error = value;
    }
    /**
     * Sets the excludeGroups property value. The excludeGroups property
     * @param value Value to set for the excludeGroups property.
     * @return a void
     */
    public void setExcludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeGroups = value;
    }
    /**
     * Sets the includeAllUsers property value. The includeAllUsers property
     * @param value Value to set for the includeAllUsers property.
     * @return a void
     */
    public void setIncludeAllUsers(@javax.annotation.Nullable final Boolean value) {
        this._includeAllUsers = value;
    }
    /**
     * Sets the includeGroups property value. The includeGroups property
     * @param value Value to set for the includeGroups property.
     * @return a void
     */
    public void setIncludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeGroups = value;
    }
    /**
     * Sets the lastDeploymentDateTime property value. The date and time the workload action was last deployed. Optional.
     * @param value Value to set for the lastDeploymentDateTime property.
     * @return a void
     */
    public void setLastDeploymentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastDeploymentDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final WorkloadActionStatus value) {
        this._status = value;
    }
}
