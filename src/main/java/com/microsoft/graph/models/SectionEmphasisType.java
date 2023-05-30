package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SectionEmphasisType implements ValuedEnum {
    None("none"),
    Neutral("neutral"),
    Soft("soft"),
    Strong("strong"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionEmphasisType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SectionEmphasisType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "neutral": return Neutral;
            case "soft": return Soft;
            case "strong": return Strong;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
