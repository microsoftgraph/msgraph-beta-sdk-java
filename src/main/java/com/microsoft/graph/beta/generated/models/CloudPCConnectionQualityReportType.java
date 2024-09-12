package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPCConnectionQualityReportType implements ValuedEnum {
    RemoteConnectionQualityReport("remoteConnectionQualityReport"),
    RegionalConnectionQualityTrendReport("regionalConnectionQualityTrendReport"),
    RegionalConnectionQualityInsightsReport("regionalConnectionQualityInsightsReport"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPCConnectionQualityReportType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPCConnectionQualityReportType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "remoteConnectionQualityReport": return RemoteConnectionQualityReport;
            case "regionalConnectionQualityTrendReport": return RegionalConnectionQualityTrendReport;
            case "regionalConnectionQualityInsightsReport": return RegionalConnectionQualityInsightsReport;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
