package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for device run state of the device health script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthScriptDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceHealthScriptDeviceState and sets the default values.
     */
    public DeviceHealthScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptDeviceState
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptDeviceState();
    }
    /**
     * Gets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this.backingStore.get("assignmentFilterIds");
    }
    /**
     * Gets the detectionState property value. Indicates the type of execution status of the device management script.
     * @return a RunState
     */
    @jakarta.annotation.Nullable
    public RunState getDetectionState() {
        return this.backingStore.get("detectionState");
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this.backingStore.get("expectedStateUpdateDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionState", (n) -> { this.setDetectionState(n.getEnumValue(RunState::forValue)); });
        deserializerMap.put("expectedStateUpdateDateTime", (n) -> { this.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDevice", (n) -> { this.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("postRemediationDetectionScriptError", (n) -> { this.setPostRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("postRemediationDetectionScriptOutput", (n) -> { this.setPostRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptError", (n) -> { this.setPreRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptOutput", (n) -> { this.setPreRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("remediationScriptError", (n) -> { this.setRemediationScriptError(n.getStringValue()); });
        deserializerMap.put("remediationState", (n) -> { this.setRemediationState(n.getEnumValue(RemediationState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.backingStore.get("lastStateUpdateDateTime");
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the managedDevice property value. The managed device on which the device health script executed
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this.backingStore.get("managedDevice");
    }
    /**
     * Gets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptError() {
        return this.backingStore.get("postRemediationDetectionScriptError");
    }
    /**
     * Gets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostRemediationDetectionScriptOutput() {
        return this.backingStore.get("postRemediationDetectionScriptOutput");
    }
    /**
     * Gets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptError() {
        return this.backingStore.get("preRemediationDetectionScriptError");
    }
    /**
     * Gets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreRemediationDetectionScriptOutput() {
        return this.backingStore.get("preRemediationDetectionScriptOutput");
    }
    /**
     * Gets the remediationScriptError property value. Error output of the remediation script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediationScriptError() {
        return this.backingStore.get("remediationScriptError");
    }
    /**
     * Gets the remediationState property value. Indicates the type of execution status of the device management script.
     * @return a RemediationState
     */
    @jakarta.annotation.Nullable
    public RemediationState getRemediationState() {
        return this.backingStore.get("remediationState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeEnumValue("detectionState", this.getDetectionState());
        writer.writeOffsetDateTimeValue("expectedStateUpdateDateTime", this.getExpectedStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeObjectValue("managedDevice", this.getManagedDevice());
        writer.writeStringValue("postRemediationDetectionScriptError", this.getPostRemediationDetectionScriptError());
        writer.writeStringValue("postRemediationDetectionScriptOutput", this.getPostRemediationDetectionScriptOutput());
        writer.writeStringValue("preRemediationDetectionScriptError", this.getPreRemediationDetectionScriptError());
        writer.writeStringValue("preRemediationDetectionScriptOutput", this.getPreRemediationDetectionScriptOutput());
        writer.writeStringValue("remediationScriptError", this.getRemediationScriptError());
        writer.writeEnumValue("remediationState", this.getRemediationState());
    }
    /**
     * Sets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @param value Value to set for the assignmentFilterIds property.
     */
    public void setAssignmentFilterIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("assignmentFilterIds", value);
    }
    /**
     * Sets the detectionState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the detectionState property.
     */
    public void setDetectionState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("detectionState", value);
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     */
    public void setExpectedStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expectedStateUpdateDateTime", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStateUpdateDateTime", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the managedDevice property value. The managed device on which the device health script executed
     * @param value Value to set for the managedDevice property.
     */
    public void setManagedDevice(@jakarta.annotation.Nullable final ManagedDevice value) {
        this.backingStore.set("managedDevice", value);
    }
    /**
     * Sets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @param value Value to set for the postRemediationDetectionScriptError property.
     */
    public void setPostRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postRemediationDetectionScriptError", value);
    }
    /**
     * Sets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @param value Value to set for the postRemediationDetectionScriptOutput property.
     */
    public void setPostRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postRemediationDetectionScriptOutput", value);
    }
    /**
     * Sets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptError property.
     */
    public void setPreRemediationDetectionScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preRemediationDetectionScriptError", value);
    }
    /**
     * Sets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptOutput property.
     */
    public void setPreRemediationDetectionScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preRemediationDetectionScriptOutput", value);
    }
    /**
     * Sets the remediationScriptError property value. Error output of the remediation script
     * @param value Value to set for the remediationScriptError property.
     */
    public void setRemediationScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationScriptError", value);
    }
    /**
     * Sets the remediationState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the remediationState property.
     */
    public void setRemediationState(@jakarta.annotation.Nullable final RemediationState value) {
        this.backingStore.set("remediationState", value);
    }
}
