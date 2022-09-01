package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionDeviceRegistration extends Entity implements Parsable {
    /** Device Mac address. */
    private String _deviceMacAddress;
    /** Device name. */
    private String _deviceName;
    /** Device identifier for this device registration record. */
    private String _deviceRegistrationId;
    /** Device type, for example, Windows laptop VS Windows phone. */
    private String _deviceType;
    /** Last checkin time of the device. */
    private OffsetDateTime _lastCheckInDateTime;
    /** UserId associated with this device registration record. */
    private String _userId;
    /**
     * Instantiates a new WindowsInformationProtectionDeviceRegistration and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionDeviceRegistration() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtectionDeviceRegistration");
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
        return this._deviceMacAddress;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this._deviceRegistrationId;
    }
    /**
     * Gets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceType() {
        return this._deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionDeviceRegistration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceMacAddress", (n) -> { currentObject.setDeviceMacAddress(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceRegistrationId", (n) -> { currentObject.setDeviceRegistrationId(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getStringValue()); });
            this.put("lastCheckInDateTime", (n) -> { currentObject.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastCheckInDateTime property value. Last checkin time of the device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this._lastCheckInDateTime;
    }
    /**
     * Gets the userId property value. UserId associated with this device registration record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDeviceMacAddress(@javax.annotation.Nullable final String value) {
        this._deviceMacAddress = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceRegistrationId property value. Device identifier for this device registration record.
     * @param value Value to set for the deviceRegistrationId property.
     * @return a void
     */
    public void setDeviceRegistrationId(@javax.annotation.Nullable final String value) {
        this._deviceRegistrationId = value;
    }
    /**
     * Sets the deviceType property value. Device type, for example, Windows laptop VS Windows phone.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    public void setDeviceType(@javax.annotation.Nullable final String value) {
        this._deviceType = value;
    }
    /**
     * Sets the lastCheckInDateTime property value. Last checkin time of the device.
     * @param value Value to set for the lastCheckInDateTime property.
     * @return a void
     */
    public void setLastCheckInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckInDateTime = value;
    }
    /**
     * Sets the userId property value. UserId associated with this device registration record.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
