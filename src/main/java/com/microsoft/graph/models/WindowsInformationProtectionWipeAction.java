package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionWipeAction extends Entity implements Parsable {
    /** Last checkin time of the device that was targeted by this wipe action. */
    private OffsetDateTime lastCheckInDateTime;
    /** The status property */
    private ActionState status;
    /** Targeted device Mac address. */
    private String targetedDeviceMacAddress;
    /** Targeted device name. */
    private String targetedDeviceName;
    /** The DeviceRegistrationId being targeted by this wipe action. */
    private String targetedDeviceRegistrationId;
    /** The UserId being targeted by this wipe action. */
    private String targetedUserId;
    /**
     * Instantiates a new WindowsInformationProtectionWipeAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionWipeAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtectionWipeAction
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionWipeAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionWipeAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastCheckInDateTime", (n) -> { this.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("targetedDeviceMacAddress", (n) -> { this.setTargetedDeviceMacAddress(n.getStringValue()); });
        deserializerMap.put("targetedDeviceName", (n) -> { this.setTargetedDeviceName(n.getStringValue()); });
        deserializerMap.put("targetedDeviceRegistrationId", (n) -> { this.setTargetedDeviceRegistrationId(n.getStringValue()); });
        deserializerMap.put("targetedUserId", (n) -> { this.setTargetedUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastCheckInDateTime property value. Last checkin time of the device that was targeted by this wipe action.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this.lastCheckInDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getStatus() {
        return this.status;
    }
    /**
     * Gets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceMacAddress() {
        return this.targetedDeviceMacAddress;
    }
    /**
     * Gets the targetedDeviceName property value. Targeted device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceName() {
        return this.targetedDeviceName;
    }
    /**
     * Gets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedDeviceRegistrationId() {
        return this.targetedDeviceRegistrationId;
    }
    /**
     * Gets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedUserId() {
        return this.targetedUserId;
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
    @javax.annotation.Nonnull
    public void setLastCheckInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastCheckInDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ActionState value) {
        this.status = value;
    }
    /**
     * Sets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @param value Value to set for the targetedDeviceMacAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedDeviceMacAddress(@javax.annotation.Nullable final String value) {
        this.targetedDeviceMacAddress = value;
    }
    /**
     * Sets the targetedDeviceName property value. Targeted device name.
     * @param value Value to set for the targetedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedDeviceName(@javax.annotation.Nullable final String value) {
        this.targetedDeviceName = value;
    }
    /**
     * Sets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @param value Value to set for the targetedDeviceRegistrationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedDeviceRegistrationId(@javax.annotation.Nullable final String value) {
        this.targetedDeviceRegistrationId = value;
    }
    /**
     * Sets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @param value Value to set for the targetedUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedUserId(@javax.annotation.Nullable final String value) {
        this.targetedUserId = value;
    }
}
