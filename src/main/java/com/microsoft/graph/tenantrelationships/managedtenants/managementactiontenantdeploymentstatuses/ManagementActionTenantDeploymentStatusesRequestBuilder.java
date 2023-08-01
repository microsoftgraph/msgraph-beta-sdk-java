package com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses;

import com.microsoft.graph.models.managedtenants.ManagementActionTenantDeploymentStatus;
import com.microsoft.graph.models.managedtenants.ManagementActionTenantDeploymentStatusCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.count.CountRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.item.ManagementActionTenantDeploymentStatusItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.microsoftgraphmanagedtenantschangedeploymentstatus.MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the managementActionTenantDeploymentStatuses property of the microsoft.graph.managedTenants.managedTenant entity.
 */
public class ManagementActionTenantDeploymentStatusesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changeDeploymentStatus method.
     */
    @javax.annotation.Nonnull
    public MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder microsoftGraphManagedTenantsChangeDeploymentStatus() {
        return new MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managementActionTenantDeploymentStatuses property of the microsoft.graph.managedTenants.managedTenant entity.
     * @param managementActionTenantDeploymentStatusId Unique identifier of the item
     * @return a ManagementActionTenantDeploymentStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagementActionTenantDeploymentStatusItemRequestBuilder byManagementActionTenantDeploymentStatusId(@javax.annotation.Nonnull final String managementActionTenantDeploymentStatusId) {
        Objects.requireNonNull(managementActionTenantDeploymentStatusId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managementActionTenantDeploymentStatus%2Did", managementActionTenantDeploymentStatusId);
        return new ManagementActionTenantDeploymentStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagementActionTenantDeploymentStatusesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementActionTenantDeploymentStatusesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActionTenantDeploymentStatuses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ManagementActionTenantDeploymentStatusesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementActionTenantDeploymentStatusesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActionTenantDeploymentStatuses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of the managementActionTenantDeploymentStatus objects and their properties.
     * @return a CompletableFuture of managementActionTenantDeploymentStatusCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-managedtenant-list-managementactiontenantdeploymentstatuses?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagementActionTenantDeploymentStatusCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of the managementActionTenantDeploymentStatus objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managementActionTenantDeploymentStatusCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-managedtenant-list-managementactiontenantdeploymentstatuses?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagementActionTenantDeploymentStatusCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatusCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to managementActionTenantDeploymentStatuses for tenantRelationships
     * @param body The request body
     * @return a CompletableFuture of managementActionTenantDeploymentStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus> post(@javax.annotation.Nonnull final ManagementActionTenantDeploymentStatus body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagementActionTenantDeploymentStatus::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus> executionException = new java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to managementActionTenantDeploymentStatuses for tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managementActionTenantDeploymentStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus> post(@javax.annotation.Nonnull final ManagementActionTenantDeploymentStatus body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ManagementActionTenantDeploymentStatus::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus> executionException = new java.util.concurrent.CompletableFuture<ManagementActionTenantDeploymentStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of the managementActionTenantDeploymentStatus objects and their properties.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the managementActionTenantDeploymentStatus objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to managementActionTenantDeploymentStatuses for tenantRelationships
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ManagementActionTenantDeploymentStatus body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to managementActionTenantDeploymentStatuses for tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ManagementActionTenantDeploymentStatus body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get a list of the managementActionTenantDeploymentStatus objects and their properties.
     */
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
