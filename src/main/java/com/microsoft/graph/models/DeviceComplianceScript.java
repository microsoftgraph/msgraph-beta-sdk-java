package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Intune will provide customer the ability to run their Powershell Compliance scripts (detection) on the enrolled windows 10 Azure Active Directory joined devices. */
public class DeviceComplianceScript extends Entity implements Parsable {
    /** The list of group assignments for the device compliance script */
    private java.util.List<DeviceHealthScriptAssignment> _assignments;
    /** The timestamp of when the device compliance script was created. This property is read-only. */
    private OffsetDateTime _createdDateTime;
    /** Description of the device compliance script */
    private String _description;
    /** The entire content of the detection powershell script */
    private byte[] _detectionScriptContent;
    /** List of run states for the device compliance script across all devices */
    private java.util.List<DeviceComplianceScriptDeviceState> _deviceRunStates;
    /** Name of the device compliance script */
    private String _displayName;
    /** Indicate whether the script signature needs be checked */
    private Boolean _enforceSignatureCheck;
    /** The timestamp of when the device compliance script was modified. This property is read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Name of the device compliance script publisher */
    private String _publisher;
    /** List of Scope Tag IDs for the device compliance script */
    private java.util.List<String> _roleScopeTagIds;
    /** Indicate whether PowerShell script(s) should run as 32-bit */
    private Boolean _runAs32Bit;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /** High level run summary for device compliance script. */
    private DeviceComplianceScriptRunSummary _runSummary;
    /** Version of the device compliance script */
    private String _version;
    /**
     * Instantiates a new deviceComplianceScript and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScript() {
        super();
        this.setOdataType("#microsoft.graph.deviceComplianceScript");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScript
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScript createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device compliance script
     * @return a deviceHealthScriptAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The timestamp of when the device compliance script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the device compliance script
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
     * Gets the deviceRunStates property value. List of run states for the device compliance script across all devices
     * @return a deviceComplianceScriptDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScriptDeviceState> getDeviceRunStates() {
        return this._deviceRunStates;
    }
    /**
     * Gets the displayName property value. Name of the device compliance script
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
        final DeviceComplianceScript currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceHealthScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionScriptContent", (n) -> { currentObject.setDetectionScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("deviceRunStates", (n) -> { currentObject.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceComplianceScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { currentObject.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runAs32Bit", (n) -> { currentObject.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { currentObject.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("runSummary", (n) -> { currentObject.setRunSummary(n.getObjectValue(DeviceComplianceScriptRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the lastModifiedDateTime property value. The timestamp of when the device compliance script was modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the publisher property value. Name of the device compliance script publisher
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for the device compliance script
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
     * Gets the runSummary property value. High level run summary for device compliance script.
     * @return a deviceComplianceScriptRunSummary
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRunSummary getRunSummary() {
        return this._runSummary;
    }
    /**
     * Gets the version property value. Version of the device compliance script
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
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeObjectValue("runSummary", this.getRunSummary());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device compliance script
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The timestamp of when the device compliance script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the device compliance script
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
     * Sets the deviceRunStates property value. List of run states for the device compliance script across all devices
     * @param value Value to set for the deviceRunStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRunStates(@javax.annotation.Nullable final java.util.List<DeviceComplianceScriptDeviceState> value) {
        this._deviceRunStates = value;
    }
    /**
     * Sets the displayName property value. Name of the device compliance script
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
     * Sets the lastModifiedDateTime property value. The timestamp of when the device compliance script was modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the publisher property value. Name of the device compliance script publisher
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for the device compliance script
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
     * Sets the runSummary property value. High level run summary for device compliance script.
     * @param value Value to set for the runSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunSummary(@javax.annotation.Nullable final DeviceComplianceScriptRunSummary value) {
        this._runSummary = value;
    }
    /**
     * Sets the version property value. Version of the device compliance script
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
