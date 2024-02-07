package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for defenderSecurityCenterITContactDisplay
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderSecurityCenterITContactDisplayType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Display in app and in notifications */
    DisplayInAppAndInNotifications("displayInAppAndInNotifications"),
    /** Display only in app */
    DisplayOnlyInApp("displayOnlyInApp"),
    /** Display only in notifications */
    DisplayOnlyInNotifications("displayOnlyInNotifications");
    public final String value;
    DefenderSecurityCenterITContactDisplayType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderSecurityCenterITContactDisplayType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "displayInAppAndInNotifications": return DisplayInAppAndInNotifications;
            case "displayOnlyInApp": return DisplayOnlyInApp;
            case "displayOnlyInNotifications": return DisplayOnlyInNotifications;
            default: return null;
        }
    }
}
