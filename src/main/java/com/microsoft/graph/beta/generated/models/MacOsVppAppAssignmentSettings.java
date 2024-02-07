package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an Mac VPP mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOsVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new MacOsVppAppAssignmentSettings and sets the default values.
     */
    public MacOsVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.macOsVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOsVppAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static MacOsVppAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventAutoAppUpdate() {
        return this.backingStore.get("preventAutoAppUpdate");
    }
    /**
     * Gets the preventManagedAppBackup property value. When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventManagedAppBackup() {
        return this.backingStore.get("preventManagedAppBackup");
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this.backingStore.get("uninstallOnDeviceRemoval");
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this.backingStore.get("useDeviceLicensing");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setPreventAutoAppUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preventAutoAppUpdate", value);
    }
    /**
     * Sets the preventManagedAppBackup property value. When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     * @param value Value to set for the preventManagedAppBackup property.
     */
    public void setPreventManagedAppBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preventManagedAppBackup", value);
    }
    /**
     * Sets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @param value Value to set for the uninstallOnDeviceRemoval property.
     */
    public void setUninstallOnDeviceRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("uninstallOnDeviceRemoval", value);
    }
    /**
     * Sets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @param value Value to set for the useDeviceLicensing property.
     */
    public void setUseDeviceLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useDeviceLicensing", value);
    }
}
