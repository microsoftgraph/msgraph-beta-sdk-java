package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Configuration. */
public class DeviceConfiguration extends Entity implements Parsable {
    /** The list of assignments for the device configuration profile. */
    private java.util.List<DeviceConfigurationAssignment> _assignments;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String _description;
    /** The device mode applicability rule for this Policy. */
    private DeviceManagementApplicabilityRuleDeviceMode _deviceManagementApplicabilityRuleDeviceMode;
    /** The OS edition applicability for this Policy. */
    private DeviceManagementApplicabilityRuleOsEdition _deviceManagementApplicabilityRuleOsEdition;
    /** The OS version applicability rule for this Policy. */
    private DeviceManagementApplicabilityRuleOsVersion _deviceManagementApplicabilityRuleOsVersion;
    /** Device Configuration Setting State Device Summary */
    private java.util.List<SettingStateDeviceSummary> _deviceSettingStateSummaries;
    /** Device configuration installation status by device. */
    private java.util.List<DeviceConfigurationDeviceStatus> _deviceStatuses;
    /** Device Configuration devices status overview */
    private DeviceConfigurationDeviceOverview _deviceStatusOverview;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** The list of group assignments for the device configuration profile. */
    private java.util.List<DeviceConfigurationGroupAssignment> _groupAssignments;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. */
    private Boolean _supportsScopeTags;
    /** Device configuration installation status by user. */
    private java.util.List<DeviceConfigurationUserStatus> _userStatuses;
    /** Device Configuration users status overview */
    private DeviceConfigurationUserOverview _userStatusOverview;
    /** Version of the device configuration. */
    private Integer _version;
    /**
     * Instantiates a new deviceConfiguration and sets the default values.
     * @return a void
     */
    public DeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceConfiguration": return new DeviceConfiguration();
            }
        }
        return new DeviceConfiguration();
    }
    /**
     * Gets the assignments property value. The list of assignments for the device configuration profile.
     * @return a deviceConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @return a deviceManagementApplicabilityRuleDeviceMode
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleDeviceMode getDeviceManagementApplicabilityRuleDeviceMode() {
        return this._deviceManagementApplicabilityRuleDeviceMode;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @return a deviceManagementApplicabilityRuleOsEdition
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsEdition getDeviceManagementApplicabilityRuleOsEdition() {
        return this._deviceManagementApplicabilityRuleOsEdition;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @return a deviceManagementApplicabilityRuleOsVersion
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsVersion getDeviceManagementApplicabilityRuleOsVersion() {
        return this._deviceManagementApplicabilityRuleOsVersion;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @javax.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this._deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a deviceConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a deviceConfigurationDeviceOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
        return this._deviceStatusOverview;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceManagementApplicabilityRuleDeviceMode", (n) -> { currentObject.setDeviceManagementApplicabilityRuleDeviceMode(n.getObjectValue(DeviceManagementApplicabilityRuleDeviceMode::createFromDiscriminatorValue)); });
            this.put("deviceManagementApplicabilityRuleOsEdition", (n) -> { currentObject.setDeviceManagementApplicabilityRuleOsEdition(n.getObjectValue(DeviceManagementApplicabilityRuleOsEdition::createFromDiscriminatorValue)); });
            this.put("deviceManagementApplicabilityRuleOsVersion", (n) -> { currentObject.setDeviceManagementApplicabilityRuleOsVersion(n.getObjectValue(DeviceManagementApplicabilityRuleOsVersion::createFromDiscriminatorValue)); });
            this.put("deviceSettingStateSummaries", (n) -> { currentObject.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceConfigurationDeviceStatus::createFromDiscriminatorValue)); });
            this.put("deviceStatusOverview", (n) -> { currentObject.setDeviceStatusOverview(n.getObjectValue(DeviceConfigurationDeviceOverview::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("groupAssignments", (n) -> { currentObject.setGroupAssignments(n.getCollectionOfObjectValues(DeviceConfigurationGroupAssignment::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("supportsScopeTags", (n) -> { currentObject.setSupportsScopeTags(n.getBooleanValue()); });
            this.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(DeviceConfigurationUserStatus::createFromDiscriminatorValue)); });
            this.put("userStatusOverview", (n) -> { currentObject.setUserStatusOverview(n.getObjectValue(DeviceConfigurationUserOverview::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @return a deviceConfigurationGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationGroupAssignment> getGroupAssignments() {
        return this._groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
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
     * Gets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsScopeTags() {
        return this._supportsScopeTags;
    }
    /**
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a deviceConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a deviceConfigurationUserOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
        return this._userStatusOverview;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("deviceManagementApplicabilityRuleDeviceMode", this.getDeviceManagementApplicabilityRuleDeviceMode());
        writer.writeObjectValue("deviceManagementApplicabilityRuleOsEdition", this.getDeviceManagementApplicabilityRuleOsEdition());
        writer.writeObjectValue("deviceManagementApplicabilityRuleOsVersion", this.getDeviceManagementApplicabilityRuleOsVersion());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusOverview", this.getDeviceStatusOverview());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("groupAssignments", this.getGroupAssignments());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("supportsScopeTags", this.getSupportsScopeTags());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusOverview", this.getUserStatusOverview());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of assignments for the device configuration profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleDeviceMode property.
     * @return a void
     */
    public void setDeviceManagementApplicabilityRuleDeviceMode(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleDeviceMode value) {
        this._deviceManagementApplicabilityRuleDeviceMode = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsEdition property.
     * @return a void
     */
    public void setDeviceManagementApplicabilityRuleOsEdition(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleOsEdition value) {
        this._deviceManagementApplicabilityRuleOsEdition = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsVersion property.
     * @return a void
     */
    public void setDeviceManagementApplicabilityRuleOsVersion(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleOsVersion value) {
        this._deviceManagementApplicabilityRuleOsVersion = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this._deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     * @return a void
     */
    public void setDeviceStatusOverview(@javax.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this._deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    public void setGroupAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationGroupAssignment> value) {
        this._groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @param value Value to set for the supportsScopeTags property.
     * @return a void
     */
    public void setSupportsScopeTags(@javax.annotation.Nullable final Boolean value) {
        this._supportsScopeTags = value;
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     * @return a void
     */
    public void setUserStatusOverview(@javax.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this._userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
