package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AospDeviceOwnerDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not the user is allowed to enable unknown sources setting. When set to true, user is not allowed to enable unknown sources settings. */
    private Boolean _appsBlockInstallFromUnknownSources;
    /** Indicates whether or not to block a user from configuring bluetooth. */
    private Boolean _bluetoothBlockConfiguration;
    /** Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device. */
    private Boolean _bluetoothBlocked;
    /** Indicates whether or not to disable the use of the camera. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not the factory reset option in settings is disabled. */
    private Boolean _factoryResetBlocked;
    /** Indicates the minimum length of the password required on the device. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType _passwordRequiredType;
    /** Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to disable the capability to take screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Indicates whether or not to block the user from enabling debugging features on the device. */
    private Boolean _securityAllowDebuggingFeatures;
    /** Indicates whether or not to block external media. */
    private Boolean _storageBlockExternalMedia;
    /** Indicates whether or not to block USB file transfer. */
    private Boolean _storageBlockUsbFileTransfer;
    /** Indicates whether or not to block the user from editing the wifi connection settings. */
    private Boolean _wifiBlockEditConfigurations;
    /**
     * Instantiates a new AospDeviceOwnerDeviceConfiguration and sets the default values.
     * @return a void
     */
    public AospDeviceOwnerDeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AospDeviceOwnerDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static AospDeviceOwnerDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AospDeviceOwnerDeviceConfiguration();
    }
    /**
     * Gets the appsBlockInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable unknown sources setting. When set to true, user is not allowed to enable unknown sources settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockInstallFromUnknownSources() {
        return this._appsBlockInstallFromUnknownSources;
    }
    /**
     * Gets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockConfiguration() {
        return this._bluetoothBlockConfiguration;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this._bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this._factoryResetBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AospDeviceOwnerDeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appsBlockInstallFromUnknownSources", (n) -> { currentObject.setAppsBlockInstallFromUnknownSources(n.getBooleanValue()); });
            this.put("bluetoothBlockConfiguration", (n) -> { currentObject.setBluetoothBlockConfiguration(n.getBooleanValue()); });
            this.put("bluetoothBlocked", (n) -> { currentObject.setBluetoothBlocked(n.getBooleanValue()); });
            this.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
            this.put("factoryResetBlocked", (n) -> { currentObject.setFactoryResetBlocked(n.getBooleanValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
            this.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("securityAllowDebuggingFeatures", (n) -> { currentObject.setSecurityAllowDebuggingFeatures(n.getBooleanValue()); });
            this.put("storageBlockExternalMedia", (n) -> { currentObject.setStorageBlockExternalMedia(n.getBooleanValue()); });
            this.put("storageBlockUsbFileTransfer", (n) -> { currentObject.setStorageBlockUsbFileTransfer(n.getBooleanValue()); });
            this.put("wifiBlockEditConfigurations", (n) -> { currentObject.setWifiBlockEditConfigurations(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the securityAllowDebuggingFeatures property value. Indicates whether or not to block the user from enabling debugging features on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityAllowDebuggingFeatures() {
        return this._securityAllowDebuggingFeatures;
    }
    /**
     * Gets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockExternalMedia() {
        return this._storageBlockExternalMedia;
    }
    /**
     * Gets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockUsbFileTransfer() {
        return this._storageBlockUsbFileTransfer;
    }
    /**
     * Gets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditConfigurations() {
        return this._wifiBlockEditConfigurations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("appsBlockInstallFromUnknownSources", this.getAppsBlockInstallFromUnknownSources());
        writer.writeBooleanValue("bluetoothBlockConfiguration", this.getBluetoothBlockConfiguration());
        writer.writeBooleanValue("bluetoothBlocked", this.getBluetoothBlocked());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("factoryResetBlocked", this.getFactoryResetBlocked());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("securityAllowDebuggingFeatures", this.getSecurityAllowDebuggingFeatures());
        writer.writeBooleanValue("storageBlockExternalMedia", this.getStorageBlockExternalMedia());
        writer.writeBooleanValue("storageBlockUsbFileTransfer", this.getStorageBlockUsbFileTransfer());
        writer.writeBooleanValue("wifiBlockEditConfigurations", this.getWifiBlockEditConfigurations());
    }
    /**
     * Sets the appsBlockInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable unknown sources setting. When set to true, user is not allowed to enable unknown sources settings.
     * @param value Value to set for the appsBlockInstallFromUnknownSources property.
     * @return a void
     */
    public void setAppsBlockInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockInstallFromUnknownSources = value;
    }
    /**
     * Sets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @param value Value to set for the bluetoothBlockConfiguration property.
     * @return a void
     */
    public void setBluetoothBlockConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockConfiguration = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this._factoryResetBlocked = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the securityAllowDebuggingFeatures property value. Indicates whether or not to block the user from enabling debugging features on the device.
     * @param value Value to set for the securityAllowDebuggingFeatures property.
     * @return a void
     */
    public void setSecurityAllowDebuggingFeatures(@javax.annotation.Nullable final Boolean value) {
        this._securityAllowDebuggingFeatures = value;
    }
    /**
     * Sets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @param value Value to set for the storageBlockExternalMedia property.
     * @return a void
     */
    public void setStorageBlockExternalMedia(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockExternalMedia = value;
    }
    /**
     * Sets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @param value Value to set for the storageBlockUsbFileTransfer property.
     * @return a void
     */
    public void setStorageBlockUsbFileTransfer(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockUsbFileTransfer = value;
    }
    /**
     * Sets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @param value Value to set for the wifiBlockEditConfigurations property.
     * @return a void
     */
    public void setWifiBlockEditConfigurations(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlockEditConfigurations = value;
    }
}
