package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SimulationContentStatus implements ValuedEnum {
    Unknown("unknown"),
    Draft("draft"),
    Ready("ready"),
    Archive("archive"),
    Delete("delete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationContentStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SimulationContentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "draft": return Draft;
            case "ready": return Ready;
            case "archive": return Archive;
            case "delete": return Delete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
