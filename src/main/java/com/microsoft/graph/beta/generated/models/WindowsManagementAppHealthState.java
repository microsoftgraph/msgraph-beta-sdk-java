package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows management app health state entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsManagementAppHealthState extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsManagementAppHealthState and sets the default values.
     */
    public WindowsManagementAppHealthState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsManagementAppHealthState
     */
    @jakarta.annotation.Nonnull
    public static WindowsManagementAppHealthState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementAppHealthState();
    }
    /**
     * Gets the deviceName property value. Name of the device on which Windows management app is installed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceOSVersion property value. Windows 10 OS version of the device on which Windows management app is installed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceOSVersion() {
        return this.backingStore.get("deviceOSVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceOSVersion", (n) -> { this.setDeviceOSVersion(n.getStringValue()); });
        deserializerMap.put("healthState", (n) -> { this.setHealthState(n.getEnumValue(HealthState::forValue)); });
        deserializerMap.put("installedVersion", (n) -> { this.setInstalledVersion(n.getStringValue()); });
        deserializerMap.put("lastCheckInDateTime", (n) -> { this.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthState property value. Indicates health state of the Windows management app.
     * @return a HealthState
     */
    @jakarta.annotation.Nullable
    public HealthState getHealthState() {
        return this.backingStore.get("healthState");
    }
    /**
     * Gets the installedVersion property value. Windows management app installed version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstalledVersion() {
        return this.backingStore.get("installedVersion");
    }
    /**
     * Gets the lastCheckInDateTime property value. Windows management app last check-in time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this.backingStore.get("lastCheckInDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("deviceOSVersion", this.getDeviceOSVersion());
        writer.writeEnumValue("healthState", this.getHealthState());
        writer.writeStringValue("installedVersion", this.getInstalledVersion());
        writer.writeOffsetDateTimeValue("lastCheckInDateTime", this.getLastCheckInDateTime());
    }
    /**
     * Sets the deviceName property value. Name of the device on which Windows management app is installed.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceOSVersion property value. Windows 10 OS version of the device on which Windows management app is installed.
     * @param value Value to set for the deviceOSVersion property.
     */
    public void setDeviceOSVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOSVersion", value);
    }
    /**
     * Sets the healthState property value. Indicates health state of the Windows management app.
     * @param value Value to set for the healthState property.
     */
    public void setHealthState(@jakarta.annotation.Nullable final HealthState value) {
        this.backingStore.set("healthState", value);
    }
    /**
     * Sets the installedVersion property value. Windows management app installed version.
     * @param value Value to set for the installedVersion property.
     */
    public void setInstalledVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("installedVersion", value);
    }
    /**
     * Sets the lastCheckInDateTime property value. Windows management app last check-in time.
     * @param value Value to set for the lastCheckInDateTime property.
     */
    public void setLastCheckInDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckInDateTime", value);
    }
}
