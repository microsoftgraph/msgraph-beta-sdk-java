package com.microsoft.graph.beta.admin.windows.updates;

import com.microsoft.graph.beta.admin.windows.updates.catalog.CatalogRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.deploymentaudiences.DeploymentAudiencesRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.deployments.DeploymentsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.products.ProductsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.resourceconnections.ResourceConnectionsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatableassets.UpdatableAssetsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.UpdatePoliciesRequestBuilder;
import com.microsoft.graph.beta.models.AdminWindowsUpdates;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the updates property of the microsoft.graph.adminWindows entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the catalog property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link CatalogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CatalogRequestBuilder catalog() {
        return new CatalogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deploymentAudiences property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link DeploymentAudiencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeploymentAudiencesRequestBuilder deploymentAudiences() {
        return new DeploymentAudiencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deployments property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link DeploymentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeploymentsRequestBuilder deployments() {
        return new DeploymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the products property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link ProductsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProductsRequestBuilder products() {
        return new ProductsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resourceConnections property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link ResourceConnectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResourceConnectionsRequestBuilder resourceConnections() {
        return new ResourceConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link UpdatableAssetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatableAssetsRequestBuilder updatableAssets() {
        return new UpdatableAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the updatePolicies property of the microsoft.graph.adminWindowsUpdates entity.
     * @return a {@link UpdatePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatePoliciesRequestBuilder updatePolicies() {
        return new UpdatePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UpdatesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdatesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property updates for admin
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property updates for admin
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
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @return a {@link AdminWindowsUpdates}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AdminWindowsUpdates get() {
        return get(null);
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdminWindowsUpdates}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AdminWindowsUpdates get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdminWindowsUpdates::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @return a {@link AdminWindowsUpdates}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AdminWindowsUpdates patch(@jakarta.annotation.Nonnull final AdminWindowsUpdates body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdminWindowsUpdates}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AdminWindowsUpdates patch(@jakarta.annotation.Nonnull final AdminWindowsUpdates body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdminWindowsUpdates::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property updates for admin
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property updates for admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/admin/windows/updates", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
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
     * Update the navigation property updates in admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AdminWindowsUpdates body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AdminWindowsUpdates body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/admin/windows/updates", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdatesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
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
