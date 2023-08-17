package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity provides descriptions of the declared methods, properties and relationships exposed by the kiosk resource.
 */
public class WindowsKioskConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.
     */
    private Boolean edgeKioskEnablePublicBrowsing;
    /**
     * Specify URLs that the kiosk browser is allowed to navigate to
     */
    private java.util.List<String> kioskBrowserBlockedUrlExceptions;
    /**
     * Specify URLs that the kiosk browsers should not navigate to
     */
    private java.util.List<String> kioskBrowserBlockedURLs;
    /**
     * Specify the default URL the browser should navigate to on launch.
     */
    private String kioskBrowserDefaultUrl;
    /**
     * Enable the kiosk browser's end session button. By default, the end session button is disabled.
     */
    private Boolean kioskBrowserEnableEndSessionButton;
    /**
     * Enable the kiosk browser's home button. By default, the home button is disabled.
     */
    private Boolean kioskBrowserEnableHomeButton;
    /**
     * Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.
     */
    private Boolean kioskBrowserEnableNavigationButtons;
    /**
     * Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440
     */
    private Integer kioskBrowserRestartOnIdleTimeInMinutes;
    /**
     * This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.
     */
    private java.util.List<WindowsKioskProfile> kioskProfiles;
    /**
     * force update schedule for Kiosk devices.
     */
    private WindowsKioskForceUpdateSchedule windowsKioskForceUpdateSchedule;
    /**
     * Instantiates a new windowsKioskConfiguration and sets the default values.
     */
    public WindowsKioskConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskConfiguration();
    }
    /**
     * Gets the edgeKioskEnablePublicBrowsing property value. Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeKioskEnablePublicBrowsing() {
        return this.edgeKioskEnablePublicBrowsing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("edgeKioskEnablePublicBrowsing", (n) -> { this.setEdgeKioskEnablePublicBrowsing(n.getBooleanValue()); });
        deserializerMap.put("kioskBrowserBlockedUrlExceptions", (n) -> { this.setKioskBrowserBlockedUrlExceptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kioskBrowserBlockedURLs", (n) -> { this.setKioskBrowserBlockedURLs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kioskBrowserDefaultUrl", (n) -> { this.setKioskBrowserDefaultUrl(n.getStringValue()); });
        deserializerMap.put("kioskBrowserEnableEndSessionButton", (n) -> { this.setKioskBrowserEnableEndSessionButton(n.getBooleanValue()); });
        deserializerMap.put("kioskBrowserEnableHomeButton", (n) -> { this.setKioskBrowserEnableHomeButton(n.getBooleanValue()); });
        deserializerMap.put("kioskBrowserEnableNavigationButtons", (n) -> { this.setKioskBrowserEnableNavigationButtons(n.getBooleanValue()); });
        deserializerMap.put("kioskBrowserRestartOnIdleTimeInMinutes", (n) -> { this.setKioskBrowserRestartOnIdleTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("kioskProfiles", (n) -> { this.setKioskProfiles(n.getCollectionOfObjectValues(WindowsKioskProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsKioskForceUpdateSchedule", (n) -> { this.setWindowsKioskForceUpdateSchedule(n.getObjectValue(WindowsKioskForceUpdateSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the kioskBrowserBlockedUrlExceptions property value. Specify URLs that the kiosk browser is allowed to navigate to
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKioskBrowserBlockedUrlExceptions() {
        return this.kioskBrowserBlockedUrlExceptions;
    }
    /**
     * Gets the kioskBrowserBlockedURLs property value. Specify URLs that the kiosk browsers should not navigate to
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKioskBrowserBlockedURLs() {
        return this.kioskBrowserBlockedURLs;
    }
    /**
     * Gets the kioskBrowserDefaultUrl property value. Specify the default URL the browser should navigate to on launch.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKioskBrowserDefaultUrl() {
        return this.kioskBrowserDefaultUrl;
    }
    /**
     * Gets the kioskBrowserEnableEndSessionButton property value. Enable the kiosk browser's end session button. By default, the end session button is disabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskBrowserEnableEndSessionButton() {
        return this.kioskBrowserEnableEndSessionButton;
    }
    /**
     * Gets the kioskBrowserEnableHomeButton property value. Enable the kiosk browser's home button. By default, the home button is disabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskBrowserEnableHomeButton() {
        return this.kioskBrowserEnableHomeButton;
    }
    /**
     * Gets the kioskBrowserEnableNavigationButtons property value. Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskBrowserEnableNavigationButtons() {
        return this.kioskBrowserEnableNavigationButtons;
    }
    /**
     * Gets the kioskBrowserRestartOnIdleTimeInMinutes property value. Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getKioskBrowserRestartOnIdleTimeInMinutes() {
        return this.kioskBrowserRestartOnIdleTimeInMinutes;
    }
    /**
     * Gets the kioskProfiles property value. This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.
     * @return a windowsKioskProfile
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsKioskProfile> getKioskProfiles() {
        return this.kioskProfiles;
    }
    /**
     * Gets the windowsKioskForceUpdateSchedule property value. force update schedule for Kiosk devices.
     * @return a windowsKioskForceUpdateSchedule
     */
    @jakarta.annotation.Nullable
    public WindowsKioskForceUpdateSchedule getWindowsKioskForceUpdateSchedule() {
        return this.windowsKioskForceUpdateSchedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("edgeKioskEnablePublicBrowsing", this.getEdgeKioskEnablePublicBrowsing());
        writer.writeCollectionOfPrimitiveValues("kioskBrowserBlockedUrlExceptions", this.getKioskBrowserBlockedUrlExceptions());
        writer.writeCollectionOfPrimitiveValues("kioskBrowserBlockedURLs", this.getKioskBrowserBlockedURLs());
        writer.writeStringValue("kioskBrowserDefaultUrl", this.getKioskBrowserDefaultUrl());
        writer.writeBooleanValue("kioskBrowserEnableEndSessionButton", this.getKioskBrowserEnableEndSessionButton());
        writer.writeBooleanValue("kioskBrowserEnableHomeButton", this.getKioskBrowserEnableHomeButton());
        writer.writeBooleanValue("kioskBrowserEnableNavigationButtons", this.getKioskBrowserEnableNavigationButtons());
        writer.writeIntegerValue("kioskBrowserRestartOnIdleTimeInMinutes", this.getKioskBrowserRestartOnIdleTimeInMinutes());
        writer.writeCollectionOfObjectValues("kioskProfiles", this.getKioskProfiles());
        writer.writeObjectValue("windowsKioskForceUpdateSchedule", this.getWindowsKioskForceUpdateSchedule());
    }
    /**
     * Sets the edgeKioskEnablePublicBrowsing property value. Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.
     * @param value Value to set for the edgeKioskEnablePublicBrowsing property.
     */
    public void setEdgeKioskEnablePublicBrowsing(@jakarta.annotation.Nullable final Boolean value) {
        this.edgeKioskEnablePublicBrowsing = value;
    }
    /**
     * Sets the kioskBrowserBlockedUrlExceptions property value. Specify URLs that the kiosk browser is allowed to navigate to
     * @param value Value to set for the kioskBrowserBlockedUrlExceptions property.
     */
    public void setKioskBrowserBlockedUrlExceptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.kioskBrowserBlockedUrlExceptions = value;
    }
    /**
     * Sets the kioskBrowserBlockedURLs property value. Specify URLs that the kiosk browsers should not navigate to
     * @param value Value to set for the kioskBrowserBlockedURLs property.
     */
    public void setKioskBrowserBlockedURLs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.kioskBrowserBlockedURLs = value;
    }
    /**
     * Sets the kioskBrowserDefaultUrl property value. Specify the default URL the browser should navigate to on launch.
     * @param value Value to set for the kioskBrowserDefaultUrl property.
     */
    public void setKioskBrowserDefaultUrl(@jakarta.annotation.Nullable final String value) {
        this.kioskBrowserDefaultUrl = value;
    }
    /**
     * Sets the kioskBrowserEnableEndSessionButton property value. Enable the kiosk browser's end session button. By default, the end session button is disabled.
     * @param value Value to set for the kioskBrowserEnableEndSessionButton property.
     */
    public void setKioskBrowserEnableEndSessionButton(@jakarta.annotation.Nullable final Boolean value) {
        this.kioskBrowserEnableEndSessionButton = value;
    }
    /**
     * Sets the kioskBrowserEnableHomeButton property value. Enable the kiosk browser's home button. By default, the home button is disabled.
     * @param value Value to set for the kioskBrowserEnableHomeButton property.
     */
    public void setKioskBrowserEnableHomeButton(@jakarta.annotation.Nullable final Boolean value) {
        this.kioskBrowserEnableHomeButton = value;
    }
    /**
     * Sets the kioskBrowserEnableNavigationButtons property value. Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.
     * @param value Value to set for the kioskBrowserEnableNavigationButtons property.
     */
    public void setKioskBrowserEnableNavigationButtons(@jakarta.annotation.Nullable final Boolean value) {
        this.kioskBrowserEnableNavigationButtons = value;
    }
    /**
     * Sets the kioskBrowserRestartOnIdleTimeInMinutes property value. Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440
     * @param value Value to set for the kioskBrowserRestartOnIdleTimeInMinutes property.
     */
    public void setKioskBrowserRestartOnIdleTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.kioskBrowserRestartOnIdleTimeInMinutes = value;
    }
    /**
     * Sets the kioskProfiles property value. This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.
     * @param value Value to set for the kioskProfiles property.
     */
    public void setKioskProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsKioskProfile> value) {
        this.kioskProfiles = value;
    }
    /**
     * Sets the windowsKioskForceUpdateSchedule property value. force update schedule for Kiosk devices.
     * @param value Value to set for the windowsKioskForceUpdateSchedule property.
     */
    public void setWindowsKioskForceUpdateSchedule(@jakarta.annotation.Nullable final WindowsKioskForceUpdateSchedule value) {
        this.windowsKioskForceUpdateSchedule = value;
    }
}
