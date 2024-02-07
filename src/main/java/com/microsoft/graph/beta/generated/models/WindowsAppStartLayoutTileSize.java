package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The tile size of Windows app in the start layout.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAppStartLayoutTileSize implements ValuedEnum {
    /** Hidden. */
    Hidden("hidden"),
    /** Small 1x1. */
    Small("small"),
    /** Medium 2x2. */
    Medium("medium"),
    /** Wide 4x2. */
    Wide("wide"),
    /** Large 4x4. */
    Large("large");
    public final String value;
    WindowsAppStartLayoutTileSize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAppStartLayoutTileSize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hidden": return Hidden;
            case "small": return Small;
            case "medium": return Medium;
            case "wide": return Wide;
            case "large": return Large;
            default: return null;
        }
    }
}
