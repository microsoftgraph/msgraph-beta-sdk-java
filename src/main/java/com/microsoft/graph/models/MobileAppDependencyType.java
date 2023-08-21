package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the dependency type associated with a relationship between two mobile apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppDependencyType implements ValuedEnum {
    /** Indicates that the child app should be detected before installing the parent app. */
    Detect("detect"),
    /** Indicates that the child app should be installed before installing the parent app. */
    AutoInstall("autoInstall");
    public final String value;
    MobileAppDependencyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppDependencyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "detect": return Detect;
            case "autoInstall": return AutoInstall;
            default: return null;
        }
    }
}
