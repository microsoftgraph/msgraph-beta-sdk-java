// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
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
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodsRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Request Builder.
 */
public interface IReportRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IReportRootRequest instance
     */
    IReportRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IReportRootRequest instance
     */
    IReportRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IApplicationSignInDetailedSummaryCollectionRequestBuilder applicationSignInDetailedSummary();

    IApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary(final String id);

    /**
     * Gets the request builder for AuthenticationMethodsRoot
     *
     * @return the IAuthenticationMethodsRootRequestBuilder instance
     */
    IAuthenticationMethodsRootRequestBuilder authenticationMethods();

    ICredentialUserRegistrationDetailsCollectionRequestBuilder credentialUserRegistrationDetails();

    ICredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails(final String id);

    IUserCredentialUsageDetailsCollectionRequestBuilder userCredentialUsageDetails();

    IUserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails(final String id);

    IPrintUsageByPrinterCollectionRequestBuilder dailyPrintUsageByPrinter();

    IPrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter(final String id);

    IPrintUsageByUserCollectionRequestBuilder dailyPrintUsageByUser();

    IPrintUsageByUserRequestBuilder dailyPrintUsageByUser(final String id);

    IPrintUsageByPrinterCollectionRequestBuilder dailyPrintUsageSummariesByPrinter();

    IPrintUsageByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter(final String id);

    IPrintUsageByUserCollectionRequestBuilder dailyPrintUsageSummariesByUser();

    IPrintUsageByUserRequestBuilder dailyPrintUsageSummariesByUser(final String id);

    IPrintUsageByPrinterCollectionRequestBuilder monthlyPrintUsageByPrinter();

    IPrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter(final String id);

    IPrintUsageByUserCollectionRequestBuilder monthlyPrintUsageByUser();

    IPrintUsageByUserRequestBuilder monthlyPrintUsageByUser(final String id);

    IPrintUsageByPrinterCollectionRequestBuilder monthlyPrintUsageSummariesByPrinter();

    IPrintUsageByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter(final String id);

    IPrintUsageByUserCollectionRequestBuilder monthlyPrintUsageSummariesByUser();

    IPrintUsageByUserRequestBuilder monthlyPrintUsageSummariesByUser(final String id);

    IReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder getAzureADApplicationSignInSummary(final String period);

    IReportRootGetAzureADFeatureUsageCollectionRequestBuilder getAzureADFeatureUsage(final String period);

    IReportRootGetAzureADLicenseUsageCollectionRequestBuilder getAzureADLicenseUsage(final String period);

    IReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder getAzureADUserFeatureUsage();

    IReportRootGetCredentialUsageSummaryCollectionRequestBuilder getCredentialUsageSummary(final String period);

    IReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder getCredentialUserRegistrationCount();

    IReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder getRelyingPartyDetailedSummary(final String period);
    IReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity();
    IReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity();
    IReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder managedDeviceEnrollmentAbandonmentDetails(final Integer skip, final Integer top, final String filter, final String skipToken);
    IReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder managedDeviceEnrollmentAbandonmentSummary(final Integer skip, final Integer top, final String filter, final String skipToken);
    IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails();
    IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(final Integer skip, final Integer top, final String filter, final String skipToken);
    IReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder managedDeviceEnrollmentFailureTrends();
    IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures();
    IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(final String period);

    IReportRootGetEmailActivityCountsCollectionRequestBuilder getEmailActivityCounts(final String period);

    IReportRootGetEmailActivityUserCountsCollectionRequestBuilder getEmailActivityUserCounts(final String period);

    IReportRootGetEmailActivityUserDetailCollectionRequestBuilder getEmailActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetEmailActivityUserDetailCollectionRequestBuilder getEmailActivityUserDetail(final String period);

    IReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder getEmailAppUsageAppsUserCounts(final String period);

    IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder getEmailAppUsageUserCounts(final String period);

    IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder getEmailAppUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder getEmailAppUsageUserDetail(final String period);

    IReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder getEmailAppUsageVersionsUserCounts(final String period);
    IReportRootGetM365AppPlatformUserCountsRequestBuilder getM365AppPlatformUserCounts(final String period);
    IReportRootGetM365AppUserCountsRequestBuilder getM365AppUserCounts(final String period);
    IReportRootGetM365AppUserDetailRequestBuilder getM365AppUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetM365AppUserDetailRequestBuilder getM365AppUserDetail(final String period);

    IReportRootGetMailboxUsageDetailCollectionRequestBuilder getMailboxUsageDetail(final String period);

    IReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder getMailboxUsageMailboxCounts(final String period);

    IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(final String period);

    IReportRootGetMailboxUsageStorageCollectionRequestBuilder getMailboxUsageStorage(final String period);

    IReportRootGetOffice365ActivationCountsCollectionRequestBuilder getOffice365ActivationCounts();

    IReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder getOffice365ActivationsUserCounts();

    IReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder getOffice365ActivationsUserDetail();

    IReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder getOffice365ActiveUserCounts(final String period);

    IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder getOffice365ActiveUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder getOffice365ActiveUserDetail(final String period);

    IReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder getOffice365GroupsActivityCounts(final String period);

    IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder getOffice365GroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder getOffice365GroupsActivityDetail(final String period);

    IReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder getOffice365GroupsActivityFileCounts(final String period);

    IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder getOffice365GroupsActivityGroupCounts(final String period);

    IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder getOffice365GroupsActivityStorage(final String period);

    IReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder getOffice365ServicesUserCounts(final String period);

    IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder getOneDriveActivityFileCounts(final String period);

    IReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder getOneDriveActivityUserCounts(final String period);

    IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder getOneDriveActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder getOneDriveActivityUserDetail(final String period);

    IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder getOneDriveUsageAccountCounts(final String period);

    IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder getOneDriveUsageAccountDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder getOneDriveUsageAccountDetail(final String period);

    IReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder getOneDriveUsageFileCounts(final String period);

    IReportRootGetOneDriveUsageStorageCollectionRequestBuilder getOneDriveUsageStorage(final String period);

    IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder getSharePointActivityFileCounts(final String period);

    IReportRootGetSharePointActivityPagesCollectionRequestBuilder getSharePointActivityPages(final String period);

    IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder getSharePointActivityUserCounts(final String period);

    IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder getSharePointActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder getSharePointActivityUserDetail(final String period);

    IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder getSharePointSiteUsageDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder getSharePointSiteUsageDetail(final String period);

    IReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder getSharePointSiteUsageFileCounts(final String period);

    IReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder getSharePointSiteUsagePages(final String period);

    IReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder getSharePointSiteUsageSiteCounts(final String period);

    IReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder getSharePointSiteUsageStorage(final String period);

    IReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder getSkypeForBusinessActivityCounts(final String period);

    IReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder getSkypeForBusinessActivityUserCounts(final String period);

    IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder getSkypeForBusinessActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder getSkypeForBusinessActivityUserDetail(final String period);

    IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(final String period);

    IReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(final String period);

    IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final String period);

    IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityCounts(final String period);

    IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(final String period);

    IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(final String period);

    IReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityCounts(final String period);

    IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(final String period);

    IReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(final String period);

    IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(final String period);

    IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(final String period);

    IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(final String period);

    IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder getTeamsDeviceUsageDistributionUserCounts(final String period);

    IReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder getTeamsDeviceUsageUserCounts(final String period);

    IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder getTeamsDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder getTeamsDeviceUsageUserDetail(final String period);

    IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder getTeamsUserActivityCounts(final String period);

    IReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder getTeamsUserActivityUserCounts(final String period);

    IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder getTeamsUserActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder getTeamsUserActivityUserDetail(final String period);

    IReportRootGetYammerActivityCountsCollectionRequestBuilder getYammerActivityCounts(final String period);

    IReportRootGetYammerActivityUserCountsCollectionRequestBuilder getYammerActivityUserCounts(final String period);

    IReportRootGetYammerActivityUserDetailCollectionRequestBuilder getYammerActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetYammerActivityUserDetailCollectionRequestBuilder getYammerActivityUserDetail(final String period);

    IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder getYammerDeviceUsageDistributionUserCounts(final String period);

    IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder getYammerDeviceUsageUserCounts(final String period);

    IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder getYammerDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder getYammerDeviceUsageUserDetail(final String period);

    IReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder getYammerGroupsActivityCounts(final String period);

    IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder getYammerGroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date);

    IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder getYammerGroupsActivityDetail(final String period);

    IReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder getYammerGroupsActivityGroupCounts(final String period);

    IReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder getGroupArchivedPrintJobs(final String groupId, final java.util.Calendar startDateTime, final java.util.Calendar endDateTime);

    IReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder getPrinterArchivedPrintJobs(final String printerId, final java.util.Calendar startDateTime, final java.util.Calendar endDateTime);

    IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder getUserArchivedPrintJobs(final String userId, final java.util.Calendar startDateTime, final java.util.Calendar endDateTime);
    IReportRootGetTenantSecureScoresRequestBuilder getTenantSecureScores(final Integer period);

}