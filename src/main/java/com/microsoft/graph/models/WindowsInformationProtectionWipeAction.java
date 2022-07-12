package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents wipe requests issued by tenant admin for Bring-Your-Own-Device(BYOD) Windows devices. */
public class WindowsInformationProtectionWipeAction extends Entity implements Parsable {
    /** Last checkin time of the device that was targeted by this wipe action. */
    private OffsetDateTime _lastCheckInDateTime;
    /** The status property */
    private ActionState _status;
    /** Targeted device Mac address. */
    private String _targetedDeviceMacAddress;
    /** Targeted device name. */
    private String _targetedDeviceName;
    /** The DeviceRegistrationId being targeted by this wipe action. */
    private String _targetedDeviceRegistrationId;
    /** The UserId being targeted by this wipe action. */
    private String _targetedUserId;
    /**
     * Instantiates a new windowsInformationProtectionWipeAction and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionWipeAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionWipeAction
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionWipeAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionWipeAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionWipeAction currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastCheckInDateTime", (n) -> { currentObject.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ActionState.class)); });
            this.put("targetedDeviceMacAddress", (n) -> { currentObject.setTargetedDeviceMacAddress(n.getStringValue()); });
            this.put("targetedDeviceName", (n) -> { currentObject.setTargetedDeviceName(n.getStringValue()); });
            this.put("targetedDeviceRegistrationId", (n) -> { currentObject.setTargetedDeviceRegistrationId(n.getStringValue()); });
            this.put("targetedUserId", (n) -> { currentObject.setTargetedUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastCheckInDateTime property value. Last checkin time of the device that was targeted by this wipe action.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this._lastCheckInDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getStatus() {
        return this._status;
    }
    /**
     * Gets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceMacAddress() {
        return this._targetedDeviceMacAddress;
    }
    /**
     * Gets the targetedDeviceName property value. Targeted device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceName() {
        return this._targetedDeviceName;
    }
    /**
     * Gets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceRegistrationId() {
        return this._targetedDeviceRegistrationId;
    }
    /**
     * Gets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedUserId() {
        return this._targetedUserId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastCheckInDateTime", this.getLastCheckInDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("targetedDeviceMacAddress", this.getTargetedDeviceMacAddress());
        writer.writeStringValue("targetedDeviceName", this.getTargetedDeviceName());
        writer.writeStringValue("targetedDeviceRegistrationId", this.getTargetedDeviceRegistrationId());
        writer.writeStringValue("targetedUserId", this.getTargetedUserId());
    }
    /**
     * Sets the lastCheckInDateTime property value. Last checkin time of the device that was targeted by this wipe action.
     * @param value Value to set for the lastCheckInDateTime property.
     * @return a void
     */
    public void setLastCheckInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckInDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ActionState value) {
        this._status = value;
    }
    /**
     * Sets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @param value Value to set for the targetedDeviceMacAddress property.
     * @return a void
     */
    public void setTargetedDeviceMacAddress(@javax.annotation.Nullable final String value) {
        this._targetedDeviceMacAddress = value;
    }
    /**
     * Sets the targetedDeviceName property value. Targeted device name.
     * @param value Value to set for the targetedDeviceName property.
     * @return a void
     */
    public void setTargetedDeviceName(@javax.annotation.Nullable final String value) {
        this._targetedDeviceName = value;
    }
    /**
     * Sets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @param value Value to set for the targetedDeviceRegistrationId property.
     * @return a void
     */
    public void setTargetedDeviceRegistrationId(@javax.annotation.Nullable final String value) {
        this._targetedDeviceRegistrationId = value;
    }
    /**
     * Sets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @param value Value to set for the targetedUserId property.
     * @return a void
     */
    public void setTargetedUserId(@javax.annotation.Nullable final String value) {
        this._targetedUserId = value;
    }
}
