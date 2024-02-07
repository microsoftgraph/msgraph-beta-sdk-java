package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents wipe requests issued by tenant admin for Bring-Your-Own-Device(BYOD) Windows devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtectionWipeAction extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsInformationProtectionWipeAction and sets the default values.
     */
    public WindowsInformationProtectionWipeAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtectionWipeAction
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionWipeAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionWipeAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastCheckInDateTime", (n) -> { this.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ActionState::forValue)); });
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this.backingStore.get("lastCheckInDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a ActionState
     */
    @jakarta.annotation.Nullable
    public ActionState getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetedDeviceMacAddress() {
        return this.backingStore.get("targetedDeviceMacAddress");
    }
    /**
     * Gets the targetedDeviceName property value. Targeted device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetedDeviceName() {
        return this.backingStore.get("targetedDeviceName");
    }
    /**
     * Gets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetedDeviceRegistrationId() {
        return this.backingStore.get("targetedDeviceRegistrationId");
    }
    /**
     * Gets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetedUserId() {
        return this.backingStore.get("targetedUserId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setLastCheckInDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckInDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ActionState value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetedDeviceMacAddress property value. Targeted device Mac address.
     * @param value Value to set for the targetedDeviceMacAddress property.
     */
    public void setTargetedDeviceMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetedDeviceMacAddress", value);
    }
    /**
     * Sets the targetedDeviceName property value. Targeted device name.
     * @param value Value to set for the targetedDeviceName property.
     */
    public void setTargetedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetedDeviceName", value);
    }
    /**
     * Sets the targetedDeviceRegistrationId property value. The DeviceRegistrationId being targeted by this wipe action.
     * @param value Value to set for the targetedDeviceRegistrationId property.
     */
    public void setTargetedDeviceRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetedDeviceRegistrationId", value);
    }
    /**
     * Sets the targetedUserId property value. The UserId being targeted by this wipe action.
     * @param value Value to set for the targetedUserId property.
     */
    public void setTargetedUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetedUserId", value);
    }
}
