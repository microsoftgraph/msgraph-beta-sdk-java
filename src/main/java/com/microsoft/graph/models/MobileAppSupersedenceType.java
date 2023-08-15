package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the supersedence type associated with a relationship between two mobile apps.
 */
public enum MobileAppSupersedenceType implements ValuedEnum {
    /** Indicates that the child app should be updated by the internal logic of the parent app. */
    Update("update"),
    /** Indicates that the child app should be uninstalled before installing the parent app. */
    Replace("replace");
    public final String value;
    MobileAppSupersedenceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppSupersedenceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "update": return Update;
            case "replace": return Replace;
            default: return null;
        }
    }
}
