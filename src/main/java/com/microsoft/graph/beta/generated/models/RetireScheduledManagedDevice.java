package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ManagedDevices that are scheduled for retire
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetireScheduledManagedDevice implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new RetireScheduledManagedDevice and sets the default values.
     */
    public RetireScheduledManagedDevice() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RetireScheduledManagedDevice
     */
    @jakarta.annotation.Nonnull
    public static RetireScheduledManagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetireScheduledManagedDevice();
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
     * Gets the complianceState property value. The complianceState property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getComplianceState() {
        return this.backingStore.get("complianceState");
    }
    /**
     * Gets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceCompliancePolicyId() {
        return this.backingStore.get("deviceCompliancePolicyId");
    }
    /**
     * Gets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceCompliancePolicyName() {
        return this.backingStore.get("deviceCompliancePolicyName");
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a DeviceType
     */
    @jakarta.annotation.Nullable
    public DeviceType getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceStatus::forValue)); });
        deserializerMap.put("deviceCompliancePolicyId", (n) -> { this.setDeviceCompliancePolicyId(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyName", (n) -> { this.setDeviceCompliancePolicyName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceType::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("managementAgent", (n) -> { this.setManagementAgent(n.getEnumValue(ManagementAgentType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getEnumValue(ManagedDeviceOwnerType::forValue)); });
        deserializerMap.put("retireAfterDateTime", (n) -> { this.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Key of the entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the managedDeviceId property value. Managed DeviceId
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the managedDeviceName property value. Managed Device Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a ManagementAgentType
     */
    @jakarta.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this.backingStore.get("managementAgent");
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
     * Gets the ownerType property value. Owner type of device.
     * @return a ManagedDeviceOwnerType
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOwnerType getOwnerType() {
        return this.backingStore.get("ownerType");
    }
    /**
     * Gets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this.backingStore.get("retireAfterDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeStringValue("deviceCompliancePolicyId", this.getDeviceCompliancePolicyId());
        writer.writeStringValue("deviceCompliancePolicyName", this.getDeviceCompliancePolicyName());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeEnumValue("managementAgent", this.getManagementAgent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeOffsetDateTimeValue("retireAfterDateTime", this.getRetireAfterDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
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
     * Sets the complianceState property value. The complianceState property
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.backingStore.set("complianceState", value);
    }
    /**
     * Sets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @param value Value to set for the deviceCompliancePolicyId property.
     */
    public void setDeviceCompliancePolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceCompliancePolicyId", value);
    }
    /**
     * Sets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @param value Value to set for the deviceCompliancePolicyName property.
     */
    public void setDeviceCompliancePolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceCompliancePolicyName", value);
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final DeviceType value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the id property value. Key of the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the managedDeviceId property value. Managed DeviceId
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managedDeviceName property value. Managed Device Name
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     */
    public void setManagementAgent(@jakarta.annotation.Nullable final ManagementAgentType value) {
        this.backingStore.set("managementAgent", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final ManagedDeviceOwnerType value) {
        this.backingStore.set("ownerType", value);
    }
    /**
     * Sets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @param value Value to set for the retireAfterDateTime property.
     */
    public void setRetireAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("retireAfterDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
