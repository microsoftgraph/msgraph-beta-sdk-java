package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Intune will provide customer the ability to run their Powershell Health scripts (remediation + detection) on the enrolled windows 10 Azure Active Directory joined devices.
 */
public class DeviceHealthScript extends Entity implements Parsable {
    /**
     * The list of group assignments for the device health script
     */
    private java.util.List<DeviceHealthScriptAssignment> assignments;
    /**
     * The timestamp of when the device health script was created. This property is read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the device health script
     */
    private String description;
    /**
     * The entire content of the detection powershell script
     */
    private byte[] detectionScriptContent;
    /**
     * List of ComplexType DetectionScriptParameters objects.
     */
    private java.util.List<DeviceHealthScriptParameter> detectionScriptParameters;
    /**
     * Indicates the type of device script.
     */
    private DeviceHealthScriptType deviceHealthScriptType;
    /**
     * List of run states for the device health script across all devices
     */
    private java.util.List<DeviceHealthScriptDeviceState> deviceRunStates;
    /**
     * Name of the device health script
     */
    private String displayName;
    /**
     * Indicate whether the script signature needs be checked
     */
    private Boolean enforceSignatureCheck;
    /**
     * Highest available version for a Microsoft Proprietary script
     */
    private String highestAvailableVersion;
    /**
     * Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     */
    private Boolean isGlobalScript;
    /**
     * The timestamp of when the device health script was modified. This property is read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Name of the device health script publisher
     */
    private String publisher;
    /**
     * The entire content of the remediation powershell script
     */
    private byte[] remediationScriptContent;
    /**
     * List of ComplexType RemediationScriptParameters objects.
     */
    private java.util.List<DeviceHealthScriptParameter> remediationScriptParameters;
    /**
     * List of Scope Tag IDs for the device health script
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Indicate whether PowerShell script(s) should run as 32-bit
     */
    private Boolean runAs32Bit;
    /**
     * Indicates the type of execution context the app runs in.
     */
    private RunAsAccountType runAsAccount;
    /**
     * High level run summary for device health script.
     */
    private DeviceHealthScriptRunSummary runSummary;
    /**
     * Version of the device health script
     */
    private String version;
    /**
     * Instantiates a new deviceHealthScript and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceHealthScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device health script
     * @return a deviceHealthScriptAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The timestamp of when the device health script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the detectionScriptContent property value. The entire content of the detection powershell script
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getDetectionScriptContent() {
        return this.detectionScriptContent;
    }
    /**
     * Gets the detectionScriptParameters property value. List of ComplexType DetectionScriptParameters objects.
     * @return a deviceHealthScriptParameter
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptParameter> getDetectionScriptParameters() {
        return this.detectionScriptParameters;
    }
    /**
     * Gets the deviceHealthScriptType property value. Indicates the type of device script.
     * @return a deviceHealthScriptType
     */
    @jakarta.annotation.Nullable
    public DeviceHealthScriptType getDeviceHealthScriptType() {
        return this.deviceHealthScriptType;
    }
    /**
     * Gets the deviceRunStates property value. List of run states for the device health script across all devices
     * @return a deviceHealthScriptDeviceState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptDeviceState> getDeviceRunStates() {
        return this.deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceHealthScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionScriptContent", (n) -> { this.setDetectionScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("detectionScriptParameters", (n) -> { this.setDetectionScriptParameters(n.getCollectionOfObjectValues(DeviceHealthScriptParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthScriptType", (n) -> { this.setDeviceHealthScriptType(n.getEnumValue(DeviceHealthScriptType.class)); });
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceHealthScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("highestAvailableVersion", (n) -> { this.setHighestAvailableVersion(n.getStringValue()); });
        deserializerMap.put("isGlobalScript", (n) -> { this.setIsGlobalScript(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("remediationScriptContent", (n) -> { this.setRemediationScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("remediationScriptParameters", (n) -> { this.setRemediationScriptParameters(n.getCollectionOfObjectValues(DeviceHealthScriptParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("runSummary", (n) -> { this.setRunSummary(n.getObjectValue(DeviceHealthScriptRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the highestAvailableVersion property value. Highest available version for a Microsoft Proprietary script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHighestAvailableVersion() {
        return this.highestAvailableVersion;
    }
    /**
     * Gets the isGlobalScript property value. Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsGlobalScript() {
        return this.isGlobalScript;
    }
    /**
     * Gets the lastModifiedDateTime property value. The timestamp of when the device health script was modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the publisher property value. Name of the device health script publisher
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the remediationScriptContent property value. The entire content of the remediation powershell script
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getRemediationScriptContent() {
        return this.remediationScriptContent;
    }
    /**
     * Gets the remediationScriptParameters property value. List of ComplexType RemediationScriptParameters objects.
     * @return a deviceHealthScriptParameter
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptParameter> getRemediationScriptParameters() {
        return this.remediationScriptParameters;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
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
     * Gets the runSummary property value. High level run summary for device health script.
     * @return a deviceHealthScriptRunSummary
     */
    @jakarta.annotation.Nullable
    public DeviceHealthScriptRunSummary getRunSummary() {
        return this.runSummary;
    }
    /**
     * Gets the version property value. Version of the device health script
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeByteArrayValue("detectionScriptContent", this.getDetectionScriptContent());
        writer.writeCollectionOfObjectValues("detectionScriptParameters", this.getDetectionScriptParameters());
        writer.writeEnumValue("deviceHealthScriptType", this.getDeviceHealthScriptType());
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeStringValue("highestAvailableVersion", this.getHighestAvailableVersion());
        writer.writeBooleanValue("isGlobalScript", this.getIsGlobalScript());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeByteArrayValue("remediationScriptContent", this.getRemediationScriptContent());
        writer.writeCollectionOfObjectValues("remediationScriptParameters", this.getRemediationScriptParameters());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeObjectValue("runSummary", this.getRunSummary());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device health script
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The timestamp of when the device health script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the device health script
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the detectionScriptContent property value. The entire content of the detection powershell script
     * @param value Value to set for the detectionScriptContent property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetectionScriptContent(@jakarta.annotation.Nullable final byte[] value) {
        this.detectionScriptContent = value;
    }
    /**
     * Sets the detectionScriptParameters property value. List of ComplexType DetectionScriptParameters objects.
     * @param value Value to set for the detectionScriptParameters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetectionScriptParameters(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptParameter> value) {
        this.detectionScriptParameters = value;
    }
    /**
     * Sets the deviceHealthScriptType property value. Indicates the type of device script.
     * @param value Value to set for the deviceHealthScriptType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceHealthScriptType(@jakarta.annotation.Nullable final DeviceHealthScriptType value) {
        this.deviceHealthScriptType = value;
    }
    /**
     * Sets the deviceRunStates property value. List of run states for the device health script across all devices
     * @param value Value to set for the deviceRunStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptDeviceState> value) {
        this.deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device health script
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.enforceSignatureCheck = value;
    }
    /**
     * Sets the highestAvailableVersion property value. Highest available version for a Microsoft Proprietary script
     * @param value Value to set for the highestAvailableVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHighestAvailableVersion(@jakarta.annotation.Nullable final String value) {
        this.highestAvailableVersion = value;
    }
    /**
     * Sets the isGlobalScript property value. Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     * @param value Value to set for the isGlobalScript property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsGlobalScript(@jakarta.annotation.Nullable final Boolean value) {
        this.isGlobalScript = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The timestamp of when the device health script was modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the publisher property value. Name of the device health script publisher
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the remediationScriptContent property value. The entire content of the remediation powershell script
     * @param value Value to set for the remediationScriptContent property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRemediationScriptContent(@jakarta.annotation.Nullable final byte[] value) {
        this.remediationScriptContent = value;
    }
    /**
     * Sets the remediationScriptParameters property value. List of ComplexType RemediationScriptParameters objects.
     * @param value Value to set for the remediationScriptParameters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRemediationScriptParameters(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptParameter> value) {
        this.remediationScriptParameters = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for the device health script
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
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
     * Sets the runSummary property value. High level run summary for device health script.
     * @param value Value to set for the runSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRunSummary(@jakarta.annotation.Nullable final DeviceHealthScriptRunSummary value) {
        this.runSummary = value;
    }
    /**
     * Sets the version property value. Version of the device health script
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
