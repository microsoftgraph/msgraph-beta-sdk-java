package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.GenericError;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkloadActionDeploymentStatus implements AdditionalDataHolder, Parsable {
    /**
     * The unique identifier for the workload action. Required. Read-only.
     */
    private String actionId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier of any policy that was created by applying the workload action. Optional. Read-only.
     */
    private String deployedPolicyId;
    /**
     * The detailed information for exceptions that occur when deploying the workload action. Optional. Required.
     */
    private GenericError error;
    /**
     * The excludeGroups property
     */
    private java.util.List<String> excludeGroups;
    /**
     * The includeAllUsers property
     */
    private Boolean includeAllUsers;
    /**
     * The includeGroups property
     */
    private java.util.List<String> includeGroups;
    /**
     * The date and time the workload action was last deployed. Optional.
     */
    private OffsetDateTime lastDeploymentDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status property
     */
    private WorkloadActionStatus status;
    /**
     * Instantiates a new workloadActionDeploymentStatus and sets the default values.
     */
    public WorkloadActionDeploymentStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadActionDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public static WorkloadActionDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadActionDeploymentStatus();
    }
    /**
     * Gets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActionId() {
        return this.actionId;
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
     * Gets the deployedPolicyId property value. The identifier of any policy that was created by applying the workload action. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeployedPolicyId() {
        return this.deployedPolicyId;
    }
    /**
     * Gets the error property value. The detailed information for exceptions that occur when deploying the workload action. Optional. Required.
     * @return a genericError
     */
    @jakarta.annotation.Nullable
    public GenericError getError() {
        return this.error;
    }
    /**
     * Gets the excludeGroups property value. The excludeGroups property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this.excludeGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("deployedPolicyId", (n) -> { this.setDeployedPolicyId(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(GenericError::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeGroups", (n) -> { this.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAllUsers", (n) -> { this.setIncludeAllUsers(n.getBooleanValue()); });
        deserializerMap.put("includeGroups", (n) -> { this.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("lastDeploymentDateTime", (n) -> { this.setLastDeploymentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WorkloadActionStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeAllUsers property value. The includeAllUsers property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAllUsers() {
        return this.includeAllUsers;
    }
    /**
     * Gets the includeGroups property value. The includeGroups property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this.includeGroups;
    }
    /**
     * Gets the lastDeploymentDateTime property value. The date and time the workload action was last deployed. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastDeploymentDateTime() {
        return this.lastDeploymentDateTime;
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
     * Gets the status property value. The status property
     * @return a workloadActionStatus
     */
    @jakarta.annotation.Nullable
    public WorkloadActionStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeStringValue("deployedPolicyId", this.getDeployedPolicyId());
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeBooleanValue("includeAllUsers", this.getIncludeAllUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeOffsetDateTimeValue("lastDeploymentDateTime", this.getLastDeploymentDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @param value Value to set for the actionId property.
     */
    public void setActionId(@jakarta.annotation.Nullable final String value) {
        this.actionId = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deployedPolicyId property value. The identifier of any policy that was created by applying the workload action. Optional. Read-only.
     * @param value Value to set for the deployedPolicyId property.
     */
    public void setDeployedPolicyId(@jakarta.annotation.Nullable final String value) {
        this.deployedPolicyId = value;
    }
    /**
     * Sets the error property value. The detailed information for exceptions that occur when deploying the workload action. Optional. Required.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final GenericError value) {
        this.error = value;
    }
    /**
     * Sets the excludeGroups property value. The excludeGroups property
     * @param value Value to set for the excludeGroups property.
     */
    public void setExcludeGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludeGroups = value;
    }
    /**
     * Sets the includeAllUsers property value. The includeAllUsers property
     * @param value Value to set for the includeAllUsers property.
     */
    public void setIncludeAllUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.includeAllUsers = value;
    }
    /**
     * Sets the includeGroups property value. The includeGroups property
     * @param value Value to set for the includeGroups property.
     */
    public void setIncludeGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.includeGroups = value;
    }
    /**
     * Sets the lastDeploymentDateTime property value. The date and time the workload action was last deployed. Optional.
     * @param value Value to set for the lastDeploymentDateTime property.
     */
    public void setLastDeploymentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastDeploymentDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final WorkloadActionStatus value) {
        this.status = value;
    }
}
