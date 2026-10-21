package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcVmPerformanceMetricsTimeRange implements ValuedEnum {
    Last2Hours("last2Hours"),
    Last4Hours("last4Hours"),
    Last12Hours("last12Hours"),
    Last24Hours("last24Hours"),
    Last48Hours("last48Hours"),
    Last4Days("last4Days"),
    Last7Days("last7Days"),
    Last14Days("last14Days"),
    Last28Days("last28Days"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcVmPerformanceMetricsTimeRange(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcVmPerformanceMetricsTimeRange forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "last2Hours": return Last2Hours;
            case "last4Hours": return Last4Hours;
            case "last12Hours": return Last12Hours;
            case "last24Hours": return Last24Hours;
            case "last48Hours": return Last48Hours;
            case "last4Days": return Last4Days;
            case "last7Days": return Last7Days;
            case "last14Days": return Last14Days;
            case "last28Days": return Last28Days;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
