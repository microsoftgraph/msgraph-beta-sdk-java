package com.microsoft.graph.tenantrelationships.managedtenants;

import com.microsoft.graph.models.managedtenants.ManagedTenant;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.tenantrelationships.managedtenants.aggregatedpolicycompliances.AggregatedPolicyCompliancesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.aggregatedpolicycompliances.item.AggregatedPolicyComplianceItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.auditevents.item.AuditEventItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcconnections.CloudPcConnectionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcconnections.item.CloudPcConnectionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcdevices.CloudPcDevicesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcdevices.item.CloudPcDeviceItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcsoverview.CloudPcsOverviewRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.cloudpcsoverview.item.CloudPcOverviewTenantItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.conditionalaccesspolicycoverages.ConditionalAccessPolicyCoveragesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.conditionalaccesspolicycoverages.item.ConditionalAccessPolicyCoverageItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.credentialuserregistrationssummaries.CredentialUserRegistrationsSummariesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.credentialuserregistrationssummaries.item.CredentialUserRegistrationsSummaryItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.devicecompliancepolicysettingstatesummaries.DeviceCompliancePolicySettingStateSummariesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.devicecompliancepolicysettingstatesummaries.item.DeviceCompliancePolicySettingStateSummaryItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.manageddevicecompliances.item.ManagedDeviceComplianceItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.manageddevicecompliances.ManagedDeviceCompliancesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.manageddevicecompliancetrends.item.ManagedDeviceComplianceTrendItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.manageddevicecompliancetrends.ManagedDeviceComplianceTrendsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertlogs.item.ManagedTenantAlertLogItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertlogs.ManagedTenantAlertLogsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertruledefinitions.item.ManagedTenantAlertRuleDefinitionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertruledefinitions.ManagedTenantAlertRuleDefinitionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertrules.item.ManagedTenantAlertRuleItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalertrules.ManagedTenantAlertRulesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.ManagedTenantAlertItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.ManagedTenantAlertsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantapinotifications.item.ManagedTenantApiNotificationItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantapinotifications.ManagedTenantApiNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantemailnotifications.item.ManagedTenantEmailNotificationItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantemailnotifications.ManagedTenantEmailNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantticketingendpoints.item.ManagedTenantTicketingEndpointItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantticketingendpoints.ManagedTenantTicketingEndpointsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactions.item.ManagementActionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactions.ManagementActionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.item.ManagementActionTenantDeploymentStatusItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.ManagementActionTenantDeploymentStatusesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementintents.item.ManagementIntentItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementintents.ManagementIntentsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollections.item.ManagementTemplateCollectionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollections.ManagementTemplateCollectionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollectiontenantsummaries.item.ManagementTemplateCollectionTenantSummaryItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollectiontenantsummaries.ManagementTemplateCollectionTenantSummariesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplates.item.ManagementTemplateItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplates.ManagementTemplatesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteps.item.ManagementTemplateStepItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteps.ManagementTemplateStepsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteptenantsummaries.item.ManagementTemplateStepTenantSummaryItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteptenantsummaries.ManagementTemplateStepTenantSummariesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatestepversions.item.ManagementTemplateStepVersionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatestepversions.ManagementTemplateStepVersionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.myroles.item.MyRoleTenantItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.myroles.MyRolesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantgroups.item.TenantGroupItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantgroups.TenantGroupsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenants.item.TenantItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenants.TenantsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantscustomizedinformation.item.TenantCustomizedInformationItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantscustomizedinformation.TenantsCustomizedInformationRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantsdetailedinformation.item.TenantDetailedInformationItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenantsdetailedinformation.TenantsDetailedInformationRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenanttags.item.TenantTagItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.tenanttags.TenantTagsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.windowsdevicemalwarestates.item.WindowsDeviceMalwareStateItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.windowsdevicemalwarestates.WindowsDeviceMalwareStatesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.windowsprotectionstates.item.WindowsProtectionStateItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.windowsprotectionstates.WindowsProtectionStatesRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the managedTenants property of the microsoft.graph.tenantRelationship entity. */
public class ManagedTenantsRequestBuilder {
    /** Provides operations to manage the aggregatedPolicyCompliances property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public AggregatedPolicyCompliancesRequestBuilder aggregatedPolicyCompliances() {
        return new AggregatedPolicyCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the auditEvents property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudPcConnections property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public CloudPcConnectionsRequestBuilder cloudPcConnections() {
        return new CloudPcConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudPcDevices property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public CloudPcDevicesRequestBuilder cloudPcDevices() {
        return new CloudPcDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudPcsOverview property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public CloudPcsOverviewRequestBuilder cloudPcsOverview() {
        return new CloudPcsOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the conditionalAccessPolicyCoverages property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ConditionalAccessPolicyCoveragesRequestBuilder conditionalAccessPolicyCoverages() {
        return new ConditionalAccessPolicyCoveragesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the credentialUserRegistrationsSummaries property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public CredentialUserRegistrationsSummariesRequestBuilder credentialUserRegistrationsSummaries() {
        return new CredentialUserRegistrationsSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceCompliances property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceCompliancesRequestBuilder managedDeviceCompliances() {
        return new ManagedDeviceCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceComplianceTrends property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceComplianceTrendsRequestBuilder managedDeviceComplianceTrends() {
        return new ManagedDeviceComplianceTrendsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantAlertLogs property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantAlertLogsRequestBuilder managedTenantAlertLogs() {
        return new ManagedTenantAlertLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantAlertRuleDefinitions property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantAlertRuleDefinitionsRequestBuilder managedTenantAlertRuleDefinitions() {
        return new ManagedTenantAlertRuleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantAlertRules property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantAlertRulesRequestBuilder managedTenantAlertRules() {
        return new ManagedTenantAlertRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantAlerts property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantAlertsRequestBuilder managedTenantAlerts() {
        return new ManagedTenantAlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantApiNotifications property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantApiNotificationsRequestBuilder managedTenantApiNotifications() {
        return new ManagedTenantApiNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantEmailNotifications property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantEmailNotificationsRequestBuilder managedTenantEmailNotifications() {
        return new ManagedTenantEmailNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenantTicketingEndpoints property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagedTenantTicketingEndpointsRequestBuilder managedTenantTicketingEndpoints() {
        return new ManagedTenantTicketingEndpointsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementActions property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementActionsRequestBuilder managementActions() {
        return new ManagementActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementActionTenantDeploymentStatuses property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementActionTenantDeploymentStatusesRequestBuilder managementActionTenantDeploymentStatuses() {
        return new ManagementActionTenantDeploymentStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementIntents property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementIntentsRequestBuilder managementIntents() {
        return new ManagementIntentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplateCollections property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplateCollectionsRequestBuilder managementTemplateCollections() {
        return new ManagementTemplateCollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplateCollectionTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplateCollectionTenantSummariesRequestBuilder managementTemplateCollectionTenantSummaries() {
        return new ManagementTemplateCollectionTenantSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplates property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplatesRequestBuilder managementTemplates() {
        return new ManagementTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplateSteps property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplateStepsRequestBuilder managementTemplateSteps() {
        return new ManagementTemplateStepsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplateStepTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplateStepTenantSummariesRequestBuilder managementTemplateStepTenantSummaries() {
        return new ManagementTemplateStepTenantSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managementTemplateStepVersions property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public ManagementTemplateStepVersionsRequestBuilder managementTemplateStepVersions() {
        return new ManagementTemplateStepVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the myRoles property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public MyRolesRequestBuilder myRoles() {
        return new MyRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the tenantGroups property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public TenantGroupsRequestBuilder tenantGroups() {
        return new TenantGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenants property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenantsCustomizedInformation property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public TenantsCustomizedInformationRequestBuilder tenantsCustomizedInformation() {
        return new TenantsCustomizedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenantsDetailedInformation property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public TenantsDetailedInformationRequestBuilder tenantsDetailedInformation() {
        return new TenantsDetailedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenantTags property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public TenantTagsRequestBuilder tenantTags() {
        return new TenantTagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the windowsDeviceMalwareStates property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public WindowsDeviceMalwareStatesRequestBuilder windowsDeviceMalwareStates() {
        return new WindowsDeviceMalwareStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsProtectionStates property of the microsoft.graph.managedTenants.managedTenant entity. */
    @javax.annotation.Nonnull
    public WindowsProtectionStatesRequestBuilder windowsProtectionStates() {
        return new WindowsProtectionStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the aggregatedPolicyCompliances property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a AggregatedPolicyComplianceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AggregatedPolicyComplianceItemRequestBuilder aggregatedPolicyCompliances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("aggregatedPolicyCompliance%2Did", id);
        return new AggregatedPolicyComplianceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the auditEvents property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a AuditEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AuditEventItemRequestBuilder auditEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("auditEvent%2Did", id);
        return new AuditEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcConnections property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a CloudPcConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcConnectionItemRequestBuilder cloudPcConnections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcConnection%2Did", id);
        return new CloudPcConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcDevices property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a CloudPcDeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcDeviceItemRequestBuilder cloudPcDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcDevice%2Did", id);
        return new CloudPcDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPcsOverview property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a CloudPcOverviewTenantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcOverviewTenantItemRequestBuilder cloudPcsOverview(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcOverview%2DtenantId", id);
        return new CloudPcOverviewTenantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessPolicyCoverages property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ConditionalAccessPolicyCoverageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConditionalAccessPolicyCoverageItemRequestBuilder conditionalAccessPolicyCoverages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conditionalAccessPolicyCoverage%2Did", id);
        return new ConditionalAccessPolicyCoverageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagedTenantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/tenantRelationships/managedTenants{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedTenantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/tenantRelationships/managedTenants{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedTenant body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedTenant body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the credentialUserRegistrationsSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a CredentialUserRegistrationsSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CredentialUserRegistrationsSummaryItemRequestBuilder credentialUserRegistrationsSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credentialUserRegistrationsSummary%2Did", id);
        return new CredentialUserRegistrationsSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicySettingStateSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummaryItemRequestBuilder deviceCompliancePolicySettingStateSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicySettingStateSummary%2Did", id);
        return new DeviceCompliancePolicySettingStateSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagedTenant> executionException = new java.util.concurrent.CompletableFuture<ManagedTenant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagedTenant> executionException = new java.util.concurrent.CompletableFuture<ManagedTenant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the managedDeviceCompliances property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceComplianceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceComplianceItemRequestBuilder managedDeviceCompliances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceCompliance%2Did", id);
        return new ManagedDeviceComplianceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceComplianceTrends property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceComplianceTrendItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceComplianceTrendItemRequestBuilder managedDeviceComplianceTrends(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceComplianceTrend%2Did", id);
        return new ManagedDeviceComplianceTrendItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertLogs property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantAlertLogItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantAlertLogItemRequestBuilder managedTenantAlertLogs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantAlertLog%2Did", id);
        return new ManagedTenantAlertLogItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertRuleDefinitions property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantAlertRuleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantAlertRuleDefinitionItemRequestBuilder managedTenantAlertRuleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantAlertRuleDefinition%2Did", id);
        return new ManagedTenantAlertRuleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlertRules property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantAlertRuleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantAlertRuleItemRequestBuilder managedTenantAlertRules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantAlertRule%2Did", id);
        return new ManagedTenantAlertRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantAlerts property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantAlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantAlertItemRequestBuilder managedTenantAlerts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantAlert%2Did", id);
        return new ManagedTenantAlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantApiNotifications property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantApiNotificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantApiNotificationItemRequestBuilder managedTenantApiNotifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantApiNotification%2Did", id);
        return new ManagedTenantApiNotificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantEmailNotifications property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantEmailNotificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantEmailNotificationItemRequestBuilder managedTenantEmailNotifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantEmailNotification%2Did", id);
        return new ManagedTenantEmailNotificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedTenantTicketingEndpoints property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagedTenantTicketingEndpointItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantTicketingEndpointItemRequestBuilder managedTenantTicketingEndpoints(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantTicketingEndpoint%2Did", id);
        return new ManagedTenantTicketingEndpointItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementActions property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementActionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementActionItemRequestBuilder managementActions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementAction%2Did", id);
        return new ManagementActionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementActionTenantDeploymentStatuses property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementActionTenantDeploymentStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementActionTenantDeploymentStatusItemRequestBuilder managementActionTenantDeploymentStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementActionTenantDeploymentStatus%2Did", id);
        return new ManagementActionTenantDeploymentStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementIntents property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementIntentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementIntentItemRequestBuilder managementIntents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementIntent%2Did", id);
        return new ManagementIntentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateCollections property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateCollectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateCollectionItemRequestBuilder managementTemplateCollections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplateCollection%2Did", id);
        return new ManagementTemplateCollectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateCollectionTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateCollectionTenantSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateCollectionTenantSummaryItemRequestBuilder managementTemplateCollectionTenantSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplateCollectionTenantSummary%2Did", id);
        return new ManagementTemplateCollectionTenantSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplates property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateItemRequestBuilder managementTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplate%2Did", id);
        return new ManagementTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateSteps property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateStepItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateStepItemRequestBuilder managementTemplateSteps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplateStep%2Did", id);
        return new ManagementTemplateStepItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateStepTenantSummaries property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateStepTenantSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateStepTenantSummaryItemRequestBuilder managementTemplateStepTenantSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplateStepTenantSummary%2Did", id);
        return new ManagementTemplateStepTenantSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managementTemplateStepVersions property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a ManagementTemplateStepVersionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementTemplateStepVersionItemRequestBuilder managementTemplateStepVersions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementTemplateStepVersion%2Did", id);
        return new ManagementTemplateStepVersionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the myRoles property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a MyRoleTenantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MyRoleTenantItemRequestBuilder myRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("myRole%2DtenantId", id);
        return new MyRoleTenantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body 
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> patch(@javax.annotation.Nonnull final ManagedTenant body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagedTenant> executionException = new java.util.concurrent.CompletableFuture<ManagedTenant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> patch(@javax.annotation.Nonnull final ManagedTenant body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagedTenant> executionException = new java.util.concurrent.CompletableFuture<ManagedTenant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the tenantGroups property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a TenantGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TenantGroupItemRequestBuilder tenantGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenantGroup%2Did", id);
        return new TenantGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tenants property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a TenantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TenantItemRequestBuilder tenants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenant%2Did", id);
        return new TenantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantsCustomizedInformation property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a TenantCustomizedInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TenantCustomizedInformationItemRequestBuilder tenantsCustomizedInformation(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenantCustomizedInformation%2Did", id);
        return new TenantCustomizedInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantsDetailedInformation property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a TenantDetailedInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TenantDetailedInformationItemRequestBuilder tenantsDetailedInformation(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenantDetailedInformation%2Did", id);
        return new TenantDetailedInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantTags property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a TenantTagItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TenantTagItemRequestBuilder tenantTags(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenantTag%2Did", id);
        return new TenantTagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsDeviceMalwareStates property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a WindowsDeviceMalwareStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsDeviceMalwareStateItemRequestBuilder windowsDeviceMalwareStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsDeviceMalwareState%2Did", id);
        return new WindowsDeviceMalwareStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsProtectionStates property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param id Unique identifier of the item
     * @return a WindowsProtectionStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsProtectionStateItemRequestBuilder windowsProtectionStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsProtectionState%2Did", id);
        return new WindowsProtectionStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** The operations available to interact with the multi-tenant management platform. */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
