package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android profile applicability
 */
public enum AndroidProfileApplicability implements ValuedEnum {
    Default("default"),
    AndroidWorkProfile("androidWorkProfile"),
    AndroidDeviceOwner("androidDeviceOwner");
    public final String value;
    AndroidProfileApplicability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidProfileApplicability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "androidWorkProfile": return AndroidWorkProfile;
            case "androidDeviceOwner": return AndroidDeviceOwner;
            default: return null;
        }
    }
}
