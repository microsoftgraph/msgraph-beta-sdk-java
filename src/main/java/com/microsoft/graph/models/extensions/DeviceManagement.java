// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
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
import com.microsoft.graph.models.extensions.AuditEvent;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerEnrollmentProfile;
import com.microsoft.graph.models.extensions.AndroidForWorkAppConfigurationSchema;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;
import com.microsoft.graph.models.extensions.AndroidForWorkSettings;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettings;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAppConfigurationSchema;
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
import com.microsoft.graph.models.extensions.ManagedDeviceEncryptionState;
import com.microsoft.graph.models.extensions.NdesConnector;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
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
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceManagementScript;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.extensions.RemoteActionAudit;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthApplicationPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupHistory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcess;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformance;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetricHistory;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsOverview;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsScoreHistory;
import com.microsoft.graph.models.extensions.WindowsMalwareInformation;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
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
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
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
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.extensions.UserPFXCertificate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AuditEventCollectionResponse;
import com.microsoft.graph.requests.extensions.AuditEventCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionResponse;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionResponse;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionResponse;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionResponse;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionResponse;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionPage;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionResponse;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionResponse;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionResponse;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionPage;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionResponse;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionResponse;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionResponse;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionPage;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionPage;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionResponse;
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
    @SerializedName("deviceComplianceReportSummarizationDateTime")
    @Expose
    public java.util.Calendar deviceComplianceReportSummarizationDateTime;

    /**
     * The Intune Account Id.
     * Intune Account Id for given tenant
     */
    @SerializedName("intuneAccountId")
    @Expose
    public java.util.UUID intuneAccountId;

    /**
     * The Last Report Aggregation Date Time.
     * The last modified time of reporting for this account. This property is read-only.
     */
    @SerializedName("lastReportAggregationDateTime")
    @Expose
    public java.util.Calendar lastReportAggregationDateTime;

    /**
     * The Legacy Pc Manangement Enabled.
     * The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     */
    @SerializedName("legacyPcManangementEnabled")
    @Expose
    public Boolean legacyPcManangementEnabled;

    /**
     * The Maximum Dep Tokens.
     * Maximum number of dep tokens allowed per-tenant.
     */
    @SerializedName("maximumDepTokens")
    @Expose
    public Integer maximumDepTokens;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName("settings")
    @Expose
    public DeviceManagementSettings settings;

    /**
     * The Unlicensed Adminstrators Enabled.
     * When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     */
    @SerializedName("unlicensedAdminstratorsEnabled")
    @Expose
    public Boolean unlicensedAdminstratorsEnabled;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName("intuneBrand")
    @Expose
    public IntuneBrand intuneBrand;

    /**
     * The Account Move Completion Date Time.
     * The date &amp; time when tenant data moved between scaleunits.
     */
    @SerializedName("accountMoveCompletionDateTime")
    @Expose
    public java.util.Calendar accountMoveCompletionDateTime;

    /**
     * The Admin Consent.
     * Admin consent information.
     */
    @SerializedName("adminConsent")
    @Expose
    public AdminConsent adminConsent;

    /**
     * The Device Protection Overview.
     * Device protection overview.
     */
    @SerializedName("deviceProtectionOverview")
    @Expose
    public DeviceProtectionOverview deviceProtectionOverview;

    /**
     * The Managed Device Cleanup Settings.
     * Device cleanup rule
     */
    @SerializedName("managedDeviceCleanupSettings")
    @Expose
    public ManagedDeviceCleanupSettings managedDeviceCleanupSettings;

    /**
     * The Subscriptions.
     * Tenant's Subscription.
     */
    @SerializedName("subscriptions")
    @Expose
    public EnumSet<DeviceManagementSubscriptions> subscriptions;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName("subscriptionState")
    @Expose
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The User Experience Analytics Settings.
     * User experience analytics device settings
     */
    @SerializedName("userExperienceAnalyticsSettings")
    @Expose
    public UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;

    /**
     * The Windows Malware Overview.
     * Malware overview for windows devices.
     */
    @SerializedName("windowsMalwareOverview")
    @Expose
    public WindowsMalwareOverview windowsMalwareOverview;

    /**
     * The Audit Events.
     * The Audit Events
     */
    @SerializedName("auditEvents")
    @Expose
    public AuditEventCollectionPage auditEvents;

    /**
     * The Android Device Owner Enrollment Profiles.
     * Android device owner enrollment profile entities.
     */
    @SerializedName("androidDeviceOwnerEnrollmentProfiles")
    @Expose
    public AndroidDeviceOwnerEnrollmentProfileCollectionPage androidDeviceOwnerEnrollmentProfiles;

    /**
     * The Android For Work App Configuration Schemas.
     * Android for Work app configuration schema entities.
     */
    @SerializedName("androidForWorkAppConfigurationSchemas")
    @Expose
    public AndroidForWorkAppConfigurationSchemaCollectionPage androidForWorkAppConfigurationSchemas;

    /**
     * The Android For Work Enrollment Profiles.
     * Android for Work enrollment profile entities.
     */
    @SerializedName("androidForWorkEnrollmentProfiles")
    @Expose
    public AndroidForWorkEnrollmentProfileCollectionPage androidForWorkEnrollmentProfiles;

    /**
     * The Android For Work Settings.
     * The singleton Android for Work settings entity.
     */
    @SerializedName("androidForWorkSettings")
    @Expose
    public AndroidForWorkSettings androidForWorkSettings;

    /**
     * The Android Managed Store Account Enterprise Settings.
     * The singleton Android managed store account enterprise settings entity.
     */
    @SerializedName("androidManagedStoreAccountEnterpriseSettings")
    @Expose
    public AndroidManagedStoreAccountEnterpriseSettings androidManagedStoreAccountEnterpriseSettings;

    /**
     * The Android Managed Store App Configuration Schemas.
     * Android Enterprise app configuration schema entities.
     */
    @SerializedName("androidManagedStoreAppConfigurationSchemas")
    @Expose
    public AndroidManagedStoreAppConfigurationSchemaCollectionPage androidManagedStoreAppConfigurationSchemas;

    /**
     * The Assignment Filters.
     * The list of assignment filters
     */
    @SerializedName("assignmentFilters")
    @Expose
    public DeviceAndAppManagementAssignmentFilterCollectionPage assignmentFilters;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName("termsAndConditions")
    @Expose
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Advanced Threat Protection Onboarding State Summary.
     * The summary state of ATP onboarding state for this account.
     */
    @SerializedName("advancedThreatProtectionOnboardingStateSummary")
    @Expose
    public AdvancedThreatProtectionOnboardingStateSummary advancedThreatProtectionOnboardingStateSummary;

    /**
     * The Cart To Class Associations.
     * The Cart To Class Associations.
     */
    @SerializedName("cartToClassAssociations")
    @Expose
    public CartToClassAssociationCollectionPage cartToClassAssociations;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName("deviceCompliancePolicies")
    @Expose
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName("deviceCompliancePolicyDeviceStateSummary")
    @Expose
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName("deviceCompliancePolicySettingStateSummaries")
    @Expose
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Conflict Summary.
     * Summary of policies in conflict state for this account.
     */
    @SerializedName("deviceConfigurationConflictSummary")
    @Expose
    public DeviceConfigurationConflictSummaryCollectionPage deviceConfigurationConflictSummary;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName("deviceConfigurationDeviceStateSummaries")
    @Expose
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configuration Restricted Apps Violations.
     * Restricted apps violations for this account.
     */
    @SerializedName("deviceConfigurationRestrictedAppsViolations")
    @Expose
    public RestrictedAppsViolationCollectionPage deviceConfigurationRestrictedAppsViolations;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName("deviceConfigurations")
    @Expose
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Device Configurations All Managed Device Certificate States.
     * Summary of all certificates for all devices.
     */
    @SerializedName("deviceConfigurationsAllManagedDeviceCertificateStates")
    @Expose
    public ManagedAllDeviceCertificateStateCollectionPage deviceConfigurationsAllManagedDeviceCertificateStates;

    /**
     * The Device Configuration User State Summaries.
     * The device configuration user state summary for this account.
     */
    @SerializedName("deviceConfigurationUserStateSummaries")
    @Expose
    public DeviceConfigurationUserStateSummary deviceConfigurationUserStateSummaries;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName("iosUpdateStatuses")
    @Expose
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Managed Device Encryption States.
     * Encryption report for devices in this account
     */
    @SerializedName("managedDeviceEncryptionStates")
    @Expose
    public ManagedDeviceEncryptionStateCollectionPage managedDeviceEncryptionStates;

    /**
     * The Ndes Connectors.
     * The collection of Ndes connectors for this account.
     */
    @SerializedName("ndesConnectors")
    @Expose
    public NdesConnectorCollectionPage ndesConnectors;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName("softwareUpdateStatusSummary")
    @Expose
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName("complianceManagementPartners")
    @Expose
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName("conditionalAccessSettings")
    @Expose
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName("deviceCategories")
    @Expose
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName("deviceEnrollmentConfigurations")
    @Expose
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName("deviceManagementPartners")
    @Expose
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName("exchangeConnectors")
    @Expose
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Exchange On Premises Policies.
     * The list of Exchange On Premisis policies configured by the tenant.
     */
    @SerializedName("exchangeOnPremisesPolicies")
    @Expose
    public DeviceManagementExchangeOnPremisesPolicyCollectionPage exchangeOnPremisesPolicies;

    /**
     * The Exchange On Premises Policy.
     * The policy which controls mobile device access to Exchange On Premises
     */
    @SerializedName("exchangeOnPremisesPolicy")
    @Expose
    public DeviceManagementExchangeOnPremisesPolicy exchangeOnPremisesPolicy;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName("mobileThreatDefenseConnectors")
    @Expose
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Categories.
     * The available categories
     */
    @SerializedName("categories")
    @Expose
    public DeviceManagementSettingCategoryCollectionPage categories;

    /**
     * The Intents.
     * The device management intents
     */
    @SerializedName("intents")
    @Expose
    public DeviceManagementIntentCollectionPage intents;

    /**
     * The Setting Definitions.
     * The device management intent setting definitions
     */
    @SerializedName("settingDefinitions")
    @Expose
    public DeviceManagementSettingDefinitionCollectionPage settingDefinitions;

    /**
     * The Templates.
     * The available templates
     */
    @SerializedName("templates")
    @Expose
    public DeviceManagementTemplateCollectionPage templates;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName("applePushNotificationCertificate")
    @Expose
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Comanaged Devices.
     * The list of co-managed devices report
     */
    @SerializedName("comanagedDevices")
    @Expose
    public ManagedDeviceCollectionPage comanagedDevices;

    /**
     * The Comanagement Eligible Devices.
     * The list of co-management eligible devices report
     */
    @SerializedName("comanagementEligibleDevices")
    @Expose
    public ComanagementEligibleDeviceCollectionPage comanagementEligibleDevices;

    /**
     * The Data Sharing Consents.
     * Data sharing consents.
     */
    @SerializedName("dataSharingConsents")
    @Expose
    public DataSharingConsentCollectionPage dataSharingConsents;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName("detectedApps")
    @Expose
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Compliance Scripts.
     * The list of device compliance scripts associated with the tenant.
     */
    @SerializedName("deviceComplianceScripts")
    @Expose
    public DeviceComplianceScriptCollectionPage deviceComplianceScripts;

    /**
     * The Device Health Scripts.
     * The list of device health scripts associated with the tenant.
     */
    @SerializedName("deviceHealthScripts")
    @Expose
    public DeviceHealthScriptCollectionPage deviceHealthScripts;

    /**
     * The Device Management Scripts.
     * The list of device management scripts associated with the tenant.
     */
    @SerializedName("deviceManagementScripts")
    @Expose
    public DeviceManagementScriptCollectionPage deviceManagementScripts;

    /**
     * The Device Shell Scripts.
     * The list of device shell scripts associated with the tenant.
     */
    @SerializedName("deviceShellScripts")
    @Expose
    public DeviceShellScriptCollectionPage deviceShellScripts;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName("managedDeviceOverview")
    @Expose
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName("managedDevices")
    @Expose
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Mobile App Troubleshooting Events.
     * The collection property of MobileAppTroubleshootingEvent.
     */
    @SerializedName("mobileAppTroubleshootingEvents")
    @Expose
    public MobileAppTroubleshootingEventCollectionPage mobileAppTroubleshootingEvents;

    /**
     * The Remote Action Audits.
     * The list of device remote action audits with the tenant.
     */
    @SerializedName("remoteActionAudits")
    @Expose
    public RemoteActionAuditCollectionPage remoteActionAudits;

    /**
     * The User Experience Analytics App Health Application Performance.
     * User experience analytics appHealth Application Performance
     */
    @SerializedName("userExperienceAnalyticsAppHealthApplicationPerformance")
    @Expose
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage userExperienceAnalyticsAppHealthApplicationPerformance;

    /**
     * The User Experience Analytics Baselines.
     * User experience analytics baselines
     */
    @SerializedName("userExperienceAnalyticsBaselines")
    @Expose
    public UserExperienceAnalyticsBaselineCollectionPage userExperienceAnalyticsBaselines;

    /**
     * The User Experience Analytics Categories.
     * User experience analytics categories
     */
    @SerializedName("userExperienceAnalyticsCategories")
    @Expose
    public UserExperienceAnalyticsCategoryCollectionPage userExperienceAnalyticsCategories;

    /**
     * The User Experience Analytics Device Performance.
     * User experience analytics device performance
     */
    @SerializedName("userExperienceAnalyticsDevicePerformance")
    @Expose
    public UserExperienceAnalyticsDevicePerformanceCollectionPage userExperienceAnalyticsDevicePerformance;

    /**
     * The User Experience Analytics Device Startup History.
     * User experience analytics device Startup History
     */
    @SerializedName("userExperienceAnalyticsDeviceStartupHistory")
    @Expose
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage userExperienceAnalyticsDeviceStartupHistory;

    /**
     * The User Experience Analytics Device Startup Processes.
     * User experience analytics device Startup Processes
     */
    @SerializedName("userExperienceAnalyticsDeviceStartupProcesses")
    @Expose
    public UserExperienceAnalyticsDeviceStartupProcessCollectionPage userExperienceAnalyticsDeviceStartupProcesses;

    /**
     * The User Experience Analytics Device Startup Process Performance.
     * User experience analytics device Startup Process Performance
     */
    @SerializedName("userExperienceAnalyticsDeviceStartupProcessPerformance")
    @Expose
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage userExperienceAnalyticsDeviceStartupProcessPerformance;

    /**
     * The User Experience Analytics Metric History.
     * User experience analytics metric history
     */
    @SerializedName("userExperienceAnalyticsMetricHistory")
    @Expose
    public UserExperienceAnalyticsMetricHistoryCollectionPage userExperienceAnalyticsMetricHistory;

    /**
     * The User Experience Analytics Overview.
     * User experience analytics overview
     */
    @SerializedName("userExperienceAnalyticsOverview")
    @Expose
    public UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;

    /**
     * The User Experience Analytics Regression Summary.
     * User experience analytics regression summary
     */
    @SerializedName("userExperienceAnalyticsRegressionSummary")
    @Expose
    public UserExperienceAnalyticsRegressionSummary userExperienceAnalyticsRegressionSummary;

    /**
     * The User Experience Analytics Score History.
     * User experience analytics device Startup Score History
     */
    @SerializedName("userExperienceAnalyticsScoreHistory")
    @Expose
    public UserExperienceAnalyticsScoreHistoryCollectionPage userExperienceAnalyticsScoreHistory;

    /**
     * The Windows Malware Information.
     * The list of affected malware in the tenant.
     */
    @SerializedName("windowsMalwareInformation")
    @Expose
    public WindowsMalwareInformationCollectionPage windowsMalwareInformation;

    /**
     * The Derived Credentials.
     * Collection of Derived credential settings associated with account.
     */
    @SerializedName("derivedCredentials")
    @Expose
    public DeviceManagementDerivedCredentialSettingsCollectionPage derivedCredentials;

    /**
     * The Apple User Initiated Enrollment Profiles.
     * Apple user initiated enrollment profiles
     */
    @SerializedName("appleUserInitiatedEnrollmentProfiles")
    @Expose
    public AppleUserInitiatedEnrollmentProfileCollectionPage appleUserInitiatedEnrollmentProfiles;

    /**
     * The Dep Onboarding Settings.
     * This collections of multiple DEP tokens per-tenant.
     */
    @SerializedName("depOnboardingSettings")
    @Expose
    public DepOnboardingSettingCollectionPage depOnboardingSettings;

    /**
     * The Imported Device Identities.
     * The imported device identities.
     */
    @SerializedName("importedDeviceIdentities")
    @Expose
    public ImportedDeviceIdentityCollectionPage importedDeviceIdentities;

    /**
     * The Imported Windows Autopilot Device Identities.
     * Collection of imported Windows autopilot devices.
     */
    @SerializedName("importedWindowsAutopilotDeviceIdentities")
    @Expose
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage importedWindowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Deployment Profiles.
     * Windows auto pilot deployment profiles
     */
    @SerializedName("windowsAutopilotDeploymentProfiles")
    @Expose
    public WindowsAutopilotDeploymentProfileCollectionPage windowsAutopilotDeploymentProfiles;

    /**
     * The Windows Autopilot Device Identities.
     * The Windows autopilot device identities contained collection.
     */
    @SerializedName("windowsAutopilotDeviceIdentities")
    @Expose
    public WindowsAutopilotDeviceIdentityCollectionPage windowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Settings.
     * The Windows autopilot account settings.
     */
    @SerializedName("windowsAutopilotSettings")
    @Expose
    public WindowsAutopilotSettings windowsAutopilotSettings;

    /**
     * The Management Conditions.
     * The management conditions associated with device management of the company.
     */
    @SerializedName("managementConditions")
    @Expose
    public ManagementConditionCollectionPage managementConditions;

    /**
     * The Management Condition Statements.
     * The management condition statements associated with device management of the company.
     */
    @SerializedName("managementConditionStatements")
    @Expose
    public ManagementConditionStatementCollectionPage managementConditionStatements;

    /**
     * The Group Policy Migration Reports.
     * A list of Group Policy migration reports.
     */
    @SerializedName("groupPolicyMigrationReports")
    @Expose
    public GroupPolicyMigrationReportCollectionPage groupPolicyMigrationReports;

    /**
     * The Group Policy Object Files.
     * A list of Group Policy Object files uploaded.
     */
    @SerializedName("groupPolicyObjectFiles")
    @Expose
    public GroupPolicyObjectFileCollectionPage groupPolicyObjectFiles;

    /**
     * The Group Policy Categories.
     * The available group policy categories for this account.
     */
    @SerializedName("groupPolicyCategories")
    @Expose
    public GroupPolicyCategoryCollectionPage groupPolicyCategories;

    /**
     * The Group Policy Configurations.
     * The group policy configurations created by this account.
     */
    @SerializedName("groupPolicyConfigurations")
    @Expose
    public GroupPolicyConfigurationCollectionPage groupPolicyConfigurations;

    /**
     * The Group Policy Definition Files.
     * The available group policy definition files for this account.
     */
    @SerializedName("groupPolicyDefinitionFiles")
    @Expose
    public GroupPolicyDefinitionFileCollectionPage groupPolicyDefinitionFiles;

    /**
     * The Group Policy Definitions.
     * The available group policy definitions for this account.
     */
    @SerializedName("groupPolicyDefinitions")
    @Expose
    public GroupPolicyDefinitionCollectionPage groupPolicyDefinitions;

    /**
     * The Group Policy Uploaded Definition Files.
     * The available group policy uploaded definition files for this account.
     */
    @SerializedName("groupPolicyUploadedDefinitionFiles")
    @Expose
    public GroupPolicyUploadedDefinitionFileCollectionPage groupPolicyUploadedDefinitionFiles;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName("notificationMessageTemplates")
    @Expose
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Domain Join Connectors.
     * A list of connector objects.
     */
    @SerializedName("domainJoinConnectors")
    @Expose
    public DeviceManagementDomainJoinConnectorCollectionPage domainJoinConnectors;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName("resourceOperations")
    @Expose
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName("roleAssignments")
    @Expose
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName("roleDefinitions")
    @Expose
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Scope Tags.
     * The Role Scope Tags.
     */
    @SerializedName("roleScopeTags")
    @Expose
    public RoleScopeTagCollectionPage roleScopeTags;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName("remoteAssistancePartners")
    @Expose
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Reports.
     * Reports singleton
     */
    @SerializedName("reports")
    @Expose
    public DeviceManagementReports reports;

    /**
     * The Embedded SIMActivation Code Pools.
     * The embedded SIM activation code pools created by this account.
     */
    @SerializedName("embeddedSIMActivationCodePools")
    @Expose
    public EmbeddedSIMActivationCodePoolCollectionPage embeddedSIMActivationCodePools;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName("telecomExpenseManagementPartners")
    @Expose
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Autopilot Events.
     * The list of autopilot events for the tenant.
     */
    @SerializedName("autopilotEvents")
    @Expose
    public DeviceManagementAutopilotEventCollectionPage autopilotEvents;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName("troubleshootingEvents")
    @Expose
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Feature Update Profiles.
     * A collection of windows feature update profiles
     */
    @SerializedName("windowsFeatureUpdateProfiles")
    @Expose
    public WindowsFeatureUpdateProfileCollectionPage windowsFeatureUpdateProfiles;

    /**
     * The Intune Branding Profiles.
     * Intune branding profiles targeted to AAD groups
     */
    @SerializedName("intuneBrandingProfiles")
    @Expose
    public IntuneBrandingProfileCollectionPage intuneBrandingProfiles;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName("windowsInformationProtectionAppLearningSummaries")
    @Expose
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName("windowsInformationProtectionNetworkLearningSummaries")
    @Expose
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;

    /**
     * The User Pfx Certificates.
     * Collection of PFX certificates associated with a user.
     */
    @SerializedName("userPfxCertificates")
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


        if (json.has("auditEvents")) {
            final AuditEventCollectionResponse response = new AuditEventCollectionResponse();
            if (json.has("auditEvents@odata.nextLink")) {
                response.nextLink = json.get("auditEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("auditEvents").toString(), JsonObject[].class);
            final AuditEvent[] array = new AuditEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AuditEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            auditEvents = new AuditEventCollectionPage(response, null);
        }

        if (json.has("androidDeviceOwnerEnrollmentProfiles")) {
            final AndroidDeviceOwnerEnrollmentProfileCollectionResponse response = new AndroidDeviceOwnerEnrollmentProfileCollectionResponse();
            if (json.has("androidDeviceOwnerEnrollmentProfiles@odata.nextLink")) {
                response.nextLink = json.get("androidDeviceOwnerEnrollmentProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("androidDeviceOwnerEnrollmentProfiles").toString(), JsonObject[].class);
            final AndroidDeviceOwnerEnrollmentProfile[] array = new AndroidDeviceOwnerEnrollmentProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AndroidDeviceOwnerEnrollmentProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            androidDeviceOwnerEnrollmentProfiles = new AndroidDeviceOwnerEnrollmentProfileCollectionPage(response, null);
        }

        if (json.has("androidForWorkAppConfigurationSchemas")) {
            final AndroidForWorkAppConfigurationSchemaCollectionResponse response = new AndroidForWorkAppConfigurationSchemaCollectionResponse();
            if (json.has("androidForWorkAppConfigurationSchemas@odata.nextLink")) {
                response.nextLink = json.get("androidForWorkAppConfigurationSchemas@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("androidForWorkAppConfigurationSchemas").toString(), JsonObject[].class);
            final AndroidForWorkAppConfigurationSchema[] array = new AndroidForWorkAppConfigurationSchema[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AndroidForWorkAppConfigurationSchema.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            androidForWorkAppConfigurationSchemas = new AndroidForWorkAppConfigurationSchemaCollectionPage(response, null);
        }

        if (json.has("androidForWorkEnrollmentProfiles")) {
            final AndroidForWorkEnrollmentProfileCollectionResponse response = new AndroidForWorkEnrollmentProfileCollectionResponse();
            if (json.has("androidForWorkEnrollmentProfiles@odata.nextLink")) {
                response.nextLink = json.get("androidForWorkEnrollmentProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("androidForWorkEnrollmentProfiles").toString(), JsonObject[].class);
            final AndroidForWorkEnrollmentProfile[] array = new AndroidForWorkEnrollmentProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AndroidForWorkEnrollmentProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            androidForWorkEnrollmentProfiles = new AndroidForWorkEnrollmentProfileCollectionPage(response, null);
        }

        if (json.has("androidManagedStoreAppConfigurationSchemas")) {
            final AndroidManagedStoreAppConfigurationSchemaCollectionResponse response = new AndroidManagedStoreAppConfigurationSchemaCollectionResponse();
            if (json.has("androidManagedStoreAppConfigurationSchemas@odata.nextLink")) {
                response.nextLink = json.get("androidManagedStoreAppConfigurationSchemas@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("androidManagedStoreAppConfigurationSchemas").toString(), JsonObject[].class);
            final AndroidManagedStoreAppConfigurationSchema[] array = new AndroidManagedStoreAppConfigurationSchema[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AndroidManagedStoreAppConfigurationSchema.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            androidManagedStoreAppConfigurationSchemas = new AndroidManagedStoreAppConfigurationSchemaCollectionPage(response, null);
        }

        if (json.has("assignmentFilters")) {
            final DeviceAndAppManagementAssignmentFilterCollectionResponse response = new DeviceAndAppManagementAssignmentFilterCollectionResponse();
            if (json.has("assignmentFilters@odata.nextLink")) {
                response.nextLink = json.get("assignmentFilters@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignmentFilters").toString(), JsonObject[].class);
            final DeviceAndAppManagementAssignmentFilter[] array = new DeviceAndAppManagementAssignmentFilter[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceAndAppManagementAssignmentFilter.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignmentFilters = new DeviceAndAppManagementAssignmentFilterCollectionPage(response, null);
        }

        if (json.has("termsAndConditions")) {
            final TermsAndConditionsCollectionResponse response = new TermsAndConditionsCollectionResponse();
            if (json.has("termsAndConditions@odata.nextLink")) {
                response.nextLink = json.get("termsAndConditions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("termsAndConditions").toString(), JsonObject[].class);
            final TermsAndConditions[] array = new TermsAndConditions[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TermsAndConditions.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            termsAndConditions = new TermsAndConditionsCollectionPage(response, null);
        }

        if (json.has("cartToClassAssociations")) {
            final CartToClassAssociationCollectionResponse response = new CartToClassAssociationCollectionResponse();
            if (json.has("cartToClassAssociations@odata.nextLink")) {
                response.nextLink = json.get("cartToClassAssociations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("cartToClassAssociations").toString(), JsonObject[].class);
            final CartToClassAssociation[] array = new CartToClassAssociation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CartToClassAssociation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            cartToClassAssociations = new CartToClassAssociationCollectionPage(response, null);
        }

        if (json.has("deviceCompliancePolicies")) {
            final DeviceCompliancePolicyCollectionResponse response = new DeviceCompliancePolicyCollectionResponse();
            if (json.has("deviceCompliancePolicies@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicies").toString(), JsonObject[].class);
            final DeviceCompliancePolicy[] array = new DeviceCompliancePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicies = new DeviceCompliancePolicyCollectionPage(response, null);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            final DeviceCompliancePolicySettingStateSummaryCollectionResponse response = new DeviceCompliancePolicySettingStateSummaryCollectionResponse();
            if (json.has("deviceCompliancePolicySettingStateSummaries@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicySettingStateSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries").toString(), JsonObject[].class);
            final DeviceCompliancePolicySettingStateSummary[] array = new DeviceCompliancePolicySettingStateSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicySettingStateSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicySettingStateSummaries = new DeviceCompliancePolicySettingStateSummaryCollectionPage(response, null);
        }

        if (json.has("deviceConfigurationConflictSummary")) {
            final DeviceConfigurationConflictSummaryCollectionResponse response = new DeviceConfigurationConflictSummaryCollectionResponse();
            if (json.has("deviceConfigurationConflictSummary@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurationConflictSummary@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurationConflictSummary").toString(), JsonObject[].class);
            final DeviceConfigurationConflictSummary[] array = new DeviceConfigurationConflictSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfigurationConflictSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurationConflictSummary = new DeviceConfigurationConflictSummaryCollectionPage(response, null);
        }

        if (json.has("deviceConfigurationRestrictedAppsViolations")) {
            final RestrictedAppsViolationCollectionResponse response = new RestrictedAppsViolationCollectionResponse();
            if (json.has("deviceConfigurationRestrictedAppsViolations@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurationRestrictedAppsViolations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurationRestrictedAppsViolations").toString(), JsonObject[].class);
            final RestrictedAppsViolation[] array = new RestrictedAppsViolation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RestrictedAppsViolation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurationRestrictedAppsViolations = new RestrictedAppsViolationCollectionPage(response, null);
        }

        if (json.has("deviceConfigurations")) {
            final DeviceConfigurationCollectionResponse response = new DeviceConfigurationCollectionResponse();
            if (json.has("deviceConfigurations@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurations").toString(), JsonObject[].class);
            final DeviceConfiguration[] array = new DeviceConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurations = new DeviceConfigurationCollectionPage(response, null);
        }

        if (json.has("deviceConfigurationsAllManagedDeviceCertificateStates")) {
            final ManagedAllDeviceCertificateStateCollectionResponse response = new ManagedAllDeviceCertificateStateCollectionResponse();
            if (json.has("deviceConfigurationsAllManagedDeviceCertificateStates@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurationsAllManagedDeviceCertificateStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurationsAllManagedDeviceCertificateStates").toString(), JsonObject[].class);
            final ManagedAllDeviceCertificateState[] array = new ManagedAllDeviceCertificateState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAllDeviceCertificateState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurationsAllManagedDeviceCertificateStates = new ManagedAllDeviceCertificateStateCollectionPage(response, null);
        }

        if (json.has("iosUpdateStatuses")) {
            final IosUpdateDeviceStatusCollectionResponse response = new IosUpdateDeviceStatusCollectionResponse();
            if (json.has("iosUpdateStatuses@odata.nextLink")) {
                response.nextLink = json.get("iosUpdateStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("iosUpdateStatuses").toString(), JsonObject[].class);
            final IosUpdateDeviceStatus[] array = new IosUpdateDeviceStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), IosUpdateDeviceStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            iosUpdateStatuses = new IosUpdateDeviceStatusCollectionPage(response, null);
        }

        if (json.has("managedDeviceEncryptionStates")) {
            final ManagedDeviceEncryptionStateCollectionResponse response = new ManagedDeviceEncryptionStateCollectionResponse();
            if (json.has("managedDeviceEncryptionStates@odata.nextLink")) {
                response.nextLink = json.get("managedDeviceEncryptionStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDeviceEncryptionStates").toString(), JsonObject[].class);
            final ManagedDeviceEncryptionState[] array = new ManagedDeviceEncryptionState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceEncryptionState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDeviceEncryptionStates = new ManagedDeviceEncryptionStateCollectionPage(response, null);
        }

        if (json.has("ndesConnectors")) {
            final NdesConnectorCollectionResponse response = new NdesConnectorCollectionResponse();
            if (json.has("ndesConnectors@odata.nextLink")) {
                response.nextLink = json.get("ndesConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ndesConnectors").toString(), JsonObject[].class);
            final NdesConnector[] array = new NdesConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), NdesConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ndesConnectors = new NdesConnectorCollectionPage(response, null);
        }

        if (json.has("complianceManagementPartners")) {
            final ComplianceManagementPartnerCollectionResponse response = new ComplianceManagementPartnerCollectionResponse();
            if (json.has("complianceManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("complianceManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("complianceManagementPartners").toString(), JsonObject[].class);
            final ComplianceManagementPartner[] array = new ComplianceManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ComplianceManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            complianceManagementPartners = new ComplianceManagementPartnerCollectionPage(response, null);
        }

        if (json.has("deviceCategories")) {
            final DeviceCategoryCollectionResponse response = new DeviceCategoryCollectionResponse();
            if (json.has("deviceCategories@odata.nextLink")) {
                response.nextLink = json.get("deviceCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCategories").toString(), JsonObject[].class);
            final DeviceCategory[] array = new DeviceCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCategories = new DeviceCategoryCollectionPage(response, null);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            final DeviceEnrollmentConfigurationCollectionResponse response = new DeviceEnrollmentConfigurationCollectionResponse();
            if (json.has("deviceEnrollmentConfigurations@odata.nextLink")) {
                response.nextLink = json.get("deviceEnrollmentConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations").toString(), JsonObject[].class);
            final DeviceEnrollmentConfiguration[] array = new DeviceEnrollmentConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceEnrollmentConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceEnrollmentConfigurations = new DeviceEnrollmentConfigurationCollectionPage(response, null);
        }

        if (json.has("deviceManagementPartners")) {
            final DeviceManagementPartnerCollectionResponse response = new DeviceManagementPartnerCollectionResponse();
            if (json.has("deviceManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("deviceManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceManagementPartners").toString(), JsonObject[].class);
            final DeviceManagementPartner[] array = new DeviceManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceManagementPartners = new DeviceManagementPartnerCollectionPage(response, null);
        }

        if (json.has("exchangeConnectors")) {
            final DeviceManagementExchangeConnectorCollectionResponse response = new DeviceManagementExchangeConnectorCollectionResponse();
            if (json.has("exchangeConnectors@odata.nextLink")) {
                response.nextLink = json.get("exchangeConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("exchangeConnectors").toString(), JsonObject[].class);
            final DeviceManagementExchangeConnector[] array = new DeviceManagementExchangeConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementExchangeConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            exchangeConnectors = new DeviceManagementExchangeConnectorCollectionPage(response, null);
        }

        if (json.has("exchangeOnPremisesPolicies")) {
            final DeviceManagementExchangeOnPremisesPolicyCollectionResponse response = new DeviceManagementExchangeOnPremisesPolicyCollectionResponse();
            if (json.has("exchangeOnPremisesPolicies@odata.nextLink")) {
                response.nextLink = json.get("exchangeOnPremisesPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("exchangeOnPremisesPolicies").toString(), JsonObject[].class);
            final DeviceManagementExchangeOnPremisesPolicy[] array = new DeviceManagementExchangeOnPremisesPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementExchangeOnPremisesPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            exchangeOnPremisesPolicies = new DeviceManagementExchangeOnPremisesPolicyCollectionPage(response, null);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            final MobileThreatDefenseConnectorCollectionResponse response = new MobileThreatDefenseConnectorCollectionResponse();
            if (json.has("mobileThreatDefenseConnectors@odata.nextLink")) {
                response.nextLink = json.get("mobileThreatDefenseConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors").toString(), JsonObject[].class);
            final MobileThreatDefenseConnector[] array = new MobileThreatDefenseConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileThreatDefenseConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileThreatDefenseConnectors = new MobileThreatDefenseConnectorCollectionPage(response, null);
        }

        if (json.has("categories")) {
            final DeviceManagementSettingCategoryCollectionResponse response = new DeviceManagementSettingCategoryCollectionResponse();
            if (json.has("categories@odata.nextLink")) {
                response.nextLink = json.get("categories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("categories").toString(), JsonObject[].class);
            final DeviceManagementSettingCategory[] array = new DeviceManagementSettingCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementSettingCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            categories = new DeviceManagementSettingCategoryCollectionPage(response, null);
        }

        if (json.has("intents")) {
            final DeviceManagementIntentCollectionResponse response = new DeviceManagementIntentCollectionResponse();
            if (json.has("intents@odata.nextLink")) {
                response.nextLink = json.get("intents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("intents").toString(), JsonObject[].class);
            final DeviceManagementIntent[] array = new DeviceManagementIntent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementIntent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            intents = new DeviceManagementIntentCollectionPage(response, null);
        }

        if (json.has("settingDefinitions")) {
            final DeviceManagementSettingDefinitionCollectionResponse response = new DeviceManagementSettingDefinitionCollectionResponse();
            if (json.has("settingDefinitions@odata.nextLink")) {
                response.nextLink = json.get("settingDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settingDefinitions").toString(), JsonObject[].class);
            final DeviceManagementSettingDefinition[] array = new DeviceManagementSettingDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementSettingDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settingDefinitions = new DeviceManagementSettingDefinitionCollectionPage(response, null);
        }

        if (json.has("templates")) {
            final DeviceManagementTemplateCollectionResponse response = new DeviceManagementTemplateCollectionResponse();
            if (json.has("templates@odata.nextLink")) {
                response.nextLink = json.get("templates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("templates").toString(), JsonObject[].class);
            final DeviceManagementTemplate[] array = new DeviceManagementTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            templates = new DeviceManagementTemplateCollectionPage(response, null);
        }

        if (json.has("comanagedDevices")) {
            final ManagedDeviceCollectionResponse response = new ManagedDeviceCollectionResponse();
            if (json.has("comanagedDevices@odata.nextLink")) {
                response.nextLink = json.get("comanagedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("comanagedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            comanagedDevices = new ManagedDeviceCollectionPage(response, null);
        }

        if (json.has("comanagementEligibleDevices")) {
            final ComanagementEligibleDeviceCollectionResponse response = new ComanagementEligibleDeviceCollectionResponse();
            if (json.has("comanagementEligibleDevices@odata.nextLink")) {
                response.nextLink = json.get("comanagementEligibleDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("comanagementEligibleDevices").toString(), JsonObject[].class);
            final ComanagementEligibleDevice[] array = new ComanagementEligibleDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ComanagementEligibleDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            comanagementEligibleDevices = new ComanagementEligibleDeviceCollectionPage(response, null);
        }

        if (json.has("dataSharingConsents")) {
            final DataSharingConsentCollectionResponse response = new DataSharingConsentCollectionResponse();
            if (json.has("dataSharingConsents@odata.nextLink")) {
                response.nextLink = json.get("dataSharingConsents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("dataSharingConsents").toString(), JsonObject[].class);
            final DataSharingConsent[] array = new DataSharingConsent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DataSharingConsent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            dataSharingConsents = new DataSharingConsentCollectionPage(response, null);
        }

        if (json.has("detectedApps")) {
            final DetectedAppCollectionResponse response = new DetectedAppCollectionResponse();
            if (json.has("detectedApps@odata.nextLink")) {
                response.nextLink = json.get("detectedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("detectedApps").toString(), JsonObject[].class);
            final DetectedApp[] array = new DetectedApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DetectedApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            detectedApps = new DetectedAppCollectionPage(response, null);
        }

        if (json.has("deviceComplianceScripts")) {
            final DeviceComplianceScriptCollectionResponse response = new DeviceComplianceScriptCollectionResponse();
            if (json.has("deviceComplianceScripts@odata.nextLink")) {
                response.nextLink = json.get("deviceComplianceScripts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceComplianceScripts").toString(), JsonObject[].class);
            final DeviceComplianceScript[] array = new DeviceComplianceScript[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceComplianceScript.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceComplianceScripts = new DeviceComplianceScriptCollectionPage(response, null);
        }

        if (json.has("deviceHealthScripts")) {
            final DeviceHealthScriptCollectionResponse response = new DeviceHealthScriptCollectionResponse();
            if (json.has("deviceHealthScripts@odata.nextLink")) {
                response.nextLink = json.get("deviceHealthScripts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceHealthScripts").toString(), JsonObject[].class);
            final DeviceHealthScript[] array = new DeviceHealthScript[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceHealthScript.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceHealthScripts = new DeviceHealthScriptCollectionPage(response, null);
        }

        if (json.has("deviceManagementScripts")) {
            final DeviceManagementScriptCollectionResponse response = new DeviceManagementScriptCollectionResponse();
            if (json.has("deviceManagementScripts@odata.nextLink")) {
                response.nextLink = json.get("deviceManagementScripts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceManagementScripts").toString(), JsonObject[].class);
            final DeviceManagementScript[] array = new DeviceManagementScript[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementScript.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceManagementScripts = new DeviceManagementScriptCollectionPage(response, null);
        }

        if (json.has("deviceShellScripts")) {
            final DeviceShellScriptCollectionResponse response = new DeviceShellScriptCollectionResponse();
            if (json.has("deviceShellScripts@odata.nextLink")) {
                response.nextLink = json.get("deviceShellScripts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceShellScripts").toString(), JsonObject[].class);
            final DeviceShellScript[] array = new DeviceShellScript[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceShellScript.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceShellScripts = new DeviceShellScriptCollectionPage(response, null);
        }

        if (json.has("managedDevices")) {
            final ManagedDeviceCollectionResponse response = new ManagedDeviceCollectionResponse();
            if (json.has("managedDevices@odata.nextLink")) {
                response.nextLink = json.get("managedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDevices = new ManagedDeviceCollectionPage(response, null);
        }

        if (json.has("mobileAppTroubleshootingEvents")) {
            final MobileAppTroubleshootingEventCollectionResponse response = new MobileAppTroubleshootingEventCollectionResponse();
            if (json.has("mobileAppTroubleshootingEvents@odata.nextLink")) {
                response.nextLink = json.get("mobileAppTroubleshootingEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileAppTroubleshootingEvents").toString(), JsonObject[].class);
            final MobileAppTroubleshootingEvent[] array = new MobileAppTroubleshootingEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppTroubleshootingEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileAppTroubleshootingEvents = new MobileAppTroubleshootingEventCollectionPage(response, null);
        }

        if (json.has("remoteActionAudits")) {
            final RemoteActionAuditCollectionResponse response = new RemoteActionAuditCollectionResponse();
            if (json.has("remoteActionAudits@odata.nextLink")) {
                response.nextLink = json.get("remoteActionAudits@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("remoteActionAudits").toString(), JsonObject[].class);
            final RemoteActionAudit[] array = new RemoteActionAudit[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RemoteActionAudit.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            remoteActionAudits = new RemoteActionAuditCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformance")) {
            final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse response = new UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse();
            if (json.has("userExperienceAnalyticsAppHealthApplicationPerformance@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsAppHealthApplicationPerformance@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformance").toString(), JsonObject[].class);
            final UserExperienceAnalyticsAppHealthApplicationPerformance[] array = new UserExperienceAnalyticsAppHealthApplicationPerformance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsAppHealthApplicationPerformance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsAppHealthApplicationPerformance = new UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsBaselines")) {
            final UserExperienceAnalyticsBaselineCollectionResponse response = new UserExperienceAnalyticsBaselineCollectionResponse();
            if (json.has("userExperienceAnalyticsBaselines@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsBaselines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsBaselines").toString(), JsonObject[].class);
            final UserExperienceAnalyticsBaseline[] array = new UserExperienceAnalyticsBaseline[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsBaseline.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsBaselines = new UserExperienceAnalyticsBaselineCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsCategories")) {
            final UserExperienceAnalyticsCategoryCollectionResponse response = new UserExperienceAnalyticsCategoryCollectionResponse();
            if (json.has("userExperienceAnalyticsCategories@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsCategories").toString(), JsonObject[].class);
            final UserExperienceAnalyticsCategory[] array = new UserExperienceAnalyticsCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsCategories = new UserExperienceAnalyticsCategoryCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsDevicePerformance")) {
            final UserExperienceAnalyticsDevicePerformanceCollectionResponse response = new UserExperienceAnalyticsDevicePerformanceCollectionResponse();
            if (json.has("userExperienceAnalyticsDevicePerformance@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsDevicePerformance@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicePerformance").toString(), JsonObject[].class);
            final UserExperienceAnalyticsDevicePerformance[] array = new UserExperienceAnalyticsDevicePerformance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsDevicePerformance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsDevicePerformance = new UserExperienceAnalyticsDevicePerformanceCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupHistory")) {
            final UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse response = new UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse();
            if (json.has("userExperienceAnalyticsDeviceStartupHistory@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsDeviceStartupHistory@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupHistory").toString(), JsonObject[].class);
            final UserExperienceAnalyticsDeviceStartupHistory[] array = new UserExperienceAnalyticsDeviceStartupHistory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsDeviceStartupHistory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsDeviceStartupHistory = new UserExperienceAnalyticsDeviceStartupHistoryCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcesses")) {
            final UserExperienceAnalyticsDeviceStartupProcessCollectionResponse response = new UserExperienceAnalyticsDeviceStartupProcessCollectionResponse();
            if (json.has("userExperienceAnalyticsDeviceStartupProcesses@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsDeviceStartupProcesses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcesses").toString(), JsonObject[].class);
            final UserExperienceAnalyticsDeviceStartupProcess[] array = new UserExperienceAnalyticsDeviceStartupProcess[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsDeviceStartupProcess.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsDeviceStartupProcesses = new UserExperienceAnalyticsDeviceStartupProcessCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcessPerformance")) {
            final UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse response = new UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse();
            if (json.has("userExperienceAnalyticsDeviceStartupProcessPerformance@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsDeviceStartupProcessPerformance@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcessPerformance").toString(), JsonObject[].class);
            final UserExperienceAnalyticsDeviceStartupProcessPerformance[] array = new UserExperienceAnalyticsDeviceStartupProcessPerformance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsDeviceStartupProcessPerformance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsDeviceStartupProcessPerformance = new UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsMetricHistory")) {
            final UserExperienceAnalyticsMetricHistoryCollectionResponse response = new UserExperienceAnalyticsMetricHistoryCollectionResponse();
            if (json.has("userExperienceAnalyticsMetricHistory@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsMetricHistory@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsMetricHistory").toString(), JsonObject[].class);
            final UserExperienceAnalyticsMetricHistory[] array = new UserExperienceAnalyticsMetricHistory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsMetricHistory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsMetricHistory = new UserExperienceAnalyticsMetricHistoryCollectionPage(response, null);
        }

        if (json.has("userExperienceAnalyticsScoreHistory")) {
            final UserExperienceAnalyticsScoreHistoryCollectionResponse response = new UserExperienceAnalyticsScoreHistoryCollectionResponse();
            if (json.has("userExperienceAnalyticsScoreHistory@odata.nextLink")) {
                response.nextLink = json.get("userExperienceAnalyticsScoreHistory@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userExperienceAnalyticsScoreHistory").toString(), JsonObject[].class);
            final UserExperienceAnalyticsScoreHistory[] array = new UserExperienceAnalyticsScoreHistory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserExperienceAnalyticsScoreHistory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userExperienceAnalyticsScoreHistory = new UserExperienceAnalyticsScoreHistoryCollectionPage(response, null);
        }

        if (json.has("windowsMalwareInformation")) {
            final WindowsMalwareInformationCollectionResponse response = new WindowsMalwareInformationCollectionResponse();
            if (json.has("windowsMalwareInformation@odata.nextLink")) {
                response.nextLink = json.get("windowsMalwareInformation@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsMalwareInformation").toString(), JsonObject[].class);
            final WindowsMalwareInformation[] array = new WindowsMalwareInformation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsMalwareInformation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsMalwareInformation = new WindowsMalwareInformationCollectionPage(response, null);
        }

        if (json.has("derivedCredentials")) {
            final DeviceManagementDerivedCredentialSettingsCollectionResponse response = new DeviceManagementDerivedCredentialSettingsCollectionResponse();
            if (json.has("derivedCredentials@odata.nextLink")) {
                response.nextLink = json.get("derivedCredentials@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("derivedCredentials").toString(), JsonObject[].class);
            final DeviceManagementDerivedCredentialSettings[] array = new DeviceManagementDerivedCredentialSettings[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementDerivedCredentialSettings.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            derivedCredentials = new DeviceManagementDerivedCredentialSettingsCollectionPage(response, null);
        }

        if (json.has("appleUserInitiatedEnrollmentProfiles")) {
            final AppleUserInitiatedEnrollmentProfileCollectionResponse response = new AppleUserInitiatedEnrollmentProfileCollectionResponse();
            if (json.has("appleUserInitiatedEnrollmentProfiles@odata.nextLink")) {
                response.nextLink = json.get("appleUserInitiatedEnrollmentProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appleUserInitiatedEnrollmentProfiles").toString(), JsonObject[].class);
            final AppleUserInitiatedEnrollmentProfile[] array = new AppleUserInitiatedEnrollmentProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppleUserInitiatedEnrollmentProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appleUserInitiatedEnrollmentProfiles = new AppleUserInitiatedEnrollmentProfileCollectionPage(response, null);
        }

        if (json.has("depOnboardingSettings")) {
            final DepOnboardingSettingCollectionResponse response = new DepOnboardingSettingCollectionResponse();
            if (json.has("depOnboardingSettings@odata.nextLink")) {
                response.nextLink = json.get("depOnboardingSettings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("depOnboardingSettings").toString(), JsonObject[].class);
            final DepOnboardingSetting[] array = new DepOnboardingSetting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DepOnboardingSetting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            depOnboardingSettings = new DepOnboardingSettingCollectionPage(response, null);
        }

        if (json.has("importedDeviceIdentities")) {
            final ImportedDeviceIdentityCollectionResponse response = new ImportedDeviceIdentityCollectionResponse();
            if (json.has("importedDeviceIdentities@odata.nextLink")) {
                response.nextLink = json.get("importedDeviceIdentities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("importedDeviceIdentities").toString(), JsonObject[].class);
            final ImportedDeviceIdentity[] array = new ImportedDeviceIdentity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ImportedDeviceIdentity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            importedDeviceIdentities = new ImportedDeviceIdentityCollectionPage(response, null);
        }

        if (json.has("importedWindowsAutopilotDeviceIdentities")) {
            final ImportedWindowsAutopilotDeviceIdentityCollectionResponse response = new ImportedWindowsAutopilotDeviceIdentityCollectionResponse();
            if (json.has("importedWindowsAutopilotDeviceIdentities@odata.nextLink")) {
                response.nextLink = json.get("importedWindowsAutopilotDeviceIdentities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("importedWindowsAutopilotDeviceIdentities").toString(), JsonObject[].class);
            final ImportedWindowsAutopilotDeviceIdentity[] array = new ImportedWindowsAutopilotDeviceIdentity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ImportedWindowsAutopilotDeviceIdentity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            importedWindowsAutopilotDeviceIdentities = new ImportedWindowsAutopilotDeviceIdentityCollectionPage(response, null);
        }

        if (json.has("windowsAutopilotDeploymentProfiles")) {
            final WindowsAutopilotDeploymentProfileCollectionResponse response = new WindowsAutopilotDeploymentProfileCollectionResponse();
            if (json.has("windowsAutopilotDeploymentProfiles@odata.nextLink")) {
                response.nextLink = json.get("windowsAutopilotDeploymentProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsAutopilotDeploymentProfiles").toString(), JsonObject[].class);
            final WindowsAutopilotDeploymentProfile[] array = new WindowsAutopilotDeploymentProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsAutopilotDeploymentProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsAutopilotDeploymentProfiles = new WindowsAutopilotDeploymentProfileCollectionPage(response, null);
        }

        if (json.has("windowsAutopilotDeviceIdentities")) {
            final WindowsAutopilotDeviceIdentityCollectionResponse response = new WindowsAutopilotDeviceIdentityCollectionResponse();
            if (json.has("windowsAutopilotDeviceIdentities@odata.nextLink")) {
                response.nextLink = json.get("windowsAutopilotDeviceIdentities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsAutopilotDeviceIdentities").toString(), JsonObject[].class);
            final WindowsAutopilotDeviceIdentity[] array = new WindowsAutopilotDeviceIdentity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsAutopilotDeviceIdentity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsAutopilotDeviceIdentities = new WindowsAutopilotDeviceIdentityCollectionPage(response, null);
        }

        if (json.has("managementConditions")) {
            final ManagementConditionCollectionResponse response = new ManagementConditionCollectionResponse();
            if (json.has("managementConditions@odata.nextLink")) {
                response.nextLink = json.get("managementConditions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managementConditions").toString(), JsonObject[].class);
            final ManagementCondition[] array = new ManagementCondition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagementCondition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managementConditions = new ManagementConditionCollectionPage(response, null);
        }

        if (json.has("managementConditionStatements")) {
            final ManagementConditionStatementCollectionResponse response = new ManagementConditionStatementCollectionResponse();
            if (json.has("managementConditionStatements@odata.nextLink")) {
                response.nextLink = json.get("managementConditionStatements@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managementConditionStatements").toString(), JsonObject[].class);
            final ManagementConditionStatement[] array = new ManagementConditionStatement[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagementConditionStatement.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managementConditionStatements = new ManagementConditionStatementCollectionPage(response, null);
        }

        if (json.has("groupPolicyMigrationReports")) {
            final GroupPolicyMigrationReportCollectionResponse response = new GroupPolicyMigrationReportCollectionResponse();
            if (json.has("groupPolicyMigrationReports@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyMigrationReports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyMigrationReports").toString(), JsonObject[].class);
            final GroupPolicyMigrationReport[] array = new GroupPolicyMigrationReport[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyMigrationReport.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyMigrationReports = new GroupPolicyMigrationReportCollectionPage(response, null);
        }

        if (json.has("groupPolicyObjectFiles")) {
            final GroupPolicyObjectFileCollectionResponse response = new GroupPolicyObjectFileCollectionResponse();
            if (json.has("groupPolicyObjectFiles@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyObjectFiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyObjectFiles").toString(), JsonObject[].class);
            final GroupPolicyObjectFile[] array = new GroupPolicyObjectFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyObjectFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyObjectFiles = new GroupPolicyObjectFileCollectionPage(response, null);
        }

        if (json.has("groupPolicyCategories")) {
            final GroupPolicyCategoryCollectionResponse response = new GroupPolicyCategoryCollectionResponse();
            if (json.has("groupPolicyCategories@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyCategories").toString(), JsonObject[].class);
            final GroupPolicyCategory[] array = new GroupPolicyCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyCategories = new GroupPolicyCategoryCollectionPage(response, null);
        }

        if (json.has("groupPolicyConfigurations")) {
            final GroupPolicyConfigurationCollectionResponse response = new GroupPolicyConfigurationCollectionResponse();
            if (json.has("groupPolicyConfigurations@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyConfigurations").toString(), JsonObject[].class);
            final GroupPolicyConfiguration[] array = new GroupPolicyConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyConfigurations = new GroupPolicyConfigurationCollectionPage(response, null);
        }

        if (json.has("groupPolicyDefinitionFiles")) {
            final GroupPolicyDefinitionFileCollectionResponse response = new GroupPolicyDefinitionFileCollectionResponse();
            if (json.has("groupPolicyDefinitionFiles@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyDefinitionFiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyDefinitionFiles").toString(), JsonObject[].class);
            final GroupPolicyDefinitionFile[] array = new GroupPolicyDefinitionFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyDefinitionFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyDefinitionFiles = new GroupPolicyDefinitionFileCollectionPage(response, null);
        }

        if (json.has("groupPolicyDefinitions")) {
            final GroupPolicyDefinitionCollectionResponse response = new GroupPolicyDefinitionCollectionResponse();
            if (json.has("groupPolicyDefinitions@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyDefinitions").toString(), JsonObject[].class);
            final GroupPolicyDefinition[] array = new GroupPolicyDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyDefinitions = new GroupPolicyDefinitionCollectionPage(response, null);
        }

        if (json.has("groupPolicyUploadedDefinitionFiles")) {
            final GroupPolicyUploadedDefinitionFileCollectionResponse response = new GroupPolicyUploadedDefinitionFileCollectionResponse();
            if (json.has("groupPolicyUploadedDefinitionFiles@odata.nextLink")) {
                response.nextLink = json.get("groupPolicyUploadedDefinitionFiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupPolicyUploadedDefinitionFiles").toString(), JsonObject[].class);
            final GroupPolicyUploadedDefinitionFile[] array = new GroupPolicyUploadedDefinitionFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyUploadedDefinitionFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupPolicyUploadedDefinitionFiles = new GroupPolicyUploadedDefinitionFileCollectionPage(response, null);
        }

        if (json.has("notificationMessageTemplates")) {
            final NotificationMessageTemplateCollectionResponse response = new NotificationMessageTemplateCollectionResponse();
            if (json.has("notificationMessageTemplates@odata.nextLink")) {
                response.nextLink = json.get("notificationMessageTemplates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("notificationMessageTemplates").toString(), JsonObject[].class);
            final NotificationMessageTemplate[] array = new NotificationMessageTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), NotificationMessageTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            notificationMessageTemplates = new NotificationMessageTemplateCollectionPage(response, null);
        }

        if (json.has("domainJoinConnectors")) {
            final DeviceManagementDomainJoinConnectorCollectionResponse response = new DeviceManagementDomainJoinConnectorCollectionResponse();
            if (json.has("domainJoinConnectors@odata.nextLink")) {
                response.nextLink = json.get("domainJoinConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("domainJoinConnectors").toString(), JsonObject[].class);
            final DeviceManagementDomainJoinConnector[] array = new DeviceManagementDomainJoinConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementDomainJoinConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            domainJoinConnectors = new DeviceManagementDomainJoinConnectorCollectionPage(response, null);
        }

        if (json.has("resourceOperations")) {
            final ResourceOperationCollectionResponse response = new ResourceOperationCollectionResponse();
            if (json.has("resourceOperations@odata.nextLink")) {
                response.nextLink = json.get("resourceOperations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("resourceOperations").toString(), JsonObject[].class);
            final ResourceOperation[] array = new ResourceOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ResourceOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            resourceOperations = new ResourceOperationCollectionPage(response, null);
        }

        if (json.has("roleAssignments")) {
            final DeviceAndAppManagementRoleAssignmentCollectionResponse response = new DeviceAndAppManagementRoleAssignmentCollectionResponse();
            if (json.has("roleAssignments@odata.nextLink")) {
                response.nextLink = json.get("roleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleAssignments").toString(), JsonObject[].class);
            final DeviceAndAppManagementRoleAssignment[] array = new DeviceAndAppManagementRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceAndAppManagementRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleAssignments = new DeviceAndAppManagementRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("roleDefinitions")) {
            final RoleDefinitionCollectionResponse response = new RoleDefinitionCollectionResponse();
            if (json.has("roleDefinitions@odata.nextLink")) {
                response.nextLink = json.get("roleDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleDefinitions").toString(), JsonObject[].class);
            final RoleDefinition[] array = new RoleDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleDefinitions = new RoleDefinitionCollectionPage(response, null);
        }

        if (json.has("roleScopeTags")) {
            final RoleScopeTagCollectionResponse response = new RoleScopeTagCollectionResponse();
            if (json.has("roleScopeTags@odata.nextLink")) {
                response.nextLink = json.get("roleScopeTags@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleScopeTags").toString(), JsonObject[].class);
            final RoleScopeTag[] array = new RoleScopeTag[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleScopeTag.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleScopeTags = new RoleScopeTagCollectionPage(response, null);
        }

        if (json.has("remoteAssistancePartners")) {
            final RemoteAssistancePartnerCollectionResponse response = new RemoteAssistancePartnerCollectionResponse();
            if (json.has("remoteAssistancePartners@odata.nextLink")) {
                response.nextLink = json.get("remoteAssistancePartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("remoteAssistancePartners").toString(), JsonObject[].class);
            final RemoteAssistancePartner[] array = new RemoteAssistancePartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RemoteAssistancePartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            remoteAssistancePartners = new RemoteAssistancePartnerCollectionPage(response, null);
        }

        if (json.has("embeddedSIMActivationCodePools")) {
            final EmbeddedSIMActivationCodePoolCollectionResponse response = new EmbeddedSIMActivationCodePoolCollectionResponse();
            if (json.has("embeddedSIMActivationCodePools@odata.nextLink")) {
                response.nextLink = json.get("embeddedSIMActivationCodePools@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("embeddedSIMActivationCodePools").toString(), JsonObject[].class);
            final EmbeddedSIMActivationCodePool[] array = new EmbeddedSIMActivationCodePool[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EmbeddedSIMActivationCodePool.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            embeddedSIMActivationCodePools = new EmbeddedSIMActivationCodePoolCollectionPage(response, null);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            final TelecomExpenseManagementPartnerCollectionResponse response = new TelecomExpenseManagementPartnerCollectionResponse();
            if (json.has("telecomExpenseManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("telecomExpenseManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("telecomExpenseManagementPartners").toString(), JsonObject[].class);
            final TelecomExpenseManagementPartner[] array = new TelecomExpenseManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TelecomExpenseManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            telecomExpenseManagementPartners = new TelecomExpenseManagementPartnerCollectionPage(response, null);
        }

        if (json.has("autopilotEvents")) {
            final DeviceManagementAutopilotEventCollectionResponse response = new DeviceManagementAutopilotEventCollectionResponse();
            if (json.has("autopilotEvents@odata.nextLink")) {
                response.nextLink = json.get("autopilotEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("autopilotEvents").toString(), JsonObject[].class);
            final DeviceManagementAutopilotEvent[] array = new DeviceManagementAutopilotEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementAutopilotEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            autopilotEvents = new DeviceManagementAutopilotEventCollectionPage(response, null);
        }

        if (json.has("troubleshootingEvents")) {
            final DeviceManagementTroubleshootingEventCollectionResponse response = new DeviceManagementTroubleshootingEventCollectionResponse();
            if (json.has("troubleshootingEvents@odata.nextLink")) {
                response.nextLink = json.get("troubleshootingEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("troubleshootingEvents").toString(), JsonObject[].class);
            final DeviceManagementTroubleshootingEvent[] array = new DeviceManagementTroubleshootingEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTroubleshootingEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            troubleshootingEvents = new DeviceManagementTroubleshootingEventCollectionPage(response, null);
        }

        if (json.has("windowsFeatureUpdateProfiles")) {
            final WindowsFeatureUpdateProfileCollectionResponse response = new WindowsFeatureUpdateProfileCollectionResponse();
            if (json.has("windowsFeatureUpdateProfiles@odata.nextLink")) {
                response.nextLink = json.get("windowsFeatureUpdateProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsFeatureUpdateProfiles").toString(), JsonObject[].class);
            final WindowsFeatureUpdateProfile[] array = new WindowsFeatureUpdateProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsFeatureUpdateProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsFeatureUpdateProfiles = new WindowsFeatureUpdateProfileCollectionPage(response, null);
        }

        if (json.has("intuneBrandingProfiles")) {
            final IntuneBrandingProfileCollectionResponse response = new IntuneBrandingProfileCollectionResponse();
            if (json.has("intuneBrandingProfiles@odata.nextLink")) {
                response.nextLink = json.get("intuneBrandingProfiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("intuneBrandingProfiles").toString(), JsonObject[].class);
            final IntuneBrandingProfile[] array = new IntuneBrandingProfile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), IntuneBrandingProfile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            intuneBrandingProfiles = new IntuneBrandingProfileCollectionPage(response, null);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            final WindowsInformationProtectionAppLearningSummaryCollectionResponse response = new WindowsInformationProtectionAppLearningSummaryCollectionResponse();
            if (json.has("windowsInformationProtectionAppLearningSummaries@odata.nextLink")) {
                response.nextLink = json.get("windowsInformationProtectionAppLearningSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries").toString(), JsonObject[].class);
            final WindowsInformationProtectionAppLearningSummary[] array = new WindowsInformationProtectionAppLearningSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionAppLearningSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsInformationProtectionAppLearningSummaries = new WindowsInformationProtectionAppLearningSummaryCollectionPage(response, null);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            final WindowsInformationProtectionNetworkLearningSummaryCollectionResponse response = new WindowsInformationProtectionNetworkLearningSummaryCollectionResponse();
            if (json.has("windowsInformationProtectionNetworkLearningSummaries@odata.nextLink")) {
                response.nextLink = json.get("windowsInformationProtectionNetworkLearningSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries").toString(), JsonObject[].class);
            final WindowsInformationProtectionNetworkLearningSummary[] array = new WindowsInformationProtectionNetworkLearningSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionNetworkLearningSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsInformationProtectionNetworkLearningSummaries = new WindowsInformationProtectionNetworkLearningSummaryCollectionPage(response, null);
        }

        if (json.has("userPfxCertificates")) {
            final UserPFXCertificateCollectionResponse response = new UserPFXCertificateCollectionResponse();
            if (json.has("userPfxCertificates@odata.nextLink")) {
                response.nextLink = json.get("userPfxCertificates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userPfxCertificates").toString(), JsonObject[].class);
            final UserPFXCertificate[] array = new UserPFXCertificate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserPFXCertificate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userPfxCertificates = new UserPFXCertificateCollectionPage(response, null);
        }
    }
}
