package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PageOrientation implements ValuedEnum {
    Horizontal("horizontal"),
    Diagonal("diagonal");
    public final String value;
    PageOrientation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PageOrientation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "horizontal": return Horizontal;
            case "diagonal": return Diagonal;
            default: return null;
        }
    }
}
