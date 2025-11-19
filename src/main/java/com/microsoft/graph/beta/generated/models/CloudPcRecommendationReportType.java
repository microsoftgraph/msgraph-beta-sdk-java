package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcRecommendationReportType implements ValuedEnum {
    CloudPcUsageCategoryReport("cloudPcUsageCategoryReport"),
    UnknownFutureValue("unknownFutureValue"),
    CloudPcUsageCategoryReports("cloudPcUsageCategoryReports");
    public final String value;
    CloudPcRecommendationReportType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcRecommendationReportType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudPcUsageCategoryReport": return CloudPcUsageCategoryReport;
            case "unknownFutureValue": return UnknownFutureValue;
            case "cloudPcUsageCategoryReports": return CloudPcUsageCategoryReports;
            default: return null;
        }
    }
}
