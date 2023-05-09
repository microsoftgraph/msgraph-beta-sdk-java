package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcReportName implements ValuedEnum {
    RemoteConnectionHistoricalReports("remoteConnectionHistoricalReports"),
    DailyAggregatedRemoteConnectionReports("dailyAggregatedRemoteConnectionReports"),
    TotalAggregatedRemoteConnectionReports("totalAggregatedRemoteConnectionReports"),
    SharedUseLicenseUsageReport("sharedUseLicenseUsageReport"),
    SharedUseLicenseUsageRealTimeReport("sharedUseLicenseUsageRealTimeReport"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcReportName(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcReportName forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "remoteConnectionHistoricalReports": return RemoteConnectionHistoricalReports;
            case "dailyAggregatedRemoteConnectionReports": return DailyAggregatedRemoteConnectionReports;
            case "totalAggregatedRemoteConnectionReports": return TotalAggregatedRemoteConnectionReports;
            case "sharedUseLicenseUsageReport": return SharedUseLicenseUsageReport;
            case "sharedUseLicenseUsageRealTimeReport": return SharedUseLicenseUsageRealTimeReport;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
