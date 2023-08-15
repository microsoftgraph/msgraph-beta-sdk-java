package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows 10 Application type.
 */
public enum Windows10AppType implements ValuedEnum {
    /** Desktop. */
    Desktop("desktop"),
    /** Universal. */
    Universal("universal");
    public final String value;
    Windows10AppType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10AppType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "desktop": return Desktop;
            case "universal": return Universal;
            default: return null;
        }
    }
}
