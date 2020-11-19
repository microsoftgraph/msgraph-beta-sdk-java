// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.models.extensions.ComanagedDevicesSummary;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevicesSummary;
import com.microsoft.graph.models.extensions.SuggestedEnrollmentLimit;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateAccountSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCustomAttributeShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCustomAttributeShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementResourceAccessProfileBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementResourceAccessProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IVirtualEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Request Builder.
 */
public interface IDeviceManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder androidDeviceOwnerEnrollmentProfiles();

    IAndroidDeviceOwnerEnrollmentProfileRequestBuilder androidDeviceOwnerEnrollmentProfiles(final String id);

    /**
     * Gets the request builder for VirtualEndpoint
     *
     * @return the IVirtualEndpointRequestBuilder instance
     */
    IVirtualEndpointRequestBuilder virtualEndpoint();

    IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder androidForWorkAppConfigurationSchemas();

    IAndroidForWorkAppConfigurationSchemaRequestBuilder androidForWorkAppConfigurationSchemas(final String id);

    IAndroidForWorkEnrollmentProfileCollectionRequestBuilder androidForWorkEnrollmentProfiles();

    IAndroidForWorkEnrollmentProfileRequestBuilder androidForWorkEnrollmentProfiles(final String id);

    /**
     * Gets the request builder for AndroidForWorkSettings
     *
     * @return the IAndroidForWorkSettingsRequestBuilder instance
     */
    IAndroidForWorkSettingsRequestBuilder androidForWorkSettings();

    /**
     * Gets the request builder for AndroidManagedStoreAccountEnterpriseSettings
     *
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder androidManagedStoreAccountEnterpriseSettings();

    IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder androidManagedStoreAppConfigurationSchemas();

    IAndroidManagedStoreAppConfigurationSchemaRequestBuilder androidManagedStoreAppConfigurationSchemas(final String id);

    IAuditEventCollectionRequestBuilder auditEvents();

    IAuditEventRequestBuilder auditEvents(final String id);

    IDeviceAndAppManagementAssignmentFilterCollectionRequestBuilder assignmentFilters();

    IDeviceAndAppManagementAssignmentFilterRequestBuilder assignmentFilters(final String id);

    ITermsAndConditionsCollectionRequestBuilder termsAndConditions();

    ITermsAndConditionsRequestBuilder termsAndConditions(final String id);

    /**
     * Gets the request builder for AdvancedThreatProtectionOnboardingStateSummary
     *
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder instance
     */
    IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder advancedThreatProtectionOnboardingStateSummary();

    ICartToClassAssociationCollectionRequestBuilder cartToClassAssociations();

    ICartToClassAssociationRequestBuilder cartToClassAssociations(final String id);

    IDeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies();

    IDeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(final String id);

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary();

    IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries();

    IDeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(final String id);

    IDeviceConfigurationConflictSummaryCollectionRequestBuilder deviceConfigurationConflictSummary();

    IDeviceConfigurationConflictSummaryRequestBuilder deviceConfigurationConflictSummary(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the IDeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    IDeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries();

    IRestrictedAppsViolationCollectionRequestBuilder deviceConfigurationRestrictedAppsViolations();

    IRestrictedAppsViolationRequestBuilder deviceConfigurationRestrictedAppsViolations(final String id);

    IDeviceConfigurationCollectionRequestBuilder deviceConfigurations();

    IDeviceConfigurationRequestBuilder deviceConfigurations(final String id);

    IManagedAllDeviceCertificateStateCollectionRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates();

    IManagedAllDeviceCertificateStateRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates(final String id);

    /**
     * Gets the request builder for DeviceConfigurationUserStateSummary
     *
     * @return the IDeviceConfigurationUserStateSummaryRequestBuilder instance
     */
    IDeviceConfigurationUserStateSummaryRequestBuilder deviceConfigurationUserStateSummaries();

    IIosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses();

    IIosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(final String id);

    IMacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder macOSSoftwareUpdateAccountSummaries();

    IMacOSSoftwareUpdateAccountSummaryRequestBuilder macOSSoftwareUpdateAccountSummaries(final String id);

    IManagedDeviceEncryptionStateCollectionRequestBuilder managedDeviceEncryptionStates();

    IManagedDeviceEncryptionStateRequestBuilder managedDeviceEncryptionStates(final String id);

    INdesConnectorCollectionRequestBuilder ndesConnectors();

    INdesConnectorRequestBuilder ndesConnectors(final String id);

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary();

    IDeviceManagementConfigurationCategoryCollectionRequestBuilder configurationCategories();

    IDeviceManagementConfigurationCategoryRequestBuilder configurationCategories(final String id);

    IDeviceManagementConfigurationPolicyCollectionRequestBuilder configurationPolicies();

    IDeviceManagementConfigurationPolicyRequestBuilder configurationPolicies(final String id);

    IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder configurationSettings();

    IDeviceManagementConfigurationSettingDefinitionRequestBuilder configurationSettings(final String id);

    IComplianceManagementPartnerCollectionRequestBuilder complianceManagementPartners();

    IComplianceManagementPartnerRequestBuilder complianceManagementPartners(final String id);

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the IOnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    IOnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings();

    IDeviceCategoryCollectionRequestBuilder deviceCategories();

    IDeviceCategoryRequestBuilder deviceCategories(final String id);

    IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations();

    IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id);

    IDeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners();

    IDeviceManagementPartnerRequestBuilder deviceManagementPartners(final String id);

    IDeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors();

    IDeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(final String id);

    IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder exchangeOnPremisesPolicies();

    IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicies(final String id);

    /**
     * Gets the request builder for DeviceManagementExchangeOnPremisesPolicy
     *
     * @return the IDeviceManagementExchangeOnPremisesPolicyRequestBuilder instance
     */
    IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicy();

    IMobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors();

    IMobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(final String id);

    IDeviceManagementSettingCategoryCollectionRequestBuilder categories();

    IDeviceManagementSettingCategoryRequestBuilder categories(final String id);

    IDeviceManagementIntentCollectionRequestBuilder intents();

    IDeviceManagementIntentRequestBuilder intents(final String id);

    IDeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions();

    IDeviceManagementSettingDefinitionRequestBuilder settingDefinitions(final String id);

    IDeviceManagementTemplateCollectionRequestBuilder templates();

    IDeviceManagementTemplateRequestBuilder templates(final String id);

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the IApplePushNotificationCertificateRequestBuilder instance
     */
    IApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate();

    IManagedDeviceCollectionRequestBuilder comanagedDevices();

    IManagedDeviceRequestBuilder comanagedDevices(final String id);

    IComanagementEligibleDeviceCollectionRequestBuilder comanagementEligibleDevices();

    IComanagementEligibleDeviceRequestBuilder comanagementEligibleDevices(final String id);

    IDataSharingConsentCollectionRequestBuilder dataSharingConsents();

    IDataSharingConsentRequestBuilder dataSharingConsents(final String id);

    IDetectedAppCollectionRequestBuilder detectedApps();

    IDetectedAppRequestBuilder detectedApps(final String id);

    IDeviceComplianceScriptCollectionRequestBuilder deviceComplianceScripts();

    IDeviceComplianceScriptRequestBuilder deviceComplianceScripts(final String id);

    IDeviceCustomAttributeShellScriptCollectionRequestBuilder deviceCustomAttributeShellScripts();

    IDeviceCustomAttributeShellScriptRequestBuilder deviceCustomAttributeShellScripts(final String id);

    IDeviceHealthScriptCollectionRequestBuilder deviceHealthScripts();

    IDeviceHealthScriptRequestBuilder deviceHealthScripts(final String id);

    IDeviceManagementScriptCollectionRequestBuilder deviceManagementScripts();

    IDeviceManagementScriptRequestBuilder deviceManagementScripts(final String id);

    IDeviceShellScriptCollectionRequestBuilder deviceShellScripts();

    IDeviceShellScriptRequestBuilder deviceShellScripts(final String id);

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the IManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    IManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview();

    IManagedDeviceCollectionRequestBuilder managedDevices();

    IManagedDeviceRequestBuilder managedDevices(final String id);

    IMobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents();

    IMobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(final String id);

    IRemoteActionAuditCollectionRequestBuilder remoteActionAudits();

    IRemoteActionAuditRequestBuilder remoteActionAudits(final String id);

    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance();

    IUserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance(final String id);

    IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion();

    IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(final String id);

    IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion();

    IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(final String id);

    IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance();

    IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance(final String id);

    IUserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance();

    IUserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance(final String id);

    IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails();

    IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails(final String id);

    IUserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance();

    IUserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance(final String id);

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the IUserExperienceAnalyticsCategoryRequestBuilder instance
     */
    IUserExperienceAnalyticsCategoryRequestBuilder userExperienceAnalyticsAppHealthOverview();

    IUserExperienceAnalyticsBaselineCollectionRequestBuilder userExperienceAnalyticsBaselines();

    IUserExperienceAnalyticsBaselineRequestBuilder userExperienceAnalyticsBaselines(final String id);

    IUserExperienceAnalyticsCategoryCollectionRequestBuilder userExperienceAnalyticsCategories();

    IUserExperienceAnalyticsCategoryRequestBuilder userExperienceAnalyticsCategories(final String id);

    IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder userExperienceAnalyticsDevicePerformance();

    IUserExperienceAnalyticsDevicePerformanceRequestBuilder userExperienceAnalyticsDevicePerformance(final String id);

    IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder userExperienceAnalyticsDeviceStartupHistory();

    IUserExperienceAnalyticsDeviceStartupHistoryRequestBuilder userExperienceAnalyticsDeviceStartupHistory(final String id);

    IUserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder userExperienceAnalyticsDeviceStartupProcesses();

    IUserExperienceAnalyticsDeviceStartupProcessRequestBuilder userExperienceAnalyticsDeviceStartupProcesses(final String id);

    IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance();

    IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance(final String id);

    IUserExperienceAnalyticsMetricHistoryCollectionRequestBuilder userExperienceAnalyticsMetricHistory();

    IUserExperienceAnalyticsMetricHistoryRequestBuilder userExperienceAnalyticsMetricHistory(final String id);

    /**
     * Gets the request builder for UserExperienceAnalyticsOverview
     *
     * @return the IUserExperienceAnalyticsOverviewRequestBuilder instance
     */
    IUserExperienceAnalyticsOverviewRequestBuilder userExperienceAnalyticsOverview();

    /**
     * Gets the request builder for UserExperienceAnalyticsRegressionSummary
     *
     * @return the IUserExperienceAnalyticsRegressionSummaryRequestBuilder instance
     */
    IUserExperienceAnalyticsRegressionSummaryRequestBuilder userExperienceAnalyticsRegressionSummary();

    IUserExperienceAnalyticsScoreHistoryCollectionRequestBuilder userExperienceAnalyticsScoreHistory();

    IUserExperienceAnalyticsScoreHistoryRequestBuilder userExperienceAnalyticsScoreHistory(final String id);

    IWindowsMalwareInformationCollectionRequestBuilder windowsMalwareInformation();

    IWindowsMalwareInformationRequestBuilder windowsMalwareInformation(final String id);

    IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder derivedCredentials();

    IDeviceManagementDerivedCredentialSettingsRequestBuilder derivedCredentials(final String id);

    IDeviceManagementResourceAccessProfileBaseCollectionRequestBuilder resourceAccessProfiles();

    IDeviceManagementResourceAccessProfileBaseRequestBuilder resourceAccessProfiles(final String id);

    IAppleUserInitiatedEnrollmentProfileCollectionRequestBuilder appleUserInitiatedEnrollmentProfiles();

    IAppleUserInitiatedEnrollmentProfileRequestBuilder appleUserInitiatedEnrollmentProfiles(final String id);

    IDepOnboardingSettingCollectionRequestBuilder depOnboardingSettings();

    IDepOnboardingSettingRequestBuilder depOnboardingSettings(final String id);

    IImportedDeviceIdentityCollectionRequestBuilder importedDeviceIdentities();

    IImportedDeviceIdentityRequestBuilder importedDeviceIdentities(final String id);

    IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder importedWindowsAutopilotDeviceIdentities();

    IImportedWindowsAutopilotDeviceIdentityRequestBuilder importedWindowsAutopilotDeviceIdentities(final String id);

    IWindowsAutopilotDeploymentProfileCollectionRequestBuilder windowsAutopilotDeploymentProfiles();

    IWindowsAutopilotDeploymentProfileRequestBuilder windowsAutopilotDeploymentProfiles(final String id);

    IWindowsAutopilotDeviceIdentityCollectionRequestBuilder windowsAutopilotDeviceIdentities();

    IWindowsAutopilotDeviceIdentityRequestBuilder windowsAutopilotDeviceIdentities(final String id);

    /**
     * Gets the request builder for WindowsAutopilotSettings
     *
     * @return the IWindowsAutopilotSettingsRequestBuilder instance
     */
    IWindowsAutopilotSettingsRequestBuilder windowsAutopilotSettings();

    IManagementConditionCollectionRequestBuilder managementConditions();

    IManagementConditionRequestBuilder managementConditions(final String id);

    IManagementConditionStatementCollectionRequestBuilder managementConditionStatements();

    IManagementConditionStatementRequestBuilder managementConditionStatements(final String id);

    IGroupPolicyMigrationReportCollectionRequestBuilder groupPolicyMigrationReports();

    IGroupPolicyMigrationReportRequestBuilder groupPolicyMigrationReports(final String id);

    IGroupPolicyObjectFileCollectionRequestBuilder groupPolicyObjectFiles();

    IGroupPolicyObjectFileRequestBuilder groupPolicyObjectFiles(final String id);

    IGroupPolicyCategoryCollectionRequestBuilder groupPolicyCategories();

    IGroupPolicyCategoryRequestBuilder groupPolicyCategories(final String id);

    IGroupPolicyConfigurationCollectionRequestBuilder groupPolicyConfigurations();

    IGroupPolicyConfigurationRequestBuilder groupPolicyConfigurations(final String id);

    IGroupPolicyDefinitionFileCollectionRequestBuilder groupPolicyDefinitionFiles();

    IGroupPolicyDefinitionFileRequestBuilder groupPolicyDefinitionFiles(final String id);

    IGroupPolicyDefinitionCollectionRequestBuilder groupPolicyDefinitions();

    IGroupPolicyDefinitionRequestBuilder groupPolicyDefinitions(final String id);

    IGroupPolicyUploadedDefinitionFileCollectionRequestBuilder groupPolicyUploadedDefinitionFiles();

    IGroupPolicyUploadedDefinitionFileRequestBuilder groupPolicyUploadedDefinitionFiles(final String id);

    IMicrosoftTunnelConfigurationCollectionRequestBuilder microsoftTunnelConfigurations();

    IMicrosoftTunnelConfigurationRequestBuilder microsoftTunnelConfigurations(final String id);

    IMicrosoftTunnelSiteCollectionRequestBuilder microsoftTunnelSites();

    IMicrosoftTunnelSiteRequestBuilder microsoftTunnelSites(final String id);

    INotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates();

    INotificationMessageTemplateRequestBuilder notificationMessageTemplates(final String id);

    IDeviceManagementDomainJoinConnectorCollectionRequestBuilder domainJoinConnectors();

    IDeviceManagementDomainJoinConnectorRequestBuilder domainJoinConnectors(final String id);

    IConfigManagerCollectionCollectionRequestBuilder configManagerCollections();

    IConfigManagerCollectionRequestBuilder configManagerCollections(final String id);

    IResourceOperationCollectionRequestBuilder resourceOperations();

    IResourceOperationRequestBuilder resourceOperations(final String id);

    IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments();

    IDeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(final String id);

    IRoleDefinitionCollectionRequestBuilder roleDefinitions();

    IRoleDefinitionRequestBuilder roleDefinitions(final String id);

    IRoleScopeTagCollectionRequestBuilder roleScopeTags();

    IRoleScopeTagRequestBuilder roleScopeTags(final String id);

    IRemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners();

    IRemoteAssistancePartnerRequestBuilder remoteAssistancePartners(final String id);

    /**
     * Gets the request builder for DeviceManagementReports
     *
     * @return the IDeviceManagementReportsRequestBuilder instance
     */
    IDeviceManagementReportsRequestBuilder reports();

    IEmbeddedSIMActivationCodePoolCollectionRequestBuilder embeddedSIMActivationCodePools();

    IEmbeddedSIMActivationCodePoolRequestBuilder embeddedSIMActivationCodePools(final String id);

    ITelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners();

    ITelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(final String id);

    IDeviceManagementAutopilotEventCollectionRequestBuilder autopilotEvents();

    IDeviceManagementAutopilotEventRequestBuilder autopilotEvents(final String id);

    IDeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents();

    IDeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(final String id);

    IWindowsFeatureUpdateProfileCollectionRequestBuilder windowsFeatureUpdateProfiles();

    IWindowsFeatureUpdateProfileRequestBuilder windowsFeatureUpdateProfiles(final String id);

    IIntuneBrandingProfileCollectionRequestBuilder intuneBrandingProfiles();

    IIntuneBrandingProfileRequestBuilder intuneBrandingProfiles(final String id);

    IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries();

    IWindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(final String id);

    IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries();

    IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(final String id);

    IUserPFXCertificateCollectionRequestBuilder userPfxCertificates();

    IUserPFXCertificateRequestBuilder userPfxCertificates(final String id);
    IDeviceManagementEnableAndroidDeviceAdministratorEnrollmentRequestBuilder enableAndroidDeviceAdministratorEnrollment();
    IDeviceManagementEnableLegacyPcManagementRequestBuilder enableLegacyPcManagement();
    IDeviceManagementEnableUnlicensedAdminstratorsRequestBuilder enableUnlicensedAdminstrators();
    IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(final String notificationTitle, final String notificationBody, final java.util.List<String> groupsToNotify);

    IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions();

    IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(final String scope);
    IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(final String domainName);
    IDeviceManagementGetComanagedDevicesSummaryRequestBuilder getComanagedDevicesSummary();
    IDeviceManagementGetComanagementEligibleDevicesSummaryRequestBuilder getComanagementEligibleDevicesSummary();
    IDeviceManagementGetSuggestedEnrollmentLimitRequestBuilder getSuggestedEnrollmentLimit(final String enrollmentType);
    IDeviceManagementGetAssignedRoleDetailsRequestBuilder getAssignedRoleDetails();

    IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder getRoleScopeTagsByIds(final java.util.List<String> ids);

    IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder getRoleScopeTagsByResource(final String resource);
    IDeviceManagementScopedForResourceRequestBuilder scopedForResource(final String resource);

}