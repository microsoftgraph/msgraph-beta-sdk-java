package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationAppEvaluation implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAppEvaluation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationAppEvaluation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
