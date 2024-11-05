package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NetworkTrafficOperationStatus implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkTrafficOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NetworkTrafficOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
