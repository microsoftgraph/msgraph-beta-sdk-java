package com.microsoft.graph.beta.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperatorType implements ValuedEnum {
    GreaterOrEqual("greaterOrEqual"),
    Equal("equal"),
    Greater("greater"),
    Less("less"),
    LessOrEqual("lessOrEqual"),
    NotEqual("notEqual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperatorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperatorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "greaterOrEqual": return GreaterOrEqual;
            case "equal": return Equal;
            case "greater": return Greater;
            case "less": return Less;
            case "lessOrEqual": return LessOrEqual;
            case "notEqual": return NotEqual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
