// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementSettings;
import com.microsoft.graph.models.extensions.IntuneBrand;
import com.microsoft.graph.models.extensions.AdminConsent;
import com.microsoft.graph.models.extensions.DeviceProtectionOverview;
import com.microsoft.graph.models.extensions.ManagedDeviceCleanupSettings;
import com.microsoft.graph.models.generated.DeviceManagementSubscriptions;
import com.microsoft.graph.models.generated.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsSettings;
import com.microsoft.graph.models.extensions.WindowsMalwareOverview;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerEnrollmentProfile;
import com.microsoft.graph.models.extensions.VirtualEndpoint;
import com.microsoft.graph.models.extensions.AndroidForWorkAppConfigurationSchema;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;
import com.microsoft.graph.models.extensions.AndroidForWorkSettings;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettings;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAppConfigurationSchema;
import com.microsoft.graph.models.extensions.AuditEvent;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.AdvancedThreatProtectionOnboardingStateSummary;
import com.microsoft.graph.models.extensions.CartToClassAssociation;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceConfigurationConflictSummary;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.extensions.RestrictedAppsViolation;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.ManagedAllDeviceCertificateState;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStateSummary;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.models.extensions.ManagedDeviceEncryptionState;
import com.microsoft.graph.models.extensions.NdesConnector;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationCategory;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import com.microsoft.graph.models.extensions.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeOnPremisesPolicy;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import com.microsoft.graph.models.extensions.DeviceManagementSettingCategory;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementSettingDefinition;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevice;
import com.microsoft.graph.models.extensions.DataSharingConsent;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.DeviceComplianceScript;
import com.microsoft.graph.models.extensions.DeviceCustomAttributeShellScript;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceManagementScript;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.extensions.RemoteActionAudit;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthApplicationPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupHistory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcess;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentity;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetricHistory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsOverview;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsResourcePerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsScoreHistory;
import com.microsoft.graph.models.extensions.WindowsMalwareInformation;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.extensions.DeviceManagementResourceAccessProfileBase;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.extensions.WindowsAutopilotSettings;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.GroupPolicyMigrationReport;
import com.microsoft.graph.models.extensions.GroupPolicyObjectFile;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.extensions.MicrosoftTunnelConfiguration;
import com.microsoft.graph.models.extensions.MicrosoftTunnelHealthThreshold;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServerLogCollectionResponse;
import com.microsoft.graph.models.extensions.MicrosoftTunnelSite;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
import com.microsoft.graph.models.extensions.ConfigManagerCollection;
import com.microsoft.graph.models.extensions.ResourceOperation;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;
import com.microsoft.graph.models.extensions.DeviceManagementReports;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePool;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfile;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfile;
import com.microsoft.graph.models.extensions.WindowsUpdateCatalogItem;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.extensions.UserPFXCertificate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AuditEventCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionPage;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsResourcePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseCollectionPage;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelHealthThresholdCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionCollectionPage;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionPage;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateCatalogItemCollectionPage;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public java.util.Calendar deviceComplianceReportSummarizationDateTime;

    /**
     * The Intune Account Id.
     * Intune Account ID for given tenant
     */
    @SerializedName(value = "intuneAccountId", alternate = {"IntuneAccountId"})
    @Expose
    public java.util.UUID intuneAccountId;

    /**
     * The Last Report Aggregation Date Time.
     * The last modified time of reporting for this account. This property is read-only.
     */
    @SerializedName(value = "lastReportAggregationDateTime", alternate = {"LastReportAggregationDateTime"})
    @Expose
    public java.util.Calendar lastReportAggregationDateTime;

    /**
     * The Legacy Pc Manangement Enabled.
     * The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     */
    @SerializedName(value = "legacyPcManangementEnabled", alternate = {"LegacyPcManangementEnabled"})
    @Expose
    public Boolean legacyPcManangementEnabled;

    /**
     * The Maximum Dep Tokens.
     * Maximum number of DEP tokens allowed per-tenant.
     */
    @SerializedName(value = "maximumDepTokens", alternate = {"MaximumDepTokens"})
    @Expose
    public Integer maximumDepTokens;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public DeviceManagementSettings settings;

    /**
     * The Unlicensed Adminstrators Enabled.
     * When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     */
    @SerializedName(value = "unlicensedAdminstratorsEnabled", alternate = {"UnlicensedAdminstratorsEnabled"})
    @Expose
    public Boolean unlicensedAdminstratorsEnabled;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName(value = "intuneBrand", alternate = {"IntuneBrand"})
    @Expose
    public IntuneBrand intuneBrand;

    /**
     * The Account Move Completion Date Time.
     * The date &amp; time when tenant data moved between scaleunits.
     */
    @SerializedName(value = "accountMoveCompletionDateTime", alternate = {"AccountMoveCompletionDateTime"})
    @Expose
    public java.util.Calendar accountMoveCompletionDateTime;

    /**
     * The Admin Consent.
     * Admin consent information.
     */
    @SerializedName(value = "adminConsent", alternate = {"AdminConsent"})
    @Expose
    public AdminConsent adminConsent;

    /**
     * The Device Protection Overview.
     * Device protection overview.
     */
    @SerializedName(value = "deviceProtectionOverview", alternate = {"DeviceProtectionOverview"})
    @Expose
    public DeviceProtectionOverview deviceProtectionOverview;

    /**
     * The Managed Device Cleanup Settings.
     * Device cleanup rule
     */
    @SerializedName(value = "managedDeviceCleanupSettings", alternate = {"ManagedDeviceCleanupSettings"})
    @Expose
    public ManagedDeviceCleanupSettings managedDeviceCleanupSettings;

    /**
     * The Subscriptions.
     * Tenant's Subscription. Possible values are: none, intune, office365, intunePremium, intune_EDU, intune_SMB.
     */
    @SerializedName(value = "subscriptions", alternate = {"Subscriptions"})
    @Expose
    public EnumSet<DeviceManagementSubscriptions> subscriptions;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName(value = "subscriptionState", alternate = {"SubscriptionState"})
    @Expose
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The User Experience Analytics Settings.
     * User experience analytics device settings
     */
    @SerializedName(value = "userExperienceAnalyticsSettings", alternate = {"UserExperienceAnalyticsSettings"})
    @Expose
    public UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;

    /**
     * The Windows Malware Overview.
     * Malware overview for windows devices.
     */
    @SerializedName(value = "windowsMalwareOverview", alternate = {"WindowsMalwareOverview"})
    @Expose
    public WindowsMalwareOverview windowsMalwareOverview;

    /**
     * The Android Device Owner Enrollment Profiles.
     * Android device owner enrollment profile entities.
     */
    @SerializedName(value = "androidDeviceOwnerEnrollmentProfiles", alternate = {"AndroidDeviceOwnerEnrollmentProfiles"})
    @Expose
    public AndroidDeviceOwnerEnrollmentProfileCollectionPage androidDeviceOwnerEnrollmentProfiles;

    /**
     * The Virtual Endpoint.
     * 
     */
    @SerializedName(value = "virtualEndpoint", alternate = {"VirtualEndpoint"})
    @Expose
    public VirtualEndpoint virtualEndpoint;

    /**
     * The Android For Work App Configuration Schemas.
     * Android for Work app configuration schema entities.
     */
    @SerializedName(value = "androidForWorkAppConfigurationSchemas", alternate = {"AndroidForWorkAppConfigurationSchemas"})
    @Expose
    public AndroidForWorkAppConfigurationSchemaCollectionPage androidForWorkAppConfigurationSchemas;

    /**
     * The Android For Work Enrollment Profiles.
     * Android for Work enrollment profile entities.
     */
    @SerializedName(value = "androidForWorkEnrollmentProfiles", alternate = {"AndroidForWorkEnrollmentProfiles"})
    @Expose
    public AndroidForWorkEnrollmentProfileCollectionPage androidForWorkEnrollmentProfiles;

    /**
     * The Android For Work Settings.
     * The singleton Android for Work settings entity.
     */
    @SerializedName(value = "androidForWorkSettings", alternate = {"AndroidForWorkSettings"})
    @Expose
    public AndroidForWorkSettings androidForWorkSettings;

    /**
     * The Android Managed Store Account Enterprise Settings.
     * The singleton Android managed store account enterprise settings entity.
     */
    @SerializedName(value = "androidManagedStoreAccountEnterpriseSettings", alternate = {"AndroidManagedStoreAccountEnterpriseSettings"})
    @Expose
    public AndroidManagedStoreAccountEnterpriseSettings androidManagedStoreAccountEnterpriseSettings;

    /**
     * The Android Managed Store App Configuration Schemas.
     * Android Enterprise app configuration schema entities.
     */
    @SerializedName(value = "androidManagedStoreAppConfigurationSchemas", alternate = {"AndroidManagedStoreAppConfigurationSchemas"})
    @Expose
    public AndroidManagedStoreAppConfigurationSchemaCollectionPage androidManagedStoreAppConfigurationSchemas;

    /**
     * The Audit Events.
     * The Audit Events
     */
    @SerializedName(value = "auditEvents", alternate = {"AuditEvents"})
    @Expose
    public AuditEventCollectionPage auditEvents;

    /**
     * The Assignment Filters.
     * The list of assignment filters
     */
    @SerializedName(value = "assignmentFilters", alternate = {"AssignmentFilters"})
    @Expose
    public DeviceAndAppManagementAssignmentFilterCollectionPage assignmentFilters;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Advanced Threat Protection Onboarding State Summary.
     * The summary state of ATP onboarding state for this account.
     */
    @SerializedName(value = "advancedThreatProtectionOnboardingStateSummary", alternate = {"AdvancedThreatProtectionOnboardingStateSummary"})
    @Expose
    public AdvancedThreatProtectionOnboardingStateSummary advancedThreatProtectionOnboardingStateSummary;

    /**
     * The Cart To Class Associations.
     * The Cart To Class Associations.
     */
    @SerializedName(value = "cartToClassAssociations", alternate = {"CartToClassAssociations"})
    @Expose
    public CartToClassAssociationCollectionPage cartToClassAssociations;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName(value = "deviceCompliancePolicies", alternate = {"DeviceCompliancePolicies"})
    @Expose
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName(value = "deviceCompliancePolicyDeviceStateSummary", alternate = {"DeviceCompliancePolicyDeviceStateSummary"})
    @Expose
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Conflict Summary.
     * Summary of policies in conflict state for this account.
     */
    @SerializedName(value = "deviceConfigurationConflictSummary", alternate = {"DeviceConfigurationConflictSummary"})
    @Expose
    public DeviceConfigurationConflictSummaryCollectionPage deviceConfigurationConflictSummary;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationDeviceStateSummaries", alternate = {"DeviceConfigurationDeviceStateSummaries"})
    @Expose
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configuration Restricted Apps Violations.
     * Restricted apps violations for this account.
     */
    @SerializedName(value = "deviceConfigurationRestrictedAppsViolations", alternate = {"DeviceConfigurationRestrictedAppsViolations"})
    @Expose
    public RestrictedAppsViolationCollectionPage deviceConfigurationRestrictedAppsViolations;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName(value = "deviceConfigurations", alternate = {"DeviceConfigurations"})
    @Expose
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Device Configurations All Managed Device Certificate States.
     * Summary of all certificates for all devices.
     */
    @SerializedName(value = "deviceConfigurationsAllManagedDeviceCertificateStates", alternate = {"DeviceConfigurationsAllManagedDeviceCertificateStates"})
    @Expose
    public ManagedAllDeviceCertificateStateCollectionPage deviceConfigurationsAllManagedDeviceCertificateStates;

    /**
     * The Device Configuration User State Summaries.
     * The device configuration user state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationUserStateSummaries", alternate = {"DeviceConfigurationUserStateSummaries"})
    @Expose
    public DeviceConfigurationUserStateSummary deviceConfigurationUserStateSummaries;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName(value = "iosUpdateStatuses", alternate = {"IosUpdateStatuses"})
    @Expose
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Mac OSSoftware Update Account Summaries.
     * The MacOS software update account summaries for this account.
     */
    @SerializedName(value = "macOSSoftwareUpdateAccountSummaries", alternate = {"MacOSSoftwareUpdateAccountSummaries"})
    @Expose
    public MacOSSoftwareUpdateAccountSummaryCollectionPage macOSSoftwareUpdateAccountSummaries;

    /**
     * The Managed Device Encryption States.
     * Encryption report for devices in this account
     */
    @SerializedName(value = "managedDeviceEncryptionStates", alternate = {"ManagedDeviceEncryptionStates"})
    @Expose
    public ManagedDeviceEncryptionStateCollectionPage managedDeviceEncryptionStates;

    /**
     * The Ndes Connectors.
     * The collection of Ndes connectors for this account.
     */
    @SerializedName(value = "ndesConnectors", alternate = {"NdesConnectors"})
    @Expose
    public NdesConnectorCollectionPage ndesConnectors;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName(value = "softwareUpdateStatusSummary", alternate = {"SoftwareUpdateStatusSummary"})
    @Expose
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Configuration Categories.
     * List of all Configuration Categories
     */
    @SerializedName(value = "configurationCategories", alternate = {"ConfigurationCategories"})
    @Expose
    public DeviceManagementConfigurationCategoryCollectionPage configurationCategories;

    /**
     * The Configuration Policies.
     * List of all Configuration policies
     */
    @SerializedName(value = "configurationPolicies", alternate = {"ConfigurationPolicies"})
    @Expose
    public DeviceManagementConfigurationPolicyCollectionPage configurationPolicies;

    /**
     * The Configuration Settings.
     * List of all ConfigurationSettings
     */
    @SerializedName(value = "configurationSettings", alternate = {"ConfigurationSettings"})
    @Expose
    public DeviceManagementConfigurationSettingDefinitionCollectionPage configurationSettings;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName(value = "complianceManagementPartners", alternate = {"ComplianceManagementPartners"})
    @Expose
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName(value = "deviceCategories", alternate = {"DeviceCategories"})
    @Expose
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName(value = "deviceManagementPartners", alternate = {"DeviceManagementPartners"})
    @Expose
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName(value = "exchangeConnectors", alternate = {"ExchangeConnectors"})
    @Expose
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Exchange On Premises Policies.
     * The list of Exchange On Premisis policies configured by the tenant.
     */
    @SerializedName(value = "exchangeOnPremisesPolicies", alternate = {"ExchangeOnPremisesPolicies"})
    @Expose
    public DeviceManagementExchangeOnPremisesPolicyCollectionPage exchangeOnPremisesPolicies;

    /**
     * The Exchange On Premises Policy.
     * The policy which controls mobile device access to Exchange On Premises
     */
    @SerializedName(value = "exchangeOnPremisesPolicy", alternate = {"ExchangeOnPremisesPolicy"})
    @Expose
    public DeviceManagementExchangeOnPremisesPolicy exchangeOnPremisesPolicy;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName(value = "mobileThreatDefenseConnectors", alternate = {"MobileThreatDefenseConnectors"})
    @Expose
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Categories.
     * The available categories
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
    public DeviceManagementSettingCategoryCollectionPage categories;

    /**
     * The Intents.
     * The device management intents
     */
    @SerializedName(value = "intents", alternate = {"Intents"})
    @Expose
    public DeviceManagementIntentCollectionPage intents;

    /**
     * The Setting Definitions.
     * The device management intent setting definitions
     */
    @SerializedName(value = "settingDefinitions", alternate = {"SettingDefinitions"})
    @Expose
    public DeviceManagementSettingDefinitionCollectionPage settingDefinitions;

    /**
     * The Templates.
     * The available templates
     */
    @SerializedName(value = "templates", alternate = {"Templates"})
    @Expose
    public DeviceManagementTemplateCollectionPage templates;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName(value = "applePushNotificationCertificate", alternate = {"ApplePushNotificationCertificate"})
    @Expose
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Comanaged Devices.
     * The list of co-managed devices report
     */
    @SerializedName(value = "comanagedDevices", alternate = {"ComanagedDevices"})
    @Expose
    public ManagedDeviceCollectionPage comanagedDevices;

    /**
     * The Comanagement Eligible Devices.
     * The list of co-management eligible devices report
     */
    @SerializedName(value = "comanagementEligibleDevices", alternate = {"ComanagementEligibleDevices"})
    @Expose
    public ComanagementEligibleDeviceCollectionPage comanagementEligibleDevices;

    /**
     * The Data Sharing Consents.
     * Data sharing consents.
     */
    @SerializedName(value = "dataSharingConsents", alternate = {"DataSharingConsents"})
    @Expose
    public DataSharingConsentCollectionPage dataSharingConsents;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName(value = "detectedApps", alternate = {"DetectedApps"})
    @Expose
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Compliance Scripts.
     * The list of device compliance scripts associated with the tenant.
     */
    @SerializedName(value = "deviceComplianceScripts", alternate = {"DeviceComplianceScripts"})
    @Expose
    public DeviceComplianceScriptCollectionPage deviceComplianceScripts;

    /**
     * The Device Custom Attribute Shell Scripts.
     * The list of device custom attribute shell scripts associated with the tenant.
     */
    @SerializedName(value = "deviceCustomAttributeShellScripts", alternate = {"DeviceCustomAttributeShellScripts"})
    @Expose
    public DeviceCustomAttributeShellScriptCollectionPage deviceCustomAttributeShellScripts;

    /**
     * The Device Health Scripts.
     * The list of device health scripts associated with the tenant.
     */
    @SerializedName(value = "deviceHealthScripts", alternate = {"DeviceHealthScripts"})
    @Expose
    public DeviceHealthScriptCollectionPage deviceHealthScripts;

    /**
     * The Device Management Scripts.
     * The list of device management scripts associated with the tenant.
     */
    @SerializedName(value = "deviceManagementScripts", alternate = {"DeviceManagementScripts"})
    @Expose
    public DeviceManagementScriptCollectionPage deviceManagementScripts;

    /**
     * The Device Shell Scripts.
     * The list of device shell scripts associated with the tenant.
     */
    @SerializedName(value = "deviceShellScripts", alternate = {"DeviceShellScripts"})
    @Expose
    public DeviceShellScriptCollectionPage deviceShellScripts;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName(value = "managedDeviceOverview", alternate = {"ManagedDeviceOverview"})
    @Expose
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Mobile App Troubleshooting Events.
     * The collection property of MobileAppTroubleshootingEvent.
     */
    @SerializedName(value = "mobileAppTroubleshootingEvents", alternate = {"MobileAppTroubleshootingEvents"})
    @Expose
    public MobileAppTroubleshootingEventCollectionPage mobileAppTroubleshootingEvents;

    /**
     * The Remote Action Audits.
     * The list of device remote action audits with the tenant.
     */
    @SerializedName(value = "remoteActionAudits", alternate = {"RemoteActionAudits"})
    @Expose
    public RemoteActionAuditCollectionPage remoteActionAudits;

    /**
     * The User Experience Analytics App Health Application Performance.
     * User experience analytics appHealth Application Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformance", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformance"})
    @Expose
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage userExperienceAnalyticsAppHealthApplicationPerformance;

    /**
     * The User Experience Analytics App Health Application Performance By App Version.
     * User experience analytics appHealth Application Performance by App Version
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion"})
    @Expose
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;

    /**
     * The User Experience Analytics App Health Application Performance By OSVersion.
     * User experience analytics appHealth Application Performance by OS Version
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"})
    @Expose
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;

    /**
     * The User Experience Analytics App Health Device Model Performance.
     * User experience analytics appHealth Model Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDeviceModelPerformance", alternate = {"UserExperienceAnalyticsAppHealthDeviceModelPerformance"})
    @Expose
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage userExperienceAnalyticsAppHealthDeviceModelPerformance;

    /**
     * The User Experience Analytics App Health Device Performance.
     * User experience analytics appHealth Device Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformance", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformance"})
    @Expose
    public UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage userExperienceAnalyticsAppHealthDevicePerformance;

    /**
     * The User Experience Analytics App Health Device Performance Details.
     * User experience analytics device performance details
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformanceDetails", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformanceDetails"})
    @Expose
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage userExperienceAnalyticsAppHealthDevicePerformanceDetails;

    /**
     * The User Experience Analytics App Health OSVersion Performance.
     * User experience analytics appHealth OS version Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOSVersionPerformance", alternate = {"UserExperienceAnalyticsAppHealthOSVersionPerformance"})
    @Expose
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage userExperienceAnalyticsAppHealthOSVersionPerformance;

    /**
     * The User Experience Analytics App Health Overview.
     * User experience analytics appHealth overview
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOverview", alternate = {"UserExperienceAnalyticsAppHealthOverview"})
    @Expose
    public UserExperienceAnalyticsCategory userExperienceAnalyticsAppHealthOverview;

    /**
     * The User Experience Analytics Baselines.
     * User experience analytics baselines
     */
    @SerializedName(value = "userExperienceAnalyticsBaselines", alternate = {"UserExperienceAnalyticsBaselines"})
    @Expose
    public UserExperienceAnalyticsBaselineCollectionPage userExperienceAnalyticsBaselines;

    /**
     * The User Experience Analytics Categories.
     * User experience analytics categories
     */
    @SerializedName(value = "userExperienceAnalyticsCategories", alternate = {"UserExperienceAnalyticsCategories"})
    @Expose
    public UserExperienceAnalyticsCategoryCollectionPage userExperienceAnalyticsCategories;

    /**
     * The User Experience Analytics Device Performance.
     * User experience analytics device performance
     */
    @SerializedName(value = "userExperienceAnalyticsDevicePerformance", alternate = {"UserExperienceAnalyticsDevicePerformance"})
    @Expose
    public UserExperienceAnalyticsDevicePerformanceCollectionPage userExperienceAnalyticsDevicePerformance;

    /**
     * The User Experience Analytics Device Startup History.
     * User experience analytics device Startup History
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupHistory", alternate = {"UserExperienceAnalyticsDeviceStartupHistory"})
    @Expose
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage userExperienceAnalyticsDeviceStartupHistory;

    /**
     * The User Experience Analytics Device Startup Processes.
     * User experience analytics device Startup Processes
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupProcesses", alternate = {"UserExperienceAnalyticsDeviceStartupProcesses"})
    @Expose
    public UserExperienceAnalyticsDeviceStartupProcessCollectionPage userExperienceAnalyticsDeviceStartupProcesses;

    /**
     * The User Experience Analytics Device Startup Process Performance.
     * User experience analytics device Startup Process Performance
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupProcessPerformance", alternate = {"UserExperienceAnalyticsDeviceStartupProcessPerformance"})
    @Expose
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage userExperienceAnalyticsDeviceStartupProcessPerformance;

    /**
     * The User Experience Analytics Devices Without Cloud Identity.
     * User experience analytics devices without cloud identity.
     */
    @SerializedName(value = "userExperienceAnalyticsDevicesWithoutCloudIdentity", alternate = {"UserExperienceAnalyticsDevicesWithoutCloudIdentity"})
    @Expose
    public UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage userExperienceAnalyticsDevicesWithoutCloudIdentity;

    /**
     * The User Experience Analytics Metric History.
     * User experience analytics metric history
     */
    @SerializedName(value = "userExperienceAnalyticsMetricHistory", alternate = {"UserExperienceAnalyticsMetricHistory"})
    @Expose
    public UserExperienceAnalyticsMetricHistoryCollectionPage userExperienceAnalyticsMetricHistory;

    /**
     * The User Experience Analytics Overview.
     * User experience analytics overview
     */
    @SerializedName(value = "userExperienceAnalyticsOverview", alternate = {"UserExperienceAnalyticsOverview"})
    @Expose
    public UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;

    /**
     * The User Experience Analytics Regression Summary.
     * User experience analytics regression summary
     */
    @SerializedName(value = "userExperienceAnalyticsRegressionSummary", alternate = {"UserExperienceAnalyticsRegressionSummary"})
    @Expose
    public UserExperienceAnalyticsRegressionSummary userExperienceAnalyticsRegressionSummary;

    /**
     * The User Experience Analytics Resource Performance.
     * User experience analytics resource performance
     */
    @SerializedName(value = "userExperienceAnalyticsResourcePerformance", alternate = {"UserExperienceAnalyticsResourcePerformance"})
    @Expose
    public UserExperienceAnalyticsResourcePerformanceCollectionPage userExperienceAnalyticsResourcePerformance;

    /**
     * The User Experience Analytics Score History.
     * User experience analytics device Startup Score History
     */
    @SerializedName(value = "userExperienceAnalyticsScoreHistory", alternate = {"UserExperienceAnalyticsScoreHistory"})
    @Expose
    public UserExperienceAnalyticsScoreHistoryCollectionPage userExperienceAnalyticsScoreHistory;

    /**
     * The Windows Malware Information.
     * The list of affected malware in the tenant.
     */
    @SerializedName(value = "windowsMalwareInformation", alternate = {"WindowsMalwareInformation"})
    @Expose
    public WindowsMalwareInformationCollectionPage windowsMalwareInformation;

    /**
     * The Derived Credentials.
     * Collection of Derived credential settings associated with account.
     */
    @SerializedName(value = "derivedCredentials", alternate = {"DerivedCredentials"})
    @Expose
    public DeviceManagementDerivedCredentialSettingsCollectionPage derivedCredentials;

    /**
     * The Resource Access Profiles.
     * Collection of resource access settings associated with account.
     */
    @SerializedName(value = "resourceAccessProfiles", alternate = {"ResourceAccessProfiles"})
    @Expose
    public DeviceManagementResourceAccessProfileBaseCollectionPage resourceAccessProfiles;

    /**
     * The Apple User Initiated Enrollment Profiles.
     * Apple user initiated enrollment profiles
     */
    @SerializedName(value = "appleUserInitiatedEnrollmentProfiles", alternate = {"AppleUserInitiatedEnrollmentProfiles"})
    @Expose
    public AppleUserInitiatedEnrollmentProfileCollectionPage appleUserInitiatedEnrollmentProfiles;

    /**
     * The Dep Onboarding Settings.
     * This collections of multiple DEP tokens per-tenant.
     */
    @SerializedName(value = "depOnboardingSettings", alternate = {"DepOnboardingSettings"})
    @Expose
    public DepOnboardingSettingCollectionPage depOnboardingSettings;

    /**
     * The Imported Device Identities.
     * The imported device identities.
     */
    @SerializedName(value = "importedDeviceIdentities", alternate = {"ImportedDeviceIdentities"})
    @Expose
    public ImportedDeviceIdentityCollectionPage importedDeviceIdentities;

    /**
     * The Imported Windows Autopilot Device Identities.
     * Collection of imported Windows autopilot devices.
     */
    @SerializedName(value = "importedWindowsAutopilotDeviceIdentities", alternate = {"ImportedWindowsAutopilotDeviceIdentities"})
    @Expose
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage importedWindowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Deployment Profiles.
     * Windows auto pilot deployment profiles
     */
    @SerializedName(value = "windowsAutopilotDeploymentProfiles", alternate = {"WindowsAutopilotDeploymentProfiles"})
    @Expose
    public WindowsAutopilotDeploymentProfileCollectionPage windowsAutopilotDeploymentProfiles;

    /**
     * The Windows Autopilot Device Identities.
     * The Windows autopilot device identities contained collection.
     */
    @SerializedName(value = "windowsAutopilotDeviceIdentities", alternate = {"WindowsAutopilotDeviceIdentities"})
    @Expose
    public WindowsAutopilotDeviceIdentityCollectionPage windowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Settings.
     * The Windows autopilot account settings.
     */
    @SerializedName(value = "windowsAutopilotSettings", alternate = {"WindowsAutopilotSettings"})
    @Expose
    public WindowsAutopilotSettings windowsAutopilotSettings;

    /**
     * The Management Conditions.
     * The management conditions associated with device management of the company.
     */
    @SerializedName(value = "managementConditions", alternate = {"ManagementConditions"})
    @Expose
    public ManagementConditionCollectionPage managementConditions;

    /**
     * The Management Condition Statements.
     * The management condition statements associated with device management of the company.
     */
    @SerializedName(value = "managementConditionStatements", alternate = {"ManagementConditionStatements"})
    @Expose
    public ManagementConditionStatementCollectionPage managementConditionStatements;

    /**
     * The Group Policy Migration Reports.
     * A list of Group Policy migration reports.
     */
    @SerializedName(value = "groupPolicyMigrationReports", alternate = {"GroupPolicyMigrationReports"})
    @Expose
    public GroupPolicyMigrationReportCollectionPage groupPolicyMigrationReports;

    /**
     * The Group Policy Object Files.
     * A list of Group Policy Object files uploaded.
     */
    @SerializedName(value = "groupPolicyObjectFiles", alternate = {"GroupPolicyObjectFiles"})
    @Expose
    public GroupPolicyObjectFileCollectionPage groupPolicyObjectFiles;

    /**
     * The Group Policy Categories.
     * The available group policy categories for this account.
     */
    @SerializedName(value = "groupPolicyCategories", alternate = {"GroupPolicyCategories"})
    @Expose
    public GroupPolicyCategoryCollectionPage groupPolicyCategories;

    /**
     * The Group Policy Configurations.
     * The group policy configurations created by this account.
     */
    @SerializedName(value = "groupPolicyConfigurations", alternate = {"GroupPolicyConfigurations"})
    @Expose
    public GroupPolicyConfigurationCollectionPage groupPolicyConfigurations;

    /**
     * The Group Policy Definition Files.
     * The available group policy definition files for this account.
     */
    @SerializedName(value = "groupPolicyDefinitionFiles", alternate = {"GroupPolicyDefinitionFiles"})
    @Expose
    public GroupPolicyDefinitionFileCollectionPage groupPolicyDefinitionFiles;

    /**
     * The Group Policy Definitions.
     * The available group policy definitions for this account.
     */
    @SerializedName(value = "groupPolicyDefinitions", alternate = {"GroupPolicyDefinitions"})
    @Expose
    public GroupPolicyDefinitionCollectionPage groupPolicyDefinitions;

    /**
     * The Group Policy Uploaded Definition Files.
     * The available group policy uploaded definition files for this account.
     */
    @SerializedName(value = "groupPolicyUploadedDefinitionFiles", alternate = {"GroupPolicyUploadedDefinitionFiles"})
    @Expose
    public GroupPolicyUploadedDefinitionFileCollectionPage groupPolicyUploadedDefinitionFiles;

    /**
     * The Microsoft Tunnel Configurations.
     * Collection of MicrosoftTunnelConfiguration settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelConfigurations", alternate = {"MicrosoftTunnelConfigurations"})
    @Expose
    public MicrosoftTunnelConfigurationCollectionPage microsoftTunnelConfigurations;

    /**
     * The Microsoft Tunnel Health Thresholds.
     * Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelHealthThresholds", alternate = {"MicrosoftTunnelHealthThresholds"})
    @Expose
    public MicrosoftTunnelHealthThresholdCollectionPage microsoftTunnelHealthThresholds;

    /**
     * The Microsoft Tunnel Server Log Collection Responses.
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelServerLogCollectionResponses", alternate = {"MicrosoftTunnelServerLogCollectionResponses"})
    @Expose
    public MicrosoftTunnelServerLogCollectionResponseCollectionPage microsoftTunnelServerLogCollectionResponses;

    /**
     * The Microsoft Tunnel Sites.
     * Collection of MicrosoftTunnelSite settings associated with account.
     */
    @SerializedName(value = "microsoftTunnelSites", alternate = {"MicrosoftTunnelSites"})
    @Expose
    public MicrosoftTunnelSiteCollectionPage microsoftTunnelSites;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName(value = "notificationMessageTemplates", alternate = {"NotificationMessageTemplates"})
    @Expose
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Domain Join Connectors.
     * A list of connector objects.
     */
    @SerializedName(value = "domainJoinConnectors", alternate = {"DomainJoinConnectors"})
    @Expose
    public DeviceManagementDomainJoinConnectorCollectionPage domainJoinConnectors;

    /**
     * The Config Manager Collections.
     * A list of ConfigManagerCollection
     */
    @SerializedName(value = "configManagerCollections", alternate = {"ConfigManagerCollections"})
    @Expose
    public ConfigManagerCollectionCollectionPage configManagerCollections;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName(value = "resourceOperations", alternate = {"ResourceOperations"})
    @Expose
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Scope Tags.
     * The Role Scope Tags.
     */
    @SerializedName(value = "roleScopeTags", alternate = {"RoleScopeTags"})
    @Expose
    public RoleScopeTagCollectionPage roleScopeTags;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName(value = "remoteAssistancePartners", alternate = {"RemoteAssistancePartners"})
    @Expose
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Reports.
     * Reports singleton
     */
    @SerializedName(value = "reports", alternate = {"Reports"})
    @Expose
    public DeviceManagementReports reports;

    /**
     * The Embedded SIMActivation Code Pools.
     * The embedded SIM activation code pools created by this account.
     */
    @SerializedName(value = "embeddedSIMActivationCodePools", alternate = {"EmbeddedSIMActivationCodePools"})
    @Expose
    public EmbeddedSIMActivationCodePoolCollectionPage embeddedSIMActivationCodePools;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName(value = "telecomExpenseManagementPartners", alternate = {"TelecomExpenseManagementPartners"})
    @Expose
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Autopilot Events.
     * The list of autopilot events for the tenant.
     */
    @SerializedName(value = "autopilotEvents", alternate = {"AutopilotEvents"})
    @Expose
    public DeviceManagementAutopilotEventCollectionPage autopilotEvents;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName(value = "troubleshootingEvents", alternate = {"TroubleshootingEvents"})
    @Expose
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Feature Update Profiles.
     * A collection of windows feature update profiles
     */
    @SerializedName(value = "windowsFeatureUpdateProfiles", alternate = {"WindowsFeatureUpdateProfiles"})
    @Expose
    public WindowsFeatureUpdateProfileCollectionPage windowsFeatureUpdateProfiles;

    /**
     * The Windows Quality Update Profiles.
     * A collection of windows quality update profiles
     */
    @SerializedName(value = "windowsQualityUpdateProfiles", alternate = {"WindowsQualityUpdateProfiles"})
    @Expose
    public WindowsQualityUpdateProfileCollectionPage windowsQualityUpdateProfiles;

    /**
     * The Windows Update Catalog Items.
     * A collection of windows update catalog items (fetaure updates item , quality updates item)
     */
    @SerializedName(value = "windowsUpdateCatalogItems", alternate = {"WindowsUpdateCatalogItems"})
    @Expose
    public WindowsUpdateCatalogItemCollectionPage windowsUpdateCatalogItems;

    /**
     * The Intune Branding Profiles.
     * Intune branding profiles targeted to AAD groups
     */
    @SerializedName(value = "intuneBrandingProfiles", alternate = {"IntuneBrandingProfiles"})
    @Expose
    public IntuneBrandingProfileCollectionPage intuneBrandingProfiles;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionAppLearningSummaries", alternate = {"WindowsInformationProtectionAppLearningSummaries"})
    @Expose
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionNetworkLearningSummaries", alternate = {"WindowsInformationProtectionNetworkLearningSummaries"})
    @Expose
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;

    /**
     * The User Pfx Certificates.
     * Collection of PFX certificates associated with a user.
     */
    @SerializedName(value = "userPfxCertificates", alternate = {"UserPfxCertificates"})
    @Expose
    public UserPFXCertificateCollectionPage userPfxCertificates;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("androidDeviceOwnerEnrollmentProfiles")) {
            androidDeviceOwnerEnrollmentProfiles = serializer.deserializeObject(json.get("androidDeviceOwnerEnrollmentProfiles").toString(), AndroidDeviceOwnerEnrollmentProfileCollectionPage.class);
        }

        if (json.has("androidForWorkAppConfigurationSchemas")) {
            androidForWorkAppConfigurationSchemas = serializer.deserializeObject(json.get("androidForWorkAppConfigurationSchemas").toString(), AndroidForWorkAppConfigurationSchemaCollectionPage.class);
        }

        if (json.has("androidForWorkEnrollmentProfiles")) {
            androidForWorkEnrollmentProfiles = serializer.deserializeObject(json.get("androidForWorkEnrollmentProfiles").toString(), AndroidForWorkEnrollmentProfileCollectionPage.class);
        }

        if (json.has("androidManagedStoreAppConfigurationSchemas")) {
            androidManagedStoreAppConfigurationSchemas = serializer.deserializeObject(json.get("androidManagedStoreAppConfigurationSchemas").toString(), AndroidManagedStoreAppConfigurationSchemaCollectionPage.class);
        }

        if (json.has("auditEvents")) {
            auditEvents = serializer.deserializeObject(json.get("auditEvents").toString(), AuditEventCollectionPage.class);
        }

        if (json.has("assignmentFilters")) {
            assignmentFilters = serializer.deserializeObject(json.get("assignmentFilters").toString(), DeviceAndAppManagementAssignmentFilterCollectionPage.class);
        }

        if (json.has("termsAndConditions")) {
            termsAndConditions = serializer.deserializeObject(json.get("termsAndConditions").toString(), TermsAndConditionsCollectionPage.class);
        }

        if (json.has("cartToClassAssociations")) {
            cartToClassAssociations = serializer.deserializeObject(json.get("cartToClassAssociations").toString(), CartToClassAssociationCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicies")) {
            deviceCompliancePolicies = serializer.deserializeObject(json.get("deviceCompliancePolicies").toString(), DeviceCompliancePolicyCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries").toString(), DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurationConflictSummary")) {
            deviceConfigurationConflictSummary = serializer.deserializeObject(json.get("deviceConfigurationConflictSummary").toString(), DeviceConfigurationConflictSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurationRestrictedAppsViolations")) {
            deviceConfigurationRestrictedAppsViolations = serializer.deserializeObject(json.get("deviceConfigurationRestrictedAppsViolations").toString(), RestrictedAppsViolationCollectionPage.class);
        }

        if (json.has("deviceConfigurations")) {
            deviceConfigurations = serializer.deserializeObject(json.get("deviceConfigurations").toString(), DeviceConfigurationCollectionPage.class);
        }

        if (json.has("deviceConfigurationsAllManagedDeviceCertificateStates")) {
            deviceConfigurationsAllManagedDeviceCertificateStates = serializer.deserializeObject(json.get("deviceConfigurationsAllManagedDeviceCertificateStates").toString(), ManagedAllDeviceCertificateStateCollectionPage.class);
        }

        if (json.has("iosUpdateStatuses")) {
            iosUpdateStatuses = serializer.deserializeObject(json.get("iosUpdateStatuses").toString(), IosUpdateDeviceStatusCollectionPage.class);
        }

        if (json.has("macOSSoftwareUpdateAccountSummaries")) {
            macOSSoftwareUpdateAccountSummaries = serializer.deserializeObject(json.get("macOSSoftwareUpdateAccountSummaries").toString(), MacOSSoftwareUpdateAccountSummaryCollectionPage.class);
        }

        if (json.has("managedDeviceEncryptionStates")) {
            managedDeviceEncryptionStates = serializer.deserializeObject(json.get("managedDeviceEncryptionStates").toString(), ManagedDeviceEncryptionStateCollectionPage.class);
        }

        if (json.has("ndesConnectors")) {
            ndesConnectors = serializer.deserializeObject(json.get("ndesConnectors").toString(), NdesConnectorCollectionPage.class);
        }

        if (json.has("configurationCategories")) {
            configurationCategories = serializer.deserializeObject(json.get("configurationCategories").toString(), DeviceManagementConfigurationCategoryCollectionPage.class);
        }

        if (json.has("configurationPolicies")) {
            configurationPolicies = serializer.deserializeObject(json.get("configurationPolicies").toString(), DeviceManagementConfigurationPolicyCollectionPage.class);
        }

        if (json.has("configurationSettings")) {
            configurationSettings = serializer.deserializeObject(json.get("configurationSettings").toString(), DeviceManagementConfigurationSettingDefinitionCollectionPage.class);
        }

        if (json.has("complianceManagementPartners")) {
            complianceManagementPartners = serializer.deserializeObject(json.get("complianceManagementPartners").toString(), ComplianceManagementPartnerCollectionPage.class);
        }

        if (json.has("deviceCategories")) {
            deviceCategories = serializer.deserializeObject(json.get("deviceCategories").toString(), DeviceCategoryCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations").toString(), DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("deviceManagementPartners")) {
            deviceManagementPartners = serializer.deserializeObject(json.get("deviceManagementPartners").toString(), DeviceManagementPartnerCollectionPage.class);
        }

        if (json.has("exchangeConnectors")) {
            exchangeConnectors = serializer.deserializeObject(json.get("exchangeConnectors").toString(), DeviceManagementExchangeConnectorCollectionPage.class);
        }

        if (json.has("exchangeOnPremisesPolicies")) {
            exchangeOnPremisesPolicies = serializer.deserializeObject(json.get("exchangeOnPremisesPolicies").toString(), DeviceManagementExchangeOnPremisesPolicyCollectionPage.class);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            mobileThreatDefenseConnectors = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors").toString(), MobileThreatDefenseConnectorCollectionPage.class);
        }

        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories").toString(), DeviceManagementSettingCategoryCollectionPage.class);
        }

        if (json.has("intents")) {
            intents = serializer.deserializeObject(json.get("intents").toString(), DeviceManagementIntentCollectionPage.class);
        }

        if (json.has("settingDefinitions")) {
            settingDefinitions = serializer.deserializeObject(json.get("settingDefinitions").toString(), DeviceManagementSettingDefinitionCollectionPage.class);
        }

        if (json.has("templates")) {
            templates = serializer.deserializeObject(json.get("templates").toString(), DeviceManagementTemplateCollectionPage.class);
        }

        if (json.has("comanagedDevices")) {
            comanagedDevices = serializer.deserializeObject(json.get("comanagedDevices").toString(), ManagedDeviceCollectionPage.class);
        }

        if (json.has("comanagementEligibleDevices")) {
            comanagementEligibleDevices = serializer.deserializeObject(json.get("comanagementEligibleDevices").toString(), ComanagementEligibleDeviceCollectionPage.class);
        }

        if (json.has("dataSharingConsents")) {
            dataSharingConsents = serializer.deserializeObject(json.get("dataSharingConsents").toString(), DataSharingConsentCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps").toString(), DetectedAppCollectionPage.class);
        }

        if (json.has("deviceComplianceScripts")) {
            deviceComplianceScripts = serializer.deserializeObject(json.get("deviceComplianceScripts").toString(), DeviceComplianceScriptCollectionPage.class);
        }

        if (json.has("deviceCustomAttributeShellScripts")) {
            deviceCustomAttributeShellScripts = serializer.deserializeObject(json.get("deviceCustomAttributeShellScripts").toString(), DeviceCustomAttributeShellScriptCollectionPage.class);
        }

        if (json.has("deviceHealthScripts")) {
            deviceHealthScripts = serializer.deserializeObject(json.get("deviceHealthScripts").toString(), DeviceHealthScriptCollectionPage.class);
        }

        if (json.has("deviceManagementScripts")) {
            deviceManagementScripts = serializer.deserializeObject(json.get("deviceManagementScripts").toString(), DeviceManagementScriptCollectionPage.class);
        }

        if (json.has("deviceShellScripts")) {
            deviceShellScripts = serializer.deserializeObject(json.get("deviceShellScripts").toString(), DeviceShellScriptCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices").toString(), ManagedDeviceCollectionPage.class);
        }

        if (json.has("mobileAppTroubleshootingEvents")) {
            mobileAppTroubleshootingEvents = serializer.deserializeObject(json.get("mobileAppTroubleshootingEvents").toString(), MobileAppTroubleshootingEventCollectionPage.class);
        }

        if (json.has("remoteActionAudits")) {
            remoteActionAudits = serializer.deserializeObject(json.get("remoteActionAudits").toString(), RemoteActionAuditCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformance")) {
            userExperienceAnalyticsAppHealthApplicationPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformance").toString(), UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion").toString(), UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion").toString(), UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDeviceModelPerformance")) {
            userExperienceAnalyticsAppHealthDeviceModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDeviceModelPerformance").toString(), UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformance")) {
            userExperienceAnalyticsAppHealthDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformance").toString(), UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformanceDetails")) {
            userExperienceAnalyticsAppHealthDevicePerformanceDetails = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformanceDetails").toString(), UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthOSVersionPerformance")) {
            userExperienceAnalyticsAppHealthOSVersionPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthOSVersionPerformance").toString(), UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBaselines")) {
            userExperienceAnalyticsBaselines = serializer.deserializeObject(json.get("userExperienceAnalyticsBaselines").toString(), UserExperienceAnalyticsBaselineCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsCategories")) {
            userExperienceAnalyticsCategories = serializer.deserializeObject(json.get("userExperienceAnalyticsCategories").toString(), UserExperienceAnalyticsCategoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDevicePerformance")) {
            userExperienceAnalyticsDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicePerformance").toString(), UserExperienceAnalyticsDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupHistory")) {
            userExperienceAnalyticsDeviceStartupHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupHistory").toString(), UserExperienceAnalyticsDeviceStartupHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcesses")) {
            userExperienceAnalyticsDeviceStartupProcesses = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcesses").toString(), UserExperienceAnalyticsDeviceStartupProcessCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcessPerformance")) {
            userExperienceAnalyticsDeviceStartupProcessPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcessPerformance").toString(), UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDevicesWithoutCloudIdentity")) {
            userExperienceAnalyticsDevicesWithoutCloudIdentity = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicesWithoutCloudIdentity").toString(), UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsMetricHistory")) {
            userExperienceAnalyticsMetricHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsMetricHistory").toString(), UserExperienceAnalyticsMetricHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsResourcePerformance")) {
            userExperienceAnalyticsResourcePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsResourcePerformance").toString(), UserExperienceAnalyticsResourcePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsScoreHistory")) {
            userExperienceAnalyticsScoreHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsScoreHistory").toString(), UserExperienceAnalyticsScoreHistoryCollectionPage.class);
        }

        if (json.has("windowsMalwareInformation")) {
            windowsMalwareInformation = serializer.deserializeObject(json.get("windowsMalwareInformation").toString(), WindowsMalwareInformationCollectionPage.class);
        }

        if (json.has("derivedCredentials")) {
            derivedCredentials = serializer.deserializeObject(json.get("derivedCredentials").toString(), DeviceManagementDerivedCredentialSettingsCollectionPage.class);
        }

        if (json.has("resourceAccessProfiles")) {
            resourceAccessProfiles = serializer.deserializeObject(json.get("resourceAccessProfiles").toString(), DeviceManagementResourceAccessProfileBaseCollectionPage.class);
        }

        if (json.has("appleUserInitiatedEnrollmentProfiles")) {
            appleUserInitiatedEnrollmentProfiles = serializer.deserializeObject(json.get("appleUserInitiatedEnrollmentProfiles").toString(), AppleUserInitiatedEnrollmentProfileCollectionPage.class);
        }

        if (json.has("depOnboardingSettings")) {
            depOnboardingSettings = serializer.deserializeObject(json.get("depOnboardingSettings").toString(), DepOnboardingSettingCollectionPage.class);
        }

        if (json.has("importedDeviceIdentities")) {
            importedDeviceIdentities = serializer.deserializeObject(json.get("importedDeviceIdentities").toString(), ImportedDeviceIdentityCollectionPage.class);
        }

        if (json.has("importedWindowsAutopilotDeviceIdentities")) {
            importedWindowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("importedWindowsAutopilotDeviceIdentities").toString(), ImportedWindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeploymentProfiles")) {
            windowsAutopilotDeploymentProfiles = serializer.deserializeObject(json.get("windowsAutopilotDeploymentProfiles").toString(), WindowsAutopilotDeploymentProfileCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeviceIdentities")) {
            windowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("windowsAutopilotDeviceIdentities").toString(), WindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("managementConditions")) {
            managementConditions = serializer.deserializeObject(json.get("managementConditions").toString(), ManagementConditionCollectionPage.class);
        }

        if (json.has("managementConditionStatements")) {
            managementConditionStatements = serializer.deserializeObject(json.get("managementConditionStatements").toString(), ManagementConditionStatementCollectionPage.class);
        }

        if (json.has("groupPolicyMigrationReports")) {
            groupPolicyMigrationReports = serializer.deserializeObject(json.get("groupPolicyMigrationReports").toString(), GroupPolicyMigrationReportCollectionPage.class);
        }

        if (json.has("groupPolicyObjectFiles")) {
            groupPolicyObjectFiles = serializer.deserializeObject(json.get("groupPolicyObjectFiles").toString(), GroupPolicyObjectFileCollectionPage.class);
        }

        if (json.has("groupPolicyCategories")) {
            groupPolicyCategories = serializer.deserializeObject(json.get("groupPolicyCategories").toString(), GroupPolicyCategoryCollectionPage.class);
        }

        if (json.has("groupPolicyConfigurations")) {
            groupPolicyConfigurations = serializer.deserializeObject(json.get("groupPolicyConfigurations").toString(), GroupPolicyConfigurationCollectionPage.class);
        }

        if (json.has("groupPolicyDefinitionFiles")) {
            groupPolicyDefinitionFiles = serializer.deserializeObject(json.get("groupPolicyDefinitionFiles").toString(), GroupPolicyDefinitionFileCollectionPage.class);
        }

        if (json.has("groupPolicyDefinitions")) {
            groupPolicyDefinitions = serializer.deserializeObject(json.get("groupPolicyDefinitions").toString(), GroupPolicyDefinitionCollectionPage.class);
        }

        if (json.has("groupPolicyUploadedDefinitionFiles")) {
            groupPolicyUploadedDefinitionFiles = serializer.deserializeObject(json.get("groupPolicyUploadedDefinitionFiles").toString(), GroupPolicyUploadedDefinitionFileCollectionPage.class);
        }

        if (json.has("microsoftTunnelConfigurations")) {
            microsoftTunnelConfigurations = serializer.deserializeObject(json.get("microsoftTunnelConfigurations").toString(), MicrosoftTunnelConfigurationCollectionPage.class);
        }

        if (json.has("microsoftTunnelHealthThresholds")) {
            microsoftTunnelHealthThresholds = serializer.deserializeObject(json.get("microsoftTunnelHealthThresholds").toString(), MicrosoftTunnelHealthThresholdCollectionPage.class);
        }

        if (json.has("microsoftTunnelServerLogCollectionResponses")) {
            microsoftTunnelServerLogCollectionResponses = serializer.deserializeObject(json.get("microsoftTunnelServerLogCollectionResponses").toString(), MicrosoftTunnelServerLogCollectionResponseCollectionPage.class);
        }

        if (json.has("microsoftTunnelSites")) {
            microsoftTunnelSites = serializer.deserializeObject(json.get("microsoftTunnelSites").toString(), MicrosoftTunnelSiteCollectionPage.class);
        }

        if (json.has("notificationMessageTemplates")) {
            notificationMessageTemplates = serializer.deserializeObject(json.get("notificationMessageTemplates").toString(), NotificationMessageTemplateCollectionPage.class);
        }

        if (json.has("domainJoinConnectors")) {
            domainJoinConnectors = serializer.deserializeObject(json.get("domainJoinConnectors").toString(), DeviceManagementDomainJoinConnectorCollectionPage.class);
        }

        if (json.has("configManagerCollections")) {
            configManagerCollections = serializer.deserializeObject(json.get("configManagerCollections").toString(), ConfigManagerCollectionCollectionPage.class);
        }

        if (json.has("resourceOperations")) {
            resourceOperations = serializer.deserializeObject(json.get("resourceOperations").toString(), ResourceOperationCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments").toString(), DeviceAndAppManagementRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions").toString(), RoleDefinitionCollectionPage.class);
        }

        if (json.has("roleScopeTags")) {
            roleScopeTags = serializer.deserializeObject(json.get("roleScopeTags").toString(), RoleScopeTagCollectionPage.class);
        }

        if (json.has("remoteAssistancePartners")) {
            remoteAssistancePartners = serializer.deserializeObject(json.get("remoteAssistancePartners").toString(), RemoteAssistancePartnerCollectionPage.class);
        }

        if (json.has("embeddedSIMActivationCodePools")) {
            embeddedSIMActivationCodePools = serializer.deserializeObject(json.get("embeddedSIMActivationCodePools").toString(), EmbeddedSIMActivationCodePoolCollectionPage.class);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            telecomExpenseManagementPartners = serializer.deserializeObject(json.get("telecomExpenseManagementPartners").toString(), TelecomExpenseManagementPartnerCollectionPage.class);
        }

        if (json.has("autopilotEvents")) {
            autopilotEvents = serializer.deserializeObject(json.get("autopilotEvents").toString(), DeviceManagementAutopilotEventCollectionPage.class);
        }

        if (json.has("troubleshootingEvents")) {
            troubleshootingEvents = serializer.deserializeObject(json.get("troubleshootingEvents").toString(), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("windowsFeatureUpdateProfiles")) {
            windowsFeatureUpdateProfiles = serializer.deserializeObject(json.get("windowsFeatureUpdateProfiles").toString(), WindowsFeatureUpdateProfileCollectionPage.class);
        }

        if (json.has("windowsQualityUpdateProfiles")) {
            windowsQualityUpdateProfiles = serializer.deserializeObject(json.get("windowsQualityUpdateProfiles").toString(), WindowsQualityUpdateProfileCollectionPage.class);
        }

        if (json.has("windowsUpdateCatalogItems")) {
            windowsUpdateCatalogItems = serializer.deserializeObject(json.get("windowsUpdateCatalogItems").toString(), WindowsUpdateCatalogItemCollectionPage.class);
        }

        if (json.has("intuneBrandingProfiles")) {
            intuneBrandingProfiles = serializer.deserializeObject(json.get("intuneBrandingProfiles").toString(), IntuneBrandingProfileCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            windowsInformationProtectionAppLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries").toString(), WindowsInformationProtectionAppLearningSummaryCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            windowsInformationProtectionNetworkLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries").toString(), WindowsInformationProtectionNetworkLearningSummaryCollectionPage.class);
        }

        if (json.has("userPfxCertificates")) {
            userPfxCertificates = serializer.deserializeObject(json.get("userPfxCertificates").toString(), UserPFXCertificateCollectionPage.class);
        }
    }
}
