package com.microsoft.graph.beta.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImportanceScore forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
