package com.microsoft.graph.beta.directory.featurerolloutpolicies.item.appliesto;

import com.microsoft.graph.beta.directory.featurerolloutpolicies.item.appliesto.count.CountRequestBuilder;
import com.microsoft.graph.beta.directory.featurerolloutpolicies.item.appliesto.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.beta.directory.featurerolloutpolicies.item.appliesto.ref.RefRequestBuilder;
import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.DirectoryObjectCollectionResponse;
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
 * Provides operations to manage the appliesTo property of the microsoft.graph.featureRolloutPolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppliesToRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directory entities.
     * @return a {@link RefRequestBuilder}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.Beta.directory.featureRolloutPolicies.item.appliesTo.item collection
     * @param directoryObjectId The unique identifier of directoryObject
     * @return a {@link DirectoryObjectItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder byDirectoryObjectId(@jakarta.annotation.Nonnull final String directoryObjectId) {
        Objects.requireNonNull(directoryObjectId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", directoryObjectId);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AppliesToRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppliesToRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/featureRolloutPolicies/{featureRolloutPolicy%2Did}/appliesTo{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AppliesToRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppliesToRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/featureRolloutPolicies/{featureRolloutPolicy%2Did}/appliesTo{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Nullable. Specifies a list of directoryObject resources that feature is enabled for.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DirectoryObjectCollectionResponse get() {
        return get(null);
    }
    /**
     * Nullable. Specifies a list of directoryObject resources that feature is enabled for.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DirectoryObjectCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryObjectCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to appliesTo for directory
     * @param body The request body
     * @return a {@link DirectoryObject}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DirectoryObject post(@jakarta.annotation.Nonnull final DirectoryObject body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to appliesTo for directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryObject}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DirectoryObject post(@jakarta.annotation.Nonnull final DirectoryObject body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryObject::createFromDiscriminatorValue);
    }
    /**
     * Nullable. Specifies a list of directoryObject resources that feature is enabled for.
     * @return a {@link RequestInformation}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Nullable. Specifies a list of directoryObject resources that feature is enabled for.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create new navigation property to appliesTo for directory
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectoryObject body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to appliesTo for directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectoryObject body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AppliesToRequestBuilder}
     * @deprecated
     * Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies. as of 2021-01/DirectoryFeatureRolloutPolicies on 2021-03-05 and will be removed 2021-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public AppliesToRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AppliesToRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Nullable. Specifies a list of directoryObject resources that feature is enabled for.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
