package com.microsoft.graph.devicemanagement.reports;

import com.microsoft.graph.devicemanagement.reports.cachedreportconfigurations.CachedReportConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.cachedreportconfigurations.item.DeviceManagementCachedReportConfigurationItemRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.exportjobs.ExportJobsRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.exportjobs.item.DeviceManagementExportJobItemRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getactivemalwarereport.GetActiveMalwareReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getactivemalwaresummaryreport.GetActiveMalwareSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getallcertificatesreport.GetAllCertificatesReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getappsinstallsummaryreport.GetAppsInstallSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getappstatusoverviewreport.GetAppStatusOverviewReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcachedreport.GetCachedReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcertificatesreport.GetCertificatesReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepoliciesreportfordevice.GetCompliancePoliciesReportForDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicydevicesreport.GetCompliancePolicyDevicesReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicydevicesummaryreport.GetCompliancePolicyDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicynoncompliancereport.GetCompliancePolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicynoncompliancesummaryreport.GetCompliancePolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancesettingdetailsreport.GetComplianceSettingDetailsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancesettingnoncompliancereport.GetComplianceSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancesettingsreport.GetComplianceSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigmanagerdevicepolicystatusreport.GetConfigManagerDevicePolicyStatusReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpoliciesreportfordevice.GetConfigurationPoliciesReportForDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicydevicesreport.GetConfigurationPolicyDevicesReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicydevicesummaryreport.GetConfigurationPolicyDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicynoncompliancereport.GetConfigurationPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicynoncompliancesummaryreport.GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicysettingsdevicesummaryreport.GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationsettingdetailsreport.GetConfigurationSettingDetailsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationsettingnoncompliancereport.GetConfigurationSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationsettingsreport.GetConfigurationSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdeviceconfigurationpolicysettingssummaryreport.GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdeviceconfigurationpolicystatussummary.GetDeviceConfigurationPolicyStatusSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdeviceinstallstatusreport.GetDeviceInstallStatusReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicemanagementintentpersettingcontributingprofiles.GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicemanagementintentsettingsreport.GetDeviceManagementIntentSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicenoncompliancereport.GetDeviceNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicepoliciescompliancereport.GetDevicePoliciesComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicepolicysettingscompliancereport.GetDevicePolicySettingsComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicesstatusbysettingreport.GetDevicesStatusBySettingReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdeviceswithoutcompliancepolicyreport.GetDevicesWithoutCompliancePolicyReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getencryptionreportfordevices.GetEncryptionReportForDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getenrollmentconfigurationpoliciesbydevice.GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getfailedmobileappsreport.GetFailedMobileAppsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getfailedmobileappssummaryreport.GetFailedMobileAppsSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getgrouppolicysettingsdevicesettingsreport.GetGroupPolicySettingsDeviceSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.gethistoricalreport.GetHistoricalReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getmalwaresummaryreport.GetMalwareSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getmobileapplicationmanagementappconfigurationreport.GetMobileApplicationManagementAppConfigurationReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getmobileapplicationmanagementappregistrationsummaryreport.GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getnoncompliantdevicesandsettingsreport.GetNoncompliantDevicesAndSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancemetadata.GetPolicyNonComplianceMetadataRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancereport.GetPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancesummaryreport.GetPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getquiettimepolicyusersreport.GetQuietTimePolicyUsersReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getquiettimepolicyusersummaryreport.GetQuietTimePolicyUserSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getrelatedappsstatusreport.GetRelatedAppsStatusReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getremoteassistancesessionsreport.GetRemoteAssistanceSessionsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getreportfilters.GetReportFiltersRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getsettingnoncompliancereport.GetSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getunhealthydefenderagentsreport.GetUnhealthyDefenderAgentsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getunhealthyfirewallreport.GetUnhealthyFirewallReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getunhealthyfirewallsummaryreport.GetUnhealthyFirewallSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getuserinstallstatusreport.GetUserInstallStatusReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getwindowsqualityupdatealertsperpolicyperdevicereport.GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getwindowsqualityupdatealertsummaryreport.GetWindowsQualityUpdateAlertSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getwindowsupdatealertsperpolicyperdevicereport.GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getwindowsupdatealertsummaryreport.GetWindowsUpdateAlertSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getzebrafotadeploymentreport.GetZebraFotaDeploymentReportRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReports;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity.
 */
public class ReportsRequestBuilder {
    /** Provides operations to manage the cachedReportConfigurations property of the microsoft.graph.deviceManagementReports entity. */
    @javax.annotation.Nonnull
    public CachedReportConfigurationsRequestBuilder cachedReportConfigurations() {
        return new CachedReportConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exportJobs property of the microsoft.graph.deviceManagementReports entity. */
    @javax.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getActiveMalwareReport method. */
    @javax.annotation.Nonnull
    public GetActiveMalwareReportRequestBuilder getActiveMalwareReport() {
        return new GetActiveMalwareReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getActiveMalwareSummaryReport method. */
    @javax.annotation.Nonnull
    public GetActiveMalwareSummaryReportRequestBuilder getActiveMalwareSummaryReport() {
        return new GetActiveMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAllCertificatesReport method. */
    @javax.annotation.Nonnull
    public GetAllCertificatesReportRequestBuilder getAllCertificatesReport() {
        return new GetAllCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAppsInstallSummaryReport method. */
    @javax.annotation.Nonnull
    public GetAppsInstallSummaryReportRequestBuilder getAppsInstallSummaryReport() {
        return new GetAppsInstallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAppStatusOverviewReport method. */
    @javax.annotation.Nonnull
    public GetAppStatusOverviewReportRequestBuilder getAppStatusOverviewReport() {
        return new GetAppStatusOverviewReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCachedReport method. */
    @javax.annotation.Nonnull
    public GetCachedReportRequestBuilder getCachedReport() {
        return new GetCachedReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCertificatesReport method. */
    @javax.annotation.Nonnull
    public GetCertificatesReportRequestBuilder getCertificatesReport() {
        return new GetCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCompliancePoliciesReportForDevice method. */
    @javax.annotation.Nonnull
    public GetCompliancePoliciesReportForDeviceRequestBuilder getCompliancePoliciesReportForDevice() {
        return new GetCompliancePoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCompliancePolicyDevicesReport method. */
    @javax.annotation.Nonnull
    public GetCompliancePolicyDevicesReportRequestBuilder getCompliancePolicyDevicesReport() {
        return new GetCompliancePolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCompliancePolicyDeviceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetCompliancePolicyDeviceSummaryReportRequestBuilder getCompliancePolicyDeviceSummaryReport() {
        return new GetCompliancePolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCompliancePolicyNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport() {
        return new GetCompliancePolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCompliancePolicyNonComplianceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport() {
        return new GetCompliancePolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getComplianceSettingDetailsReport method. */
    @javax.annotation.Nonnull
    public GetComplianceSettingDetailsReportRequestBuilder getComplianceSettingDetailsReport() {
        return new GetComplianceSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getComplianceSettingNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport() {
        return new GetComplianceSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getComplianceSettingsReport method. */
    @javax.annotation.Nonnull
    public GetComplianceSettingsReportRequestBuilder getComplianceSettingsReport() {
        return new GetComplianceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigManagerDevicePolicyStatusReport method. */
    @javax.annotation.Nonnull
    public GetConfigManagerDevicePolicyStatusReportRequestBuilder getConfigManagerDevicePolicyStatusReport() {
        return new GetConfigManagerDevicePolicyStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPoliciesReportForDevice method. */
    @javax.annotation.Nonnull
    public GetConfigurationPoliciesReportForDeviceRequestBuilder getConfigurationPoliciesReportForDevice() {
        return new GetConfigurationPoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPolicyDevicesReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyDevicesReportRequestBuilder getConfigurationPolicyDevicesReport() {
        return new GetConfigurationPolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPolicyDeviceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyDeviceSummaryReportRequestBuilder getConfigurationPolicyDeviceSummaryReport() {
        return new GetConfigurationPolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPolicyNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport() {
        return new GetConfigurationPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPolicyNonComplianceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport() {
        return new GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationPolicySettingsDeviceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder getConfigurationPolicySettingsDeviceSummaryReport() {
        return new GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationSettingDetailsReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationSettingDetailsReportRequestBuilder getConfigurationSettingDetailsReport() {
        return new GetConfigurationSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationSettingNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport() {
        return new GetConfigurationSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getConfigurationSettingsReport method. */
    @javax.annotation.Nonnull
    public GetConfigurationSettingsReportRequestBuilder getConfigurationSettingsReport() {
        return new GetConfigurationSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceConfigurationPolicySettingsSummaryReport method. */
    @javax.annotation.Nonnull
    public GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder getDeviceConfigurationPolicySettingsSummaryReport() {
        return new GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceConfigurationPolicyStatusSummary method. */
    @javax.annotation.Nonnull
    public GetDeviceConfigurationPolicyStatusSummaryRequestBuilder getDeviceConfigurationPolicyStatusSummary() {
        return new GetDeviceConfigurationPolicyStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceInstallStatusReport method. */
    @javax.annotation.Nonnull
    public GetDeviceInstallStatusReportRequestBuilder getDeviceInstallStatusReport() {
        return new GetDeviceInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceManagementIntentPerSettingContributingProfiles method. */
    @javax.annotation.Nonnull
    public GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder getDeviceManagementIntentPerSettingContributingProfiles() {
        return new GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceManagementIntentSettingsReport method. */
    @javax.annotation.Nonnull
    public GetDeviceManagementIntentSettingsReportRequestBuilder getDeviceManagementIntentSettingsReport() {
        return new GetDeviceManagementIntentSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDeviceNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport() {
        return new GetDeviceNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDevicePoliciesComplianceReport method. */
    @javax.annotation.Nonnull
    public GetDevicePoliciesComplianceReportRequestBuilder getDevicePoliciesComplianceReport() {
        return new GetDevicePoliciesComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDevicePolicySettingsComplianceReport method. */
    @javax.annotation.Nonnull
    public GetDevicePolicySettingsComplianceReportRequestBuilder getDevicePolicySettingsComplianceReport() {
        return new GetDevicePolicySettingsComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDevicesStatusBySettingReport method. */
    @javax.annotation.Nonnull
    public GetDevicesStatusBySettingReportRequestBuilder getDevicesStatusBySettingReport() {
        return new GetDevicesStatusBySettingReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDevicesWithoutCompliancePolicyReport method. */
    @javax.annotation.Nonnull
    public GetDevicesWithoutCompliancePolicyReportRequestBuilder getDevicesWithoutCompliancePolicyReport() {
        return new GetDevicesWithoutCompliancePolicyReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getEncryptionReportForDevices method. */
    @javax.annotation.Nonnull
    public GetEncryptionReportForDevicesRequestBuilder getEncryptionReportForDevices() {
        return new GetEncryptionReportForDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getEnrollmentConfigurationPoliciesByDevice method. */
    @javax.annotation.Nonnull
    public GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder getEnrollmentConfigurationPoliciesByDevice() {
        return new GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getFailedMobileAppsReport method. */
    @javax.annotation.Nonnull
    public GetFailedMobileAppsReportRequestBuilder getFailedMobileAppsReport() {
        return new GetFailedMobileAppsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getFailedMobileAppsSummaryReport method. */
    @javax.annotation.Nonnull
    public GetFailedMobileAppsSummaryReportRequestBuilder getFailedMobileAppsSummaryReport() {
        return new GetFailedMobileAppsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getGroupPolicySettingsDeviceSettingsReport method. */
    @javax.annotation.Nonnull
    public GetGroupPolicySettingsDeviceSettingsReportRequestBuilder getGroupPolicySettingsDeviceSettingsReport() {
        return new GetGroupPolicySettingsDeviceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getHistoricalReport method. */
    @javax.annotation.Nonnull
    public GetHistoricalReportRequestBuilder getHistoricalReport() {
        return new GetHistoricalReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMalwareSummaryReport method. */
    @javax.annotation.Nonnull
    public GetMalwareSummaryReportRequestBuilder getMalwareSummaryReport() {
        return new GetMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMobileApplicationManagementAppConfigurationReport method. */
    @javax.annotation.Nonnull
    public GetMobileApplicationManagementAppConfigurationReportRequestBuilder getMobileApplicationManagementAppConfigurationReport() {
        return new GetMobileApplicationManagementAppConfigurationReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMobileApplicationManagementAppRegistrationSummaryReport method. */
    @javax.annotation.Nonnull
    public GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder getMobileApplicationManagementAppRegistrationSummaryReport() {
        return new GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getNoncompliantDevicesAndSettingsReport method. */
    @javax.annotation.Nonnull
    public GetNoncompliantDevicesAndSettingsReportRequestBuilder getNoncompliantDevicesAndSettingsReport() {
        return new GetNoncompliantDevicesAndSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getPolicyNonComplianceMetadata method. */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata() {
        return new GetPolicyNonComplianceMetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getPolicyNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport() {
        return new GetPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getPolicyNonComplianceSummaryReport method. */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport() {
        return new GetPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getQuietTimePolicyUsersReport method. */
    @javax.annotation.Nonnull
    public GetQuietTimePolicyUsersReportRequestBuilder getQuietTimePolicyUsersReport() {
        return new GetQuietTimePolicyUsersReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getQuietTimePolicyUserSummaryReport method. */
    @javax.annotation.Nonnull
    public GetQuietTimePolicyUserSummaryReportRequestBuilder getQuietTimePolicyUserSummaryReport() {
        return new GetQuietTimePolicyUserSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getRelatedAppsStatusReport method. */
    @javax.annotation.Nonnull
    public GetRelatedAppsStatusReportRequestBuilder getRelatedAppsStatusReport() {
        return new GetRelatedAppsStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getRemoteAssistanceSessionsReport method. */
    @javax.annotation.Nonnull
    public GetRemoteAssistanceSessionsReportRequestBuilder getRemoteAssistanceSessionsReport() {
        return new GetRemoteAssistanceSessionsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getReportFilters method. */
    @javax.annotation.Nonnull
    public GetReportFiltersRequestBuilder getReportFilters() {
        return new GetReportFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getSettingNonComplianceReport method. */
    @javax.annotation.Nonnull
    public GetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport() {
        return new GetSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getUnhealthyDefenderAgentsReport method. */
    @javax.annotation.Nonnull
    public GetUnhealthyDefenderAgentsReportRequestBuilder getUnhealthyDefenderAgentsReport() {
        return new GetUnhealthyDefenderAgentsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getUnhealthyFirewallReport method. */
    @javax.annotation.Nonnull
    public GetUnhealthyFirewallReportRequestBuilder getUnhealthyFirewallReport() {
        return new GetUnhealthyFirewallReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getUnhealthyFirewallSummaryReport method. */
    @javax.annotation.Nonnull
    public GetUnhealthyFirewallSummaryReportRequestBuilder getUnhealthyFirewallSummaryReport() {
        return new GetUnhealthyFirewallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getUserInstallStatusReport method. */
    @javax.annotation.Nonnull
    public GetUserInstallStatusReportRequestBuilder getUserInstallStatusReport() {
        return new GetUserInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport method. */
    @javax.annotation.Nonnull
    public GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getWindowsQualityUpdateAlertSummaryReport method. */
    @javax.annotation.Nonnull
    public GetWindowsQualityUpdateAlertSummaryReportRequestBuilder getWindowsQualityUpdateAlertSummaryReport() {
        return new GetWindowsQualityUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getWindowsUpdateAlertsPerPolicyPerDeviceReport method. */
    @javax.annotation.Nonnull
    public GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getWindowsUpdateAlertSummaryReport method. */
    @javax.annotation.Nonnull
    public GetWindowsUpdateAlertSummaryReportRequestBuilder getWindowsUpdateAlertSummaryReport() {
        return new GetWindowsUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getZebraFotaDeploymentReport method. */
    @javax.annotation.Nonnull
    public GetZebraFotaDeploymentReportRequestBuilder getZebraFotaDeploymentReport() {
        return new GetZebraFotaDeploymentReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the cachedReportConfigurations property of the microsoft.graph.deviceManagementReports entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementCachedReportConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementCachedReportConfigurationItemRequestBuilder cachedReportConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementCachedReportConfiguration%2Did", id);
        return new DeviceManagementCachedReportConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/reports{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/reports{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.deviceManagementReports entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementExportJobItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementExportJobItemRequestBuilder exportJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementExportJob%2Did", id);
        return new DeviceManagementExportJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Reports singleton
     * @return a CompletableFuture of deviceManagementReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementReports> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementReports> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceManagementReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> patch(@javax.annotation.Nonnull final DeviceManagementReports body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementReports> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> patch(@javax.annotation.Nonnull final DeviceManagementReports body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementReports> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Reports singleton
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementReports body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementReports body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /**
     * Reports singleton
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
