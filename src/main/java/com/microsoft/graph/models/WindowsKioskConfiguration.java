package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskConfiguration extends DeviceConfiguration implements Parsable {
    /** Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false. */
    private Boolean _edgeKioskEnablePublicBrowsing;
    /** Specify URLs that the kiosk browser is allowed to navigate to */
    private java.util.List<String> _kioskBrowserBlockedUrlExceptions;
    /** Specify URLs that the kiosk browsers should not navigate to */
    private java.util.List<String> _kioskBrowserBlockedURLs;
    /** Specify the default URL the browser should navigate to on launch. */
    private String _kioskBrowserDefaultUrl;
    /** Enable the kiosk browser's end session button. By default, the end session button is disabled. */
    private Boolean _kioskBrowserEnableEndSessionButton;
    /** Enable the kiosk browser's home button. By default, the home button is disabled. */
    private Boolean _kioskBrowserEnableHomeButton;
    /** Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled. */
    private Boolean _kioskBrowserEnableNavigationButtons;
    /** Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440 */
    private Integer _kioskBrowserRestartOnIdleTimeInMinutes;
    /** This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements. */
    private java.util.List<WindowsKioskProfile> _kioskProfiles;
    /** force update schedule for Kiosk devices. */
    private WindowsKioskForceUpdateSchedule _windowsKioskForceUpdateSchedule;
    /**
     * Instantiates a new WindowsKioskConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsKioskConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskConfiguration();
    }
    /**
     * Gets the edgeKioskEnablePublicBrowsing property value. Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeKioskEnablePublicBrowsing() {
        return this._edgeKioskEnablePublicBrowsing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("edgeKioskEnablePublicBrowsing", (n) -> { currentObject.setEdgeKioskEnablePublicBrowsing(n.getBooleanValue()); });
            this.put("kioskBrowserBlockedUrlExceptions", (n) -> { currentObject.setKioskBrowserBlockedUrlExceptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("kioskBrowserBlockedURLs", (n) -> { currentObject.setKioskBrowserBlockedURLs(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("kioskBrowserDefaultUrl", (n) -> { currentObject.setKioskBrowserDefaultUrl(n.getStringValue()); });
            this.put("kioskBrowserEnableEndSessionButton", (n) -> { currentObject.setKioskBrowserEnableEndSessionButton(n.getBooleanValue()); });
            this.put("kioskBrowserEnableHomeButton", (n) -> { currentObject.setKioskBrowserEnableHomeButton(n.getBooleanValue()); });
            this.put("kioskBrowserEnableNavigationButtons", (n) -> { currentObject.setKioskBrowserEnableNavigationButtons(n.getBooleanValue()); });
            this.put("kioskBrowserRestartOnIdleTimeInMinutes", (n) -> { currentObject.setKioskBrowserRestartOnIdleTimeInMinutes(n.getIntegerValue()); });
            this.put("kioskProfiles", (n) -> { currentObject.setKioskProfiles(n.getCollectionOfObjectValues(WindowsKioskProfile::createFromDiscriminatorValue)); });
            this.put("windowsKioskForceUpdateSchedule", (n) -> { currentObject.setWindowsKioskForceUpdateSchedule(n.getObjectValue(WindowsKioskForceUpdateSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the kioskBrowserBlockedUrlExceptions property value. Specify URLs that the kiosk browser is allowed to navigate to
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKioskBrowserBlockedUrlExceptions() {
        return this._kioskBrowserBlockedUrlExceptions;
    }
    /**
     * Gets the kioskBrowserBlockedURLs property value. Specify URLs that the kiosk browsers should not navigate to
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKioskBrowserBlockedURLs() {
        return this._kioskBrowserBlockedURLs;
    }
    /**
     * Gets the kioskBrowserDefaultUrl property value. Specify the default URL the browser should navigate to on launch.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskBrowserDefaultUrl() {
        return this._kioskBrowserDefaultUrl;
    }
    /**
     * Gets the kioskBrowserEnableEndSessionButton property value. Enable the kiosk browser's end session button. By default, the end session button is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskBrowserEnableEndSessionButton() {
        return this._kioskBrowserEnableEndSessionButton;
    }
    /**
     * Gets the kioskBrowserEnableHomeButton property value. Enable the kiosk browser's home button. By default, the home button is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskBrowserEnableHomeButton() {
        return this._kioskBrowserEnableHomeButton;
    }
    /**
     * Gets the kioskBrowserEnableNavigationButtons property value. Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskBrowserEnableNavigationButtons() {
        return this._kioskBrowserEnableNavigationButtons;
    }
    /**
     * Gets the kioskBrowserRestartOnIdleTimeInMinutes property value. Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskBrowserRestartOnIdleTimeInMinutes() {
        return this._kioskBrowserRestartOnIdleTimeInMinutes;
    }
    /**
     * Gets the kioskProfiles property value. This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.
     * @return a windowsKioskProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsKioskProfile> getKioskProfiles() {
        return this._kioskProfiles;
    }
    /**
     * Gets the windowsKioskForceUpdateSchedule property value. force update schedule for Kiosk devices.
     * @return a windowsKioskForceUpdateSchedule
     */
    @javax.annotation.Nullable
    public WindowsKioskForceUpdateSchedule getWindowsKioskForceUpdateSchedule() {
        return this._windowsKioskForceUpdateSchedule;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKioskEnablePublicBrowsing(@javax.annotation.Nullable final Boolean value) {
        this._edgeKioskEnablePublicBrowsing = value;
    }
    /**
     * Sets the kioskBrowserBlockedUrlExceptions property value. Specify URLs that the kiosk browser is allowed to navigate to
     * @param value Value to set for the kioskBrowserBlockedUrlExceptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserBlockedUrlExceptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._kioskBrowserBlockedUrlExceptions = value;
    }
    /**
     * Sets the kioskBrowserBlockedURLs property value. Specify URLs that the kiosk browsers should not navigate to
     * @param value Value to set for the kioskBrowserBlockedURLs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserBlockedURLs(@javax.annotation.Nullable final java.util.List<String> value) {
        this._kioskBrowserBlockedURLs = value;
    }
    /**
     * Sets the kioskBrowserDefaultUrl property value. Specify the default URL the browser should navigate to on launch.
     * @param value Value to set for the kioskBrowserDefaultUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserDefaultUrl(@javax.annotation.Nullable final String value) {
        this._kioskBrowserDefaultUrl = value;
    }
    /**
     * Sets the kioskBrowserEnableEndSessionButton property value. Enable the kiosk browser's end session button. By default, the end session button is disabled.
     * @param value Value to set for the kioskBrowserEnableEndSessionButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserEnableEndSessionButton(@javax.annotation.Nullable final Boolean value) {
        this._kioskBrowserEnableEndSessionButton = value;
    }
    /**
     * Sets the kioskBrowserEnableHomeButton property value. Enable the kiosk browser's home button. By default, the home button is disabled.
     * @param value Value to set for the kioskBrowserEnableHomeButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserEnableHomeButton(@javax.annotation.Nullable final Boolean value) {
        this._kioskBrowserEnableHomeButton = value;
    }
    /**
     * Sets the kioskBrowserEnableNavigationButtons property value. Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.
     * @param value Value to set for the kioskBrowserEnableNavigationButtons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserEnableNavigationButtons(@javax.annotation.Nullable final Boolean value) {
        this._kioskBrowserEnableNavigationButtons = value;
    }
    /**
     * Sets the kioskBrowserRestartOnIdleTimeInMinutes property value. Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440
     * @param value Value to set for the kioskBrowserRestartOnIdleTimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskBrowserRestartOnIdleTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._kioskBrowserRestartOnIdleTimeInMinutes = value;
    }
    /**
     * Sets the kioskProfiles property value. This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.
     * @param value Value to set for the kioskProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskProfiles(@javax.annotation.Nullable final java.util.List<WindowsKioskProfile> value) {
        this._kioskProfiles = value;
    }
    /**
     * Sets the windowsKioskForceUpdateSchedule property value. force update schedule for Kiosk devices.
     * @param value Value to set for the windowsKioskForceUpdateSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsKioskForceUpdateSchedule(@javax.annotation.Nullable final WindowsKioskForceUpdateSchedule value) {
        this._windowsKioskForceUpdateSchedule = value;
    }
}
