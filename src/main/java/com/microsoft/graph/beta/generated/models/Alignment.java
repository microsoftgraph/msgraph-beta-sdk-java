package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Alignment implements ValuedEnum {
    Left("left"),
    Right("right"),
    Center("center");
    public final String value;
    Alignment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Alignment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "left": return Left;
            case "right": return Right;
            case "center": return Center;
            default: return null;
        }
    }
}
