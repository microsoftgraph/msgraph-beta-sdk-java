package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidRequiredPasswordComplexity implements ValuedEnum {
    /** Device default value, no password. */
    None("none"),
    /** The required password complexity on the device is of type low as defined by the Android documentation. */
    Low("low"),
    /** The required password complexity on the device is of type medium as defined by the Android documentation. */
    Medium("medium"),
    /** The required password complexity on the device is of type high as defined by the Android documentation. */
    High("high");
    public final String value;
    AndroidRequiredPasswordComplexity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidRequiredPasswordComplexity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
