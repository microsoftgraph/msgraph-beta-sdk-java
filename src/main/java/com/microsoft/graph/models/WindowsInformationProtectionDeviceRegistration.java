package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents device registration records for Bring-Your-Own-Device(BYOD) Windows devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtectionDeviceRegistration extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsInformationProtectionDeviceRegistration and sets the default values.
     */
    public WindowsInformationProtectionDeviceRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtectionDeviceRegistration
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionDeviceRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDeviceRegistration();
    }
    /**
     * Gets the deviceMacAddress property value. Device Mac address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceMacAddress() {
        return this.backingStore.get("deviceMacAddress");
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this.backingStore.get("deviceRegistrationId");
    }
    /**
     * Gets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceMacAddress", (n) -> { this.setDeviceMacAddress(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceRegistrationId", (n) -> { this.setDeviceRegistrationId(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("lastCheckInDateTime", (n) -> { this.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastCheckInDateTime property value. Last checkin time of the device.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this.backingStore.get("lastCheckInDateTime");
    }
    /**
     * Gets the userId property value. UserId associated with this device registration record.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceMacAddress", this.getDeviceMacAddress());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("deviceRegistrationId", this.getDeviceRegistrationId());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeOffsetDateTimeValue("lastCheckInDateTime", this.getLastCheckInDateTime());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the deviceMacAddress property value. Device Mac address.
     * @param value Value to set for the deviceMacAddress property.
     */
    public void setDeviceMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceMacAddress", value);
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @param value Value to set for the deviceRegistrationId property.
     */
    public void setDeviceRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceRegistrationId", value);
    }
    /**
     * Sets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the lastCheckInDateTime property value. Last checkin time of the device.
     * @param value Value to set for the lastCheckInDateTime property.
     */
    public void setLastCheckInDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckInDateTime", value);
    }
    /**
     * Sets the userId property value. UserId associated with this device registration record.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
