package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationFailureReasonCode implements ValuedEnum {
    Incomplete("incomplete"),
    Denied("denied"),
    SystemFailure("systemFailure"),
    BadRequest("badRequest"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue"),
    UserError("userError"),
    ConfigError("configError");
    public final String value;
    AuthenticationFailureReasonCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationFailureReasonCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "incomplete": return Incomplete;
            case "denied": return Denied;
            case "systemFailure": return SystemFailure;
            case "badRequest": return BadRequest;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            case "userError": return UserError;
            case "configError": return ConfigError;
            default: return null;
        }
    }
}
