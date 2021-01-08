// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.VirtualEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementSendCustomNotificationToCompanyPortalParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementGetEffectivePermissionsParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementGetSuggestedEnrollmentLimitParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementGetRoleScopeTagsByIdsParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementGetRoleScopeTagsByResourceParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementScopedForResourceParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request Builder.
 */
public class DeviceManagementRequestBuilder extends BaseRequestBuilder<DeviceManagement> {

    /**
     * The request builder for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementRequest instance
     */
    @Nonnull
    public DeviceManagementRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementRequest instance
     */
    @Nonnull
    public DeviceManagementRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AndroidDeviceOwnerEnrollmentProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder androidDeviceOwnerEnrollmentProfiles() {
        return new AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidDeviceOwnerEnrollmentProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the AndroidDeviceOwnerEnrollmentProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AndroidDeviceOwnerEnrollmentProfileRequestBuilder androidDeviceOwnerEnrollmentProfiles(@Nonnull final String id) {
        return new AndroidDeviceOwnerEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("androidDeviceOwnerEnrollmentProfiles") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for VirtualEndpoint
     *
     * @return the VirtualEndpointRequestBuilder instance
     */
    @Nonnull
    public VirtualEndpointRequestBuilder virtualEndpoint() {
        return new VirtualEndpointRequestBuilder(getRequestUrlWithAdditionalSegment("virtualEndpoint"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AndroidForWorkAppConfigurationSchema collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder androidForWorkAppConfigurationSchemas() {
        return new AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkAppConfigurationSchemas"), getClient(), null);
    }

    /**
     * Gets a request builder for the AndroidForWorkAppConfigurationSchema item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AndroidForWorkAppConfigurationSchemaRequestBuilder androidForWorkAppConfigurationSchemas(@Nonnull final String id) {
        return new AndroidForWorkAppConfigurationSchemaRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkAppConfigurationSchemas") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AndroidForWorkEnrollmentProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AndroidForWorkEnrollmentProfileCollectionRequestBuilder androidForWorkEnrollmentProfiles() {
        return new AndroidForWorkEnrollmentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkEnrollmentProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the AndroidForWorkEnrollmentProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AndroidForWorkEnrollmentProfileRequestBuilder androidForWorkEnrollmentProfiles(@Nonnull final String id) {
        return new AndroidForWorkEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkEnrollmentProfiles") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AndroidForWorkSettings
     *
     * @return the AndroidForWorkSettingsRequestBuilder instance
     */
    @Nonnull
    public AndroidForWorkSettingsRequestBuilder androidForWorkSettings() {
        return new AndroidForWorkSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkSettings"), getClient(), null);
    }

    /**
     * Gets the request builder for AndroidManagedStoreAccountEnterpriseSettings
     *
     * @return the AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder androidManagedStoreAccountEnterpriseSettings() {
        return new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAccountEnterpriseSettings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AndroidManagedStoreAppConfigurationSchema collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder androidManagedStoreAppConfigurationSchemas() {
        return new AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAppConfigurationSchemas"), getClient(), null);
    }

    /**
     * Gets a request builder for the AndroidManagedStoreAppConfigurationSchema item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AndroidManagedStoreAppConfigurationSchemaRequestBuilder androidManagedStoreAppConfigurationSchemas(@Nonnull final String id) {
        return new AndroidManagedStoreAppConfigurationSchemaRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAppConfigurationSchemas") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AuditEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AuditEventCollectionRequestBuilder auditEvents() {
        return new AuditEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the AuditEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AuditEventRequestBuilder auditEvents(@Nonnull final String id) {
        return new AuditEventRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceAndAppManagementAssignmentFilter collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder assignmentFilters() {
        return new DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilters"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceAndAppManagementAssignmentFilter item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterRequestBuilder assignmentFilters(@Nonnull final String id) {
        return new DeviceAndAppManagementAssignmentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilters") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TermsAndConditions collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TermsAndConditionsCollectionRequestBuilder termsAndConditions() {
        return new TermsAndConditionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions"), getClient(), null);
    }

    /**
     * Gets a request builder for the TermsAndConditions item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TermsAndConditionsRequestBuilder termsAndConditions(@Nonnull final String id) {
        return new TermsAndConditionsRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AdvancedThreatProtectionOnboardingStateSummary
     *
     * @return the AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder instance
     */
    @Nonnull
    public AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder advancedThreatProtectionOnboardingStateSummary() {
        return new AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("advancedThreatProtectionOnboardingStateSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CartToClassAssociation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CartToClassAssociationCollectionRequestBuilder cartToClassAssociations() {
        return new CartToClassAssociationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cartToClassAssociations"), getClient(), null);
    }

    /**
     * Gets a request builder for the CartToClassAssociation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CartToClassAssociationRequestBuilder cartToClassAssociations(@Nonnull final String id) {
        return new CartToClassAssociationRequestBuilder(getRequestUrlWithAdditionalSegment("cartToClassAssociations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(@Nonnull final String id) {
        return new DeviceCompliancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the DeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    @Nonnull
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyDeviceStateSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicySettingStateSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicySettingStateSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(@Nonnull final String id) {
        return new DeviceCompliancePolicySettingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationConflictSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationConflictSummaryCollectionRequestBuilder deviceConfigurationConflictSummary() {
        return new DeviceConfigurationConflictSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationConflictSummary"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationConflictSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationConflictSummaryRequestBuilder deviceConfigurationConflictSummary(@Nonnull final String id) {
        return new DeviceConfigurationConflictSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationConflictSummary") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the DeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationDeviceStateSummaries"), getClient(), null);
    }
    /**
     *  Gets a request builder for the RestrictedAppsViolation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RestrictedAppsViolationCollectionRequestBuilder deviceConfigurationRestrictedAppsViolations() {
        return new RestrictedAppsViolationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationRestrictedAppsViolations"), getClient(), null);
    }

    /**
     * Gets a request builder for the RestrictedAppsViolation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RestrictedAppsViolationRequestBuilder deviceConfigurationRestrictedAppsViolations(@Nonnull final String id) {
        return new RestrictedAppsViolationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationRestrictedAppsViolations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationCollectionRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationRequestBuilder deviceConfigurations(@Nonnull final String id) {
        return new DeviceConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAllDeviceCertificateState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAllDeviceCertificateStateCollectionRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates() {
        return new ManagedAllDeviceCertificateStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationsAllManagedDeviceCertificateStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAllDeviceCertificateState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAllDeviceCertificateStateRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates(@Nonnull final String id) {
        return new ManagedAllDeviceCertificateStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationsAllManagedDeviceCertificateStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserStateSummary
     *
     * @return the DeviceConfigurationUserStateSummaryRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationUserStateSummaryRequestBuilder deviceConfigurationUserStateSummaries() {
        return new DeviceConfigurationUserStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationUserStateSummaries"), getClient(), null);
    }
    /**
     *  Gets a request builder for the IosUpdateDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses() {
        return new IosUpdateDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the IosUpdateDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(@Nonnull final String id) {
        return new IosUpdateDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MacOSSoftwareUpdateAccountSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder macOSSoftwareUpdateAccountSummaries() {
        return new MacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("macOSSoftwareUpdateAccountSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the MacOSSoftwareUpdateAccountSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MacOSSoftwareUpdateAccountSummaryRequestBuilder macOSSoftwareUpdateAccountSummaries(@Nonnull final String id) {
        return new MacOSSoftwareUpdateAccountSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("macOSSoftwareUpdateAccountSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceEncryptionState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceEncryptionStateCollectionRequestBuilder managedDeviceEncryptionStates() {
        return new ManagedDeviceEncryptionStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceEncryptionStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceEncryptionState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceEncryptionStateRequestBuilder managedDeviceEncryptionStates(@Nonnull final String id) {
        return new ManagedDeviceEncryptionStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceEncryptionStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the NdesConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public NdesConnectorCollectionRequestBuilder ndesConnectors() {
        return new NdesConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ndesConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the NdesConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public NdesConnectorRequestBuilder ndesConnectors(@Nonnull final String id) {
        return new NdesConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("ndesConnectors") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the SoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public SoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("softwareUpdateStatusSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementConfigurationCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementConfigurationCategoryCollectionRequestBuilder configurationCategories() {
        return new DeviceManagementConfigurationCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("configurationCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementConfigurationCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementConfigurationCategoryRequestBuilder configurationCategories(@Nonnull final String id) {
        return new DeviceManagementConfigurationCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("configurationCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementConfigurationPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyCollectionRequestBuilder configurationPolicies() {
        return new DeviceManagementConfigurationPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("configurationPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementConfigurationPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyRequestBuilder configurationPolicies(@Nonnull final String id) {
        return new DeviceManagementConfigurationPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("configurationPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementConfigurationSettingDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder configurationSettings() {
        return new DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("configurationSettings"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementConfigurationSettingDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementConfigurationSettingDefinitionRequestBuilder configurationSettings(@Nonnull final String id) {
        return new DeviceManagementConfigurationSettingDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("configurationSettings") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ComplianceManagementPartner collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ComplianceManagementPartnerCollectionRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("complianceManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the ComplianceManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ComplianceManagementPartnerRequestBuilder complianceManagementPartners(@Nonnull final String id) {
        return new ComplianceManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("complianceManagementPartners") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the OnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    @Nonnull
    public OnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new OnPremisesConditionalAccessSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessSettings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCategoryCollectionRequestBuilder deviceCategories() {
        return new DeviceCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCategoryRequestBuilder deviceCategories(@Nonnull final String id) {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceEnrollmentConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceEnrollmentConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(@Nonnull final String id) {
        return new DeviceEnrollmentConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementPartner collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementPartnerRequestBuilder deviceManagementPartners(@Nonnull final String id) {
        return new DeviceManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementExchangeConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors() {
        return new DeviceManagementExchangeConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementExchangeConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(@Nonnull final String id) {
        return new DeviceManagementExchangeConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementExchangeOnPremisesPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder exchangeOnPremisesPolicies() {
        return new DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementExchangeOnPremisesPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicies(@Nonnull final String id) {
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementExchangeOnPremisesPolicy
     *
     * @return the DeviceManagementExchangeOnPremisesPolicyRequestBuilder instance
     */
    @Nonnull
    public DeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicy() {
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicy"), getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileThreatDefenseConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileThreatDefenseConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(@Nonnull final String id) {
        return new MobileThreatDefenseConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementSettingCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementSettingCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementSettingCategoryRequestBuilder categories(@Nonnull final String id) {
        return new DeviceManagementSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementIntent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementIntentCollectionRequestBuilder intents() {
        return new DeviceManagementIntentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementIntent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementIntentRequestBuilder intents(@Nonnull final String id) {
        return new DeviceManagementIntentRequestBuilder(getRequestUrlWithAdditionalSegment("intents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementSettingDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions() {
        return new DeviceManagementSettingDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementSettingDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementSettingDefinitionRequestBuilder settingDefinitions(@Nonnull final String id) {
        return new DeviceManagementSettingDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTemplate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementTemplateCollectionRequestBuilder templates() {
        return new DeviceManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("templates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementTemplateRequestBuilder templates(@Nonnull final String id) {
        return new DeviceManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("templates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the ApplePushNotificationCertificateRequestBuilder instance
     */
    @Nonnull
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("applePushNotificationCertificate"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDevice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceCollectionRequestBuilder comanagedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("comanagedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceRequestBuilder comanagedDevices(@Nonnull final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("comanagedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ComanagementEligibleDevice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ComanagementEligibleDeviceCollectionRequestBuilder comanagementEligibleDevices() {
        return new ComanagementEligibleDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("comanagementEligibleDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ComanagementEligibleDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ComanagementEligibleDeviceRequestBuilder comanagementEligibleDevices(@Nonnull final String id) {
        return new ComanagementEligibleDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("comanagementEligibleDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DataSharingConsent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DataSharingConsentCollectionRequestBuilder dataSharingConsents() {
        return new DataSharingConsentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dataSharingConsents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DataSharingConsent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DataSharingConsentRequestBuilder dataSharingConsents(@Nonnull final String id) {
        return new DataSharingConsentRequestBuilder(getRequestUrlWithAdditionalSegment("dataSharingConsents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DetectedApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DetectedAppCollectionRequestBuilder detectedApps() {
        return new DetectedAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the DetectedApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DetectedAppRequestBuilder detectedApps(@Nonnull final String id) {
        return new DetectedAppRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceScript collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceScriptCollectionRequestBuilder deviceComplianceScripts() {
        return new DeviceComplianceScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceComplianceScripts"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceScript item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceComplianceScriptRequestBuilder deviceComplianceScripts(@Nonnull final String id) {
        return new DeviceComplianceScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceComplianceScripts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCustomAttributeShellScript collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCustomAttributeShellScriptCollectionRequestBuilder deviceCustomAttributeShellScripts() {
        return new DeviceCustomAttributeShellScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCustomAttributeShellScripts"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCustomAttributeShellScript item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCustomAttributeShellScriptRequestBuilder deviceCustomAttributeShellScripts(@Nonnull final String id) {
        return new DeviceCustomAttributeShellScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCustomAttributeShellScripts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceHealthScript collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceHealthScriptCollectionRequestBuilder deviceHealthScripts() {
        return new DeviceHealthScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceHealthScripts"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceHealthScript item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceHealthScriptRequestBuilder deviceHealthScripts(@Nonnull final String id) {
        return new DeviceHealthScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceHealthScripts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementScript collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementScriptCollectionRequestBuilder deviceManagementScripts() {
        return new DeviceManagementScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementScripts"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementScript item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementScriptRequestBuilder deviceManagementScripts(@Nonnull final String id) {
        return new DeviceManagementScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementScripts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceShellScript collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceShellScriptCollectionRequestBuilder deviceShellScripts() {
        return new DeviceShellScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceShellScripts"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceShellScript item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceShellScriptRequestBuilder deviceShellScripts(@Nonnull final String id) {
        return new DeviceShellScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceShellScripts") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the ManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    @Nonnull
    public ManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDevice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceRequestBuilder managedDevices(@Nonnull final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(@Nonnull final String id) {
        return new MobileAppTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RemoteActionAudit collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RemoteActionAuditCollectionRequestBuilder remoteActionAudits() {
        return new RemoteActionAuditCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("remoteActionAudits"), getClient(), null);
    }

    /**
     * Gets a request builder for the RemoteActionAudit item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RemoteActionAuditRequestBuilder remoteActionAudits(@Nonnull final String id) {
        return new RemoteActionAuditRequestBuilder(getRequestUrlWithAdditionalSegment("remoteActionAudits") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthApplicationPerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthApplicationPerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformance") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion() {
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return new UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthDeviceModelPerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDeviceModelPerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthDeviceModelPerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDeviceModelPerformance") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthDevicePerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDevicePerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthDevicePerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDevicePerformance") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthDevicePerformanceDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDevicePerformanceDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthDevicePerformanceDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthDevicePerformanceDetails") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsAppHealthOSVersionPerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance() {
        return new UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthOSVersionPerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsAppHealthOSVersionPerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthOSVersionPerformance") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryRequestBuilder userExperienceAnalyticsAppHealthOverview() {
        return new UserExperienceAnalyticsCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsAppHealthOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsBaseline collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsBaselineCollectionRequestBuilder userExperienceAnalyticsBaselines() {
        return new UserExperienceAnalyticsBaselineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsBaselines"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsBaseline item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsBaselineRequestBuilder userExperienceAnalyticsBaselines(@Nonnull final String id) {
        return new UserExperienceAnalyticsBaselineRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsBaselines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryCollectionRequestBuilder userExperienceAnalyticsCategories() {
        return new UserExperienceAnalyticsCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryRequestBuilder userExperienceAnalyticsCategories(@Nonnull final String id) {
        return new UserExperienceAnalyticsCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsDevicePerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder userExperienceAnalyticsDevicePerformance() {
        return new UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDevicePerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsDevicePerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsDevicePerformanceRequestBuilder userExperienceAnalyticsDevicePerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsDevicePerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDevicePerformance") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsDeviceStartupHistory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder userExperienceAnalyticsDeviceStartupHistory() {
        return new UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupHistory"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsDeviceStartupHistory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder userExperienceAnalyticsDeviceStartupHistory(@Nonnull final String id) {
        return new UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupHistory") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsDeviceStartupProcess collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder userExperienceAnalyticsDeviceStartupProcesses() {
        return new UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupProcesses"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsDeviceStartupProcess item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessRequestBuilder userExperienceAnalyticsDeviceStartupProcesses(@Nonnull final String id) {
        return new UserExperienceAnalyticsDeviceStartupProcessRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupProcesses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsDeviceStartupProcessPerformance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance() {
        return new UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupProcessPerformance"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsDeviceStartupProcessPerformance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance(@Nonnull final String id) {
        return new UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsDeviceStartupProcessPerformance") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsMetricHistory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder userExperienceAnalyticsMetricHistory() {
        return new UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsMetricHistory"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsMetricHistory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsMetricHistoryRequestBuilder userExperienceAnalyticsMetricHistory(@Nonnull final String id) {
        return new UserExperienceAnalyticsMetricHistoryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsMetricHistory") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsOverview
     *
     * @return the UserExperienceAnalyticsOverviewRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsOverviewRequestBuilder userExperienceAnalyticsOverview() {
        return new UserExperienceAnalyticsOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsOverview"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsRegressionSummary
     *
     * @return the UserExperienceAnalyticsRegressionSummaryRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsRegressionSummaryRequestBuilder userExperienceAnalyticsRegressionSummary() {
        return new UserExperienceAnalyticsRegressionSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsRegressionSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsScoreHistory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder userExperienceAnalyticsScoreHistory() {
        return new UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsScoreHistory"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsScoreHistory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsScoreHistoryRequestBuilder userExperienceAnalyticsScoreHistory(@Nonnull final String id) {
        return new UserExperienceAnalyticsScoreHistoryRequestBuilder(getRequestUrlWithAdditionalSegment("userExperienceAnalyticsScoreHistory") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsMalwareInformation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsMalwareInformationCollectionRequestBuilder windowsMalwareInformation() {
        return new WindowsMalwareInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsMalwareInformation"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsMalwareInformation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsMalwareInformationRequestBuilder windowsMalwareInformation(@Nonnull final String id) {
        return new WindowsMalwareInformationRequestBuilder(getRequestUrlWithAdditionalSegment("windowsMalwareInformation") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementDerivedCredentialSettings collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder derivedCredentials() {
        return new DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("derivedCredentials"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementDerivedCredentialSettings item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementDerivedCredentialSettingsRequestBuilder derivedCredentials(@Nonnull final String id) {
        return new DeviceManagementDerivedCredentialSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("derivedCredentials") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementResourceAccessProfileBase collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder resourceAccessProfiles() {
        return new DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resourceAccessProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementResourceAccessProfileBase item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileBaseRequestBuilder resourceAccessProfiles(@Nonnull final String id) {
        return new DeviceManagementResourceAccessProfileBaseRequestBuilder(getRequestUrlWithAdditionalSegment("resourceAccessProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppleUserInitiatedEnrollmentProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder appleUserInitiatedEnrollmentProfiles() {
        return new AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appleUserInitiatedEnrollmentProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppleUserInitiatedEnrollmentProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppleUserInitiatedEnrollmentProfileRequestBuilder appleUserInitiatedEnrollmentProfiles(@Nonnull final String id) {
        return new AppleUserInitiatedEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("appleUserInitiatedEnrollmentProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DepOnboardingSetting collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DepOnboardingSettingCollectionRequestBuilder depOnboardingSettings() {
        return new DepOnboardingSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("depOnboardingSettings"), getClient(), null);
    }

    /**
     * Gets a request builder for the DepOnboardingSetting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DepOnboardingSettingRequestBuilder depOnboardingSettings(@Nonnull final String id) {
        return new DepOnboardingSettingRequestBuilder(getRequestUrlWithAdditionalSegment("depOnboardingSettings") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ImportedDeviceIdentity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ImportedDeviceIdentityCollectionRequestBuilder importedDeviceIdentities() {
        return new ImportedDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("importedDeviceIdentities"), getClient(), null);
    }

    /**
     * Gets a request builder for the ImportedDeviceIdentity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ImportedDeviceIdentityRequestBuilder importedDeviceIdentities(@Nonnull final String id) {
        return new ImportedDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("importedDeviceIdentities") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ImportedWindowsAutopilotDeviceIdentity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("importedWindowsAutopilotDeviceIdentities"), getClient(), null);
    }

    /**
     * Gets a request builder for the ImportedWindowsAutopilotDeviceIdentity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ImportedWindowsAutopilotDeviceIdentityRequestBuilder importedWindowsAutopilotDeviceIdentities(@Nonnull final String id) {
        return new ImportedWindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("importedWindowsAutopilotDeviceIdentities") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsAutopilotDeploymentProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileCollectionRequestBuilder windowsAutopilotDeploymentProfiles() {
        return new WindowsAutopilotDeploymentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeploymentProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsAutopilotDeploymentProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileRequestBuilder windowsAutopilotDeploymentProfiles(@Nonnull final String id) {
        return new WindowsAutopilotDeploymentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeploymentProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsAutopilotDeviceIdentity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityCollectionRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeviceIdentities"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsAutopilotDeviceIdentity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityRequestBuilder windowsAutopilotDeviceIdentities(@Nonnull final String id) {
        return new WindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeviceIdentities") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsAutopilotSettings
     *
     * @return the WindowsAutopilotSettingsRequestBuilder instance
     */
    @Nonnull
    public WindowsAutopilotSettingsRequestBuilder windowsAutopilotSettings() {
        return new WindowsAutopilotSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotSettings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementCondition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementConditionCollectionRequestBuilder managementConditions() {
        return new ManagementConditionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementCondition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementConditionRequestBuilder managementConditions(@Nonnull final String id) {
        return new ManagementConditionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementConditionStatement collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementConditionStatementCollectionRequestBuilder managementConditionStatements() {
        return new ManagementConditionStatementCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementConditionStatement item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementConditionStatementRequestBuilder managementConditionStatements(@Nonnull final String id) {
        return new ManagementConditionStatementRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyMigrationReport collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyMigrationReportCollectionRequestBuilder groupPolicyMigrationReports() {
        return new GroupPolicyMigrationReportCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyMigrationReports"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyMigrationReport item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyMigrationReportRequestBuilder groupPolicyMigrationReports(@Nonnull final String id) {
        return new GroupPolicyMigrationReportRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyMigrationReports") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyObjectFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyObjectFileCollectionRequestBuilder groupPolicyObjectFiles() {
        return new GroupPolicyObjectFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyObjectFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyObjectFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyObjectFileRequestBuilder groupPolicyObjectFiles(@Nonnull final String id) {
        return new GroupPolicyObjectFileRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyObjectFiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyCategoryCollectionRequestBuilder groupPolicyCategories() {
        return new GroupPolicyCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyCategoryRequestBuilder groupPolicyCategories(@Nonnull final String id) {
        return new GroupPolicyCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyConfigurationCollectionRequestBuilder groupPolicyConfigurations() {
        return new GroupPolicyConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyConfigurationRequestBuilder groupPolicyConfigurations(@Nonnull final String id) {
        return new GroupPolicyConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyDefinitionFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyDefinitionFileCollectionRequestBuilder groupPolicyDefinitionFiles() {
        return new GroupPolicyDefinitionFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitionFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyDefinitionFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyDefinitionFileRequestBuilder groupPolicyDefinitionFiles(@Nonnull final String id) {
        return new GroupPolicyDefinitionFileRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitionFiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyDefinitionCollectionRequestBuilder groupPolicyDefinitions() {
        return new GroupPolicyDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyDefinitionRequestBuilder groupPolicyDefinitions(@Nonnull final String id) {
        return new GroupPolicyDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyUploadedDefinitionFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyUploadedDefinitionFileCollectionRequestBuilder groupPolicyUploadedDefinitionFiles() {
        return new GroupPolicyUploadedDefinitionFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyUploadedDefinitionFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyUploadedDefinitionFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyUploadedDefinitionFileRequestBuilder groupPolicyUploadedDefinitionFiles(@Nonnull final String id) {
        return new GroupPolicyUploadedDefinitionFileRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyUploadedDefinitionFiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MicrosoftTunnelConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MicrosoftTunnelConfigurationCollectionRequestBuilder microsoftTunnelConfigurations() {
        return new MicrosoftTunnelConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoftTunnelConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the MicrosoftTunnelConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MicrosoftTunnelConfigurationRequestBuilder microsoftTunnelConfigurations(@Nonnull final String id) {
        return new MicrosoftTunnelConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoftTunnelConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MicrosoftTunnelSite collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MicrosoftTunnelSiteCollectionRequestBuilder microsoftTunnelSites() {
        return new MicrosoftTunnelSiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoftTunnelSites"), getClient(), null);
    }

    /**
     * Gets a request builder for the MicrosoftTunnelSite item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MicrosoftTunnelSiteRequestBuilder microsoftTunnelSites(@Nonnull final String id) {
        return new MicrosoftTunnelSiteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoftTunnelSites") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the NotificationMessageTemplate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public NotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates"), getClient(), null);
    }

    /**
     * Gets a request builder for the NotificationMessageTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public NotificationMessageTemplateRequestBuilder notificationMessageTemplates(@Nonnull final String id) {
        return new NotificationMessageTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementDomainJoinConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementDomainJoinConnectorCollectionRequestBuilder domainJoinConnectors() {
        return new DeviceManagementDomainJoinConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("domainJoinConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementDomainJoinConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementDomainJoinConnectorRequestBuilder domainJoinConnectors(@Nonnull final String id) {
        return new DeviceManagementDomainJoinConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("domainJoinConnectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ConfigManagerCollection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConfigManagerCollectionCollectionRequestBuilder configManagerCollections() {
        return new ConfigManagerCollectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("configManagerCollections"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConfigManagerCollection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConfigManagerCollectionRequestBuilder configManagerCollections(@Nonnull final String id) {
        return new ConfigManagerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("configManagerCollections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ResourceOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ResourceOperationCollectionRequestBuilder resourceOperations() {
        return new ResourceOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ResourceOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ResourceOperationRequestBuilder resourceOperations(@Nonnull final String id) {
        return new ResourceOperationRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceAndAppManagementRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceAndAppManagementRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(@Nonnull final String id) {
        return new DeviceAndAppManagementRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RoleDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new RoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the RoleDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RoleDefinitionRequestBuilder roleDefinitions(@Nonnull final String id) {
        return new RoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RoleScopeTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RoleScopeTagCollectionRequestBuilder roleScopeTags() {
        return new RoleScopeTagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags"), getClient(), null);
    }

    /**
     * Gets a request builder for the RoleScopeTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RoleScopeTagRequestBuilder roleScopeTags(@Nonnull final String id) {
        return new RoleScopeTagRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RemoteAssistancePartner collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the RemoteAssistancePartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RemoteAssistancePartnerRequestBuilder remoteAssistancePartners(@Nonnull final String id) {
        return new RemoteAssistancePartnerRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementReports
     *
     * @return the DeviceManagementReportsRequestBuilder instance
     */
    @Nonnull
    public DeviceManagementReportsRequestBuilder reports() {
        return new DeviceManagementReportsRequestBuilder(getRequestUrlWithAdditionalSegment("reports"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EmbeddedSIMActivationCodePool collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EmbeddedSIMActivationCodePoolCollectionRequestBuilder embeddedSIMActivationCodePools() {
        return new EmbeddedSIMActivationCodePoolCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("embeddedSIMActivationCodePools"), getClient(), null);
    }

    /**
     * Gets a request builder for the EmbeddedSIMActivationCodePool item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EmbeddedSIMActivationCodePoolRequestBuilder embeddedSIMActivationCodePools(@Nonnull final String id) {
        return new EmbeddedSIMActivationCodePoolRequestBuilder(getRequestUrlWithAdditionalSegment("embeddedSIMActivationCodePools") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TelecomExpenseManagementPartner collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the TelecomExpenseManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(@Nonnull final String id) {
        return new TelecomExpenseManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementAutopilotEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementAutopilotEventCollectionRequestBuilder autopilotEvents() {
        return new DeviceManagementAutopilotEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("autopilotEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementAutopilotEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementAutopilotEventRequestBuilder autopilotEvents(@Nonnull final String id) {
        return new DeviceManagementAutopilotEventRequestBuilder(getRequestUrlWithAdditionalSegment("autopilotEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(@Nonnull final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsFeatureUpdateProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsFeatureUpdateProfileCollectionRequestBuilder windowsFeatureUpdateProfiles() {
        return new WindowsFeatureUpdateProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsFeatureUpdateProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsFeatureUpdateProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsFeatureUpdateProfileRequestBuilder windowsFeatureUpdateProfiles(@Nonnull final String id) {
        return new WindowsFeatureUpdateProfileRequestBuilder(getRequestUrlWithAdditionalSegment("windowsFeatureUpdateProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IntuneBrandingProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IntuneBrandingProfileCollectionRequestBuilder intuneBrandingProfiles() {
        return new IntuneBrandingProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intuneBrandingProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the IntuneBrandingProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IntuneBrandingProfileRequestBuilder intuneBrandingProfiles(@Nonnull final String id) {
        return new IntuneBrandingProfileRequestBuilder(getRequestUrlWithAdditionalSegment("intuneBrandingProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLearningSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLearningSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(@Nonnull final String id) {
        return new WindowsInformationProtectionAppLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionNetworkLearningSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionNetworkLearningSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(@Nonnull final String id) {
        return new WindowsInformationProtectionNetworkLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserPFXCertificate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserPFXCertificateCollectionRequestBuilder userPfxCertificates() {
        return new UserPFXCertificateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userPfxCertificates"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserPFXCertificate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserPFXCertificateRequestBuilder userPfxCertificates(@Nonnull final String id) {
        return new UserPFXCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("userPfxCertificates") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementEnableAndroidDeviceAdministratorEnrollmentRequestBuilder enableAndroidDeviceAdministratorEnrollment() {
        return new DeviceManagementEnableAndroidDeviceAdministratorEnrollmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.enableAndroidDeviceAdministratorEnrollment"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementEnableLegacyPcManagementRequestBuilder enableLegacyPcManagement() {
        return new DeviceManagementEnableLegacyPcManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.enableLegacyPcManagement"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementEnableUnlicensedAdminstratorsRequestBuilder enableUnlicensedAdminstrators() {
        return new DeviceManagementEnableUnlicensedAdminstratorsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.enableUnlicensedAdminstrators"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(@Nonnull final DeviceManagementSendCustomNotificationToCompanyPortalParameterSet parameters) {
        return new DeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendCustomNotificationToCompanyPortal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions() {
        return new DeviceManagementGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(@Nonnull final DeviceManagementGetEffectivePermissionsParameterSet parameters) {
        return new DeviceManagementGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(@Nonnull final DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet parameters) {
        return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verifyWindowsEnrollmentAutoDiscovery"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementGetComanagedDevicesSummaryRequestBuilder getComanagedDevicesSummary() {
        return new DeviceManagementGetComanagedDevicesSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getComanagedDevicesSummary"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementGetComanagementEligibleDevicesSummaryRequestBuilder getComanagementEligibleDevicesSummary() {
        return new DeviceManagementGetComanagementEligibleDevicesSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getComanagementEligibleDevicesSummary"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementGetSuggestedEnrollmentLimitRequestBuilder getSuggestedEnrollmentLimit(@Nonnull final DeviceManagementGetSuggestedEnrollmentLimitParameterSet parameters) {
        return new DeviceManagementGetSuggestedEnrollmentLimitRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSuggestedEnrollmentLimit"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DeviceManagementGetAssignedRoleDetailsRequestBuilder getAssignedRoleDetails() {
        return new DeviceManagementGetAssignedRoleDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAssignedRoleDetails"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder getRoleScopeTagsByIds(@Nonnull final DeviceManagementGetRoleScopeTagsByIdsParameterSet parameters) {
        return new DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRoleScopeTagsByIds"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder getRoleScopeTagsByResource(@Nonnull final DeviceManagementGetRoleScopeTagsByResourceParameterSet parameters) {
        return new DeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRoleScopeTagsByResource"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementScopedForResourceRequestBuilder scopedForResource(@Nonnull final DeviceManagementScopedForResourceParameterSet parameters) {
        return new DeviceManagementScopedForResourceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.scopedForResource"), getClient(), null, parameters);
    }
}
