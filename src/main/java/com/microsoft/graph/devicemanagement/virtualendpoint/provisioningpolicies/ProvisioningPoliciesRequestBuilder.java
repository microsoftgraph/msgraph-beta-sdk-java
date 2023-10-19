package com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies;

import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.applyconfig.ApplyConfigRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.CloudPcProvisioningPolicyItemRequestBuilder;
import com.microsoft.graph.models.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.CloudPcProvisioningPolicyCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisioningPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the applyConfig method.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ApplyConfigRequestBuilder applyConfig() {
        return new ApplyConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity.
     * @param cloudPcProvisioningPolicyId The unique identifier of cloudPcProvisioningPolicy
     * @return a CloudPcProvisioningPolicyItemRequestBuilder
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CloudPcProvisioningPolicyItemRequestBuilder byCloudPcProvisioningPolicyId(@jakarta.annotation.Nonnull final String cloudPcProvisioningPolicyId) {
        Objects.requireNonNull(cloudPcProvisioningPolicyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcProvisioningPolicy%2Did", cloudPcProvisioningPolicyId);
        return new CloudPcProvisioningPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ProvisioningPoliciesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisioningPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ProvisioningPoliciesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisioningPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List properties and relationships of the cloudPcProvisioningPolicy objects. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of CloudPcProvisioningPolicyCollectionResponse
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-provisioningpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicyCollectionResponse> get() {
        return get(null);
    }
    /**
     * List properties and relationships of the cloudPcProvisioningPolicy objects. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CloudPcProvisioningPolicyCollectionResponse
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-provisioningpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicyCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudPcProvisioningPolicyCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CompletableFuture of CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-post-provisioningpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> post(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body) {
        return post(body, null);
    }
    /**
     * Create a new cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-post-provisioningpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> post(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudPcProvisioningPolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * List properties and relationships of the cloudPcProvisioningPolicy objects. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List properties and relationships of the cloudPcProvisioningPolicy objects. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ProvisioningPoliciesRequestBuilder
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ProvisioningPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProvisioningPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List properties and relationships of the cloudPcProvisioningPolicy objects. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
