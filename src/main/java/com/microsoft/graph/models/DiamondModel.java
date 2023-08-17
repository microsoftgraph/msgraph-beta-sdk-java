package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DiamondModel implements ValuedEnum {
    Unknown("unknown"),
    Adversary("adversary"),
    Capability("capability"),
    Infrastructure("infrastructure"),
    Victim("victim"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DiamondModel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DiamondModel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "adversary": return Adversary;
            case "capability": return Capability;
            case "infrastructure": return Infrastructure;
            case "victim": return Victim;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
