package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomFieldRollupType implements ValuedEnum {
    NoRollup("noRollup"),
    Max("max"),
    Min("min"),
    Sum("sum"),
    Average("average"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomFieldRollupType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomFieldRollupType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noRollup": return NoRollup;
            case "max": return Max;
            case "min": return Min;
            case "sum": return Sum;
            case "average": return Average;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
