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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementScript extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementScript and sets the default values.
     */
    public DeviceManagementScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device management script.
     * @return a java.util.List<DeviceManagementScriptAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Optional description for the device management script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices.
     * @return a java.util.List<DeviceManagementScriptDeviceState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this.BackingStore.get("deviceRunStates");
    }
    /**
     * Gets the displayName property value. Name of the device management script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.BackingStore.get("enforceSignatureCheck");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.BackingStore.get("fileName");
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device management script.
     * @return a java.util.List<DeviceManagementScriptGroupAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getGroupAssignments() {
        return this.BackingStore.get("groupAssignments");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether the PowerShell script should run as 32-bit
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.BackingStore.get("runAs32Bit");
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a RunAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.BackingStore.get("runAsAccount");
    }
    /**
     * Gets the runSummary property value. Run summary for device management script.
     * @return a DeviceManagementScriptRunSummary
     */
    @jakarta.annotation.Nullable
    public DeviceManagementScriptRunSummary getRunSummary() {
        return this.BackingStore.get("runSummary");
    }
    /**
     * Gets the scriptContent property value. The script content.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getScriptContent() {
        return this.BackingStore.get("scriptContent");
    }
    /**
     * Gets the userRunStates property value. List of run states for this script across all users.
     * @return a java.util.List<DeviceManagementScriptUserState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptUserState> getUserRunStates() {
        return this.BackingStore.get("userRunStates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Optional description for the device management script.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the deviceRunStates property value. List of run states for this script across all devices.
     * @param value Value to set for the deviceRunStates property.
     */
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this.BackingStore.set("deviceRunStates", value);
    }
    /**
     * Sets the displayName property value. Name of the device management script.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked.
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the fileName property value. Script file name.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fileName", value);
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the groupAssignments property.
     */
    public void setGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this.BackingStore.set("groupAssignments", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether the PowerShell script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     */
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("runAs32Bit", value);
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     */
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.BackingStore.set("runAsAccount", value);
    }
    /**
     * Sets the runSummary property value. Run summary for device management script.
     * @param value Value to set for the runSummary property.
     */
    public void setRunSummary(@jakarta.annotation.Nullable final DeviceManagementScriptRunSummary value) {
        this.BackingStore.set("runSummary", value);
    }
    /**
     * Sets the scriptContent property value. The script content.
     * @param value Value to set for the scriptContent property.
     */
    public void setScriptContent(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("scriptContent", value);
    }
    /**
     * Sets the userRunStates property value. List of run states for this script across all users.
     * @param value Value to set for the userRunStates property.
     */
    public void setUserRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptUserState> value) {
        this.BackingStore.set("userRunStates", value);
    }
}
