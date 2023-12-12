package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing possible values for kiosk customization system navigation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerKioskCustomizationStatusBar implements ValuedEnum {
    /** Not configured; this value defaults to STATUS_BAR_UNSPECIFIED. */
    NotConfigured("notConfigured"),
    /** System info and notifications are shown on the status bar in kiosk mode. */
    NotificationsAndSystemInfoEnabled("notificationsAndSystemInfoEnabled"),
    /** Only system info is shown on the status bar in kiosk mode. */
    SystemInfoOnly("systemInfoOnly");
    public final String value;
    AndroidDeviceOwnerKioskCustomizationStatusBar(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerKioskCustomizationStatusBar forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "notificationsAndSystemInfoEnabled": return NotificationsAndSystemInfoEnabled;
            case "systemInfoOnly": return SystemInfoOnly;
            default: return null;
        }
    }
}
