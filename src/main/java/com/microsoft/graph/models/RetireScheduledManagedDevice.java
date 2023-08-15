package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ManagedDevices that are scheduled for retire
 */
public class RetireScheduledManagedDevice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The complianceState property
     */
    private ComplianceStatus complianceState;
    /**
     * Device Compliance PolicyId
     */
    private String deviceCompliancePolicyId;
    /**
     * Device Compliance Policy Name
     */
    private String deviceCompliancePolicyName;
    /**
     * Device type.
     */
    private DeviceType deviceType;
    /**
     * Key of the entity.
     */
    private String id;
    /**
     * Managed DeviceId
     */
    private String managedDeviceId;
    /**
     * Managed Device Name
     */
    private String managedDeviceName;
    /**
     * Management agent type.
     */
    private ManagementAgentType managementAgent;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Owner type of device.
     */
    private ManagedDeviceOwnerType ownerType;
    /**
     * Managed Device Retire After DateTime
     */
    private OffsetDateTime retireAfterDateTime;
    /**
     * List of Scope Tags for this Entity instance.
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new retireScheduledManagedDevice and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RetireScheduledManagedDevice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a retireScheduledManagedDevice
     */
    @jakarta.annotation.Nonnull
    public static RetireScheduledManagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetireScheduledManagedDevice();
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
     * Gets the complianceState property value. The complianceState property
     * @return a complianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getComplianceState() {
        return this.complianceState;
    }
    /**
     * Gets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceCompliancePolicyId() {
        return this.deviceCompliancePolicyId;
    }
    /**
     * Gets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceCompliancePolicyName() {
        return this.deviceCompliancePolicyName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @jakarta.annotation.Nullable
    public DeviceType getDeviceType() {
        return this.deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("deviceCompliancePolicyId", (n) -> { this.setDeviceCompliancePolicyId(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyName", (n) -> { this.setDeviceCompliancePolicyName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceType.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("managementAgent", (n) -> { this.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
        deserializerMap.put("retireAfterDateTime", (n) -> { this.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Key of the entity.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the managedDeviceId property value. Managed DeviceId
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. Managed Device Name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a managementAgentType
     */
    @jakarta.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this.managementAgent;
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
     * Gets the ownerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOwnerType getOwnerType() {
        return this.ownerType;
    }
    /**
     * Gets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this.retireAfterDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the complianceState property value. The complianceState property
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComplianceState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.complianceState = value;
    }
    /**
     * Sets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @param value Value to set for the deviceCompliancePolicyId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceCompliancePolicyId(@jakarta.annotation.Nullable final String value) {
        this.deviceCompliancePolicyId = value;
    }
    /**
     * Sets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @param value Value to set for the deviceCompliancePolicyName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceCompliancePolicyName(@jakarta.annotation.Nullable final String value) {
        this.deviceCompliancePolicyName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceType(@jakarta.annotation.Nullable final DeviceType value) {
        this.deviceType = value;
    }
    /**
     * Sets the id property value. Key of the entity.
     * @param value Value to set for the id property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed DeviceId
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. Managed Device Name
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementAgent(@jakarta.annotation.Nullable final ManagementAgentType value) {
        this.managementAgent = value;
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
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOwnerType(@jakarta.annotation.Nullable final ManagedDeviceOwnerType value) {
        this.ownerType = value;
    }
    /**
     * Sets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @param value Value to set for the retireAfterDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRetireAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.retireAfterDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}
