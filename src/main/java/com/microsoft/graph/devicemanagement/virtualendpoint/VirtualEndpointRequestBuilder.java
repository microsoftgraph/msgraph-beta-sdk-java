package microsoft.graph.devicemanagement.virtualendpoint;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.devicemanagement.virtualendpoint.auditevents.AuditEventsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.auditevents.item.CloudPcAuditEventItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.cloudpcs.CloudPCsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.cloudpcs.item.CloudPCItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.deviceimages.DeviceImagesRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.deviceimages.item.CloudPcDeviceImageItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.galleryimages.GalleryImagesRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.galleryimages.item.CloudPcGalleryImageItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.geteffectivepermissions.GetEffectivePermissionsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.onpremisesconnections.item.CloudPcOnPremisesConnectionItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.onpremisesconnections.OnPremisesConnectionsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.organizationsettings.OrganizationSettingsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.CloudPcProvisioningPolicyItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.ProvisioningPoliciesRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.serviceplans.item.CloudPcServicePlanItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.serviceplans.ServicePlansRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.snapshots.item.CloudPcSnapshotItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.snapshots.SnapshotsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.supportedregions.item.CloudPcSupportedRegionItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.supportedregions.SupportedRegionsRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.usersettings.item.CloudPcUserSettingItemRequestBuilder;
import microsoft.graph.devicemanagement.virtualendpoint.usersettings.UserSettingsRequestBuilder;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.VirtualEndpoint;
/** Provides operations to manage the virtualEndpoint property of the microsoft.graph.deviceManagement entity.  */
public class VirtualEndpointRequestBuilder {
    /** The auditEvents property  */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudPCs property  */
    @javax.annotation.Nonnull
    public CloudPCsRequestBuilder cloudPCs() {
        return new CloudPCsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceImages property  */
    @javax.annotation.Nonnull
    public DeviceImagesRequestBuilder deviceImages() {
        return new DeviceImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The galleryImages property  */
    @javax.annotation.Nonnull
    public GalleryImagesRequestBuilder galleryImages() {
        return new GalleryImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onPremisesConnections property  */
    @javax.annotation.Nonnull
    public OnPremisesConnectionsRequestBuilder onPremisesConnections() {
        return new OnPremisesConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organizationSettings property  */
    @javax.annotation.Nonnull
    public OrganizationSettingsRequestBuilder organizationSettings() {
        return new OrganizationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The provisioningPolicies property  */
    @javax.annotation.Nonnull
    public ProvisioningPoliciesRequestBuilder provisioningPolicies() {
        return new ProvisioningPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The servicePlans property  */
    @javax.annotation.Nonnull
    public ServicePlansRequestBuilder servicePlans() {
        return new ServicePlansRequestBuilder(pathParameters, requestAdapter);
    }
    /** The snapshots property  */
    @javax.annotation.Nonnull
    public SnapshotsRequestBuilder snapshots() {
        return new SnapshotsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The supportedRegions property  */
    @javax.annotation.Nonnull
    public SupportedRegionsRequestBuilder supportedRegions() {
        return new SupportedRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /** The userSettings property  */
    @javax.annotation.Nonnull
    public UserSettingsRequestBuilder userSettings() {
        return new UserSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.auditEvents.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcAuditEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcAuditEventItemRequestBuilder auditEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcAuditEvent%2Did", id);
        return new CloudPcAuditEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.cloudPCs.item collection
     * @param id Unique identifier of the item
     * @return a cloudPCItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPCItemRequestBuilder cloudPCs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPC%2Did", id);
        return new CloudPCItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VirtualEndpointRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public VirtualEndpointRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/virtualEndpoint{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new VirtualEndpointRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public VirtualEndpointRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/virtualEndpoint{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
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
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final VirtualEndpointRequestBuilderDeleteRequestConfiguration requestConfig = new VirtualEndpointRequestBuilderDeleteRequestConfiguration();
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
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final VirtualEndpointRequestBuilderGetRequestConfiguration requestConfig = new VirtualEndpointRequestBuilderGetRequestConfiguration();
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
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final VirtualEndpoint body, @javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final VirtualEndpointRequestBuilderPatchRequestConfiguration requestConfig = new VirtualEndpointRequestBuilderPatchRequestConfiguration();
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
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.deviceImages.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcDeviceImageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcDeviceImageItemRequestBuilder deviceImages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcDeviceImage%2Did", id);
        return new CloudPcDeviceImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.galleryImages.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcGalleryImageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcGalleryImageItemRequestBuilder galleryImages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcGalleryImage%2Did", id);
        return new CloudPcGalleryImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @return a CompletableFuture of virtualEndpoint
     */
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of virtualEndpoint
     */
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> get(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of virtualEndpoint
     */
    public java.util.concurrent.CompletableFuture<VirtualEndpoint> get(@javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, VirtualEndpoint::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
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
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.onPremisesConnections.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcOnPremisesConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcOnPremisesConnectionItemRequestBuilder onPremisesConnections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcOnPremisesConnection%2Did", id);
        return new CloudPcOnPremisesConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final VirtualEndpoint body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final VirtualEndpoint body, @javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final VirtualEndpoint body, @javax.annotation.Nullable final java.util.function.Consumer<VirtualEndpointRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.provisioningPolicies.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcProvisioningPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcProvisioningPolicyItemRequestBuilder provisioningPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcProvisioningPolicy%2Did", id);
        return new CloudPcProvisioningPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.servicePlans.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcServicePlanItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcServicePlanItemRequestBuilder servicePlans(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcServicePlan%2Did", id);
        return new CloudPcServicePlanItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.snapshots.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcSnapshotItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcSnapshotItemRequestBuilder snapshots(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSnapshot%2Did", id);
        return new CloudPcSnapshotItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.supportedRegions.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcSupportedRegionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcSupportedRegionItemRequestBuilder supportedRegions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSupportedRegion%2Did", id);
        return new CloudPcSupportedRegionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.virtualEndpoint.userSettings.item collection
     * @param id Unique identifier of the item
     * @return a cloudPcUserSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcUserSettingItemRequestBuilder userSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcUserSetting%2Did", id);
        return new CloudPcUserSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class VirtualEndpointRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new virtualEndpointRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public VirtualEndpointRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get virtualEndpoint from deviceManagement  */
    public class VirtualEndpointRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class VirtualEndpointRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public VirtualEndpointRequestBuilderGetQueryParameters queryParameters = new VirtualEndpointRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new virtualEndpointRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public VirtualEndpointRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class VirtualEndpointRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new virtualEndpointRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public VirtualEndpointRequestBuilderPatchRequestConfiguration() {
        }
    }
}
