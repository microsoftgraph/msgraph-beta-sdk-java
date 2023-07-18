package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Restricted apps state
 */
public enum RestrictedAppsState implements ValuedEnum {
    /** Prohibited apps */
    ProhibitedApps("prohibitedApps"),
    /** Not approved apps */
    NotApprovedApps("notApprovedApps");
    public final String value;
    RestrictedAppsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RestrictedAppsState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prohibitedApps": return ProhibitedApps;
            case "notApprovedApps": return NotApprovedApps;
            default: return null;
        }
    }
}
