package com.microsoft.graph.beta.oauth2permissiongrants;

import com.microsoft.graph.beta.models.OAuth2PermissionGrant;
import com.microsoft.graph.beta.models.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.oauth2permissiongrants.count.CountRequestBuilder;
import com.microsoft.graph.beta.oauth2permissiongrants.delta.DeltaRequestBuilder;
import com.microsoft.graph.beta.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
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
 * Provides operations to manage the collection of oAuth2PermissionGrant entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Oauth2PermissionGrantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of oAuth2PermissionGrant entities.
     * @param oAuth2PermissionGrantId The unique identifier of oAuth2PermissionGrant
     * @return a {@link OAuth2PermissionGrantItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder byOAuth2PermissionGrantId(@jakarta.annotation.Nonnull final String oAuth2PermissionGrantId) {
        Objects.requireNonNull(oAuth2PermissionGrantId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", oAuth2PermissionGrantId);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link Oauth2PermissionGrantsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public Oauth2PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth2PermissionGrants{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link Oauth2PermissionGrantsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public Oauth2PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth2PermissionGrants{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant objects, representing delegated permissions which have been granted for client applications to access APIs on behalf of signed-in users.
     * @return a {@link OAuth2PermissionGrantCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/oauth2permissiongrant-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrantCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant objects, representing delegated permissions which have been granted for client applications to access APIs on behalf of signed-in users.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OAuth2PermissionGrantCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/oauth2permissiongrant-list?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrantCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuth2PermissionGrantCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a delegated permission grant, represented by an oAuth2PermissionGrant object. A delegated permission grant authorizes a client service principal (representing a client application) to access a resource service principal (representing an API), on behalf of a signed-in user, for the level of access limited by the delegated permissions which were granted.
     * @param body The request body
     * @return a {@link OAuth2PermissionGrant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/oauth2permissiongrant-post?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrant post(@jakarta.annotation.Nonnull final OAuth2PermissionGrant body) {
        return post(body, null);
    }
    /**
     * Create a delegated permission grant, represented by an oAuth2PermissionGrant object. A delegated permission grant authorizes a client service principal (representing a client application) to access a resource service principal (representing an API), on behalf of a signed-in user, for the level of access limited by the delegated permissions which were granted.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OAuth2PermissionGrant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/oauth2permissiongrant-post?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrant post(@jakarta.annotation.Nonnull final OAuth2PermissionGrant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuth2PermissionGrant::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant objects, representing delegated permissions which have been granted for client applications to access APIs on behalf of signed-in users.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant objects, representing delegated permissions which have been granted for client applications to access APIs on behalf of signed-in users.
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
     * Create a delegated permission grant, represented by an oAuth2PermissionGrant object. A delegated permission grant authorizes a client service principal (representing a client application) to access a resource service principal (representing an API), on behalf of a signed-in user, for the level of access limited by the delegated permissions which were granted.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OAuth2PermissionGrant body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a delegated permission grant, represented by an oAuth2PermissionGrant object. A delegated permission grant authorizes a client service principal (representing a client application) to access a resource service principal (representing an API), on behalf of a signed-in user, for the level of access limited by the delegated permissions which were granted.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OAuth2PermissionGrant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link Oauth2PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new Oauth2PermissionGrantsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant objects, representing delegated permissions which have been granted for client applications to access APIs on behalf of signed-in users.
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
