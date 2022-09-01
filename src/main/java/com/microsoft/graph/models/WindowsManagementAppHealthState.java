package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows management app health state entity. */
public class WindowsManagementAppHealthState extends Entity implements Parsable {
    /** Name of the device on which Windows management app is installed. */
    private String _deviceName;
    /** Windows 10 OS version of the device on which Windows management app is installed. */
    private String _deviceOSVersion;
    /** Indicates health state of the Windows management app. */
    private HealthState _healthState;
    /** Windows management app installed version. */
    private String _installedVersion;
    /** Windows management app last check-in time. */
    private OffsetDateTime _lastCheckInDateTime;
    /**
     * Instantiates a new windowsManagementAppHealthState and sets the default values.
     * @return a void
     */
    public WindowsManagementAppHealthState() {
        super();
        this.setOdataType("#microsoft.graph.windowsManagementAppHealthState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsManagementAppHealthState
     */
    @javax.annotation.Nonnull
    public static WindowsManagementAppHealthState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementAppHealthState();
    }
    /**
     * Gets the deviceName property value. Name of the device on which Windows management app is installed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceOSVersion property value. Windows 10 OS version of the device on which Windows management app is installed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOSVersion() {
        return this._deviceOSVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsManagementAppHealthState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceOSVersion", (n) -> { currentObject.setDeviceOSVersion(n.getStringValue()); });
            this.put("healthState", (n) -> { currentObject.setHealthState(n.getEnumValue(HealthState.class)); });
            this.put("installedVersion", (n) -> { currentObject.setInstalledVersion(n.getStringValue()); });
            this.put("lastCheckInDateTime", (n) -> { currentObject.setLastCheckInDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the healthState property value. Indicates health state of the Windows management app.
     * @return a healthState
     */
    @javax.annotation.Nullable
    public HealthState getHealthState() {
        return this._healthState;
    }
    /**
     * Gets the installedVersion property value. Windows management app installed version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstalledVersion() {
        return this._installedVersion;
    }
    /**
     * Gets the lastCheckInDateTime property value. Windows management app last check-in time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckInDateTime() {
        return this._lastCheckInDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceOSVersion property value. Windows 10 OS version of the device on which Windows management app is installed.
     * @param value Value to set for the deviceOSVersion property.
     * @return a void
     */
    public void setDeviceOSVersion(@javax.annotation.Nullable final String value) {
        this._deviceOSVersion = value;
    }
    /**
     * Sets the healthState property value. Indicates health state of the Windows management app.
     * @param value Value to set for the healthState property.
     * @return a void
     */
    public void setHealthState(@javax.annotation.Nullable final HealthState value) {
        this._healthState = value;
    }
    /**
     * Sets the installedVersion property value. Windows management app installed version.
     * @param value Value to set for the installedVersion property.
     * @return a void
     */
    public void setInstalledVersion(@javax.annotation.Nullable final String value) {
        this._installedVersion = value;
    }
    /**
     * Sets the lastCheckInDateTime property value. Windows management app last check-in time.
     * @param value Value to set for the lastCheckInDateTime property.
     * @return a void
     */
    public void setLastCheckInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckInDateTime = value;
    }
}
