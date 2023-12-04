package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcServicePlan extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPcServicePlan and sets the default values.
     */
    public CloudPcServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcServicePlan
     */
    @jakarta.annotation.Nonnull
    public static CloudPcServicePlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcServicePlan();
    }
    /**
     * Gets the displayName property value. The name for the service plan. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("provisioningType", (n) -> { this.setProvisioningType(n.getEnumValue(CloudPcProvisioningType::forValue)); });
        deserializerMap.put("ramInGB", (n) -> { this.setRamInGB(n.getIntegerValue()); });
        deserializerMap.put("storageInGB", (n) -> { this.setStorageInGB(n.getIntegerValue()); });
        deserializerMap.put("supportedSolution", (n) -> { this.setSupportedSolution(n.getEnumSetValue(CloudPcManagementService::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CloudPcServicePlanType::forValue)); });
        deserializerMap.put("userProfileInGB", (n) -> { this.setUserProfileInGB(n.getIntegerValue()); });
        deserializerMap.put("vCpuCount", (n) -> { this.setVCpuCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the provisioningType property value. Specifies the type of license used when provisioning Cloud PCs. By default, the license type is dedicated. Possible values are: dedicated, shared, unknownFutureValue.
     * @return a CloudPcProvisioningType
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.backingStore.get("provisioningType");
    }
    /**
     * Gets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRamInGB() {
        return this.backingStore.get("ramInGB");
    }
    /**
     * Gets the storageInGB property value. The size of the OS Disk in GB. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getStorageInGB() {
        return this.backingStore.get("storageInGB");
    }
    /**
     * Gets the supportedSolution property value. The supportedSolution property
     * @return a EnumSet<CloudPcManagementService>
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcManagementService> getSupportedSolution() {
        return this.backingStore.get("supportedSolution");
    }
    /**
     * Gets the type property value. The type of the service plan. Possible values are: enterprise, business, unknownFutureValue. Read-only.
     * @return a CloudPcServicePlanType
     */
    @jakarta.annotation.Nullable
    public CloudPcServicePlanType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the userProfileInGB property value. The size of the user profile disk in GB. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserProfileInGB() {
        return this.backingStore.get("userProfileInGB");
    }
    /**
     * Gets the vCpuCount property value. The number of vCPUs. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVCpuCount() {
        return this.backingStore.get("vCpuCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("provisioningType", this.getProvisioningType());
        writer.writeIntegerValue("ramInGB", this.getRamInGB());
        writer.writeIntegerValue("storageInGB", this.getStorageInGB());
        writer.writeEnumSetValue("supportedSolution", this.getSupportedSolution());
        writer.writeEnumValue("type", this.getType());
        writer.writeIntegerValue("userProfileInGB", this.getUserProfileInGB());
        writer.writeIntegerValue("vCpuCount", this.getVCpuCount());
    }
    /**
     * Sets the displayName property value. The name for the service plan. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the provisioningType property value. Specifies the type of license used when provisioning Cloud PCs. By default, the license type is dedicated. Possible values are: dedicated, shared, unknownFutureValue.
     * @param value Value to set for the provisioningType property.
     */
    public void setProvisioningType(@jakarta.annotation.Nullable final CloudPcProvisioningType value) {
        this.backingStore.set("provisioningType", value);
    }
    /**
     * Sets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @param value Value to set for the ramInGB property.
     */
    public void setRamInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ramInGB", value);
    }
    /**
     * Sets the storageInGB property value. The size of the OS Disk in GB. Read-only.
     * @param value Value to set for the storageInGB property.
     */
    public void setStorageInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("storageInGB", value);
    }
    /**
     * Sets the supportedSolution property value. The supportedSolution property
     * @param value Value to set for the supportedSolution property.
     */
    public void setSupportedSolution(@jakarta.annotation.Nullable final EnumSet<CloudPcManagementService> value) {
        this.backingStore.set("supportedSolution", value);
    }
    /**
     * Sets the type property value. The type of the service plan. Possible values are: enterprise, business, unknownFutureValue. Read-only.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CloudPcServicePlanType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the userProfileInGB property value. The size of the user profile disk in GB. Read-only.
     * @param value Value to set for the userProfileInGB property.
     */
    public void setUserProfileInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userProfileInGB", value);
    }
    /**
     * Sets the vCpuCount property value. The number of vCPUs. Read-only.
     * @param value Value to set for the vCpuCount property.
     */
    public void setVCpuCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("vCpuCount", value);
    }
}
