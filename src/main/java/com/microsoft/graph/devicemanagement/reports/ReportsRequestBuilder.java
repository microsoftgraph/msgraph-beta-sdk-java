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
import com.microsoft.graph.devicemanagement.reports.getenrollmentconfigurationpoliciesbydevice.GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getfailedmobileappsreport.GetFailedMobileAppsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getfailedmobileappssummaryreport.GetFailedMobileAppsSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getgrouppolicysettingsdevicesettingsreport.GetGroupPolicySettingsDeviceSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.gethistoricalreport.GetHistoricalReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getmalwaresummaryreport.GetMalwareSummaryReportRequestBuilder;
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
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity. */
public class ReportsRequestBuilder {
    /** The cachedReportConfigurations property */
    @javax.annotation.Nonnull
    public CachedReportConfigurationsRequestBuilder cachedReportConfigurations() {
        return new CachedReportConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exportJobs property */
    @javax.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getActiveMalwareReport property */
    @javax.annotation.Nonnull
    public GetActiveMalwareReportRequestBuilder getActiveMalwareReport() {
        return new GetActiveMalwareReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getActiveMalwareSummaryReport property */
    @javax.annotation.Nonnull
    public GetActiveMalwareSummaryReportRequestBuilder getActiveMalwareSummaryReport() {
        return new GetActiveMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getAllCertificatesReport property */
    @javax.annotation.Nonnull
    public GetAllCertificatesReportRequestBuilder getAllCertificatesReport() {
        return new GetAllCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getAppsInstallSummaryReport property */
    @javax.annotation.Nonnull
    public GetAppsInstallSummaryReportRequestBuilder getAppsInstallSummaryReport() {
        return new GetAppsInstallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getAppStatusOverviewReport property */
    @javax.annotation.Nonnull
    public GetAppStatusOverviewReportRequestBuilder getAppStatusOverviewReport() {
        return new GetAppStatusOverviewReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCachedReport property */
    @javax.annotation.Nonnull
    public GetCachedReportRequestBuilder getCachedReport() {
        return new GetCachedReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCertificatesReport property */
    @javax.annotation.Nonnull
    public GetCertificatesReportRequestBuilder getCertificatesReport() {
        return new GetCertificatesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCompliancePoliciesReportForDevice property */
    @javax.annotation.Nonnull
    public GetCompliancePoliciesReportForDeviceRequestBuilder getCompliancePoliciesReportForDevice() {
        return new GetCompliancePoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCompliancePolicyDevicesReport property */
    @javax.annotation.Nonnull
    public GetCompliancePolicyDevicesReportRequestBuilder getCompliancePolicyDevicesReport() {
        return new GetCompliancePolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCompliancePolicyDeviceSummaryReport property */
    @javax.annotation.Nonnull
    public GetCompliancePolicyDeviceSummaryReportRequestBuilder getCompliancePolicyDeviceSummaryReport() {
        return new GetCompliancePolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCompliancePolicyNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport() {
        return new GetCompliancePolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getCompliancePolicyNonComplianceSummaryReport property */
    @javax.annotation.Nonnull
    public GetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport() {
        return new GetCompliancePolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getComplianceSettingDetailsReport property */
    @javax.annotation.Nonnull
    public GetComplianceSettingDetailsReportRequestBuilder getComplianceSettingDetailsReport() {
        return new GetComplianceSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getComplianceSettingNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport() {
        return new GetComplianceSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getComplianceSettingsReport property */
    @javax.annotation.Nonnull
    public GetComplianceSettingsReportRequestBuilder getComplianceSettingsReport() {
        return new GetComplianceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigManagerDevicePolicyStatusReport property */
    @javax.annotation.Nonnull
    public GetConfigManagerDevicePolicyStatusReportRequestBuilder getConfigManagerDevicePolicyStatusReport() {
        return new GetConfigManagerDevicePolicyStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPoliciesReportForDevice property */
    @javax.annotation.Nonnull
    public GetConfigurationPoliciesReportForDeviceRequestBuilder getConfigurationPoliciesReportForDevice() {
        return new GetConfigurationPoliciesReportForDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPolicyDevicesReport property */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyDevicesReportRequestBuilder getConfigurationPolicyDevicesReport() {
        return new GetConfigurationPolicyDevicesReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPolicyDeviceSummaryReport property */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyDeviceSummaryReportRequestBuilder getConfigurationPolicyDeviceSummaryReport() {
        return new GetConfigurationPolicyDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPolicyNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport() {
        return new GetConfigurationPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPolicyNonComplianceSummaryReport property */
    @javax.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport() {
        return new GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationPolicySettingsDeviceSummaryReport property */
    @javax.annotation.Nonnull
    public GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder getConfigurationPolicySettingsDeviceSummaryReport() {
        return new GetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationSettingDetailsReport property */
    @javax.annotation.Nonnull
    public GetConfigurationSettingDetailsReportRequestBuilder getConfigurationSettingDetailsReport() {
        return new GetConfigurationSettingDetailsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationSettingNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport() {
        return new GetConfigurationSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getConfigurationSettingsReport property */
    @javax.annotation.Nonnull
    public GetConfigurationSettingsReportRequestBuilder getConfigurationSettingsReport() {
        return new GetConfigurationSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceConfigurationPolicySettingsSummaryReport property */
    @javax.annotation.Nonnull
    public GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder getDeviceConfigurationPolicySettingsSummaryReport() {
        return new GetDeviceConfigurationPolicySettingsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceConfigurationPolicyStatusSummary property */
    @javax.annotation.Nonnull
    public GetDeviceConfigurationPolicyStatusSummaryRequestBuilder getDeviceConfigurationPolicyStatusSummary() {
        return new GetDeviceConfigurationPolicyStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceInstallStatusReport property */
    @javax.annotation.Nonnull
    public GetDeviceInstallStatusReportRequestBuilder getDeviceInstallStatusReport() {
        return new GetDeviceInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceManagementIntentPerSettingContributingProfiles property */
    @javax.annotation.Nonnull
    public GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder getDeviceManagementIntentPerSettingContributingProfiles() {
        return new GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceManagementIntentSettingsReport property */
    @javax.annotation.Nonnull
    public GetDeviceManagementIntentSettingsReportRequestBuilder getDeviceManagementIntentSettingsReport() {
        return new GetDeviceManagementIntentSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getDeviceNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport() {
        return new GetDeviceNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getEnrollmentConfigurationPoliciesByDevice property */
    @javax.annotation.Nonnull
    public GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder getEnrollmentConfigurationPoliciesByDevice() {
        return new GetEnrollmentConfigurationPoliciesByDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getFailedMobileAppsReport property */
    @javax.annotation.Nonnull
    public GetFailedMobileAppsReportRequestBuilder getFailedMobileAppsReport() {
        return new GetFailedMobileAppsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getFailedMobileAppsSummaryReport property */
    @javax.annotation.Nonnull
    public GetFailedMobileAppsSummaryReportRequestBuilder getFailedMobileAppsSummaryReport() {
        return new GetFailedMobileAppsSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getGroupPolicySettingsDeviceSettingsReport property */
    @javax.annotation.Nonnull
    public GetGroupPolicySettingsDeviceSettingsReportRequestBuilder getGroupPolicySettingsDeviceSettingsReport() {
        return new GetGroupPolicySettingsDeviceSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getHistoricalReport property */
    @javax.annotation.Nonnull
    public GetHistoricalReportRequestBuilder getHistoricalReport() {
        return new GetHistoricalReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMalwareSummaryReport property */
    @javax.annotation.Nonnull
    public GetMalwareSummaryReportRequestBuilder getMalwareSummaryReport() {
        return new GetMalwareSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getNoncompliantDevicesAndSettingsReport property */
    @javax.annotation.Nonnull
    public GetNoncompliantDevicesAndSettingsReportRequestBuilder getNoncompliantDevicesAndSettingsReport() {
        return new GetNoncompliantDevicesAndSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getPolicyNonComplianceMetadata property */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata() {
        return new GetPolicyNonComplianceMetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getPolicyNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport() {
        return new GetPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getPolicyNonComplianceSummaryReport property */
    @javax.annotation.Nonnull
    public GetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport() {
        return new GetPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getQuietTimePolicyUsersReport property */
    @javax.annotation.Nonnull
    public GetQuietTimePolicyUsersReportRequestBuilder getQuietTimePolicyUsersReport() {
        return new GetQuietTimePolicyUsersReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getQuietTimePolicyUserSummaryReport property */
    @javax.annotation.Nonnull
    public GetQuietTimePolicyUserSummaryReportRequestBuilder getQuietTimePolicyUserSummaryReport() {
        return new GetQuietTimePolicyUserSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getRelatedAppsStatusReport property */
    @javax.annotation.Nonnull
    public GetRelatedAppsStatusReportRequestBuilder getRelatedAppsStatusReport() {
        return new GetRelatedAppsStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getRemoteAssistanceSessionsReport property */
    @javax.annotation.Nonnull
    public GetRemoteAssistanceSessionsReportRequestBuilder getRemoteAssistanceSessionsReport() {
        return new GetRemoteAssistanceSessionsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getReportFilters property */
    @javax.annotation.Nonnull
    public GetReportFiltersRequestBuilder getReportFilters() {
        return new GetReportFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getSettingNonComplianceReport property */
    @javax.annotation.Nonnull
    public GetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport() {
        return new GetSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getUnhealthyDefenderAgentsReport property */
    @javax.annotation.Nonnull
    public GetUnhealthyDefenderAgentsReportRequestBuilder getUnhealthyDefenderAgentsReport() {
        return new GetUnhealthyDefenderAgentsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getUnhealthyFirewallReport property */
    @javax.annotation.Nonnull
    public GetUnhealthyFirewallReportRequestBuilder getUnhealthyFirewallReport() {
        return new GetUnhealthyFirewallReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getUnhealthyFirewallSummaryReport property */
    @javax.annotation.Nonnull
    public GetUnhealthyFirewallSummaryReportRequestBuilder getUnhealthyFirewallSummaryReport() {
        return new GetUnhealthyFirewallSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getUserInstallStatusReport property */
    @javax.annotation.Nonnull
    public GetUserInstallStatusReportRequestBuilder getUserInstallStatusReport() {
        return new GetUserInstallStatusReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport property */
    @javax.annotation.Nonnull
    public GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getWindowsQualityUpdateAlertSummaryReport property */
    @javax.annotation.Nonnull
    public GetWindowsQualityUpdateAlertSummaryReportRequestBuilder getWindowsQualityUpdateAlertSummaryReport() {
        return new GetWindowsQualityUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getWindowsUpdateAlertsPerPolicyPerDeviceReport property */
    @javax.annotation.Nonnull
    public GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsUpdateAlertsPerPolicyPerDeviceReport() {
        return new GetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getWindowsUpdateAlertSummaryReport property */
    @javax.annotation.Nonnull
    public GetWindowsUpdateAlertSummaryReportRequestBuilder getWindowsUpdateAlertSummaryReport() {
        return new GetWindowsUpdateAlertSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getZebraFotaDeploymentReport property */
    @javax.annotation.Nonnull
    public GetZebraFotaDeploymentReportRequestBuilder getZebraFotaDeploymentReport() {
        return new GetZebraFotaDeploymentReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.reports.cachedReportConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementCachedReportConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementCachedReportConfigurationItemRequestBuilder cachedReportConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementCachedReportConfiguration%2Did", id);
        return new DeviceManagementCachedReportConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ReportsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/reports{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ReportsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/reports{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ReportsRequestBuilderDeleteRequestConfiguration requestConfig = new ReportsRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Reports singleton
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ReportsRequestBuilderGetRequestConfiguration requestConfig = new ReportsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementReports body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementReports body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ReportsRequestBuilderPatchRequestConfiguration requestConfig = new ReportsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.reports.exportJobs.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementExportJobItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementExportJobItemRequestBuilder exportJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementExportJob%2Did", id);
        return new DeviceManagementExportJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Reports singleton
     * @return a CompletableFuture of deviceManagementReports
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementReports
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> get(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Reports singleton
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of deviceManagementReports
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementReports> get(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementReports::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementReports body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementReports body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementReports body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ReportsRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new reportsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Reports singleton */
    public class ReportsRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ReportsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ReportsRequestBuilderGetQueryParameters queryParameters = new ReportsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new reportsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ReportsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new reportsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
