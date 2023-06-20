package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ContentFormat implements ValuedEnum {
    DefaultEscaped("default"),
    Email("email");
    public final String value;
    ContentFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContentFormat forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return DefaultEscaped;
            case "email": return Email;
            default: return null;
        }
    }
}
