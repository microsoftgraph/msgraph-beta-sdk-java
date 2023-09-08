// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Report Name.
*/
public enum CloudPcReportName
{
    /**
    * remote Connection Historical Reports
    */
    REMOTE_CONNECTION_HISTORICAL_REPORTS,
    /**
    * daily Aggregated Remote Connection Reports
    */
    DAILY_AGGREGATED_REMOTE_CONNECTION_REPORTS,
    /**
    * total Aggregated Remote Connection Reports
    */
    TOTAL_AGGREGATED_REMOTE_CONNECTION_REPORTS,
    /**
    * shared Use License Usage Report
    * @deprecated The sharedUseLicenseUsageReport value is deprecated and will stop returning on Oct 17, 2023. Use frontlineLicenseUsageReport report
    */
    @Deprecated
    SHARED_USE_LICENSE_USAGE_REPORT,
    /**
    * shared Use License Usage Real Time Report
    * @deprecated The sharedUseLicenseUsageRealTimeReport value is deprecated and will stop returning on Oct 17, 2023. Use frontlineLicenseUsageRealTimeReport report
    */
    @Deprecated
    SHARED_USE_LICENSE_USAGE_REAL_TIME_REPORT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * no License Available Connectivity Failure Report
    */
    NO_LICENSE_AVAILABLE_CONNECTIVITY_FAILURE_REPORT,
    /**
    * frontline License Usage Report
    */
    FRONTLINE_LICENSE_USAGE_REPORT,
    /**
    * frontline License Usage Real Time Report
    */
    FRONTLINE_LICENSE_USAGE_REAL_TIME_REPORT,
    /**
    * remote Connection Quality Reports
    */
    REMOTE_CONNECTION_QUALITY_REPORTS,
    /**
    * inaccessible Cloud Pc Reports
    */
    INACCESSIBLE_CLOUD_PC_REPORTS,
    /**
    * For CloudPcReportName values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
