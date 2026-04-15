package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates which notifications the Intune management extension displays to the end user during the app installation and restart lifecycle on managed devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutoUpdateCatalogAppNotificationType implements ValuedEnum {
    /** Indicates that all notifications related to app installation and restart are displayed to the end user. */
    ShowAll("showAll"),
    /** Indicates that only restart notifications are displayed to the end user; other installation progress notifications are suppressed. */
    ShowReboot("showReboot"),
    /** Indicates that all notifications related to app installation and restart are suppressed. The end user is not informed of the installation or pending restarts. */
    HideAll("hideAll"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutoUpdateCatalogAppNotificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutoUpdateCatalogAppNotificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "showAll": return ShowAll;
            case "showReboot": return ShowReboot;
            case "hideAll": return HideAll;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
