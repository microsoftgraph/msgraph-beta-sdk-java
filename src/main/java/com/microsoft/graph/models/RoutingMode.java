package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RoutingMode implements ValuedEnum {
    OneToOne("oneToOne"),
    Multicast("multicast");
    public final String value;
    RoutingMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoutingMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneToOne": return OneToOne;
            case "multicast": return Multicast;
            default: return null;
        }
    }
}
