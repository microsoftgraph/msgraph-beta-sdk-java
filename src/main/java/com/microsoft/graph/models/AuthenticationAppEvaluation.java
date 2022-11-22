package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AuthenticationAppEvaluation implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAppEvaluation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationAppEvaluation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
