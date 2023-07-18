package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows management app entity.
 */
public class WindowsManagementApp extends Entity implements Parsable {
    /**
     * Windows management app available version.
     */
    private String availableVersion;
    /**
     * The list of health states for installed Windows management app.
     */
    private java.util.List<WindowsManagementAppHealthState> healthStates;
    /**
     * ManagedInstallerStatus
     */
    private ManagedInstallerStatus managedInstaller;
    /**
     * Managed Installer Configured Date Time
     */
    private String managedInstallerConfiguredDateTime;
    /**
     * Instantiates a new windowsManagementApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsManagementApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsManagementApp
     */
    @javax.annotation.Nonnull
    public static WindowsManagementApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementApp();
    }
    /**
     * Gets the availableVersion property value. Windows management app available version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailableVersion() {
        return this.availableVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availableVersion", (n) -> { this.setAvailableVersion(n.getStringValue()); });
        deserializerMap.put("healthStates", (n) -> { this.setHealthStates(n.getCollectionOfObjectValues(WindowsManagementAppHealthState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedInstaller", (n) -> { this.setManagedInstaller(n.getEnumValue(ManagedInstallerStatus.class)); });
        deserializerMap.put("managedInstallerConfiguredDateTime", (n) -> { this.setManagedInstallerConfiguredDateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStates property value. The list of health states for installed Windows management app.
     * @return a windowsManagementAppHealthState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsManagementAppHealthState> getHealthStates() {
        return this.healthStates;
    }
    /**
     * Gets the managedInstaller property value. ManagedInstallerStatus
     * @return a managedInstallerStatus
     */
    @javax.annotation.Nullable
    public ManagedInstallerStatus getManagedInstaller() {
        return this.managedInstaller;
    }
    /**
     * Gets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedInstallerConfiguredDateTime() {
        return this.managedInstallerConfiguredDateTime;
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
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeCollectionOfObjectValues("healthStates", this.getHealthStates());
        writer.writeEnumValue("managedInstaller", this.getManagedInstaller());
        writer.writeStringValue("managedInstallerConfiguredDateTime", this.getManagedInstallerConfiguredDateTime());
    }
    /**
     * Sets the availableVersion property value. Windows management app available version.
     * @param value Value to set for the availableVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableVersion(@javax.annotation.Nullable final String value) {
        this.availableVersion = value;
    }
    /**
     * Sets the healthStates property value. The list of health states for installed Windows management app.
     * @param value Value to set for the healthStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStates(@javax.annotation.Nullable final java.util.List<WindowsManagementAppHealthState> value) {
        this.healthStates = value;
    }
    /**
     * Sets the managedInstaller property value. ManagedInstallerStatus
     * @param value Value to set for the managedInstaller property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedInstaller(@javax.annotation.Nullable final ManagedInstallerStatus value) {
        this.managedInstaller = value;
    }
    /**
     * Sets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @param value Value to set for the managedInstallerConfiguredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedInstallerConfiguredDateTime(@javax.annotation.Nullable final String value) {
        this.managedInstallerConfiguredDateTime = value;
    }
}
