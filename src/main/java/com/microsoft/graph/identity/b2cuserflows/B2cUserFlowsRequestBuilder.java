package com.microsoft.graph.identity.b2cuserflows;

import com.microsoft.graph.identity.b2cuserflows.count.CountRequestBuilder;
import com.microsoft.graph.identity.b2cuserflows.item.B2cIdentityUserFlowItemRequestBuilder;
import com.microsoft.graph.models.B2cIdentityUserFlow;
import com.microsoft.graph.models.B2cIdentityUserFlowCollectionResponse;
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
 * Provides operations to manage the b2cUserFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2cUserFlowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the b2cUserFlows property of the microsoft.graph.identityContainer entity.
     * @param b2cIdentityUserFlowId The unique identifier of b2cIdentityUserFlow
     * @return a B2cIdentityUserFlowItemRequestBuilder
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public B2cIdentityUserFlowItemRequestBuilder byB2cIdentityUserFlowId(@jakarta.annotation.Nonnull final String b2cIdentityUserFlowId) {
        Objects.requireNonNull(b2cIdentityUserFlowId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("b2cIdentityUserFlow%2Did", b2cIdentityUserFlowId);
        return new B2cIdentityUserFlowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new B2cUserFlowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2cUserFlowsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new B2cUserFlowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2cUserFlowsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of b2cIdentityUserFlow objects.
     * @return a B2cIdentityUserFlowCollectionResponse
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/identitycontainer-list-b2cuserflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlowCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of b2cIdentityUserFlow objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2cIdentityUserFlowCollectionResponse
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/identitycontainer-list-b2cuserflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlowCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2cIdentityUserFlowCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new b2cIdentityUserFlow object.
     * @param body The request body
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/identitycontainer-post-b2cuserflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow post(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body) {
        return post(body, null);
    }
    /**
     * Create a new b2cIdentityUserFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2cIdentityUserFlow
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     * @see <a href="https://learn.microsoft.com/graph/api/identitycontainer-post-b2cuserflows?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public B2cIdentityUserFlow post(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2cIdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of b2cIdentityUserFlow objects.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of b2cIdentityUserFlow objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
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
     * Create a new b2cIdentityUserFlow object.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new b2cIdentityUserFlow object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final B2cIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a B2cUserFlowsRequestBuilder
     * @deprecated
     *  as of 2023-08/PrivatePreview:changeManagement on 2023-08-23 and will be removed 2023-08-23
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public B2cUserFlowsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new B2cUserFlowsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of b2cIdentityUserFlow objects.
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
