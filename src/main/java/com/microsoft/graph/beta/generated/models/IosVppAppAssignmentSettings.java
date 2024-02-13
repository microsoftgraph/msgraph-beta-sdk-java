package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an iOS VPP mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new {@link IosVppAppAssignmentSettings} and sets the default values.
     */
    public IosVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosVppAppAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static IosVppAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRemovable", (n) -> { this.setIsRemovable(n.getBooleanValue()); });
        deserializerMap.put("preventAutoAppUpdate", (n) -> { this.setPreventAutoAppUpdate(n.getBooleanValue()); });
        deserializerMap.put("preventManagedAppBackup", (n) -> { this.setPreventManagedAppBackup(n.getBooleanValue()); });
        deserializerMap.put("uninstallOnDeviceRemoval", (n) -> { this.setUninstallOnDeviceRemoval(n.getBooleanValue()); });
        deserializerMap.put("useDeviceLicensing", (n) -> { this.setUseDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("vpnConfigurationId", (n) -> { this.setVpnConfigurationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRemovable property value. Whether or not the app can be removed by the user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemovable() {
        return this.backingStore.get("isRemovable");
    }
    /**
     * Gets the preventAutoAppUpdate property value. When TRUE, indicates that the app should not be automatically updated with the latest version from Apple app store. When FALSE, indicates that the app may be auto updated. By default, this property is set to null which internally is treated as FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventAutoAppUpdate() {
        return this.backingStore.get("preventAutoAppUpdate");
    }
    /**
     * Gets the preventManagedAppBackup property value. When TRUE, indicates that the app should not be backed up to iCloud. When FALSE, indicates that the app may be backed up to iCloud. By default, this property is set to null which internally is treated as FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventManagedAppBackup() {
        return this.backingStore.get("preventManagedAppBackup");
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. Whether or not to uninstall the app when device is removed from Intune.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this.backingStore.get("uninstallOnDeviceRemoval");
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this.backingStore.get("useDeviceLicensing");
    }
    /**
     * Gets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVpnConfigurationId() {
        return this.backingStore.get("vpnConfigurationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isRemovable", this.getIsRemovable());
        writer.writeBooleanValue("preventAutoAppUpdate", this.getPreventAutoAppUpdate());
        writer.writeBooleanValue("preventManagedAppBackup", this.getPreventManagedAppBackup());
        writer.writeBooleanValue("uninstallOnDeviceRemoval", this.getUninstallOnDeviceRemoval());
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the isRemovable property value. Whether or not the app can be removed by the user.
     * @param value Value to set for the isRemovable property.
     */
    public void setIsRemovable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRemovable", value);
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
    /**
     * Sets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @param value Value to set for the vpnConfigurationId property.
     */
    public void setVpnConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vpnConfigurationId", value);
    }
}
