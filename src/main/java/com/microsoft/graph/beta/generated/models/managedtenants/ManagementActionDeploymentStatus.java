package com.microsoft.graph.beta.models.managedtenants;

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
public class ManagementActionDeploymentStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ManagementActionDeploymentStatus} and sets the default values.
     */
    public ManagementActionDeploymentStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagementActionDeploymentStatus}
     */
    @jakarta.annotation.Nonnull
    public static ManagementActionDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementActionDeploymentStatus();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("managementActionId", (n) -> { this.setManagementActionId(n.getStringValue()); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("managementTemplateVersion", (n) -> { this.setManagementTemplateVersion(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ManagementActionStatus::forValue)); });
        deserializerMap.put("workloadActionDeploymentStatuses", (n) -> { this.setWorkloadActionDeploymentStatuses(n.getCollectionOfObjectValues(WorkloadActionDeploymentStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementActionId() {
        return this.backingStore.get("managementActionId");
    }
    /**
     * Gets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.backingStore.get("managementTemplateId");
    }
    /**
     * Gets the managementTemplateVersion property value. The managementTemplateVersion property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getManagementTemplateVersion() {
        return this.backingStore.get("managementTemplateVersion");
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
     * Gets the status property value. The status property
     * @return a {@link ManagementActionStatus}
     */
    @jakarta.annotation.Nullable
    public ManagementActionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @return a {@link java.util.List<WorkloadActionDeploymentStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkloadActionDeploymentStatus> getWorkloadActionDeploymentStatuses() {
        return this.backingStore.get("workloadActionDeploymentStatuses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @param value Value to set for the managementActionId property.
     */
    public void setManagementActionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementActionId", value);
    }
    /**
     * Sets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
     * @param value Value to set for the managementTemplateId property.
     */
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managementTemplateId", value);
    }
    /**
     * Sets the managementTemplateVersion property value. The managementTemplateVersion property
     * @param value Value to set for the managementTemplateVersion property.
     */
    public void setManagementTemplateVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("managementTemplateVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ManagementActionStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @param value Value to set for the workloadActionDeploymentStatuses property.
     */
    public void setWorkloadActionDeploymentStatuses(@jakarta.annotation.Nullable final java.util.List<WorkloadActionDeploymentStatus> value) {
        this.backingStore.set("workloadActionDeploymentStatuses", value);
    }
}
