package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Restricted apps state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestrictedAppsState implements ValuedEnum {
    /** Prohibited apps */
    ProhibitedApps("prohibitedApps"),
    /** Not approved apps */
    NotApprovedApps("notApprovedApps");
    public final String value;
    RestrictedAppsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestrictedAppsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prohibitedApps": return ProhibitedApps;
            case "notApprovedApps": return NotApprovedApps;
            default: return null;
        }
    }
}
