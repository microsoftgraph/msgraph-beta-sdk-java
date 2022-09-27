package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for device run state of the device compliance script. */
public class DeviceComplianceScriptDeviceState extends Entity implements Parsable {
    /** Indicates the type of execution status of the device management script. */
    private RunState _detectionState;
    /** The next timestamp of when the device compliance script is expected to execute */
    private OffsetDateTime _expectedStateUpdateDateTime;
    /** The last timestamp of when the device compliance script executed */
    private OffsetDateTime _lastStateUpdateDateTime;
    /** The last time that Intune Managment Extension synced with Intune */
    private OffsetDateTime _lastSyncDateTime;
    /** The managed device on which the device compliance script executed */
    private ManagedDevice _managedDevice;
    /** Error from the detection script */
    private String _scriptError;
    /** Output of the detection script */
    private String _scriptOutput;
    /**
     * Instantiates a new deviceComplianceScriptDeviceState and sets the default values.
     * @return a void
     */
    public DeviceComplianceScriptDeviceState() {
        super();
        this.setOdataType("#microsoft.graph.deviceComplianceScriptDeviceState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptDeviceState
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptDeviceState();
    }
    /**
     * Gets the detectionState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getDetectionState() {
        return this._detectionState;
    }
    /**
     * Gets the expectedStateUpdateDateTime property value. The next timestamp of when the device compliance script is expected to execute
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpectedStateUpdateDateTime() {
        return this._expectedStateUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceScriptDeviceState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("detectionState", (n) -> { currentObject.setDetectionState(n.getEnumValue(RunState.class)); });
            this.put("expectedStateUpdateDateTime", (n) -> { currentObject.setExpectedStateUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastStateUpdateDateTime", (n) -> { currentObject.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDevice", (n) -> { currentObject.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("scriptError", (n) -> { currentObject.setScriptError(n.getStringValue()); });
            this.put("scriptOutput", (n) -> { currentObject.setScriptOutput(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the device compliance script executed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this._lastStateUpdateDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the managedDevice property value. The managed device on which the device compliance script executed
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this._managedDevice;
    }
    /**
     * Gets the scriptError property value. Error from the detection script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScriptError() {
        return this._scriptError;
    }
    /**
     * Gets the scriptOutput property value. Output of the detection script
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScriptOutput() {
        return this._scriptOutput;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setDetectionState(@javax.annotation.Nullable final RunState value) {
        this._detectionState = value;
    }
    /**
     * Sets the expectedStateUpdateDateTime property value. The next timestamp of when the device compliance script is expected to execute
     * @param value Value to set for the expectedStateUpdateDateTime property.
     * @return a void
     */
    public void setExpectedStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expectedStateUpdateDateTime = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the device compliance script executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     * @return a void
     */
    public void setLastStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastStateUpdateDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time that Intune Managment Extension synced with Intune
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the managedDevice property value. The managed device on which the device compliance script executed
     * @param value Value to set for the managedDevice property.
     * @return a void
     */
    public void setManagedDevice(@javax.annotation.Nullable final ManagedDevice value) {
        this._managedDevice = value;
    }
    /**
     * Sets the scriptError property value. Error from the detection script
     * @param value Value to set for the scriptError property.
     * @return a void
     */
    public void setScriptError(@javax.annotation.Nullable final String value) {
        this._scriptError = value;
    }
    /**
     * Sets the scriptOutput property value. Output of the detection script
     * @param value Value to set for the scriptOutput property.
     * @return a void
     */
    public void setScriptOutput(@javax.annotation.Nullable final String value) {
        this._scriptOutput = value;
    }
}
