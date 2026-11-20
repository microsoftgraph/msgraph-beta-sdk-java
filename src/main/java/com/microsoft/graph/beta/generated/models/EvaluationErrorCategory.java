package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationErrorCategory implements ValuedEnum {
    Unknown("unknown"),
    SystemLimit("systemLimit"),
    SystemError("systemError"),
    EnforcementError("enforcementError"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvaluationErrorCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationErrorCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "systemLimit": return SystemLimit;
            case "systemError": return SystemError;
            case "enforcementError": return EnforcementError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
