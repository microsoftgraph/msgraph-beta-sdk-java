package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CallDisposition implements ValuedEnum {
    DefaultEscaped("default"),
    SimultaneousRing("simultaneousRing"),
    Forward("forward");
    public final String value;
    CallDisposition(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CallDisposition forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return DefaultEscaped;
            case "simultaneousRing": return SimultaneousRing;
            case "forward": return Forward;
            default: return null;
        }
    }
}
