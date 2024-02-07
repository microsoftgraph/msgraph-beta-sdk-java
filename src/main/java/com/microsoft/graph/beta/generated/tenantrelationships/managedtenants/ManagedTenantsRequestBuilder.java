package com.microsoft.graph.beta.tenantrelationships.managedtenants;

import com.microsoft.graph.beta.models.managedtenants.ManagedTenant;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.aggregatedpolicycompliances.AggregatedPolicyCompliancesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.appperformances.AppPerformancesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.cloudpcconnections.CloudPcConnectionsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.cloudpcdevices.CloudPcDevicesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.cloudpcsoverview.CloudPcsOverviewRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.conditionalaccesspolicycoverages.ConditionalAccessPolicyCoveragesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.credentialuserregistrationssummaries.CredentialUserRegistrationsSummariesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.deviceappperformances.DeviceAppPerformancesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.devicecompliancepolicysettingstatesummaries.DeviceCompliancePolicySettingStateSummariesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.devicehealthstatuses.DeviceHealthStatusesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.manageddevicecompliances.ManagedDeviceCompliancesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.manageddevicecompliancetrends.ManagedDeviceComplianceTrendsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantalertlogs.ManagedTenantAlertLogsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantalertruledefinitions.ManagedTenantAlertRuleDefinitionsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantalertrules.ManagedTenantAlertRulesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantalerts.ManagedTenantAlertsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantapinotifications.ManagedTenantApiNotificationsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantemailnotifications.ManagedTenantEmailNotificationsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managedtenantticketingendpoints.ManagedTenantTicketingEndpointsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementactions.ManagementActionsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.ManagementActionTenantDeploymentStatusesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementintents.ManagementIntentsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatecollections.ManagementTemplateCollectionsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatecollectiontenantsummaries.ManagementTemplateCollectionTenantSummariesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplates.ManagementTemplatesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatesteps.ManagementTemplateStepsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatesteptenantsummaries.ManagementTemplateStepTenantSummariesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatestepversions.ManagementTemplateStepVersionsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.myroles.MyRolesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.tenantgroups.TenantGroupsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.tenants.TenantsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.tenantscustomizedinformation.TenantsCustomizedInformationRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.tenantsdetailedinformation.TenantsDetailedInformationRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.tenanttags.TenantTagsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.windowsdevicemalwarestates.WindowsDeviceMalwareStatesRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.windowsprotectionstates.WindowsProtectionStatesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the managedTenants property of the microsoft.graph.tenantRelationship entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the aggregatedPolicyCompliances property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public AggregatedPolicyCompliancesRequestBuilder aggregatedPolicyCompliances() {
        return new AggregatedPolicyCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appPerformances property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public AppPerformancesRequestBuilder appPerformances() {
        return new AppPerformancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditEvents property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcConnections property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public CloudPcConnectionsRequestBuilder cloudPcConnections() {
        return new CloudPcConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcDevices property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public CloudPcDevicesRequestBuilder cloudPcDevices() {
        return new CloudPcDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcsOverview property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public CloudPcsOverviewRequestBuilder cloudPcsOverview() {
        return new CloudPcsOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessPolicyCoverages property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ConditionalAccessPolicyCoveragesRequestBuilder conditionalAccessPolicyCoverages() {
        return new ConditionalAccessPolicyCoveragesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the credentialUserRegistrationsSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public CredentialUserRegistrationsSummariesRequestBuilder credentialUserRegistrationsSummaries() {
        return new CredentialUserRegistrationsSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceAppPerformances property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceAppPerformancesRequestBuilder deviceAppPerformances() {
        return new DeviceAppPerformancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceHealthStatuses property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceHealthStatusesRequestBuilder deviceHealthStatuses() {
        return new DeviceHealthStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceCompliances property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceCompliancesRequestBuilder managedDeviceCompliances() {
        return new ManagedDeviceCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceComplianceTrends property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceComplianceTrendsRequestBuilder managedDeviceComplianceTrends() {
        return new ManagedDeviceComplianceTrendsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertLogs property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantAlertLogsRequestBuilder managedTenantAlertLogs() {
        return new ManagedTenantAlertLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertRuleDefinitions property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantAlertRuleDefinitionsRequestBuilder managedTenantAlertRuleDefinitions() {
        return new ManagedTenantAlertRuleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertRules property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantAlertRulesRequestBuilder managedTenantAlertRules() {
        return new ManagedTenantAlertRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlerts property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantAlertsRequestBuilder managedTenantAlerts() {
        return new ManagedTenantAlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantApiNotifications property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantApiNotificationsRequestBuilder managedTenantApiNotifications() {
        return new ManagedTenantApiNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantEmailNotifications property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantEmailNotificationsRequestBuilder managedTenantEmailNotifications() {
        return new ManagedTenantEmailNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantTicketingEndpoints property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantTicketingEndpointsRequestBuilder managedTenantTicketingEndpoints() {
        return new ManagedTenantTicketingEndpointsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementActions property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementActionsRequestBuilder managementActions() {
        return new ManagementActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementActionTenantDeploymentStatuses property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementActionTenantDeploymentStatusesRequestBuilder managementActionTenantDeploymentStatuses() {
        return new ManagementActionTenantDeploymentStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementIntents property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementIntentsRequestBuilder managementIntents() {
        return new ManagementIntentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateCollections property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateCollectionsRequestBuilder managementTemplateCollections() {
        return new ManagementTemplateCollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateCollectionTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateCollectionTenantSummariesRequestBuilder managementTemplateCollectionTenantSummaries() {
        return new ManagementTemplateCollectionTenantSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplates property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplatesRequestBuilder managementTemplates() {
        return new ManagementTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateSteps property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateStepsRequestBuilder managementTemplateSteps() {
        return new ManagementTemplateStepsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateStepTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateStepTenantSummariesRequestBuilder managementTemplateStepTenantSummaries() {
        return new ManagementTemplateStepTenantSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateStepVersions property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateStepVersionsRequestBuilder managementTemplateStepVersions() {
        return new ManagementTemplateStepVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the myRoles property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public MyRolesRequestBuilder myRoles() {
        return new MyRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantGroups property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public TenantGroupsRequestBuilder tenantGroups() {
        return new TenantGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenants property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantsCustomizedInformation property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public TenantsCustomizedInformationRequestBuilder tenantsCustomizedInformation() {
        return new TenantsCustomizedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantsDetailedInformation property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public TenantsDetailedInformationRequestBuilder tenantsDetailedInformation() {
        return new TenantsDetailedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantTags property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public TenantTagsRequestBuilder tenantTags() {
        return new TenantTagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsDeviceMalwareStates property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsDeviceMalwareStatesRequestBuilder windowsDeviceMalwareStates() {
        return new WindowsDeviceMalwareStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsProtectionStates property of the microsoft.graph.managedTenants.managedTenant entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsProtectionStatesRequestBuilder windowsProtectionStates() {
        return new WindowsProtectionStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ManagedTenantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedTenantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new ManagedTenantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedTenantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @return a ManagedTenant
     */
    @jakarta.annotation.Nullable
    public ManagedTenant get() {
        return get(null);
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedTenant
     */
    @jakarta.annotation.Nullable
    public ManagedTenant get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedTenant::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body The request body
     * @return a ManagedTenant
     */
    @jakarta.annotation.Nullable
    public ManagedTenant patch(@jakarta.annotation.Nonnull final ManagedTenant body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedTenant
     */
    @jakarta.annotation.Nullable
    public ManagedTenant patch(@jakarta.annotation.Nonnull final ManagedTenant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedTenant::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedTenant body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedTenant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ManagedTenantsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedTenantsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
