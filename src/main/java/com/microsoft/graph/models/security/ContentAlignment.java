package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ContentAlignment implements ValuedEnum {
    Left("left"),
    Right("right"),
    Center("center");
    public final String value;
    ContentAlignment(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContentAlignment forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "left": return Left;
            case "right": return Right;
            case "center": return Center;
            default: return null;
        }
    }
}
