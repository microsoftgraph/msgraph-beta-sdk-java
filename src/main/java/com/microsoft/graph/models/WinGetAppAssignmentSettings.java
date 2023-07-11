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
public class WinGetAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * The install time settings to apply for this app assignment.
     */
    private WinGetAppInstallTimeSettings installTimeSettings;
    /**
     * Contains value for notification status.
     */
    private WinGetAppNotification notifications;
    /**
     * The reboot settings to apply for this app assignment.
     */
    private WinGetAppRestartSettings restartSettings;
    /**
     * Instantiates a new winGetAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WinGetAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.winGetAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a winGetAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static WinGetAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WinGetAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installTimeSettings", (n) -> { this.setInstallTimeSettings(n.getObjectValue(WinGetAppInstallTimeSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getEnumValue(WinGetAppNotification.class)); });
        deserializerMap.put("restartSettings", (n) -> { this.setRestartSettings(n.getObjectValue(WinGetAppRestartSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @return a winGetAppInstallTimeSettings
     */
    @javax.annotation.Nullable
    public WinGetAppInstallTimeSettings getInstallTimeSettings() {
        return this.installTimeSettings;
    }
    /**
     * Gets the notifications property value. Contains value for notification status.
     * @return a winGetAppNotification
     */
    @javax.annotation.Nullable
    public WinGetAppNotification getNotifications() {
        return this.notifications;
    }
    /**
     * Gets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @return a winGetAppRestartSettings
     */
    @javax.annotation.Nullable
    public WinGetAppRestartSettings getRestartSettings() {
        return this.restartSettings;
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
        writer.writeObjectValue("installTimeSettings", this.getInstallTimeSettings());
        writer.writeEnumValue("notifications", this.getNotifications());
        writer.writeObjectValue("restartSettings", this.getRestartSettings());
    }
    /**
     * Sets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @param value Value to set for the installTimeSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallTimeSettings(@javax.annotation.Nullable final WinGetAppInstallTimeSettings value) {
        this.installTimeSettings = value;
    }
    /**
     * Sets the notifications property value. Contains value for notification status.
     * @param value Value to set for the notifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotifications(@javax.annotation.Nullable final WinGetAppNotification value) {
        this.notifications = value;
    }
    /**
     * Sets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @param value Value to set for the restartSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartSettings(@javax.annotation.Nullable final WinGetAppRestartSettings value) {
        this.restartSettings = value;
    }
}
