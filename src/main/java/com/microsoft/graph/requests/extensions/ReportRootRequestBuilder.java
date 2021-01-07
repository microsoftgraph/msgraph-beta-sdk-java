// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request Builder.
 */
public class ReportRootRequestBuilder extends BaseRequestBuilder<ReportRoot> {

    /**
     * The request builder for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootRequest instance
     */
    @Nonnull
    public ReportRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ReportRootRequest instance
     */
    @Nonnull
    public ReportRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ReportRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ApplicationSignInDetailedSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationSignInDetailedSummaryCollectionRequestBuilder applicationSignInDetailedSummary() {
        return new ApplicationSignInDetailedSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary"), getClient(), null);
    }

    /**
     * Gets a request builder for the ApplicationSignInDetailedSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary(@Nonnull final String id) {
        return new ApplicationSignInDetailedSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CredentialUserRegistrationDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CredentialUserRegistrationDetailsCollectionRequestBuilder credentialUserRegistrationDetails() {
        return new CredentialUserRegistrationDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the CredentialUserRegistrationDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails(@Nonnull final String id) {
        return new CredentialUserRegistrationDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserCredentialUsageDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCredentialUsageDetailsCollectionRequestBuilder userCredentialUsageDetails() {
        return new UserCredentialUsageDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserCredentialUsageDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails(@Nonnull final String id) {
        return new UserCredentialUsageDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageSummaryByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintUsageSummaryByPrinterCollectionRequestBuilder dailyPrintUsageSummariesByPrinter() {
        return new PrintUsageSummaryByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageSummaryByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintUsageSummaryByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter(@Nonnull final String id) {
        return new PrintUsageSummaryByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageSummaryByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintUsageSummaryByUserCollectionRequestBuilder dailyPrintUsageSummariesByUser() {
        return new PrintUsageSummaryByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageSummaryByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintUsageSummaryByUserRequestBuilder dailyPrintUsageSummariesByUser(@Nonnull final String id) {
        return new PrintUsageSummaryByUserRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageSummaryByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintUsageSummaryByPrinterCollectionRequestBuilder monthlyPrintUsageSummariesByPrinter() {
        return new PrintUsageSummaryByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageSummaryByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintUsageSummaryByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter(@Nonnull final String id) {
        return new PrintUsageSummaryByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageSummaryByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintUsageSummaryByUserCollectionRequestBuilder monthlyPrintUsageSummariesByUser() {
        return new PrintUsageSummaryByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageSummaryByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintUsageSummaryByUserRequestBuilder monthlyPrintUsageSummariesByUser(@Nonnull final String id) {
        return new PrintUsageSummaryByUserRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder getAzureADApplicationSignInSummary(@Nonnull final ReportRootGetAzureADApplicationSignInSummaryParameterSet parameters) {
        return new ReportRootGetAzureADApplicationSignInSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADApplicationSignInSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetAzureADFeatureUsageCollectionRequestBuilder getAzureADFeatureUsage(@Nonnull final ReportRootGetAzureADFeatureUsageParameterSet parameters) {
        return new ReportRootGetAzureADFeatureUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADFeatureUsage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetAzureADLicenseUsageCollectionRequestBuilder getAzureADLicenseUsage(@Nonnull final ReportRootGetAzureADLicenseUsageParameterSet parameters) {
        return new ReportRootGetAzureADLicenseUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADLicenseUsage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder getAzureADUserFeatureUsage() {
        return new ReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAzureADUserFeatureUsage"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetCredentialUsageSummaryCollectionRequestBuilder getCredentialUsageSummary(@Nonnull final ReportRootGetCredentialUsageSummaryParameterSet parameters) {
        return new ReportRootGetCredentialUsageSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCredentialUsageSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder getCredentialUserRegistrationCount() {
        return new ReportRootGetCredentialUserRegistrationCountCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCredentialUserRegistrationCount"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder getRelyingPartyDetailedSummary(@Nonnull final ReportRootGetRelyingPartyDetailedSummaryParameterSet parameters) {
        return new ReportRootGetRelyingPartyDetailedSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRelyingPartyDetailedSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new ReportRootDeviceConfigurationDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationDeviceActivity"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new ReportRootDeviceConfigurationUserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationUserActivity"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder managedDeviceEnrollmentAbandonmentDetails(@Nonnull final ReportRootManagedDeviceEnrollmentAbandonmentDetailsParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentAbandonmentDetails"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder managedDeviceEnrollmentAbandonmentSummary(@Nonnull final ReportRootManagedDeviceEnrollmentAbandonmentSummaryParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentAbandonmentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentAbandonmentSummary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(@Nonnull final ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder managedDeviceEnrollmentFailureTrends() {
        return new ReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureTrends"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(@Nonnull final ReportRootManagedDeviceEnrollmentTopFailuresParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityCountsCollectionRequestBuilder getEmailActivityCounts(@Nonnull final ReportRootGetEmailActivityCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserCountsCollectionRequestBuilder getEmailActivityUserCounts(@Nonnull final ReportRootGetEmailActivityUserCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserDetailCollectionRequestBuilder getEmailActivityUserDetail(@Nonnull final ReportRootGetEmailActivityUserDetailParameterSet parameters) {
        return new ReportRootGetEmailActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder getEmailAppUsageAppsUserCounts(@Nonnull final ReportRootGetEmailAppUsageAppsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder getEmailAppUsageUserCounts(@Nonnull final ReportRootGetEmailAppUsageUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder getEmailAppUsageUserDetail(@Nonnull final ReportRootGetEmailAppUsageUserDetailParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder getEmailAppUsageVersionsUserCounts(@Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetM365AppPlatformUserCountsRequestBuilder getM365AppPlatformUserCounts(@Nonnull final ReportRootGetM365AppPlatformUserCountsParameterSet parameters) {
        return new ReportRootGetM365AppPlatformUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppPlatformUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetM365AppUserCountsRequestBuilder getM365AppUserCounts(@Nonnull final ReportRootGetM365AppUserCountsParameterSet parameters) {
        return new ReportRootGetM365AppUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetM365AppUserDetailRequestBuilder getM365AppUserDetail(@Nonnull final ReportRootGetM365AppUserDetailParameterSet parameters) {
        return new ReportRootGetM365AppUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getM365AppUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageDetailCollectionRequestBuilder getMailboxUsageDetail(@Nonnull final ReportRootGetMailboxUsageDetailParameterSet parameters) {
        return new ReportRootGetMailboxUsageDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder getMailboxUsageMailboxCounts(@Nonnull final ReportRootGetMailboxUsageMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(@Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageStorageCollectionRequestBuilder getMailboxUsageStorage(@Nonnull final ReportRootGetMailboxUsageStorageParameterSet parameters) {
        return new ReportRootGetMailboxUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ReportRootGetOffice365ActivationCountsCollectionRequestBuilder getOffice365ActivationCounts() {
        return new ReportRootGetOffice365ActivationCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder getOffice365ActivationsUserCounts() {
        return new ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder getOffice365ActivationsUserDetail() {
        return new ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserDetail"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder getOffice365ActiveUserCounts(@Nonnull final ReportRootGetOffice365ActiveUserCountsParameterSet parameters) {
        return new ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder getOffice365ActiveUserDetail(@Nonnull final ReportRootGetOffice365ActiveUserDetailParameterSet parameters) {
        return new ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder getOffice365GroupsActivityCounts(@Nonnull final ReportRootGetOffice365GroupsActivityCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder getOffice365GroupsActivityDetail(@Nonnull final ReportRootGetOffice365GroupsActivityDetailParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder getOffice365GroupsActivityFileCounts(@Nonnull final ReportRootGetOffice365GroupsActivityFileCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder getOffice365GroupsActivityGroupCounts(@Nonnull final ReportRootGetOffice365GroupsActivityGroupCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityGroupCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder getOffice365GroupsActivityStorage(@Nonnull final ReportRootGetOffice365GroupsActivityStorageParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder getOffice365ServicesUserCounts(@Nonnull final ReportRootGetOffice365ServicesUserCountsParameterSet parameters) {
        return new ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ServicesUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder getOneDriveActivityFileCounts(@Nonnull final ReportRootGetOneDriveActivityFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder getOneDriveActivityUserCounts(@Nonnull final ReportRootGetOneDriveActivityUserCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder getOneDriveActivityUserDetail(@Nonnull final ReportRootGetOneDriveActivityUserDetailParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder getOneDriveUsageAccountCounts(@Nonnull final ReportRootGetOneDriveUsageAccountCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder getOneDriveUsageAccountDetail(@Nonnull final ReportRootGetOneDriveUsageAccountDetailParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder getOneDriveUsageFileCounts(@Nonnull final ReportRootGetOneDriveUsageFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageStorageCollectionRequestBuilder getOneDriveUsageStorage(@Nonnull final ReportRootGetOneDriveUsageStorageParameterSet parameters) {
        return new ReportRootGetOneDriveUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityFileCountsCollectionRequestBuilder getSharePointActivityFileCounts(@Nonnull final ReportRootGetSharePointActivityFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityPagesCollectionRequestBuilder getSharePointActivityPages(@Nonnull final ReportRootGetSharePointActivityPagesParameterSet parameters) {
        return new ReportRootGetSharePointActivityPagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserCountsCollectionRequestBuilder getSharePointActivityUserCounts(@Nonnull final ReportRootGetSharePointActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder getSharePointActivityUserDetail(@Nonnull final ReportRootGetSharePointActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder getSharePointSiteUsageDetail(@Nonnull final ReportRootGetSharePointSiteUsageDetailParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder getSharePointSiteUsageFileCounts(@Nonnull final ReportRootGetSharePointSiteUsageFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder getSharePointSiteUsagePages(@Nonnull final ReportRootGetSharePointSiteUsagePagesParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder getSharePointSiteUsageSiteCounts(@Nonnull final ReportRootGetSharePointSiteUsageSiteCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageSiteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder getSharePointSiteUsageStorage(@Nonnull final ReportRootGetSharePointSiteUsageStorageParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder getSkypeForBusinessActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder getSkypeForBusinessActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder getSkypeForBusinessActivityUserDetail(@Nonnull final ReportRootGetSkypeForBusinessActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder getTeamsDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder getTeamsDeviceUsageUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder getTeamsDeviceUsageUserDetail(@Nonnull final ReportRootGetTeamsDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityCountsCollectionRequestBuilder getTeamsUserActivityCounts(@Nonnull final ReportRootGetTeamsUserActivityCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder getTeamsUserActivityUserCounts(@Nonnull final ReportRootGetTeamsUserActivityUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder getTeamsUserActivityUserDetail(@Nonnull final ReportRootGetTeamsUserActivityUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityCountsCollectionRequestBuilder getYammerActivityCounts(@Nonnull final ReportRootGetYammerActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserCountsCollectionRequestBuilder getYammerActivityUserCounts(@Nonnull final ReportRootGetYammerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserDetailCollectionRequestBuilder getYammerActivityUserDetail(@Nonnull final ReportRootGetYammerActivityUserDetailParameterSet parameters) {
        return new ReportRootGetYammerActivityUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder getYammerDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder getYammerDeviceUsageUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder getYammerDeviceUsageUserDetail(@Nonnull final ReportRootGetYammerDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder getYammerGroupsActivityCounts(@Nonnull final ReportRootGetYammerGroupsActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder getYammerGroupsActivityDetail(@Nonnull final ReportRootGetYammerGroupsActivityDetailParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder getYammerGroupsActivityGroupCounts(@Nonnull final ReportRootGetYammerGroupsActivityGroupCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTenantSecureScoresRequestBuilder getTenantSecureScores(@Nonnull final ReportRootGetTenantSecureScoresParameterSet parameters) {
        return new ReportRootGetTenantSecureScoresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTenantSecureScores"), getClient(), null, parameters);
    }
}
