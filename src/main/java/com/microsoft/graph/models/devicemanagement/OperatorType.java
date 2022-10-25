package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OperatorType forValue(@javax.annotation.Nonnull final String searchValue) {
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
