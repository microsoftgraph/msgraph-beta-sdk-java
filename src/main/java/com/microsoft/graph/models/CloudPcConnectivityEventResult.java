package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CloudPcConnectivityEventResult implements ValuedEnum {
    Unknown("unknown"),
    Success("success"),
    Failure("failure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcConnectivityEventResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcConnectivityEventResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "failure": return Failure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
