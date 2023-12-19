package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPCPerformanceReportName implements ValuedEnum {
    PerformanceTrendReport("performanceTrendReport"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPCPerformanceReportName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPCPerformanceReportName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "performanceTrendReport": return PerformanceTrendReport;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
