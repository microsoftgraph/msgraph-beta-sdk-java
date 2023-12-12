package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Kiosk Mode managed home screen virtual home button type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerVirtualHomeButtonType implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Swipe-up for home button. */
    SwipeUp("swipeUp"),
    /** Floating home button. */
    Floating("floating");
    public final String value;
    AndroidDeviceOwnerVirtualHomeButtonType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerVirtualHomeButtonType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "swipeUp": return SwipeUp;
            case "floating": return Floating;
            default: return null;
        }
    }
}
