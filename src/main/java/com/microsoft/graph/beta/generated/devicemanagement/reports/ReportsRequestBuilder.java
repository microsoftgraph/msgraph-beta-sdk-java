package com.microsoft.graph.beta.devicemanagement.reports;

import com.microsoft.graph.beta.devicemanagement.reports.cachedreportconfigurations.CachedReportConfigurationsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.exportjobs.ExportJobsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getactivemalwarereport.GetActiveMalwareReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getactivemalwaresummaryreport.GetActiveMalwareSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getallcertificatesreport.GetAllCertificatesReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getappsinstallsummaryreport.GetAppsInstallSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getappstatusoverviewreport.GetAppStatusOverviewReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcachedreport.GetCachedReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcertificatesreport.GetCertificatesReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancepoliciesreportfordevice.GetCompliancePoliciesReportForDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancepolicydevicesreport.GetCompliancePolicyDevicesReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancepolicydevicesummaryreport.GetCompliancePolicyDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancepolicynoncompliancereport.GetCompliancePolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancepolicynoncompliancesummaryreport.GetCompliancePolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancesettingdetailsreport.GetComplianceSettingDetailsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancesettingnoncompliancereport.GetComplianceSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getcompliancesettingsreport.GetComplianceSettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigmanagerdevicepolicystatusreport.GetConfigManagerDevicePolicyStatusReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpoliciesreportfordevice.GetConfigurationPoliciesReportForDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpolicydevicesreport.GetConfigurationPolicyDevicesReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpolicydevicesummaryreport.GetConfigurationPolicyDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpolicynoncompliancereport.GetConfigurationPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpolicynoncompliancesummaryreport.GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationpolicysettingsdevicesummaryreport.GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationsettingdetailsreport.GetConfigurationSettingDetailsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationsettingnoncompliancereport.GetConfigurationSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getconfigurationsettingsreport.GetConfigurationSettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdeviceconfigurationpolicysettingssummaryreport.GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdeviceconfigurationpolicystatussummary.GetDeviceConfigurationPolicyStatusSummaryRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdeviceinstallstatusreport.GetDeviceInstallStatusReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicemanagementintentpersettingcontributingprofiles.GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicemanagementintentsettingsreport.GetDeviceManagementIntentSettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicenoncompliancereport.GetDeviceNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicepoliciescompliancereport.GetDevicePoliciesComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicepolicysettingscompliancereport.GetDevicePolicySettingsComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicesstatusbypolicyplatformcompliancereport.GetDevicesStatusByPolicyPlatformComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicesstatusbysettingreport.GetDevicesStatusBySettingReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicestatusbycompliacepolicyreport.GetDeviceStatusByCompliacePolicyReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicestatusbycompliancepolicysettingreport.GetDeviceStatusByCompliancePolicySettingReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicestatussummarybycompliacepolicyreport.GetDeviceStatusSummaryByCompliacePolicyReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdevicestatussummarybycompliancepolicysettingsreport.GetDeviceStatusSummaryByCompliancePolicySettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getdeviceswithoutcompliancepolicyreport.GetDevicesWithoutCompliancePolicyReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getencryptionreportfordevices.GetEncryptionReportForDevicesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getenrollmentconfigurationpoliciesbydevice.GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getfailedmobileappsreport.GetFailedMobileAppsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getfailedmobileappssummaryreport.GetFailedMobileAppsSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getgrouppolicysettingsdevicesettingsreport.GetGroupPolicySettingsDeviceSettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.gethistoricalreport.GetHistoricalReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getmalwaresummaryreport.GetMalwareSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getmobileapplicationmanagementappconfigurationreport.GetMobileApplicationManagementAppConfigurationReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getmobileapplicationmanagementappregistrationsummaryreport.GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getnoncompliantdevicesandsettingsreport.GetNoncompliantDevicesAndSettingsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getpolicynoncompliancemetadata.GetPolicyNonComplianceMetadataRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getpolicynoncompliancereport.GetPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getpolicynoncompliancesummaryreport.GetPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getquiettimepolicyusersreport.GetQuietTimePolicyUsersReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getquiettimepolicyusersummaryreport.GetQuietTimePolicyUserSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getrelatedappsstatusreport.GetRelatedAppsStatusReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getremoteassistancesessionsreport.GetRemoteAssistanceSessionsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getreportfilters.GetReportFiltersRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getsettingnoncompliancereport.GetSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getunhealthydefenderagentsreport.GetUnhealthyDefenderAgentsReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getunhealthyfirewallreport.GetUnhealthyFirewallReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getunhealthyfirewallsummaryreport.GetUnhealthyFirewallSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getuserinstallstatusreport.GetUserInstallStatusReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsdriverupdatealertsperpolicyperdevicereport.GetWindowsDriverUpdateAlertsPerPolicyPerDeviceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsdriverupdatealertsummaryreport.GetWindowsDriverUpdateAlertSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsqualityupdatealertsperpolicyperdevicereport.GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsqualityupdatealertsummaryreport.GetWindowsQualityUpdateAlertSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsupdatealertsperpolicyperdevicereport.GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getwindowsupdatealertsummaryreport.GetWindowsUpdateAlertSummaryReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reports.getzebrafotadeploymentreport.GetZebraFotaDeploymentReportRequestBuilder;
import com.microsoft.graph.beta.models.DeviceManagementReports;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the cachedReportConfigurations property of the microsoft.graph.deviceManagementReports entity.
     */
    @jakarta.annotation.Nonnull
    public CachedReportConfigurationsRequestBuilder cachedReportConfigurations() {
        return new CachedReportConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.deviceManagementReports entity.
     */
    @jakarta.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActiveMalwareReport method.
     */
    @jakarta.annotation.Nonnull
    public GetActiveMalwareReportRequestBuilder getActiveMalwareReport() {
        return new GetActiveMalwareReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActiveMalwareSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetActiveMalwareSummaryReportRequestBuilder getActiveMalwareSummaryReport() {
        return new GetActiveMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllCertificatesReport method.
     */
    @jakarta.annotation.Nonnull
    public GetAllCertificatesReportRequestBuilder getAllCertificatesReport() {
        return new GetAllCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAppsInstallSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetAppsInstallSummaryReportRequestBuilder getAppsInstallSummaryReport() {
        return new GetAppsInstallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAppStatusOverviewReport method.
     */
    @jakarta.annotation.Nonnull
    public GetAppStatusOverviewReportRequestBuilder getAppStatusOverviewReport() {
        return new GetAppStatusOverviewReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCachedReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCachedReportRequestBuilder getCachedReport() {
        return new GetCachedReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCertificatesReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCertificatesReportRequestBuilder getCertificatesReport() {
        return new GetCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePoliciesReportForDevice method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePoliciesReportForDeviceRequestBuilder getCompliancePoliciesReportForDevice() {
        return new GetCompliancePoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyDevicesReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyDevicesReportRequestBuilder getCompliancePolicyDevicesReport() {
        return new GetCompliancePolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyDeviceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyDeviceSummaryReportRequestBuilder getCompliancePolicyDeviceSummaryReport() {
        return new GetCompliancePolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport() {
        return new GetCompliancePolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport() {
        return new GetCompliancePolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getComplianceSettingDetailsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetComplianceSettingDetailsReportRequestBuilder getComplianceSettingDetailsReport() {
        return new GetComplianceSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getComplianceSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport() {
        return new GetComplianceSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getComplianceSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetComplianceSettingsReportRequestBuilder getComplianceSettingsReport() {
        return new GetComplianceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigManagerDevicePolicyStatusReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigManagerDevicePolicyStatusReportRequestBuilder getConfigManagerDevicePolicyStatusReport() {
        return new GetConfigManagerDevicePolicyStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPoliciesReportForDevice method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPoliciesReportForDeviceRequestBuilder getConfigurationPoliciesReportForDevice() {
        return new GetConfigurationPoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyDevicesReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyDevicesReportRequestBuilder getConfigurationPolicyDevicesReport() {
        return new GetConfigurationPolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyDeviceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyDeviceSummaryReportRequestBuilder getConfigurationPolicyDeviceSummaryReport() {
        return new GetConfigurationPolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport() {
        return new GetConfigurationPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport() {
        return new GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicySettingsDeviceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder getConfigurationPolicySettingsDeviceSummaryReport() {
        return new GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationSettingDetailsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationSettingDetailsReportRequestBuilder getConfigurationSettingDetailsReport() {
        return new GetConfigurationSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport() {
        return new GetConfigurationSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationSettingsReportRequestBuilder getConfigurationSettingsReport() {
        return new GetConfigurationSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceConfigurationPolicySettingsSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder getDeviceConfigurationPolicySettingsSummaryReport() {
        return new GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceConfigurationPolicyStatusSummary method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceConfigurationPolicyStatusSummaryRequestBuilder getDeviceConfigurationPolicyStatusSummary() {
        return new GetDeviceConfigurationPolicyStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceInstallStatusReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceInstallStatusReportRequestBuilder getDeviceInstallStatusReport() {
        return new GetDeviceInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceManagementIntentPerSettingContributingProfiles method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder getDeviceManagementIntentPerSettingContributingProfiles() {
        return new GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceManagementIntentSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceManagementIntentSettingsReportRequestBuilder getDeviceManagementIntentSettingsReport() {
        return new GetDeviceManagementIntentSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport() {
        return new GetDeviceNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicePoliciesComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicePoliciesComplianceReportRequestBuilder getDevicePoliciesComplianceReport() {
        return new GetDevicePoliciesComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicePolicySettingsComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicePolicySettingsComplianceReportRequestBuilder getDevicePolicySettingsComplianceReport() {
        return new GetDevicePolicySettingsComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicesStatusByPolicyPlatformComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicesStatusByPolicyPlatformComplianceReportRequestBuilder getDevicesStatusByPolicyPlatformComplianceReport() {
        return new GetDevicesStatusByPolicyPlatformComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicesStatusBySettingReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicesStatusBySettingReportRequestBuilder getDevicesStatusBySettingReport() {
        return new GetDevicesStatusBySettingReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceStatusByCompliacePolicyReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceStatusByCompliacePolicyReportRequestBuilder getDeviceStatusByCompliacePolicyReport() {
        return new GetDeviceStatusByCompliacePolicyReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceStatusByCompliancePolicySettingReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceStatusByCompliancePolicySettingReportRequestBuilder getDeviceStatusByCompliancePolicySettingReport() {
        return new GetDeviceStatusByCompliancePolicySettingReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceStatusSummaryByCompliacePolicyReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceStatusSummaryByCompliacePolicyReportRequestBuilder getDeviceStatusSummaryByCompliacePolicyReport() {
        return new GetDeviceStatusSummaryByCompliacePolicyReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceStatusSummaryByCompliancePolicySettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceStatusSummaryByCompliancePolicySettingsReportRequestBuilder getDeviceStatusSummaryByCompliancePolicySettingsReport() {
        return new GetDeviceStatusSummaryByCompliancePolicySettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicesWithoutCompliancePolicyReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicesWithoutCompliancePolicyReportRequestBuilder getDevicesWithoutCompliancePolicyReport() {
        return new GetDevicesWithoutCompliancePolicyReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEncryptionReportForDevices method.
     */
    @jakarta.annotation.Nonnull
    public GetEncryptionReportForDevicesRequestBuilder getEncryptionReportForDevices() {
        return new GetEncryptionReportForDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEnrollmentConfigurationPoliciesByDevice method.
     */
    @jakarta.annotation.Nonnull
    public GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder getEnrollmentConfigurationPoliciesByDevice() {
        return new GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFailedMobileAppsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetFailedMobileAppsReportRequestBuilder getFailedMobileAppsReport() {
        return new GetFailedMobileAppsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFailedMobileAppsSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetFailedMobileAppsSummaryReportRequestBuilder getFailedMobileAppsSummaryReport() {
        return new GetFailedMobileAppsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getGroupPolicySettingsDeviceSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetGroupPolicySettingsDeviceSettingsReportRequestBuilder getGroupPolicySettingsDeviceSettingsReport() {
        return new GetGroupPolicySettingsDeviceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getHistoricalReport method.
     */
    @jakarta.annotation.Nonnull
    public GetHistoricalReportRequestBuilder getHistoricalReport() {
        return new GetHistoricalReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMalwareSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetMalwareSummaryReportRequestBuilder getMalwareSummaryReport() {
        return new GetMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMobileApplicationManagementAppConfigurationReport method.
     */
    @jakarta.annotation.Nonnull
    public GetMobileApplicationManagementAppConfigurationReportRequestBuilder getMobileApplicationManagementAppConfigurationReport() {
        return new GetMobileApplicationManagementAppConfigurationReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMobileApplicationManagementAppRegistrationSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder getMobileApplicationManagementAppRegistrationSummaryReport() {
        return new GetMobileApplicationManagementAppRegistrationSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getNoncompliantDevicesAndSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetNoncompliantDevicesAndSettingsReportRequestBuilder getNoncompliantDevicesAndSettingsReport() {
        return new GetNoncompliantDevicesAndSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceMetadata method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata() {
        return new GetPolicyNonComplianceMetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport() {
        return new GetPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport() {
        return new GetPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getQuietTimePolicyUsersReport method.
     */
    @jakarta.annotation.Nonnull
    public GetQuietTimePolicyUsersReportRequestBuilder getQuietTimePolicyUsersReport() {
        return new GetQuietTimePolicyUsersReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getQuietTimePolicyUserSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetQuietTimePolicyUserSummaryReportRequestBuilder getQuietTimePolicyUserSummaryReport() {
        return new GetQuietTimePolicyUserSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getRelatedAppsStatusReport method.
     */
    @jakarta.annotation.Nonnull
    public GetRelatedAppsStatusReportRequestBuilder getRelatedAppsStatusReport() {
        return new GetRelatedAppsStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getRemoteAssistanceSessionsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetRemoteAssistanceSessionsReportRequestBuilder getRemoteAssistanceSessionsReport() {
        return new GetRemoteAssistanceSessionsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getReportFilters method.
     */
    @jakarta.annotation.Nonnull
    public GetReportFiltersRequestBuilder getReportFilters() {
        return new GetReportFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport() {
        return new GetSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getUnhealthyDefenderAgentsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetUnhealthyDefenderAgentsReportRequestBuilder getUnhealthyDefenderAgentsReport() {
        return new GetUnhealthyDefenderAgentsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getUnhealthyFirewallReport method.
     */
    @jakarta.annotation.Nonnull
    public GetUnhealthyFirewallReportRequestBuilder getUnhealthyFirewallReport() {
        return new GetUnhealthyFirewallReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getUnhealthyFirewallSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetUnhealthyFirewallSummaryReportRequestBuilder getUnhealthyFirewallSummaryReport() {
        return new GetUnhealthyFirewallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getUserInstallStatusReport method.
     */
    @jakarta.annotation.Nonnull
    public GetUserInstallStatusReportRequestBuilder getUserInstallStatusReport() {
        return new GetUserInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsDriverUpdateAlertsPerPolicyPerDeviceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsDriverUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsDriverUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsDriverUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsDriverUpdateAlertSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsDriverUpdateAlertSummaryReportRequestBuilder getWindowsDriverUpdateAlertSummaryReport() {
        return new GetWindowsDriverUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsQualityUpdateAlertSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsQualityUpdateAlertSummaryReportRequestBuilder getWindowsQualityUpdateAlertSummaryReport() {
        return new GetWindowsQualityUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsUpdateAlertsPerPolicyPerDeviceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getWindowsUpdateAlertSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetWindowsUpdateAlertSummaryReportRequestBuilder getWindowsUpdateAlertSummaryReport() {
        return new GetWindowsUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getZebraFotaDeploymentReport method.
     */
    @jakarta.annotation.Nonnull
    public GetZebraFotaDeploymentReportRequestBuilder getZebraFotaDeploymentReport() {
        return new GetZebraFotaDeploymentReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property reports for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Reports singleton
     * @return a DeviceManagementReports
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports get() {
        return get(null);
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceManagementReports
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementReports::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a DeviceManagementReports
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports patch(@jakarta.annotation.Nonnull final DeviceManagementReports body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceManagementReports
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports patch(@jakarta.annotation.Nonnull final DeviceManagementReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementReports::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Reports singleton
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementReports body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ReportsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Reports singleton
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
         * @return a Map<String, Object>
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
