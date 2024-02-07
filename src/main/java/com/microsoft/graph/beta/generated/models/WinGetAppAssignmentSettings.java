package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign a WinGet app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WinGetAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new WinGetAppAssignmentSettings and sets the default values.
     */
    public WinGetAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.winGetAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WinGetAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static WinGetAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WinGetAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installTimeSettings", (n) -> { this.setInstallTimeSettings(n.getObjectValue(WinGetAppInstallTimeSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getEnumValue(WinGetAppNotification::forValue)); });
        deserializerMap.put("restartSettings", (n) -> { this.setRestartSettings(n.getObjectValue(WinGetAppRestartSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @return a WinGetAppInstallTimeSettings
     */
    @jakarta.annotation.Nullable
    public WinGetAppInstallTimeSettings getInstallTimeSettings() {
        return this.backingStore.get("installTimeSettings");
    }
    /**
     * Gets the notifications property value. Contains value for notification status.
     * @return a WinGetAppNotification
     */
    @jakarta.annotation.Nullable
    public WinGetAppNotification getNotifications() {
        return this.backingStore.get("notifications");
    }
    /**
     * Gets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @return a WinGetAppRestartSettings
     */
    @jakarta.annotation.Nullable
    public WinGetAppRestartSettings getRestartSettings() {
        return this.backingStore.get("restartSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("installTimeSettings", this.getInstallTimeSettings());
        writer.writeEnumValue("notifications", this.getNotifications());
        writer.writeObjectValue("restartSettings", this.getRestartSettings());
    }
    /**
     * Sets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @param value Value to set for the installTimeSettings property.
     */
    public void setInstallTimeSettings(@jakarta.annotation.Nullable final WinGetAppInstallTimeSettings value) {
        this.backingStore.set("installTimeSettings", value);
    }
    /**
     * Sets the notifications property value. Contains value for notification status.
     * @param value Value to set for the notifications property.
     */
    public void setNotifications(@jakarta.annotation.Nullable final WinGetAppNotification value) {
        this.backingStore.set("notifications", value);
    }
    /**
     * Sets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @param value Value to set for the restartSettings property.
     */
    public void setRestartSettings(@jakarta.annotation.Nullable final WinGetAppRestartSettings value) {
        this.backingStore.set("restartSettings", value);
    }
}
