package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Intune will provide customer the ability to run their Powershell Health scripts (remediation + detection) on the enrolled windows 10 Azure Active Directory joined devices. */
public class DeviceHealthScript extends Entity implements Parsable {
    /** The list of group assignments for the device health script */
    private java.util.List<DeviceHealthScriptAssignment> _assignments;
    /** The timestamp of when the device health script was created. This property is read-only. */
    private OffsetDateTime _createdDateTime;
    /** Description of the device health script */
    private String _description;
    /** The entire content of the detection powershell script */
    private byte[] _detectionScriptContent;
    /** List of ComplexType DetectionScriptParameters objects. */
    private java.util.List<DeviceHealthScriptParameter> _detectionScriptParameters;
    /** List of run states for the device health script across all devices */
    private java.util.List<DeviceHealthScriptDeviceState> _deviceRunStates;
    /** Name of the device health script */
    private String _displayName;
    /** Indicate whether the script signature needs be checked */
    private Boolean _enforceSignatureCheck;
    /** Highest available version for a Microsoft Proprietary script */
    private String _highestAvailableVersion;
    /** Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only */
    private Boolean _isGlobalScript;
    /** The timestamp of when the device health script was modified. This property is read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Name of the device health script publisher */
    private String _publisher;
    /** The entire content of the remediation powershell script */
    private byte[] _remediationScriptContent;
    /** List of ComplexType RemediationScriptParameters objects. */
    private java.util.List<DeviceHealthScriptParameter> _remediationScriptParameters;
    /** List of Scope Tag IDs for the device health script */
    private java.util.List<String> _roleScopeTagIds;
    /** Indicate whether PowerShell script(s) should run as 32-bit */
    private Boolean _runAs32Bit;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /** High level run summary for device health script. */
    private DeviceHealthScriptRunSummary _runSummary;
    /** Version of the device health script */
    private String _version;
    /**
     * Instantiates a new deviceHealthScript and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScript
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScript createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device health script
     * @return a deviceHealthScriptAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The timestamp of when the device health script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the device health script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the detectionScriptContent property value. The entire content of the detection powershell script
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getDetectionScriptContent() {
        return this._detectionScriptContent;
    }
    /**
     * Gets the detectionScriptParameters property value. List of ComplexType DetectionScriptParameters objects.
     * @return a deviceHealthScriptParameter
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptParameter> getDetectionScriptParameters() {
        return this._detectionScriptParameters;
    }
    /**
     * Gets the deviceRunStates property value. List of run states for the device health script across all devices
     * @return a deviceHealthScriptDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptDeviceState> getDeviceRunStates() {
        return this._deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device health script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this._enforceSignatureCheck;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceHealthScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionScriptContent", (n) -> { this.setDetectionScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("detectionScriptParameters", (n) -> { this.setDetectionScriptParameters(n.getCollectionOfObjectValues(DeviceHealthScriptParameter::createFromDiscriminatorValue)); });
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
    @javax.annotation.Nullable
    public String getHighestAvailableVersion() {
        return this._highestAvailableVersion;
    }
    /**
     * Gets the isGlobalScript property value. Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsGlobalScript() {
        return this._isGlobalScript;
    }
    /**
     * Gets the lastModifiedDateTime property value. The timestamp of when the device health script was modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the publisher property value. Name of the device health script publisher
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the remediationScriptContent property value. The entire content of the remediation powershell script
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getRemediationScriptContent() {
        return this._remediationScriptContent;
    }
    /**
     * Gets the remediationScriptParameters property value. List of ComplexType RemediationScriptParameters objects.
     * @return a deviceHealthScriptParameter
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptParameter> getRemediationScriptParameters() {
        return this._remediationScriptParameters;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for the device health script
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this._runAs32Bit;
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
     * Gets the runSummary property value. High level run summary for device health script.
     * @return a deviceHealthScriptRunSummary
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptRunSummary getRunSummary() {
        return this._runSummary;
    }
    /**
     * Gets the version property value. Version of the device health script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("description", this.getDescription());
        writer.writeByteArrayValue("detectionScriptContent", this.getDetectionScriptContent());
        writer.writeCollectionOfObjectValues("detectionScriptParameters", this.getDetectionScriptParameters());
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
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The timestamp of when the device health script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the device health script
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the detectionScriptContent property value. The entire content of the detection powershell script
     * @param value Value to set for the detectionScriptContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionScriptContent(@javax.annotation.Nullable final byte[] value) {
        this._detectionScriptContent = value;
    }
    /**
     * Sets the detectionScriptParameters property value. List of ComplexType DetectionScriptParameters objects.
     * @param value Value to set for the detectionScriptParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionScriptParameters(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptParameter> value) {
        this._detectionScriptParameters = value;
    }
    /**
     * Sets the deviceRunStates property value. List of run states for the device health script across all devices
     * @param value Value to set for the deviceRunStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRunStates(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptDeviceState> value) {
        this._deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device health script
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforceSignatureCheck(@javax.annotation.Nullable final Boolean value) {
        this._enforceSignatureCheck = value;
    }
    /**
     * Sets the highestAvailableVersion property value. Highest available version for a Microsoft Proprietary script
     * @param value Value to set for the highestAvailableVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHighestAvailableVersion(@javax.annotation.Nullable final String value) {
        this._highestAvailableVersion = value;
    }
    /**
     * Sets the isGlobalScript property value. Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only
     * @param value Value to set for the isGlobalScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsGlobalScript(@javax.annotation.Nullable final Boolean value) {
        this._isGlobalScript = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The timestamp of when the device health script was modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the publisher property value. Name of the device health script publisher
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the remediationScriptContent property value. The entire content of the remediation powershell script
     * @param value Value to set for the remediationScriptContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationScriptContent(@javax.annotation.Nullable final byte[] value) {
        this._remediationScriptContent = value;
    }
    /**
     * Sets the remediationScriptParameters property value. List of ComplexType RemediationScriptParameters objects.
     * @param value Value to set for the remediationScriptParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationScriptParameters(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptParameter> value) {
        this._remediationScriptParameters = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for the device health script
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunAs32Bit(@javax.annotation.Nullable final Boolean value) {
        this._runAs32Bit = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
    /**
     * Sets the runSummary property value. High level run summary for device health script.
     * @param value Value to set for the runSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunSummary(@javax.annotation.Nullable final DeviceHealthScriptRunSummary value) {
        this._runSummary = value;
    }
    /**
     * Sets the version property value. Version of the device health script
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
