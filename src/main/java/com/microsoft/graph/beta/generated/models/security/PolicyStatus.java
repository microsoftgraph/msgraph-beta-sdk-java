package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyStatus implements ValuedEnum {
    Pending("pending"),
    Error("error"),
    Success("success"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "error": return Error;
            case "success": return Success;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
