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
import com.microsoft.graph.tenantrelationships.managedtenants.managementactions.item.ManagementActionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactions.ManagementActionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.item.ManagementActionTenantDeploymentStatusItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.ManagementActionTenantDeploymentStatusesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementintents.item.ManagementIntentItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementintents.ManagementIntentsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollections.item.ManagementTemplateCollectionItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatecollections.ManagementTemplateCollectionsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplates.item.ManagementTemplateItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplates.ManagementTemplatesRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteps.item.ManagementTemplateStepItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementtemplatesteps.ManagementTemplateStepsRequestBuilder;
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
    /** The aggregatedPolicyCompliances property */
    @javax.annotation.Nonnull
    public AggregatedPolicyCompliancesRequestBuilder aggregatedPolicyCompliances() {
        return new AggregatedPolicyCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The auditEvents property */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudPcConnections property */
    @javax.annotation.Nonnull
    public CloudPcConnectionsRequestBuilder cloudPcConnections() {
        return new CloudPcConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudPcDevices property */
    @javax.annotation.Nonnull
    public CloudPcDevicesRequestBuilder cloudPcDevices() {
        return new CloudPcDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudPcsOverview property */
    @javax.annotation.Nonnull
    public CloudPcsOverviewRequestBuilder cloudPcsOverview() {
        return new CloudPcsOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The conditionalAccessPolicyCoverages property */
    @javax.annotation.Nonnull
    public ConditionalAccessPolicyCoveragesRequestBuilder conditionalAccessPolicyCoverages() {
        return new ConditionalAccessPolicyCoveragesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The credentialUserRegistrationsSummaries property */
    @javax.annotation.Nonnull
    public CredentialUserRegistrationsSummariesRequestBuilder credentialUserRegistrationsSummaries() {
        return new CredentialUserRegistrationsSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicySettingStateSummaries property */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDeviceCompliances property */
    @javax.annotation.Nonnull
    public ManagedDeviceCompliancesRequestBuilder managedDeviceCompliances() {
        return new ManagedDeviceCompliancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDeviceComplianceTrends property */
    @javax.annotation.Nonnull
    public ManagedDeviceComplianceTrendsRequestBuilder managedDeviceComplianceTrends() {
        return new ManagedDeviceComplianceTrendsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementActions property */
    @javax.annotation.Nonnull
    public ManagementActionsRequestBuilder managementActions() {
        return new ManagementActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementActionTenantDeploymentStatuses property */
    @javax.annotation.Nonnull
    public ManagementActionTenantDeploymentStatusesRequestBuilder managementActionTenantDeploymentStatuses() {
        return new ManagementActionTenantDeploymentStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementIntents property */
    @javax.annotation.Nonnull
    public ManagementIntentsRequestBuilder managementIntents() {
        return new ManagementIntentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementTemplateCollections property */
    @javax.annotation.Nonnull
    public ManagementTemplateCollectionsRequestBuilder managementTemplateCollections() {
        return new ManagementTemplateCollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementTemplates property */
    @javax.annotation.Nonnull
    public ManagementTemplatesRequestBuilder managementTemplates() {
        return new ManagementTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementTemplateSteps property */
    @javax.annotation.Nonnull
    public ManagementTemplateStepsRequestBuilder managementTemplateSteps() {
        return new ManagementTemplateStepsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managementTemplateStepVersions property */
    @javax.annotation.Nonnull
    public ManagementTemplateStepVersionsRequestBuilder managementTemplateStepVersions() {
        return new ManagementTemplateStepVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The myRoles property */
    @javax.annotation.Nonnull
    public MyRolesRequestBuilder myRoles() {
        return new MyRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The tenantGroups property */
    @javax.annotation.Nonnull
    public TenantGroupsRequestBuilder tenantGroups() {
        return new TenantGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tenants property */
    @javax.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tenantsCustomizedInformation property */
    @javax.annotation.Nonnull
    public TenantsCustomizedInformationRequestBuilder tenantsCustomizedInformation() {
        return new TenantsCustomizedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tenantsDetailedInformation property */
    @javax.annotation.Nonnull
    public TenantsDetailedInformationRequestBuilder tenantsDetailedInformation() {
        return new TenantsDetailedInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tenantTags property */
    @javax.annotation.Nonnull
    public TenantTagsRequestBuilder tenantTags() {
        return new TenantTagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** The windowsDeviceMalwareStates property */
    @javax.annotation.Nonnull
    public WindowsDeviceMalwareStatesRequestBuilder windowsDeviceMalwareStates() {
        return new WindowsDeviceMalwareStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsProtectionStates property */
    @javax.annotation.Nonnull
    public WindowsProtectionStatesRequestBuilder windowsProtectionStates() {
        return new WindowsProtectionStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.aggregatedPolicyCompliances.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.auditEvents.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.cloudPcConnections.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.cloudPcDevices.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.cloudPcsOverview.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.conditionalAccessPolicyCoverages.item collection
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
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ManagedTenantsRequestBuilderDeleteRequestConfiguration requestConfig = new ManagedTenantsRequestBuilderDeleteRequestConfiguration();
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
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ManagedTenantsRequestBuilderGetRequestConfiguration requestConfig = new ManagedTenantsRequestBuilderGetRequestConfiguration();
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
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedTenant body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ManagedTenantsRequestBuilderPatchRequestConfiguration requestConfig = new ManagedTenantsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.credentialUserRegistrationsSummaries.item collection
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
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property managedTenants for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.deviceCompliancePolicySettingStateSummaries.item collection
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
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenant>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The operations available to interact with the multi-tenant management platform.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenant>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managedDeviceCompliances.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managedDeviceComplianceTrends.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementActions.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementActionTenantDeploymentStatuses.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementIntents.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementTemplateCollections.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementTemplates.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementTemplateSteps.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managementTemplateStepVersions.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.myRoles.item collection
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
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenant>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property managedTenants in tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> patch(@javax.annotation.Nonnull final ManagedTenant body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenant>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.tenantGroups.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.tenants.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.tenantsCustomizedInformation.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.tenantsDetailedInformation.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.tenantTags.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.windowsDeviceMalwareStates.item collection
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
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.windowsProtectionStates.item collection
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
    public class ManagedTenantsRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new managedTenantsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The operations available to interact with the multi-tenant management platform. */
    public class ManagedTenantsRequestBuilderGetQueryParameters {
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
    public class ManagedTenantsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedTenantsRequestBuilderGetQueryParameters queryParameters = new ManagedTenantsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new managedTenantsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedTenantsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new managedTenantsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
