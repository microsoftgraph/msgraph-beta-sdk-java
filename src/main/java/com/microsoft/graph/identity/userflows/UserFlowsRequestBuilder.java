package com.microsoft.graph.identity.userflows;

import com.microsoft.graph.identity.userflows.count.CountRequestBuilder;
import com.microsoft.graph.identity.userflows.item.IdentityUserFlowItemRequestBuilder;
import com.microsoft.graph.models.IdentityUserFlow;
import com.microsoft.graph.models.IdentityUserFlowCollectionResponse;
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
 * Provides operations to manage the userFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserFlowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userFlows property of the microsoft.graph.identityContainer entity.
     * @param identityUserFlowId The unique identifier of identityUserFlow
     * @return a IdentityUserFlowItemRequestBuilder
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
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
     * Instantiates a new UserFlowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserFlowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/userFlows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of userflows. This API is available in the following national cloud deployments.
     * @return a IdentityUserFlowCollectionResponse
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlowCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of userflows. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IdentityUserFlowCollectionResponse
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlowCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlowCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new userFlow object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-post-userflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow post(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return post(body, null);
    }
    /**
     * Create a new userFlow object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IdentityUserFlow
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     * @see <a href="https://learn.microsoft.com/graph/api/identityuserflow-post-userflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public IdentityUserFlow post(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of userflows. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of userflows. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
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
     * Create a new userFlow object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new userFlow object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UserFlowsRequestBuilder
     * @deprecated
     * The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs. as of 2021-05/identityProvider on 2021-05-21 and will be removed 2022-01-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UserFlowsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserFlowsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of userflows. This API is available in the following national cloud deployments.
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
