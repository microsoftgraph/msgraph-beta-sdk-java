package com.microsoft.graph.devicemanagement;

import com.microsoft.graph.devicemanagement.advancedthreatprotectiononboardingstatesummary.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.androiddeviceownerenrollmentprofiles.AndroidDeviceOwnerEnrollmentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.androidforworkappconfigurationschemas.AndroidForWorkAppConfigurationSchemasRequestBuilder;
import com.microsoft.graph.devicemanagement.androidforworkenrollmentprofiles.AndroidForWorkEnrollmentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.androidforworksettings.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.androidmanagedstoreappconfigurationschemas.AndroidManagedStoreAppConfigurationSchemasRequestBuilder;
import com.microsoft.graph.devicemanagement.applepushnotificationcertificate.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.devicemanagement.appleuserinitiatedenrollmentprofiles.AppleUserInitiatedEnrollmentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.AssignmentFiltersRequestBuilder;
import com.microsoft.graph.devicemanagement.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.autopilotevents.AutopilotEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.carttoclassassociations.CartToClassAssociationsRequestBuilder;
import com.microsoft.graph.devicemanagement.categories.CategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.certificateconnectordetails.CertificateConnectorDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.chromeosonboardingsettings.ChromeOSOnboardingSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.cloudpcconnectivityissues.CloudPCConnectivityIssuesRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.ComanagedDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.comanagementeligibledevices.ComanagementEligibleDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancecategories.ComplianceCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancemanagementpartners.ComplianceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancepolicies.CompliancePoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancesettings.ComplianceSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.conditionalaccesssettings.ConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.configmanagercollections.ConfigManagerCollectionsRequestBuilder;
import com.microsoft.graph.devicemanagement.configurationcategories.ConfigurationCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.configurationpolicies.ConfigurationPoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.configurationpolicytemplates.ConfigurationPolicyTemplatesRequestBuilder;
import com.microsoft.graph.devicemanagement.configurationsettings.ConfigurationSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.datasharingconsents.DataSharingConsentsRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.DepOnboardingSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.derivedcredentials.DerivedCredentialsRequestBuilder;
import com.microsoft.graph.devicemanagement.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecategories.DeviceCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.DeviceCompliancePoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicydevicestatesummary.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.DeviceCompliancePolicySettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancescripts.DeviceComplianceScriptsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationconflictsummary.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationdevicestatesummaries.DeviceConfigurationDeviceStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationrestrictedappsviolations.DeviceConfigurationRestrictedAppsViolationsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.DeviceConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationsallmanageddevicecertificatestates.DeviceConfigurationsAllManagedDeviceCertificateStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationuserstatesummaries.DeviceConfigurationUserStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecustomattributeshellscripts.DeviceCustomAttributeShellScriptsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.DeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicehealthscripts.DeviceHealthScriptsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementpartners.DeviceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.DeviceManagementScriptsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceshellscripts.DeviceShellScriptsRequestBuilder;
import com.microsoft.graph.devicemanagement.domainjoinconnectors.DomainJoinConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.embeddedsimactivationcodepools.EmbeddedSIMActivationCodePoolsRequestBuilder;
import com.microsoft.graph.devicemanagement.enableandroiddeviceadministratorenrollment.EnableAndroidDeviceAdministratorEnrollmentRequestBuilder;
import com.microsoft.graph.devicemanagement.enablelegacypcmanagement.EnableLegacyPcManagementRequestBuilder;
import com.microsoft.graph.devicemanagement.enableunlicensedadminstrators.EnableUnlicensedAdminstratorsRequestBuilder;
import com.microsoft.graph.devicemanagement.evaluateassignmentfilter.EvaluateAssignmentFilterRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeconnectors.ExchangeConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeonpremisespolicies.ExchangeOnPremisesPoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeonpremisespolicy.ExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.devicemanagement.getassignedroledetails.GetAssignedRoleDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.getassignmentfiltersstatusdetails.GetAssignmentFiltersStatusDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.getcomanageddevicessummary.GetComanagedDevicesSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.getcomanagementeligibledevicessummary.GetComanagementEligibleDevicesSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.geteffectivepermissions.GetEffectivePermissionsRequestBuilder;
import com.microsoft.graph.devicemanagement.geteffectivepermissionswithscope.GetEffectivePermissionsWithScopeRequestBuilder;
import com.microsoft.graph.devicemanagement.getrolescopetagsbyidswithids.GetRoleScopeTagsByIdsWithIdsRequestBuilder;
import com.microsoft.graph.devicemanagement.getrolescopetagsbyresourcewithresource.GetRoleScopeTagsByResourceWithResourceRequestBuilder;
import com.microsoft.graph.devicemanagement.getsuggestedenrollmentlimitwithenrollmenttype.GetSuggestedEnrollmentLimitWithEnrollmentTypeRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicycategories.GroupPolicyCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicyconfigurations.GroupPolicyConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicydefinitionfiles.GroupPolicyDefinitionFilesRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicydefinitions.GroupPolicyDefinitionsRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicymigrationreports.GroupPolicyMigrationReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicyobjectfiles.GroupPolicyObjectFilesRequestBuilder;
import com.microsoft.graph.devicemanagement.grouppolicyuploadeddefinitionfiles.GroupPolicyUploadedDefinitionFilesRequestBuilder;
import com.microsoft.graph.devicemanagement.importeddeviceidentities.ImportedDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.importedwindowsautopilotdeviceidentities.ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.IntentsRequestBuilder;
import com.microsoft.graph.devicemanagement.intunebrandingprofiles.IntuneBrandingProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.iosupdatestatuses.IosUpdateStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.macossoftwareupdateaccountsummaries.MacOSSoftwareUpdateAccountSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddeviceencryptionstates.ManagedDeviceEncryptionStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddeviceoverview.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.microsofttunnelconfigurations.MicrosoftTunnelConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.microsofttunnelhealththresholds.MicrosoftTunnelHealthThresholdsRequestBuilder;
import com.microsoft.graph.devicemanagement.microsofttunnelserverlogcollectionresponses.MicrosoftTunnelServerLogCollectionResponsesRequestBuilder;
import com.microsoft.graph.devicemanagement.microsofttunnelsites.MicrosoftTunnelSitesRequestBuilder;
import com.microsoft.graph.devicemanagement.mobileapptroubleshootingevents.MobileAppTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.MobileThreatDefenseConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.monitoring.MonitoringRequestBuilder;
import com.microsoft.graph.devicemanagement.ndesconnectors.NdesConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.notificationmessagetemplates.NotificationMessageTemplatesRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteactionaudits.RemoteActionAuditsRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteassistancepartners.RemoteAssistancePartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteassistancesettings.RemoteAssistanceSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.ReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.resourceaccessprofiles.ResourceAccessProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.resourceoperations.ResourceOperationsRequestBuilder;
import com.microsoft.graph.devicemanagement.reusablepolicysettings.ReusablePolicySettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.reusablesettings.ReusableSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.devicemanagement.rolescopetags.RoleScopeTagsRequestBuilder;
import com.microsoft.graph.devicemanagement.scopedforresourcewithresource.ScopedForResourceWithResourceRequestBuilder;
import com.microsoft.graph.devicemanagement.sendcustomnotificationtocompanyportal.SendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.devicemanagement.servicenowconnections.ServiceNowConnectionsRequestBuilder;
import com.microsoft.graph.devicemanagement.settingdefinitions.SettingDefinitionsRequestBuilder;
import com.microsoft.graph.devicemanagement.softwareupdatestatussummary.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.telecomexpensemanagementpartners.TelecomExpenseManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.templateinsights.TemplateInsightsRequestBuilder;
import com.microsoft.graph.devicemanagement.templates.TemplatesRequestBuilder;
import com.microsoft.graph.devicemanagement.templatesettings.TemplateSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.tenantattachrbac.TenantAttachRBACRequestBuilder;
import com.microsoft.graph.devicemanagement.termsandconditions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.devicemanagement.troubleshootingevents.TroubleshootingEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsanomaly.UserExperienceAnalyticsAnomalyRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsanomalydevice.UserExperienceAnalyticsAnomalyDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformance.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversion.UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversiondetails.UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversiondeviceid.UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyosversion.UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdevicemodelperformance.UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdeviceperformance.UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdeviceperformancedetails.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthosversionperformance.UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthoverview.UserExperienceAnalyticsAppHealthOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.UserExperienceAnalyticsBaselinesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthappimpact.UserExperienceAnalyticsBatteryHealthAppImpactRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthcapacitydetails.UserExperienceAnalyticsBatteryHealthCapacityDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthdeviceappimpact.UserExperienceAnalyticsBatteryHealthDeviceAppImpactRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthdeviceperformance.UserExperienceAnalyticsBatteryHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthdeviceruntimehistory.UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthmodelperformance.UserExperienceAnalyticsBatteryHealthModelPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthosperformance.UserExperienceAnalyticsBatteryHealthOsPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbatteryhealthruntimedetails.UserExperienceAnalyticsBatteryHealthRuntimeDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticscategories.UserExperienceAnalyticsCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicemetrichistory.UserExperienceAnalyticsDeviceMetricHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdeviceperformance.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicescope.UserExperienceAnalyticsDeviceScopeRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicescopes.UserExperienceAnalyticsDeviceScopesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicescores.UserExperienceAnalyticsDeviceScoresRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartuphistory.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartupprocesses.UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartupprocessperformance.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdeviceswithoutcloudidentity.UserExperienceAnalyticsDevicesWithoutCloudIdentityRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicetimelineevent.UserExperienceAnalyticsDeviceTimelineEventRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsimpactingprocess.UserExperienceAnalyticsImpactingProcessRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsmetrichistory.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsmodelscores.UserExperienceAnalyticsModelScoresRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsnotautopilotreadydevice.UserExperienceAnalyticsNotAutopilotReadyDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsoverview.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsremoteconnection.UserExperienceAnalyticsRemoteConnectionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsresourceperformance.UserExperienceAnalyticsResourcePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsscorehistory.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticssummarizeddevicescopes.UserExperienceAnalyticsSummarizedDeviceScopesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticssummarizeworkfromanywheredevices.UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywherehardwarereadinessmetric.UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywheremetrics.UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywheremodelperformance.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userpfxcertificates.UserPfxCertificatesRequestBuilder;
import com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname.VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.VirtualEndpointRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeploymentprofiles.WindowsAutopilotDeploymentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.WindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotsettings.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsdriverupdateprofiles.WindowsDriverUpdateProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsfeatureupdateprofiles.WindowsFeatureUpdateProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionapplearningsummaries.WindowsInformationProtectionAppLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionnetworklearningsummaries.WindowsInformationProtectionNetworkLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsmalwareinformation.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsqualityupdateprofiles.WindowsQualityUpdateProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsupdatecatalogitems.WindowsUpdateCatalogItemsRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotaartifacts.ZebraFotaArtifactsRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotaconnector.ZebraFotaConnectorRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotadeployments.ZebraFotaDeploymentsRequestBuilder;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the deviceManagement singleton.
 */
public class DeviceManagementRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the advancedThreatProtectionOnboardingStateSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder advancedThreatProtectionOnboardingStateSummary() {
        return new AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidDeviceOwnerEnrollmentProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidDeviceOwnerEnrollmentProfilesRequestBuilder androidDeviceOwnerEnrollmentProfiles() {
        return new AndroidDeviceOwnerEnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidForWorkAppConfigurationSchemas property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidForWorkAppConfigurationSchemasRequestBuilder androidForWorkAppConfigurationSchemas() {
        return new AndroidForWorkAppConfigurationSchemasRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidForWorkEnrollmentProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidForWorkEnrollmentProfilesRequestBuilder androidForWorkEnrollmentProfiles() {
        return new AndroidForWorkEnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidForWorkSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidForWorkSettingsRequestBuilder androidForWorkSettings() {
        return new AndroidForWorkSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidManagedStoreAccountEnterpriseSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder androidManagedStoreAccountEnterpriseSettings() {
        return new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the androidManagedStoreAppConfigurationSchemas property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AndroidManagedStoreAppConfigurationSchemasRequestBuilder androidManagedStoreAppConfigurationSchemas() {
        return new AndroidManagedStoreAppConfigurationSchemasRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the applePushNotificationCertificate property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the appleUserInitiatedEnrollmentProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AppleUserInitiatedEnrollmentProfilesRequestBuilder appleUserInitiatedEnrollmentProfiles() {
        return new AppleUserInitiatedEnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentFilters property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AssignmentFiltersRequestBuilder assignmentFilters() {
        return new AssignmentFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the auditEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the autopilotEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AutopilotEventsRequestBuilder autopilotEvents() {
        return new AutopilotEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cartToClassAssociations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public CartToClassAssociationsRequestBuilder cartToClassAssociations() {
        return new CartToClassAssociationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the categories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the certificateConnectorDetails property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public CertificateConnectorDetailsRequestBuilder certificateConnectorDetails() {
        return new CertificateConnectorDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the chromeOSOnboardingSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ChromeOSOnboardingSettingsRequestBuilder chromeOSOnboardingSettings() {
        return new ChromeOSOnboardingSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudPCConnectivityIssues property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public CloudPCConnectivityIssuesRequestBuilder cloudPCConnectivityIssues() {
        return new CloudPCConnectivityIssuesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComanagedDevicesRequestBuilder comanagedDevices() {
        return new ComanagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the comanagementEligibleDevices property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComanagementEligibleDevicesRequestBuilder comanagementEligibleDevices() {
        return new ComanagementEligibleDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the complianceCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComplianceCategoriesRequestBuilder complianceCategories() {
        return new ComplianceCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the complianceManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComplianceManagementPartnersRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the compliancePolicies property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public CompliancePoliciesRequestBuilder compliancePolicies() {
        return new CompliancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the complianceSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComplianceSettingsRequestBuilder complianceSettings() {
        return new ComplianceSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the conditionalAccessSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new ConditionalAccessSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the configManagerCollections property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConfigManagerCollectionsRequestBuilder configManagerCollections() {
        return new ConfigManagerCollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the configurationCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConfigurationCategoriesRequestBuilder configurationCategories() {
        return new ConfigurationCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the configurationPolicies property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConfigurationPoliciesRequestBuilder configurationPolicies() {
        return new ConfigurationPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the configurationPolicyTemplates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConfigurationPolicyTemplatesRequestBuilder configurationPolicyTemplates() {
        return new ConfigurationPolicyTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the configurationSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConfigurationSettingsRequestBuilder configurationSettings() {
        return new ConfigurationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dataSharingConsents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DataSharingConsentsRequestBuilder dataSharingConsents() {
        return new DataSharingConsentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the depOnboardingSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DepOnboardingSettingsRequestBuilder depOnboardingSettings() {
        return new DepOnboardingSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the derivedCredentials property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DerivedCredentialsRequestBuilder derivedCredentials() {
        return new DerivedCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the detectedApps property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCategoriesRequestBuilder deviceCategories() {
        return new DeviceCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicies property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePoliciesRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicyDeviceStateSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceComplianceScripts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceComplianceScriptsRequestBuilder deviceComplianceScripts() {
        return new DeviceComplianceScriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationConflictSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationConflictSummaryRequestBuilder deviceConfigurationConflictSummary() {
        return new DeviceConfigurationConflictSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationDeviceStateSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationDeviceStateSummariesRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationRestrictedAppsViolations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationRestrictedAppsViolationsRequestBuilder deviceConfigurationRestrictedAppsViolations() {
        return new DeviceConfigurationRestrictedAppsViolationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationsRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationsAllManagedDeviceCertificateStates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationsAllManagedDeviceCertificateStatesRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates() {
        return new DeviceConfigurationsAllManagedDeviceCertificateStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationUserStateSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationUserStateSummariesRequestBuilder deviceConfigurationUserStateSummaries() {
        return new DeviceConfigurationUserStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCustomAttributeShellScripts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCustomAttributeShellScriptsRequestBuilder deviceCustomAttributeShellScripts() {
        return new DeviceCustomAttributeShellScriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceEnrollmentConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceHealthScripts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceHealthScriptsRequestBuilder deviceHealthScripts() {
        return new DeviceHealthScriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceManagementPartnersRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceManagementScripts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceManagementScriptsRequestBuilder deviceManagementScripts() {
        return new DeviceManagementScriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceShellScripts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceShellScriptsRequestBuilder deviceShellScripts() {
        return new DeviceShellScriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the domainJoinConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DomainJoinConnectorsRequestBuilder domainJoinConnectors() {
        return new DomainJoinConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the embeddedSIMActivationCodePools property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public EmbeddedSIMActivationCodePoolsRequestBuilder embeddedSIMActivationCodePools() {
        return new EmbeddedSIMActivationCodePoolsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enableAndroidDeviceAdministratorEnrollment method. */
    @javax.annotation.Nonnull
    public EnableAndroidDeviceAdministratorEnrollmentRequestBuilder enableAndroidDeviceAdministratorEnrollment() {
        return new EnableAndroidDeviceAdministratorEnrollmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enableLegacyPcManagement method. */
    @javax.annotation.Nonnull
    public EnableLegacyPcManagementRequestBuilder enableLegacyPcManagement() {
        return new EnableLegacyPcManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enableUnlicensedAdminstrators method. */
    @javax.annotation.Nonnull
    public EnableUnlicensedAdminstratorsRequestBuilder enableUnlicensedAdminstrators() {
        return new EnableUnlicensedAdminstratorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the evaluateAssignmentFilter method. */
    @javax.annotation.Nonnull
    public EvaluateAssignmentFilterRequestBuilder evaluateAssignmentFilter() {
        return new EvaluateAssignmentFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exchangeConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ExchangeConnectorsRequestBuilder exchangeConnectors() {
        return new ExchangeConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exchangeOnPremisesPolicies property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ExchangeOnPremisesPoliciesRequestBuilder exchangeOnPremisesPolicies() {
        return new ExchangeOnPremisesPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exchangeOnPremisesPolicy property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicy() {
        return new ExchangeOnPremisesPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAssignedRoleDetails method. */
    @javax.annotation.Nonnull
    public GetAssignedRoleDetailsRequestBuilder getAssignedRoleDetails() {
        return new GetAssignedRoleDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAssignmentFiltersStatusDetails method. */
    @javax.annotation.Nonnull
    public GetAssignmentFiltersStatusDetailsRequestBuilder getAssignmentFiltersStatusDetails() {
        return new GetAssignmentFiltersStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getComanagedDevicesSummary method. */
    @javax.annotation.Nonnull
    public GetComanagedDevicesSummaryRequestBuilder getComanagedDevicesSummary() {
        return new GetComanagedDevicesSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getComanagementEligibleDevicesSummary method. */
    @javax.annotation.Nonnull
    public GetComanagementEligibleDevicesSummaryRequestBuilder getComanagementEligibleDevicesSummary() {
        return new GetComanagementEligibleDevicesSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getEffectivePermissions method. */
    @javax.annotation.Nonnull
    public GetEffectivePermissionsRequestBuilder getEffectivePermissions() {
        return new GetEffectivePermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyCategoriesRequestBuilder groupPolicyCategories() {
        return new GroupPolicyCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyConfigurationsRequestBuilder groupPolicyConfigurations() {
        return new GroupPolicyConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyDefinitionFiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyDefinitionFilesRequestBuilder groupPolicyDefinitionFiles() {
        return new GroupPolicyDefinitionFilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyDefinitions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyDefinitionsRequestBuilder groupPolicyDefinitions() {
        return new GroupPolicyDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyMigrationReports property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyMigrationReportsRequestBuilder groupPolicyMigrationReports() {
        return new GroupPolicyMigrationReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyObjectFiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyObjectFilesRequestBuilder groupPolicyObjectFiles() {
        return new GroupPolicyObjectFilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupPolicyUploadedDefinitionFiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public GroupPolicyUploadedDefinitionFilesRequestBuilder groupPolicyUploadedDefinitionFiles() {
        return new GroupPolicyUploadedDefinitionFilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the importedDeviceIdentities property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ImportedDeviceIdentitiesRequestBuilder importedDeviceIdentities() {
        return new ImportedDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the importedWindowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the intents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public IntentsRequestBuilder intents() {
        return new IntentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the intuneBrandingProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public IntuneBrandingProfilesRequestBuilder intuneBrandingProfiles() {
        return new IntuneBrandingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the iosUpdateStatuses property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public IosUpdateStatusesRequestBuilder iosUpdateStatuses() {
        return new IosUpdateStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the macOSSoftwareUpdateAccountSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MacOSSoftwareUpdateAccountSummariesRequestBuilder macOSSoftwareUpdateAccountSummaries() {
        return new MacOSSoftwareUpdateAccountSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceEncryptionStates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceEncryptionStatesRequestBuilder managedDeviceEncryptionStates() {
        return new ManagedDeviceEncryptionStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceOverview property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceOverviewRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the microsoftTunnelConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MicrosoftTunnelConfigurationsRequestBuilder microsoftTunnelConfigurations() {
        return new MicrosoftTunnelConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the microsoftTunnelHealthThresholds property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MicrosoftTunnelHealthThresholdsRequestBuilder microsoftTunnelHealthThresholds() {
        return new MicrosoftTunnelHealthThresholdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the microsoftTunnelServerLogCollectionResponses property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MicrosoftTunnelServerLogCollectionResponsesRequestBuilder microsoftTunnelServerLogCollectionResponses() {
        return new MicrosoftTunnelServerLogCollectionResponsesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the microsoftTunnelSites property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MicrosoftTunnelSitesRequestBuilder microsoftTunnelSites() {
        return new MicrosoftTunnelSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileAppTroubleshootingEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MobileAppTroubleshootingEventsRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileThreatDefenseConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MobileThreatDefenseConnectorsRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the monitoring property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MonitoringRequestBuilder monitoring() {
        return new MonitoringRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the ndesConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public NdesConnectorsRequestBuilder ndesConnectors() {
        return new NdesConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the notificationMessageTemplates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public NotificationMessageTemplatesRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the remoteActionAudits property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RemoteActionAuditsRequestBuilder remoteActionAudits() {
        return new RemoteActionAuditsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the remoteAssistancePartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RemoteAssistancePartnersRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the remoteAssistanceSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RemoteAssistanceSettingsRequestBuilder remoteAssistanceSettings() {
        return new RemoteAssistanceSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the resourceAccessProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ResourceAccessProfilesRequestBuilder resourceAccessProfiles() {
        return new ResourceAccessProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the resourceOperations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ResourceOperationsRequestBuilder resourceOperations() {
        return new ResourceOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reusablePolicySettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ReusablePolicySettingsRequestBuilder reusablePolicySettings() {
        return new ReusablePolicySettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reusableSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ReusableSettingsRequestBuilder reusableSettings() {
        return new ReusableSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleAssignments property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleDefinitions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleScopeTags property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RoleScopeTagsRequestBuilder roleScopeTags() {
        return new RoleScopeTagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sendCustomNotificationToCompanyPortal method. */
    @javax.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the serviceNowConnections property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ServiceNowConnectionsRequestBuilder serviceNowConnections() {
        return new ServiceNowConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the settingDefinitions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public SettingDefinitionsRequestBuilder settingDefinitions() {
        return new SettingDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the softwareUpdateStatusSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public SoftwareUpdateStatusSummaryRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the telecomExpenseManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TelecomExpenseManagementPartnersRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the templateInsights property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TemplateInsightsRequestBuilder templateInsights() {
        return new TemplateInsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the templates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TemplatesRequestBuilder templates() {
        return new TemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the templateSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TemplateSettingsRequestBuilder templateSettings() {
        return new TemplateSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenantAttachRBAC property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TenantAttachRBACRequestBuilder tenantAttachRBAC() {
        return new TenantAttachRBACRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the termsAndConditions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TermsAndConditionsRequestBuilder termsAndConditions() {
        return new TermsAndConditionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the troubleshootingEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TroubleshootingEventsRequestBuilder troubleshootingEvents() {
        return new TroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAnomaly property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAnomalyRequestBuilder userExperienceAnalyticsAnomaly() {
        return new UserExperienceAnalyticsAnomalyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAnomalyDevice property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAnomalyDeviceRequestBuilder userExperienceAnalyticsAnomalyDevice() {
        return new UserExperienceAnalyticsAnomalyDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthDeviceModelPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthDevicePerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthDevicePerformanceDetails property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthOSVersionPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance() {
        return new UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsAppHealthOverview property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthOverviewRequestBuilder userExperienceAnalyticsAppHealthOverview() {
        return new UserExperienceAnalyticsAppHealthOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBaselines property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBaselinesRequestBuilder userExperienceAnalyticsBaselines() {
        return new UserExperienceAnalyticsBaselinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthAppImpact property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthAppImpactRequestBuilder userExperienceAnalyticsBatteryHealthAppImpact() {
        return new UserExperienceAnalyticsBatteryHealthAppImpactRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthCapacityDetails property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthCapacityDetailsRequestBuilder userExperienceAnalyticsBatteryHealthCapacityDetails() {
        return new UserExperienceAnalyticsBatteryHealthCapacityDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthDeviceAppImpact property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthDeviceAppImpactRequestBuilder userExperienceAnalyticsBatteryHealthDeviceAppImpact() {
        return new UserExperienceAnalyticsBatteryHealthDeviceAppImpactRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthDevicePerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceRequestBuilder userExperienceAnalyticsBatteryHealthDevicePerformance() {
        return new UserExperienceAnalyticsBatteryHealthDevicePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryRequestBuilder userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        return new UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthModelPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthModelPerformanceRequestBuilder userExperienceAnalyticsBatteryHealthModelPerformance() {
        return new UserExperienceAnalyticsBatteryHealthModelPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthOsPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthOsPerformanceRequestBuilder userExperienceAnalyticsBatteryHealthOsPerformance() {
        return new UserExperienceAnalyticsBatteryHealthOsPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsBatteryHealthRuntimeDetails property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsBatteryHealthRuntimeDetailsRequestBuilder userExperienceAnalyticsBatteryHealthRuntimeDetails() {
        return new UserExperienceAnalyticsBatteryHealthRuntimeDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsCategoriesRequestBuilder userExperienceAnalyticsCategories() {
        return new UserExperienceAnalyticsCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceMetricHistory property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceMetricHistoryRequestBuilder userExperienceAnalyticsDeviceMetricHistory() {
        return new UserExperienceAnalyticsDeviceMetricHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDevicePerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDevicePerformanceRequestBuilder userExperienceAnalyticsDevicePerformance() {
        return new UserExperienceAnalyticsDevicePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceScope property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceScopeRequestBuilder userExperienceAnalyticsDeviceScope() {
        return new UserExperienceAnalyticsDeviceScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceScopes property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceScopesRequestBuilder userExperienceAnalyticsDeviceScopes() {
        return new UserExperienceAnalyticsDeviceScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceScores property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceScoresRequestBuilder userExperienceAnalyticsDeviceScores() {
        return new UserExperienceAnalyticsDeviceScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceStartupHistory property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder userExperienceAnalyticsDeviceStartupHistory() {
        return new UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceStartupProcesses property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder userExperienceAnalyticsDeviceStartupProcesses() {
        return new UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceStartupProcessPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance() {
        return new UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDevicesWithoutCloudIdentity property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDevicesWithoutCloudIdentityRequestBuilder userExperienceAnalyticsDevicesWithoutCloudIdentity() {
        return new UserExperienceAnalyticsDevicesWithoutCloudIdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsDeviceTimelineEvent property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsDeviceTimelineEventRequestBuilder userExperienceAnalyticsDeviceTimelineEvent() {
        return new UserExperienceAnalyticsDeviceTimelineEventRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsImpactingProcess property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsImpactingProcessRequestBuilder userExperienceAnalyticsImpactingProcess() {
        return new UserExperienceAnalyticsImpactingProcessRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsMetricHistory property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsMetricHistoryRequestBuilder userExperienceAnalyticsMetricHistory() {
        return new UserExperienceAnalyticsMetricHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsModelScores property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsModelScoresRequestBuilder userExperienceAnalyticsModelScores() {
        return new UserExperienceAnalyticsModelScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsNotAutopilotReadyDevice property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsNotAutopilotReadyDeviceRequestBuilder userExperienceAnalyticsNotAutopilotReadyDevice() {
        return new UserExperienceAnalyticsNotAutopilotReadyDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsOverview property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsOverviewRequestBuilder userExperienceAnalyticsOverview() {
        return new UserExperienceAnalyticsOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsRemoteConnection property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsRemoteConnectionRequestBuilder userExperienceAnalyticsRemoteConnection() {
        return new UserExperienceAnalyticsRemoteConnectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsResourcePerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsResourcePerformanceRequestBuilder userExperienceAnalyticsResourcePerformance() {
        return new UserExperienceAnalyticsResourcePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsScoreHistory property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsScoreHistoryRequestBuilder userExperienceAnalyticsScoreHistory() {
        return new UserExperienceAnalyticsScoreHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the userExperienceAnalyticsSummarizedDeviceScopes method. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsSummarizedDeviceScopesRequestBuilder userExperienceAnalyticsSummarizedDeviceScopes() {
        return new UserExperienceAnalyticsSummarizedDeviceScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the userExperienceAnalyticsSummarizeWorkFromAnywhereDevices method. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder userExperienceAnalyticsSummarizeWorkFromAnywhereDevices() {
        return new UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereMetrics property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder userExperienceAnalyticsWorkFromAnywhereMetrics() {
        return new UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereModelPerformance property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder userExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return new UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userPfxCertificates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public UserPfxCertificatesRequestBuilder userPfxCertificates() {
        return new UserPfxCertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the virtualEndpoint property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public VirtualEndpointRequestBuilder virtualEndpoint() {
        return new VirtualEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsAutopilotDeploymentProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsAutopilotDeploymentProfilesRequestBuilder windowsAutopilotDeploymentProfiles() {
        return new WindowsAutopilotDeploymentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsAutopilotDeviceIdentitiesRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsAutopilotSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsAutopilotSettingsRequestBuilder windowsAutopilotSettings() {
        return new WindowsAutopilotSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsDriverUpdateProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsDriverUpdateProfilesRequestBuilder windowsDriverUpdateProfiles() {
        return new WindowsDriverUpdateProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsFeatureUpdateProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsFeatureUpdateProfilesRequestBuilder windowsFeatureUpdateProfiles() {
        return new WindowsFeatureUpdateProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsInformationProtectionAppLearningSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionAppLearningSummariesRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsInformationProtectionNetworkLearningSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionNetworkLearningSummariesRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsMalwareInformation property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsMalwareInformationRequestBuilder windowsMalwareInformation() {
        return new WindowsMalwareInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsQualityUpdateProfiles property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsQualityUpdateProfilesRequestBuilder windowsQualityUpdateProfiles() {
        return new WindowsQualityUpdateProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsUpdateCatalogItems property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsUpdateCatalogItemsRequestBuilder windowsUpdateCatalogItems() {
        return new WindowsUpdateCatalogItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the zebraFotaArtifacts property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ZebraFotaArtifactsRequestBuilder zebraFotaArtifacts() {
        return new ZebraFotaArtifactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the zebraFotaConnector property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ZebraFotaConnectorRequestBuilder zebraFotaConnector() {
        return new ZebraFotaConnectorRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the zebraFotaDeployments property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ZebraFotaDeploymentsRequestBuilder zebraFotaDeployments() {
        return new ZebraFotaDeploymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get deviceManagement
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getEffectivePermissions method.
     * @param scope Usage: scope='{scope}'
     * @return a getEffectivePermissionsWithScopeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEffectivePermissionsWithScopeRequestBuilder getEffectivePermissionsWithScope(@javax.annotation.Nonnull final String scope) {
        Objects.requireNonNull(scope);
        return new GetEffectivePermissionsWithScopeRequestBuilder(pathParameters, requestAdapter, scope);
    }
    /**
     * Provides operations to call the getRoleScopeTagsByIds method.
     * @param ids Usage: ids={ids}
     * @return a getRoleScopeTagsByIdsWithIdsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetRoleScopeTagsByIdsWithIdsRequestBuilder getRoleScopeTagsByIdsWithIds(@javax.annotation.Nonnull final String ids) {
        Objects.requireNonNull(ids);
        return new GetRoleScopeTagsByIdsWithIdsRequestBuilder(pathParameters, requestAdapter, ids);
    }
    /**
     * Provides operations to call the getRoleScopeTagsByResource method.
     * @param resource Usage: resource='{resource}'
     * @return a getRoleScopeTagsByResourceWithResourceRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetRoleScopeTagsByResourceWithResourceRequestBuilder getRoleScopeTagsByResourceWithResource(@javax.annotation.Nonnull final String resource) {
        Objects.requireNonNull(resource);
        return new GetRoleScopeTagsByResourceWithResourceRequestBuilder(pathParameters, requestAdapter, resource);
    }
    /**
     * Provides operations to call the getSuggestedEnrollmentLimit method.
     * @param enrollmentType Usage: enrollmentType='{enrollmentType}'
     * @return a getSuggestedEnrollmentLimitWithEnrollmentTypeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSuggestedEnrollmentLimitWithEnrollmentTypeRequestBuilder getSuggestedEnrollmentLimitWithEnrollmentType(@javax.annotation.Nonnull final String enrollmentType) {
        Objects.requireNonNull(enrollmentType);
        return new GetSuggestedEnrollmentLimitWithEnrollmentTypeRequestBuilder(pathParameters, requestAdapter, enrollmentType);
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patch(@javax.annotation.Nonnull final DeviceManagement body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patch(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the scopedForResource method.
     * @param resource Usage: resource='{resource}'
     * @return a scopedForResourceWithResourceRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedForResourceWithResourceRequestBuilder scopedForResourceWithResource(@javax.annotation.Nonnull final String resource) {
        Objects.requireNonNull(resource);
        return new ScopedForResourceWithResourceRequestBuilder(pathParameters, requestAdapter, resource);
    }
    /**
     * Get deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get deviceManagement
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
     * Update deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to call the verifyWindowsEnrollmentAutoDiscovery method.
     * @param domainName Usage: domainName='{domainName}'
     * @return a verifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder
     */
    @javax.annotation.Nonnull
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder verifyWindowsEnrollmentAutoDiscoveryWithDomainName(@javax.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Get deviceManagement
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
