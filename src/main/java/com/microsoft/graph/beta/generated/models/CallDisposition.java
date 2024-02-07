package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CallDisposition implements ValuedEnum {
    Default("default"),
    SimultaneousRing("simultaneousRing"),
    Forward("forward");
    public final String value;
    CallDisposition(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CallDisposition forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "simultaneousRing": return SimultaneousRing;
            case "forward": return Forward;
            default: return null;
        }
    }
}
