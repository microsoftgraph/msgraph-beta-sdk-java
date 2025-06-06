package com.microsoft.graph.beta.devicemanagement.virtualendpoint;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.bulkactions.BulkActionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.CloudPCsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.crosscloudgovernmentorganizationmapping.CrossCloudGovernmentOrganizationMappingRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.deviceimages.DeviceImagesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.externalpartnersettings.ExternalPartnerSettingsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.frontlineserviceplans.FrontLineServicePlansRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.galleryimages.GalleryImagesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.geteffectivepermissions.GetEffectivePermissionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.onpremisesconnections.OnPremisesConnectionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.organizationsettings.OrganizationSettingsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.ProvisioningPoliciesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.ReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.retrievescopedpermissions.RetrieveScopedPermissionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.retrievetenantencryptionsetting.RetrieveTenantEncryptionSettingRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.serviceplans.ServicePlansRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.SnapshotsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.supportedregions.SupportedRegionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.usersettings.UserSettingsRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.VirtualEndpoint;
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
 * Provides operations to manage the virtualEndpoint property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEndpointRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the auditEvents property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link AuditEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bulkActions property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link BulkActionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkActionsRequestBuilder bulkActions() {
        return new BulkActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPCs property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link CloudPCsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudPCsRequestBuilder cloudPCs() {
        return new CloudPCsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the crossCloudGovernmentOrganizationMapping property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link CrossCloudGovernmentOrganizationMappingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CrossCloudGovernmentOrganizationMappingRequestBuilder crossCloudGovernmentOrganizationMapping() {
        return new CrossCloudGovernmentOrganizationMappingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceImages property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link DeviceImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceImagesRequestBuilder deviceImages() {
        return new DeviceImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the externalPartnerSettings property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link ExternalPartnerSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExternalPartnerSettingsRequestBuilder externalPartnerSettings() {
        return new ExternalPartnerSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the frontLineServicePlans property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link FrontLineServicePlansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FrontLineServicePlansRequestBuilder frontLineServicePlans() {
        return new FrontLineServicePlansRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the galleryImages property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link GalleryImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GalleryImagesRequestBuilder galleryImages() {
        return new GalleryImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEffectivePermissions method.
     * @return a {@link GetEffectivePermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEffectivePermissionsRequestBuilder getEffectivePermissions() {
        return new GetEffectivePermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onPremisesConnections property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link OnPremisesConnectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnPremisesConnectionsRequestBuilder onPremisesConnections() {
        return new OnPremisesConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the organizationSettings property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link OrganizationSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationSettingsRequestBuilder organizationSettings() {
        return new OrganizationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link ProvisioningPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisioningPoliciesRequestBuilder provisioningPolicies() {
        return new ProvisioningPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reports property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveScopedPermissions method.
     * @return a {@link RetrieveScopedPermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveScopedPermissionsRequestBuilder retrieveScopedPermissions() {
        return new RetrieveScopedPermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveTenantEncryptionSetting method.
     * @return a {@link RetrieveTenantEncryptionSettingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveTenantEncryptionSettingRequestBuilder retrieveTenantEncryptionSetting() {
        return new RetrieveTenantEncryptionSettingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the servicePlans property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link ServicePlansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePlansRequestBuilder servicePlans() {
        return new ServicePlansRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the snapshots property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link SnapshotsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SnapshotsRequestBuilder snapshots() {
        return new SnapshotsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the supportedRegions property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link SupportedRegionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SupportedRegionsRequestBuilder supportedRegions() {
        return new SupportedRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userSettings property of the microsoft.graph.virtualEndpoint entity.
     * @return a {@link UserSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserSettingsRequestBuilder userSettings() {
        return new UserSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VirtualEndpointRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEndpointRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link VirtualEndpointRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEndpointRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @return a {@link VirtualEndpoint}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEndpoint get() {
        return get(null);
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEndpoint}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEndpoint get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEndpoint::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body The request body
     * @return a {@link VirtualEndpoint}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEndpoint patch(@jakarta.annotation.Nonnull final VirtualEndpoint body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEndpoint}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEndpoint patch(@jakarta.annotation.Nonnull final VirtualEndpoint body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEndpoint::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property virtualEndpoint for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get virtualEndpoint from deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEndpoint body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property virtualEndpoint in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEndpoint body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link VirtualEndpointRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEndpointRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VirtualEndpointRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get virtualEndpoint from deviceManagement
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
         * @return a {@link Map<String, Object>}
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
