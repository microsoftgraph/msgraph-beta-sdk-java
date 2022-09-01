package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerKioskCustomizationStatusBar forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "notificationsAndSystemInfoEnabled": return NotificationsAndSystemInfoEnabled;
            case "systemInfoOnly": return SystemInfoOnly;
            default: return null;
        }
    }
}
