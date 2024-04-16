package com.microsoft.graph.beta.accessreviews;

import com.microsoft.graph.beta.accessreviews.count.CountRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.AccessReviewItemRequestBuilder;
import com.microsoft.graph.beta.models.AccessReview;
import com.microsoft.graph.beta.models.AccessReviewCollectionResponse;
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
 * Provides operations to manage the collection of accessReview entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of accessReview entities.
     * @param accessReviewId The unique identifier of accessReview
     * @return a {@link AccessReviewItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewItemRequestBuilder byAccessReviewId(@jakarta.annotation.Nonnull final String accessReviewId) {
        Objects.requireNonNull(accessReviewId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessReview%2Did", accessReviewId);
        return new AccessReviewItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AccessReviewsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AccessReviewsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve the accessReview objects for a particular businessFlowTemplate. A list of zero or more accessReview objects are returned, for each one-time and recurring access review that was created with that business flow template.  Note that business flow template IDs are case sensitive. If many access reviews match the filter, to improve efficiency and avoid timeouts, retrieve the result set in pages, by including both the $top query parameter with a page size, for example 100, and the $skip=0 query parameter in the request. These parameters can be included even when you do not anticipate that the request will span multiple pages. When a result set spans multiple pages, Microsoft Graph returns that page with an @odata.nextLink property in the response that contains a URL to the next page of results. If that property is present, continue making additional requests with the @odata.nextLink URL in each response, until all the results are returned, as described in paging Microsoft Graph data in your app. The accessReview objects returned by this API will not include nested structure properties such as settings, or relationships.  To retrieve an access review settings or relationships, use the get accessReview API.
     * @return a {@link AccessReviewCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessReviewCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve the accessReview objects for a particular businessFlowTemplate. A list of zero or more accessReview objects are returned, for each one-time and recurring access review that was created with that business flow template.  Note that business flow template IDs are case sensitive. If many access reviews match the filter, to improve efficiency and avoid timeouts, retrieve the result set in pages, by including both the $top query parameter with a page size, for example 100, and the $skip=0 query parameter in the request. These parameters can be included even when you do not anticipate that the request will span multiple pages. When a result set spans multiple pages, Microsoft Graph returns that page with an @odata.nextLink property in the response that contains a URL to the next page of results. If that property is present, continue making additional requests with the @odata.nextLink URL in each response, until all the results are returned, as described in paging Microsoft Graph data in your app. The accessReview objects returned by this API will not include nested structure properties such as settings, or relationships.  To retrieve an access review settings or relationships, use the get accessReview API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessReviewCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessReviewCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessReviewCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * In the Microsoft Entra access reviews feature, create a new accessReview object. Before making this request, the caller must have previously retrieved the list of business flow templates, to have the value of businessFlowTemplateId to include in the request. After making this request, the caller should create a programControl, to link the access review to a program.  
     * @param body The request body
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessReview post(@jakarta.annotation.Nonnull final AccessReview body) {
        return post(body, null);
    }
    /**
     * In the Microsoft Entra access reviews feature, create a new accessReview object. Before making this request, the caller must have previously retrieved the list of business flow templates, to have the value of businessFlowTemplateId to include in the request. After making this request, the caller should create a programControl, to link the access review to a program.  
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessReview post(@jakarta.annotation.Nonnull final AccessReview body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessReview::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the accessReview objects for a particular businessFlowTemplate. A list of zero or more accessReview objects are returned, for each one-time and recurring access review that was created with that business flow template.  Note that business flow template IDs are case sensitive. If many access reviews match the filter, to improve efficiency and avoid timeouts, retrieve the result set in pages, by including both the $top query parameter with a page size, for example 100, and the $skip=0 query parameter in the request. These parameters can be included even when you do not anticipate that the request will span multiple pages. When a result set spans multiple pages, Microsoft Graph returns that page with an @odata.nextLink property in the response that contains a URL to the next page of results. If that property is present, continue making additional requests with the @odata.nextLink URL in each response, until all the results are returned, as described in paging Microsoft Graph data in your app. The accessReview objects returned by this API will not include nested structure properties such as settings, or relationships.  To retrieve an access review settings or relationships, use the get accessReview API.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the accessReview objects for a particular businessFlowTemplate. A list of zero or more accessReview objects are returned, for each one-time and recurring access review that was created with that business flow template.  Note that business flow template IDs are case sensitive. If many access reviews match the filter, to improve efficiency and avoid timeouts, retrieve the result set in pages, by including both the $top query parameter with a page size, for example 100, and the $skip=0 query parameter in the request. These parameters can be included even when you do not anticipate that the request will span multiple pages. When a result set spans multiple pages, Microsoft Graph returns that page with an @odata.nextLink property in the response that contains a URL to the next page of results. If that property is present, continue making additional requests with the @odata.nextLink URL in each response, until all the results are returned, as described in paging Microsoft Graph data in your app. The accessReview objects returned by this API will not include nested structure properties such as settings, or relationships.  To retrieve an access review settings or relationships, use the get accessReview API.
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
     * In the Microsoft Entra access reviews feature, create a new accessReview object. Before making this request, the caller must have previously retrieved the list of business flow templates, to have the value of businessFlowTemplateId to include in the request. After making this request, the caller should create a programControl, to link the access review to a program.  
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessReview body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * In the Microsoft Entra access reviews feature, create a new accessReview object. Before making this request, the caller must have previously retrieved the list of business flow templates, to have the value of businessFlowTemplateId to include in the request. After making this request, the caller should create a programControl, to link the access review to a program.  
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessReview body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AccessReviewsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessReviewsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the accessReview objects for a particular businessFlowTemplate. A list of zero or more accessReview objects are returned, for each one-time and recurring access review that was created with that business flow template.  Note that business flow template IDs are case sensitive. If many access reviews match the filter, to improve efficiency and avoid timeouts, retrieve the result set in pages, by including both the $top query parameter with a page size, for example 100, and the $skip=0 query parameter in the request. These parameters can be included even when you do not anticipate that the request will span multiple pages. When a result set spans multiple pages, Microsoft Graph returns that page with an @odata.nextLink property in the response that contains a URL to the next page of results. If that property is present, continue making additional requests with the @odata.nextLink URL in each response, until all the results are returned, as described in paging Microsoft Graph data in your app. The accessReview objects returned by this API will not include nested structure properties such as settings, or relationships.  To retrieve an access review settings or relationships, use the get accessReview API.
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
