package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for device run state of the device management script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementScriptDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementScriptDeviceState and sets the default values.
     */
    public DeviceManagementScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementScriptDeviceState
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScriptDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptDeviceState();
    }
    /**
     * Gets the errorCode property value. Error code corresponding to erroneous execution of the device management script.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorDescription() {
        return this.backingStore.get("errorDescription");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("errorDescription", (n) -> { this.setErrorDescription(n.getStringValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDevice", (n) -> { this.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("resultMessage", (n) -> { this.setResultMessage(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.backingStore.get("lastStateUpdateDateTime");
    }
    /**
     * Gets the managedDevice property value. The managed devices that executes the device management script.
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this.backingStore.get("managedDevice");
    }
    /**
     * Gets the resultMessage property value. Details of execution output.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResultMessage() {
        return this.backingStore.get("resultMessage");
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a RunState
     */
    @jakarta.annotation.Nullable
    public RunState getRunState() {
        return this.backingStore.get("runState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorDescription", this.getErrorDescription());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeObjectValue("managedDevice", this.getManagedDevice());
        writer.writeStringValue("resultMessage", this.getResultMessage());
        writer.writeEnumValue("runState", this.getRunState());
    }
    /**
     * Sets the errorCode property value. Error code corresponding to erroneous execution of the device management script.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @param value Value to set for the errorDescription property.
     */
    public void setErrorDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorDescription", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStateUpdateDateTime", value);
    }
    /**
     * Sets the managedDevice property value. The managed devices that executes the device management script.
     * @param value Value to set for the managedDevice property.
     */
    public void setManagedDevice(@jakarta.annotation.Nullable final ManagedDevice value) {
        this.backingStore.set("managedDevice", value);
    }
    /**
     * Sets the resultMessage property value. Details of execution output.
     * @param value Value to set for the resultMessage property.
     */
    public void setResultMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resultMessage", value);
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     */
    public void setRunState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("runState", value);
    }
}
