package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum CloudPcExternalPartnerStatus implements ValuedEnum {
    NotAvailable("notAvailable"),
    Available("available"),
    Healthy("healthy"),
    Unhealthy("unhealthy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcExternalPartnerStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcExternalPartnerStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAvailable": return NotAvailable;
            case "available": return Available;
            case "healthy": return Healthy;
            case "unhealthy": return Unhealthy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
