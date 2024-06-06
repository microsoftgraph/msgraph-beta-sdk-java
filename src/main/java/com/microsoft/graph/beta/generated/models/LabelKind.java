package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LabelKind implements ValuedEnum {
    All("all"),
    Enumerated("enumerated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LabelKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LabelKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "enumerated": return Enumerated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
