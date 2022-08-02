package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for device run state of the device management script. */
public class DeviceManagementScriptDeviceState extends Entity implements Parsable {
    /** Error code corresponding to erroneous execution of the device management script. */
    private Integer _errorCode;
    /** Error description corresponding to erroneous execution of the device management script. */
    private String _errorDescription;
    /** Latest time the device management script executes. */
    private OffsetDateTime _lastStateUpdateDateTime;
    /** The managed devices that executes the device management script. */
    private ManagedDevice _managedDevice;
    /** Details of execution output. */
    private String _resultMessage;
    /** Indicates the type of execution status of the device management script. */
    private RunState _runState;
    /**
     * Instantiates a new deviceManagementScriptDeviceState and sets the default values.
     * @return a void
     */
    public DeviceManagementScriptDeviceState() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementScriptDeviceState");
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
        return this._errorCode;
    }
    /**
     * Gets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this._errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementScriptDeviceState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("errorDescription", (n) -> { currentObject.setErrorDescription(n.getStringValue()); });
            this.put("lastStateUpdateDateTime", (n) -> { currentObject.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDevice", (n) -> { currentObject.setManagedDevice(n.getObjectValue(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("resultMessage", (n) -> { currentObject.setResultMessage(n.getStringValue()); });
            this.put("runState", (n) -> { currentObject.setRunState(n.getEnumValue(RunState.class)); });
        }};
    }
    /**
     * Gets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this._lastStateUpdateDateTime;
    }
    /**
     * Gets the managedDevice property value. The managed devices that executes the device management script.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public ManagedDevice getManagedDevice() {
        return this._managedDevice;
    }
    /**
     * Gets the resultMessage property value. Details of execution output.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultMessage() {
        return this._resultMessage;
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getRunState() {
        return this._runState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the errorDescription property value. Error description corresponding to erroneous execution of the device management script.
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this._errorDescription = value;
    }
    /**
     * Sets the lastStateUpdateDateTime property value. Latest time the device management script executes.
     * @param value Value to set for the lastStateUpdateDateTime property.
     * @return a void
     */
    public void setLastStateUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastStateUpdateDateTime = value;
    }
    /**
     * Sets the managedDevice property value. The managed devices that executes the device management script.
     * @param value Value to set for the managedDevice property.
     * @return a void
     */
    public void setManagedDevice(@javax.annotation.Nullable final ManagedDevice value) {
        this._managedDevice = value;
    }
    /**
     * Sets the resultMessage property value. Details of execution output.
     * @param value Value to set for the resultMessage property.
     * @return a void
     */
    public void setResultMessage(@javax.annotation.Nullable final String value) {
        this._resultMessage = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     * @return a void
     */
    public void setRunState(@javax.annotation.Nullable final RunState value) {
        this._runState = value;
    }
}
