package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MfaFailureReasonCode implements ValuedEnum {
    MfaIncomplete("mfaIncomplete"),
    MfaDenied("mfaDenied"),
    SystemFailure("systemFailure"),
    BadRequest("badRequest"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MfaFailureReasonCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MfaFailureReasonCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mfaIncomplete": return MfaIncomplete;
            case "mfaDenied": return MfaDenied;
            case "systemFailure": return SystemFailure;
            case "badRequest": return BadRequest;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
