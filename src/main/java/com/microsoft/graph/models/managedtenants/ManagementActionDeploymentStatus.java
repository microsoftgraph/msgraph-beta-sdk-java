package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementActionDeploymentStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier for the management action. Required. Read-only.
     */
    private String managementActionId;
    /**
     * The management template identifier that was used to generate the management action. Required. Read-only.
     */
    private String managementTemplateId;
    /**
     * The managementTemplateVersion property
     */
    private Integer managementTemplateVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status property
     */
    private ManagementActionStatus status;
    /**
     * The collection of workload action deployment statues for the given management action. Optional.
     */
    private java.util.List<WorkloadActionDeploymentStatus> workloadActionDeploymentStatuses;
    /**
     * Instantiates a new managementActionDeploymentStatus and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagementActionDeploymentStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementActionDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public static ManagementActionDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementActionDeploymentStatus();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("managementActionId", (n) -> { this.setManagementActionId(n.getStringValue()); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("managementTemplateVersion", (n) -> { this.setManagementTemplateVersion(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ManagementActionStatus.class)); });
        deserializerMap.put("workloadActionDeploymentStatuses", (n) -> { this.setWorkloadActionDeploymentStatuses(n.getCollectionOfObjectValues(WorkloadActionDeploymentStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagementActionId() {
        return this.managementActionId;
    }
    /**
     * Gets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.managementTemplateId;
    }
    /**
     * Gets the managementTemplateVersion property value. The managementTemplateVersion property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getManagementTemplateVersion() {
        return this.managementTemplateVersion;
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
     * @return a managementActionStatus
     */
    @jakarta.annotation.Nullable
    public ManagementActionStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @return a workloadActionDeploymentStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkloadActionDeploymentStatus> getWorkloadActionDeploymentStatuses() {
        return this.workloadActionDeploymentStatuses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managementActionId", this.getManagementActionId());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeIntegerValue("managementTemplateVersion", this.getManagementTemplateVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("workloadActionDeploymentStatuses", this.getWorkloadActionDeploymentStatuses());
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
     * Sets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @param value Value to set for the managementActionId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementActionId(@jakarta.annotation.Nullable final String value) {
        this.managementActionId = value;
    }
    /**
     * Sets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
     * @param value Value to set for the managementTemplateId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.managementTemplateId = value;
    }
    /**
     * Sets the managementTemplateVersion property value. The managementTemplateVersion property
     * @param value Value to set for the managementTemplateVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateVersion(@jakarta.annotation.Nullable final Integer value) {
        this.managementTemplateVersion = value;
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
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final ManagementActionStatus value) {
        this.status = value;
    }
    /**
     * Sets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @param value Value to set for the workloadActionDeploymentStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWorkloadActionDeploymentStatuses(@jakarta.annotation.Nullable final java.util.List<WorkloadActionDeploymentStatus> value) {
        this.workloadActionDeploymentStatuses = value;
    }
}
