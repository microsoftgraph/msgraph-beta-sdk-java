// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.AzureADLicenseUsage;
import com.microsoft.graph.models.extensions.AzureADUserFeatureUsage;
import com.microsoft.graph.models.extensions.AzureADFeatureUsage;
import com.microsoft.graph.models.extensions.ApplicationSignInSummary;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationCount;
import com.microsoft.graph.models.extensions.CredentialUsageSummary;
import com.microsoft.graph.models.extensions.RelyingPartyDetailedSummary;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import com.microsoft.graph.models.extensions.Office365ActiveUserDetail;
import com.microsoft.graph.models.extensions.Office365ServicesUserCounts;
import com.microsoft.graph.models.extensions.Office365ActiveUserCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityDetail;
import com.microsoft.graph.models.extensions.Office365GroupsActivityCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityStorage;
import com.microsoft.graph.models.extensions.Office365GroupsActivityFileCounts;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import com.microsoft.graph.models.extensions.EmailActivitySummary;
import com.microsoft.graph.models.extensions.EmailAppUsageUserDetail;
import com.microsoft.graph.models.extensions.EmailAppUsageAppsUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageVersionsUserCounts;
import com.microsoft.graph.models.extensions.MailboxUsageDetail;
import com.microsoft.graph.models.extensions.MailboxUsageMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageQuotaStatusMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageStorage;
import com.microsoft.graph.models.extensions.OneDriveActivityUserDetail;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountCounts;
import com.microsoft.graph.models.extensions.OneDriveUsageFileCounts;
import com.microsoft.graph.models.extensions.SiteUsageStorage;
import com.microsoft.graph.models.extensions.SharePointActivityUserDetail;
import com.microsoft.graph.models.extensions.SharePointActivityUserCounts;
import com.microsoft.graph.models.extensions.SharePointActivityPages;
import com.microsoft.graph.models.extensions.SharePointSiteUsageDetail;
import com.microsoft.graph.models.extensions.SharePointSiteUsageFileCounts;
import com.microsoft.graph.models.extensions.SharePointSiteUsageSiteCounts;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.YammerActivityUserDetail;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.YammerDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.YammerGroupsActivityDetail;
import com.microsoft.graph.models.extensions.YammerGroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.YammerGroupsActivityCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserDetail;
import com.microsoft.graph.models.extensions.TeamsUserActivityCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import com.microsoft.graph.models.extensions.UserPrintUsageSummary;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import com.microsoft.graph.models.extensions.PrinterUsageSummary;
import com.microsoft.graph.models.extensions.OverallPrintUsageSummary;
import com.microsoft.graph.models.extensions.PrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootCollectionRequest;
import com.microsoft.graph.requests.extensions.IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetUserPrintUsageSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetGroupPrintUsageSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrinterUsageSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Collection Request Builder.
 */
public interface IReportRootCollectionRequestBuilder extends IRequestBuilder {

    IReportRootCollectionRequest buildRequest();

    IReportRootCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IReportRootRequestBuilder byId(final String id);


    IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder getUserArchivedPrintJobs(final String userId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder getGroupArchivedPrintJobs(final String groupId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder getPrinterArchivedPrintJobs(final String printerId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);
    IReportRootGetUserPrintUsageSummaryRequestBuilder getUserPrintUsageSummary(final String userId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);
    IReportRootGetGroupPrintUsageSummaryRequestBuilder getGroupPrintUsageSummary(final String groupId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);
    IReportRootGetPrinterUsageSummaryRequestBuilder getPrinterUsageSummary(final String printerId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder getPrintUsageSummariesByUser(final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder getPrintUsageSummariesByGroup(final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetPrintUsageSummariesByPrinterCollectionRequestBuilder getPrintUsageSummariesByPrinter(final java.util.Calendar periodStart, final java.util.Calendar periodEnd);

    IReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder getOverallPrintUsageSummary(final java.util.Calendar periodStart, final java.util.Calendar periodEnd, final Integer topListsSize);

    IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder getPrintUsageSummariesByTimeSpan(final java.util.Calendar periodStart, final java.util.Calendar periodEnd, final Integer timeSpanInMinutes);
}
