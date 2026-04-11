package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains per-group deployment configuration for a windowsAutoUpdateCatalogApp. These settings control the end-user experience when the app is deployed to a specific groupincluding whether notifications are shown, how delivery bandwidth is used, when the app must be installed by, and how the device coordinates restarts afterward.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutoUpdateCatalogAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new {@link WindowsAutoUpdateCatalogAppAssignmentSettings} and sets the default values.
     */
    public WindowsAutoUpdateCatalogAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsAutoUpdateCatalogAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsAutoUpdateCatalogAppAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static WindowsAutoUpdateCatalogAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutoUpdateCatalogAppAssignmentSettings();
    }
    /**
     * Gets the deliveryOptimizationPriority property value. Indicates the delivery optimization download priority level for app content. This controls whether the download uses background bandwidth (minimal impact on other network activity) or foreground bandwidth (prioritized download at the expense of other network traffic).
     * @return a {@link WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority}
     */
    @jakarta.annotation.Nullable
    public WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority getDeliveryOptimizationPriority() {
        return this.backingStore.get("deliveryOptimizationPriority");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deliveryOptimizationPriority", (n) -> { this.setDeliveryOptimizationPriority(n.getEnumValue(WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority::forValue)); });
        deserializerMap.put("installTimeSettings", (n) -> { this.setInstallTimeSettings(n.getObjectValue(WindowsAutoUpdateCatalogAppInstallTimeSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getEnumValue(WindowsAutoUpdateCatalogAppNotificationType::forValue)); });
        deserializerMap.put("restartSettings", (n) -> { this.setRestartSettings(n.getObjectValue(WindowsAutoUpdateCatalogAppRestartSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installTimeSettings property value. Specifies the deadline by which the app must be installed on the device. When null, the app is offered for immediate installation with no enforced deadline.
     * @return a {@link WindowsAutoUpdateCatalogAppInstallTimeSettings}
     */
    @jakarta.annotation.Nullable
    public WindowsAutoUpdateCatalogAppInstallTimeSettings getInstallTimeSettings() {
        return this.backingStore.get("installTimeSettings");
    }
    /**
     * Gets the notificationType property value. Indicates which notifications the Intune management extension displays to the end user during the app installation and restart lifecycle on managed devices.
     * @return a {@link WindowsAutoUpdateCatalogAppNotificationType}
     */
    @jakarta.annotation.Nullable
    public WindowsAutoUpdateCatalogAppNotificationType getNotificationType() {
        return this.backingStore.get("notificationType");
    }
    /**
     * Gets the restartSettings property value. Specifies the restart coordination behavior after the app is installedincluding how long to wait before restarting, when to show a countdown, and how long the user can snooze. When null, no restart coordination is applied (the device may still restart based on the app&apos;s deviceRestartBehavior setting). Note: the service accepts restart settings regardless of the app&apos;s deviceRestartBehavior value; the device agent determines which settings are actually honored at runtime.
     * @return a {@link WindowsAutoUpdateCatalogAppRestartSettings}
     */
    @jakarta.annotation.Nullable
    public WindowsAutoUpdateCatalogAppRestartSettings getRestartSettings() {
        return this.backingStore.get("restartSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryOptimizationPriority", this.getDeliveryOptimizationPriority());
        writer.writeObjectValue("installTimeSettings", this.getInstallTimeSettings());
        writer.writeEnumValue("notificationType", this.getNotificationType());
        writer.writeObjectValue("restartSettings", this.getRestartSettings());
    }
    /**
     * Sets the deliveryOptimizationPriority property value. Indicates the delivery optimization download priority level for app content. This controls whether the download uses background bandwidth (minimal impact on other network activity) or foreground bandwidth (prioritized download at the expense of other network traffic).
     * @param value Value to set for the deliveryOptimizationPriority property.
     */
    public void setDeliveryOptimizationPriority(@jakarta.annotation.Nullable final WindowsAutoUpdateCatalogAppDeliveryOptimizationPriority value) {
        this.backingStore.set("deliveryOptimizationPriority", value);
    }
    /**
     * Sets the installTimeSettings property value. Specifies the deadline by which the app must be installed on the device. When null, the app is offered for immediate installation with no enforced deadline.
     * @param value Value to set for the installTimeSettings property.
     */
    public void setInstallTimeSettings(@jakarta.annotation.Nullable final WindowsAutoUpdateCatalogAppInstallTimeSettings value) {
        this.backingStore.set("installTimeSettings", value);
    }
    /**
     * Sets the notificationType property value. Indicates which notifications the Intune management extension displays to the end user during the app installation and restart lifecycle on managed devices.
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final WindowsAutoUpdateCatalogAppNotificationType value) {
        this.backingStore.set("notificationType", value);
    }
    /**
     * Sets the restartSettings property value. Specifies the restart coordination behavior after the app is installedincluding how long to wait before restarting, when to show a countdown, and how long the user can snooze. When null, no restart coordination is applied (the device may still restart based on the app&apos;s deviceRestartBehavior setting). Note: the service accepts restart settings regardless of the app&apos;s deviceRestartBehavior value; the device agent determines which settings are actually honored at runtime.
     * @param value Value to set for the restartSettings property.
     */
    public void setRestartSettings(@jakarta.annotation.Nullable final WindowsAutoUpdateCatalogAppRestartSettings value) {
        this.backingStore.set("restartSettings", value);
    }
}
