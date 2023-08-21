package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Priority implements ValuedEnum {
    None("None"),
    High("High"),
    Low("Low");
    public final String value;
    Priority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Priority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "High": return High;
            case "Low": return Low;
            default: return null;
        }
    }
}
