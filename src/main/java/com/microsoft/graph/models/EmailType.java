package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EmailType implements ValuedEnum {
    Unknown("unknown"),
    Work("work"),
    Personal("personal"),
    Main("main"),
    Other("other");
    public final String value;
    EmailType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmailType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "work": return Work;
            case "personal": return Personal;
            case "main": return Main;
            case "other": return Other;
            default: return null;
        }
    }
}
