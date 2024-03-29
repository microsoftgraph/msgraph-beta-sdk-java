package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows management app entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsManagementApp extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsManagementApp} and sets the default values.
     */
    public WindowsManagementApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsManagementApp}
     */
    @jakarta.annotation.Nonnull
    public static WindowsManagementApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementApp();
    }
    /**
     * Gets the availableVersion property value. Windows management app available version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailableVersion() {
        return this.backingStore.get("availableVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availableVersion", (n) -> { this.setAvailableVersion(n.getStringValue()); });
        deserializerMap.put("healthStates", (n) -> { this.setHealthStates(n.getCollectionOfObjectValues(WindowsManagementAppHealthState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedInstaller", (n) -> { this.setManagedInstaller(n.getEnumValue(ManagedInstallerStatus::forValue)); });
        deserializerMap.put("managedInstallerConfiguredDateTime", (n) -> { this.setManagedInstallerConfiguredDateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStates property value. The list of health states for installed Windows management app.
     * @return a {@link java.util.List<WindowsManagementAppHealthState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsManagementAppHealthState> getHealthStates() {
        return this.backingStore.get("healthStates");
    }
    /**
     * Gets the managedInstaller property value. ManagedInstallerStatus
     * @return a {@link ManagedInstallerStatus}
     */
    @jakarta.annotation.Nullable
    public ManagedInstallerStatus getManagedInstaller() {
        return this.backingStore.get("managedInstaller");
    }
    /**
     * Gets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedInstallerConfiguredDateTime() {
        return this.backingStore.get("managedInstallerConfiguredDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeCollectionOfObjectValues("healthStates", this.getHealthStates());
        writer.writeEnumValue("managedInstaller", this.getManagedInstaller());
        writer.writeStringValue("managedInstallerConfiguredDateTime", this.getManagedInstallerConfiguredDateTime());
    }
    /**
     * Sets the availableVersion property value. Windows management app available version.
     * @param value Value to set for the availableVersion property.
     */
    public void setAvailableVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("availableVersion", value);
    }
    /**
     * Sets the healthStates property value. The list of health states for installed Windows management app.
     * @param value Value to set for the healthStates property.
     */
    public void setHealthStates(@jakarta.annotation.Nullable final java.util.List<WindowsManagementAppHealthState> value) {
        this.backingStore.set("healthStates", value);
    }
    /**
     * Sets the managedInstaller property value. ManagedInstallerStatus
     * @param value Value to set for the managedInstaller property.
     */
    public void setManagedInstaller(@jakarta.annotation.Nullable final ManagedInstallerStatus value) {
        this.backingStore.set("managedInstaller", value);
    }
    /**
     * Sets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @param value Value to set for the managedInstallerConfiguredDateTime property.
     */
    public void setManagedInstallerConfiguredDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedInstallerConfiguredDateTime", value);
    }
}
