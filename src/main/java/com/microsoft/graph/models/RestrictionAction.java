package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RestrictionAction implements ValuedEnum {
    Warn("warn"),
    Audit("audit"),
    Block("block");
    public final String value;
    RestrictionAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RestrictionAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "warn": return Warn;
            case "audit": return Audit;
            case "block": return Block;
            default: return null;
        }
    }
}
