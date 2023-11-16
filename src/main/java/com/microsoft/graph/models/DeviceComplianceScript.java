package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Intune will provide customer the ability to run their Powershell Compliance scripts (detection) on the enrolled windows 10 Azure Active Directory joined devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScript extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceComplianceScript and sets the default values.
     */
    public DeviceComplianceScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScript();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device compliance script
     * @return a java.util.List<DeviceHealthScriptAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptAssignment> getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The timestamp of when the device compliance script was created. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description of the device compliance script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the detectionScriptContent property value. The entire content of the detection powershell script
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getDetectionScriptContent() {
        return this.BackingStore.get("detectionScriptContent");
    }
    /**
     * Gets the deviceRunStates property value. List of run states for the device compliance script across all devices
     * @return a java.util.List<DeviceComplianceScriptDeviceState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptDeviceState> getDeviceRunStates() {
        return this.BackingStore.get("deviceRunStates");
    }
    /**
     * Gets the displayName property value. Name of the device compliance script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceHealthScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionScriptContent", (n) -> { this.setDetectionScriptContent(n.getByteArrayValue()); });
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(DeviceComplianceScriptDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("runSummary", (n) -> { this.setRunSummary(n.getObjectValue(DeviceComplianceScriptRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The timestamp of when the device compliance script was modified. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the publisher property value. Name of the device compliance script publisher
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.BackingStore.get("publisher");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for the device compliance script
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
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
     * Gets the runSummary property value. High level run summary for device compliance script.
     * @return a DeviceComplianceScriptRunSummary
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceScriptRunSummary getRunSummary() {
        return this.BackingStore.get("runSummary");
    }
    /**
     * Gets the version property value. Version of the device compliance script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.BackingStore.get("version");
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptAssignment> value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The timestamp of when the device compliance script was created. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description of the device compliance script
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the detectionScriptContent property value. The entire content of the detection powershell script
     * @param value Value to set for the detectionScriptContent property.
     */
    public void setDetectionScriptContent(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("detectionScriptContent", value);
    }
    /**
     * Sets the deviceRunStates property value. List of run states for the device compliance script across all devices
     * @param value Value to set for the deviceRunStates property.
     */
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptDeviceState> value) {
        this.BackingStore.set("deviceRunStates", value);
    }
    /**
     * Sets the displayName property value. Name of the device compliance script
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicate whether the script signature needs be checked
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The timestamp of when the device compliance script was modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the publisher property value. Name of the device compliance script publisher
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("publisher", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for the device compliance script
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the runAs32Bit property value. Indicate whether PowerShell script(s) should run as 32-bit
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
     * Sets the runSummary property value. High level run summary for device compliance script.
     * @param value Value to set for the runSummary property.
     */
    public void setRunSummary(@jakarta.annotation.Nullable final DeviceComplianceScriptRunSummary value) {
        this.BackingStore.set("runSummary", value);
    }
    /**
     * Sets the version property value. Version of the device compliance script
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("version", value);
    }
}
