// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementReports;
import com.microsoft.graph.requests.DeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementCachedReportConfigurationRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExportJobCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExportJobRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementReportScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementReportScheduleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReportsGetAppsInstallSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetAppStatusOverviewReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetDeviceInstallStatusReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetFailedMobileAppsReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetFailedMobileAppsSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetRelatedAppsStatusReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetUserInstallStatusReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPoliciesReportForDeviceParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicyDevicesReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicySettingsDeviceSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationSettingDetailsReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationSettingsReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetEnrollmentConfigurationPoliciesByDeviceParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetActiveMalwareReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetActiveMalwareSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetMalwareSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetUnhealthyDefenderAgentsReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetUnhealthyFirewallReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetUnhealthyFirewallSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetAllCertificatesReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetCertificatesReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigManagerDevicePolicyStatusReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetCachedReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetCompliancePolicyNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetComplianceSettingNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicyNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationSettingNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetDeviceManagementIntentSettingsReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetDeviceNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetHistoricalReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetPolicyNonComplianceMetadataParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetPolicyNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetPolicyNonComplianceSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetReportFiltersParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetSettingNonComplianceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetWindowsQualityUpdateAlertSummaryReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet;
import com.microsoft.graph.models.DeviceManagementReportsGetWindowsUpdateAlertSummaryReportParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Request Builder.
 */
public class DeviceManagementReportsRequestBuilder extends BaseRequestBuilder<DeviceManagementReports> {

    /**
     * The request builder for the DeviceManagementReports
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementReportsRequest instance
     */
    @Nonnull
    public DeviceManagementReportsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementReportsRequest instance
     */
    @Nonnull
    public DeviceManagementReportsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceManagementReportsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceManagementCachedReportConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementCachedReportConfigurationCollectionRequestBuilder cachedReportConfigurations() {
        return new DeviceManagementCachedReportConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cachedReportConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementCachedReportConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementCachedReportConfigurationRequestBuilder cachedReportConfigurations(@Nonnull final String id) {
        return new DeviceManagementCachedReportConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("cachedReportConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementExportJob collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementExportJobCollectionRequestBuilder exportJobs() {
        return new DeviceManagementExportJobCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exportJobs"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementExportJob item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementExportJobRequestBuilder exportJobs(@Nonnull final String id) {
        return new DeviceManagementExportJobRequestBuilder(getRequestUrlWithAdditionalSegment("exportJobs") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementReportSchedule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementReportScheduleCollectionRequestBuilder reportSchedules() {
        return new DeviceManagementReportScheduleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("reportSchedules"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementReportSchedule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementReportScheduleRequestBuilder reportSchedules(@Nonnull final String id) {
        return new DeviceManagementReportScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("reportSchedules") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetAppsInstallSummaryReportRequestBuilder getAppsInstallSummaryReport(@Nonnull final DeviceManagementReportsGetAppsInstallSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetAppsInstallSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAppsInstallSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetAppStatusOverviewReportRequestBuilder getAppStatusOverviewReport(@Nonnull final DeviceManagementReportsGetAppStatusOverviewReportParameterSet parameters) {
        return new DeviceManagementReportsGetAppStatusOverviewReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAppStatusOverviewReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetDeviceInstallStatusReportRequestBuilder getDeviceInstallStatusReport(@Nonnull final DeviceManagementReportsGetDeviceInstallStatusReportParameterSet parameters) {
        return new DeviceManagementReportsGetDeviceInstallStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getDeviceInstallStatusReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetFailedMobileAppsReportRequestBuilder getFailedMobileAppsReport(@Nonnull final DeviceManagementReportsGetFailedMobileAppsReportParameterSet parameters) {
        return new DeviceManagementReportsGetFailedMobileAppsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFailedMobileAppsReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetFailedMobileAppsSummaryReportRequestBuilder getFailedMobileAppsSummaryReport(@Nonnull final DeviceManagementReportsGetFailedMobileAppsSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetFailedMobileAppsSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFailedMobileAppsSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetRelatedAppsStatusReportRequestBuilder getRelatedAppsStatusReport(@Nonnull final DeviceManagementReportsGetRelatedAppsStatusReportParameterSet parameters) {
        return new DeviceManagementReportsGetRelatedAppsStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRelatedAppsStatusReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetUserInstallStatusReportRequestBuilder getUserInstallStatusReport(@Nonnull final DeviceManagementReportsGetUserInstallStatusReportParameterSet parameters) {
        return new DeviceManagementReportsGetUserInstallStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserInstallStatusReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPoliciesReportForDeviceRequestBuilder getConfigurationPoliciesReportForDevice(@Nonnull final DeviceManagementReportsGetConfigurationPoliciesReportForDeviceParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPoliciesReportForDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPoliciesReportForDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyDevicesReportRequestBuilder getConfigurationPolicyDevicesReport(@Nonnull final DeviceManagementReportsGetConfigurationPolicyDevicesReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPolicyDevicesReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyDevicesReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportRequestBuilder getConfigurationPolicyDeviceSummaryReport(@Nonnull final DeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyDeviceSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder getConfigurationPolicySettingsDeviceSummaryReport(@Nonnull final DeviceManagementReportsGetConfigurationPolicySettingsDeviceSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPolicySettingsDeviceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicySettingsDeviceSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationSettingDetailsReportRequestBuilder getConfigurationSettingDetailsReport(@Nonnull final DeviceManagementReportsGetConfigurationSettingDetailsReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationSettingDetailsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingDetailsReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationSettingsReportRequestBuilder getConfigurationSettingsReport(@Nonnull final DeviceManagementReportsGetConfigurationSettingsReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationSettingsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingsReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetEnrollmentConfigurationPoliciesByDeviceRequestBuilder getEnrollmentConfigurationPoliciesByDevice(@Nonnull final DeviceManagementReportsGetEnrollmentConfigurationPoliciesByDeviceParameterSet parameters) {
        return new DeviceManagementReportsGetEnrollmentConfigurationPoliciesByDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEnrollmentConfigurationPoliciesByDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetActiveMalwareReportRequestBuilder getActiveMalwareReport(@Nonnull final DeviceManagementReportsGetActiveMalwareReportParameterSet parameters) {
        return new DeviceManagementReportsGetActiveMalwareReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActiveMalwareReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetActiveMalwareSummaryReportRequestBuilder getActiveMalwareSummaryReport(@Nonnull final DeviceManagementReportsGetActiveMalwareSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetActiveMalwareSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActiveMalwareSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetMalwareSummaryReportRequestBuilder getMalwareSummaryReport(@Nonnull final DeviceManagementReportsGetMalwareSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetMalwareSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMalwareSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequestBuilder getUnhealthyDefenderAgentsReport(@Nonnull final DeviceManagementReportsGetUnhealthyDefenderAgentsReportParameterSet parameters) {
        return new DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyDefenderAgentsReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetUnhealthyFirewallReportRequestBuilder getUnhealthyFirewallReport(@Nonnull final DeviceManagementReportsGetUnhealthyFirewallReportParameterSet parameters) {
        return new DeviceManagementReportsGetUnhealthyFirewallReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyFirewallReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetUnhealthyFirewallSummaryReportRequestBuilder getUnhealthyFirewallSummaryReport(@Nonnull final DeviceManagementReportsGetUnhealthyFirewallSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetUnhealthyFirewallSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyFirewallSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetAllCertificatesReportRequestBuilder getAllCertificatesReport(@Nonnull final DeviceManagementReportsGetAllCertificatesReportParameterSet parameters) {
        return new DeviceManagementReportsGetAllCertificatesReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAllCertificatesReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetCertificatesReportRequestBuilder getCertificatesReport(@Nonnull final DeviceManagementReportsGetCertificatesReportParameterSet parameters) {
        return new DeviceManagementReportsGetCertificatesReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCertificatesReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigManagerDevicePolicyStatusReportRequestBuilder getConfigManagerDevicePolicyStatusReport(@Nonnull final DeviceManagementReportsGetConfigManagerDevicePolicyStatusReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigManagerDevicePolicyStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigManagerDevicePolicyStatusReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetCachedReportRequestBuilder getCachedReport(@Nonnull final DeviceManagementReportsGetCachedReportParameterSet parameters) {
        return new DeviceManagementReportsGetCachedReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCachedReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport(@Nonnull final DeviceManagementReportsGetCompliancePolicyNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetCompliancePolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCompliancePolicyNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport(@Nonnull final DeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCompliancePolicyNonComplianceSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport(@Nonnull final DeviceManagementReportsGetComplianceSettingNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getComplianceSettingNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport(@Nonnull final DeviceManagementReportsGetConfigurationPolicyNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport(@Nonnull final DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyNonComplianceSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport(@Nonnull final DeviceManagementReportsGetConfigurationSettingNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetDeviceManagementIntentSettingsReportRequestBuilder getDeviceManagementIntentSettingsReport(@Nonnull final DeviceManagementReportsGetDeviceManagementIntentSettingsReportParameterSet parameters) {
        return new DeviceManagementReportsGetDeviceManagementIntentSettingsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getDeviceManagementIntentSettingsReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport(@Nonnull final DeviceManagementReportsGetDeviceNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getDeviceNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetHistoricalReportRequestBuilder getHistoricalReport(@Nonnull final DeviceManagementReportsGetHistoricalReportParameterSet parameters) {
        return new DeviceManagementReportsGetHistoricalReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getHistoricalReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata(@Nonnull final DeviceManagementReportsGetPolicyNonComplianceMetadataParameterSet parameters) {
        return new DeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceMetadata"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport(@Nonnull final DeviceManagementReportsGetPolicyNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetPolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport(@Nonnull final DeviceManagementReportsGetPolicyNonComplianceSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetPolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetReportFiltersRequestBuilder getReportFilters(@Nonnull final DeviceManagementReportsGetReportFiltersParameterSet parameters) {
        return new DeviceManagementReportsGetReportFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getReportFilters"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport(@Nonnull final DeviceManagementReportsGetSettingNonComplianceReportParameterSet parameters) {
        return new DeviceManagementReportsGetSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSettingNonComplianceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport(@Nonnull final DeviceManagementReportsGetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportParameterSet parameters) {
        return new DeviceManagementReportsGetWindowsQualityUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsQualityUpdateAlertsPerPolicyPerDeviceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsQualityUpdateAlertSummaryReportRequestBuilder getWindowsQualityUpdateAlertSummaryReport(@Nonnull final DeviceManagementReportsGetWindowsQualityUpdateAlertSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetWindowsQualityUpdateAlertSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsQualityUpdateAlertSummaryReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsUpdateAlertsPerPolicyPerDeviceReport(@Nonnull final DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet parameters) {
        return new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsUpdateAlertsPerPolicyPerDeviceReport"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsUpdateAlertSummaryReportRequestBuilder getWindowsUpdateAlertSummaryReport(@Nonnull final DeviceManagementReportsGetWindowsUpdateAlertSummaryReportParameterSet parameters) {
        return new DeviceManagementReportsGetWindowsUpdateAlertSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsUpdateAlertSummaryReport"), getClient(), null, parameters);
    }
}
