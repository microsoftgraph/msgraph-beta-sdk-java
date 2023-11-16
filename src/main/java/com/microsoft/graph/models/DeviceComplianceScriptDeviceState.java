package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for device run state of the device compliance script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScriptDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceComplianceScriptDeviceState and sets the default values.
     */
    public DeviceComplianceScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceScriptDeviceState
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptDeviceState();
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
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device compliance script is expected to execute
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
        deserializerMap.put("detectionState", (n) -> { this.setDetectionState(n.getEnumValue(RunState.class)); });
        deserializerMap.put("expectedStateUpdateDateTime", (n) -> { this.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDevice", (n) -> { this.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("scriptError", (n) -> { this.setScriptError(n.getStringValue()); });
        deserializerMap.put("scriptOutput", (n) -> { this.setScriptOutput(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device compliance script executed
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
     * Gets the managedDevice property value. The managed device on which the device compliance script executed
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this.backingStore.get("managedDevice");
    }
    /**
     * Gets the scriptError property value. Error from the detection script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptError() {
        return this.backingStore.get("scriptError");
    }
    /**
     * Gets the scriptOutput property value. Output of the detection script
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptOutput() {
        return this.backingStore.get("scriptOutput");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("detectionState", this.getDetectionState());
        writer.writeOffsetDateTimeValue("expectedStateUpdateDateTime", this.getExpectedStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeObjectValue("managedDevice", this.getManagedDevice());
        writer.writeStringValue("scriptError", this.getScriptError());
        writer.writeStringValue("scriptOutput", this.getScriptOutput());
    }
    /**
     * Sets the detectionState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the detectionState property.
     */
    public void setDetectionState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("detectionState", value);
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device compliance script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     */
    public void setExpectedStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expectedStateUpdateDateTime", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device compliance script executed
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
     * Sets the managedDevice property value. The managed device on which the device compliance script executed
     * @param value Value to set for the managedDevice property.
     */
    public void setManagedDevice(@jakarta.annotation.Nullable final ManagedDevice value) {
        this.backingStore.set("managedDevice", value);
    }
    /**
     * Sets the scriptError property value. Error from the detection script
     * @param value Value to set for the scriptError property.
     */
    public void setScriptError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scriptError", value);
    }
    /**
     * Sets the scriptOutput property value. Output of the detection script
     * @param value Value to set for the scriptOutput property.
     */
    public void setScriptOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scriptOutput", value);
    }
}
