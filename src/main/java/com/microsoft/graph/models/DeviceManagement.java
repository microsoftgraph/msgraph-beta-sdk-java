package com.microsoft.graph.models;

import com.microsoft.graph.models.devicemanagement.Monitoring;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class DeviceManagement extends Entity implements Parsable {
    /** The date & time when tenant data moved between scaleunits. */
    private OffsetDateTime accountMoveCompletionDateTime;
    /** Admin consent information. */
    private AdminConsent adminConsent;
    /** The summary state of ATP onboarding state for this account. */
    private AdvancedThreatProtectionOnboardingStateSummary advancedThreatProtectionOnboardingStateSummary;
    /** Android device owner enrollment profile entities. */
    private java.util.List<AndroidDeviceOwnerEnrollmentProfile> androidDeviceOwnerEnrollmentProfiles;
    /** Android for Work app configuration schema entities. */
    private java.util.List<AndroidForWorkAppConfigurationSchema> androidForWorkAppConfigurationSchemas;
    /** Android for Work enrollment profile entities. */
    private java.util.List<AndroidForWorkEnrollmentProfile> androidForWorkEnrollmentProfiles;
    /** The singleton Android for Work settings entity. */
    private AndroidForWorkSettings androidForWorkSettings;
    /** The singleton Android managed store account enterprise settings entity. */
    private AndroidManagedStoreAccountEnterpriseSettings androidManagedStoreAccountEnterpriseSettings;
    /** Android Enterprise app configuration schema entities. */
    private java.util.List<AndroidManagedStoreAppConfigurationSchema> androidManagedStoreAppConfigurationSchemas;
    /** Apple push notification certificate. */
    private ApplePushNotificationCertificate applePushNotificationCertificate;
    /** Apple user initiated enrollment profiles */
    private java.util.List<AppleUserInitiatedEnrollmentProfile> appleUserInitiatedEnrollmentProfiles;
    /** The list of assignment filters */
    private java.util.List<DeviceAndAppManagementAssignmentFilter> assignmentFilters;
    /** The Audit Events */
    private java.util.List<AuditEvent> auditEvents;
    /** The list of autopilot events for the tenant. */
    private java.util.List<DeviceManagementAutopilotEvent> autopilotEvents;
    /** The Cart To Class Associations. */
    private java.util.List<CartToClassAssociation> cartToClassAssociations;
    /** The available categories */
    private java.util.List<DeviceManagementSettingCategory> categories;
    /** Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector. */
    private java.util.List<CertificateConnectorDetails> certificateConnectorDetails;
    /** Collection of ChromeOSOnboardingSettings settings associated with account. */
    private java.util.List<ChromeOSOnboardingSettings> chromeOSOnboardingSettings;
    /** The list of CloudPC Connectivity Issue. */
    private java.util.List<CloudPCConnectivityIssue> cloudPCConnectivityIssues;
    /** The list of co-managed devices report */
    private java.util.List<ManagedDevice> comanagedDevices;
    /** The list of co-management eligible devices report */
    private java.util.List<ComanagementEligibleDevice> comanagementEligibleDevices;
    /** List of all compliance categories */
    private java.util.List<DeviceManagementConfigurationCategory> complianceCategories;
    /** The list of Compliance Management Partners configured by the tenant. */
    private java.util.List<ComplianceManagementPartner> complianceManagementPartners;
    /** List of all compliance policies */
    private java.util.List<DeviceManagementCompliancePolicy> compliancePolicies;
    /** List of all ComplianceSettings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> complianceSettings;
    /** The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access */
    private OnPremisesConditionalAccessSettings conditionalAccessSettings;
    /** A list of ConfigManagerCollection */
    private java.util.List<ConfigManagerCollection> configManagerCollections;
    /** List of all Configuration Categories */
    private java.util.List<DeviceManagementConfigurationCategory> configurationCategories;
    /** List of all Configuration policies */
    private java.util.List<DeviceManagementConfigurationPolicy> configurationPolicies;
    /** List of all templates */
    private java.util.List<DeviceManagementConfigurationPolicyTemplate> configurationPolicyTemplates;
    /** List of all ConfigurationSettings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> configurationSettings;
    /** The list of connector status for the tenant. */
    private java.util.List<ConnectorStatusDetails> connectorStatus;
    /** A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data. */
    private DataProcessorServiceForWindowsFeaturesOnboarding dataProcessorServiceForWindowsFeaturesOnboarding;
    /** Data sharing consents. */
    private java.util.List<DataSharingConsent> dataSharingConsents;
    /** This collections of multiple DEP tokens per-tenant. */
    private java.util.List<DepOnboardingSetting> depOnboardingSettings;
    /** Collection of Derived credential settings associated with account. */
    private java.util.List<DeviceManagementDerivedCredentialSettings> derivedCredentials;
    /** The list of detected apps associated with a device. */
    private java.util.List<DetectedApp> detectedApps;
    /** The list of device categories with the tenant. */
    private java.util.List<DeviceCategory> deviceCategories;
    /** The device compliance policies. */
    private java.util.List<DeviceCompliancePolicy> deviceCompliancePolicies;
    /** The device compliance state summary for this account. */
    private DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;
    /** The summary states of compliance policy settings for this account. */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> deviceCompliancePolicySettingStateSummaries;
    /** The last requested time of device compliance reporting for this account. This property is read-only. */
    private OffsetDateTime deviceComplianceReportSummarizationDateTime;
    /** The list of device compliance scripts associated with the tenant. */
    private java.util.List<DeviceComplianceScript> deviceComplianceScripts;
    /** Summary of policies in conflict state for this account. */
    private java.util.List<DeviceConfigurationConflictSummary> deviceConfigurationConflictSummary;
    /** The device configuration device state summary for this account. */
    private DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;
    /** Restricted apps violations for this account. */
    private java.util.List<RestrictedAppsViolation> deviceConfigurationRestrictedAppsViolations;
    /** The device configurations. */
    private java.util.List<DeviceConfiguration> deviceConfigurations;
    /** Summary of all certificates for all devices. */
    private java.util.List<ManagedAllDeviceCertificateState> deviceConfigurationsAllManagedDeviceCertificateStates;
    /** The device configuration user state summary for this account. */
    private DeviceConfigurationUserStateSummary deviceConfigurationUserStateSummaries;
    /** The list of device custom attribute shell scripts associated with the tenant. */
    private java.util.List<DeviceCustomAttributeShellScript> deviceCustomAttributeShellScripts;
    /** The list of device enrollment configurations */
    private java.util.List<DeviceEnrollmentConfiguration> deviceEnrollmentConfigurations;
    /** The list of device health scripts associated with the tenant. */
    private java.util.List<DeviceHealthScript> deviceHealthScripts;
    /** The list of Device Management Partners configured by the tenant. */
    private java.util.List<DeviceManagementPartner> deviceManagementPartners;
    /** The list of device management scripts associated with the tenant. */
    private java.util.List<DeviceManagementScript> deviceManagementScripts;
    /** Device protection overview. */
    private DeviceProtectionOverview deviceProtectionOverview;
    /** The list of device shell scripts associated with the tenant. */
    private java.util.List<DeviceShellScript> deviceShellScripts;
    /** A list of connector objects. */
    private java.util.List<DeviceManagementDomainJoinConnector> domainJoinConnectors;
    /** The embedded SIM activation code pools created by this account. */
    private java.util.List<EmbeddedSIMActivationCodePool> embeddedSIMActivationCodePools;
    /** The list of Exchange Connectors configured by the tenant. */
    private java.util.List<DeviceManagementExchangeConnector> exchangeConnectors;
    /** The list of Exchange On Premisis policies configured by the tenant. */
    private java.util.List<DeviceManagementExchangeOnPremisesPolicy> exchangeOnPremisesPolicies;
    /** The policy which controls mobile device access to Exchange On Premises */
    private DeviceManagementExchangeOnPremisesPolicy exchangeOnPremisesPolicy;
    /** The available group policy categories for this account. */
    private java.util.List<GroupPolicyCategory> groupPolicyCategories;
    /** The group policy configurations created by this account. */
    private java.util.List<GroupPolicyConfiguration> groupPolicyConfigurations;
    /** The available group policy definition files for this account. */
    private java.util.List<GroupPolicyDefinitionFile> groupPolicyDefinitionFiles;
    /** The available group policy definitions for this account. */
    private java.util.List<GroupPolicyDefinition> groupPolicyDefinitions;
    /** A list of Group Policy migration reports. */
    private java.util.List<GroupPolicyMigrationReport> groupPolicyMigrationReports;
    /** A list of Group Policy Object files uploaded. */
    private java.util.List<GroupPolicyObjectFile> groupPolicyObjectFiles;
    /** The available group policy uploaded definition files for this account. */
    private java.util.List<GroupPolicyUploadedDefinitionFile> groupPolicyUploadedDefinitionFiles;
    /** The imported device identities. */
    private java.util.List<ImportedDeviceIdentity> importedDeviceIdentities;
    /** Collection of imported Windows autopilot devices. */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities;
    /** The device management intents */
    private java.util.List<DeviceManagementIntent> intents;
    /** Intune Account ID for given tenant */
    private UUID intuneAccountId;
    /** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
    private IntuneBrand intuneBrand;
    /** Intune branding profiles targeted to AAD groups */
    private java.util.List<IntuneBrandingProfile> intuneBrandingProfiles;
    /** The IOS software update installation statuses for this account. */
    private java.util.List<IosUpdateDeviceStatus> iosUpdateStatuses;
    /** The last modified time of reporting for this account. This property is read-only. */
    private OffsetDateTime lastReportAggregationDateTime;
    /** The property to enable Non-MDM managed legacy PC management for this account. This property is read-only. */
    private Boolean legacyPcManangementEnabled;
    /** The MacOS software update account summaries for this account. */
    private java.util.List<MacOSSoftwareUpdateAccountSummary> macOSSoftwareUpdateAccountSummaries;
    /** Device cleanup rule */
    private ManagedDeviceCleanupSettings managedDeviceCleanupSettings;
    /** Encryption report for devices in this account */
    private java.util.List<ManagedDeviceEncryptionState> managedDeviceEncryptionStates;
    /** Device overview */
    private ManagedDeviceOverview managedDeviceOverview;
    /** The list of managed devices. */
    private java.util.List<ManagedDevice> managedDevices;
    /** Maximum number of DEP tokens allowed per-tenant. */
    private Integer maximumDepTokens;
    /** Collection of MicrosoftTunnelConfiguration settings associated with account. */
    private java.util.List<MicrosoftTunnelConfiguration> microsoftTunnelConfigurations;
    /** Collection of MicrosoftTunnelHealthThreshold settings associated with account. */
    private java.util.List<MicrosoftTunnelHealthThreshold> microsoftTunnelHealthThresholds;
    /** Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account. */
    private java.util.List<MicrosoftTunnelServerLogCollectionResponse> microsoftTunnelServerLogCollectionResponses;
    /** Collection of MicrosoftTunnelSite settings associated with account. */
    private java.util.List<MicrosoftTunnelSite> microsoftTunnelSites;
    /** The collection property of MobileAppTroubleshootingEvent. */
    private java.util.List<MobileAppTroubleshootingEvent> mobileAppTroubleshootingEvents;
    /** The list of Mobile threat Defense connectors configured by the tenant. */
    private java.util.List<MobileThreatDefenseConnector> mobileThreatDefenseConnectors;
    /** The monitoring property */
    private Monitoring monitoring;
    /** The collection of Ndes connectors for this account. */
    private java.util.List<NdesConnector> ndesConnectors;
    /** The Notification Message Templates. */
    private java.util.List<NotificationMessageTemplate> notificationMessageTemplates;
    /** The list of device remote action audits with the tenant. */
    private java.util.List<RemoteActionAudit> remoteActionAudits;
    /** The remote assist partners. */
    private java.util.List<RemoteAssistancePartner> remoteAssistancePartners;
    /** The remote assistance settings singleton */
    private RemoteAssistanceSettings remoteAssistanceSettings;
    /** Reports singleton */
    private DeviceManagementReports reports;
    /** Collection of resource access settings associated with account. */
    private java.util.List<DeviceManagementResourceAccessProfileBase> resourceAccessProfiles;
    /** The Resource Operations. */
    private java.util.List<ResourceOperation> resourceOperations;
    /** List of all reusable settings that can be referred in a policy */
    private java.util.List<DeviceManagementReusablePolicySetting> reusablePolicySettings;
    /** List of all reusable settings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> reusableSettings;
    /** The Role Assignments. */
    private java.util.List<DeviceAndAppManagementRoleAssignment> roleAssignments;
    /** The Role Definitions. */
    private java.util.List<RoleDefinition> roleDefinitions;
    /** The Role Scope Tags. */
    private java.util.List<RoleScopeTag> roleScopeTags;
    /** A list of ServiceNowConnections */
    private java.util.List<ServiceNowConnection> serviceNowConnections;
    /** The device management intent setting definitions */
    private java.util.List<DeviceManagementSettingDefinition> settingDefinitions;
    /** Account level settings. */
    private DeviceManagementSettings settings;
    /** The software update status summary. */
    private SoftwareUpdateStatusSummary softwareUpdateStatusSummary;
    /** Tenant mobile device management subscriptions. */
    private DeviceManagementSubscriptions subscriptions;
    /** Tenant mobile device management subscription state. */
    private DeviceManagementSubscriptionState subscriptionState;
    /** The telecom expense management partners. */
    private java.util.List<TelecomExpenseManagementPartner> telecomExpenseManagementPartners;
    /** List of setting insights in a template */
    private java.util.List<DeviceManagementTemplateInsightsDefinition> templateInsights;
    /** The available templates */
    private java.util.List<DeviceManagementTemplate> templates;
    /** List of all TemplateSettings */
    private java.util.List<DeviceManagementConfigurationSettingTemplate> templateSettings;
    /** TenantAttach RBAC Enablement */
    private TenantAttachRBAC tenantAttachRBAC;
    /** The terms and conditions associated with device management of the company. */
    private java.util.List<TermsAndConditions> termsAndConditions;
    /** The list of troubleshooting events for the tenant. */
    private java.util.List<DeviceManagementTroubleshootingEvent> troubleshootingEvents;
    /** When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only. */
    private Boolean unlicensedAdminstratorsEnabled;
    /** The user experience analytics anomaly entity contains anomaly details. */
    private java.util.List<UserExperienceAnalyticsAnomaly> userExperienceAnalyticsAnomaly;
    /** The user experience analytics anomaly entity contains device details. */
    private java.util.List<UserExperienceAnalyticsAnomalyDevice> userExperienceAnalyticsAnomalyDevice;
    /** The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly. */
    private UserExperienceAnalyticsAnomalySeverityOverview userExperienceAnalyticsAnomalySeverityOverview;
    /** User experience analytics appHealth Application Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> userExperienceAnalyticsAppHealthApplicationPerformance;
    /** User experience analytics appHealth Application Performance by App Version */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;
    /** User experience analytics appHealth Application Performance by App Version details */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    /** User experience analytics appHealth Application Performance by App Version Device Id */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    /** User experience analytics appHealth Application Performance by OS Version */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    /** User experience analytics appHealth Model Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> userExperienceAnalyticsAppHealthDeviceModelPerformance;
    /** User experience analytics appHealth Device Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> userExperienceAnalyticsAppHealthDevicePerformance;
    /** User experience analytics device performance details */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    /** User experience analytics appHealth OS version Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> userExperienceAnalyticsAppHealthOSVersionPerformance;
    /** User experience analytics appHealth overview */
    private UserExperienceAnalyticsCategory userExperienceAnalyticsAppHealthOverview;
    /** User experience analytics baselines */
    private java.util.List<UserExperienceAnalyticsBaseline> userExperienceAnalyticsBaselines;
    /** User Experience Analytics Battery Health App Impact */
    private java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> userExperienceAnalyticsBatteryHealthAppImpact;
    /** User Experience Analytics Battery Health Capacity Details */
    private UserExperienceAnalyticsBatteryHealthCapacityDetails userExperienceAnalyticsBatteryHealthCapacityDetails;
    /** User Experience Analytics Battery Health Device App Impact */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> userExperienceAnalyticsBatteryHealthDeviceAppImpact;
    /** User Experience Analytics Battery Health Device Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> userExperienceAnalyticsBatteryHealthDevicePerformance;
    /** User Experience Analytics Battery Health Device Runtime History */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;
    /** User Experience Analytics Battery Health Model Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> userExperienceAnalyticsBatteryHealthModelPerformance;
    /** User Experience Analytics Battery Health Os Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> userExperienceAnalyticsBatteryHealthOsPerformance;
    /** User Experience Analytics Battery Health Runtime Details */
    private UserExperienceAnalyticsBatteryHealthRuntimeDetails userExperienceAnalyticsBatteryHealthRuntimeDetails;
    /** User experience analytics categories */
    private java.util.List<UserExperienceAnalyticsCategory> userExperienceAnalyticsCategories;
    /** User experience analytics device metric history */
    private java.util.List<UserExperienceAnalyticsMetricHistory> userExperienceAnalyticsDeviceMetricHistory;
    /** User experience analytics device performance */
    private java.util.List<UserExperienceAnalyticsDevicePerformance> userExperienceAnalyticsDevicePerformance;
    /** The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration. */
    private UserExperienceAnalyticsDeviceScope userExperienceAnalyticsDeviceScope;
    /** The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports. */
    private java.util.List<UserExperienceAnalyticsDeviceScope> userExperienceAnalyticsDeviceScopes;
    /** User experience analytics device scores */
    private java.util.List<UserExperienceAnalyticsDeviceScores> userExperienceAnalyticsDeviceScores;
    /** User experience analytics device Startup History */
    private java.util.List<UserExperienceAnalyticsDeviceStartupHistory> userExperienceAnalyticsDeviceStartupHistory;
    /** User experience analytics device Startup Processes */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcess> userExperienceAnalyticsDeviceStartupProcesses;
    /** User experience analytics device Startup Process Performance */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> userExperienceAnalyticsDeviceStartupProcessPerformance;
    /** User experience analytics devices without cloud identity. */
    private java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> userExperienceAnalyticsDevicesWithoutCloudIdentity;
    /** The user experience analytics device events entity contains NRT device timeline event details. */
    private java.util.List<UserExperienceAnalyticsDeviceTimelineEvent> userExperienceAnalyticsDeviceTimelineEvent;
    /** User experience analytics impacting process */
    private java.util.List<UserExperienceAnalyticsImpactingProcess> userExperienceAnalyticsImpactingProcess;
    /** User experience analytics metric history */
    private java.util.List<UserExperienceAnalyticsMetricHistory> userExperienceAnalyticsMetricHistory;
    /** User experience analytics model scores */
    private java.util.List<UserExperienceAnalyticsModelScores> userExperienceAnalyticsModelScores;
    /** User experience analytics devices not Windows Autopilot ready. */
    private java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> userExperienceAnalyticsNotAutopilotReadyDevice;
    /** User experience analytics overview */
    private UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;
    /** User experience analytics remote connection */
    private java.util.List<UserExperienceAnalyticsRemoteConnection> userExperienceAnalyticsRemoteConnection;
    /** User experience analytics resource performance */
    private java.util.List<UserExperienceAnalyticsResourcePerformance> userExperienceAnalyticsResourcePerformance;
    /** User experience analytics device Startup Score History */
    private java.util.List<UserExperienceAnalyticsScoreHistory> userExperienceAnalyticsScoreHistory;
    /** User experience analytics device settings */
    private UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;
    /** User experience analytics work from anywhere hardware readiness metrics. */
    private UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    /** User experience analytics work from anywhere metrics. */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> userExperienceAnalyticsWorkFromAnywhereMetrics;
    /** The user experience analytics work from anywhere model performance */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    /** Collection of PFX certificates associated with a user. */
    private java.util.List<UserPFXCertificate> userPfxCertificates;
    /** The virtualEndpoint property */
    private VirtualEndpoint virtualEndpoint;
    /** Windows auto pilot deployment profiles */
    private java.util.List<WindowsAutopilotDeploymentProfile> windowsAutopilotDeploymentProfiles;
    /** The Windows autopilot device identities contained collection. */
    private java.util.List<WindowsAutopilotDeviceIdentity> windowsAutopilotDeviceIdentities;
    /** The Windows autopilot account settings. */
    private WindowsAutopilotSettings windowsAutopilotSettings;
    /** A collection of windows driver update profiles */
    private java.util.List<WindowsDriverUpdateProfile> windowsDriverUpdateProfiles;
    /** A collection of windows feature update profiles */
    private java.util.List<WindowsFeatureUpdateProfile> windowsFeatureUpdateProfiles;
    /** The windows information protection app learning summaries. */
    private java.util.List<WindowsInformationProtectionAppLearningSummary> windowsInformationProtectionAppLearningSummaries;
    /** The windows information protection network learning summaries. */
    private java.util.List<WindowsInformationProtectionNetworkLearningSummary> windowsInformationProtectionNetworkLearningSummaries;
    /** The list of affected malware in the tenant. */
    private java.util.List<WindowsMalwareInformation> windowsMalwareInformation;
    /** Malware overview for windows devices. */
    private WindowsMalwareOverview windowsMalwareOverview;
    /** A collection of windows quality update profiles */
    private java.util.List<WindowsQualityUpdateProfile> windowsQualityUpdateProfiles;
    /** A collection of windows update catalog items (fetaure updates item , quality updates item) */
    private java.util.List<WindowsUpdateCatalogItem> windowsUpdateCatalogItems;
    /** The Collection of ZebraFotaArtifacts. */
    private java.util.List<ZebraFotaArtifact> zebraFotaArtifacts;
    /** The singleton ZebraFotaConnector associated with account. */
    private ZebraFotaConnector zebraFotaConnector;
    /** Collection of ZebraFotaDeployments associated with account. */
    private java.util.List<ZebraFotaDeployment> zebraFotaDeployments;
    /**
     * Instantiates a new DeviceManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagement
     */
    @javax.annotation.Nonnull
    public static DeviceManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagement();
    }
    /**
     * Gets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAccountMoveCompletionDateTime() {
        return this.accountMoveCompletionDateTime;
    }
    /**
     * Gets the adminConsent property value. Admin consent information.
     * @return a adminConsent
     */
    @javax.annotation.Nullable
    public AdminConsent getAdminConsent() {
        return this.adminConsent;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @return a advancedThreatProtectionOnboardingStateSummary
     */
    @javax.annotation.Nullable
    public AdvancedThreatProtectionOnboardingStateSummary getAdvancedThreatProtectionOnboardingStateSummary() {
        return this.advancedThreatProtectionOnboardingStateSummary;
    }
    /**
     * Gets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @return a androidDeviceOwnerEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerEnrollmentProfile> getAndroidDeviceOwnerEnrollmentProfiles() {
        return this.androidDeviceOwnerEnrollmentProfiles;
    }
    /**
     * Gets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @return a androidForWorkAppConfigurationSchema
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidForWorkAppConfigurationSchema> getAndroidForWorkAppConfigurationSchemas() {
        return this.androidForWorkAppConfigurationSchemas;
    }
    /**
     * Gets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @return a androidForWorkEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidForWorkEnrollmentProfile> getAndroidForWorkEnrollmentProfiles() {
        return this.androidForWorkEnrollmentProfiles;
    }
    /**
     * Gets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @return a androidForWorkSettings
     */
    @javax.annotation.Nullable
    public AndroidForWorkSettings getAndroidForWorkSettings() {
        return this.androidForWorkSettings;
    }
    /**
     * Gets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @return a androidManagedStoreAccountEnterpriseSettings
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings getAndroidManagedStoreAccountEnterpriseSettings() {
        return this.androidManagedStoreAccountEnterpriseSettings;
    }
    /**
     * Gets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @return a androidManagedStoreAppConfigurationSchema
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchema> getAndroidManagedStoreAppConfigurationSchemas() {
        return this.androidManagedStoreAppConfigurationSchemas;
    }
    /**
     * Gets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @return a applePushNotificationCertificate
     */
    @javax.annotation.Nullable
    public ApplePushNotificationCertificate getApplePushNotificationCertificate() {
        return this.applePushNotificationCertificate;
    }
    /**
     * Gets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @return a appleUserInitiatedEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AppleUserInitiatedEnrollmentProfile> getAppleUserInitiatedEnrollmentProfiles() {
        return this.appleUserInitiatedEnrollmentProfiles;
    }
    /**
     * Gets the assignmentFilters property value. The list of assignment filters
     * @return a deviceAndAppManagementAssignmentFilter
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentFilter> getAssignmentFilters() {
        return this.assignmentFilters;
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a auditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @return a deviceManagementAutopilotEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementAutopilotEvent> getAutopilotEvents() {
        return this.autopilotEvents;
    }
    /**
     * Gets the cartToClassAssociations property value. The Cart To Class Associations.
     * @return a cartToClassAssociation
     */
    @javax.annotation.Nullable
    public java.util.List<CartToClassAssociation> getCartToClassAssociations() {
        return this.cartToClassAssociations;
    }
    /**
     * Gets the categories property value. The available categories
     * @return a deviceManagementSettingCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingCategory> getCategories() {
        return this.categories;
    }
    /**
     * Gets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @return a certificateConnectorDetails
     */
    @javax.annotation.Nullable
    public java.util.List<CertificateConnectorDetails> getCertificateConnectorDetails() {
        return this.certificateConnectorDetails;
    }
    /**
     * Gets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @return a chromeOSOnboardingSettings
     */
    @javax.annotation.Nullable
    public java.util.List<ChromeOSOnboardingSettings> getChromeOSOnboardingSettings() {
        return this.chromeOSOnboardingSettings;
    }
    /**
     * Gets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @return a cloudPCConnectivityIssue
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPCConnectivityIssue> getCloudPCConnectivityIssues() {
        return this.cloudPCConnectivityIssues;
    }
    /**
     * Gets the comanagedDevices property value. The list of co-managed devices report
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getComanagedDevices() {
        return this.comanagedDevices;
    }
    /**
     * Gets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @return a comanagementEligibleDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ComanagementEligibleDevice> getComanagementEligibleDevices() {
        return this.comanagementEligibleDevices;
    }
    /**
     * Gets the complianceCategories property value. List of all compliance categories
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getComplianceCategories() {
        return this.complianceCategories;
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a complianceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this.complianceManagementPartners;
    }
    /**
     * Gets the compliancePolicies property value. List of all compliance policies
     * @return a deviceManagementCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementCompliancePolicy> getCompliancePolicies() {
        return this.compliancePolicies;
    }
    /**
     * Gets the complianceSettings property value. List of all ComplianceSettings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getComplianceSettings() {
        return this.complianceSettings;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this.conditionalAccessSettings;
    }
    /**
     * Gets the configManagerCollections property value. A list of ConfigManagerCollection
     * @return a configManagerCollection
     */
    @javax.annotation.Nullable
    public java.util.List<ConfigManagerCollection> getConfigManagerCollections() {
        return this.configManagerCollections;
    }
    /**
     * Gets the configurationCategories property value. List of all Configuration Categories
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getConfigurationCategories() {
        return this.configurationCategories;
    }
    /**
     * Gets the configurationPolicies property value. List of all Configuration policies
     * @return a deviceManagementConfigurationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getConfigurationPolicies() {
        return this.configurationPolicies;
    }
    /**
     * Gets the configurationPolicyTemplates property value. List of all templates
     * @return a deviceManagementConfigurationPolicyTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicyTemplate> getConfigurationPolicyTemplates() {
        return this.configurationPolicyTemplates;
    }
    /**
     * Gets the configurationSettings property value. List of all ConfigurationSettings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getConfigurationSettings() {
        return this.configurationSettings;
    }
    /**
     * Gets the connectorStatus property value. The list of connector status for the tenant.
     * @return a connectorStatusDetails
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectorStatusDetails> getConnectorStatus() {
        return this.connectorStatus;
    }
    /**
     * Gets the dataProcessorServiceForWindowsFeaturesOnboarding property value. A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data.
     * @return a dataProcessorServiceForWindowsFeaturesOnboarding
     */
    @javax.annotation.Nullable
    public DataProcessorServiceForWindowsFeaturesOnboarding getDataProcessorServiceForWindowsFeaturesOnboarding() {
        return this.dataProcessorServiceForWindowsFeaturesOnboarding;
    }
    /**
     * Gets the dataSharingConsents property value. Data sharing consents.
     * @return a dataSharingConsent
     */
    @javax.annotation.Nullable
    public java.util.List<DataSharingConsent> getDataSharingConsents() {
        return this.dataSharingConsents;
    }
    /**
     * Gets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @return a depOnboardingSetting
     */
    @javax.annotation.Nullable
    public java.util.List<DepOnboardingSetting> getDepOnboardingSettings() {
        return this.depOnboardingSettings;
    }
    /**
     * Gets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementDerivedCredentialSettings> getDerivedCredentials() {
        return this.derivedCredentials;
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.detectedApps;
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this.deviceCategories;
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a deviceCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this.deviceCompliancePolicies;
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a deviceCompliancePolicyDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this.deviceCompliancePolicyDeviceStateSummary;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeviceComplianceReportSummarizationDateTime() {
        return this.deviceComplianceReportSummarizationDateTime;
    }
    /**
     * Gets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @return a deviceComplianceScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScript> getDeviceComplianceScripts() {
        return this.deviceComplianceScripts;
    }
    /**
     * Gets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @return a deviceConfigurationConflictSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationConflictSummary> getDeviceConfigurationConflictSummary() {
        return this.deviceConfigurationConflictSummary;
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a deviceConfigurationDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this.deviceConfigurationDeviceStateSummaries;
    }
    /**
     * Gets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @return a restrictedAppsViolation
     */
    @javax.annotation.Nullable
    public java.util.List<RestrictedAppsViolation> getDeviceConfigurationRestrictedAppsViolations() {
        return this.deviceConfigurationRestrictedAppsViolations;
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this.deviceConfigurations;
    }
    /**
     * Gets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @return a managedAllDeviceCertificateState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAllDeviceCertificateState> getDeviceConfigurationsAllManagedDeviceCertificateStates() {
        return this.deviceConfigurationsAllManagedDeviceCertificateStates;
    }
    /**
     * Gets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @return a deviceConfigurationUserStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserStateSummary getDeviceConfigurationUserStateSummaries() {
        return this.deviceConfigurationUserStateSummaries;
    }
    /**
     * Gets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @return a deviceCustomAttributeShellScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCustomAttributeShellScript> getDeviceCustomAttributeShellScripts() {
        return this.deviceCustomAttributeShellScripts;
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this.deviceEnrollmentConfigurations;
    }
    /**
     * Gets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @return a deviceHealthScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScript> getDeviceHealthScripts() {
        return this.deviceHealthScripts;
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a deviceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this.deviceManagementPartners;
    }
    /**
     * Gets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @return a deviceManagementScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScript> getDeviceManagementScripts() {
        return this.deviceManagementScripts;
    }
    /**
     * Gets the deviceProtectionOverview property value. Device protection overview.
     * @return a deviceProtectionOverview
     */
    @javax.annotation.Nullable
    public DeviceProtectionOverview getDeviceProtectionOverview() {
        return this.deviceProtectionOverview;
    }
    /**
     * Gets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @return a deviceShellScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceShellScript> getDeviceShellScripts() {
        return this.deviceShellScripts;
    }
    /**
     * Gets the domainJoinConnectors property value. A list of connector objects.
     * @return a deviceManagementDomainJoinConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementDomainJoinConnector> getDomainJoinConnectors() {
        return this.domainJoinConnectors;
    }
    /**
     * Gets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @return a embeddedSIMActivationCodePool
     */
    @javax.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCodePool> getEmbeddedSIMActivationCodePools() {
        return this.embeddedSIMActivationCodePools;
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a deviceManagementExchangeConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this.exchangeConnectors;
    }
    /**
     * Gets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @return a deviceManagementExchangeOnPremisesPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeOnPremisesPolicy> getExchangeOnPremisesPolicies() {
        return this.exchangeOnPremisesPolicies;
    }
    /**
     * Gets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @return a deviceManagementExchangeOnPremisesPolicy
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeOnPremisesPolicy getExchangeOnPremisesPolicy() {
        return this.exchangeOnPremisesPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountMoveCompletionDateTime", (n) -> { this.setAccountMoveCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("adminConsent", (n) -> { this.setAdminConsent(n.getObjectValue(AdminConsent::createFromDiscriminatorValue)); });
        deserializerMap.put("advancedThreatProtectionOnboardingStateSummary", (n) -> { this.setAdvancedThreatProtectionOnboardingStateSummary(n.getObjectValue(AdvancedThreatProtectionOnboardingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("androidDeviceOwnerEnrollmentProfiles", (n) -> { this.setAndroidDeviceOwnerEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidDeviceOwnerEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkAppConfigurationSchemas", (n) -> { this.setAndroidForWorkAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidForWorkAppConfigurationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkEnrollmentProfiles", (n) -> { this.setAndroidForWorkEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidForWorkEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkSettings", (n) -> { this.setAndroidForWorkSettings(n.getObjectValue(AndroidForWorkSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("androidManagedStoreAccountEnterpriseSettings", (n) -> { this.setAndroidManagedStoreAccountEnterpriseSettings(n.getObjectValue(AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("androidManagedStoreAppConfigurationSchemas", (n) -> { this.setAndroidManagedStoreAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("applePushNotificationCertificate", (n) -> { this.setApplePushNotificationCertificate(n.getObjectValue(ApplePushNotificationCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("appleUserInitiatedEnrollmentProfiles", (n) -> { this.setAppleUserInitiatedEnrollmentProfiles(n.getCollectionOfObjectValues(AppleUserInitiatedEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentFilters", (n) -> { this.setAssignmentFilters(n.getCollectionOfObjectValues(DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("autopilotEvents", (n) -> { this.setAutopilotEvents(n.getCollectionOfObjectValues(DeviceManagementAutopilotEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("cartToClassAssociations", (n) -> { this.setCartToClassAssociations(n.getCollectionOfObjectValues(CartToClassAssociation::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(DeviceManagementSettingCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateConnectorDetails", (n) -> { this.setCertificateConnectorDetails(n.getCollectionOfObjectValues(CertificateConnectorDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("chromeOSOnboardingSettings", (n) -> { this.setChromeOSOnboardingSettings(n.getCollectionOfObjectValues(ChromeOSOnboardingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPCConnectivityIssues", (n) -> { this.setCloudPCConnectivityIssues(n.getCollectionOfObjectValues(CloudPCConnectivityIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("comanagedDevices", (n) -> { this.setComanagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("comanagementEligibleDevices", (n) -> { this.setComanagementEligibleDevices(n.getCollectionOfObjectValues(ComanagementEligibleDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceCategories", (n) -> { this.setComplianceCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceManagementPartners", (n) -> { this.setComplianceManagementPartners(n.getCollectionOfObjectValues(ComplianceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("compliancePolicies", (n) -> { this.setCompliancePolicies(n.getCollectionOfObjectValues(DeviceManagementCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceSettings", (n) -> { this.setComplianceSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessSettings", (n) -> { this.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("configManagerCollections", (n) -> { this.setConfigManagerCollections(n.getCollectionOfObjectValues(ConfigManagerCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationCategories", (n) -> { this.setConfigurationCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationPolicies", (n) -> { this.setConfigurationPolicies(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationPolicyTemplates", (n) -> { this.setConfigurationPolicyTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationSettings", (n) -> { this.setConfigurationSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorStatus", (n) -> { this.setConnectorStatus(n.getCollectionOfObjectValues(ConnectorStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dataProcessorServiceForWindowsFeaturesOnboarding", (n) -> { this.setDataProcessorServiceForWindowsFeaturesOnboarding(n.getObjectValue(DataProcessorServiceForWindowsFeaturesOnboarding::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSharingConsents", (n) -> { this.setDataSharingConsents(n.getCollectionOfObjectValues(DataSharingConsent::createFromDiscriminatorValue)); });
        deserializerMap.put("depOnboardingSettings", (n) -> { this.setDepOnboardingSettings(n.getCollectionOfObjectValues(DepOnboardingSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("derivedCredentials", (n) -> { this.setDerivedCredentials(n.getCollectionOfObjectValues(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedApps", (n) -> { this.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategories", (n) -> { this.setDeviceCategories(n.getCollectionOfObjectValues(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicies", (n) -> { this.setDeviceCompliancePolicies(n.getCollectionOfObjectValues(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicyDeviceStateSummary", (n) -> { this.setDeviceCompliancePolicyDeviceStateSummary(n.getObjectValue(DeviceCompliancePolicyDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicySettingStateSummaries", (n) -> { this.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceComplianceReportSummarizationDateTime", (n) -> { this.setDeviceComplianceReportSummarizationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceComplianceScripts", (n) -> { this.setDeviceComplianceScripts(n.getCollectionOfObjectValues(DeviceComplianceScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationConflictSummary", (n) -> { this.setDeviceConfigurationConflictSummary(n.getCollectionOfObjectValues(DeviceConfigurationConflictSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationDeviceStateSummaries", (n) -> { this.setDeviceConfigurationDeviceStateSummaries(n.getObjectValue(DeviceConfigurationDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationRestrictedAppsViolations", (n) -> { this.setDeviceConfigurationRestrictedAppsViolations(n.getCollectionOfObjectValues(RestrictedAppsViolation::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurations", (n) -> { this.setDeviceConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationsAllManagedDeviceCertificateStates", (n) -> { this.setDeviceConfigurationsAllManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedAllDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationUserStateSummaries", (n) -> { this.setDeviceConfigurationUserStateSummaries(n.getObjectValue(DeviceConfigurationUserStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCustomAttributeShellScripts", (n) -> { this.setDeviceCustomAttributeShellScripts(n.getCollectionOfObjectValues(DeviceCustomAttributeShellScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentConfigurations", (n) -> { this.setDeviceEnrollmentConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthScripts", (n) -> { this.setDeviceHealthScripts(n.getCollectionOfObjectValues(DeviceHealthScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementPartners", (n) -> { this.setDeviceManagementPartners(n.getCollectionOfObjectValues(DeviceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementScripts", (n) -> { this.setDeviceManagementScripts(n.getCollectionOfObjectValues(DeviceManagementScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceProtectionOverview", (n) -> { this.setDeviceProtectionOverview(n.getObjectValue(DeviceProtectionOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceShellScripts", (n) -> { this.setDeviceShellScripts(n.getCollectionOfObjectValues(DeviceShellScript::createFromDiscriminatorValue)); });
        deserializerMap.put("domainJoinConnectors", (n) -> { this.setDomainJoinConnectors(n.getCollectionOfObjectValues(DeviceManagementDomainJoinConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("embeddedSIMActivationCodePools", (n) -> { this.setEmbeddedSIMActivationCodePools(n.getCollectionOfObjectValues(EmbeddedSIMActivationCodePool::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeConnectors", (n) -> { this.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeOnPremisesPolicies", (n) -> { this.setExchangeOnPremisesPolicies(n.getCollectionOfObjectValues(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeOnPremisesPolicy", (n) -> { this.setExchangeOnPremisesPolicy(n.getObjectValue(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyCategories", (n) -> { this.setGroupPolicyCategories(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyConfigurations", (n) -> { this.setGroupPolicyConfigurations(n.getCollectionOfObjectValues(GroupPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyDefinitionFiles", (n) -> { this.setGroupPolicyDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyDefinitions", (n) -> { this.setGroupPolicyDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyMigrationReports", (n) -> { this.setGroupPolicyMigrationReports(n.getCollectionOfObjectValues(GroupPolicyMigrationReport::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyObjectFiles", (n) -> { this.setGroupPolicyObjectFiles(n.getCollectionOfObjectValues(GroupPolicyObjectFile::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyUploadedDefinitionFiles", (n) -> { this.setGroupPolicyUploadedDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("importedDeviceIdentities", (n) -> { this.setImportedDeviceIdentities(n.getCollectionOfObjectValues(ImportedDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("importedWindowsAutopilotDeviceIdentities", (n) -> { this.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("intents", (n) -> { this.setIntents(n.getCollectionOfObjectValues(DeviceManagementIntent::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneAccountId", (n) -> { this.setIntuneAccountId(n.getUUIDValue()); });
        deserializerMap.put("intuneBrand", (n) -> { this.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneBrandingProfiles", (n) -> { this.setIntuneBrandingProfiles(n.getCollectionOfObjectValues(IntuneBrandingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("iosUpdateStatuses", (n) -> { this.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("lastReportAggregationDateTime", (n) -> { this.setLastReportAggregationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legacyPcManangementEnabled", (n) -> { this.setLegacyPcManangementEnabled(n.getBooleanValue()); });
        deserializerMap.put("macOSSoftwareUpdateAccountSummaries", (n) -> { this.setMacOSSoftwareUpdateAccountSummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateAccountSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCleanupSettings", (n) -> { this.setManagedDeviceCleanupSettings(n.getObjectValue(ManagedDeviceCleanupSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceEncryptionStates", (n) -> { this.setManagedDeviceEncryptionStates(n.getCollectionOfObjectValues(ManagedDeviceEncryptionState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceOverview", (n) -> { this.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("maximumDepTokens", (n) -> { this.setMaximumDepTokens(n.getIntegerValue()); });
        deserializerMap.put("microsoftTunnelConfigurations", (n) -> { this.setMicrosoftTunnelConfigurations(n.getCollectionOfObjectValues(MicrosoftTunnelConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelHealthThresholds", (n) -> { this.setMicrosoftTunnelHealthThresholds(n.getCollectionOfObjectValues(MicrosoftTunnelHealthThreshold::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelServerLogCollectionResponses", (n) -> { this.setMicrosoftTunnelServerLogCollectionResponses(n.getCollectionOfObjectValues(MicrosoftTunnelServerLogCollectionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSites", (n) -> { this.setMicrosoftTunnelSites(n.getCollectionOfObjectValues(MicrosoftTunnelSite::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppTroubleshootingEvents", (n) -> { this.setMobileAppTroubleshootingEvents(n.getCollectionOfObjectValues(MobileAppTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileThreatDefenseConnectors", (n) -> { this.setMobileThreatDefenseConnectors(n.getCollectionOfObjectValues(MobileThreatDefenseConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("monitoring", (n) -> { this.setMonitoring(n.getObjectValue(Monitoring::createFromDiscriminatorValue)); });
        deserializerMap.put("ndesConnectors", (n) -> { this.setNdesConnectors(n.getCollectionOfObjectValues(NdesConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationMessageTemplates", (n) -> { this.setNotificationMessageTemplates(n.getCollectionOfObjectValues(NotificationMessageTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteActionAudits", (n) -> { this.setRemoteActionAudits(n.getCollectionOfObjectValues(RemoteActionAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteAssistancePartners", (n) -> { this.setRemoteAssistancePartners(n.getCollectionOfObjectValues(RemoteAssistancePartner::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteAssistanceSettings", (n) -> { this.setRemoteAssistanceSettings(n.getObjectValue(RemoteAssistanceSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(DeviceManagementReports::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceAccessProfiles", (n) -> { this.setResourceAccessProfiles(n.getCollectionOfObjectValues(DeviceManagementResourceAccessProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceOperations", (n) -> { this.setResourceOperations(n.getCollectionOfObjectValues(ResourceOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("reusablePolicySettings", (n) -> { this.setReusablePolicySettings(n.getCollectionOfObjectValues(DeviceManagementReusablePolicySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("reusableSettings", (n) -> { this.setReusableSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(DeviceAndAppManagementRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTags", (n) -> { this.setRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTag::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceNowConnections", (n) -> { this.setServiceNowConnections(n.getCollectionOfObjectValues(ServiceNowConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DeviceManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareUpdateStatusSummary", (n) -> { this.setSoftwareUpdateStatusSummary(n.getObjectValue(SoftwareUpdateStatusSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getEnumValue(DeviceManagementSubscriptions.class)); });
        deserializerMap.put("subscriptionState", (n) -> { this.setSubscriptionState(n.getEnumValue(DeviceManagementSubscriptionState.class)); });
        deserializerMap.put("telecomExpenseManagementPartners", (n) -> { this.setTelecomExpenseManagementPartners(n.getCollectionOfObjectValues(TelecomExpenseManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("templateInsights", (n) -> { this.setTemplateInsights(n.getCollectionOfObjectValues(DeviceManagementTemplateInsightsDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getCollectionOfObjectValues(DeviceManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("templateSettings", (n) -> { this.setTemplateSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantAttachRBAC", (n) -> { this.setTenantAttachRBAC(n.getObjectValue(TenantAttachRBAC::createFromDiscriminatorValue)); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getCollectionOfObjectValues(TermsAndConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("troubleshootingEvents", (n) -> { this.setTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("unlicensedAdminstratorsEnabled", (n) -> { this.setUnlicensedAdminstratorsEnabled(n.getBooleanValue()); });
        deserializerMap.put("userExperienceAnalyticsAnomaly", (n) -> { this.setUserExperienceAnalyticsAnomaly(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomaly::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAnomalyDevice", (n) -> { this.setUserExperienceAnalyticsAnomalyDevice(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomalyDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAnomalySeverityOverview", (n) -> { this.setUserExperienceAnalyticsAnomalySeverityOverview(n.getObjectValue(UserExperienceAnalyticsAnomalySeverityOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthApplicationPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDeviceModelPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDeviceModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDeviceModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformanceDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformanceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOSVersionPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthOSVersionPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthOSVersionPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOverview", (n) -> { this.setUserExperienceAnalyticsAppHealthOverview(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBaselines", (n) -> { this.setUserExperienceAnalyticsBaselines(n.getCollectionOfObjectValues(UserExperienceAnalyticsBaseline::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthAppImpact", (n) -> { this.setUserExperienceAnalyticsBatteryHealthAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthAppImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthCapacityDetails", (n) -> { this.setUserExperienceAnalyticsBatteryHealthCapacityDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthCapacityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDeviceAppImpact", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceAppImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDevicePerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthModelPerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthOsPerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthOsPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthOsPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthRuntimeDetails", (n) -> { this.setUserExperienceAnalyticsBatteryHealthRuntimeDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthRuntimeDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsCategories", (n) -> { this.setUserExperienceAnalyticsCategories(n.getCollectionOfObjectValues(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceMetricHistory", (n) -> { this.setUserExperienceAnalyticsDeviceMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDevicePerformance", (n) -> { this.setUserExperienceAnalyticsDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScope", (n) -> { this.setUserExperienceAnalyticsDeviceScope(n.getObjectValue(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScopes", (n) -> { this.setUserExperienceAnalyticsDeviceScopes(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScores", (n) -> { this.setUserExperienceAnalyticsDeviceScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupHistory", (n) -> { this.setUserExperienceAnalyticsDeviceStartupHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcesses", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcesses(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcessPerformance", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcessPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcessPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDevicesWithoutCloudIdentity", (n) -> { this.setUserExperienceAnalyticsDevicesWithoutCloudIdentity(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceWithoutCloudIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceTimelineEvent", (n) -> { this.setUserExperienceAnalyticsDeviceTimelineEvent(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceTimelineEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsImpactingProcess", (n) -> { this.setUserExperienceAnalyticsImpactingProcess(n.getCollectionOfObjectValues(UserExperienceAnalyticsImpactingProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsMetricHistory", (n) -> { this.setUserExperienceAnalyticsMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsModelScores", (n) -> { this.setUserExperienceAnalyticsModelScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsModelScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsNotAutopilotReadyDevice", (n) -> { this.setUserExperienceAnalyticsNotAutopilotReadyDevice(n.getCollectionOfObjectValues(UserExperienceAnalyticsNotAutopilotReadyDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsOverview", (n) -> { this.setUserExperienceAnalyticsOverview(n.getObjectValue(UserExperienceAnalyticsOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsRemoteConnection", (n) -> { this.setUserExperienceAnalyticsRemoteConnection(n.getCollectionOfObjectValues(UserExperienceAnalyticsRemoteConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsResourcePerformance", (n) -> { this.setUserExperienceAnalyticsResourcePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsResourcePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsScoreHistory", (n) -> { this.setUserExperienceAnalyticsScoreHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsScoreHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsSettings", (n) -> { this.setUserExperienceAnalyticsSettings(n.getObjectValue(UserExperienceAnalyticsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereMetrics", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereMetrics(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereModelPerformance", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userPfxCertificates", (n) -> { this.setUserPfxCertificates(n.getCollectionOfObjectValues(UserPFXCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("virtualEndpoint", (n) -> { this.setVirtualEndpoint(n.getObjectValue(VirtualEndpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotDeploymentProfiles", (n) -> { this.setWindowsAutopilotDeploymentProfiles(n.getCollectionOfObjectValues(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotDeviceIdentities", (n) -> { this.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotSettings", (n) -> { this.setWindowsAutopilotSettings(n.getObjectValue(WindowsAutopilotSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsDriverUpdateProfiles", (n) -> { this.setWindowsDriverUpdateProfiles(n.getCollectionOfObjectValues(WindowsDriverUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsFeatureUpdateProfiles", (n) -> { this.setWindowsFeatureUpdateProfiles(n.getCollectionOfObjectValues(WindowsFeatureUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionAppLearningSummaries", (n) -> { this.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { this.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareInformation", (n) -> { this.setWindowsMalwareInformation(n.getCollectionOfObjectValues(WindowsMalwareInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareOverview", (n) -> { this.setWindowsMalwareOverview(n.getObjectValue(WindowsMalwareOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsQualityUpdateProfiles", (n) -> { this.setWindowsQualityUpdateProfiles(n.getCollectionOfObjectValues(WindowsQualityUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsUpdateCatalogItems", (n) -> { this.setWindowsUpdateCatalogItems(n.getCollectionOfObjectValues(WindowsUpdateCatalogItem::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaArtifacts", (n) -> { this.setZebraFotaArtifacts(n.getCollectionOfObjectValues(ZebraFotaArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaConnector", (n) -> { this.setZebraFotaConnector(n.getObjectValue(ZebraFotaConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaDeployments", (n) -> { this.setZebraFotaDeployments(n.getCollectionOfObjectValues(ZebraFotaDeployment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyCategories property value. The available group policy categories for this account.
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyCategory> getGroupPolicyCategories() {
        return this.groupPolicyCategories;
    }
    /**
     * Gets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @return a groupPolicyConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyConfiguration> getGroupPolicyConfigurations() {
        return this.groupPolicyConfigurations;
    }
    /**
     * Gets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionFile> getGroupPolicyDefinitionFiles() {
        return this.groupPolicyDefinitionFiles;
    }
    /**
     * Gets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getGroupPolicyDefinitions() {
        return this.groupPolicyDefinitions;
    }
    /**
     * Gets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @return a groupPolicyMigrationReport
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyMigrationReport> getGroupPolicyMigrationReports() {
        return this.groupPolicyMigrationReports;
    }
    /**
     * Gets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @return a groupPolicyObjectFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyObjectFile> getGroupPolicyObjectFiles() {
        return this.groupPolicyObjectFiles;
    }
    /**
     * Gets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @return a groupPolicyUploadedDefinitionFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedDefinitionFile> getGroupPolicyUploadedDefinitionFiles() {
        return this.groupPolicyUploadedDefinitionFiles;
    }
    /**
     * Gets the importedDeviceIdentities property value. The imported device identities.
     * @return a importedDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedDeviceIdentity> getImportedDeviceIdentities() {
        return this.importedDeviceIdentities;
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this.importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the intents property value. The device management intents
     * @return a deviceManagementIntent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntent> getIntents() {
        return this.intents;
    }
    /**
     * Gets the intuneAccountId property value. Intune Account ID for given tenant
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getIntuneAccountId() {
        return this.intuneAccountId;
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a intuneBrand
     */
    @javax.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this.intuneBrand;
    }
    /**
     * Gets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @return a intuneBrandingProfile
     */
    @javax.annotation.Nullable
    public java.util.List<IntuneBrandingProfile> getIntuneBrandingProfiles() {
        return this.intuneBrandingProfiles;
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a iosUpdateDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this.iosUpdateStatuses;
    }
    /**
     * Gets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportAggregationDateTime() {
        return this.lastReportAggregationDateTime;
    }
    /**
     * Gets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLegacyPcManangementEnabled() {
        return this.legacyPcManangementEnabled;
    }
    /**
     * Gets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @return a macOSSoftwareUpdateAccountSummary
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateAccountSummary> getMacOSSoftwareUpdateAccountSummaries() {
        return this.macOSSoftwareUpdateAccountSummaries;
    }
    /**
     * Gets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @return a managedDeviceCleanupSettings
     */
    @javax.annotation.Nullable
    public ManagedDeviceCleanupSettings getManagedDeviceCleanupSettings() {
        return this.managedDeviceCleanupSettings;
    }
    /**
     * Gets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @return a managedDeviceEncryptionState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceEncryptionState> getManagedDeviceEncryptionStates() {
        return this.managedDeviceEncryptionStates;
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a managedDeviceOverview
     */
    @javax.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this.managedDeviceOverview;
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this.managedDevices;
    }
    /**
     * Gets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumDepTokens() {
        return this.maximumDepTokens;
    }
    /**
     * Gets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @return a microsoftTunnelConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelConfiguration> getMicrosoftTunnelConfigurations() {
        return this.microsoftTunnelConfigurations;
    }
    /**
     * Gets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @return a microsoftTunnelHealthThreshold
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelHealthThreshold> getMicrosoftTunnelHealthThresholds() {
        return this.microsoftTunnelHealthThresholds;
    }
    /**
     * Gets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @return a microsoftTunnelServerLogCollectionResponse
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelServerLogCollectionResponse> getMicrosoftTunnelServerLogCollectionResponses() {
        return this.microsoftTunnelServerLogCollectionResponses;
    }
    /**
     * Gets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @return a microsoftTunnelSite
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelSite> getMicrosoftTunnelSites() {
        return this.microsoftTunnelSites;
    }
    /**
     * Gets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @return a mobileAppTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingEvent> getMobileAppTroubleshootingEvents() {
        return this.mobileAppTroubleshootingEvents;
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this.mobileThreatDefenseConnectors;
    }
    /**
     * Gets the monitoring property value. The monitoring property
     * @return a monitoring
     */
    @javax.annotation.Nullable
    public Monitoring getMonitoring() {
        return this.monitoring;
    }
    /**
     * Gets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @return a ndesConnector
     */
    @javax.annotation.Nullable
    public java.util.List<NdesConnector> getNdesConnectors() {
        return this.ndesConnectors;
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a notificationMessageTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this.notificationMessageTemplates;
    }
    /**
     * Gets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @return a remoteActionAudit
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteActionAudit> getRemoteActionAudits() {
        return this.remoteActionAudits;
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a remoteAssistancePartner
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this.remoteAssistancePartners;
    }
    /**
     * Gets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @return a remoteAssistanceSettings
     */
    @javax.annotation.Nullable
    public RemoteAssistanceSettings getRemoteAssistanceSettings() {
        return this.remoteAssistanceSettings;
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a deviceManagementReports
     */
    @javax.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this.reports;
    }
    /**
     * Gets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @return a deviceManagementResourceAccessProfileBase
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementResourceAccessProfileBase> getResourceAccessProfiles() {
        return this.resourceAccessProfiles;
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a resourceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this.resourceOperations;
    }
    /**
     * Gets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @return a deviceManagementReusablePolicySetting
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementReusablePolicySetting> getReusablePolicySettings() {
        return this.reusablePolicySettings;
    }
    /**
     * Gets the reusableSettings property value. List of all reusable settings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getReusableSettings() {
        return this.reusableSettings;
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a deviceAndAppManagementRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the roleScopeTags property value. The Role Scope Tags.
     * @return a roleScopeTag
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTag> getRoleScopeTags() {
        return this.roleScopeTags;
    }
    /**
     * Gets the serviceNowConnections property value. A list of ServiceNowConnections
     * @return a serviceNowConnection
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceNowConnection> getServiceNowConnections() {
        return this.serviceNowConnections;
    }
    /**
     * Gets the settingDefinitions property value. The device management intent setting definitions
     * @return a deviceManagementSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingDefinition> getSettingDefinitions() {
        return this.settingDefinitions;
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a softwareUpdateStatusSummary
     */
    @javax.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this.softwareUpdateStatusSummary;
    }
    /**
     * Gets the subscriptions property value. Tenant mobile device management subscriptions.
     * @return a deviceManagementSubscriptions
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptions getSubscriptions() {
        return this.subscriptions;
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state.
     * @return a deviceManagementSubscriptionState
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a telecomExpenseManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this.telecomExpenseManagementPartners;
    }
    /**
     * Gets the templateInsights property value. List of setting insights in a template
     * @return a deviceManagementTemplateInsightsDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTemplateInsightsDefinition> getTemplateInsights() {
        return this.templateInsights;
    }
    /**
     * Gets the templates property value. The available templates
     * @return a deviceManagementTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getTemplates() {
        return this.templates;
    }
    /**
     * Gets the templateSettings property value. List of all TemplateSettings
     * @return a deviceManagementConfigurationSettingTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getTemplateSettings() {
        return this.templateSettings;
    }
    /**
     * Gets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @return a tenantAttachRBAC
     */
    @javax.annotation.Nullable
    public TenantAttachRBAC getTenantAttachRBAC() {
        return this.tenantAttachRBAC;
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this.termsAndConditions;
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a deviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this.troubleshootingEvents;
    }
    /**
     * Gets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnlicensedAdminstratorsEnabled() {
        return this.unlicensedAdminstratorsEnabled;
    }
    /**
     * Gets the userExperienceAnalyticsAnomaly property value. The user experience analytics anomaly entity contains anomaly details.
     * @return a userExperienceAnalyticsAnomaly
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomaly> getUserExperienceAnalyticsAnomaly() {
        return this.userExperienceAnalyticsAnomaly;
    }
    /**
     * Gets the userExperienceAnalyticsAnomalyDevice property value. The user experience analytics anomaly entity contains device details.
     * @return a userExperienceAnalyticsAnomalyDevice
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomalyDevice> getUserExperienceAnalyticsAnomalyDevice() {
        return this.userExperienceAnalyticsAnomalyDevice;
    }
    /**
     * Gets the userExperienceAnalyticsAnomalySeverityOverview property value. The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly.
     * @return a userExperienceAnalyticsAnomalySeverityOverview
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverityOverview getUserExperienceAnalyticsAnomalySeverityOverview() {
        return this.userExperienceAnalyticsAnomalySeverityOverview;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @return a userExperienceAnalyticsAppHealthApplicationPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> getUserExperienceAnalyticsAppHealthApplicationPerformance() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @return a userExperienceAnalyticsAppHealthDeviceModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> getUserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return this.userExperienceAnalyticsAppHealthDeviceModelPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @return a userExperienceAnalyticsAppHealthDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> getUserExperienceAnalyticsAppHealthDevicePerformance() {
        return this.userExperienceAnalyticsAppHealthDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @return a userExperienceAnalyticsAppHealthDevicePerformanceDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> getUserExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return this.userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @return a userExperienceAnalyticsAppHealthOSVersionPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> getUserExperienceAnalyticsAppHealthOSVersionPerformance() {
        return this.userExperienceAnalyticsAppHealthOSVersionPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getUserExperienceAnalyticsAppHealthOverview() {
        return this.userExperienceAnalyticsAppHealthOverview;
    }
    /**
     * Gets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @return a userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBaseline> getUserExperienceAnalyticsBaselines() {
        return this.userExperienceAnalyticsBaselines;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @return a userExperienceAnalyticsBatteryHealthAppImpact
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> getUserExperienceAnalyticsBatteryHealthAppImpact() {
        return this.userExperienceAnalyticsBatteryHealthAppImpact;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @return a userExperienceAnalyticsBatteryHealthCapacityDetails
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthCapacityDetails getUserExperienceAnalyticsBatteryHealthCapacityDetails() {
        return this.userExperienceAnalyticsBatteryHealthCapacityDetails;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @return a userExperienceAnalyticsBatteryHealthDeviceAppImpact
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> getUserExperienceAnalyticsBatteryHealthDeviceAppImpact() {
        return this.userExperienceAnalyticsBatteryHealthDeviceAppImpact;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @return a userExperienceAnalyticsBatteryHealthDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> getUserExperienceAnalyticsBatteryHealthDevicePerformance() {
        return this.userExperienceAnalyticsBatteryHealthDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @return a userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        return this.userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @return a userExperienceAnalyticsBatteryHealthModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> getUserExperienceAnalyticsBatteryHealthModelPerformance() {
        return this.userExperienceAnalyticsBatteryHealthModelPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @return a userExperienceAnalyticsBatteryHealthOsPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> getUserExperienceAnalyticsBatteryHealthOsPerformance() {
        return this.userExperienceAnalyticsBatteryHealthOsPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @return a userExperienceAnalyticsBatteryHealthRuntimeDetails
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails getUserExperienceAnalyticsBatteryHealthRuntimeDetails() {
        return this.userExperienceAnalyticsBatteryHealthRuntimeDetails;
    }
    /**
     * Gets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsCategory> getUserExperienceAnalyticsCategories() {
        return this.userExperienceAnalyticsCategories;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsDeviceMetricHistory() {
        return this.userExperienceAnalyticsDeviceMetricHistory;
    }
    /**
     * Gets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @return a userExperienceAnalyticsDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDevicePerformance> getUserExperienceAnalyticsDevicePerformance() {
        return this.userExperienceAnalyticsDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a userExperienceAnalyticsDeviceScope
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceScope getUserExperienceAnalyticsDeviceScope() {
        return this.userExperienceAnalyticsDeviceScope;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @return a userExperienceAnalyticsDeviceScope
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScope> getUserExperienceAnalyticsDeviceScopes() {
        return this.userExperienceAnalyticsDeviceScopes;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @return a userExperienceAnalyticsDeviceScores
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScores> getUserExperienceAnalyticsDeviceScores() {
        return this.userExperienceAnalyticsDeviceScores;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @return a userExperienceAnalyticsDeviceStartupHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupHistory> getUserExperienceAnalyticsDeviceStartupHistory() {
        return this.userExperienceAnalyticsDeviceStartupHistory;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @return a userExperienceAnalyticsDeviceStartupProcess
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcess> getUserExperienceAnalyticsDeviceStartupProcesses() {
        return this.userExperienceAnalyticsDeviceStartupProcesses;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @return a userExperienceAnalyticsDeviceStartupProcessPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> getUserExperienceAnalyticsDeviceStartupProcessPerformance() {
        return this.userExperienceAnalyticsDeviceStartupProcessPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @return a userExperienceAnalyticsDeviceWithoutCloudIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> getUserExperienceAnalyticsDevicesWithoutCloudIdentity() {
        return this.userExperienceAnalyticsDevicesWithoutCloudIdentity;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceTimelineEvent property value. The user experience analytics device events entity contains NRT device timeline event details.
     * @return a userExperienceAnalyticsDeviceTimelineEvent
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceTimelineEvent> getUserExperienceAnalyticsDeviceTimelineEvent() {
        return this.userExperienceAnalyticsDeviceTimelineEvent;
    }
    /**
     * Gets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @return a userExperienceAnalyticsImpactingProcess
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsImpactingProcess> getUserExperienceAnalyticsImpactingProcess() {
        return this.userExperienceAnalyticsImpactingProcess;
    }
    /**
     * Gets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsMetricHistory() {
        return this.userExperienceAnalyticsMetricHistory;
    }
    /**
     * Gets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @return a userExperienceAnalyticsModelScores
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsModelScores> getUserExperienceAnalyticsModelScores() {
        return this.userExperienceAnalyticsModelScores;
    }
    /**
     * Gets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @return a userExperienceAnalyticsNotAutopilotReadyDevice
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> getUserExperienceAnalyticsNotAutopilotReadyDevice() {
        return this.userExperienceAnalyticsNotAutopilotReadyDevice;
    }
    /**
     * Gets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @return a userExperienceAnalyticsOverview
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsOverview getUserExperienceAnalyticsOverview() {
        return this.userExperienceAnalyticsOverview;
    }
    /**
     * Gets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @return a userExperienceAnalyticsRemoteConnection
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsRemoteConnection> getUserExperienceAnalyticsRemoteConnection() {
        return this.userExperienceAnalyticsRemoteConnection;
    }
    /**
     * Gets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @return a userExperienceAnalyticsResourcePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsResourcePerformance> getUserExperienceAnalyticsResourcePerformance() {
        return this.userExperienceAnalyticsResourcePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @return a userExperienceAnalyticsScoreHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsScoreHistory> getUserExperienceAnalyticsScoreHistory() {
        return this.userExperienceAnalyticsScoreHistory;
    }
    /**
     * Gets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @return a userExperienceAnalyticsSettings
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsSettings getUserExperienceAnalyticsSettings() {
        return this.userExperienceAnalyticsSettings;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @return a userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return this.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @return a userExperienceAnalyticsWorkFromAnywhereMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> getUserExperienceAnalyticsWorkFromAnywhereMetrics() {
        return this.userExperienceAnalyticsWorkFromAnywhereMetrics;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @return a userExperienceAnalyticsWorkFromAnywhereModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> getUserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return this.userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    }
    /**
     * Gets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @return a userPFXCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<UserPFXCertificate> getUserPfxCertificates() {
        return this.userPfxCertificates;
    }
    /**
     * Gets the virtualEndpoint property value. The virtualEndpoint property
     * @return a virtualEndpoint
     */
    @javax.annotation.Nullable
    public VirtualEndpoint getVirtualEndpoint() {
        return this.virtualEndpoint;
    }
    /**
     * Gets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @return a windowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeploymentProfile> getWindowsAutopilotDeploymentProfiles() {
        return this.windowsAutopilotDeploymentProfiles;
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this.windowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @return a windowsAutopilotSettings
     */
    @javax.annotation.Nullable
    public WindowsAutopilotSettings getWindowsAutopilotSettings() {
        return this.windowsAutopilotSettings;
    }
    /**
     * Gets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @return a windowsDriverUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDriverUpdateProfile> getWindowsDriverUpdateProfiles() {
        return this.windowsDriverUpdateProfiles;
    }
    /**
     * Gets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @return a windowsFeatureUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsFeatureUpdateProfile> getWindowsFeatureUpdateProfiles() {
        return this.windowsFeatureUpdateProfiles;
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this.windowsInformationProtectionAppLearningSummaries;
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a windowsInformationProtectionNetworkLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this.windowsInformationProtectionNetworkLearningSummaries;
    }
    /**
     * Gets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @return a windowsMalwareInformation
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsMalwareInformation> getWindowsMalwareInformation() {
        return this.windowsMalwareInformation;
    }
    /**
     * Gets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @return a windowsMalwareOverview
     */
    @javax.annotation.Nullable
    public WindowsMalwareOverview getWindowsMalwareOverview() {
        return this.windowsMalwareOverview;
    }
    /**
     * Gets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @return a windowsQualityUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsQualityUpdateProfile> getWindowsQualityUpdateProfiles() {
        return this.windowsQualityUpdateProfiles;
    }
    /**
     * Gets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @return a windowsUpdateCatalogItem
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsUpdateCatalogItem> getWindowsUpdateCatalogItems() {
        return this.windowsUpdateCatalogItems;
    }
    /**
     * Gets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @return a zebraFotaArtifact
     */
    @javax.annotation.Nullable
    public java.util.List<ZebraFotaArtifact> getZebraFotaArtifacts() {
        return this.zebraFotaArtifacts;
    }
    /**
     * Gets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @return a zebraFotaConnector
     */
    @javax.annotation.Nullable
    public ZebraFotaConnector getZebraFotaConnector() {
        return this.zebraFotaConnector;
    }
    /**
     * Gets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @return a zebraFotaDeployment
     */
    @javax.annotation.Nullable
    public java.util.List<ZebraFotaDeployment> getZebraFotaDeployments() {
        return this.zebraFotaDeployments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("accountMoveCompletionDateTime", this.getAccountMoveCompletionDateTime());
        writer.writeObjectValue("adminConsent", this.getAdminConsent());
        writer.writeObjectValue("advancedThreatProtectionOnboardingStateSummary", this.getAdvancedThreatProtectionOnboardingStateSummary());
        writer.writeCollectionOfObjectValues("androidDeviceOwnerEnrollmentProfiles", this.getAndroidDeviceOwnerEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("androidForWorkAppConfigurationSchemas", this.getAndroidForWorkAppConfigurationSchemas());
        writer.writeCollectionOfObjectValues("androidForWorkEnrollmentProfiles", this.getAndroidForWorkEnrollmentProfiles());
        writer.writeObjectValue("androidForWorkSettings", this.getAndroidForWorkSettings());
        writer.writeObjectValue("androidManagedStoreAccountEnterpriseSettings", this.getAndroidManagedStoreAccountEnterpriseSettings());
        writer.writeCollectionOfObjectValues("androidManagedStoreAppConfigurationSchemas", this.getAndroidManagedStoreAppConfigurationSchemas());
        writer.writeObjectValue("applePushNotificationCertificate", this.getApplePushNotificationCertificate());
        writer.writeCollectionOfObjectValues("appleUserInitiatedEnrollmentProfiles", this.getAppleUserInitiatedEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("assignmentFilters", this.getAssignmentFilters());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("autopilotEvents", this.getAutopilotEvents());
        writer.writeCollectionOfObjectValues("cartToClassAssociations", this.getCartToClassAssociations());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("certificateConnectorDetails", this.getCertificateConnectorDetails());
        writer.writeCollectionOfObjectValues("chromeOSOnboardingSettings", this.getChromeOSOnboardingSettings());
        writer.writeCollectionOfObjectValues("cloudPCConnectivityIssues", this.getCloudPCConnectivityIssues());
        writer.writeCollectionOfObjectValues("comanagedDevices", this.getComanagedDevices());
        writer.writeCollectionOfObjectValues("comanagementEligibleDevices", this.getComanagementEligibleDevices());
        writer.writeCollectionOfObjectValues("complianceCategories", this.getComplianceCategories());
        writer.writeCollectionOfObjectValues("complianceManagementPartners", this.getComplianceManagementPartners());
        writer.writeCollectionOfObjectValues("compliancePolicies", this.getCompliancePolicies());
        writer.writeCollectionOfObjectValues("complianceSettings", this.getComplianceSettings());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeCollectionOfObjectValues("configManagerCollections", this.getConfigManagerCollections());
        writer.writeCollectionOfObjectValues("configurationCategories", this.getConfigurationCategories());
        writer.writeCollectionOfObjectValues("configurationPolicies", this.getConfigurationPolicies());
        writer.writeCollectionOfObjectValues("configurationPolicyTemplates", this.getConfigurationPolicyTemplates());
        writer.writeCollectionOfObjectValues("configurationSettings", this.getConfigurationSettings());
        writer.writeCollectionOfObjectValues("connectorStatus", this.getConnectorStatus());
        writer.writeObjectValue("dataProcessorServiceForWindowsFeaturesOnboarding", this.getDataProcessorServiceForWindowsFeaturesOnboarding());
        writer.writeCollectionOfObjectValues("dataSharingConsents", this.getDataSharingConsents());
        writer.writeCollectionOfObjectValues("depOnboardingSettings", this.getDepOnboardingSettings());
        writer.writeCollectionOfObjectValues("derivedCredentials", this.getDerivedCredentials());
        writer.writeCollectionOfObjectValues("detectedApps", this.getDetectedApps());
        writer.writeCollectionOfObjectValues("deviceCategories", this.getDeviceCategories());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicies", this.getDeviceCompliancePolicies());
        writer.writeObjectValue("deviceCompliancePolicyDeviceStateSummary", this.getDeviceCompliancePolicyDeviceStateSummary());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceComplianceScripts", this.getDeviceComplianceScripts());
        writer.writeCollectionOfObjectValues("deviceConfigurationConflictSummary", this.getDeviceConfigurationConflictSummary());
        writer.writeObjectValue("deviceConfigurationDeviceStateSummaries", this.getDeviceConfigurationDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceConfigurationRestrictedAppsViolations", this.getDeviceConfigurationRestrictedAppsViolations());
        writer.writeCollectionOfObjectValues("deviceConfigurations", this.getDeviceConfigurations());
        writer.writeCollectionOfObjectValues("deviceConfigurationsAllManagedDeviceCertificateStates", this.getDeviceConfigurationsAllManagedDeviceCertificateStates());
        writer.writeObjectValue("deviceConfigurationUserStateSummaries", this.getDeviceConfigurationUserStateSummaries());
        writer.writeCollectionOfObjectValues("deviceCustomAttributeShellScripts", this.getDeviceCustomAttributeShellScripts());
        writer.writeCollectionOfObjectValues("deviceEnrollmentConfigurations", this.getDeviceEnrollmentConfigurations());
        writer.writeCollectionOfObjectValues("deviceHealthScripts", this.getDeviceHealthScripts());
        writer.writeCollectionOfObjectValues("deviceManagementPartners", this.getDeviceManagementPartners());
        writer.writeCollectionOfObjectValues("deviceManagementScripts", this.getDeviceManagementScripts());
        writer.writeObjectValue("deviceProtectionOverview", this.getDeviceProtectionOverview());
        writer.writeCollectionOfObjectValues("deviceShellScripts", this.getDeviceShellScripts());
        writer.writeCollectionOfObjectValues("domainJoinConnectors", this.getDomainJoinConnectors());
        writer.writeCollectionOfObjectValues("embeddedSIMActivationCodePools", this.getEmbeddedSIMActivationCodePools());
        writer.writeCollectionOfObjectValues("exchangeConnectors", this.getExchangeConnectors());
        writer.writeCollectionOfObjectValues("exchangeOnPremisesPolicies", this.getExchangeOnPremisesPolicies());
        writer.writeObjectValue("exchangeOnPremisesPolicy", this.getExchangeOnPremisesPolicy());
        writer.writeCollectionOfObjectValues("groupPolicyCategories", this.getGroupPolicyCategories());
        writer.writeCollectionOfObjectValues("groupPolicyConfigurations", this.getGroupPolicyConfigurations());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitionFiles", this.getGroupPolicyDefinitionFiles());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitions", this.getGroupPolicyDefinitions());
        writer.writeCollectionOfObjectValues("groupPolicyMigrationReports", this.getGroupPolicyMigrationReports());
        writer.writeCollectionOfObjectValues("groupPolicyObjectFiles", this.getGroupPolicyObjectFiles());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedDefinitionFiles", this.getGroupPolicyUploadedDefinitionFiles());
        writer.writeCollectionOfObjectValues("importedDeviceIdentities", this.getImportedDeviceIdentities());
        writer.writeCollectionOfObjectValues("importedWindowsAutopilotDeviceIdentities", this.getImportedWindowsAutopilotDeviceIdentities());
        writer.writeCollectionOfObjectValues("intents", this.getIntents());
        writer.writeUUIDValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeObjectValue("intuneBrand", this.getIntuneBrand());
        writer.writeCollectionOfObjectValues("intuneBrandingProfiles", this.getIntuneBrandingProfiles());
        writer.writeCollectionOfObjectValues("iosUpdateStatuses", this.getIosUpdateStatuses());
        writer.writeCollectionOfObjectValues("macOSSoftwareUpdateAccountSummaries", this.getMacOSSoftwareUpdateAccountSummaries());
        writer.writeObjectValue("managedDeviceCleanupSettings", this.getManagedDeviceCleanupSettings());
        writer.writeCollectionOfObjectValues("managedDeviceEncryptionStates", this.getManagedDeviceEncryptionStates());
        writer.writeObjectValue("managedDeviceOverview", this.getManagedDeviceOverview());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeIntegerValue("maximumDepTokens", this.getMaximumDepTokens());
        writer.writeCollectionOfObjectValues("microsoftTunnelConfigurations", this.getMicrosoftTunnelConfigurations());
        writer.writeCollectionOfObjectValues("microsoftTunnelHealthThresholds", this.getMicrosoftTunnelHealthThresholds());
        writer.writeCollectionOfObjectValues("microsoftTunnelServerLogCollectionResponses", this.getMicrosoftTunnelServerLogCollectionResponses());
        writer.writeCollectionOfObjectValues("microsoftTunnelSites", this.getMicrosoftTunnelSites());
        writer.writeCollectionOfObjectValues("mobileAppTroubleshootingEvents", this.getMobileAppTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("mobileThreatDefenseConnectors", this.getMobileThreatDefenseConnectors());
        writer.writeObjectValue("monitoring", this.getMonitoring());
        writer.writeCollectionOfObjectValues("ndesConnectors", this.getNdesConnectors());
        writer.writeCollectionOfObjectValues("notificationMessageTemplates", this.getNotificationMessageTemplates());
        writer.writeCollectionOfObjectValues("remoteActionAudits", this.getRemoteActionAudits());
        writer.writeCollectionOfObjectValues("remoteAssistancePartners", this.getRemoteAssistancePartners());
        writer.writeObjectValue("remoteAssistanceSettings", this.getRemoteAssistanceSettings());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeCollectionOfObjectValues("resourceAccessProfiles", this.getResourceAccessProfiles());
        writer.writeCollectionOfObjectValues("resourceOperations", this.getResourceOperations());
        writer.writeCollectionOfObjectValues("reusablePolicySettings", this.getReusablePolicySettings());
        writer.writeCollectionOfObjectValues("reusableSettings", this.getReusableSettings());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeCollectionOfObjectValues("serviceNowConnections", this.getServiceNowConnections());
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("softwareUpdateStatusSummary", this.getSoftwareUpdateStatusSummary());
        writer.writeEnumValue("subscriptions", this.getSubscriptions());
        writer.writeEnumValue("subscriptionState", this.getSubscriptionState());
        writer.writeCollectionOfObjectValues("telecomExpenseManagementPartners", this.getTelecomExpenseManagementPartners());
        writer.writeCollectionOfObjectValues("templateInsights", this.getTemplateInsights());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
        writer.writeCollectionOfObjectValues("templateSettings", this.getTemplateSettings());
        writer.writeObjectValue("tenantAttachRBAC", this.getTenantAttachRBAC());
        writer.writeCollectionOfObjectValues("termsAndConditions", this.getTermsAndConditions());
        writer.writeCollectionOfObjectValues("troubleshootingEvents", this.getTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAnomaly", this.getUserExperienceAnalyticsAnomaly());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAnomalyDevice", this.getUserExperienceAnalyticsAnomalyDevice());
        writer.writeObjectValue("userExperienceAnalyticsAnomalySeverityOverview", this.getUserExperienceAnalyticsAnomalySeverityOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformance", this.getUserExperienceAnalyticsAppHealthApplicationPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDeviceModelPerformance", this.getUserExperienceAnalyticsAppHealthDeviceModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformance", this.getUserExperienceAnalyticsAppHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformanceDetails", this.getUserExperienceAnalyticsAppHealthDevicePerformanceDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthOSVersionPerformance", this.getUserExperienceAnalyticsAppHealthOSVersionPerformance());
        writer.writeObjectValue("userExperienceAnalyticsAppHealthOverview", this.getUserExperienceAnalyticsAppHealthOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBaselines", this.getUserExperienceAnalyticsBaselines());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthAppImpact", this.getUserExperienceAnalyticsBatteryHealthAppImpact());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthCapacityDetails", this.getUserExperienceAnalyticsBatteryHealthCapacityDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceAppImpact", this.getUserExperienceAnalyticsBatteryHealthDeviceAppImpact());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDevicePerformance", this.getUserExperienceAnalyticsBatteryHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", this.getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthModelPerformance", this.getUserExperienceAnalyticsBatteryHealthModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthOsPerformance", this.getUserExperienceAnalyticsBatteryHealthOsPerformance());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthRuntimeDetails", this.getUserExperienceAnalyticsBatteryHealthRuntimeDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsCategories", this.getUserExperienceAnalyticsCategories());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceMetricHistory", this.getUserExperienceAnalyticsDeviceMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicePerformance", this.getUserExperienceAnalyticsDevicePerformance());
        writer.writeObjectValue("userExperienceAnalyticsDeviceScope", this.getUserExperienceAnalyticsDeviceScope());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScopes", this.getUserExperienceAnalyticsDeviceScopes());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScores", this.getUserExperienceAnalyticsDeviceScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupHistory", this.getUserExperienceAnalyticsDeviceStartupHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcesses", this.getUserExperienceAnalyticsDeviceStartupProcesses());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcessPerformance", this.getUserExperienceAnalyticsDeviceStartupProcessPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicesWithoutCloudIdentity", this.getUserExperienceAnalyticsDevicesWithoutCloudIdentity());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceTimelineEvent", this.getUserExperienceAnalyticsDeviceTimelineEvent());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsImpactingProcess", this.getUserExperienceAnalyticsImpactingProcess());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsMetricHistory", this.getUserExperienceAnalyticsMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsModelScores", this.getUserExperienceAnalyticsModelScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsNotAutopilotReadyDevice", this.getUserExperienceAnalyticsNotAutopilotReadyDevice());
        writer.writeObjectValue("userExperienceAnalyticsOverview", this.getUserExperienceAnalyticsOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsRemoteConnection", this.getUserExperienceAnalyticsRemoteConnection());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsResourcePerformance", this.getUserExperienceAnalyticsResourcePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsScoreHistory", this.getUserExperienceAnalyticsScoreHistory());
        writer.writeObjectValue("userExperienceAnalyticsSettings", this.getUserExperienceAnalyticsSettings());
        writer.writeObjectValue("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", this.getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereMetrics", this.getUserExperienceAnalyticsWorkFromAnywhereMetrics());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereModelPerformance", this.getUserExperienceAnalyticsWorkFromAnywhereModelPerformance());
        writer.writeCollectionOfObjectValues("userPfxCertificates", this.getUserPfxCertificates());
        writer.writeObjectValue("virtualEndpoint", this.getVirtualEndpoint());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeploymentProfiles", this.getWindowsAutopilotDeploymentProfiles());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeviceIdentities", this.getWindowsAutopilotDeviceIdentities());
        writer.writeObjectValue("windowsAutopilotSettings", this.getWindowsAutopilotSettings());
        writer.writeCollectionOfObjectValues("windowsDriverUpdateProfiles", this.getWindowsDriverUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsFeatureUpdateProfiles", this.getWindowsFeatureUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionAppLearningSummaries", this.getWindowsInformationProtectionAppLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionNetworkLearningSummaries", this.getWindowsInformationProtectionNetworkLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsMalwareInformation", this.getWindowsMalwareInformation());
        writer.writeObjectValue("windowsMalwareOverview", this.getWindowsMalwareOverview());
        writer.writeCollectionOfObjectValues("windowsQualityUpdateProfiles", this.getWindowsQualityUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsUpdateCatalogItems", this.getWindowsUpdateCatalogItems());
        writer.writeCollectionOfObjectValues("zebraFotaArtifacts", this.getZebraFotaArtifacts());
        writer.writeObjectValue("zebraFotaConnector", this.getZebraFotaConnector());
        writer.writeCollectionOfObjectValues("zebraFotaDeployments", this.getZebraFotaDeployments());
    }
    /**
     * Sets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @param value Value to set for the accountMoveCompletionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountMoveCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.accountMoveCompletionDateTime = value;
    }
    /**
     * Sets the adminConsent property value. Admin consent information.
     * @param value Value to set for the adminConsent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminConsent(@javax.annotation.Nullable final AdminConsent value) {
        this.adminConsent = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @param value Value to set for the advancedThreatProtectionOnboardingStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionOnboardingStateSummary(@javax.annotation.Nullable final AdvancedThreatProtectionOnboardingStateSummary value) {
        this.advancedThreatProtectionOnboardingStateSummary = value;
    }
    /**
     * Sets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @param value Value to set for the androidDeviceOwnerEnrollmentProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDeviceOwnerEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerEnrollmentProfile> value) {
        this.androidDeviceOwnerEnrollmentProfiles = value;
    }
    /**
     * Sets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @param value Value to set for the androidForWorkAppConfigurationSchemas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidForWorkAppConfigurationSchemas(@javax.annotation.Nullable final java.util.List<AndroidForWorkAppConfigurationSchema> value) {
        this.androidForWorkAppConfigurationSchemas = value;
    }
    /**
     * Sets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @param value Value to set for the androidForWorkEnrollmentProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidForWorkEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AndroidForWorkEnrollmentProfile> value) {
        this.androidForWorkEnrollmentProfiles = value;
    }
    /**
     * Sets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @param value Value to set for the androidForWorkSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidForWorkSettings(@javax.annotation.Nullable final AndroidForWorkSettings value) {
        this.androidForWorkSettings = value;
    }
    /**
     * Sets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @param value Value to set for the androidManagedStoreAccountEnterpriseSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidManagedStoreAccountEnterpriseSettings(@javax.annotation.Nullable final AndroidManagedStoreAccountEnterpriseSettings value) {
        this.androidManagedStoreAccountEnterpriseSettings = value;
    }
    /**
     * Sets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @param value Value to set for the androidManagedStoreAppConfigurationSchemas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidManagedStoreAppConfigurationSchemas(@javax.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchema> value) {
        this.androidManagedStoreAppConfigurationSchemas = value;
    }
    /**
     * Sets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @param value Value to set for the applePushNotificationCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplePushNotificationCertificate(@javax.annotation.Nullable final ApplePushNotificationCertificate value) {
        this.applePushNotificationCertificate = value;
    }
    /**
     * Sets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @param value Value to set for the appleUserInitiatedEnrollmentProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleUserInitiatedEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AppleUserInitiatedEnrollmentProfile> value) {
        this.appleUserInitiatedEnrollmentProfiles = value;
    }
    /**
     * Sets the assignmentFilters property value. The list of assignment filters
     * @param value Value to set for the assignmentFilters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilters(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentFilter> value) {
        this.assignmentFilters = value;
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @param value Value to set for the autopilotEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutopilotEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementAutopilotEvent> value) {
        this.autopilotEvents = value;
    }
    /**
     * Sets the cartToClassAssociations property value. The Cart To Class Associations.
     * @param value Value to set for the cartToClassAssociations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCartToClassAssociations(@javax.annotation.Nullable final java.util.List<CartToClassAssociation> value) {
        this.cartToClassAssociations = value;
    }
    /**
     * Sets the categories property value. The available categories
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingCategory> value) {
        this.categories = value;
    }
    /**
     * Sets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @param value Value to set for the certificateConnectorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateConnectorDetails(@javax.annotation.Nullable final java.util.List<CertificateConnectorDetails> value) {
        this.certificateConnectorDetails = value;
    }
    /**
     * Sets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @param value Value to set for the chromeOSOnboardingSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChromeOSOnboardingSettings(@javax.annotation.Nullable final java.util.List<ChromeOSOnboardingSettings> value) {
        this.chromeOSOnboardingSettings = value;
    }
    /**
     * Sets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @param value Value to set for the cloudPCConnectivityIssues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPCConnectivityIssues(@javax.annotation.Nullable final java.util.List<CloudPCConnectivityIssue> value) {
        this.cloudPCConnectivityIssues = value;
    }
    /**
     * Sets the comanagedDevices property value. The list of co-managed devices report
     * @param value Value to set for the comanagedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComanagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.comanagedDevices = value;
    }
    /**
     * Sets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @param value Value to set for the comanagementEligibleDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComanagementEligibleDevices(@javax.annotation.Nullable final java.util.List<ComanagementEligibleDevice> value) {
        this.comanagementEligibleDevices = value;
    }
    /**
     * Sets the complianceCategories property value. List of all compliance categories
     * @param value Value to set for the complianceCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this.complianceCategories = value;
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceManagementPartners(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this.complianceManagementPartners = value;
    }
    /**
     * Sets the compliancePolicies property value. List of all compliance policies
     * @param value Value to set for the compliancePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementCompliancePolicy> value) {
        this.compliancePolicies = value;
    }
    /**
     * Sets the complianceSettings property value. List of all ComplianceSettings
     * @param value Value to set for the complianceSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.complianceSettings = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessSettings(@javax.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this.conditionalAccessSettings = value;
    }
    /**
     * Sets the configManagerCollections property value. A list of ConfigManagerCollection
     * @param value Value to set for the configManagerCollections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigManagerCollections(@javax.annotation.Nullable final java.util.List<ConfigManagerCollection> value) {
        this.configManagerCollections = value;
    }
    /**
     * Sets the configurationCategories property value. List of all Configuration Categories
     * @param value Value to set for the configurationCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this.configurationCategories = value;
    }
    /**
     * Sets the configurationPolicies property value. List of all Configuration policies
     * @param value Value to set for the configurationPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this.configurationPolicies = value;
    }
    /**
     * Sets the configurationPolicyTemplates property value. List of all templates
     * @param value Value to set for the configurationPolicyTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationPolicyTemplates(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyTemplate> value) {
        this.configurationPolicyTemplates = value;
    }
    /**
     * Sets the configurationSettings property value. List of all ConfigurationSettings
     * @param value Value to set for the configurationSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.configurationSettings = value;
    }
    /**
     * Sets the connectorStatus property value. The list of connector status for the tenant.
     * @param value Value to set for the connectorStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorStatus(@javax.annotation.Nullable final java.util.List<ConnectorStatusDetails> value) {
        this.connectorStatus = value;
    }
    /**
     * Sets the dataProcessorServiceForWindowsFeaturesOnboarding property value. A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data.
     * @param value Value to set for the dataProcessorServiceForWindowsFeaturesOnboarding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataProcessorServiceForWindowsFeaturesOnboarding(@javax.annotation.Nullable final DataProcessorServiceForWindowsFeaturesOnboarding value) {
        this.dataProcessorServiceForWindowsFeaturesOnboarding = value;
    }
    /**
     * Sets the dataSharingConsents property value. Data sharing consents.
     * @param value Value to set for the dataSharingConsents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSharingConsents(@javax.annotation.Nullable final java.util.List<DataSharingConsent> value) {
        this.dataSharingConsents = value;
    }
    /**
     * Sets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @param value Value to set for the depOnboardingSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepOnboardingSettings(@javax.annotation.Nullable final java.util.List<DepOnboardingSetting> value) {
        this.depOnboardingSettings = value;
    }
    /**
     * Sets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @param value Value to set for the derivedCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDerivedCredentials(@javax.annotation.Nullable final java.util.List<DeviceManagementDerivedCredentialSettings> value) {
        this.derivedCredentials = value;
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.detectedApps = value;
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategories(@javax.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this.deviceCategories = value;
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this.deviceCompliancePolicies = value;
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicyDeviceStateSummary(@javax.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this.deviceCompliancePolicyDeviceStateSummary = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicySettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @param value Value to set for the deviceComplianceReportSummarizationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceReportSummarizationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.deviceComplianceReportSummarizationDateTime = value;
    }
    /**
     * Sets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @param value Value to set for the deviceComplianceScripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScripts(@javax.annotation.Nullable final java.util.List<DeviceComplianceScript> value) {
        this.deviceComplianceScripts = value;
    }
    /**
     * Sets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @param value Value to set for the deviceConfigurationConflictSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationConflictSummary(@javax.annotation.Nullable final java.util.List<DeviceConfigurationConflictSummary> value) {
        this.deviceConfigurationConflictSummary = value;
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationDeviceStateSummaries(@javax.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this.deviceConfigurationDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @param value Value to set for the deviceConfigurationRestrictedAppsViolations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationRestrictedAppsViolations(@javax.annotation.Nullable final java.util.List<RestrictedAppsViolation> value) {
        this.deviceConfigurationRestrictedAppsViolations = value;
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurations(@javax.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this.deviceConfigurations = value;
    }
    /**
     * Sets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @param value Value to set for the deviceConfigurationsAllManagedDeviceCertificateStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationsAllManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedAllDeviceCertificateState> value) {
        this.deviceConfigurationsAllManagedDeviceCertificateStates = value;
    }
    /**
     * Sets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @param value Value to set for the deviceConfigurationUserStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationUserStateSummaries(@javax.annotation.Nullable final DeviceConfigurationUserStateSummary value) {
        this.deviceConfigurationUserStateSummaries = value;
    }
    /**
     * Sets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @param value Value to set for the deviceCustomAttributeShellScripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCustomAttributeShellScripts(@javax.annotation.Nullable final java.util.List<DeviceCustomAttributeShellScript> value) {
        this.deviceCustomAttributeShellScripts = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentConfigurations(@javax.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this.deviceEnrollmentConfigurations = value;
    }
    /**
     * Sets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @param value Value to set for the deviceHealthScripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceHealthScripts(@javax.annotation.Nullable final java.util.List<DeviceHealthScript> value) {
        this.deviceHealthScripts = value;
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementPartners(@javax.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this.deviceManagementPartners = value;
    }
    /**
     * Sets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @param value Value to set for the deviceManagementScripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementScripts(@javax.annotation.Nullable final java.util.List<DeviceManagementScript> value) {
        this.deviceManagementScripts = value;
    }
    /**
     * Sets the deviceProtectionOverview property value. Device protection overview.
     * @param value Value to set for the deviceProtectionOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceProtectionOverview(@javax.annotation.Nullable final DeviceProtectionOverview value) {
        this.deviceProtectionOverview = value;
    }
    /**
     * Sets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @param value Value to set for the deviceShellScripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceShellScripts(@javax.annotation.Nullable final java.util.List<DeviceShellScript> value) {
        this.deviceShellScripts = value;
    }
    /**
     * Sets the domainJoinConnectors property value. A list of connector objects.
     * @param value Value to set for the domainJoinConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainJoinConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementDomainJoinConnector> value) {
        this.domainJoinConnectors = value;
    }
    /**
     * Sets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @param value Value to set for the embeddedSIMActivationCodePools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmbeddedSIMActivationCodePools(@javax.annotation.Nullable final java.util.List<EmbeddedSIMActivationCodePool> value) {
        this.embeddedSIMActivationCodePools = value;
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this.exchangeConnectors = value;
    }
    /**
     * Sets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @param value Value to set for the exchangeOnPremisesPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeOnPremisesPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeOnPremisesPolicy> value) {
        this.exchangeOnPremisesPolicies = value;
    }
    /**
     * Sets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @param value Value to set for the exchangeOnPremisesPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeOnPremisesPolicy(@javax.annotation.Nullable final DeviceManagementExchangeOnPremisesPolicy value) {
        this.exchangeOnPremisesPolicy = value;
    }
    /**
     * Sets the groupPolicyCategories property value. The available group policy categories for this account.
     * @param value Value to set for the groupPolicyCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyCategories(@javax.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this.groupPolicyCategories = value;
    }
    /**
     * Sets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @param value Value to set for the groupPolicyConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyConfigurations(@javax.annotation.Nullable final java.util.List<GroupPolicyConfiguration> value) {
        this.groupPolicyConfigurations = value;
    }
    /**
     * Sets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @param value Value to set for the groupPolicyDefinitionFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyDefinitionFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionFile> value) {
        this.groupPolicyDefinitionFiles = value;
    }
    /**
     * Sets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @param value Value to set for the groupPolicyDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyDefinitions(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this.groupPolicyDefinitions = value;
    }
    /**
     * Sets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @param value Value to set for the groupPolicyMigrationReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyMigrationReports(@javax.annotation.Nullable final java.util.List<GroupPolicyMigrationReport> value) {
        this.groupPolicyMigrationReports = value;
    }
    /**
     * Sets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @param value Value to set for the groupPolicyObjectFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyObjectFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyObjectFile> value) {
        this.groupPolicyObjectFiles = value;
    }
    /**
     * Sets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @param value Value to set for the groupPolicyUploadedDefinitionFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyUploadedDefinitionFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedDefinitionFile> value) {
        this.groupPolicyUploadedDefinitionFiles = value;
    }
    /**
     * Sets the importedDeviceIdentities property value. The imported device identities.
     * @param value Value to set for the importedDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedDeviceIdentity> value) {
        this.importedDeviceIdentities = value;
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this.importedWindowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the intents property value. The device management intents
     * @param value Value to set for the intents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntents(@javax.annotation.Nullable final java.util.List<DeviceManagementIntent> value) {
        this.intents = value;
    }
    /**
     * Sets the intuneAccountId property value. Intune Account ID for given tenant
     * @param value Value to set for the intuneAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneAccountId(@javax.annotation.Nullable final UUID value) {
        this.intuneAccountId = value;
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneBrand(@javax.annotation.Nullable final IntuneBrand value) {
        this.intuneBrand = value;
    }
    /**
     * Sets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @param value Value to set for the intuneBrandingProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneBrandingProfiles(@javax.annotation.Nullable final java.util.List<IntuneBrandingProfile> value) {
        this.intuneBrandingProfiles = value;
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosUpdateStatuses(@javax.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this.iosUpdateStatuses = value;
    }
    /**
     * Sets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @param value Value to set for the lastReportAggregationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportAggregationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReportAggregationDateTime = value;
    }
    /**
     * Sets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @param value Value to set for the legacyPcManangementEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLegacyPcManangementEnabled(@javax.annotation.Nullable final Boolean value) {
        this.legacyPcManangementEnabled = value;
    }
    /**
     * Sets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @param value Value to set for the macOSSoftwareUpdateAccountSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSSoftwareUpdateAccountSummaries(@javax.annotation.Nullable final java.util.List<MacOSSoftwareUpdateAccountSummary> value) {
        this.macOSSoftwareUpdateAccountSummaries = value;
    }
    /**
     * Sets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @param value Value to set for the managedDeviceCleanupSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceCleanupSettings(@javax.annotation.Nullable final ManagedDeviceCleanupSettings value) {
        this.managedDeviceCleanupSettings = value;
    }
    /**
     * Sets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @param value Value to set for the managedDeviceEncryptionStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceEncryptionStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceEncryptionState> value) {
        this.managedDeviceEncryptionStates = value;
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceOverview(@javax.annotation.Nullable final ManagedDeviceOverview value) {
        this.managedDeviceOverview = value;
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.managedDevices = value;
    }
    /**
     * Sets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @param value Value to set for the maximumDepTokens property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumDepTokens(@javax.annotation.Nullable final Integer value) {
        this.maximumDepTokens = value;
    }
    /**
     * Sets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @param value Value to set for the microsoftTunnelConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelConfigurations(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelConfiguration> value) {
        this.microsoftTunnelConfigurations = value;
    }
    /**
     * Sets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @param value Value to set for the microsoftTunnelHealthThresholds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelHealthThresholds(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelHealthThreshold> value) {
        this.microsoftTunnelHealthThresholds = value;
    }
    /**
     * Sets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @param value Value to set for the microsoftTunnelServerLogCollectionResponses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelServerLogCollectionResponses(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelServerLogCollectionResponse> value) {
        this.microsoftTunnelServerLogCollectionResponses = value;
    }
    /**
     * Sets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @param value Value to set for the microsoftTunnelSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelSites(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelSite> value) {
        this.microsoftTunnelSites = value;
    }
    /**
     * Sets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @param value Value to set for the mobileAppTroubleshootingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<MobileAppTroubleshootingEvent> value) {
        this.mobileAppTroubleshootingEvents = value;
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileThreatDefenseConnectors(@javax.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this.mobileThreatDefenseConnectors = value;
    }
    /**
     * Sets the monitoring property value. The monitoring property
     * @param value Value to set for the monitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMonitoring(@javax.annotation.Nullable final Monitoring value) {
        this.monitoring = value;
    }
    /**
     * Sets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @param value Value to set for the ndesConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNdesConnectors(@javax.annotation.Nullable final java.util.List<NdesConnector> value) {
        this.ndesConnectors = value;
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationMessageTemplates(@javax.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this.notificationMessageTemplates = value;
    }
    /**
     * Sets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @param value Value to set for the remoteActionAudits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteActionAudits(@javax.annotation.Nullable final java.util.List<RemoteActionAudit> value) {
        this.remoteActionAudits = value;
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistancePartners(@javax.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this.remoteAssistancePartners = value;
    }
    /**
     * Sets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @param value Value to set for the remoteAssistanceSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistanceSettings(@javax.annotation.Nullable final RemoteAssistanceSettings value) {
        this.remoteAssistanceSettings = value;
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReports(@javax.annotation.Nullable final DeviceManagementReports value) {
        this.reports = value;
    }
    /**
     * Sets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @param value Value to set for the resourceAccessProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceAccessProfiles(@javax.annotation.Nullable final java.util.List<DeviceManagementResourceAccessProfileBase> value) {
        this.resourceAccessProfiles = value;
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceOperations(@javax.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this.resourceOperations = value;
    }
    /**
     * Sets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @param value Value to set for the reusablePolicySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReusablePolicySettings(@javax.annotation.Nullable final java.util.List<DeviceManagementReusablePolicySetting> value) {
        this.reusablePolicySettings = value;
    }
    /**
     * Sets the reusableSettings property value. List of all reusable settings
     * @param value Value to set for the reusableSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReusableSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.reusableSettings = value;
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the roleScopeTags property value. The Role Scope Tags.
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTags(@javax.annotation.Nullable final java.util.List<RoleScopeTag> value) {
        this.roleScopeTags = value;
    }
    /**
     * Sets the serviceNowConnections property value. A list of ServiceNowConnections
     * @param value Value to set for the serviceNowConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceNowConnections(@javax.annotation.Nullable final java.util.List<ServiceNowConnection> value) {
        this.serviceNowConnections = value;
    }
    /**
     * Sets the settingDefinitions property value. The device management intent setting definitions
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingDefinition> value) {
        this.settingDefinitions = value;
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final DeviceManagementSettings value) {
        this.settings = value;
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateStatusSummary(@javax.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this.softwareUpdateStatusSummary = value;
    }
    /**
     * Sets the subscriptions property value. Tenant mobile device management subscriptions.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptions(@javax.annotation.Nullable final DeviceManagementSubscriptions value) {
        this.subscriptions = value;
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state.
     * @param value Value to set for the subscriptionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionState(@javax.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this.subscriptionState = value;
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTelecomExpenseManagementPartners(@javax.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this.telecomExpenseManagementPartners = value;
    }
    /**
     * Sets the templateInsights property value. List of setting insights in a template
     * @param value Value to set for the templateInsights property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateInsights(@javax.annotation.Nullable final java.util.List<DeviceManagementTemplateInsightsDefinition> value) {
        this.templateInsights = value;
    }
    /**
     * Sets the templates property value. The available templates
     * @param value Value to set for the templates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplates(@javax.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this.templates = value;
    }
    /**
     * Sets the templateSettings property value. List of all TemplateSettings
     * @param value Value to set for the templateSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this.templateSettings = value;
    }
    /**
     * Sets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @param value Value to set for the tenantAttachRBAC property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantAttachRBAC(@javax.annotation.Nullable final TenantAttachRBAC value) {
        this.tenantAttachRBAC = value;
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAndConditions(@javax.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this.termsAndConditions = value;
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this.troubleshootingEvents = value;
    }
    /**
     * Sets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @param value Value to set for the unlicensedAdminstratorsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnlicensedAdminstratorsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.unlicensedAdminstratorsEnabled = value;
    }
    /**
     * Sets the userExperienceAnalyticsAnomaly property value. The user experience analytics anomaly entity contains anomaly details.
     * @param value Value to set for the userExperienceAnalyticsAnomaly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAnomaly(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomaly> value) {
        this.userExperienceAnalyticsAnomaly = value;
    }
    /**
     * Sets the userExperienceAnalyticsAnomalyDevice property value. The user experience analytics anomaly entity contains device details.
     * @param value Value to set for the userExperienceAnalyticsAnomalyDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAnomalyDevice(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomalyDevice> value) {
        this.userExperienceAnalyticsAnomalyDevice = value;
    }
    /**
     * Sets the userExperienceAnalyticsAnomalySeverityOverview property value. The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly.
     * @param value Value to set for the userExperienceAnalyticsAnomalySeverityOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAnomalySeverityOverview(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalySeverityOverview value) {
        this.userExperienceAnalyticsAnomalySeverityOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthApplicationPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDeviceModelPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthDeviceModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> value) {
        this.userExperienceAnalyticsAppHealthDeviceModelPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> value) {
        this.userExperienceAnalyticsAppHealthDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformanceDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> value) {
        this.userExperienceAnalyticsAppHealthDevicePerformanceDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthOSVersionPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthOSVersionPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> value) {
        this.userExperienceAnalyticsAppHealthOSVersionPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @param value Value to set for the userExperienceAnalyticsAppHealthOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsAppHealthOverview(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.userExperienceAnalyticsAppHealthOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @param value Value to set for the userExperienceAnalyticsBaselines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBaselines(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBaseline> value) {
        this.userExperienceAnalyticsBaselines = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthAppImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthAppImpact(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> value) {
        this.userExperienceAnalyticsBatteryHealthAppImpact = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthCapacityDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthCapacityDetails(@javax.annotation.Nullable final UserExperienceAnalyticsBatteryHealthCapacityDetails value) {
        this.userExperienceAnalyticsBatteryHealthCapacityDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceAppImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> value) {
        this.userExperienceAnalyticsBatteryHealthDeviceAppImpact = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDevicePerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> value) {
        this.userExperienceAnalyticsBatteryHealthDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> value) {
        this.userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthModelPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> value) {
        this.userExperienceAnalyticsBatteryHealthModelPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthOsPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthOsPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> value) {
        this.userExperienceAnalyticsBatteryHealthOsPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthRuntimeDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsBatteryHealthRuntimeDetails(@javax.annotation.Nullable final UserExperienceAnalyticsBatteryHealthRuntimeDetails value) {
        this.userExperienceAnalyticsBatteryHealthRuntimeDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @param value Value to set for the userExperienceAnalyticsCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsCategories(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsCategory> value) {
        this.userExperienceAnalyticsCategories = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @param value Value to set for the userExperienceAnalyticsDeviceMetricHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceMetricHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this.userExperienceAnalyticsDeviceMetricHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @param value Value to set for the userExperienceAnalyticsDevicePerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDevicePerformance> value) {
        this.userExperienceAnalyticsDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the userExperienceAnalyticsDeviceScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceScope(@javax.annotation.Nullable final UserExperienceAnalyticsDeviceScope value) {
        this.userExperienceAnalyticsDeviceScope = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @param value Value to set for the userExperienceAnalyticsDeviceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceScopes(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScope> value) {
        this.userExperienceAnalyticsDeviceScopes = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @param value Value to set for the userExperienceAnalyticsDeviceScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceScores(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScores> value) {
        this.userExperienceAnalyticsDeviceScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceStartupHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupHistory> value) {
        this.userExperienceAnalyticsDeviceStartupHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcesses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceStartupProcesses(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcess> value) {
        this.userExperienceAnalyticsDeviceStartupProcesses = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcessPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceStartupProcessPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> value) {
        this.userExperienceAnalyticsDeviceStartupProcessPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @param value Value to set for the userExperienceAnalyticsDevicesWithoutCloudIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDevicesWithoutCloudIdentity(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> value) {
        this.userExperienceAnalyticsDevicesWithoutCloudIdentity = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceTimelineEvent property value. The user experience analytics device events entity contains NRT device timeline event details.
     * @param value Value to set for the userExperienceAnalyticsDeviceTimelineEvent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsDeviceTimelineEvent(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceTimelineEvent> value) {
        this.userExperienceAnalyticsDeviceTimelineEvent = value;
    }
    /**
     * Sets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @param value Value to set for the userExperienceAnalyticsImpactingProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsImpactingProcess(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsImpactingProcess> value) {
        this.userExperienceAnalyticsImpactingProcess = value;
    }
    /**
     * Sets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @param value Value to set for the userExperienceAnalyticsMetricHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsMetricHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this.userExperienceAnalyticsMetricHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @param value Value to set for the userExperienceAnalyticsModelScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsModelScores(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsModelScores> value) {
        this.userExperienceAnalyticsModelScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @param value Value to set for the userExperienceAnalyticsNotAutopilotReadyDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsNotAutopilotReadyDevice(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> value) {
        this.userExperienceAnalyticsNotAutopilotReadyDevice = value;
    }
    /**
     * Sets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @param value Value to set for the userExperienceAnalyticsOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsOverview(@javax.annotation.Nullable final UserExperienceAnalyticsOverview value) {
        this.userExperienceAnalyticsOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @param value Value to set for the userExperienceAnalyticsRemoteConnection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsRemoteConnection(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsRemoteConnection> value) {
        this.userExperienceAnalyticsRemoteConnection = value;
    }
    /**
     * Sets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @param value Value to set for the userExperienceAnalyticsResourcePerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsResourcePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsResourcePerformance> value) {
        this.userExperienceAnalyticsResourcePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @param value Value to set for the userExperienceAnalyticsScoreHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsScoreHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsScoreHistory> value) {
        this.userExperienceAnalyticsScoreHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @param value Value to set for the userExperienceAnalyticsSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsSettings(@javax.annotation.Nullable final UserExperienceAnalyticsSettings value) {
        this.userExperienceAnalyticsSettings = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(@javax.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric value) {
        this.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsWorkFromAnywhereMetrics(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> value) {
        this.userExperienceAnalyticsWorkFromAnywhereMetrics = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereModelPerformance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> value) {
        this.userExperienceAnalyticsWorkFromAnywhereModelPerformance = value;
    }
    /**
     * Sets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @param value Value to set for the userPfxCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPfxCertificates(@javax.annotation.Nullable final java.util.List<UserPFXCertificate> value) {
        this.userPfxCertificates = value;
    }
    /**
     * Sets the virtualEndpoint property value. The virtualEndpoint property
     * @param value Value to set for the virtualEndpoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVirtualEndpoint(@javax.annotation.Nullable final VirtualEndpoint value) {
        this.virtualEndpoint = value;
    }
    /**
     * Sets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @param value Value to set for the windowsAutopilotDeploymentProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotDeploymentProfiles(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeploymentProfile> value) {
        this.windowsAutopilotDeploymentProfiles = value;
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this.windowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @param value Value to set for the windowsAutopilotSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotSettings(@javax.annotation.Nullable final WindowsAutopilotSettings value) {
        this.windowsAutopilotSettings = value;
    }
    /**
     * Sets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @param value Value to set for the windowsDriverUpdateProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsDriverUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsDriverUpdateProfile> value) {
        this.windowsDriverUpdateProfiles = value;
    }
    /**
     * Sets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @param value Value to set for the windowsFeatureUpdateProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsFeatureUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsFeatureUpdateProfile> value) {
        this.windowsFeatureUpdateProfiles = value;
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionAppLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this.windowsInformationProtectionAppLearningSummaries = value;
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionNetworkLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this.windowsInformationProtectionNetworkLearningSummaries = value;
    }
    /**
     * Sets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @param value Value to set for the windowsMalwareInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsMalwareInformation(@javax.annotation.Nullable final java.util.List<WindowsMalwareInformation> value) {
        this.windowsMalwareInformation = value;
    }
    /**
     * Sets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @param value Value to set for the windowsMalwareOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsMalwareOverview(@javax.annotation.Nullable final WindowsMalwareOverview value) {
        this.windowsMalwareOverview = value;
    }
    /**
     * Sets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @param value Value to set for the windowsQualityUpdateProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsQualityUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsQualityUpdateProfile> value) {
        this.windowsQualityUpdateProfiles = value;
    }
    /**
     * Sets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @param value Value to set for the windowsUpdateCatalogItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsUpdateCatalogItems(@javax.annotation.Nullable final java.util.List<WindowsUpdateCatalogItem> value) {
        this.windowsUpdateCatalogItems = value;
    }
    /**
     * Sets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @param value Value to set for the zebraFotaArtifacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZebraFotaArtifacts(@javax.annotation.Nullable final java.util.List<ZebraFotaArtifact> value) {
        this.zebraFotaArtifacts = value;
    }
    /**
     * Sets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @param value Value to set for the zebraFotaConnector property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZebraFotaConnector(@javax.annotation.Nullable final ZebraFotaConnector value) {
        this.zebraFotaConnector = value;
    }
    /**
     * Sets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @param value Value to set for the zebraFotaDeployments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZebraFotaDeployments(@javax.annotation.Nullable final java.util.List<ZebraFotaDeployment> value) {
        this.zebraFotaDeployments = value;
    }
}
