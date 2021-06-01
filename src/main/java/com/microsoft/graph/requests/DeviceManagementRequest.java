// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.AssignmentFilterStatusDetails;
import com.microsoft.graph.models.RolePermission;
import com.microsoft.graph.models.ComanagedDevicesSummary;
import com.microsoft.graph.models.ComanagementEligibleDevicesSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereDevicesSummary;
import com.microsoft.graph.models.SuggestedEnrollmentLimit;
import com.microsoft.graph.models.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.requests.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.VirtualEndpointRequestBuilder;
import com.microsoft.graph.requests.AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.AuditEventRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.ChromeOSOnboardingSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.ChromeOSOnboardingSettingsRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.CartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.CartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.RestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.RestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.ManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateAccountSummaryRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.NdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.NdesConnectorRequestBuilder;
import com.microsoft.graph.requests.SoftwareUpdateStatusSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyTemplateRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementReusablePolicySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementReusablePolicySettingRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.CloudPCConnectivityIssueCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPCConnectivityIssueRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.ComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.DataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.DataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.DeviceCustomAttributeShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCustomAttributeShellScriptRequestBuilder;
import com.microsoft.graph.requests.DeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.DeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceOverviewWithReferenceRequestBuilder;
import com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.RemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.RemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceWithoutCloudIdentityRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsImpactingProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsImpactingProcessRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsNotAutopilotReadyDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsNotAutopilotReadyDeviceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsRemoteConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsRemoteConnectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsResourcePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsResourcePerformanceRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricRequestBuilder;
import com.microsoft.graph.requests.WindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseRequestBuilder;
import com.microsoft.graph.requests.AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.AppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.DepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.DepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.ImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelConfigurationRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelHealthThresholdCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelHealthThresholdRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelServerLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelServerLogCollectionResponseRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelSiteRequestBuilder;
import com.microsoft.graph.requests.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.ConfigManagerCollectionCollectionRequestBuilder;
import com.microsoft.graph.requests.ConfigManagerCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementReportsRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.WindowsUpdateCatalogItemCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsUpdateCatalogItemRequestBuilder;
import com.microsoft.graph.requests.IntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.IntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.UserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.UserPFXCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request.
 */
public class DeviceManagementRequest extends BaseRequest<DeviceManagement> {
	
    /**
     * The request for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagement.class);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return the DeviceManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagement delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patchAsync(@Nonnull final DeviceManagement sourceDeviceManagement) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return the updated DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement patch(@Nonnull final DeviceManagement sourceDeviceManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> postAsync(@Nonnull final DeviceManagement newDeviceManagement) {
        return sendAsync(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement post(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> putAsync(@Nonnull final DeviceManagement newDeviceManagement) {
        return sendAsync(HttpMethod.PUT, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement put(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

