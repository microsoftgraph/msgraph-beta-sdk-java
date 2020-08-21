// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootRequest;
import com.microsoft.graph.requests.extensions.ReportRootRequest;
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetAzureADLicenseUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADLicenseUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetAzureADFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetCredentialUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetCredentialUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityPagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityPagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetM365AppUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetM365AppUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetM365AppUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppPlatformUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetM365AppPlatformUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTenantSecureScoresRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTenantSecureScoresRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request Builder.
 */
public class ReportRootRequestBuilder extends BaseRequestBuilder implements IReportRootRequestBuilder {

    /**
     * The request builder for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IReportRootRequest instance
     */
    public IReportRootRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IReportRootRequest instance
     */
    public IReportRootRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ReportRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IApplicationSignInDetailedSummaryCollectionRequestBuilder applicationSignInDetailedSummary() {
        return new ApplicationSignInDetailedSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary"), getClient(), null);
    }

    public IApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary(final String id) {
        return new ApplicationSignInDetailedSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary") + "/" + id, getClient(), null);
    }
    public ICredentialUserRegistrationDetailsCollectionRequestBuilder credentialUserRegistrationDetails() {
        return new CredentialUserRegistrationDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails"), getClient(), null);
    }

    public ICredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails(final String id) {
        return new CredentialUserRegistrationDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails") + "/" + id, getClient(), null);
    }
    public IUserCredentialUsageDetailsCollectionRequestBuilder userCredentialUsageDetails() {
        return new UserCredentialUsageDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails"), getClient(), null);
    }

    public IUserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails(final String id) {
        return new UserCredentialUsageDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails") + "/" + id, getClient(), null);
    }
    public IPrintUsageSummaryByUserCollectionRequestBuilder dailyPrintUsageSummariesByUser() {
        return new PrintUsageSummaryByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser"), getClient(), null);
    }

    public IPrintUsageSummaryByUserRequestBuilder dailyPrintUsageSummariesByUser(final String id) {
        return new PrintUsageSummaryByUserRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }
    public IPrintUsageSummaryByUserCollectionRequestBuilder monthlyPrintUsageSummariesByUser() {
        return new PrintUsageSummaryByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser"), getClient(), null);
    }

    public IPrintUsageSummaryByUserRequestBuilder monthlyPrintUsageSummariesByUser(final String id) {
        return new PrintUsageSummaryByUserRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }
    public IPrintUsageSummaryByPrinterCollectionRequestBuilder dailyPrintUsageSummariesByPrinter() {
        return new PrintUsageSummaryByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    public IPrintUsageSummaryByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter(final String id) {
        return new PrintUsageSummaryByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }
    public IPrintUsageSummaryByPrinterCollectionRequestBuilder monthlyPrintUsageSummariesByPrinter() {
        return new PrintUsageSummaryByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    public IPrintUsageSummaryByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter(final String id) {
        return new PrintUsageSummaryByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }

    public IReportRootGetAzureADLicenseUsageCollectionRequestBuilder getAzureADLicenseUsage(final String period) {
        return new ReportRootGetAzureADLicenseUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADLicenseUsage"), getClient(), null, period);
    }

    public IReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder getAzureADUserFeatureUsage() {
        return new ReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADUserFeatureUsage"), getClient(), null);
    }

    public IReportRootGetAzureADFeatureUsageCollectionRequestBuilder getAzureADFeatureUsage(final String period) {
        return new ReportRootGetAzureADFeatureUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADFeatureUsage"), getClient(), null, period);
    }

    public IReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder getAzureADApplicationSignInSummary(final String period) {
        return new ReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADApplicationSignInSummary"), getClient(), null, period);
    }

    public IReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder getCredentialUserRegistrationCount() {
        return new ReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCredentialUserRegistrationCount"), getClient(), null);
    }

    public IReportRootGetCredentialUsageSummaryCollectionRequestBuilder getCredentialUsageSummary(final String period) {
        return new ReportRootGetCredentialUsageSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCredentialUsageSummary"), getClient(), null, period);
    }

    public IReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder getRelyingPartyDetailedSummary(final String period) {
        return new ReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRelyingPartyDetailedSummary"), getClient(), null, period);
    }

    public IReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new ReportRootDeviceConfigurationUserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationUserActivity"), getClient(), null);
    }

    public IReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new ReportRootDeviceConfigurationDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationDeviceActivity"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(final Integer skip, final Integer top, final String filter, final String skipToken) {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null, skip, top, filter, skipToken);
    }

    public IReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder managedDeviceEnrollmentFailureTrends() {
        return new ReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureTrends"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(final String period) {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null, period);
    }

    public IReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder managedDeviceEnrollmentAbandonmentSummary(final Integer skip, final Integer top, final String filter, final String skipToken) {
        return new ReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentAbandonmentSummary"), getClient(), null, skip, top, filter, skipToken);
    }

    public IReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder managedDeviceEnrollmentAbandonmentDetails(final Integer skip, final Integer top, final String filter, final String skipToken) {
        return new ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentAbandonmentDetails"), getClient(), null, skip, top, filter, skipToken);
    }

    public IReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder getOffice365ActivationsUserDetail() {
        return new ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserDetail"), getClient(), null);
    }

    public IReportRootGetOffice365ActivationCountsCollectionRequestBuilder getOffice365ActivationCounts() {
        return new ReportRootGetOffice365ActivationCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationCounts"), getClient(), null);
    }

    public IReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder getOffice365ActivationsUserCounts() {
        return new ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserCounts"), getClient(), null);
    }

    public IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder getOffice365ActiveUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, date);
    }

    public IReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder getOffice365ActiveUserDetail(final String period) {
        return new ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, period);
    }

    public IReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder getOffice365ServicesUserCounts(final String period) {
        return new ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ServicesUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder getOffice365ActiveUserCounts(final String period) {
        return new ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder getOffice365GroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, date);
    }

    public IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder getOffice365GroupsActivityDetail(final String period) {
        return new ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder getOffice365GroupsActivityCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder getOffice365GroupsActivityGroupCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityGroupCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder getOffice365GroupsActivityStorage(final String period) {
        return new ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityStorage"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder getOffice365GroupsActivityFileCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityUserDetailCollectionRequestBuilder getEmailActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetEmailActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetEmailActivityUserDetailCollectionRequestBuilder getEmailActivityUserDetail(final String period) {
        return new ReportRootGetEmailActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityCountsCollectionRequestBuilder getEmailActivityCounts(final String period) {
        return new ReportRootGetEmailActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityUserCountsCollectionRequestBuilder getEmailActivityUserCounts(final String period) {
        return new ReportRootGetEmailActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder getEmailAppUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder getEmailAppUsageUserDetail(final String period) {
        return new ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder getEmailAppUsageAppsUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder getEmailAppUsageUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder getEmailAppUsageVersionsUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageDetailCollectionRequestBuilder getMailboxUsageDetail(final String period) {
        return new ReportRootGetMailboxUsageDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder getMailboxUsageMailboxCounts(final String period) {
        return new ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(final String period) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageStorageCollectionRequestBuilder getMailboxUsageStorage(final String period) {
        return new ReportRootGetMailboxUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder getOneDriveActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder getOneDriveActivityUserDetail(final String period) {
        return new ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder getOneDriveActivityUserCounts(final String period) {
        return new ReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder getOneDriveActivityFileCounts(final String period) {
        return new ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder getOneDriveUsageAccountDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, date);
    }

    public IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder getOneDriveUsageAccountDetail(final String period) {
        return new ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder getOneDriveUsageAccountCounts(final String period) {
        return new ReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder getOneDriveUsageFileCounts(final String period) {
        return new ReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageStorageCollectionRequestBuilder getOneDriveUsageStorage(final String period) {
        return new ReportRootGetOneDriveUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder getSharePointActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSharePointActivityUserDetailCollectionRequestBuilder getSharePointActivityUserDetail(final String period) {
        return new ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder getSharePointActivityFileCounts(final String period) {
        return new ReportRootGetSharePointActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder getSharePointActivityUserCounts(final String period) {
        return new ReportRootGetSharePointActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityPagesCollectionRequestBuilder getSharePointActivityPages(final String period) {
        return new ReportRootGetSharePointActivityPagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder getSharePointSiteUsageDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, date);
    }

    public IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder getSharePointSiteUsageDetail(final String period) {
        return new ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder getSharePointSiteUsageFileCounts(final String period) {
        return new ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder getSharePointSiteUsageSiteCounts(final String period) {
        return new ReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder getSharePointSiteUsageStorage(final String period) {
        return new ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder getSharePointSiteUsagePages(final String period) {
        return new ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder getSkypeForBusinessActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder getSkypeForBusinessActivityUserDetail(final String period) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder getSkypeForBusinessActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder getSkypeForBusinessActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityUserDetailCollectionRequestBuilder getYammerActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerActivityUserDetailCollectionRequestBuilder getYammerActivityUserDetail(final String period) {
        return new ReportRootGetYammerActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityCountsCollectionRequestBuilder getYammerActivityCounts(final String period) {
        return new ReportRootGetYammerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityUserCountsCollectionRequestBuilder getYammerActivityUserCounts(final String period) {
        return new ReportRootGetYammerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder getYammerDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder getYammerDeviceUsageUserDetail(final String period) {
        return new ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder getYammerDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder getYammerDeviceUsageUserCounts(final String period) {
        return new ReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder getYammerGroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder getYammerGroupsActivityDetail(final String period) {
        return new ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder getYammerGroupsActivityGroupCounts(final String period) {
        return new ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder getYammerGroupsActivityCounts(final String period) {
        return new ReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder getTeamsUserActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder getTeamsUserActivityUserDetail(final String period) {
        return new ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder getTeamsUserActivityCounts(final String period) {
        return new ReportRootGetTeamsUserActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder getTeamsUserActivityUserCounts(final String period) {
        return new ReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder getTeamsDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder getTeamsDeviceUsageUserDetail(final String period) {
        return new ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder getTeamsDeviceUsageUserCounts(final String period) {
        return new ReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder getTeamsDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }

    public IReportRootGetM365AppUserDetailRequestBuilder getM365AppUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetM365AppUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppUserDetail"), getClient(), null, date);
    }

    public IReportRootGetM365AppUserDetailRequestBuilder getM365AppUserDetail(final String period) {
        return new ReportRootGetM365AppUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppUserDetail"), getClient(), null, period);
    }

    public IReportRootGetM365AppUserCountsRequestBuilder getM365AppUserCounts(final String period) {
        return new ReportRootGetM365AppUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppUserCounts"), getClient(), null, period);
    }

    public IReportRootGetM365AppPlatformUserCountsRequestBuilder getM365AppPlatformUserCounts(final String period) {
        return new ReportRootGetM365AppPlatformUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppPlatformUserCounts"), getClient(), null, period);
    }

    public IReportRootGetTenantSecureScoresRequestBuilder getTenantSecureScores(final Integer period) {
        return new ReportRootGetTenantSecureScoresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTenantSecureScores"), getClient(), null, period);
    }
}
