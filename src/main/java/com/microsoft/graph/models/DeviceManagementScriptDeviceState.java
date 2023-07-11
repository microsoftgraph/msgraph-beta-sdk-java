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
public class DeviceManagementScriptDeviceState extends Entity implements Parsable {
    /**
     * Error code corresponding to erroneous execution of the device management script.
     */
    private Integer errorCode;
    /**
     * Error description corresponding to erroneous execution of the device management script.
     */
    private String errorDescription;
    /**
     * Latest time the device management script executes.
     */
    private OffsetDateTime lastStateUpdateDateTime;
    /**
     * The managed devices that executes the device management script.
     */
    private ManagedDevice managedDevice;
    /**
     * Details of execution output.
     */
    private String resultMessage;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState runState;
    /**
     * Instantiates a new deviceManagementScriptDeviceState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementScriptDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScriptDeviceState
     */
    @javax.annotation.Nonnull
    public static DeviceManagementScriptDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptDeviceState();
    }
    /**
     * Gets the errorCode property value. Error code corresponding to erroneous execution of the device management script.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this.errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("errorDescription", (n) -> { this.setErrorDescription(n.getStringValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDevice", (n) -> { this.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("resultMessage", (n) -> { this.setResultMessage(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.lastStateUpdateDateTime;
    }
    /**
     * Gets the managedDevice property value. The managed devices that executes the device management script.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this.managedDevice;
    }
    /**
     * Gets the resultMessage property value. Details of execution output.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultMessage() {
        return this.resultMessage;
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getRunState() {
        return this.runState;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this.errorDescription = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @param value Value to set for the lastStateUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastStateUpdateDateTime = value;
    }
    /**
     * Sets the managedDevice property value. The managed devices that executes the device management script.
     * @param value Value to set for the managedDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevice(@javax.annotation.Nullable final ManagedDevice value) {
        this.managedDevice = value;
    }
    /**
     * Sets the resultMessage property value. Details of execution output.
     * @param value Value to set for the resultMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultMessage(@javax.annotation.Nullable final String value) {
        this.resultMessage = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunState(@javax.annotation.Nullable final RunState value) {
        this.runState = value;
    }
}
