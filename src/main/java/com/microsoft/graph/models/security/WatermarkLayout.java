package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WatermarkLayout implements ValuedEnum {
    Horizontal("horizontal"),
    Diagonal("diagonal");
    public final String value;
    WatermarkLayout(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WatermarkLayout forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "horizontal": return Horizontal;
            case "diagonal": return Diagonal;
            default: return null;
        }
    }
}
