package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a custom attribute script for macOS. */
public class DeviceCustomAttributeShellScript extends Entity implements Parsable {
    /** The list of group assignments for the device management script. */
    private java.util.List<DeviceManagementScriptAssignment> _assignments;
    /** The date and time the device management script was created. This property is read-only. */
    private OffsetDateTime _createdDateTime;
    /** The name of the custom attribute. */
    private String _customAttributeName;
    /** Represents the expected type for a macOS custom attribute script value. */
    private DeviceCustomAttributeValueType _customAttributeType;
    /** Optional description for the device management script. */
    private String _description;
    /** List of run states for this script across all devices. */
    private java.util.List<DeviceManagementScriptDeviceState> _deviceRunStates;
    /** Name of the device management script. */
    private String _displayName;
    /** Script file name. */
    private String _fileName;
    /** The list of group assignments for the device management script. */
    private java.util.List<DeviceManagementScriptGroupAssignment> _groupAssignments;
    /** The date and time the device management script was last modified. This property is read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tag IDs for this PowerShellScript instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /** Run summary for device management script. */
    private DeviceManagementScriptRunSummary _runSummary;
    /** The script content. */
    private byte[] _scriptContent;
    /** List of run states for this script across all users. */
    private java.util.List<DeviceManagementScriptUserState> _userRunStates;
    /**
     * Instantiates a new deviceCustomAttributeShellScript and sets the default values.
     * @return a void
     */
    public DeviceCustomAttributeShellScript() {
        super();
        this.setOdataType("#microsoft.graph.deviceCustomAttributeShellScript");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCustomAttributeShellScript
     */
    @javax.annotation.Nonnull
    public static DeviceCustomAttributeShellScript createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCustomAttributeShellScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device management script.
     * @return a deviceManagementScriptAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customAttributeName property value. The name of the custom attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomAttributeName() {
        return this._customAttributeName;
    }
    /**
     * Gets the customAttributeType property value. Represents the expected type for a macOS custom attribute script value.
     * @return a deviceCustomAttributeValueType
     */
    @javax.annotation.Nullable
    public DeviceCustomAttributeValueType getCustomAttributeType() {
        return this._customAttributeType;
    }
    /**
     * Gets the description property value. Optional description for the device management script.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices.
     * @return a deviceManagementScriptDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this._deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device management script.
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
        final DeviceCustomAttributeShellScript currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customAttributeName", (n) -> { currentObject.setCustomAttributeName(n.getStringValue()); });
            this.put("customAttributeType", (n) -> { currentObject.setCustomAttributeType(n.getEnumValue(DeviceCustomAttributeValueType.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceRunStates", (n) -> { currentObject.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptDeviceState::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("groupAssignments", (n) -> { currentObject.setGroupAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptGroupAssignment::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("runAsAccount", (n) -> { currentObject.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
            this.put("runSummary", (n) -> { currentObject.setRunSummary(n.getObjectValue(DeviceManagementScriptRunSummary::createFromDiscriminatorValue)); });
            this.put("scriptContent", (n) -> { currentObject.setScriptContent(n.getByteArrayValue()); });
            this.put("userRunStates", (n) -> { currentObject.setUserRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptUserState::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fileName property value. Script file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device management script.
     * @return a deviceManagementScriptGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getGroupAssignments() {
        return this._groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a runAsAccountType
     */
    @javax.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this._runAsAccount;
    }
    /**
     * Gets the runSummary property value. Run summary for device management script.
     * @return a deviceManagementScriptRunSummary
     */
    @javax.annotation.Nullable
    public DeviceManagementScriptRunSummary getRunSummary() {
        return this._runSummary;
    }
    /**
     * Gets the scriptContent property value. The script content.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getScriptContent() {
        return this._scriptContent;
    }
    /**
     * Gets the userRunStates property value. List of run states for this script across all users.
     * @return a deviceManagementScriptUserState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptUserState> getUserRunStates() {
        return this._userRunStates;
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
        writer.writeStringValue("customAttributeName", this.getCustomAttributeName());
        writer.writeEnumValue("customAttributeType", this.getCustomAttributeType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeCollectionOfObjectValues("groupAssignments", this.getGroupAssignments());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeObjectValue("runSummary", this.getRunSummary());
        writer.writeByteArrayValue("scriptContent", this.getScriptContent());
        writer.writeCollectionOfObjectValues("userRunStates", this.getUserRunStates());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customAttributeName property value. The name of the custom attribute.
     * @param value Value to set for the customAttributeName property.
     * @return a void
     */
    public void setCustomAttributeName(@javax.annotation.Nullable final String value) {
        this._customAttributeName = value;
    }
    /**
     * Sets the customAttributeType property value. Represents the expected type for a macOS custom attribute script value.
     * @param value Value to set for the customAttributeType property.
     * @return a void
     */
    public void setCustomAttributeType(@javax.annotation.Nullable final DeviceCustomAttributeValueType value) {
        this._customAttributeType = value;
    }
    /**
     * Sets the description property value. Optional description for the device management script.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceRunStates property value. List of run states for this script across all devices.
     * @param value Value to set for the deviceRunStates property.
     * @return a void
     */
    public void setDeviceRunStates(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this._deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device management script.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the fileName property value. Script file name.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    public void setGroupAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this._groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
    /**
     * Sets the runSummary property value. Run summary for device management script.
     * @param value Value to set for the runSummary property.
     * @return a void
     */
    public void setRunSummary(@javax.annotation.Nullable final DeviceManagementScriptRunSummary value) {
        this._runSummary = value;
    }
    /**
     * Sets the scriptContent property value. The script content.
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    public void setScriptContent(@javax.annotation.Nullable final byte[] value) {
        this._scriptContent = value;
    }
    /**
     * Sets the userRunStates property value. List of run states for this script across all users.
     * @param value Value to set for the userRunStates property.
     * @return a void
     */
    public void setUserRunStates(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptUserState> value) {
        this._userRunStates = value;
    }
}
