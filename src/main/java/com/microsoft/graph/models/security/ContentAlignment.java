package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentAlignment implements ValuedEnum {
    Left("left"),
    Right("right"),
    Center("center");
    public final String value;
    ContentAlignment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentAlignment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "left": return Left;
            case "right": return Right;
            case "center": return Center;
            default: return null;
        }
    }
}
