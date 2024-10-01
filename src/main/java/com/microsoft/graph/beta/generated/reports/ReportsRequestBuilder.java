package com.microsoft.graph.beta.reports;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.ReportRoot;
import com.microsoft.graph.beta.reports.appcredentialsigninactivities.AppCredentialSignInActivitiesRequestBuilder;
import com.microsoft.graph.beta.reports.applicationsignindetailedsummary.ApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.beta.reports.authenticationmethods.AuthenticationMethodsRequestBuilder;
import com.microsoft.graph.beta.reports.credentialuserregistrationdetails.CredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.beta.reports.dailyprintusage.DailyPrintUsageRequestBuilder;
import com.microsoft.graph.beta.reports.dailyprintusagebyprinter.DailyPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.beta.reports.dailyprintusagebyuser.DailyPrintUsageByUserRequestBuilder;
import com.microsoft.graph.beta.reports.dailyprintusagesummariesbyprinter.DailyPrintUsageSummariesByPrinterRequestBuilder;
import com.microsoft.graph.beta.reports.dailyprintusagesummariesbyuser.DailyPrintUsageSummariesByUserRequestBuilder;
import com.microsoft.graph.beta.reports.deviceconfigurationdeviceactivity.DeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.beta.reports.deviceconfigurationuseractivity.DeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.beta.reports.getattacksimulationrepeatoffenders.GetAttackSimulationRepeatOffendersRequestBuilder;
import com.microsoft.graph.beta.reports.getattacksimulationsimulationusercoverage.GetAttackSimulationSimulationUserCoverageRequestBuilder;
import com.microsoft.graph.beta.reports.getattacksimulationtrainingusercoverage.GetAttackSimulationTrainingUserCoverageRequestBuilder;
import com.microsoft.graph.beta.reports.getazureadapplicationsigninsummarywithperiod.GetAzureADApplicationSignInSummaryWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getbrowserdistributionusercountswithperiod.GetBrowserDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getbrowserusercountswithperiod.GetBrowserUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getbrowseruserdetailwithperiod.GetBrowserUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getcredentialusagesummarywithperiod.GetCredentialUsageSummaryWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getcredentialuserregistrationcount.GetCredentialUserRegistrationCountRequestBuilder;
import com.microsoft.graph.beta.reports.getemailactivitycountswithperiod.GetEmailActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailactivityusercountswithperiod.GetEmailActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailactivityuserdetailwithdate.GetEmailActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getemailactivityuserdetailwithperiod.GetEmailActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailappusageappsusercountswithperiod.GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailappusageusercountswithperiod.GetEmailAppUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailappusageuserdetailwithdate.GetEmailAppUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getemailappusageuserdetailwithperiod.GetEmailAppUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getemailappusageversionsusercountswithperiod.GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getformsuseractivitycountswithperiod.GetFormsUserActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getformsuseractivityusercountswithperiod.GetFormsUserActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getformsuseractivityuserdetailwithdate.GetFormsUserActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getformsuseractivityuserdetailwithperiod.GetFormsUserActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getgrouparchivedprintjobswithgroupidwithstartdatetimewithenddatetime.GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.beta.reports.getm365appplatformusercountswithperiod.GetM365AppPlatformUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getm365appusercountswithperiod.GetM365AppUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getm365appuserdetailwithdate.GetM365AppUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getm365appuserdetailwithperiod.GetM365AppUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmailboxusagedetailwithperiod.GetMailboxUsageDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmailboxusagemailboxcountswithperiod.GetMailboxUsageMailboxCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmailboxusagequotastatusmailboxcountswithperiod.GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmailboxusagestoragewithperiod.GetMailboxUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmicrosoft365copilotusageuserdetailwithperiod.GetMicrosoft365CopilotUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmicrosoft365copilotusercountsummarywithperiod.GetMicrosoft365CopilotUserCountSummaryWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getmicrosoft365copilotusercounttrendwithperiod.GetMicrosoft365CopilotUserCountTrendWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activationcounts.GetOffice365ActivationCountsRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activationsusercounts.GetOffice365ActivationsUserCountsRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activationsuserdetail.GetOffice365ActivationsUserDetailRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activeusercountswithperiod.GetOffice365ActiveUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activeuserdetailwithdate.GetOffice365ActiveUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365activeuserdetailwithperiod.GetOffice365ActiveUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivitycountswithperiod.GetOffice365GroupsActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivitydetailwithdate.GetOffice365GroupsActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivitydetailwithperiod.GetOffice365GroupsActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivityfilecountswithperiod.GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivitygroupcountswithperiod.GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365groupsactivitystoragewithperiod.GetOffice365GroupsActivityStorageWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getoffice365servicesusercountswithperiod.GetOffice365ServicesUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveactivityfilecountswithperiod.GetOneDriveActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveactivityusercountswithperiod.GetOneDriveActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveactivityuserdetailwithdate.GetOneDriveActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveactivityuserdetailwithperiod.GetOneDriveActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveusageaccountcountswithperiod.GetOneDriveUsageAccountCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveusageaccountdetailwithdate.GetOneDriveUsageAccountDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveusageaccountdetailwithperiod.GetOneDriveUsageAccountDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveusagefilecountswithperiod.GetOneDriveUsageFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getonedriveusagestoragewithperiod.GetOneDriveUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getprinterarchivedprintjobswithprinteridwithstartdatetimewithenddatetime.GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.beta.reports.getrelyingpartydetailedsummarywithperiod.GetRelyingPartyDetailedSummaryWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointactivityfilecountswithperiod.GetSharePointActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointactivitypageswithperiod.GetSharePointActivityPagesWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointactivityusercountswithperiod.GetSharePointActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointactivityuserdetailwithdate.GetSharePointActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointactivityuserdetailwithperiod.GetSharePointActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagedetailwithdate.GetSharePointSiteUsageDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagedetailwithperiod.GetSharePointSiteUsageDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagefilecountswithperiod.GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagepageswithperiod.GetSharePointSiteUsagePagesWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagesitecountswithperiod.GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getsharepointsiteusagestoragewithperiod.GetSharePointSiteUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessactivitycountswithperiod.GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessactivityusercountswithperiod.GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessactivityuserdetailwithdate.GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessactivityuserdetailwithperiod.GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessdeviceusagedistributionusercountswithperiod.GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessdeviceusageusercountswithperiod.GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessdeviceusageuserdetailwithdate.GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessdeviceusageuserdetailwithperiod.GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessorganizeractivitycountswithperiod.GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessorganizeractivityminutecountswithperiod.GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessorganizeractivityusercountswithperiod.GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessparticipantactivitycountswithperiod.GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessparticipantactivityminutecountswithperiod.GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinessparticipantactivityusercountswithperiod.GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinesspeertopeeractivitycountswithperiod.GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinesspeertopeeractivityminutecountswithperiod.GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getskypeforbusinesspeertopeeractivityusercountswithperiod.GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusagedistributiontotalusercountswithperiod.GetTeamsDeviceUsageDistributionTotalUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusagedistributionusercountswithperiod.GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusagetotalusercountswithperiod.GetTeamsDeviceUsageTotalUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusageusercountswithperiod.GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusageuserdetailwithdate.GetTeamsDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsdeviceusageuserdetailwithperiod.GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsteamactivitycountswithperiod.GetTeamsTeamActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsteamactivitydetailwithdate.GetTeamsTeamActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsteamactivitydetailwithperiod.GetTeamsTeamActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsteamactivitydistributioncountswithperiod.GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsteamcountswithperiod.GetTeamsTeamCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitycountswithperiod.GetTeamsUserActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitydistributiontotalusercountswithperiod.GetTeamsUserActivityDistributionTotalUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitydistributionusercountswithperiod.GetTeamsUserActivityDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitytotalcountswithperiod.GetTeamsUserActivityTotalCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitytotaldistributioncountswithperiod.GetTeamsUserActivityTotalDistributionCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivitytotalusercountswithperiod.GetTeamsUserActivityTotalUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivityusercountswithperiod.GetTeamsUserActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivityuserdetailwithdate.GetTeamsUserActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getteamsuseractivityuserdetailwithperiod.GetTeamsUserActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getuserarchivedprintjobswithuseridwithstartdatetimewithenddatetime.GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.beta.reports.getyammeractivitycountswithperiod.GetYammerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammeractivityusercountswithperiod.GetYammerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammeractivityuserdetailwithdate.GetYammerActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getyammeractivityuserdetailwithperiod.GetYammerActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammerdeviceusagedistributionusercountswithperiod.GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammerdeviceusageusercountswithperiod.GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammerdeviceusageuserdetailwithdate.GetYammerDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getyammerdeviceusageuserdetailwithperiod.GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammergroupsactivitycountswithperiod.GetYammerGroupsActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammergroupsactivitydetailwithdate.GetYammerGroupsActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.beta.reports.getyammergroupsactivitydetailwithperiod.GetYammerGroupsActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.getyammergroupsactivitygroupcountswithperiod.GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.healthmonitoring.HealthMonitoringRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmentabandonmentdetailswithskipwithtopwithfilterwithskiptoken.ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmentabandonmentsummarywithskipwithtopwithfilterwithskiptoken.ManagedDeviceEnrollmentAbandonmentSummaryWithSkipWithTopWithFilterWithSkipTokenRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmentfailuredetails.ManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmentfailuredetailswithskipwithtopwithfilterwithskiptoken.ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmentfailuretrends.ManagedDeviceEnrollmentFailureTrendsRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmenttopfailures.ManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.beta.reports.manageddeviceenrollmenttopfailureswithperiod.ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder;
import com.microsoft.graph.beta.reports.monthlyprintusagebyprinter.MonthlyPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.beta.reports.monthlyprintusagebyuser.MonthlyPrintUsageByUserRequestBuilder;
import com.microsoft.graph.beta.reports.monthlyprintusagesummariesbyprinter.MonthlyPrintUsageSummariesByPrinterRequestBuilder;
import com.microsoft.graph.beta.reports.monthlyprintusagesummariesbyuser.MonthlyPrintUsageSummariesByUserRequestBuilder;
import com.microsoft.graph.beta.reports.partners.PartnersRequestBuilder;
import com.microsoft.graph.beta.reports.security.SecurityRequestBuilder;
import com.microsoft.graph.beta.reports.serviceactivity.ServiceActivityRequestBuilder;
import com.microsoft.graph.beta.reports.serviceprincipalsigninactivities.ServicePrincipalSignInActivitiesRequestBuilder;
import com.microsoft.graph.beta.reports.sla.SlaRequestBuilder;
import com.microsoft.graph.beta.reports.usercredentialusagedetails.UserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.beta.reports.userinsights.UserInsightsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reportRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appCredentialSignInActivities property of the microsoft.graph.reportRoot entity.
     * @return a {@link AppCredentialSignInActivitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppCredentialSignInActivitiesRequestBuilder appCredentialSignInActivities() {
        return new AppCredentialSignInActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the applicationSignInDetailedSummary property of the microsoft.graph.reportRoot entity.
     * @return a {@link ApplicationSignInDetailedSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary() {
        return new ApplicationSignInDetailedSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethods property of the microsoft.graph.reportRoot entity.
     * @return a {@link AuthenticationMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authenticationMethods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the credentialUserRegistrationDetails property of the microsoft.graph.reportRoot entity.
     * @return a {@link CredentialUserRegistrationDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails() {
        return new CredentialUserRegistrationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsage property of the microsoft.graph.reportRoot entity.
     * @return a {@link DailyPrintUsageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageRequestBuilder dailyPrintUsage() {
        return new DailyPrintUsageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     * @return a {@link DailyPrintUsageByPrinterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter() {
        return new DailyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     * @return a {@link DailyPrintUsageByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageByUserRequestBuilder dailyPrintUsageByUser() {
        return new DailyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageSummariesByPrinter property of the microsoft.graph.reportRoot entity.
     * @return a {@link DailyPrintUsageSummariesByPrinterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageSummariesByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter() {
        return new DailyPrintUsageSummariesByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageSummariesByUser property of the microsoft.graph.reportRoot entity.
     * @return a {@link DailyPrintUsageSummariesByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageSummariesByUserRequestBuilder dailyPrintUsageSummariesByUser() {
        return new DailyPrintUsageSummariesByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deviceConfigurationDeviceActivity method.
     * @return a {@link DeviceConfigurationDeviceActivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new DeviceConfigurationDeviceActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deviceConfigurationUserActivity method.
     * @return a {@link DeviceConfigurationUserActivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new DeviceConfigurationUserActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAttackSimulationRepeatOffenders method.
     * @return a {@link GetAttackSimulationRepeatOffendersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationRepeatOffendersRequestBuilder getAttackSimulationRepeatOffenders() {
        return new GetAttackSimulationRepeatOffendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAttackSimulationSimulationUserCoverage method.
     * @return a {@link GetAttackSimulationSimulationUserCoverageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationSimulationUserCoverageRequestBuilder getAttackSimulationSimulationUserCoverage() {
        return new GetAttackSimulationSimulationUserCoverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAttackSimulationTrainingUserCoverage method.
     * @return a {@link GetAttackSimulationTrainingUserCoverageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationTrainingUserCoverageRequestBuilder getAttackSimulationTrainingUserCoverage() {
        return new GetAttackSimulationTrainingUserCoverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCredentialUserRegistrationCount method.
     * @return a {@link GetCredentialUserRegistrationCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCredentialUserRegistrationCountRequestBuilder getCredentialUserRegistrationCount() {
        return new GetCredentialUserRegistrationCountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationCounts method.
     * @return a {@link GetOffice365ActivationCountsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new GetOffice365ActivationCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationsUserCounts method.
     * @return a {@link GetOffice365ActivationsUserCountsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new GetOffice365ActivationsUserCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationsUserDetail method.
     * @return a {@link GetOffice365ActivationsUserDetailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new GetOffice365ActivationsUserDetailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the healthMonitoring property of the microsoft.graph.reportRoot entity.
     * @return a {@link HealthMonitoringRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HealthMonitoringRequestBuilder healthMonitoring() {
        return new HealthMonitoringRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureDetails method.
     * @return a {@link ManagedDeviceEnrollmentFailureDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ManagedDeviceEnrollmentFailureDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureTrends method.
     * @return a {@link ManagedDeviceEnrollmentFailureTrendsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureTrendsRequestBuilder managedDeviceEnrollmentFailureTrends() {
        return new ManagedDeviceEnrollmentFailureTrendsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentTopFailures method.
     * @return a {@link ManagedDeviceEnrollmentTopFailuresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ManagedDeviceEnrollmentTopFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     * @return a {@link MonthlyPrintUsageByPrinterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter() {
        return new MonthlyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     * @return a {@link MonthlyPrintUsageByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageByUserRequestBuilder monthlyPrintUsageByUser() {
        return new MonthlyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageSummariesByPrinter property of the microsoft.graph.reportRoot entity.
     * @return a {@link MonthlyPrintUsageSummariesByPrinterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageSummariesByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter() {
        return new MonthlyPrintUsageSummariesByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageSummariesByUser property of the microsoft.graph.reportRoot entity.
     * @return a {@link MonthlyPrintUsageSummariesByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageSummariesByUserRequestBuilder monthlyPrintUsageSummariesByUser() {
        return new MonthlyPrintUsageSummariesByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the partners property of the microsoft.graph.reportRoot entity.
     * @return a {@link PartnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PartnersRequestBuilder partners() {
        return new PartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security property of the microsoft.graph.reportRoot entity.
     * @return a {@link SecurityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the serviceActivity property of the microsoft.graph.reportRoot entity.
     * @return a {@link ServiceActivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceActivityRequestBuilder serviceActivity() {
        return new ServiceActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the servicePrincipalSignInActivities property of the microsoft.graph.reportRoot entity.
     * @return a {@link ServicePrincipalSignInActivitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalSignInActivitiesRequestBuilder servicePrincipalSignInActivities() {
        return new ServicePrincipalSignInActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sla property of the microsoft.graph.reportRoot entity.
     * @return a {@link SlaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SlaRequestBuilder sla() {
        return new SlaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userCredentialUsageDetails property of the microsoft.graph.reportRoot entity.
     * @return a {@link UserCredentialUsageDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails() {
        return new UserCredentialUsageDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userInsights property of the microsoft.graph.reportRoot entity.
     * @return a {@link UserInsightsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserInsightsRequestBuilder userInsights() {
        return new UserInsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ReportsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReportsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get reports
     * @return a {@link ReportRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ReportRoot get() {
        return get(null);
    }
    /**
     * Get reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReportRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ReportRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportRoot::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getAzureADApplicationSignInSummary method.
     * @param period Usage: period='{period}'
     * @return a {@link GetAzureADApplicationSignInSummaryWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAzureADApplicationSignInSummaryWithPeriodRequestBuilder getAzureADApplicationSignInSummaryWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetAzureADApplicationSignInSummaryWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getBrowserDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetBrowserDistributionUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBrowserDistributionUserCountsWithPeriodRequestBuilder getBrowserDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetBrowserDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getBrowserUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetBrowserUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBrowserUserCountsWithPeriodRequestBuilder getBrowserUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetBrowserUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getBrowserUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetBrowserUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBrowserUserDetailWithPeriodRequestBuilder getBrowserUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetBrowserUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getCredentialUsageSummary method.
     * @param period Usage: period='{period}'
     * @return a {@link GetCredentialUsageSummaryWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCredentialUsageSummaryWithPeriodRequestBuilder getCredentialUsageSummaryWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetCredentialUsageSummaryWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityCountsWithPeriodRequestBuilder getEmailActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserCountsWithPeriodRequestBuilder getEmailActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetEmailActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserDetailWithDateRequestBuilder getEmailActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserDetailWithPeriodRequestBuilder getEmailActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageAppsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder getEmailAppUsageAppsUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailAppUsageUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserCountsWithPeriodRequestBuilder getEmailAppUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetEmailAppUsageUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithDateRequestBuilder getEmailAppUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailAppUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailAppUsageUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithPeriodRequestBuilder getEmailAppUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageVersionsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder getEmailAppUsageVersionsUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getFormsUserActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetFormsUserActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFormsUserActivityCountsWithPeriodRequestBuilder getFormsUserActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetFormsUserActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getFormsUserActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetFormsUserActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFormsUserActivityUserCountsWithPeriodRequestBuilder getFormsUserActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetFormsUserActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getFormsUserActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetFormsUserActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFormsUserActivityUserDetailWithDateRequestBuilder getFormsUserActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetFormsUserActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getFormsUserActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetFormsUserActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFormsUserActivityUserDetailWithPeriodRequestBuilder getFormsUserActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetFormsUserActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getGroupArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param groupId Usage: groupId='{groupId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder getGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final String groupId, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(groupId);
        Objects.requireNonNull(startDateTime);
        return new GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, groupId, startDateTime);
    }
    /**
     * Provides operations to call the getM365AppPlatformUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetM365AppPlatformUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetM365AppPlatformUserCountsWithPeriodRequestBuilder getM365AppPlatformUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppPlatformUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetM365AppUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserCountsWithPeriodRequestBuilder getM365AppUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetM365AppUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserDetailWithDateRequestBuilder getM365AppUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetM365AppUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetM365AppUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserDetailWithPeriodRequestBuilder getM365AppUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMailboxUsageDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageDetailWithPeriodRequestBuilder getMailboxUsageDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMailboxUsageMailboxCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageMailboxCountsWithPeriodRequestBuilder getMailboxUsageMailboxCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageQuotaStatusMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder getMailboxUsageQuotaStatusMailboxCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMailboxUsageStorageWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageStorageWithPeriodRequestBuilder getMailboxUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMicrosoft365CopilotUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMicrosoft365CopilotUsageUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMicrosoft365CopilotUsageUserDetailWithPeriodRequestBuilder getMicrosoft365CopilotUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMicrosoft365CopilotUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMicrosoft365CopilotUserCountSummary method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMicrosoft365CopilotUserCountSummaryWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMicrosoft365CopilotUserCountSummaryWithPeriodRequestBuilder getMicrosoft365CopilotUserCountSummaryWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMicrosoft365CopilotUserCountSummaryWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMicrosoft365CopilotUserCountTrend method.
     * @param period Usage: period='{period}'
     * @return a {@link GetMicrosoft365CopilotUserCountTrendWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMicrosoft365CopilotUserCountTrendWithPeriodRequestBuilder getMicrosoft365CopilotUserCountTrendWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMicrosoft365CopilotUserCountTrendWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365ActiveUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserCountsWithPeriodRequestBuilder getOffice365ActiveUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetOffice365ActiveUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithDateRequestBuilder getOffice365ActiveUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365ActiveUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365ActiveUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithPeriodRequestBuilder getOffice365ActiveUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365GroupsActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityCountsWithPeriodRequestBuilder getOffice365GroupsActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetOffice365GroupsActivityDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder getOffice365GroupsActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365GroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365GroupsActivityDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithPeriodRequestBuilder getOffice365GroupsActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder getOffice365GroupsActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder getOffice365GroupsActivityGroupCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityStorage method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365GroupsActivityStorageWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityStorageWithPeriodRequestBuilder getOffice365GroupsActivityStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ServicesUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOffice365ServicesUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ServicesUserCountsWithPeriodRequestBuilder getOffice365ServicesUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ServicesUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveActivityFileCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityFileCountsWithPeriodRequestBuilder getOneDriveActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserCountsWithPeriodRequestBuilder getOneDriveActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetOneDriveActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithDateRequestBuilder getOneDriveActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithPeriodRequestBuilder getOneDriveActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveUsageAccountCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountCountsWithPeriodRequestBuilder getOneDriveUsageAccountCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetOneDriveUsageAccountDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithDateRequestBuilder getOneDriveUsageAccountDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveUsageAccountDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveUsageAccountDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithPeriodRequestBuilder getOneDriveUsageAccountDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveUsageFileCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageFileCountsWithPeriodRequestBuilder getOneDriveUsageFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a {@link GetOneDriveUsageStorageWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageStorageWithPeriodRequestBuilder getOneDriveUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getPrinterArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param printerId Usage: printerId='{printerId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder getPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final String printerId, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(printerId);
        Objects.requireNonNull(startDateTime);
        return new GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, printerId, startDateTime);
    }
    /**
     * Provides operations to call the getRelyingPartyDetailedSummary method.
     * @param period Usage: period='{period}'
     * @return a {@link GetRelyingPartyDetailedSummaryWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetRelyingPartyDetailedSummaryWithPeriodRequestBuilder getRelyingPartyDetailedSummaryWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetRelyingPartyDetailedSummaryWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointActivityFileCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityFileCountsWithPeriodRequestBuilder getSharePointActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityPages method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointActivityPagesWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityPagesWithPeriodRequestBuilder getSharePointActivityPagesWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityPagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserCountsWithPeriodRequestBuilder getSharePointActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetSharePointActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserDetailWithDateRequestBuilder getSharePointActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserDetailWithPeriodRequestBuilder getSharePointActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetSharePointSiteUsageDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithDateRequestBuilder getSharePointSiteUsageDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointSiteUsageDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointSiteUsageDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithPeriodRequestBuilder getSharePointSiteUsageDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder getSharePointSiteUsageFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsagePages method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointSiteUsagePagesWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsagePagesWithPeriodRequestBuilder getSharePointSiteUsagePagesWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsagePagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageSiteCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder getSharePointSiteUsageSiteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSharePointSiteUsageStorageWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageStorageWithPeriodRequestBuilder getSharePointSiteUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder getSkypeForBusinessActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder getSkypeForBusinessActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder getSkypeForBusinessActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageDistributionTotalUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsDeviceUsageDistributionTotalUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageDistributionTotalUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageDistributionTotalUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageDistributionTotalUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageTotalUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsDeviceUsageTotalUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageTotalUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageTotalUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageTotalUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetTeamsDeviceUsageUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithDateRequestBuilder getTeamsDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder getTeamsDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsTeamActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityCountsWithPeriodRequestBuilder getTeamsTeamActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetTeamsTeamActivityDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDetailWithDateRequestBuilder getTeamsTeamActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsTeamActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsTeamActivityDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDetailWithPeriodRequestBuilder getTeamsTeamActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDistributionCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder getTeamsTeamActivityDistributionCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsTeamCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamCountsWithPeriodRequestBuilder getTeamsTeamCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityCountsWithPeriodRequestBuilder getTeamsUserActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityDistributionTotalUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityDistributionTotalUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityDistributionTotalUserCountsWithPeriodRequestBuilder getTeamsUserActivityDistributionTotalUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityDistributionTotalUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityDistributionUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityDistributionUserCountsWithPeriodRequestBuilder getTeamsUserActivityDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityTotalCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityTotalCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityTotalCountsWithPeriodRequestBuilder getTeamsUserActivityTotalCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityTotalCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityTotalDistributionCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityTotalDistributionCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityTotalDistributionCountsWithPeriodRequestBuilder getTeamsUserActivityTotalDistributionCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityTotalDistributionCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityTotalUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityTotalUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityTotalUserCountsWithPeriodRequestBuilder getTeamsUserActivityTotalUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityTotalUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserCountsWithPeriodRequestBuilder getTeamsUserActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetTeamsUserActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithDateRequestBuilder getTeamsUserActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsUserActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetTeamsUserActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithPeriodRequestBuilder getTeamsUserActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getUserArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @param userId Usage: userId='{userId}'
     * @return a {@link GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder getUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime, @jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        Objects.requireNonNull(userId);
        return new GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime, userId);
    }
    /**
     * Provides operations to call the getYammerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityCountsWithPeriodRequestBuilder getYammerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerActivityUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserCountsWithPeriodRequestBuilder getYammerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetYammerActivityUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserDetailWithDateRequestBuilder getYammerActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerActivityUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserDetailWithPeriodRequestBuilder getYammerActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getYammerDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder getYammerDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetYammerDeviceUsageUserDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithDateRequestBuilder getYammerDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder getYammerDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerGroupsActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityCountsWithPeriodRequestBuilder getYammerGroupsActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a {@link GetYammerGroupsActivityDetailWithDateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithDateRequestBuilder getYammerGroupsActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerGroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerGroupsActivityDetailWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithPeriodRequestBuilder getYammerGroupsActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a {@link GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder getYammerGroupsActivityGroupCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentAbandonmentDetails method.
     * @param filter Usage: filter='{filter}'
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     * @return a {@link ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder managedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipToken(@jakarta.annotation.Nonnull final String filter, @jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final String skipToken, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(filter);
        Objects.requireNonNull(skip);
        Objects.requireNonNull(skipToken);
        Objects.requireNonNull(top);
        return new ManagedDeviceEnrollmentAbandonmentDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(pathParameters, requestAdapter, filter, skip, skipToken, top);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentAbandonmentSummary method.
     * @param filter Usage: filter='{filter}'
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     * @return a {@link ManagedDeviceEnrollmentAbandonmentSummaryWithSkipWithTopWithFilterWithSkipTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentAbandonmentSummaryWithSkipWithTopWithFilterWithSkipTokenRequestBuilder managedDeviceEnrollmentAbandonmentSummaryWithSkipWithTopWithFilterWithSkipToken(@jakarta.annotation.Nonnull final String filter, @jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final String skipToken, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(filter);
        Objects.requireNonNull(skip);
        Objects.requireNonNull(skipToken);
        Objects.requireNonNull(top);
        return new ManagedDeviceEnrollmentAbandonmentSummaryWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(pathParameters, requestAdapter, filter, skip, skipToken, top);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureDetails method.
     * @param filter Usage: filter='{filter}'
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     * @return a {@link ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder managedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipToken(@jakarta.annotation.Nonnull final String filter, @jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final String skipToken, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(filter);
        Objects.requireNonNull(skip);
        Objects.requireNonNull(skipToken);
        Objects.requireNonNull(top);
        return new ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(pathParameters, requestAdapter, filter, skip, skipToken, top);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentTopFailures method.
     * @param period Usage: period='{period}'
     * @return a {@link ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder managedDeviceEnrollmentTopFailuresWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Update reports
     * @param body The request body
     * @return a {@link ReportRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ReportRoot patch(@jakarta.annotation.Nonnull final ReportRoot body) {
        return patch(body, null);
    }
    /**
     * Update reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReportRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ReportRoot patch(@jakarta.annotation.Nonnull final ReportRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportRoot::createFromDiscriminatorValue);
    }
    /**
     * Get reports
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update reports
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ReportRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ReportRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get reports
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
