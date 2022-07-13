package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** ManagedDevices that are scheduled for retire */
public class RetireScheduledManagedDevice implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The complianceState property */
    private ComplianceStatus _complianceState;
    /** Device Compliance PolicyId */
    private String _deviceCompliancePolicyId;
    /** Device Compliance Policy Name */
    private String _deviceCompliancePolicyName;
    /** Device type. */
    private DeviceType _deviceType;
    /** Key of the entity. */
    private String _id;
    /** Managed DeviceId */
    private String _managedDeviceId;
    /** Managed Device Name */
    private String _managedDeviceName;
    /** Management agent type. */
    private ManagementAgentType _managementAgent;
    /** Owner type of device. */
    private ManagedDeviceOwnerType _ownerType;
    /** Managed Device Retire After DateTime */
    private OffsetDateTime _retireAfterDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /**
     * Instantiates a new retireScheduledManagedDevice and sets the default values.
     * @return a void
     */
    public RetireScheduledManagedDevice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a retireScheduledManagedDevice
     */
    @javax.annotation.Nonnull
    public static RetireScheduledManagedDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetireScheduledManagedDevice();
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
     * Gets the complianceState property value. The complianceState property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getComplianceState() {
        return this._complianceState;
    }
    /**
     * Gets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCompliancePolicyId() {
        return this._deviceCompliancePolicyId;
    }
    /**
     * Gets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCompliancePolicyName() {
        return this._deviceCompliancePolicyName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @javax.annotation.Nullable
    public DeviceType getDeviceType() {
        return this._deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RetireScheduledManagedDevice currentObject = this;
        return new HashMap<>(11) {{
            this.put("complianceState", (n) -> { currentObject.setComplianceState(n.getEnumValue(ComplianceStatus.class)); });
            this.put("deviceCompliancePolicyId", (n) -> { currentObject.setDeviceCompliancePolicyId(n.getStringValue()); });
            this.put("deviceCompliancePolicyName", (n) -> { currentObject.setDeviceCompliancePolicyName(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(DeviceType.class)); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("managementAgent", (n) -> { currentObject.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
            this.put("ownerType", (n) -> { currentObject.setOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
            this.put("retireAfterDateTime", (n) -> { currentObject.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the id property value. Key of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the managedDeviceId property value. Managed DeviceId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. Managed Device Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a managementAgentType
     */
    @javax.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this._managementAgent;
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @javax.annotation.Nullable
    public ManagedDeviceOwnerType getOwnerType() {
        return this._ownerType;
    }
    /**
     * Gets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this._retireAfterDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeStringValue("deviceCompliancePolicyId", this.getDeviceCompliancePolicyId());
        writer.writeStringValue("deviceCompliancePolicyName", this.getDeviceCompliancePolicyName());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeEnumValue("managementAgent", this.getManagementAgent());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeOffsetDateTimeValue("retireAfterDateTime", this.getRetireAfterDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
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
     * Sets the complianceState property value. The complianceState property
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    public void setComplianceState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._complianceState = value;
    }
    /**
     * Sets the deviceCompliancePolicyId property value. Device Compliance PolicyId
     * @param value Value to set for the deviceCompliancePolicyId property.
     * @return a void
     */
    public void setDeviceCompliancePolicyId(@javax.annotation.Nullable final String value) {
        this._deviceCompliancePolicyId = value;
    }
    /**
     * Sets the deviceCompliancePolicyName property value. Device Compliance Policy Name
     * @param value Value to set for the deviceCompliancePolicyName property.
     * @return a void
     */
    public void setDeviceCompliancePolicyName(@javax.annotation.Nullable final String value) {
        this._deviceCompliancePolicyName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    public void setDeviceType(@javax.annotation.Nullable final DeviceType value) {
        this._deviceType = value;
    }
    /**
     * Sets the id property value. Key of the entity.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed DeviceId
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. Managed Device Name
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     * @return a void
     */
    public void setManagementAgent(@javax.annotation.Nullable final ManagementAgentType value) {
        this._managementAgent = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    public void setOwnerType(@javax.annotation.Nullable final ManagedDeviceOwnerType value) {
        this._ownerType = value;
    }
    /**
     * Sets the retireAfterDateTime property value. Managed Device Retire After DateTime
     * @param value Value to set for the retireAfterDateTime property.
     * @return a void
     */
    public void setRetireAfterDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._retireAfterDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
}
