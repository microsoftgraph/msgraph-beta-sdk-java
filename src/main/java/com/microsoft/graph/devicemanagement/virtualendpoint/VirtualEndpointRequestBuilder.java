package com.microsoft.graph.devicemanagement.virtualendpoint;

import com.microsoft.graph.devicemanagement.virtualendpoint.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.auditevents.item.CloudPcAuditEventItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.cloudpcs.CloudPCsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.cloudpcs.item.CloudPCItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.crosscloudgovernmentorganizationmapping.CrossCloudGovernmentOrganizationMappingRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.deviceimages.DeviceImagesRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.deviceimages.item.CloudPcDeviceImageItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.externalpartnersettings.ExternalPartnerSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.externalpartnersettings.item.CloudPcExternalPartnerSettingItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.galleryimages.GalleryImagesRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.galleryimages.item.CloudPcGalleryImageItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.geteffectivepermissions.GetEffectivePermissionsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.onpremisesconnections.item.CloudPcOnPremisesConnectionItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.onpremisesconnections.OnPremisesConnectionsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.organizationsettings.OrganizationSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.CloudPcProvisioningPolicyItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.ProvisioningPoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.ReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.serviceplans.item.CloudPcServicePlanItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.serviceplans.ServicePlansRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.shareduseserviceplans.item.CloudPcSharedUseServicePlanItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.shareduseserviceplans.SharedUseServicePlansRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.snapshots.item.CloudPcSnapshotItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.snapshots.SnapshotsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.supportedregions.item.CloudPcSupportedRegionItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.supportedregions.SupportedRegionsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.usersettings.item.CloudPcUserSettingItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.usersettings.UserSettingsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEndpoint;
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
/** Provides operations to manage the virtualEndpoint property of the microsoft.graph.deviceManagement entity. */
public class VirtualEndpointRequestBuilder {
    /** Provides operations to manage the auditEvents property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudPCs property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public CloudPCsRequestBuilder cloudPCs() {
        return new CloudPCsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the crossCloudGovernmentOrganizationMapping property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public CrossCloudGovernmentOrganizationMappingRequestBuilder crossCloudGovernmentOrganizationMapping() {
        return new CrossCloudGovernmentOrganizationMappingRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceImages property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public DeviceImagesRequestBuilder deviceImages() {
        return new DeviceImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the externalPartnerSettings property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public ExternalPartnerSettingsRequestBuilder externalPartnerSettings() {
        return new ExternalPartnerSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the galleryImages property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public GalleryImagesRequestBuilder galleryImages() {
        return new GalleryImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onPremisesConnections property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public OnPremisesConnectionsRequestBuilder onPremisesConnections() {
        return new OnPremisesConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the organizationSettings property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public OrganizationSettingsRequestBuilder organizationSettings() {
        return new OrganizationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public ProvisioningPoliciesRequestBuilder provisioningPolicies() {
        return new ProvisioningPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reports property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the servicePlans property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public ServicePlansRequestBuilder servicePlans() {
        return new ServicePlansRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sharedUseServicePlans property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public SharedUseServicePlansRequestBuilder sharedUseServicePlans() {
        return new SharedUseServicePlansRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the snapshots property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public SnapshotsRequestBuilder snapshots() {
        return new SnapshotsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the supportedRegions property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public SupportedRegionsRequestBuilder supportedRegions() {
        return new SupportedRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userSettings property of the microsoft.graph.virtualEndpoint entity. */
    @javax.annotation.Nonnull
    public UserSettingsRequestBuilder userSettings() {
        return new UserSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditEvents property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcAuditEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcAuditEventItemRequestBuilder auditEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcAuditEvent%2Did", id);
        return new CloudPcAuditEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPCs property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPCItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPCItemRequestBuilder cloudPCs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPC%2Did", id);
        return new CloudPCItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VirtualEndpointRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEndpointRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/virtualEndpoint{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new VirtualEndpointRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEndpointRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/virtualEndpoint{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
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
     * Get virtualEndpoint from deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get virtualEndpoint from deviceManagement
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
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final VirtualEndpoint body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final VirtualEndpoint body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Delete navigation property virtualEndpoint for deviceManagement
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
     * Delete navigation property virtualEndpoint for deviceManagement
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
     * Provides operations to manage the deviceImages property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcDeviceImageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcDeviceImageItemRequestBuilder deviceImages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcDeviceImage%2Did", id);
        return new CloudPcDeviceImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the externalPartnerSettings property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcExternalPartnerSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcExternalPartnerSettingItemRequestBuilder externalPartnerSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcExternalPartnerSetting%2Did", id);
        return new CloudPcExternalPartnerSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the galleryImages property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcGalleryImageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcGalleryImageItemRequestBuilder galleryImages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcGalleryImage%2Did", id);
        return new CloudPcGalleryImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @return a CompletableFuture of virtualEndpoint
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VirtualEndpoint> executionException = new java.util.concurrent.CompletableFuture<VirtualEndpoint>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of virtualEndpoint
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VirtualEndpoint> executionException = new java.util.concurrent.CompletableFuture<VirtualEndpoint>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getEffectivePermissions method.
     * @return a getEffectivePermissionsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEffectivePermissionsRequestBuilder getEffectivePermissions() {
        return new GetEffectivePermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onPremisesConnections property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcOnPremisesConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcOnPremisesConnectionItemRequestBuilder onPremisesConnections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcOnPremisesConnection%2Did", id);
        return new CloudPcOnPremisesConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @return a CompletableFuture of virtualEndpoint
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> patch(@javax.annotation.Nonnull final VirtualEndpoint body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VirtualEndpoint> executionException = new java.util.concurrent.CompletableFuture<VirtualEndpoint>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of virtualEndpoint
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> patch(@javax.annotation.Nonnull final VirtualEndpoint body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<VirtualEndpoint> executionException = new java.util.concurrent.CompletableFuture<VirtualEndpoint>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcProvisioningPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcProvisioningPolicyItemRequestBuilder provisioningPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcProvisioningPolicy%2Did", id);
        return new CloudPcProvisioningPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the servicePlans property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcServicePlanItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcServicePlanItemRequestBuilder servicePlans(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcServicePlan%2Did", id);
        return new CloudPcServicePlanItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedUseServicePlans property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcSharedUseServicePlanItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcSharedUseServicePlanItemRequestBuilder sharedUseServicePlans(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSharedUseServicePlan%2Did", id);
        return new CloudPcSharedUseServicePlanItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the snapshots property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcSnapshotItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcSnapshotItemRequestBuilder snapshots(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSnapshot%2Did", id);
        return new CloudPcSnapshotItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the supportedRegions property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcSupportedRegionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcSupportedRegionItemRequestBuilder supportedRegions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSupportedRegion%2Did", id);
        return new CloudPcSupportedRegionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the userSettings property of the microsoft.graph.virtualEndpoint entity.
     * @param id Unique identifier of the item
     * @return a CloudPcUserSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcUserSettingItemRequestBuilder userSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcUserSetting%2Did", id);
        return new CloudPcUserSettingItemRequestBuilder(urlTplParams, requestAdapter);
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
    /** Get virtualEndpoint from deviceManagement */
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
