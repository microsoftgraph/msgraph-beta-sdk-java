package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Edge kiosk type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsEdgeKioskType implements ValuedEnum {
    /** public-browsing */
    PublicBrowsing("publicBrowsing"),
    /** fullscreen */
    FullScreen("fullScreen");
    public final String value;
    WindowsEdgeKioskType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsEdgeKioskType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "publicBrowsing": return PublicBrowsing;
            case "fullScreen": return FullScreen;
            default: return null;
        }
    }
}
