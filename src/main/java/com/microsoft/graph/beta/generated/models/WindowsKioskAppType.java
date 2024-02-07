package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of Windows kiosk app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsKioskAppType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Store App. */
    Store("store"),
    /** Desktop App. */
    Desktop("desktop"),
    /** Input by AUMID. */
    AumId("aumId");
    public final String value;
    WindowsKioskAppType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsKioskAppType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "store": return Store;
            case "desktop": return Desktop;
            case "aumId": return AumId;
            default: return null;
        }
    }
}
