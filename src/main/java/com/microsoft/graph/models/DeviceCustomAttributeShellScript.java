package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a custom attribute script for macOS.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCustomAttributeShellScript extends Entity implements Parsable {
    /**
     * The list of group assignments for the device management script.
     */
    private java.util.List<DeviceManagementScriptAssignment> assignments;
    /**
     * The date and time the device management script was created. This property is read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The name of the custom attribute.
     */
    private String customAttributeName;
    /**
     * Represents the expected type for a macOS custom attribute script value.
     */
    private DeviceCustomAttributeValueType customAttributeType;
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
    private Base64url scriptContent;
    /**
     * List of run states for this script across all users.
     */
    private java.util.List<DeviceManagementScriptUserState> userRunStates;
    /**
     * Instantiates a new DeviceCustomAttributeShellScript and sets the default values.
     */
    public DeviceCustomAttributeShellScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCustomAttributeShellScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceCustomAttributeShellScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCustomAttributeShellScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device management script.
     * @return a java.util.List<DeviceManagementScriptAssignment>
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
     * Gets the customAttributeName property value. The name of the custom attribute.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomAttributeName() {
        return this.customAttributeName;
    }
    /**
     * Gets the customAttributeType property value. Represents the expected type for a macOS custom attribute script value.
     * @return a DeviceCustomAttributeValueType
     */
    @jakarta.annotation.Nullable
    public DeviceCustomAttributeValueType getCustomAttributeType() {
        return this.customAttributeType;
    }
    /**
     * Gets the description property value. Optional description for the device management script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceRunStates property value. List of run states for this script across all devices.
     * @return a java.util.List<DeviceManagementScriptDeviceState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptDeviceState> getDeviceRunStates() {
        return this.deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device management script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
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
        deserializerMap.put("customAttributeName", (n) -> { this.setCustomAttributeName(n.getStringValue()); });
        deserializerMap.put("customAttributeType", (n) -> { this.setCustomAttributeType(n.getEnumValue(DeviceCustomAttributeValueType.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("groupAssignments", (n) -> { this.setGroupAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("runSummary", (n) -> { this.setRunSummary(n.getObjectValue(DeviceManagementScriptRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("userRunStates", (n) -> { this.setUserRunStates(n.getCollectionOfObjectValues(DeviceManagementScriptUserState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Script file name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device management script.
     * @return a java.util.List<DeviceManagementScriptGroupAssignment>
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
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a RunAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.runAsAccount;
    }
    /**
     * Gets the runSummary property value. Run summary for device management script.
     * @return a DeviceManagementScriptRunSummary
     */
    @jakarta.annotation.Nullable
    public DeviceManagementScriptRunSummary getRunSummary() {
        return this.runSummary;
    }
    /**
     * Gets the scriptContent property value. The script content.
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getScriptContent() {
        return this.scriptContent;
    }
    /**
     * Gets the userRunStates property value. List of run states for this script across all users.
     * @return a java.util.List<DeviceManagementScriptUserState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptUserState> getUserRunStates() {
        return this.userRunStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeObjectValue("scriptContent", this.getScriptContent());
        writer.writeCollectionOfObjectValues("userRunStates", this.getUserRunStates());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the device management script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customAttributeName property value. The name of the custom attribute.
     * @param value Value to set for the customAttributeName property.
     */
    public void setCustomAttributeName(@jakarta.annotation.Nullable final String value) {
        this.customAttributeName = value;
    }
    /**
     * Sets the customAttributeType property value. Represents the expected type for a macOS custom attribute script value.
     * @param value Value to set for the customAttributeType property.
     */
    public void setCustomAttributeType(@jakarta.annotation.Nullable final DeviceCustomAttributeValueType value) {
        this.customAttributeType = value;
    }
    /**
     * Sets the description property value. Optional description for the device management script.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceRunStates property value. List of run states for this script across all devices.
     * @param value Value to set for the deviceRunStates property.
     */
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptDeviceState> value) {
        this.deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device management script.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the fileName property value. Script file name.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device management script.
     * @param value Value to set for the groupAssignments property.
     */
    public void setGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this.groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the device management script was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this PowerShellScript instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     */
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.runAsAccount = value;
    }
    /**
     * Sets the runSummary property value. Run summary for device management script.
     * @param value Value to set for the runSummary property.
     */
    public void setRunSummary(@jakarta.annotation.Nullable final DeviceManagementScriptRunSummary value) {
        this.runSummary = value;
    }
    /**
     * Sets the scriptContent property value. The script content.
     * @param value Value to set for the scriptContent property.
     */
    public void setScriptContent(@jakarta.annotation.Nullable final Base64url value) {
        this.scriptContent = value;
    }
    /**
     * Sets the userRunStates property value. List of run states for this script across all users.
     * @param value Value to set for the userRunStates property.
     */
    public void setUserRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptUserState> value) {
        this.userRunStates = value;
    }
}
