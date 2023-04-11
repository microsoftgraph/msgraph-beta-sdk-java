package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ContentState implements ValuedEnum {
    Rest("rest"),
    Motion("motion"),
    Use("use");
    public final String value;
    ContentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContentState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rest": return Rest;
            case "motion": return Motion;
            case "use": return Use;
            default: return null;
        }
    }
}
