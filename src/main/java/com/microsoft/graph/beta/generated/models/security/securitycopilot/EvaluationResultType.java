package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationResultType implements ValuedEnum {
    Unknown("unknown"),
    Success("success"),
    Error("error"),
    NeedAdditionalClaims("needAdditionalClaims"),
    Rejected("rejected"),
    TimedOut("timedOut"),
    CapacityExceeded("capacityExceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvaluationResultType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationResultType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "error": return Error;
            case "needAdditionalClaims": return NeedAdditionalClaims;
            case "rejected": return Rejected;
            case "timedOut": return TimedOut;
            case "capacityExceeded": return CapacityExceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
