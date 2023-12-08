package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentState implements ValuedEnum {
    Rest("rest"),
    Motion("motion"),
    Use("use");
    public final String value;
    ContentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rest": return Rest;
            case "motion": return Motion;
            case "use": return Use;
            default: return null;
        }
    }
}
