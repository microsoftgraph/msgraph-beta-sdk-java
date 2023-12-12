package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentMethod implements ValuedEnum {
    Standard("standard"),
    Privileged("privileged"),
    Auto("auto");
    public final String value;
    AssignmentMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "privileged": return Privileged;
            case "auto": return Auto;
            default: return null;
        }
    }
}
