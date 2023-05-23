package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AospDeviceOwnerDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not the user is allowed to enable unknown sources setting. When set to true, user is not allowed to enable unknown sources settings. */
    private Boolean appsBlockInstallFromUnknownSources;
    /** Indicates whether or not to block a user from configuring bluetooth. */
    private Boolean bluetoothBlockConfiguration;
    /** Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device. */
    private Boolean bluetoothBlocked;
    /** Indicates whether or not to disable the use of the camera. */
    private Boolean cameraBlocked;
    /** Indicates whether or not the factory reset option in settings is disabled. */
    private Boolean factoryResetBlocked;
    /** Indicates the minimum length of the password required on the device. Valid values 4 to 16 */
    private Integer passwordMinimumLength;
    /** Minutes of inactivity before the screen times out. */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType passwordRequiredType;
    /** Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11 */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to disable the capability to take screenshots. */
    private Boolean screenCaptureBlocked;
    /** Indicates whether or not to block the user from enabling debugging features on the device. */
    private Boolean securityAllowDebuggingFeatures;
    /** Indicates whether or not to block external media. */
    private Boolean storageBlockExternalMedia;
    /** Indicates whether or not to block USB file transfer. */
    private Boolean storageBlockUsbFileTransfer;
    /** Indicates whether or not to block the user from editing the wifi connection settings. */
    private Boolean wifiBlockEditConfigurations;
    /**
     * Instantiates a new AospDeviceOwnerDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AospDeviceOwnerDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.aospDeviceOwnerDeviceConfiguration");
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
        return this.appsBlockInstallFromUnknownSources;
    }
    /**
     * Gets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockConfiguration() {
        return this.bluetoothBlockConfiguration;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this.factoryResetBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appsBlockInstallFromUnknownSources", (n) -> { this.setAppsBlockInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockConfiguration", (n) -> { this.setBluetoothBlockConfiguration(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlocked", (n) -> { this.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("factoryResetBlocked", (n) -> { this.setFactoryResetBlocked(n.getBooleanValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("securityAllowDebuggingFeatures", (n) -> { this.setSecurityAllowDebuggingFeatures(n.getBooleanValue()); });
        deserializerMap.put("storageBlockExternalMedia", (n) -> { this.setStorageBlockExternalMedia(n.getBooleanValue()); });
        deserializerMap.put("storageBlockUsbFileTransfer", (n) -> { this.setStorageBlockUsbFileTransfer(n.getBooleanValue()); });
        deserializerMap.put("wifiBlockEditConfigurations", (n) -> { this.setWifiBlockEditConfigurations(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the securityAllowDebuggingFeatures property value. Indicates whether or not to block the user from enabling debugging features on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityAllowDebuggingFeatures() {
        return this.securityAllowDebuggingFeatures;
    }
    /**
     * Gets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockExternalMedia() {
        return this.storageBlockExternalMedia;
    }
    /**
     * Gets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockUsbFileTransfer() {
        return this.storageBlockUsbFileTransfer;
    }
    /**
     * Gets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditConfigurations() {
        return this.wifiBlockEditConfigurations;
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
    @javax.annotation.Nonnull
    public void setAppsBlockInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockInstallFromUnknownSources = value;
    }
    /**
     * Sets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @param value Value to set for the bluetoothBlockConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockConfiguration = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this.factoryResetBlocked = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the securityAllowDebuggingFeatures property value. Indicates whether or not to block the user from enabling debugging features on the device.
     * @param value Value to set for the securityAllowDebuggingFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityAllowDebuggingFeatures(@javax.annotation.Nullable final Boolean value) {
        this.securityAllowDebuggingFeatures = value;
    }
    /**
     * Sets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @param value Value to set for the storageBlockExternalMedia property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockExternalMedia(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockExternalMedia = value;
    }
    /**
     * Sets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @param value Value to set for the storageBlockUsbFileTransfer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockUsbFileTransfer(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockUsbFileTransfer = value;
    }
    /**
     * Sets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @param value Value to set for the wifiBlockEditConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBlockEditConfigurations(@javax.annotation.Nullable final Boolean value) {
        this.wifiBlockEditConfigurations = value;
    }
}
