package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ImportanceScore implements ValuedEnum {
    Low("low"),
    Medium("medium"),
    High("high"),
    VeryHigh("veryHigh"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ImportanceScore(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ImportanceScore forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "veryHigh": return VeryHigh;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
