package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Abstract class to contain properties used to assign a mobile app to a group.
 */
public class MacOsVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * When TRUE, indicates that the app should not be automatically updated with the latest version from Apple app store. When FALSE, indicates that the app may be auto updated. By default, this property is set to null which internally is treated as FALSE.
     */
    private Boolean preventAutoAppUpdate;
    /**
     * When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     */
    private Boolean preventManagedAppBackup;
    /**
     * Whether or not to uninstall the app when device is removed from Intune.
     */
    private Boolean uninstallOnDeviceRemoval;
    /**
     * Whether or not to use device licensing.
     */
    private Boolean useDeviceLicensing;
    /**
     * Instantiates a new macOsVppAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOsVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.macOsVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOsVppAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static MacOsVppAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("preventAutoAppUpdate", (n) -> { this.setPreventAutoAppUpdate(n.getBooleanValue()); });
        deserializerMap.put("preventManagedAppBackup", (n) -> { this.setPreventManagedAppBackup(n.getBooleanValue()); });
        deserializerMap.put("uninstallOnDeviceRemoval", (n) -> { this.setUninstallOnDeviceRemoval(n.getBooleanValue()); });
        deserializerMap.put("useDeviceLicensing", (n) -> { this.setUseDeviceLicensing(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preventAutoAppUpdate property value. When TRUE, indicates that the app should not be automatically updated with the latest version from Apple app store. When FALSE, indicates that the app may be auto updated. By default, this property is set to null which internally is treated as FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreventAutoAppUpdate() {
        return this.preventAutoAppUpdate;
    }
    /**
     * Gets the preventManagedAppBackup property value. When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreventManagedAppBackup() {
        return this.preventManagedAppBackup;
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this.uninstallOnDeviceRemoval;
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this.useDeviceLicensing;
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
        writer.writeBooleanValue("preventAutoAppUpdate", this.getPreventAutoAppUpdate());
        writer.writeBooleanValue("preventManagedAppBackup", this.getPreventManagedAppBackup());
        writer.writeBooleanValue("uninstallOnDeviceRemoval", this.getUninstallOnDeviceRemoval());
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
    }
    /**
     * Sets the preventAutoAppUpdate property value. When TRUE, indicates that the app should not be automatically updated with the latest version from Apple app store. When FALSE, indicates that the app may be auto updated. By default, this property is set to null which internally is treated as FALSE.
     * @param value Value to set for the preventAutoAppUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreventAutoAppUpdate(@javax.annotation.Nullable final Boolean value) {
        this.preventAutoAppUpdate = value;
    }
    /**
     * Sets the preventManagedAppBackup property value. When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     * @param value Value to set for the preventManagedAppBackup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreventManagedAppBackup(@javax.annotation.Nullable final Boolean value) {
        this.preventManagedAppBackup = value;
    }
    /**
     * Sets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @param value Value to set for the uninstallOnDeviceRemoval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUninstallOnDeviceRemoval(@javax.annotation.Nullable final Boolean value) {
        this.uninstallOnDeviceRemoval = value;
    }
    /**
     * Sets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @param value Value to set for the useDeviceLicensing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this.useDeviceLicensing = value;
    }
}
