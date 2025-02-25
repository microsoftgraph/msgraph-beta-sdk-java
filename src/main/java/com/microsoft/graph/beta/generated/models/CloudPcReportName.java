package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcReportName implements ValuedEnum {
    RemoteConnectionHistoricalReports("remoteConnectionHistoricalReports"),
    DailyAggregatedRemoteConnectionReports("dailyAggregatedRemoteConnectionReports"),
    TotalAggregatedRemoteConnectionReports("totalAggregatedRemoteConnectionReports"),
    UnknownFutureValue("unknownFutureValue"),
    NoLicenseAvailableConnectivityFailureReport("noLicenseAvailableConnectivityFailureReport"),
    FrontlineLicenseUsageReport("frontlineLicenseUsageReport"),
    FrontlineLicenseUsageRealTimeReport("frontlineLicenseUsageRealTimeReport"),
    RemoteConnectionQualityReports("remoteConnectionQualityReports"),
    InaccessibleCloudPcReports("inaccessibleCloudPcReports"),
    ActionStatusReport("actionStatusReport"),
    RawRemoteConnectionReports("rawRemoteConnectionReports"),
    CloudPcUsageCategoryReports("cloudPcUsageCategoryReports"),
    CrossRegionDisasterRecoveryReport("crossRegionDisasterRecoveryReport"),
    PerformanceTrendReport("performanceTrendReport"),
    InaccessibleCloudPcTrendReport("inaccessibleCloudPcTrendReport"),
    RegionalConnectionQualityTrendReport("regionalConnectionQualityTrendReport"),
    RegionalConnectionQualityInsightsReport("regionalConnectionQualityInsightsReport"),
    RemoteConnectionQualityReport("remoteConnectionQualityReport"),
    FrontlineLicenseHourlyUsageReport("frontlineLicenseHourlyUsageReport"),
    FrontlineRealtimeUserConnectionsReport("frontlineRealtimeUserConnectionsReport"),
    BulkActionStatusReport("bulkActionStatusReport"),
    TroubleshootDetailsReport("troubleshootDetailsReport"),
    TroubleshootTrendCountReport("troubleshootTrendCountReport"),
    TroubleshootRegionalReport("troubleshootRegionalReport"),
    TroubleshootIssueCountReport("troubleshootIssueCountReport"),
    CloudPcInsightReport("cloudPcInsightReport"),
    RegionalInaccessibleCloudPcTrendReport("regionalInaccessibleCloudPcTrendReport");
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
            case "unknownFutureValue": return UnknownFutureValue;
            case "noLicenseAvailableConnectivityFailureReport": return NoLicenseAvailableConnectivityFailureReport;
            case "frontlineLicenseUsageReport": return FrontlineLicenseUsageReport;
            case "frontlineLicenseUsageRealTimeReport": return FrontlineLicenseUsageRealTimeReport;
            case "remoteConnectionQualityReports": return RemoteConnectionQualityReports;
            case "inaccessibleCloudPcReports": return InaccessibleCloudPcReports;
            case "actionStatusReport": return ActionStatusReport;
            case "rawRemoteConnectionReports": return RawRemoteConnectionReports;
            case "cloudPcUsageCategoryReports": return CloudPcUsageCategoryReports;
            case "crossRegionDisasterRecoveryReport": return CrossRegionDisasterRecoveryReport;
            case "performanceTrendReport": return PerformanceTrendReport;
            case "inaccessibleCloudPcTrendReport": return InaccessibleCloudPcTrendReport;
            case "regionalConnectionQualityTrendReport": return RegionalConnectionQualityTrendReport;
            case "regionalConnectionQualityInsightsReport": return RegionalConnectionQualityInsightsReport;
            case "remoteConnectionQualityReport": return RemoteConnectionQualityReport;
            case "frontlineLicenseHourlyUsageReport": return FrontlineLicenseHourlyUsageReport;
            case "frontlineRealtimeUserConnectionsReport": return FrontlineRealtimeUserConnectionsReport;
            case "bulkActionStatusReport": return BulkActionStatusReport;
            case "troubleshootDetailsReport": return TroubleshootDetailsReport;
            case "troubleshootTrendCountReport": return TroubleshootTrendCountReport;
            case "troubleshootRegionalReport": return TroubleshootRegionalReport;
            case "troubleshootIssueCountReport": return TroubleshootIssueCountReport;
            case "cloudPcInsightReport": return CloudPcInsightReport;
            case "regionalInaccessibleCloudPcTrendReport": return RegionalInaccessibleCloudPcTrendReport;
            default: return null;
        }
    }
}
