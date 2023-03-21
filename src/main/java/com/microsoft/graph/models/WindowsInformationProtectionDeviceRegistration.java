package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionDeviceRegistration extends Entity implements Parsable {
    /** Device Mac address. */
    private String deviceMacAddress;
    /** Device name. */
    private String deviceName;
    /** Device identifier for this device registration record. */
    private String deviceRegistrationId;
    /** Device type, for example, Windows laptop VS Windows phone. */
    private String deviceType;
    /** Last checkin time of the device. */
    private OffsetDateTime lastCheckInDateTime;
    /** UserId associated with this device registration record. */
    private String userId;
    /**
     * Instantiates a new WindowsInformationProtectionDeviceRegistration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionDeviceRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtectionDeviceRegistration
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionDeviceRegistration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDeviceRegistration();
    }
    /**
     * Gets the deviceMacAddress property value. Device Mac address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceMacAddress() {
        return this.deviceMacAddress;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this.deviceRegistrationId;
    }
    /**
     * Gets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this.lastCheckInDateTime;
    }
    /**
     * Gets the userId property value. UserId associated with this device registration record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMacAddress(@javax.annotation.Nullable final String value) {
        this.deviceMacAddress = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @param value Value to set for the deviceRegistrationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRegistrationId(@javax.annotation.Nullable final String value) {
        this.deviceRegistrationId = value;
    }
    /**
     * Sets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the lastCheckInDateTime property value. Last checkin time of the device.
     * @param value Value to set for the lastCheckInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastCheckInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastCheckInDateTime = value;
    }
    /**
     * Sets the userId property value. UserId associated with this device registration record.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
