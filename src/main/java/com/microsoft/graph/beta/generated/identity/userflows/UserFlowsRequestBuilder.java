package com.microsoft.graph.beta.identity.userflows;

import com.microsoft.graph.beta.identity.userflows.count.CountRequestBuilder;
import com.microsoft.graph.beta.identity.userflows.item.IdentityUserFlowItemRequestBuilder;
import com.microsoft.graph.beta.models.IdentityUserFlow;
import com.microsoft.graph.beta.models.IdentityUserFlowCollectionResponse;
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
 * Provides operations to manage the userFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserFlowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userFlows property of the microsoft.graph.identityContainer entity.
     * @param identityUserFlowId The unique identifier of identityUserFlow
     * @return a {@link IdentityUserFlowItemRequestBuilder}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public IdentityUserFlowItemRequestBuilder byIdentityUserFlowId(@jakarta.annotation.Nonnull final String identityUserFlowId) {
        Objects.requireNonNull(identityUserFlowId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityUserFlow%2Did", identityUserFlowId);
        return new IdentityUserFlowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserFlowsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserFlowsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve a list of userflows.
     * @return a {@link IdentityUserFlowCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlowCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of userflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityUserFlowCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlowCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlowCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new userFlow object.
     * @param body The request body
     * @return a {@link IdentityUserFlow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-post-userflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow post(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return post(body, null);
    }
    /**
     * Create a new userFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityUserFlow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-post-userflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow post(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of userflows.
     * @return a {@link RequestInformation}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of userflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
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
     * Create a new userFlow object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new userFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/identity/userFlows", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserFlowsRequestBuilder}
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UserFlowsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserFlowsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of userflows.
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
