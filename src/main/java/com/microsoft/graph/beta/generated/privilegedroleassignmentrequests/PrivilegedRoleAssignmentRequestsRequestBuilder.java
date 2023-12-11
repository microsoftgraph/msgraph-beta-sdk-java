package com.microsoft.graph.beta.privilegedroleassignmentrequests;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.beta.models.PrivilegedRoleAssignmentRequestCollectionResponse;
import com.microsoft.graph.beta.privilegedroleassignmentrequests.count.CountRequestBuilder;
import com.microsoft.graph.beta.privilegedroleassignmentrequests.item.PrivilegedRoleAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.beta.privilegedroleassignmentrequests.my.MyRequestBuilder;
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
 * Provides operations to manage the collection of privilegedRoleAssignmentRequest entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRoleAssignmentRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the my method.
     */
    @jakarta.annotation.Nonnull
    public MyRequestBuilder my() {
        return new MyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignmentRequest entities.
     * @param privilegedRoleAssignmentRequestId The unique identifier of privilegedRoleAssignmentRequest
     * @return a PrivilegedRoleAssignmentRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestItemRequestBuilder byPrivilegedRoleAssignmentRequestId(@jakarta.annotation.Nonnull final String privilegedRoleAssignmentRequestId) {
        Objects.requireNonNull(privilegedRoleAssignmentRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedRoleAssignmentRequest%2Did", privilegedRoleAssignmentRequestId);
        return new PrivilegedRoleAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PrivilegedRoleAssignmentRequestsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedRoleAssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedRoleAssignmentRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PrivilegedRoleAssignmentRequestsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedRoleAssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedRoleAssignmentRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get entities from privilegedRoleAssignmentRequests
     * @return a PrivilegedRoleAssignmentRequestCollectionResponse
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * Get entities from privilegedRoleAssignmentRequests
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedRoleAssignmentRequestCollectionResponse
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedRoleAssignmentRequestCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add new entity to privilegedRoleAssignmentRequests
     * @param body The request body
     * @return a PrivilegedRoleAssignmentRequest
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequest post(@jakarta.annotation.Nonnull final PrivilegedRoleAssignmentRequest body) {
        return post(body, null);
    }
    /**
     * Add new entity to privilegedRoleAssignmentRequests
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedRoleAssignmentRequest
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequest post(@jakarta.annotation.Nonnull final PrivilegedRoleAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedRoleAssignmentRequest::createFromDiscriminatorValue);
    }
    /**
     * Get entities from privilegedRoleAssignmentRequests
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entities from privilegedRoleAssignmentRequests
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Add new entity to privilegedRoleAssignmentRequests
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedRoleAssignmentRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to privilegedRoleAssignmentRequests
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedRoleAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a PrivilegedRoleAssignmentRequestsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrivilegedRoleAssignmentRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get entities from privilegedRoleAssignmentRequests
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
