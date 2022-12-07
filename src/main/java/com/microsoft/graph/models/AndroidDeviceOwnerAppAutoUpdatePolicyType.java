package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidDeviceOwnerAppAutoUpdatePolicyType implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** The user can control auto-updates. */
    UserChoice("userChoice"),
    /** Apps are never auto-updated. */
    Never("never"),
    /** Apps are auto-updated over Wi-Fi only. */
    WiFiOnly("wiFiOnly"),
    /** Apps are auto-updated at any time. Data charges may apply. */
    Always("always");
    public final String value;
    AndroidDeviceOwnerAppAutoUpdatePolicyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerAppAutoUpdatePolicyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "userChoice": return UserChoice;
            case "never": return Never;
            case "wiFiOnly": return WiFiOnly;
            case "always": return Always;
            default: return null;
        }
    }
}
