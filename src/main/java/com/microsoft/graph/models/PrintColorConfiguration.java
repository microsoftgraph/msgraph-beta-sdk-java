package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum PrintColorConfiguration implements ValuedEnum {
    BlackAndWhite("blackAndWhite"),
    Grayscale("grayscale"),
    Color("color"),
    Auto("auto");
    public final String value;
    PrintColorConfiguration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintColorConfiguration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blackAndWhite": return BlackAndWhite;
            case "grayscale": return Grayscale;
            case "color": return Color;
            case "auto": return Auto;
            default: return null;
        }
    }
}
