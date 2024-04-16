package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the supported oems of hardware configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HardwareConfigurationFormat implements ValuedEnum {
    /** Dell */
    Dell("dell"),
    /** Surface */
    Surface("surface"),
    /** Surface dock */
    SurfaceDock("surfaceDock");
    public final String value;
    HardwareConfigurationFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HardwareConfigurationFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dell": return Dell;
            case "surface": return Surface;
            case "surfaceDock": return SurfaceDock;
            default: return null;
        }
    }
}
