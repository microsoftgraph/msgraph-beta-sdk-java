// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceManagementSettings;
import com.microsoft.graph.models.IntuneBrand;
import com.microsoft.graph.models.AdminConsent;
import com.microsoft.graph.models.DeviceProtectionOverview;
import com.microsoft.graph.models.ManagedDeviceCleanupSettings;
import com.microsoft.graph.models.DeviceManagementSubscriptions;
import com.microsoft.graph.models.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.UserExperienceAnalyticsSettings;
import com.microsoft.graph.models.WindowsMalwareOverview;
import com.microsoft.graph.models.AndroidDeviceOwnerEnrollmentProfile;
import com.microsoft.graph.models.VirtualEndpoint;
import com.microsoft.graph.models.AndroidForWorkAppConfigurationSchema;
import com.microsoft.graph.models.AndroidForWorkEnrollmentProfile;
import com.microsoft.graph.models.AndroidForWorkSettings;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettings;
import com.microsoft.graph.models.AndroidManagedStoreAppConfigurationSchema;
import com.microsoft.graph.models.AuditEvent;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.ChromeOSOnboardingSettings;
import com.microsoft.graph.models.TermsAndConditions;
import com.microsoft.graph.models.AdvancedThreatProtectionOnboardingStateSummary;
import com.microsoft.graph.models.CartToClassAssociation;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.DeviceConfigurationConflictSummary;
import com.microsoft.graph.models.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.RestrictedAppsViolation;
import com.microsoft.graph.models.DeviceConfiguration;
import com.microsoft.graph.models.ManagedAllDeviceCertificateState;
import com.microsoft.graph.models.DeviceConfigurationUserStateSummary;
import com.microsoft.graph.models.IosUpdateDeviceStatus;
import com.microsoft.graph.models.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.models.ManagedDeviceEncryptionState;
import com.microsoft.graph.models.NdesConnector;
import com.microsoft.graph.models.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.DeviceManagementConfigurationCategory;
import com.microsoft.graph.models.DeviceManagementCompliancePolicy;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyTemplate;
import com.microsoft.graph.models.DeviceManagementReusablePolicySetting;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingTemplate;
import com.microsoft.graph.models.ComplianceManagementPartner;
import com.microsoft.graph.models.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.DeviceCategory;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.DeviceManagementPartner;
import com.microsoft.graph.models.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.DeviceManagementExchangeOnPremisesPolicy;
import com.microsoft.graph.models.MobileThreatDefenseConnector;
import com.microsoft.graph.models.DeviceManagementSettingCategory;
import com.microsoft.graph.models.DeviceManagementIntent;
import com.microsoft.graph.models.DeviceManagementSettingDefinition;
import com.microsoft.graph.models.DeviceManagementTemplate;
import com.microsoft.graph.models.ApplePushNotificationCertificate;
import com.microsoft.graph.models.CloudPCConnectivityIssue;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ComanagementEligibleDevice;
import com.microsoft.graph.models.DataSharingConsent;
import com.microsoft.graph.models.DetectedApp;
import com.microsoft.graph.models.DeviceComplianceScript;
import com.microsoft.graph.models.DeviceCustomAttributeShellScript;
import com.microsoft.graph.models.DeviceHealthScript;
import com.microsoft.graph.models.DeviceManagementScript;
import com.microsoft.graph.models.DeviceShellScript;
import com.microsoft.graph.models.ManagedDeviceOverview;
import com.microsoft.graph.models.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.OemWarrantyInformationOnboarding;
import com.microsoft.graph.models.RemoteActionAudit;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthApplicationPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthDeviceModelPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthDevicePerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthOSVersionPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsCategory;
import com.microsoft.graph.models.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthAppImpact;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthCapacityDetails;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthDeviceAppImpact;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthDevicePerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthModelPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthOsPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthRuntimeDetails;
import com.microsoft.graph.models.UserExperienceAnalyticsMetricHistory;
import com.microsoft.graph.models.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceScores;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceStartupHistory;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceStartupProcess;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceStartupProcessPerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceWithoutCloudIdentity;
import com.microsoft.graph.models.UserExperienceAnalyticsImpactingProcess;
import com.microsoft.graph.models.UserExperienceAnalyticsModelScores;
import com.microsoft.graph.models.UserExperienceAnalyticsNotAutopilotReadyDevice;
import com.microsoft.graph.models.UserExperienceAnalyticsOverview;
import com.microsoft.graph.models.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsRemoteConnection;
import com.microsoft.graph.models.UserExperienceAnalyticsResourcePerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsScoreHistory;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereMetric;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereModelPerformance;
import com.microsoft.graph.models.WindowsMalwareInformation;
import com.microsoft.graph.models.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import com.microsoft.graph.models.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.models.DepOnboardingSetting;
import com.microsoft.graph.models.ImportedDeviceIdentity;
import com.microsoft.graph.models.ImportedWindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.WindowsAutopilotSettings;
import com.microsoft.graph.models.ManagementCondition;
import com.microsoft.graph.models.ManagementConditionStatement;
import com.microsoft.graph.models.GroupPolicyMigrationReport;
import com.microsoft.graph.models.GroupPolicyObjectFile;
import com.microsoft.graph.models.GroupPolicyCategory;
import com.microsoft.graph.models.GroupPolicyConfiguration;
import com.microsoft.graph.models.GroupPolicyDefinitionFile;
import com.microsoft.graph.models.GroupPolicyDefinition;
import com.microsoft.graph.models.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.MicrosoftTunnelConfiguration;
import com.microsoft.graph.models.MicrosoftTunnelHealthThreshold;
import com.microsoft.graph.models.MicrosoftTunnelServerLogCollectionResponse;
import com.microsoft.graph.models.MicrosoftTunnelSite;
import com.microsoft.graph.models.NotificationMessageTemplate;
import com.microsoft.graph.models.DeviceManagementDomainJoinConnector;
import com.microsoft.graph.models.ConfigManagerCollection;
import com.microsoft.graph.models.ResourceOperation;
import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.RoleDefinition;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.models.RemoteAssistancePartner;
import com.microsoft.graph.models.RemoteAssistanceSettings;
import com.microsoft.graph.models.DeviceManagementReports;
import com.microsoft.graph.models.EmbeddedSIMActivationCodePool;
import com.microsoft.graph.models.TelecomExpenseManagementPartner;
import com.microsoft.graph.models.DeviceManagementAutopilotEvent;
import com.microsoft.graph.models.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.WindowsDriverUpdateProfile;
import com.microsoft.graph.models.WindowsFeatureUpdateProfile;
import com.microsoft.graph.models.WindowsQualityUpdateProfile;
import com.microsoft.graph.models.WindowsUpdateCatalogItem;
import com.microsoft.graph.models.IntuneBrandingProfile;
import com.microsoft.graph.models.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.CertificateConnectorDetails;
import com.microsoft.graph.models.UserPFXCertificate;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AndroidDeviceOwnerEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.AndroidForWorkAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.AndroidForWorkEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.AndroidManagedStoreAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.AuditEventCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterCollectionPage;
import com.microsoft.graph.requests.ChromeOSOnboardingSettingsCollectionPage;
import com.microsoft.graph.requests.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.CartToClassAssociationCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationConflictSummaryCollectionPage;
import com.microsoft.graph.requests.RestrictedAppsViolationCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.ManagedAllDeviceCertificateStateCollectionPage;
import com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.MacOSSoftwareUpdateAccountSummaryCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceEncryptionStateCollectionPage;
import com.microsoft.graph.requests.NdesConnectorCollectionPage;
import com.microsoft.graph.requests.DeviceManagementConfigurationCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceManagementCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyCollectionPage;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyTemplateCollectionPage;
import com.microsoft.graph.requests.DeviceManagementReusablePolicySettingCollectionPage;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingTemplateCollectionPage;
import com.microsoft.graph.requests.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyCollectionPage;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.DeviceManagementSettingCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceManagementIntentCollectionPage;
import com.microsoft.graph.requests.DeviceManagementSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTemplateCollectionPage;
import com.microsoft.graph.requests.CloudPCConnectivityIssueCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.ComanagementEligibleDeviceCollectionPage;
import com.microsoft.graph.requests.DataSharingConsentCollectionPage;
import com.microsoft.graph.requests.DetectedAppCollectionPage;
import com.microsoft.graph.requests.DeviceComplianceScriptCollectionPage;
import com.microsoft.graph.requests.DeviceCustomAttributeShellScriptCollectionPage;
import com.microsoft.graph.requests.DeviceHealthScriptCollectionPage;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionPage;
import com.microsoft.graph.requests.DeviceShellScriptCollectionPage;
import com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.OemWarrantyInformationOnboardingCollectionPage;
import com.microsoft.graph.requests.RemoteActionAuditCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBaselineCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthAppImpactCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDeviceAppImpactCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthModelPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthOsPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsImpactingProcessCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsModelScoresCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsNotAutopilotReadyDeviceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsRemoteConnectionCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsResourcePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage;
import com.microsoft.graph.requests.WindowsMalwareInformationCollectionPage;
import com.microsoft.graph.requests.DeviceManagementDerivedCredentialSettingsCollectionPage;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseCollectionPage;
import com.microsoft.graph.requests.AppleUserInitiatedEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.DepOnboardingSettingCollectionPage;
import com.microsoft.graph.requests.ImportedDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileCollectionPage;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.ManagementConditionCollectionPage;
import com.microsoft.graph.requests.ManagementConditionStatementCollectionPage;
import com.microsoft.graph.requests.GroupPolicyMigrationReportCollectionPage;
import com.microsoft.graph.requests.GroupPolicyObjectFileCollectionPage;
import com.microsoft.graph.requests.GroupPolicyCategoryCollectionPage;
import com.microsoft.graph.requests.GroupPolicyConfigurationCollectionPage;
import com.microsoft.graph.requests.GroupPolicyDefinitionFileCollectionPage;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionPage;
import com.microsoft.graph.requests.GroupPolicyUploadedDefinitionFileCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelConfigurationCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelHealthThresholdCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelServerLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelSiteCollectionPage;
import com.microsoft.graph.requests.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.DeviceManagementDomainJoinConnectorCollectionPage;
import com.microsoft.graph.requests.ConfigManagerCollectionCollectionPage;
import com.microsoft.graph.requests.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.RoleScopeTagCollectionPage;
import com.microsoft.graph.requests.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolCollectionPage;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementAutopilotEventCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.WindowsDriverUpdateProfileCollectionPage;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileCollectionPage;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileCollectionPage;
import com.microsoft.graph.requests.WindowsUpdateCatalogItemCollectionPage;
import com.microsoft.graph.requests.IntuneBrandingProfileCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;
import com.microsoft.graph.requests.CertificateConnectorDetailsCollectionPage;
import com.microsoft.graph.requests.UserPFXCertificateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management.
 */
public class DeviceManagement extends Entity implements IJsonBackedObject {


    /**
     * The Device Compliance Report Summarization Date Time.
     * The last requested time of device compliance reporting for this account. This property is read-only.
     */
    @SerializedName(value = "deviceComplianceReportSummarizationDateTime", alternate = {"DeviceComplianceReportSummarizationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deviceComplianceReportSummarizationDateTime;

    /**
     * The Intune Account Id.
     * Intune Account Id for given tenant
     */
    @SerializedName(value = "intuneAccountId", alternate = {"IntuneAccountId"})
    @Expose
	@Nullable
    public java.util.UUID intuneAccountId;

    /**
     * The Last Report Aggregation Date Time.
     * The last modified time of reporting for this account. This property is read-only.
     */
    @SerializedName(value = "lastReportAggregationDateTime", alternate = {"LastReportAggregationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastReportAggregationDateTime;

    /**
     * The Legacy Pc Manangement Enabled.
     * The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     */
    @SerializedName(value = "legacyPcManangementEnabled", alternate = {"LegacyPcManangementEnabled"})
    @Expose
	@Nullable
    public Boolean legacyPcManangementEnabled;

    /**
     * The Maximum Dep Tokens.
     * Maximum number of dep tokens allowed per-tenant.
     */
    @SerializedName(value = "maximumDepTokens", alternate = {"MaximumDepTokens"})
    @Expose
	@Nullable
    public Integer maximumDepTokens;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public DeviceManagementSettings settings;

    /**
     * The Unlicensed Adminstrators Enabled.
     * When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     */
    @SerializedName(value = "unlicensedAdminstratorsEnabled", alternate = {"UnlicensedAdminstratorsEnabled"})
    @Expose
	@Nullable
    public Boolean unlicensedAdminstratorsEnabled;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName(value = "intuneBrand", alternate = {"IntuneBrand"})
    @Expose
	@Nullable
    public IntuneBrand intuneBrand;

    /**
     * The Account Move Completion Date Time.
     * The date &amp; time when tenant data moved between scaleunits.
     */
    @SerializedName(value = "accountMoveCompletionDateTime", alternate = {"AccountMoveCompletionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime accountMoveCompletionDateTime;

    /**
     * The Admin Consent.
     * Admin consent information.
     */
    @SerializedName(value = "adminConsent", alternate = {"AdminConsent"})
    @Expose
	@Nullable
    public AdminConsent adminConsent;

    /**
     * The Device Protection Overview.
     * Device protection overview.
     */
    @SerializedName(value = "deviceProtectionOverview", alternate = {"DeviceProtectionOverview"})
    @Expose
	@Nullable
    public DeviceProtectionOverview deviceProtectionOverview;

    /**
     * The Managed Device Cleanup Settings.
     * Device cleanup rule
     */
    @SerializedName(value = "managedDeviceCleanupSettings", alternate = {"ManagedDeviceCleanupSettings"})
    @Expose
	@Nullable
    public ManagedDeviceCleanupSettings managedDeviceCleanupSettings;

    /**
     * The Subscriptions.
     * Tenant's Subscription.
     */
    @SerializedName(value = "subscriptions", alternate = {"Subscriptions"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementSubscriptions> subscriptions;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName(value = "subscriptionState", alternate = {"SubscriptionState"})
    @Expose
	@Nullable
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The User Experience Analytics Settings.
     * User experience analytics device settings
     */
    @SerializedName(value = "userExperienceAnalyticsSettings", alternate = {"UserExperienceAnalyticsSettings"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;

    /**
     * The Windows Malware Overview.
     * Malware overview for windows devices.
     */
    @SerializedName(value = "windowsMalwareOverview", alternate = {"WindowsMalwareOverview"})
    @Expose
	@Nullable
    public WindowsMalwareOverview windowsMalwareOverview;

    /**
     * The Android Device Owner Enrollment Profiles.
     * Android device owner enrollment profile entities.
     */
    @SerializedName(value = "androidDeviceOwnerEnrollmentProfiles", alternate = {"AndroidDeviceOwnerEnrollmentProfiles"})
    @Expose
	@Nullable
    public AndroidDeviceOwnerEnrollmentProfileCollectionPage androidDeviceOwnerEnrollmentProfiles;

    /**
     * The Virtual Endpoint.
     * 
     */
    @SerializedName(value = "virtualEndpoint", alternate = {"VirtualEndpoint"})
    @Expose
	@Nullable
    public VirtualEndpoint virtualEndpoint;

    /**
     * The Android For Work App Configuration Schemas.
     * Android for Work app configuration schema entities.
     */
    @SerializedName(value = "androidForWorkAppConfigurationSchemas", alternate = {"AndroidForWorkAppConfigurationSchemas"})
    @Expose
	@Nullable
    public AndroidForWorkAppConfigurationSchemaCollectionPage androidForWorkAppConfigurationSchemas;

    /**
     * The Android For Work Enrollment Profiles.
     * Android for Work enrollment profile entities.
     */
    @SerializedName(value = "androidForWorkEnrollmentProfiles", alternate = {"AndroidForWorkEnrollmentProfiles"})
    @Expose
	@Nullable
    public AndroidForWorkEnrollmentProfileCollectionPage androidForWorkEnrollmentProfiles;

    /**
     * The Android For Work Settings.
     * The singleton Android for Work settings entity.
     */
    @SerializedName(value = "androidForWorkSettings", alternate = {"AndroidForWorkSettings"})
    @Expose
	@Nullable
    public AndroidForWorkSettings androidForWorkSettings;

    /**
     * The Android Managed Store Account Enterprise Settings.
     * The singleton Android managed store account enterprise settings entity.
     */
    @SerializedName(value = "androidManagedStoreAccountEnterpriseSettings", alternate = {"AndroidManagedStoreAccountEnterpriseSettings"})
    @Expose
	@Nullable
    public AndroidManagedStoreAccountEnterpriseSettings androidManagedStoreAccountEnterpriseSettings;

    /**
     * The Android Managed Store App Configuration Schemas.
     * Android Enterprise app configuration schema entities.
     */
    @SerializedName(value = "androidManagedStoreAppConfigurationSchemas", alternate = {"AndroidManagedStoreAppConfigurationSchemas"})
    @Expose
	@Nullable
    public AndroidManagedStoreAppConfigurationSchemaCollectionPage androidManagedStoreAppConfigurationSchemas;

    /**
     * The Audit Events.
     * The Audit Events
     */
    @SerializedName(value = "auditEvents", alternate = {"AuditEvents"})
    @Expose
	@Nullable
    public AuditEventCollectionPage auditEvents;

    /**
     * The Assignment Filters.
     * The list of assignment filters
     */
    @SerializedName(value = "assignmentFilters", alternate = {"AssignmentFilters"})
    @Expose
	@Nullable
    public DeviceAndAppManagementAssignmentFilterCollectionPage assignmentFilters;

    /**
     * The Chrome OSOnboarding Settings.
     * Collection of ChromeOSOnboardingSettings settings associated with account.
     */
    @SerializedName(value = "chromeOSOnboardingSettings", alternate = {"ChromeOSOnboardingSettings"})
    @Expose
	@Nullable
    public ChromeOSOnboardingSettingsCollectionPage chromeOSOnboardingSettings;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
	@Nullable
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Advanced Threat Protection Onboarding State Summary.
     * The summary state of ATP onboarding state for this account.
     */
    @SerializedName(value = "advancedThreatProtectionOnboardingStateSummary", alternate = {"AdvancedThreatProtectionOnboardingStateSummary"})
    @Expose
	@Nullable
    public AdvancedThreatProtectionOnboardingStateSummary advancedThreatProtectionOnboardingStateSummary;

    /**
     * The Cart To Class Associations.
     * The Cart To Class Associations.
     */
    @SerializedName(value = "cartToClassAssociations", alternate = {"CartToClassAssociations"})
    @Expose
	@Nullable
    public CartToClassAssociationCollectionPage cartToClassAssociations;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName(value = "deviceCompliancePolicies", alternate = {"DeviceCompliancePolicies"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName(value = "deviceCompliancePolicyDeviceStateSummary", alternate = {"DeviceCompliancePolicyDeviceStateSummary"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
	@Nullable
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Conflict Summary.
     * Summary of policies in conflict state for this account.
     */
    @SerializedName(value = "deviceConfigurationConflictSummary", alternate = {"DeviceConfigurationConflictSummary"})
    @Expose
	@Nullable
    public DeviceConfigurationConflictSummaryCollectionPage deviceConfigurationConflictSummary;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationDeviceStateSummaries", alternate = {"DeviceConfigurationDeviceStateSummaries"})
    @Expose
	@Nullable
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configuration Restricted Apps Violations.
     * Restricted apps violations for this account.
     */
    @SerializedName(value = "deviceConfigurationRestrictedAppsViolations", alternate = {"DeviceConfigurationRestrictedAppsViolations"})
    @Expose
	@Nullable
    public RestrictedAppsViolationCollectionPage deviceConfigurationRestrictedAppsViolations;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName(value = "deviceConfigurations", alternate = {"DeviceConfigurations"})
    @Expose
	@Nullable
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Device Configurations All Managed Device Certificate States.
     * Summary of all certificates for all devices.
     */
    @SerializedName(value = "deviceConfigurationsAllManagedDeviceCertificateStates", alternate = {"DeviceConfigurationsAllManagedDeviceCertificateStates"})
    @Expose
	@Nullable
    public ManagedAllDeviceCertificateStateCollectionPage deviceConfigurationsAllManagedDeviceCertificateStates;

    /**
     * The Device Configuration User State Summaries.
     * The device configuration user state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationUserStateSummaries", alternate = {"DeviceConfigurationUserStateSummaries"})
    @Expose
	@Nullable
    public DeviceConfigurationUserStateSummary deviceConfigurationUserStateSummaries;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName(value = "iosUpdateStatuses", alternate = {"IosUpdateStatuses"})
    @Expose
	@Nullable
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Mac OSSoftware Update Account Summaries.
     * The MacOS software update account summaries for this account.
     */
    @SerializedName(value = "macOSSoftwareUpdateAccountSummaries", alternate = {"MacOSSoftwareUpdateAccountSummaries"})
    @Expose
	@Nullable
    public MacOSSoftwareUpdateAccountSummaryCollectionPage macOSSoftwareUpdateAccountSummaries;

    /**
     * The Managed Device Encryption States.
     * Encryption report for devices in this account
     */
    @SerializedName(value = "managedDeviceEncryptionStates", alternate = {"ManagedDeviceEncryptionStates"})
    @Expose
	@Nullable
    public ManagedDeviceEncryptionStateCollectionPage managedDeviceEncryptionStates;

    /**
     * The Ndes Connectors.
     * The collection of Ndes connectors for this account.
     */
    @SerializedName(value = "ndesConnectors", alternate = {"NdesConnectors"})
    @Expose
	@Nullable
    public NdesConnectorCollectionPage ndesConnectors;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName(value = "softwareUpdateStatusSummary", alternate = {"SoftwareUpdateStatusSummary"})
    @Expose
	@Nullable
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Compliance Categories.
     * List of all compliance categories
     */
    @SerializedName(value = "complianceCategories", alternate = {"ComplianceCategories"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationCategoryCollectionPage complianceCategories;

    /**
     * The Compliance Policies.
     * List of all compliance policies
     */
    @SerializedName(value = "compliancePolicies", alternate = {"CompliancePolicies"})
    @Expose
	@Nullable
    public DeviceManagementCompliancePolicyCollectionPage compliancePolicies;

    /**
     * The Compliance Settings.
     * List of all ComplianceSettings
     */
    @SerializedName(value = "complianceSettings", alternate = {"ComplianceSettings"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingDefinitionCollectionPage complianceSettings;

    /**
     * The Configuration Categories.
     * List of all Configuration Categories
     */
    @SerializedName(value = "configurationCategories", alternate = {"ConfigurationCategories"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationCategoryCollectionPage configurationCategories;

    /**
     * The Configuration Policies.
     * List of all Configuration policies
     */
    @SerializedName(value = "configurationPolicies", alternate = {"ConfigurationPolicies"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationPolicyCollectionPage configurationPolicies;

    /**
     * The Configuration Policy Templates.
     * List of all templates
     */
    @SerializedName(value = "configurationPolicyTemplates", alternate = {"ConfigurationPolicyTemplates"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationPolicyTemplateCollectionPage configurationPolicyTemplates;

    /**
     * The Configuration Settings.
     * List of all ConfigurationSettings
     */
    @SerializedName(value = "configurationSettings", alternate = {"ConfigurationSettings"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingDefinitionCollectionPage configurationSettings;

    /**
     * The Reusable Policy Settings.
     * List of all reusable settings that can be referred in a policy
     */
    @SerializedName(value = "reusablePolicySettings", alternate = {"ReusablePolicySettings"})
    @Expose
	@Nullable
    public DeviceManagementReusablePolicySettingCollectionPage reusablePolicySettings;

    /**
     * The Reusable Settings.
     * List of all reusable settings
     */
    @SerializedName(value = "reusableSettings", alternate = {"ReusableSettings"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingDefinitionCollectionPage reusableSettings;

    /**
     * The Template Settings.
     * List of all TemplateSettings
     */
    @SerializedName(value = "templateSettings", alternate = {"TemplateSettings"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingTemplateCollectionPage templateSettings;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName(value = "complianceManagementPartners", alternate = {"ComplianceManagementPartners"})
    @Expose
	@Nullable
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
	@Nullable
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName(value = "deviceCategories", alternate = {"DeviceCategories"})
    @Expose
	@Nullable
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
	@Nullable
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName(value = "deviceManagementPartners", alternate = {"DeviceManagementPartners"})
    @Expose
	@Nullable
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName(value = "exchangeConnectors", alternate = {"ExchangeConnectors"})
    @Expose
	@Nullable
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Exchange On Premises Policies.
     * The list of Exchange On Premisis policies configured by the tenant.
     */
    @SerializedName(value = "exchangeOnPremisesPolicies", alternate = {"ExchangeOnPremisesPolicies"})
    @Expose
	@Nullable
    public DeviceManagementExchangeOnPremisesPolicyCollectionPage exchangeOnPremisesPolicies;

    /**
     * The Exchange On Premises Policy.
     * The policy which controls mobile device access to Exchange On Premises
     */
    @SerializedName(value = "exchangeOnPremisesPolicy", alternate = {"ExchangeOnPremisesPolicy"})
    @Expose
	@Nullable
    public DeviceManagementExchangeOnPremisesPolicy exchangeOnPremisesPolicy;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName(value = "mobileThreatDefenseConnectors", alternate = {"MobileThreatDefenseConnectors"})
    @Expose
	@Nullable
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Categories.
     * The available categories
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public DeviceManagementSettingCategoryCollectionPage categories;

    /**
     * The Intents.
     * The device management intents
     */
    @SerializedName(value = "intents", alternate = {"Intents"})
    @Expose
	@Nullable
    public DeviceManagementIntentCollectionPage intents;

    /**
     * The Setting Definitions.
     * The device management intent setting definitions
     */
    @SerializedName(value = "settingDefinitions", alternate = {"SettingDefinitions"})
    @Expose
	@Nullable
    public DeviceManagementSettingDefinitionCollectionPage settingDefinitions;

    /**
     * The Templates.
     * The available templates
     */
    @SerializedName(value = "templates", alternate = {"Templates"})
    @Expose
	@Nullable
    public DeviceManagementTemplateCollectionPage templates;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName(value = "applePushNotificationCertificate", alternate = {"ApplePushNotificationCertificate"})
    @Expose
	@Nullable
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Cloud PCConnectivity Issues.
     * The list of CloudPC Connectivity Issue.
     */
    @SerializedName(value = "cloudPCConnectivityIssues", alternate = {"CloudPCConnectivityIssues"})
    @Expose
	@Nullable
    public CloudPCConnectivityIssueCollectionPage cloudPCConnectivityIssues;

    /**
     * The Comanaged Devices.
     * The list of co-managed devices report
     */
    @SerializedName(value = "comanagedDevices", alternate = {"ComanagedDevices"})
    @Expose
	@Nullable
    public ManagedDeviceCollectionPage comanagedDevices;

    /**
     * The Comanagement Eligible Devices.
     * The list of co-management eligible devices report
     */
    @SerializedName(value = "comanagementEligibleDevices", alternate = {"ComanagementEligibleDevices"})
    @Expose
	@Nullable
    public ComanagementEligibleDeviceCollectionPage comanagementEligibleDevices;

    /**
     * The Data Sharing Consents.
     * Data sharing consents.
     */
    @SerializedName(value = "dataSharingConsents", alternate = {"DataSharingConsents"})
    @Expose
	@Nullable
    public DataSharingConsentCollectionPage dataSharingConsents;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName(value = "detectedApps", alternate = {"DetectedApps"})
    @Expose
	@Nullable
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Compliance Scripts.
     * The list of device compliance scripts associated with the tenant.
     */
    @SerializedName(value = "deviceComplianceScripts", alternate = {"DeviceComplianceScripts"})
    @Expose
	@Nullable
    public DeviceComplianceScriptCollectionPage deviceComplianceScripts;

    /**
     * The Device Custom Attribute Shell Scripts.
     * The list of device custom attribute shell scripts associated with the tenant.
     */
    @SerializedName(value = "deviceCustomAttributeShellScripts", alternate = {"DeviceCustomAttributeShellScripts"})
    @Expose
	@Nullable
    public DeviceCustomAttributeShellScriptCollectionPage deviceCustomAttributeShellScripts;

    /**
     * The Device Health Scripts.
     * The list of device health scripts associated with the tenant.
     */
    @SerializedName(value = "deviceHealthScripts", alternate = {"DeviceHealthScripts"})
    @Expose
	@Nullable
    public DeviceHealthScriptCollectionPage deviceHealthScripts;

    /**
     * The Device Management Scripts.
     * The list of device management scripts associated with the tenant.
     */
    @SerializedName(value = "deviceManagementScripts", alternate = {"DeviceManagementScripts"})
    @Expose
	@Nullable
    public DeviceManagementScriptCollectionPage deviceManagementScripts;

    /**
     * The Device Shell Scripts.
     * The list of device shell scripts associated with the tenant.
     */
    @SerializedName(value = "deviceShellScripts", alternate = {"DeviceShellScripts"})
    @Expose
	@Nullable
    public DeviceShellScriptCollectionPage deviceShellScripts;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName(value = "managedDeviceOverview", alternate = {"ManagedDeviceOverview"})
    @Expose
	@Nullable
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
	@Nullable
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Mobile App Troubleshooting Events.
     * The collection property of MobileAppTroubleshootingEvent.
     */
    @SerializedName(value = "mobileAppTroubleshootingEvents", alternate = {"MobileAppTroubleshootingEvents"})
    @Expose
	@Nullable
    public MobileAppTroubleshootingEventCollectionPage mobileAppTroubleshootingEvents;

    /**
     * The Oem Warranty Information Onboarding.
     * List of OEM Warranty Statuses
     */
    @SerializedName(value = "oemWarrantyInformationOnboarding", alternate = {"OemWarrantyInformationOnboarding"})
    @Expose
	@Nullable
    public OemWarrantyInformationOnboardingCollectionPage oemWarrantyInformationOnboarding;

    /**
     * The Remote Action Audits.
     * The list of device remote action audits with the tenant.
     */
    @SerializedName(value = "remoteActionAudits", alternate = {"RemoteActionAudits"})
    @Expose
	@Nullable
    public RemoteActionAuditCollectionPage remoteActionAudits;

    /**
     * The User Experience Analytics App Health Application Performance.
     * User experience analytics appHealth Application Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformance", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage userExperienceAnalyticsAppHealthApplicationPerformance;

    /**
     * The User Experience Analytics App Health Application Performance By App Version.
     * User experience analytics appHealth Application Performance by App Version
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;

    /**
     * The User Experience Analytics App Health Application Performance By App Version Details.
     * User experience analytics appHealth Application Performance by App Version details
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;

    /**
     * The User Experience Analytics App Health Application Performance By App Version Device Id.
     * User experience analytics appHealth Application Performance by App Version Device Id
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;

    /**
     * The User Experience Analytics App Health Application Performance By OSVersion.
     * User experience analytics appHealth Application Performance by OS Version
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;

    /**
     * The User Experience Analytics App Health Device Model Performance.
     * User experience analytics appHealth Model Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDeviceModelPerformance", alternate = {"UserExperienceAnalyticsAppHealthDeviceModelPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage userExperienceAnalyticsAppHealthDeviceModelPerformance;

    /**
     * The User Experience Analytics App Health Device Performance.
     * User experience analytics appHealth Device Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformance", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage userExperienceAnalyticsAppHealthDevicePerformance;

    /**
     * The User Experience Analytics App Health Device Performance Details.
     * User experience analytics device performance details
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformanceDetails", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformanceDetails"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage userExperienceAnalyticsAppHealthDevicePerformanceDetails;

    /**
     * The User Experience Analytics App Health OSVersion Performance.
     * User experience analytics appHealth OS version Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOSVersionPerformance", alternate = {"UserExperienceAnalyticsAppHealthOSVersionPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage userExperienceAnalyticsAppHealthOSVersionPerformance;

    /**
     * The User Experience Analytics App Health Overview.
     * User experience analytics appHealth overview
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOverview", alternate = {"UserExperienceAnalyticsAppHealthOverview"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsCategory userExperienceAnalyticsAppHealthOverview;

    /**
     * The User Experience Analytics Baselines.
     * User experience analytics baselines
     */
    @SerializedName(value = "userExperienceAnalyticsBaselines", alternate = {"UserExperienceAnalyticsBaselines"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBaselineCollectionPage userExperienceAnalyticsBaselines;

    /**
     * The User Experience Analytics Battery Health App Impact.
     * User Experience Analytics Battery Health App Impact
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthAppImpact", alternate = {"UserExperienceAnalyticsBatteryHealthAppImpact"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthAppImpactCollectionPage userExperienceAnalyticsBatteryHealthAppImpact;

    /**
     * The User Experience Analytics Battery Health Capacity Details.
     * User Experience Analytics Battery Health Capacity Details
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthCapacityDetails", alternate = {"UserExperienceAnalyticsBatteryHealthCapacityDetails"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthCapacityDetails userExperienceAnalyticsBatteryHealthCapacityDetails;

    /**
     * The User Experience Analytics Battery Health Device App Impact.
     * User Experience Analytics Battery Health Device App Impact
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthDeviceAppImpact", alternate = {"UserExperienceAnalyticsBatteryHealthDeviceAppImpact"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthDeviceAppImpactCollectionPage userExperienceAnalyticsBatteryHealthDeviceAppImpact;

    /**
     * The User Experience Analytics Battery Health Device Performance.
     * User Experience Analytics Battery Health Device Performance
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthDevicePerformance", alternate = {"UserExperienceAnalyticsBatteryHealthDevicePerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionPage userExperienceAnalyticsBatteryHealthDevicePerformance;

    /**
     * The User Experience Analytics Battery Health Device Runtime History.
     * User Experience Analytics Battery Health Device Runtime History
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", alternate = {"UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryCollectionPage userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;

    /**
     * The User Experience Analytics Battery Health Model Performance.
     * User Experience Analytics Battery Health Model Performance
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthModelPerformance", alternate = {"UserExperienceAnalyticsBatteryHealthModelPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthModelPerformanceCollectionPage userExperienceAnalyticsBatteryHealthModelPerformance;

    /**
     * The User Experience Analytics Battery Health Os Performance.
     * User Experience Analytics Battery Health Os Performance
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthOsPerformance", alternate = {"UserExperienceAnalyticsBatteryHealthOsPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthOsPerformanceCollectionPage userExperienceAnalyticsBatteryHealthOsPerformance;

    /**
     * The User Experience Analytics Battery Health Runtime Details.
     * User Experience Analytics Battery Health Runtime Details
     */
    @SerializedName(value = "userExperienceAnalyticsBatteryHealthRuntimeDetails", alternate = {"UserExperienceAnalyticsBatteryHealthRuntimeDetails"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails userExperienceAnalyticsBatteryHealthRuntimeDetails;

    /**
     * The User Experience Analytics Categories.
     * User experience analytics categories
     */
    @SerializedName(value = "userExperienceAnalyticsCategories", alternate = {"UserExperienceAnalyticsCategories"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsCategoryCollectionPage userExperienceAnalyticsCategories;

    /**
     * The User Experience Analytics Device Metric History.
     * User experience analytics device metric history
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceMetricHistory", alternate = {"UserExperienceAnalyticsDeviceMetricHistory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsMetricHistoryCollectionPage userExperienceAnalyticsDeviceMetricHistory;

    /**
     * The User Experience Analytics Device Performance.
     * User experience analytics device performance
     */
    @SerializedName(value = "userExperienceAnalyticsDevicePerformance", alternate = {"UserExperienceAnalyticsDevicePerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDevicePerformanceCollectionPage userExperienceAnalyticsDevicePerformance;

    /**
     * The User Experience Analytics Device Scores.
     * User experience analytics device scores
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceScores", alternate = {"UserExperienceAnalyticsDeviceScores"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDeviceScoresCollectionPage userExperienceAnalyticsDeviceScores;

    /**
     * The User Experience Analytics Device Startup History.
     * User experience analytics device Startup History
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupHistory", alternate = {"UserExperienceAnalyticsDeviceStartupHistory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage userExperienceAnalyticsDeviceStartupHistory;

    /**
     * The User Experience Analytics Device Startup Processes.
     * User experience analytics device Startup Processes
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupProcesses", alternate = {"UserExperienceAnalyticsDeviceStartupProcesses"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDeviceStartupProcessCollectionPage userExperienceAnalyticsDeviceStartupProcesses;

    /**
     * The User Experience Analytics Device Startup Process Performance.
     * User experience analytics device Startup Process Performance
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupProcessPerformance", alternate = {"UserExperienceAnalyticsDeviceStartupProcessPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage userExperienceAnalyticsDeviceStartupProcessPerformance;

    /**
     * The User Experience Analytics Devices Without Cloud Identity.
     * User experience analytics devices without cloud identity.
     */
    @SerializedName(value = "userExperienceAnalyticsDevicesWithoutCloudIdentity", alternate = {"UserExperienceAnalyticsDevicesWithoutCloudIdentity"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage userExperienceAnalyticsDevicesWithoutCloudIdentity;

    /**
     * The User Experience Analytics Impacting Process.
     * User experience analytics impacting process
     */
    @SerializedName(value = "userExperienceAnalyticsImpactingProcess", alternate = {"UserExperienceAnalyticsImpactingProcess"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsImpactingProcessCollectionPage userExperienceAnalyticsImpactingProcess;

    /**
     * The User Experience Analytics Metric History.
     * User experience analytics metric history
     */
    @SerializedName(value = "userExperienceAnalyticsMetricHistory", alternate = {"UserExperienceAnalyticsMetricHistory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsMetricHistoryCollectionPage userExperienceAnalyticsMetricHistory;

    /**
     * The User Experience Analytics Model Scores.
     * User experience analytics model scores
     */
    @SerializedName(value = "userExperienceAnalyticsModelScores", alternate = {"UserExperienceAnalyticsModelScores"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsModelScoresCollectionPage userExperienceAnalyticsModelScores;

    /**
     * The User Experience Analytics Not Autopilot Ready Device.
     * User experience analytics devices not Windows Autopilot ready.
     */
    @SerializedName(value = "userExperienceAnalyticsNotAutopilotReadyDevice", alternate = {"UserExperienceAnalyticsNotAutopilotReadyDevice"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDeviceCollectionPage userExperienceAnalyticsNotAutopilotReadyDevice;

    /**
     * The User Experience Analytics Overview.
     * User experience analytics overview
     */
    @SerializedName(value = "userExperienceAnalyticsOverview", alternate = {"UserExperienceAnalyticsOverview"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;

    /**
     * The User Experience Analytics Regression Summary.
     * User experience analytics regression summary
     */
    @SerializedName(value = "userExperienceAnalyticsRegressionSummary", alternate = {"UserExperienceAnalyticsRegressionSummary"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsRegressionSummary userExperienceAnalyticsRegressionSummary;

    /**
     * The User Experience Analytics Remote Connection.
     * User experience analytics remote connection
     */
    @SerializedName(value = "userExperienceAnalyticsRemoteConnection", alternate = {"UserExperienceAnalyticsRemoteConnection"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsRemoteConnectionCollectionPage userExperienceAnalyticsRemoteConnection;

    /**
     * The User Experience Analytics Resource Performance.
     * User experience analytics resource performance
     */
    @SerializedName(value = "userExperienceAnalyticsResourcePerformance", alternate = {"UserExperienceAnalyticsResourcePerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsResourcePerformanceCollectionPage userExperienceAnalyticsResourcePerformance;

    /**
     * The User Experience Analytics Score History.
     * User experience analytics device Startup Score History
     */
    @SerializedName(value = "userExperienceAnalyticsScoreHistory", alternate = {"UserExperienceAnalyticsScoreHistory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsScoreHistoryCollectionPage userExperienceAnalyticsScoreHistory;

    /**
     * The User Experience Analytics Work From Anywhere Hardware Readiness Metric.
     * User experience analytics work from anywhere hardware readiness metrics.
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", alternate = {"UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;

    /**
     * The User Experience Analytics Work From Anywhere Metrics.
     * User experience analytics work from anywhere metrics.
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereMetrics", alternate = {"UserExperienceAnalyticsWorkFromAnywhereMetrics"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage userExperienceAnalyticsWorkFromAnywhereMetrics;

    /**
     * The User Experience Analytics Work From Anywhere Model Performance.
     * The user experience analytics work from anywhere model performance
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereModelPerformance", alternate = {"UserExperienceAnalyticsWorkFromAnywhereModelPerformance"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage userExperienceAnalyticsWorkFromAnywhereModelPerformance;

    /**
     * The Windows Malware Information.
     * The list of affected malware in the tenant.
     */
    @SerializedName(value = "windowsMalwareInformation", alternate = {"WindowsMalwareInformation"})
    @Expose
	@Nullable
    public WindowsMalwareInformationCollectionPage windowsMalwareInformation;

    /**
     * The Derived Credentials.
     * Collection of Derived credential settings associated with account.
     */
    @SerializedName(value = "derivedCredentials", alternate = {"DerivedCredentials"})
    @Expose
	@Nullable
    public DeviceManagementDerivedCredentialSettingsCollectionPage derivedCredentials;

    /**
     * The Resource Access Profiles.
     * Collection of resource access settings associated with account.
     */
    @SerializedName(value = "resourceAccessProfiles", alternate = {"ResourceAccessProfiles"})
    @Expose
	@Nullable
    public DeviceManagementResourceAccessProfileBaseCollectionPage resourceAccessProfiles;

    /**
     * The Apple User Initiated Enrollment Profiles.
     * Apple user initiated enrollment profiles
     */
    @SerializedName(value = "appleUserInitiatedEnrollmentProfiles", alternate = {"AppleUserInitiatedEnrollmentProfiles"})
    @Expose
	@Nullable
    public AppleUserInitiatedEnrollmentProfileCollectionPage appleUserInitiatedEnrollmentProfiles;

    /**
     * The Dep Onboarding Settings.
     * This collections of multiple DEP tokens per-tenant.
     */
    @SerializedName(value = "depOnboardingSettings", alternate = {"DepOnboardingSettings"})
    @Expose
	@Nullable
    public DepOnboardingSettingCollectionPage depOnboardingSettings;

    /**
     * The Imported Device Identities.
     * The imported device identities.
     */
    @SerializedName(value = "importedDeviceIdentities", alternate = {"ImportedDeviceIdentities"})
    @Expose
	@Nullable
    public ImportedDeviceIdentityCollectionPage importedDeviceIdentities;

    /**
     * The Imported Windows Autopilot Device Identities.
     * Collection of imported Windows autopilot devices.
     */
    @SerializedName(value = "importedWindowsAutopilotDeviceIdentities", alternate = {"ImportedWindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage importedWindowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Deployment Profiles.
     * Windows auto pilot deployment profiles
     */
    @SerializedName(value = "windowsAutopilotDeploymentProfiles", alternate = {"WindowsAutopilotDeploymentProfiles"})
    @Expose
	@Nullable
    public WindowsAutopilotDeploymentProfileCollectionPage windowsAutopilotDeploymentProfiles;

    /**
     * The Windows Autopilot Device Identities.
     * The Windows autopilot device identities contained collection.
     */
    @SerializedName(value = "windowsAutopilotDeviceIdentities", alternate = {"WindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public WindowsAutopilotDeviceIdentityCollectionPage windowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Settings.
     * The Windows autopilot account settings.
     */
    @SerializedName(value = "windowsAutopilotSettings", alternate = {"WindowsAutopilotSettings"})
    @Expose
	@Nullable
    public WindowsAutopilotSettings windowsAutopilotSettings;

    /**
     * The Management Conditions.
     * The management conditions associated with device management of the company.
     */
    @SerializedName(value = "managementConditions", alternate = {"ManagementConditions"})
    @Expose
	@Nullable
    public ManagementConditionCollectionPage managementConditions;

    /**
     * The Management Condition Statements.
     * The management condition statements associated with device management of the company.
     */
    @SerializedName(value = "managementConditionStatements", alternate = {"ManagementConditionStatements"})
    @Expose
	@Nullable
    public ManagementConditionStatementCollectionPage managementConditionStatements;

    /**
     * The Group Policy Migration Reports.
     * A list of Group Policy migration reports.
     */
    @SerializedName(value = "groupPolicyMigrationReports", alternate = {"GroupPolicyMigrationReports"})
    @Expose
	@Nullable
    public GroupPolicyMigrationReportCollectionPage groupPolicyMigrationReports;

    /**
     * The Group Policy Object Files.
     * A list of Group Policy Object files uploaded.
     */
    @SerializedName(value = "groupPolicyObjectFiles", alternate = {"GroupPolicyObjectFiles"})
    @Expose
	@Nullable
    public GroupPolicyObjectFileCollectionPage groupPolicyObjectFiles;

    /**
     * The Group Policy Categories.
     * The available group policy categories for this account.
     */
    @SerializedName(value = "groupPolicyCategories", alternate = {"GroupPolicyCategories"})
    @Expose
	@Nullable
    public GroupPolicyCategoryCollectionPage groupPolicyCategories;

    /**
     * The Group Policy Configurations.
     * The group policy configurations created by this account.
     */
    @SerializedName(value = "groupPolicyConfigurations", alternate = {"GroupPolicyConfigurations"})
    @Expose
	@Nullable
    public GroupPolicyConfigurationCollectionPage groupPolicyConfigurations;

    /**
     * The Group Policy Definition Files.
     * The available group policy definition files for this account.
     */
    @SerializedName(value = "groupPolicyDefinitionFiles", alternate = {"GroupPolicyDefinitionFiles"})
    @Expose
	@Nullable
    public GroupPolicyDefinitionFileCollectionPage groupPolicyDefinitionFiles;

    /**
     * The Group Policy Definitions.
     * The available group policy definitions for this account.
     */
    @SerializedName(value = "groupPolicyDefinitions", alternate = {"GroupPolicyDefinitions"})
    @Expose
	@Nullable
    public GroupPolicyDefinitionCollectionPage groupPolicyDefinitions;

    /**
     * The Group Policy Uploaded Definition Files.
     * The available group policy uploaded definition files for this account.
     */
    @SerializedName(value = "groupPolicyUploadedDefinitionFiles", alternate = {"GroupPolicyUploadedDefinitionFiles"})
    @Expose
	@Nullable
    public GroupPolicyUploadedDefinitionFileCollectionPage groupPolicyUploadedDefinitionFiles;

    /**
     * The Microsoft Tunnel Configurations.
     * Collection of MicrosoftTunnelConfiguration settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelConfigurations", alternate = {"MicrosoftTunnelConfigurations"})
    @Expose
	@Nullable
    public MicrosoftTunnelConfigurationCollectionPage microsoftTunnelConfigurations;

    /**
     * The Microsoft Tunnel Health Thresholds.
     * Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelHealthThresholds", alternate = {"MicrosoftTunnelHealthThresholds"})
    @Expose
	@Nullable
    public MicrosoftTunnelHealthThresholdCollectionPage microsoftTunnelHealthThresholds;

    /**
     * The Microsoft Tunnel Server Log Collection Responses.
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelServerLogCollectionResponses", alternate = {"MicrosoftTunnelServerLogCollectionResponses"})
    @Expose
	@Nullable
    public MicrosoftTunnelServerLogCollectionResponseCollectionPage microsoftTunnelServerLogCollectionResponses;

    /**
     * The Microsoft Tunnel Sites.
     * Collection of MicrosoftTunnelSite settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelSites", alternate = {"MicrosoftTunnelSites"})
    @Expose
	@Nullable
    public MicrosoftTunnelSiteCollectionPage microsoftTunnelSites;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName(value = "notificationMessageTemplates", alternate = {"NotificationMessageTemplates"})
    @Expose
	@Nullable
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Domain Join Connectors.
     * A list of connector objects.
     */
    @SerializedName(value = "domainJoinConnectors", alternate = {"DomainJoinConnectors"})
    @Expose
	@Nullable
    public DeviceManagementDomainJoinConnectorCollectionPage domainJoinConnectors;

    /**
     * The Config Manager Collections.
     * A list of ConfigManagerCollection
     */
    @SerializedName(value = "configManagerCollections", alternate = {"ConfigManagerCollections"})
    @Expose
	@Nullable
    public ConfigManagerCollectionCollectionPage configManagerCollections;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName(value = "resourceOperations", alternate = {"ResourceOperations"})
    @Expose
	@Nullable
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Scope Tags.
     * The Role Scope Tags.
     */
    @SerializedName(value = "roleScopeTags", alternate = {"RoleScopeTags"})
    @Expose
	@Nullable
    public RoleScopeTagCollectionPage roleScopeTags;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName(value = "remoteAssistancePartners", alternate = {"RemoteAssistancePartners"})
    @Expose
	@Nullable
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Remote Assistance Settings.
     * The remote assistance settings singleton
     */
    @SerializedName(value = "remoteAssistanceSettings", alternate = {"RemoteAssistanceSettings"})
    @Expose
	@Nullable
    public RemoteAssistanceSettings remoteAssistanceSettings;

    /**
     * The Reports.
     * Reports singleton
     */
    @SerializedName(value = "reports", alternate = {"Reports"})
    @Expose
	@Nullable
    public DeviceManagementReports reports;

    /**
     * The Embedded SIMActivation Code Pools.
     * The embedded SIM activation code pools created by this account.
     */
    @SerializedName(value = "embeddedSIMActivationCodePools", alternate = {"EmbeddedSIMActivationCodePools"})
    @Expose
	@Nullable
    public EmbeddedSIMActivationCodePoolCollectionPage embeddedSIMActivationCodePools;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName(value = "telecomExpenseManagementPartners", alternate = {"TelecomExpenseManagementPartners"})
    @Expose
	@Nullable
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Autopilot Events.
     * The list of autopilot events for the tenant.
     */
    @SerializedName(value = "autopilotEvents", alternate = {"AutopilotEvents"})
    @Expose
	@Nullable
    public DeviceManagementAutopilotEventCollectionPage autopilotEvents;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName(value = "troubleshootingEvents", alternate = {"TroubleshootingEvents"})
    @Expose
	@Nullable
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Driver Update Profiles.
     * A collection of windows driver update profiles
     */
    @SerializedName(value = "windowsDriverUpdateProfiles", alternate = {"WindowsDriverUpdateProfiles"})
    @Expose
	@Nullable
    public WindowsDriverUpdateProfileCollectionPage windowsDriverUpdateProfiles;

    /**
     * The Windows Feature Update Profiles.
     * A collection of windows feature update profiles
     */
    @SerializedName(value = "windowsFeatureUpdateProfiles", alternate = {"WindowsFeatureUpdateProfiles"})
    @Expose
	@Nullable
    public WindowsFeatureUpdateProfileCollectionPage windowsFeatureUpdateProfiles;

    /**
     * The Windows Quality Update Profiles.
     * A collection of windows quality update profiles
     */
    @SerializedName(value = "windowsQualityUpdateProfiles", alternate = {"WindowsQualityUpdateProfiles"})
    @Expose
	@Nullable
    public WindowsQualityUpdateProfileCollectionPage windowsQualityUpdateProfiles;

    /**
     * The Windows Update Catalog Items.
     * A collection of windows update catalog items (fetaure updates item , quality updates item)
     */
    @SerializedName(value = "windowsUpdateCatalogItems", alternate = {"WindowsUpdateCatalogItems"})
    @Expose
	@Nullable
    public WindowsUpdateCatalogItemCollectionPage windowsUpdateCatalogItems;

    /**
     * The Intune Branding Profiles.
     * Intune branding profiles targeted to AAD groups
     */
    @SerializedName(value = "intuneBrandingProfiles", alternate = {"IntuneBrandingProfiles"})
    @Expose
	@Nullable
    public IntuneBrandingProfileCollectionPage intuneBrandingProfiles;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionAppLearningSummaries", alternate = {"WindowsInformationProtectionAppLearningSummaries"})
    @Expose
	@Nullable
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionNetworkLearningSummaries", alternate = {"WindowsInformationProtectionNetworkLearningSummaries"})
    @Expose
	@Nullable
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;

    /**
     * The Certificate Connector Details.
     * Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     */
    @SerializedName(value = "certificateConnectorDetails", alternate = {"CertificateConnectorDetails"})
    @Expose
	@Nullable
    public CertificateConnectorDetailsCollectionPage certificateConnectorDetails;

    /**
     * The User Pfx Certificates.
     * Collection of PFX certificates associated with a user.
     */
    @SerializedName(value = "userPfxCertificates", alternate = {"UserPfxCertificates"})
    @Expose
	@Nullable
    public UserPFXCertificateCollectionPage userPfxCertificates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("androidDeviceOwnerEnrollmentProfiles")) {
            androidDeviceOwnerEnrollmentProfiles = serializer.deserializeObject(json.get("androidDeviceOwnerEnrollmentProfiles"), AndroidDeviceOwnerEnrollmentProfileCollectionPage.class);
        }

        if (json.has("androidForWorkAppConfigurationSchemas")) {
            androidForWorkAppConfigurationSchemas = serializer.deserializeObject(json.get("androidForWorkAppConfigurationSchemas"), AndroidForWorkAppConfigurationSchemaCollectionPage.class);
        }

        if (json.has("androidForWorkEnrollmentProfiles")) {
            androidForWorkEnrollmentProfiles = serializer.deserializeObject(json.get("androidForWorkEnrollmentProfiles"), AndroidForWorkEnrollmentProfileCollectionPage.class);
        }

        if (json.has("androidManagedStoreAppConfigurationSchemas")) {
            androidManagedStoreAppConfigurationSchemas = serializer.deserializeObject(json.get("androidManagedStoreAppConfigurationSchemas"), AndroidManagedStoreAppConfigurationSchemaCollectionPage.class);
        }

        if (json.has("auditEvents")) {
            auditEvents = serializer.deserializeObject(json.get("auditEvents"), AuditEventCollectionPage.class);
        }

        if (json.has("assignmentFilters")) {
            assignmentFilters = serializer.deserializeObject(json.get("assignmentFilters"), DeviceAndAppManagementAssignmentFilterCollectionPage.class);
        }

        if (json.has("chromeOSOnboardingSettings")) {
            chromeOSOnboardingSettings = serializer.deserializeObject(json.get("chromeOSOnboardingSettings"), ChromeOSOnboardingSettingsCollectionPage.class);
        }

        if (json.has("termsAndConditions")) {
            termsAndConditions = serializer.deserializeObject(json.get("termsAndConditions"), TermsAndConditionsCollectionPage.class);
        }

        if (json.has("cartToClassAssociations")) {
            cartToClassAssociations = serializer.deserializeObject(json.get("cartToClassAssociations"), CartToClassAssociationCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicies")) {
            deviceCompliancePolicies = serializer.deserializeObject(json.get("deviceCompliancePolicies"), DeviceCompliancePolicyCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries"), DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurationConflictSummary")) {
            deviceConfigurationConflictSummary = serializer.deserializeObject(json.get("deviceConfigurationConflictSummary"), DeviceConfigurationConflictSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurationRestrictedAppsViolations")) {
            deviceConfigurationRestrictedAppsViolations = serializer.deserializeObject(json.get("deviceConfigurationRestrictedAppsViolations"), RestrictedAppsViolationCollectionPage.class);
        }

        if (json.has("deviceConfigurations")) {
            deviceConfigurations = serializer.deserializeObject(json.get("deviceConfigurations"), DeviceConfigurationCollectionPage.class);
        }

        if (json.has("deviceConfigurationsAllManagedDeviceCertificateStates")) {
            deviceConfigurationsAllManagedDeviceCertificateStates = serializer.deserializeObject(json.get("deviceConfigurationsAllManagedDeviceCertificateStates"), ManagedAllDeviceCertificateStateCollectionPage.class);
        }

        if (json.has("iosUpdateStatuses")) {
            iosUpdateStatuses = serializer.deserializeObject(json.get("iosUpdateStatuses"), IosUpdateDeviceStatusCollectionPage.class);
        }

        if (json.has("macOSSoftwareUpdateAccountSummaries")) {
            macOSSoftwareUpdateAccountSummaries = serializer.deserializeObject(json.get("macOSSoftwareUpdateAccountSummaries"), MacOSSoftwareUpdateAccountSummaryCollectionPage.class);
        }

        if (json.has("managedDeviceEncryptionStates")) {
            managedDeviceEncryptionStates = serializer.deserializeObject(json.get("managedDeviceEncryptionStates"), ManagedDeviceEncryptionStateCollectionPage.class);
        }

        if (json.has("ndesConnectors")) {
            ndesConnectors = serializer.deserializeObject(json.get("ndesConnectors"), NdesConnectorCollectionPage.class);
        }

        if (json.has("complianceCategories")) {
            complianceCategories = serializer.deserializeObject(json.get("complianceCategories"), DeviceManagementConfigurationCategoryCollectionPage.class);
        }

        if (json.has("compliancePolicies")) {
            compliancePolicies = serializer.deserializeObject(json.get("compliancePolicies"), DeviceManagementCompliancePolicyCollectionPage.class);
        }

        if (json.has("complianceSettings")) {
            complianceSettings = serializer.deserializeObject(json.get("complianceSettings"), DeviceManagementConfigurationSettingDefinitionCollectionPage.class);
        }

        if (json.has("configurationCategories")) {
            configurationCategories = serializer.deserializeObject(json.get("configurationCategories"), DeviceManagementConfigurationCategoryCollectionPage.class);
        }

        if (json.has("configurationPolicies")) {
            configurationPolicies = serializer.deserializeObject(json.get("configurationPolicies"), DeviceManagementConfigurationPolicyCollectionPage.class);
        }

        if (json.has("configurationPolicyTemplates")) {
            configurationPolicyTemplates = serializer.deserializeObject(json.get("configurationPolicyTemplates"), DeviceManagementConfigurationPolicyTemplateCollectionPage.class);
        }

        if (json.has("configurationSettings")) {
            configurationSettings = serializer.deserializeObject(json.get("configurationSettings"), DeviceManagementConfigurationSettingDefinitionCollectionPage.class);
        }

        if (json.has("reusablePolicySettings")) {
            reusablePolicySettings = serializer.deserializeObject(json.get("reusablePolicySettings"), DeviceManagementReusablePolicySettingCollectionPage.class);
        }

        if (json.has("reusableSettings")) {
            reusableSettings = serializer.deserializeObject(json.get("reusableSettings"), DeviceManagementConfigurationSettingDefinitionCollectionPage.class);
        }

        if (json.has("templateSettings")) {
            templateSettings = serializer.deserializeObject(json.get("templateSettings"), DeviceManagementConfigurationSettingTemplateCollectionPage.class);
        }

        if (json.has("complianceManagementPartners")) {
            complianceManagementPartners = serializer.deserializeObject(json.get("complianceManagementPartners"), ComplianceManagementPartnerCollectionPage.class);
        }

        if (json.has("deviceCategories")) {
            deviceCategories = serializer.deserializeObject(json.get("deviceCategories"), DeviceCategoryCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations"), DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("deviceManagementPartners")) {
            deviceManagementPartners = serializer.deserializeObject(json.get("deviceManagementPartners"), DeviceManagementPartnerCollectionPage.class);
        }

        if (json.has("exchangeConnectors")) {
            exchangeConnectors = serializer.deserializeObject(json.get("exchangeConnectors"), DeviceManagementExchangeConnectorCollectionPage.class);
        }

        if (json.has("exchangeOnPremisesPolicies")) {
            exchangeOnPremisesPolicies = serializer.deserializeObject(json.get("exchangeOnPremisesPolicies"), DeviceManagementExchangeOnPremisesPolicyCollectionPage.class);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            mobileThreatDefenseConnectors = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors"), MobileThreatDefenseConnectorCollectionPage.class);
        }

        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories"), DeviceManagementSettingCategoryCollectionPage.class);
        }

        if (json.has("intents")) {
            intents = serializer.deserializeObject(json.get("intents"), DeviceManagementIntentCollectionPage.class);
        }

        if (json.has("settingDefinitions")) {
            settingDefinitions = serializer.deserializeObject(json.get("settingDefinitions"), DeviceManagementSettingDefinitionCollectionPage.class);
        }

        if (json.has("templates")) {
            templates = serializer.deserializeObject(json.get("templates"), DeviceManagementTemplateCollectionPage.class);
        }

        if (json.has("cloudPCConnectivityIssues")) {
            cloudPCConnectivityIssues = serializer.deserializeObject(json.get("cloudPCConnectivityIssues"), CloudPCConnectivityIssueCollectionPage.class);
        }

        if (json.has("comanagedDevices")) {
            comanagedDevices = serializer.deserializeObject(json.get("comanagedDevices"), ManagedDeviceCollectionPage.class);
        }

        if (json.has("comanagementEligibleDevices")) {
            comanagementEligibleDevices = serializer.deserializeObject(json.get("comanagementEligibleDevices"), ComanagementEligibleDeviceCollectionPage.class);
        }

        if (json.has("dataSharingConsents")) {
            dataSharingConsents = serializer.deserializeObject(json.get("dataSharingConsents"), DataSharingConsentCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps"), DetectedAppCollectionPage.class);
        }

        if (json.has("deviceComplianceScripts")) {
            deviceComplianceScripts = serializer.deserializeObject(json.get("deviceComplianceScripts"), DeviceComplianceScriptCollectionPage.class);
        }

        if (json.has("deviceCustomAttributeShellScripts")) {
            deviceCustomAttributeShellScripts = serializer.deserializeObject(json.get("deviceCustomAttributeShellScripts"), DeviceCustomAttributeShellScriptCollectionPage.class);
        }

        if (json.has("deviceHealthScripts")) {
            deviceHealthScripts = serializer.deserializeObject(json.get("deviceHealthScripts"), DeviceHealthScriptCollectionPage.class);
        }

        if (json.has("deviceManagementScripts")) {
            deviceManagementScripts = serializer.deserializeObject(json.get("deviceManagementScripts"), DeviceManagementScriptCollectionPage.class);
        }

        if (json.has("deviceShellScripts")) {
            deviceShellScripts = serializer.deserializeObject(json.get("deviceShellScripts"), DeviceShellScriptCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices"), ManagedDeviceCollectionPage.class);
        }

        if (json.has("mobileAppTroubleshootingEvents")) {
            mobileAppTroubleshootingEvents = serializer.deserializeObject(json.get("mobileAppTroubleshootingEvents"), MobileAppTroubleshootingEventCollectionPage.class);
        }

        if (json.has("oemWarrantyInformationOnboarding")) {
            oemWarrantyInformationOnboarding = serializer.deserializeObject(json.get("oemWarrantyInformationOnboarding"), OemWarrantyInformationOnboardingCollectionPage.class);
        }

        if (json.has("remoteActionAudits")) {
            remoteActionAudits = serializer.deserializeObject(json.get("remoteActionAudits"), RemoteActionAuditCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformance")) {
            userExperienceAnalyticsAppHealthApplicationPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformance"), UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion"), UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails"), UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId"), UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"), UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDeviceModelPerformance")) {
            userExperienceAnalyticsAppHealthDeviceModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDeviceModelPerformance"), UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformance")) {
            userExperienceAnalyticsAppHealthDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformance"), UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformanceDetails")) {
            userExperienceAnalyticsAppHealthDevicePerformanceDetails = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformanceDetails"), UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthOSVersionPerformance")) {
            userExperienceAnalyticsAppHealthOSVersionPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthOSVersionPerformance"), UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBaselines")) {
            userExperienceAnalyticsBaselines = serializer.deserializeObject(json.get("userExperienceAnalyticsBaselines"), UserExperienceAnalyticsBaselineCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthAppImpact")) {
            userExperienceAnalyticsBatteryHealthAppImpact = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthAppImpact"), UserExperienceAnalyticsBatteryHealthAppImpactCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthDeviceAppImpact")) {
            userExperienceAnalyticsBatteryHealthDeviceAppImpact = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthDeviceAppImpact"), UserExperienceAnalyticsBatteryHealthDeviceAppImpactCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthDevicePerformance")) {
            userExperienceAnalyticsBatteryHealthDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthDevicePerformance"), UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory")) {
            userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory"), UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthModelPerformance")) {
            userExperienceAnalyticsBatteryHealthModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthModelPerformance"), UserExperienceAnalyticsBatteryHealthModelPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBatteryHealthOsPerformance")) {
            userExperienceAnalyticsBatteryHealthOsPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsBatteryHealthOsPerformance"), UserExperienceAnalyticsBatteryHealthOsPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsCategories")) {
            userExperienceAnalyticsCategories = serializer.deserializeObject(json.get("userExperienceAnalyticsCategories"), UserExperienceAnalyticsCategoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceMetricHistory")) {
            userExperienceAnalyticsDeviceMetricHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceMetricHistory"), UserExperienceAnalyticsMetricHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDevicePerformance")) {
            userExperienceAnalyticsDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicePerformance"), UserExperienceAnalyticsDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceScores")) {
            userExperienceAnalyticsDeviceScores = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceScores"), UserExperienceAnalyticsDeviceScoresCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupHistory")) {
            userExperienceAnalyticsDeviceStartupHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupHistory"), UserExperienceAnalyticsDeviceStartupHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcesses")) {
            userExperienceAnalyticsDeviceStartupProcesses = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcesses"), UserExperienceAnalyticsDeviceStartupProcessCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcessPerformance")) {
            userExperienceAnalyticsDeviceStartupProcessPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcessPerformance"), UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDevicesWithoutCloudIdentity")) {
            userExperienceAnalyticsDevicesWithoutCloudIdentity = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicesWithoutCloudIdentity"), UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsImpactingProcess")) {
            userExperienceAnalyticsImpactingProcess = serializer.deserializeObject(json.get("userExperienceAnalyticsImpactingProcess"), UserExperienceAnalyticsImpactingProcessCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsMetricHistory")) {
            userExperienceAnalyticsMetricHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsMetricHistory"), UserExperienceAnalyticsMetricHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsModelScores")) {
            userExperienceAnalyticsModelScores = serializer.deserializeObject(json.get("userExperienceAnalyticsModelScores"), UserExperienceAnalyticsModelScoresCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsNotAutopilotReadyDevice")) {
            userExperienceAnalyticsNotAutopilotReadyDevice = serializer.deserializeObject(json.get("userExperienceAnalyticsNotAutopilotReadyDevice"), UserExperienceAnalyticsNotAutopilotReadyDeviceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsRemoteConnection")) {
            userExperienceAnalyticsRemoteConnection = serializer.deserializeObject(json.get("userExperienceAnalyticsRemoteConnection"), UserExperienceAnalyticsRemoteConnectionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsResourcePerformance")) {
            userExperienceAnalyticsResourcePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsResourcePerformance"), UserExperienceAnalyticsResourcePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsScoreHistory")) {
            userExperienceAnalyticsScoreHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsScoreHistory"), UserExperienceAnalyticsScoreHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsWorkFromAnywhereMetrics")) {
            userExperienceAnalyticsWorkFromAnywhereMetrics = serializer.deserializeObject(json.get("userExperienceAnalyticsWorkFromAnywhereMetrics"), UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsWorkFromAnywhereModelPerformance")) {
            userExperienceAnalyticsWorkFromAnywhereModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsWorkFromAnywhereModelPerformance"), UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage.class);
        }

        if (json.has("windowsMalwareInformation")) {
            windowsMalwareInformation = serializer.deserializeObject(json.get("windowsMalwareInformation"), WindowsMalwareInformationCollectionPage.class);
        }

        if (json.has("derivedCredentials")) {
            derivedCredentials = serializer.deserializeObject(json.get("derivedCredentials"), DeviceManagementDerivedCredentialSettingsCollectionPage.class);
        }

        if (json.has("resourceAccessProfiles")) {
            resourceAccessProfiles = serializer.deserializeObject(json.get("resourceAccessProfiles"), DeviceManagementResourceAccessProfileBaseCollectionPage.class);
        }

        if (json.has("appleUserInitiatedEnrollmentProfiles")) {
            appleUserInitiatedEnrollmentProfiles = serializer.deserializeObject(json.get("appleUserInitiatedEnrollmentProfiles"), AppleUserInitiatedEnrollmentProfileCollectionPage.class);
        }

        if (json.has("depOnboardingSettings")) {
            depOnboardingSettings = serializer.deserializeObject(json.get("depOnboardingSettings"), DepOnboardingSettingCollectionPage.class);
        }

        if (json.has("importedDeviceIdentities")) {
            importedDeviceIdentities = serializer.deserializeObject(json.get("importedDeviceIdentities"), ImportedDeviceIdentityCollectionPage.class);
        }

        if (json.has("importedWindowsAutopilotDeviceIdentities")) {
            importedWindowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("importedWindowsAutopilotDeviceIdentities"), ImportedWindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeploymentProfiles")) {
            windowsAutopilotDeploymentProfiles = serializer.deserializeObject(json.get("windowsAutopilotDeploymentProfiles"), WindowsAutopilotDeploymentProfileCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeviceIdentities")) {
            windowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("windowsAutopilotDeviceIdentities"), WindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("managementConditions")) {
            managementConditions = serializer.deserializeObject(json.get("managementConditions"), ManagementConditionCollectionPage.class);
        }

        if (json.has("managementConditionStatements")) {
            managementConditionStatements = serializer.deserializeObject(json.get("managementConditionStatements"), ManagementConditionStatementCollectionPage.class);
        }

        if (json.has("groupPolicyMigrationReports")) {
            groupPolicyMigrationReports = serializer.deserializeObject(json.get("groupPolicyMigrationReports"), GroupPolicyMigrationReportCollectionPage.class);
        }

        if (json.has("groupPolicyObjectFiles")) {
            groupPolicyObjectFiles = serializer.deserializeObject(json.get("groupPolicyObjectFiles"), GroupPolicyObjectFileCollectionPage.class);
        }

        if (json.has("groupPolicyCategories")) {
            groupPolicyCategories = serializer.deserializeObject(json.get("groupPolicyCategories"), GroupPolicyCategoryCollectionPage.class);
        }

        if (json.has("groupPolicyConfigurations")) {
            groupPolicyConfigurations = serializer.deserializeObject(json.get("groupPolicyConfigurations"), GroupPolicyConfigurationCollectionPage.class);
        }

        if (json.has("groupPolicyDefinitionFiles")) {
            groupPolicyDefinitionFiles = serializer.deserializeObject(json.get("groupPolicyDefinitionFiles"), GroupPolicyDefinitionFileCollectionPage.class);
        }

        if (json.has("groupPolicyDefinitions")) {
            groupPolicyDefinitions = serializer.deserializeObject(json.get("groupPolicyDefinitions"), GroupPolicyDefinitionCollectionPage.class);
        }

        if (json.has("groupPolicyUploadedDefinitionFiles")) {
            groupPolicyUploadedDefinitionFiles = serializer.deserializeObject(json.get("groupPolicyUploadedDefinitionFiles"), GroupPolicyUploadedDefinitionFileCollectionPage.class);
        }

        if (json.has("microsoftTunnelConfigurations")) {
            microsoftTunnelConfigurations = serializer.deserializeObject(json.get("microsoftTunnelConfigurations"), MicrosoftTunnelConfigurationCollectionPage.class);
        }

        if (json.has("microsoftTunnelHealthThresholds")) {
            microsoftTunnelHealthThresholds = serializer.deserializeObject(json.get("microsoftTunnelHealthThresholds"), MicrosoftTunnelHealthThresholdCollectionPage.class);
        }

        if (json.has("microsoftTunnelServerLogCollectionResponses")) {
            microsoftTunnelServerLogCollectionResponses = serializer.deserializeObject(json.get("microsoftTunnelServerLogCollectionResponses"), MicrosoftTunnelServerLogCollectionResponseCollectionPage.class);
        }

        if (json.has("microsoftTunnelSites")) {
            microsoftTunnelSites = serializer.deserializeObject(json.get("microsoftTunnelSites"), MicrosoftTunnelSiteCollectionPage.class);
        }

        if (json.has("notificationMessageTemplates")) {
            notificationMessageTemplates = serializer.deserializeObject(json.get("notificationMessageTemplates"), NotificationMessageTemplateCollectionPage.class);
        }

        if (json.has("domainJoinConnectors")) {
            domainJoinConnectors = serializer.deserializeObject(json.get("domainJoinConnectors"), DeviceManagementDomainJoinConnectorCollectionPage.class);
        }

        if (json.has("configManagerCollections")) {
            configManagerCollections = serializer.deserializeObject(json.get("configManagerCollections"), ConfigManagerCollectionCollectionPage.class);
        }

        if (json.has("resourceOperations")) {
            resourceOperations = serializer.deserializeObject(json.get("resourceOperations"), ResourceOperationCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), DeviceAndAppManagementRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), RoleDefinitionCollectionPage.class);
        }

        if (json.has("roleScopeTags")) {
            roleScopeTags = serializer.deserializeObject(json.get("roleScopeTags"), RoleScopeTagCollectionPage.class);
        }

        if (json.has("remoteAssistancePartners")) {
            remoteAssistancePartners = serializer.deserializeObject(json.get("remoteAssistancePartners"), RemoteAssistancePartnerCollectionPage.class);
        }

        if (json.has("embeddedSIMActivationCodePools")) {
            embeddedSIMActivationCodePools = serializer.deserializeObject(json.get("embeddedSIMActivationCodePools"), EmbeddedSIMActivationCodePoolCollectionPage.class);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            telecomExpenseManagementPartners = serializer.deserializeObject(json.get("telecomExpenseManagementPartners"), TelecomExpenseManagementPartnerCollectionPage.class);
        }

        if (json.has("autopilotEvents")) {
            autopilotEvents = serializer.deserializeObject(json.get("autopilotEvents"), DeviceManagementAutopilotEventCollectionPage.class);
        }

        if (json.has("troubleshootingEvents")) {
            troubleshootingEvents = serializer.deserializeObject(json.get("troubleshootingEvents"), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("windowsDriverUpdateProfiles")) {
            windowsDriverUpdateProfiles = serializer.deserializeObject(json.get("windowsDriverUpdateProfiles"), WindowsDriverUpdateProfileCollectionPage.class);
        }

        if (json.has("windowsFeatureUpdateProfiles")) {
            windowsFeatureUpdateProfiles = serializer.deserializeObject(json.get("windowsFeatureUpdateProfiles"), WindowsFeatureUpdateProfileCollectionPage.class);
        }

        if (json.has("windowsQualityUpdateProfiles")) {
            windowsQualityUpdateProfiles = serializer.deserializeObject(json.get("windowsQualityUpdateProfiles"), WindowsQualityUpdateProfileCollectionPage.class);
        }

        if (json.has("windowsUpdateCatalogItems")) {
            windowsUpdateCatalogItems = serializer.deserializeObject(json.get("windowsUpdateCatalogItems"), WindowsUpdateCatalogItemCollectionPage.class);
        }

        if (json.has("intuneBrandingProfiles")) {
            intuneBrandingProfiles = serializer.deserializeObject(json.get("intuneBrandingProfiles"), IntuneBrandingProfileCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            windowsInformationProtectionAppLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries"), WindowsInformationProtectionAppLearningSummaryCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            windowsInformationProtectionNetworkLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries"), WindowsInformationProtectionNetworkLearningSummaryCollectionPage.class);
        }

        if (json.has("certificateConnectorDetails")) {
            certificateConnectorDetails = serializer.deserializeObject(json.get("certificateConnectorDetails"), CertificateConnectorDetailsCollectionPage.class);
        }

        if (json.has("userPfxCertificates")) {
            userPfxCertificates = serializer.deserializeObject(json.get("userPfxCertificates"), UserPFXCertificateCollectionPage.class);
        }
    }
}
