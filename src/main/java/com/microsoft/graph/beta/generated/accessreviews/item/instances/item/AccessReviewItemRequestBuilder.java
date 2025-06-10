package com.microsoft.graph.beta.accessreviews.item.instances.item;

import com.microsoft.graph.beta.accessreviews.item.instances.item.applydecisions.ApplyDecisionsRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.decisions.DecisionsRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.mydecisions.MyDecisionsRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.resetdecisions.ResetDecisionsRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.reviewers.ReviewersRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.sendreminder.SendReminderRequestBuilder;
import com.microsoft.graph.beta.accessreviews.item.instances.item.stop.StopRequestBuilder;
import com.microsoft.graph.beta.models.AccessReview;
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
 * Provides operations to manage the instances property of the microsoft.graph.accessReview entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the applyDecisions method.
     * @return a {@link ApplyDecisionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyDecisionsRequestBuilder applyDecisions() {
        return new ApplyDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the decisions property of the microsoft.graph.accessReview entity.
     * @return a {@link DecisionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecisionsRequestBuilder decisions() {
        return new DecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the myDecisions property of the microsoft.graph.accessReview entity.
     * @return a {@link MyDecisionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MyDecisionsRequestBuilder myDecisions() {
        return new MyDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetDecisions method.
     * @return a {@link ResetDecisionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetDecisionsRequestBuilder resetDecisions() {
        return new ResetDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reviewers property of the microsoft.graph.accessReview entity.
     * @return a {@link ReviewersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReviewersRequestBuilder reviewers() {
        return new ReviewersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendReminder method.
     * @return a {@link SendReminderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendReminderRequestBuilder sendReminder() {
        return new SendReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stop method.
     * @return a {@link StopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AccessReviewItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews/{accessReview%2Did}/instances/{accessReview%2Did1}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AccessReviewItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/accessReviews/{accessReview%2Did}/instances/{accessReview%2Did1}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property instances for accessReviews
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property instances for accessReviews
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The collection of access reviews instances past, present, and future, if this object is a recurring access review.
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessReview get() {
        return get(null);
    }
    /**
     * The collection of access reviews instances past, present, and future, if this object is a recurring access review.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessReview get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessReview::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property instances in accessReviews
     * @param body The request body
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessReview patch(@jakarta.annotation.Nonnull final AccessReview body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property instances in accessReviews
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessReview}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessReview patch(@jakarta.annotation.Nonnull final AccessReview body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessReview::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property instances for accessReviews
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property instances for accessReviews
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The collection of access reviews instances past, present, and future, if this object is a recurring access review.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of access reviews instances past, present, and future, if this object is a recurring access review.
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
     * Update the navigation property instances in accessReviews
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessReview body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property instances in accessReviews
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessReview body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AccessReviewItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessReviewItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of access reviews instances past, present, and future, if this object is a recurring access review.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
