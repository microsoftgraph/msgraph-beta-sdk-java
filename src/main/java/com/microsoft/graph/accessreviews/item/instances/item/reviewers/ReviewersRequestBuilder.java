package com.microsoft.graph.accessreviews.item.instances.item.reviewers;

import com.microsoft.graph.accessreviews.item.instances.item.reviewers.count.CountRequestBuilder;
import com.microsoft.graph.accessreviews.item.instances.item.reviewers.item.AccessReviewReviewerItemRequestBuilder;
import com.microsoft.graph.models.AccessReviewReviewer;
import com.microsoft.graph.models.AccessReviewReviewerCollectionResponse;
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
 * Provides operations to manage the reviewers property of the microsoft.graph.accessReview entity.
 */
public class ReviewersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reviewers property of the microsoft.graph.accessReview entity.
     * @param accessReviewReviewerId The unique identifier of accessReviewReviewer
     * @return a AccessReviewReviewerItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessReviewReviewerItemRequestBuilder byAccessReviewReviewerId(@jakarta.annotation.Nonnull final String accessReviewReviewerId) {
        Objects.requireNonNull(accessReviewReviewerId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessReviewReviewer%2Did", accessReviewReviewerId);
        return new AccessReviewReviewerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReviewersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReviewersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews/{accessReview%2Did}/instances/{accessReview%2Did1}/reviewers{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReviewersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReviewersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews/{accessReview%2Did}/instances/{accessReview%2Did1}/reviewers{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * In the Azure AD access reviews feature, retrieve the reviewers of an accessReview object.
     * @return a CompletableFuture of accessReviewReviewerCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-listreviewers?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewReviewerCollectionResponse> get() {
        return get(null);
    }
    /**
     * In the Azure AD access reviews feature, retrieve the reviewers of an accessReview object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewReviewerCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-listreviewers?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewReviewerCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessReviewReviewerCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * In the Azure AD access reviews feature, update an existing accessReview object to add another user as a reviewer.  This operation is only permitted for an access review that is not yet completed, and only for an access review where the reviewers are explicitly specified. This operation is not permitted for an access review in which users review their own access, and not intended for an access review in which the group owners are assigned as the reviewers. 
     * @param body The request body
     * @return a CompletableFuture of accessReviewReviewer
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-addreviewer?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewReviewer> post(@jakarta.annotation.Nonnull final AccessReviewReviewer body) {
        return post(body, null);
    }
    /**
     * In the Azure AD access reviews feature, update an existing accessReview object to add another user as a reviewer.  This operation is only permitted for an access review that is not yet completed, and only for an access review where the reviewers are explicitly specified. This operation is not permitted for an access review in which users review their own access, and not intended for an access review in which the group owners are assigned as the reviewers. 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewReviewer
     * @see <a href="https://learn.microsoft.com/graph/api/accessreview-addreviewer?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewReviewer> post(@jakarta.annotation.Nonnull final AccessReviewReviewer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessReviewReviewer::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * In the Azure AD access reviews feature, retrieve the reviewers of an accessReview object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In the Azure AD access reviews feature, retrieve the reviewers of an accessReview object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * In the Azure AD access reviews feature, update an existing accessReview object to add another user as a reviewer.  This operation is only permitted for an access review that is not yet completed, and only for an access review where the reviewers are explicitly specified. This operation is not permitted for an access review in which users review their own access, and not intended for an access review in which the group owners are assigned as the reviewers. 
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessReviewReviewer body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * In the Azure AD access reviews feature, update an existing accessReview object to add another user as a reviewer.  This operation is only permitted for an access review that is not yet completed, and only for an access review where the reviewers are explicitly specified. This operation is not permitted for an access review in which users review their own access, and not intended for an access review in which the group owners are assigned as the reviewers. 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessReviewReviewer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * In the Azure AD access reviews feature, retrieve the reviewers of an accessReview object.
     */
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
