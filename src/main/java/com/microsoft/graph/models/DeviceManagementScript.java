package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Intune will provide customer the ability to run their Powershell scripts on the enrolled windows 10 Azure Active Directory joined devices. The script can be run once or periodically.
 */
public class DeviceManagementScript extends Entity implements Parsable {
    /**
     * The list of group assignments for the device management script.
     */
    private java.util.List<DeviceManagementScriptAssignment> assignments;
    /**
     * The date and time the device management script was created. This property is read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Optional description for the device management script.
     */
    private String description;
    /**
     * List of run states for this script across all devices.
     */
    private java.util.List<DeviceManagementScriptDeviceState> deviceRunStates;
    /**
     * Name of the device management script.
     */
    private String displayName;
    /**
     * Indicate whether the script signature needs be checked.
     */
    private Boolean enforceSignatureCheck;
    /**
     * Script file name.
     */
    private String fileName;
    /**
     * The list of group assignments for the device management script.
     */
    private java.util.List<DeviceManagementScriptGroupAssignment> groupAssignments;
    /**
     * The date and time the device management script was last modified. This property is read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * List of Scope Tag IDs for this PowerShellScript instance.
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * A value indicating whether the PowerShell script should run as 32-bit
     */
    private Boolean runAs32Bit;
    /**
     * Indicates the type of execution context the app runs in.
     */
    private RunAsAccountType runAsAccount;
    /**
     * Run summary for device management script.
     */
    private DeviceManagementScriptRunSummary runSummary;
    /**
     * The script content.
     */
    private byte[] scriptContent;
    /**
     * List of run states for this script across all users.
     */
    private java.util.List<DeviceManagementScriptUserState> userRunStates;
    /**
     * Instantiates a new deviceManagementScript and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device management script.
     * @return a deviceManagementScriptAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Optional description for the device management script.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices.
     * @return a deviceManagementScriptDeviceState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this.deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device management script.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.enforceSignatureCheck;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("groupAssignments", (n) -> { this.setGroupAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("runSummary", (n) -> { this.setRunSummary(n.getObjectValue(DeviceManagementScriptRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("userRunStates", (n) -> { this.setUserRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptUserState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Script file name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device management script.
     * @return a deviceManagementScriptGroupAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getGroupAssignments() {
        return this.groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether the PowerShell script should run as 32-bit
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.runAs32Bit;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a runAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.runAsAccount;
    }
    /**
     * Gets the runSummary property value. Run summary for device management script.
     * @return a deviceManagementScriptRunSummary
     */
    @jakarta.annotation.Nullable
    public DeviceManagementScriptRunSummary getRunSummary() {
        return this.runSummary;
    }
    /**
     * Gets the scriptContent property value. The script content.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getScriptContent() {
        return this.scriptContent;
    }
    /**
     * Gets the userRunStates property value. List of run states for this script across all users.
     * @return a deviceManagementScriptUserState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptUserState> getUserRunStates() {
        return this.userRunStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeCollectionOfObjectValues("groupAssignments", this.getGroupAssignments());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
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
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Optional description for the device management script.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceRunStates property value. List of run states for this script across all devices.
     * @param value Value to set for the deviceRunStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this.deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device management script.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked.
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.enforceSignatureCheck = value;
    }
    /**
     * Sets the fileName property value. Script file name.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this.groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether the PowerShell script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.runAs32Bit = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.runAsAccount = value;
    }
    /**
     * Sets the runSummary property value. Run summary for device management script.
     * @param value Value to set for the runSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRunSummary(@jakarta.annotation.Nullable final DeviceManagementScriptRunSummary value) {
        this.runSummary = value;
    }
    /**
     * Sets the scriptContent property value. The script content.
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScriptContent(@jakarta.annotation.Nullable final byte[] value) {
        this.scriptContent = value;
    }
    /**
     * Sets the userRunStates property value. List of run states for this script across all users.
     * @param value Value to set for the userRunStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptUserState> value) {
        this.userRunStates = value;
    }
}
