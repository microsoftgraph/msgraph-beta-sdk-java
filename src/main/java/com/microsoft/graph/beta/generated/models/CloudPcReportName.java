package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcReportName implements ValuedEnum {
    RemoteConnectionHistoricalReports("remoteConnectionHistoricalReports"),
    DailyAggregatedRemoteConnectionReports("dailyAggregatedRemoteConnectionReports"),
    TotalAggregatedRemoteConnectionReports("totalAggregatedRemoteConnectionReports"),
    SharedUseLicenseUsageReport("sharedUseLicenseUsageReport"),
    SharedUseLicenseUsageRealTimeReport("sharedUseLicenseUsageRealTimeReport"),
    UnknownFutureValue("unknownFutureValue"),
    NoLicenseAvailableConnectivityFailureReport("noLicenseAvailableConnectivityFailureReport"),
    FrontlineLicenseUsageReport("frontlineLicenseUsageReport"),
    FrontlineLicenseUsageRealTimeReport("frontlineLicenseUsageRealTimeReport"),
    RemoteConnectionQualityReports("remoteConnectionQualityReports"),
    InaccessibleCloudPcReports("inaccessibleCloudPcReports"),
    RawRemoteConnectionReports("rawRemoteConnectionReports"),
    CloudPcUsageCategoryReports("cloudPcUsageCategoryReports"),
    CrossRegionDisasterRecoveryReport("crossRegionDisasterRecoveryReport"),
    PerformanceTrendReport("performanceTrendReport"),
    InaccessibleCloudPcTrendReport("inaccessibleCloudPcTrendReport");
    public final String value;
    CloudPcReportName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcReportName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "remoteConnectionHistoricalReports": return RemoteConnectionHistoricalReports;
            case "dailyAggregatedRemoteConnectionReports": return DailyAggregatedRemoteConnectionReports;
            case "totalAggregatedRemoteConnectionReports": return TotalAggregatedRemoteConnectionReports;
            case "sharedUseLicenseUsageReport": return SharedUseLicenseUsageReport;
            case "sharedUseLicenseUsageRealTimeReport": return SharedUseLicenseUsageRealTimeReport;
            case "unknownFutureValue": return UnknownFutureValue;
            case "noLicenseAvailableConnectivityFailureReport": return NoLicenseAvailableConnectivityFailureReport;
            case "frontlineLicenseUsageReport": return FrontlineLicenseUsageReport;
            case "frontlineLicenseUsageRealTimeReport": return FrontlineLicenseUsageRealTimeReport;
            case "remoteConnectionQualityReports": return RemoteConnectionQualityReports;
            case "inaccessibleCloudPcReports": return InaccessibleCloudPcReports;
            case "rawRemoteConnectionReports": return RawRemoteConnectionReports;
            case "cloudPcUsageCategoryReports": return CloudPcUsageCategoryReports;
            case "crossRegionDisasterRecoveryReport": return CrossRegionDisasterRecoveryReport;
            case "performanceTrendReport": return PerformanceTrendReport;
            case "inaccessibleCloudPcTrendReport": return InaccessibleCloudPcTrendReport;
            default: return null;
        }
    }
}
