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
public class DeviceHealthScriptDeviceState extends Entity implements Parsable {
    /**
     * A list of the assignment filter ids used for health script applicability evaluation
     */
    private java.util.List<String> assignmentFilterIds;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState detectionState;
    /**
     * The next timestamp of when the device health script is expected to execute
     */
    private OffsetDateTime expectedStateUpdateDateTime;
    /**
     * The last timestamp of when the device health script executed
     */
    private OffsetDateTime lastStateUpdateDateTime;
    /**
     * The last time that Intune Managment Extension synced with Intune
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * The managed device on which the device health script executed
     */
    private ManagedDevice managedDevice;
    /**
     * Error from the detection script after remediation
     */
    private String postRemediationDetectionScriptError;
    /**
     * Detection script output after remediation
     */
    private String postRemediationDetectionScriptOutput;
    /**
     * Error from the detection script before remediation
     */
    private String preRemediationDetectionScriptError;
    /**
     * Output of the detection script before remediation
     */
    private String preRemediationDetectionScriptOutput;
    /**
     * Error output of the remediation script
     */
    private String remediationScriptError;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RemediationState remediationState;
    /**
     * Instantiates a new deviceHealthScriptDeviceState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptDeviceState
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptDeviceState();
    }
    /**
     * Gets the assignmentFilterIds property value. A list of the assignment filter ids used for health script applicability evaluation
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this.assignmentFilterIds;
    }
    /**
     * Gets the detectionState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getDetectionState() {
        return this.detectionState;
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this.expectedStateUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("detectionState", (n) -> { this.setDetectionState(n.getEnumValue(RunState.class)); });
        deserializerMap.put("expectedStateUpdateDateTime", (n) -> { this.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDevice", (n) -> { this.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("postRemediationDetectionScriptError", (n) -> { this.setPostRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("postRemediationDetectionScriptOutput", (n) -> { this.setPostRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptError", (n) -> { this.setPreRemediationDetectionScriptError(n.getStringValue()); });
        deserializerMap.put("preRemediationDetectionScriptOutput", (n) -> { this.setPreRemediationDetectionScriptOutput(n.getStringValue()); });
        deserializerMap.put("remediationScriptError", (n) -> { this.setRemediationScriptError(n.getStringValue()); });
        deserializerMap.put("remediationState", (n) -> { this.setRemediationState(n.getEnumValue(RemediationState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.lastStateUpdateDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the managedDevice property value. The managed device on which the device health script executed
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this.managedDevice;
    }
    /**
     * Gets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostRemediationDetectionScriptError() {
        return this.postRemediationDetectionScriptError;
    }
    /**
     * Gets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostRemediationDetectionScriptOutput() {
        return this.postRemediationDetectionScriptOutput;
    }
    /**
     * Gets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreRemediationDetectionScriptError() {
        return this.preRemediationDetectionScriptError;
    }
    /**
     * Gets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreRemediationDetectionScriptOutput() {
        return this.preRemediationDetectionScriptOutput;
    }
    /**
     * Gets the remediationScriptError property value. Error output of the remediation script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationScriptError() {
        return this.remediationScriptError;
    }
    /**
     * Gets the remediationState property value. Indicates the type of execution status of the device management script.
     * @return a remediationState
     */
    @javax.annotation.Nullable
    public RemediationState getRemediationState() {
        return this.remediationState;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.assignmentFilterIds = value;
    }
    /**
     * Sets the detectionState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the detectionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionState(@javax.annotation.Nullable final RunState value) {
        this.detectionState = value;
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device health script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpectedStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expectedStateUpdateDateTime = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device health script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastStateUpdateDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the managedDevice property value. The managed device on which the device health script executed
     * @param value Value to set for the managedDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevice(@javax.annotation.Nullable final ManagedDevice value) {
        this.managedDevice = value;
    }
    /**
     * Sets the postRemediationDetectionScriptError property value. Error from the detection script after remediation
     * @param value Value to set for the postRemediationDetectionScriptError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostRemediationDetectionScriptError(@javax.annotation.Nullable final String value) {
        this.postRemediationDetectionScriptError = value;
    }
    /**
     * Sets the postRemediationDetectionScriptOutput property value. Detection script output after remediation
     * @param value Value to set for the postRemediationDetectionScriptOutput property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostRemediationDetectionScriptOutput(@javax.annotation.Nullable final String value) {
        this.postRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the preRemediationDetectionScriptError property value. Error from the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreRemediationDetectionScriptError(@javax.annotation.Nullable final String value) {
        this.preRemediationDetectionScriptError = value;
    }
    /**
     * Sets the preRemediationDetectionScriptOutput property value. Output of the detection script before remediation
     * @param value Value to set for the preRemediationDetectionScriptOutput property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreRemediationDetectionScriptOutput(@javax.annotation.Nullable final String value) {
        this.preRemediationDetectionScriptOutput = value;
    }
    /**
     * Sets the remediationScriptError property value. Error output of the remediation script
     * @param value Value to set for the remediationScriptError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationScriptError(@javax.annotation.Nullable final String value) {
        this.remediationScriptError = value;
    }
    /**
     * Sets the remediationState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the remediationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationState(@javax.annotation.Nullable final RemediationState value) {
        this.remediationState = value;
    }
}
