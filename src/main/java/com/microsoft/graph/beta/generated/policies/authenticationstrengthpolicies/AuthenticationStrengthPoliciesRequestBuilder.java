package com.microsoft.graph.beta.policies.authenticationstrengthpolicies;

import com.microsoft.graph.beta.models.AuthenticationStrengthPolicy;
import com.microsoft.graph.beta.models.AuthenticationStrengthPolicyCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.policies.authenticationstrengthpolicies.count.CountRequestBuilder;
import com.microsoft.graph.beta.policies.authenticationstrengthpolicies.findbymethodmodewithauthenticationmethodmodes.FindByMethodModeWithAuthenticationMethodModesRequestBuilder;
import com.microsoft.graph.beta.policies.authenticationstrengthpolicies.item.AuthenticationStrengthPolicyItemRequestBuilder;
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
 * Provides operations to manage the authenticationStrengthPolicies property of the microsoft.graph.policyRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationStrengthPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationStrengthPolicies property of the microsoft.graph.policyRoot entity.
     * @param authenticationStrengthPolicyId The unique identifier of authenticationStrengthPolicy
     * @return a {@link AuthenticationStrengthPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthPolicyItemRequestBuilder byAuthenticationStrengthPolicyId(@jakarta.annotation.Nonnull final String authenticationStrengthPolicyId) {
        Objects.requireNonNull(authenticationStrengthPolicyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationStrengthPolicy%2Did", authenticationStrengthPolicyId);
        return new AuthenticationStrengthPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AuthenticationStrengthPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationStrengthPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/authenticationStrengthPolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AuthenticationStrengthPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationStrengthPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/authenticationStrengthPolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Provides operations to call the findByMethodMode method.
     * @param authenticationMethodModes Usage: authenticationMethodModes={authenticationMethodModes}
     * @return a {@link FindByMethodModeWithAuthenticationMethodModesRequestBuilder}
     * @deprecated
     * The findByMethodMode function is deprecated. Please use OData filter query instead. as of 2023-02/FindByMethodModeRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public FindByMethodModeWithAuthenticationMethodModesRequestBuilder findByMethodModeWithAuthenticationMethodModes(@jakarta.annotation.Nonnull final String authenticationMethodModes) {
        Objects.requireNonNull(authenticationMethodModes);
        return new FindByMethodModeWithAuthenticationMethodModesRequestBuilder(pathParameters, requestAdapter, authenticationMethodModes);
    }
    /**
     * Get a list of the authenticationStrengthPolicy objects and their properties. This API returns both built-in and custom policies.
     * @return a {@link AuthenticationStrengthPolicyCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationstrengthroot-list-policies?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicyCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the authenticationStrengthPolicy objects and their properties. This API returns both built-in and custom policies.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationStrengthPolicyCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationstrengthroot-list-policies?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicyCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationStrengthPolicyCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new custom authenticationStrengthPolicy object.
     * @param body The request body
     * @return a {@link AuthenticationStrengthPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationstrengthroot-post-policies?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicy post(@jakarta.annotation.Nonnull final AuthenticationStrengthPolicy body) {
        return post(body, null);
    }
    /**
     * Create a new custom authenticationStrengthPolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationStrengthPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationstrengthroot-post-policies?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicy post(@jakarta.annotation.Nonnull final AuthenticationStrengthPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationStrengthPolicy::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the authenticationStrengthPolicy objects and their properties. This API returns both built-in and custom policies.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the authenticationStrengthPolicy objects and their properties. This API returns both built-in and custom policies.
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
     * Create a new custom authenticationStrengthPolicy object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AuthenticationStrengthPolicy body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new custom authenticationStrengthPolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AuthenticationStrengthPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AuthenticationStrengthPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationStrengthPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the authenticationStrengthPolicy objects and their properties. This API returns both built-in and custom policies.
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
