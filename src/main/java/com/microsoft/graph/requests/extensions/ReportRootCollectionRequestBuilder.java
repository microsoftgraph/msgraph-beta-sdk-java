// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.ApplicationSignInSummary;
import com.microsoft.graph.models.extensions.AzureADFeatureUsage;
import com.microsoft.graph.models.extensions.AzureADLicenseUsage;
import com.microsoft.graph.models.extensions.AzureADUserFeatureUsage;
import com.microsoft.graph.models.extensions.CredentialUsageSummary;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationCount;
import com.microsoft.graph.models.extensions.RelyingPartyDetailedSummary;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.EmailActivitySummary;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import com.microsoft.graph.models.extensions.EmailAppUsageAppsUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageUserDetail;
import com.microsoft.graph.models.extensions.EmailAppUsageVersionsUserCounts;
import com.microsoft.graph.models.extensions.MailboxUsageDetail;
import com.microsoft.graph.models.extensions.MailboxUsageMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageQuotaStatusMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageStorage;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import com.microsoft.graph.models.extensions.Office365ActiveUserCounts;
import com.microsoft.graph.models.extensions.Office365ActiveUserDetail;
import com.microsoft.graph.models.extensions.Office365GroupsActivityCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityDetail;
import com.microsoft.graph.models.extensions.Office365GroupsActivityFileCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityStorage;
import com.microsoft.graph.models.extensions.Office365ServicesUserCounts;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import com.microsoft.graph.models.extensions.OneDriveActivityUserDetail;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountCounts;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import com.microsoft.graph.models.extensions.OneDriveUsageFileCounts;
import com.microsoft.graph.models.extensions.SiteUsageStorage;
import com.microsoft.graph.models.extensions.SharePointActivityPages;
import com.microsoft.graph.models.extensions.SharePointActivityUserCounts;
import com.microsoft.graph.models.extensions.SharePointActivityUserDetail;
import com.microsoft.graph.models.extensions.SharePointSiteUsageDetail;
import com.microsoft.graph.models.extensions.SharePointSiteUsageFileCounts;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;
import com.microsoft.graph.models.extensions.SharePointSiteUsageSiteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.TeamsUserActivityCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserDetail;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import com.microsoft.graph.models.extensions.YammerActivityUserDetail;
import com.microsoft.graph.models.extensions.YammerDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.YammerGroupsActivityCounts;
import com.microsoft.graph.models.extensions.YammerGroupsActivityDetail;
import com.microsoft.graph.models.extensions.YammerGroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import com.microsoft.graph.models.extensions.OverallPrintUsageSummary;
import com.microsoft.graph.models.extensions.PrinterUsageSummary;
import com.microsoft.graph.models.extensions.PrintUsageSummary;
import com.microsoft.graph.models.extensions.UserPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ReportRootCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetGroupPrintUsageSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrinterUsageSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetUserArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetUserPrintUsageSummaryRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.ReportRootGetAzureADApplicationSignInSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetAzureADFeatureUsageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetAzureADLicenseUsageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetCredentialUsageSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetRelyingPartyDetailedSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentAbandonmentDetailsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentAbandonmentSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentTopFailuresParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageAppsUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageVersionsUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetM365AppPlatformUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetM365AppUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetM365AppUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageMailboxCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ServicesUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityPagesParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsagePagesParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageSiteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTenantSecureScoresParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetGroupArchivedPrintJobsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetGroupPrintUsageSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOverallPrintUsageSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrinterArchivedPrintJobsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrinterUsageSummaryParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrintUsageSummariesByGroupParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrintUsageSummariesByPrinterParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrintUsageSummariesByTimeSpanParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetPrintUsageSummariesByUserParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetUserArchivedPrintJobsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetUserPrintUsageSummaryParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Collection Request Builder.
 */
public class ReportRootCollectionRequestBuilder extends BaseCollectionRequestBuilder<ReportRoot, ReportRootRequestBuilder, ReportRootCollectionResponse, ReportRootCollectionPage, ReportRootCollectionRequest> {

    /**
     * The request builder for this collection of Print
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootRequestBuilder.class, ReportRootCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder getGroupArchivedPrintJobs(@Nonnull final ReportRootGetGroupArchivedPrintJobsParameterSet parameters) {
        return new ReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getGroupArchivedPrintJobs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetGroupPrintUsageSummaryRequestBuilder getGroupPrintUsageSummary(@Nonnull final ReportRootGetGroupPrintUsageSummaryParameterSet parameters) {
        return new ReportRootGetGroupPrintUsageSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getGroupPrintUsageSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder getOverallPrintUsageSummary(@Nonnull final ReportRootGetOverallPrintUsageSummaryParameterSet parameters) {
        return new ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOverallPrintUsageSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder getPrinterArchivedPrintJobs(@Nonnull final ReportRootGetPrinterArchivedPrintJobsParameterSet parameters) {
        return new ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrinterArchivedPrintJobs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrinterUsageSummaryRequestBuilder getPrinterUsageSummary(@Nonnull final ReportRootGetPrinterUsageSummaryParameterSet parameters) {
        return new ReportRootGetPrinterUsageSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrinterUsageSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder getPrintUsageSummariesByGroup(@Nonnull final ReportRootGetPrintUsageSummariesByGroupParameterSet parameters) {
        return new ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrintUsageSummariesByGroup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrintUsageSummariesByPrinterCollectionRequestBuilder getPrintUsageSummariesByPrinter(@Nonnull final ReportRootGetPrintUsageSummariesByPrinterParameterSet parameters) {
        return new ReportRootGetPrintUsageSummariesByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrintUsageSummariesByPrinter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder getPrintUsageSummariesByTimeSpan(@Nonnull final ReportRootGetPrintUsageSummariesByTimeSpanParameterSet parameters) {
        return new ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrintUsageSummariesByTimeSpan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder getPrintUsageSummariesByUser(@Nonnull final ReportRootGetPrintUsageSummariesByUserParameterSet parameters) {
        return new ReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrintUsageSummariesByUser"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetUserArchivedPrintJobsCollectionRequestBuilder getUserArchivedPrintJobs(@Nonnull final ReportRootGetUserArchivedPrintJobsParameterSet parameters) {
        return new ReportRootGetUserArchivedPrintJobsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserArchivedPrintJobs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetUserPrintUsageSummaryRequestBuilder getUserPrintUsageSummary(@Nonnull final ReportRootGetUserPrintUsageSummaryParameterSet parameters) {
        return new ReportRootGetUserPrintUsageSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserPrintUsageSummary"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
