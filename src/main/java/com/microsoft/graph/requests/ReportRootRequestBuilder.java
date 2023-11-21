// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.ApplicationSignInSummary;
import com.microsoft.graph.models.CredentialUsageSummary;
import com.microsoft.graph.models.CredentialUserRegistrationCount;
import com.microsoft.graph.models.RelyingPartyDetailedSummary;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.models.Office365ActiveUserCounts;
import com.microsoft.graph.models.Office365ActiveUserDetail;
import com.microsoft.graph.models.Office365GroupsActivityCounts;
import com.microsoft.graph.models.Office365GroupsActivityDetail;
import com.microsoft.graph.models.Office365GroupsActivityFileCounts;
import com.microsoft.graph.models.Office365GroupsActivityGroupCounts;
import com.microsoft.graph.models.Office365GroupsActivityStorage;
import com.microsoft.graph.models.Office365ServicesUserCounts;
import com.microsoft.graph.models.ArchivedPrintJob;
import com.microsoft.graph.models.AttackSimulationRepeatOffender;
import com.microsoft.graph.models.AttackSimulationSimulationUserCoverage;
import com.microsoft.graph.models.AttackSimulationTrainingUserCoverage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ReportRootGetAzureADApplicationSignInSummaryParameterSet;
import com.microsoft.graph.models.ReportRootGetCredentialUsageSummaryParameterSet;
import com.microsoft.graph.models.ReportRootGetRelyingPartyDetailedSummaryParameterSet;
import com.microsoft.graph.models.ReportRootManagedDeviceEnrollmentAbandonmentDetailsParameterSet;
import com.microsoft.graph.models.ReportRootManagedDeviceEnrollmentAbandonmentSummaryParameterSet;
import com.microsoft.graph.models.ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet;
import com.microsoft.graph.models.ReportRootManagedDeviceEnrollmentTopFailuresParameterSet;
import com.microsoft.graph.models.ReportRootGetBrowserDistributionUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetBrowserUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetBrowserUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageAppsUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageVersionsUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetFormsUserActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetFormsUserActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetFormsUserActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetM365AppPlatformUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetM365AppUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetM365AppUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetMailboxUsageDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetMailboxUsageMailboxCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetMailboxUsageStorageParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365ActiveUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365ActiveUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityFileCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityStorageParameterSet;
import com.microsoft.graph.models.ReportRootGetOffice365ServicesUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveActivityFileCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveUsageAccountCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveUsageAccountDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveUsageFileCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetOneDriveUsageStorageParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointActivityFileCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointActivityPagesParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointSiteUsageDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointSiteUsageFileCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointSiteUsagePagesParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointSiteUsageSiteCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSharePointSiteUsageStorageParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageDistributionTotalUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageTotalUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsTeamActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsTeamActivityDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsTeamActivityDistributionCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsTeamCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityDistributionTotalUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityDistributionUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityTotalCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityTotalDistributionCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityTotalUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetTeamsUserActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerActivityUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerActivityUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerGroupsActivityCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerGroupsActivityDetailParameterSet;
import com.microsoft.graph.models.ReportRootGetYammerGroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.models.ReportRootGetGroupArchivedPrintJobsParameterSet;
import com.microsoft.graph.models.ReportRootGetPrinterArchivedPrintJobsParameterSet;
import com.microsoft.graph.models.ReportRootGetUserArchivedPrintJobsParameterSet;

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
    public ReportRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
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
        return new com.microsoft.graph.requests.ReportRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AppCredentialSignInActivity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppCredentialSignInActivityCollectionRequestBuilder appCredentialSignInActivities() {
        return new com.microsoft.graph.requests.AppCredentialSignInActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appCredentialSignInActivities"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppCredentialSignInActivity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppCredentialSignInActivityRequestBuilder appCredentialSignInActivities(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppCredentialSignInActivityRequestBuilder(getRequestUrlWithAdditionalSegment("appCredentialSignInActivities") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ApplicationSignInDetailedSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationSignInDetailedSummaryCollectionRequestBuilder applicationSignInDetailedSummary() {
        return new com.microsoft.graph.requests.ApplicationSignInDetailedSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary"), getClient(), null);
    }

    /**
     * Gets a request builder for the ApplicationSignInDetailedSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ApplicationSignInDetailedSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("applicationSignInDetailedSummary") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AuthenticationMethodsRoot
     *
     * @return the AuthenticationMethodsRootRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AuthenticationMethodsRootRequestBuilder authenticationMethods() {
        return new com.microsoft.graph.requests.AuthenticationMethodsRootRequestBuilder(getRequestUrlWithAdditionalSegment("authenticationMethods"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CredentialUserRegistrationDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.CredentialUserRegistrationDetailsCollectionRequestBuilder credentialUserRegistrationDetails() {
        return new com.microsoft.graph.requests.CredentialUserRegistrationDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the CredentialUserRegistrationDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.CredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails(@Nonnull final String id) {
        return new com.microsoft.graph.requests.CredentialUserRegistrationDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ServiceActivity
     *
     * @return the ServiceActivityRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceActivityRequestBuilder serviceActivity() {
        return new com.microsoft.graph.requests.ServiceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("serviceActivity"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipalSignInActivity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalSignInActivityCollectionRequestBuilder servicePrincipalSignInActivities() {
        return new com.microsoft.graph.requests.ServicePrincipalSignInActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("servicePrincipalSignInActivities"), getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipalSignInActivity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalSignInActivityRequestBuilder servicePrincipalSignInActivities(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServicePrincipalSignInActivityRequestBuilder(getRequestUrlWithAdditionalSegment("servicePrincipalSignInActivities") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ServiceLevelAgreementRoot
     *
     * @return the ServiceLevelAgreementRootRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceLevelAgreementRootRequestBuilder sla() {
        return new com.microsoft.graph.requests.ServiceLevelAgreementRootRequestBuilder(getRequestUrlWithAdditionalSegment("sla"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserCredentialUsageDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.UserCredentialUsageDetailsCollectionRequestBuilder userCredentialUsageDetails() {
        return new com.microsoft.graph.requests.UserCredentialUsageDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserCredentialUsageDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.UserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails(@Nonnull final String id) {
        return new com.microsoft.graph.requests.UserCredentialUsageDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("userCredentialUsageDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserInsightsRoot
     *
     * @return the UserInsightsRootRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserInsightsRootRequestBuilder userInsights() {
        return new com.microsoft.graph.requests.UserInsightsRootRequestBuilder(getRequestUrlWithAdditionalSegment("userInsights"), getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageCollectionRequestBuilder dailyPrintUsage() {
        return new com.microsoft.graph.requests.PrintUsageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsage"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageRequestBuilder dailyPrintUsage(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsage") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder dailyPrintUsageByPrinter() {
        return new com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder dailyPrintUsageByUser() {
        return new com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserRequestBuilder dailyPrintUsageByUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByUserRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageByUser") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder dailyPrintUsageSummariesByPrinter() {
        return new com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder dailyPrintUsageSummariesByUser() {
        return new com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserRequestBuilder dailyPrintUsageSummariesByUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByUserRequestBuilder(getRequestUrlWithAdditionalSegment("dailyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder monthlyPrintUsageByPrinter() {
        return new com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder monthlyPrintUsageByUser() {
        return new com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserRequestBuilder monthlyPrintUsageByUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByUserRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageByUser") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByPrinter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder monthlyPrintUsageSummariesByPrinter() {
        return new com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByPrinter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByPrinter") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintUsageByUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder monthlyPrintUsageSummariesByUser() {
        return new com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintUsageByUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrintUsageByUserRequestBuilder monthlyPrintUsageSummariesByUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrintUsageByUserRequestBuilder(getRequestUrlWithAdditionalSegment("monthlyPrintUsageSummariesByUser") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SecurityReportsRoot
     *
     * @return the SecurityReportsRootRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.SecurityReportsRootRequestBuilder security() {
        return new com.microsoft.graph.requests.SecurityReportsRootRequestBuilder(getRequestUrlWithAdditionalSegment("security"), getClient(), null);
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
     * Metadata for the device configuration device activity report
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new ReportRootDeviceConfigurationDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationDeviceActivity"), getClient(), null);
    }

    /**
     * Metadata for the device configuration user activity report
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new ReportRootDeviceConfigurationUserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationUserActivity"), getClient(), null);
    }

    /**
     * Metadata for Enrollment abandonment details report
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder managedDeviceEnrollmentAbandonmentDetails(@Nonnull final ReportRootManagedDeviceEnrollmentAbandonmentDetailsParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentAbandonmentDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentAbandonmentDetails"), getClient(), null, parameters);
    }

    /**
     * Metadata for Enrollment abandonment summary report
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
     * Metadata for the enrollment failure trends report
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
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetBrowserDistributionUserCountsRequestBuilder getBrowserDistributionUserCounts(@Nonnull final ReportRootGetBrowserDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetBrowserDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getBrowserDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetBrowserUserCountsRequestBuilder getBrowserUserCounts(@Nonnull final ReportRootGetBrowserUserCountsParameterSet parameters) {
        return new ReportRootGetBrowserUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getBrowserUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetBrowserUserDetailRequestBuilder getBrowserUserDetail(@Nonnull final ReportRootGetBrowserUserDetailParameterSet parameters) {
        return new ReportRootGetBrowserUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getBrowserUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityCountsRequestBuilder getEmailActivityCounts(@Nonnull final ReportRootGetEmailActivityCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserCountsRequestBuilder getEmailActivityUserCounts(@Nonnull final ReportRootGetEmailActivityUserCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(@Nonnull final ReportRootGetEmailActivityUserDetailParameterSet parameters) {
        return new ReportRootGetEmailActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getEmailAppUsageAppsUserCounts(@Nonnull final ReportRootGetEmailAppUsageAppsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserCountsRequestBuilder getEmailAppUsageUserCounts(@Nonnull final ReportRootGetEmailAppUsageUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(@Nonnull final ReportRootGetEmailAppUsageUserDetailParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getEmailAppUsageVersionsUserCounts(@Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetFormsUserActivityCountsRequestBuilder getFormsUserActivityCounts(@Nonnull final ReportRootGetFormsUserActivityCountsParameterSet parameters) {
        return new ReportRootGetFormsUserActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFormsUserActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetFormsUserActivityUserCountsRequestBuilder getFormsUserActivityUserCounts(@Nonnull final ReportRootGetFormsUserActivityUserCountsParameterSet parameters) {
        return new ReportRootGetFormsUserActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFormsUserActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetFormsUserActivityUserDetailRequestBuilder getFormsUserActivityUserDetail(@Nonnull final ReportRootGetFormsUserActivityUserDetailParameterSet parameters) {
        return new ReportRootGetFormsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFormsUserActivityUserDetail"), getClient(), null, parameters);
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
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageDetailRequestBuilder getMailboxUsageDetail(@Nonnull final ReportRootGetMailboxUsageDetailParameterSet parameters) {
        return new ReportRootGetMailboxUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageMailboxCountsRequestBuilder getMailboxUsageMailboxCounts(@Nonnull final ReportRootGetMailboxUsageMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(@Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageStorageRequestBuilder getMailboxUsageStorage(@Nonnull final ReportRootGetMailboxUsageStorageParameterSet parameters) {
        return new ReportRootGetMailboxUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new ReportRootGetOffice365ActivationCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new ReportRootGetOffice365ActivationsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new ReportRootGetOffice365ActivationsUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserDetail"), getClient(), null);
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
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityFileCountsRequestBuilder getOneDriveActivityFileCounts(@Nonnull final ReportRootGetOneDriveActivityFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserCountsRequestBuilder getOneDriveActivityUserCounts(@Nonnull final ReportRootGetOneDriveActivityUserCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(@Nonnull final ReportRootGetOneDriveActivityUserDetailParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountCountsRequestBuilder getOneDriveUsageAccountCounts(@Nonnull final ReportRootGetOneDriveUsageAccountCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(@Nonnull final ReportRootGetOneDriveUsageAccountDetailParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageFileCountsRequestBuilder getOneDriveUsageFileCounts(@Nonnull final ReportRootGetOneDriveUsageFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageStorageRequestBuilder getOneDriveUsageStorage(@Nonnull final ReportRootGetOneDriveUsageStorageParameterSet parameters) {
        return new ReportRootGetOneDriveUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityFileCountsRequestBuilder getSharePointActivityFileCounts(@Nonnull final ReportRootGetSharePointActivityFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityPagesRequestBuilder getSharePointActivityPages(@Nonnull final ReportRootGetSharePointActivityPagesParameterSet parameters) {
        return new ReportRootGetSharePointActivityPagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserCountsRequestBuilder getSharePointActivityUserCounts(@Nonnull final ReportRootGetSharePointActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(@Nonnull final ReportRootGetSharePointActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(@Nonnull final ReportRootGetSharePointSiteUsageDetailParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageFileCountsRequestBuilder getSharePointSiteUsageFileCounts(@Nonnull final ReportRootGetSharePointSiteUsageFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsagePagesRequestBuilder getSharePointSiteUsagePages(@Nonnull final ReportRootGetSharePointSiteUsagePagesParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsagePagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getSharePointSiteUsageSiteCounts(@Nonnull final ReportRootGetSharePointSiteUsageSiteCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageStorageRequestBuilder getSharePointSiteUsageStorage(@Nonnull final ReportRootGetSharePointSiteUsageStorageParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityCountsRequestBuilder getSkypeForBusinessActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getSkypeForBusinessActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(@Nonnull final ReportRootGetSkypeForBusinessActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getSkypeForBusinessOrganizerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getSkypeForBusinessParticipantActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionTotalUserCountsRequestBuilder getTeamsDeviceUsageDistributionTotalUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageDistributionTotalUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageDistributionTotalUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionTotalUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getTeamsDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageTotalUserCountsRequestBuilder getTeamsDeviceUsageTotalUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageTotalUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageTotalUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageTotalUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getTeamsDeviceUsageUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(@Nonnull final ReportRootGetTeamsDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsTeamActivityCountsRequestBuilder getTeamsTeamActivityCounts(@Nonnull final ReportRootGetTeamsTeamActivityCountsParameterSet parameters) {
        return new ReportRootGetTeamsTeamActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsTeamActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsTeamActivityDetailRequestBuilder getTeamsTeamActivityDetail(@Nonnull final ReportRootGetTeamsTeamActivityDetailParameterSet parameters) {
        return new ReportRootGetTeamsTeamActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsTeamActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsTeamActivityDistributionCountsRequestBuilder getTeamsTeamActivityDistributionCounts(@Nonnull final ReportRootGetTeamsTeamActivityDistributionCountsParameterSet parameters) {
        return new ReportRootGetTeamsTeamActivityDistributionCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsTeamActivityDistributionCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsTeamCountsRequestBuilder getTeamsTeamCounts(@Nonnull final ReportRootGetTeamsTeamCountsParameterSet parameters) {
        return new ReportRootGetTeamsTeamCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsTeamCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityCountsRequestBuilder getTeamsUserActivityCounts(@Nonnull final ReportRootGetTeamsUserActivityCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityDistributionTotalUserCountsRequestBuilder getTeamsUserActivityDistributionTotalUserCounts(@Nonnull final ReportRootGetTeamsUserActivityDistributionTotalUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityDistributionTotalUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityDistributionTotalUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityDistributionUserCountsRequestBuilder getTeamsUserActivityDistributionUserCounts(@Nonnull final ReportRootGetTeamsUserActivityDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityTotalCountsRequestBuilder getTeamsUserActivityTotalCounts(@Nonnull final ReportRootGetTeamsUserActivityTotalCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityTotalCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityTotalCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityTotalDistributionCountsRequestBuilder getTeamsUserActivityTotalDistributionCounts(@Nonnull final ReportRootGetTeamsUserActivityTotalDistributionCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityTotalDistributionCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityTotalDistributionCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityTotalUserCountsRequestBuilder getTeamsUserActivityTotalUserCounts(@Nonnull final ReportRootGetTeamsUserActivityTotalUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityTotalUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityTotalUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserCountsRequestBuilder getTeamsUserActivityUserCounts(@Nonnull final ReportRootGetTeamsUserActivityUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(@Nonnull final ReportRootGetTeamsUserActivityUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityCountsRequestBuilder getYammerActivityCounts(@Nonnull final ReportRootGetYammerActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserCountsRequestBuilder getYammerActivityUserCounts(@Nonnull final ReportRootGetYammerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(@Nonnull final ReportRootGetYammerActivityUserDetailParameterSet parameters) {
        return new ReportRootGetYammerActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getYammerDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsRequestBuilder getYammerDeviceUsageUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(@Nonnull final ReportRootGetYammerDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityCountsRequestBuilder getYammerGroupsActivityCounts(@Nonnull final ReportRootGetYammerGroupsActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(@Nonnull final ReportRootGetYammerGroupsActivityDetailParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getYammerGroupsActivityGroupCounts(@Nonnull final ReportRootGetYammerGroupsActivityGroupCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, parameters);
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
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder getPrinterArchivedPrintJobs(@Nonnull final ReportRootGetPrinterArchivedPrintJobsParameterSet parameters) {
        return new ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPrinterArchivedPrintJobs"), getClient(), null, parameters);
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
     * @return the request builder collection
     * @deprecated This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API.
     */
    @Deprecated
    @Nonnull
    public ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder getAttackSimulationRepeatOffenders() {
        return new ReportRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAttackSimulationRepeatOffenders"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @deprecated This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API.
     */
    @Deprecated
    @Nonnull
    public ReportRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder getAttackSimulationSimulationUserCoverage() {
        return new ReportRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAttackSimulationSimulationUserCoverage"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @deprecated This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API.
     */
    @Deprecated
    @Nonnull
    public ReportRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder getAttackSimulationTrainingUserCoverage() {
        return new ReportRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAttackSimulationTrainingUserCoverage"), getClient(), null);
    }
}
