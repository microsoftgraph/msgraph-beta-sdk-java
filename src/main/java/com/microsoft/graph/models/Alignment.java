package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Alignment implements ValuedEnum {
    Left("left"),
    Right("right"),
    Center("center");
    public final String value;
    Alignment(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Alignment forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "left": return Left;
            case "right": return Right;
            case "center": return Center;
            default: return null;
        }
    }
}
