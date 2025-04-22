package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSnapshotHealthCheckStatus implements ValuedEnum {
    Unknown("unknown"),
    Healthy("healthy"),
    Unhealthy("unhealthy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSnapshotHealthCheckStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSnapshotHealthCheckStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "healthy": return Healthy;
            case "unhealthy": return Unhealthy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
