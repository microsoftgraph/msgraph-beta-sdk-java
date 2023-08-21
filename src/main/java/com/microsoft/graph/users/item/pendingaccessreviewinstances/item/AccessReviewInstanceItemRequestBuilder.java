package com.microsoft.graph.users.item.pendingaccessreviewinstances.item;

import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.acceptrecommendations.AcceptRecommendationsRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.applydecisions.ApplyDecisionsRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.batchrecorddecisions.BatchRecordDecisionsRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.contactedreviewers.ContactedReviewersRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.decisions.DecisionsRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.definition.DefinitionRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.resetdecisions.ResetDecisionsRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.sendreminder.SendReminderRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.stages.StagesRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.stop.StopRequestBuilder;
import com.microsoft.graph.users.item.pendingaccessreviewinstances.item.stopapplydecisions.StopApplyDecisionsRequestBuilder;
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
 * Provides operations to manage the pendingAccessReviewInstances property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the acceptRecommendations method.
     */
    @jakarta.annotation.Nonnull
    public AcceptRecommendationsRequestBuilder acceptRecommendations() {
        return new AcceptRecommendationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyDecisions method.
     */
    @jakarta.annotation.Nonnull
    public ApplyDecisionsRequestBuilder applyDecisions() {
        return new ApplyDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the batchRecordDecisions method.
     */
    @jakarta.annotation.Nonnull
    public BatchRecordDecisionsRequestBuilder batchRecordDecisions() {
        return new BatchRecordDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contactedReviewers property of the microsoft.graph.accessReviewInstance entity.
     */
    @jakarta.annotation.Nonnull
    public ContactedReviewersRequestBuilder contactedReviewers() {
        return new ContactedReviewersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the decisions property of the microsoft.graph.accessReviewInstance entity.
     */
    @jakarta.annotation.Nonnull
    public DecisionsRequestBuilder decisions() {
        return new DecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the definition property of the microsoft.graph.accessReviewInstance entity.
     */
    @jakarta.annotation.Nonnull
    public DefinitionRequestBuilder definition() {
        return new DefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetDecisions method.
     */
    @jakarta.annotation.Nonnull
    public ResetDecisionsRequestBuilder resetDecisions() {
        return new ResetDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendReminder method.
     */
    @jakarta.annotation.Nonnull
    public SendReminderRequestBuilder sendReminder() {
        return new SendReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the stages property of the microsoft.graph.accessReviewInstance entity.
     */
    @jakarta.annotation.Nonnull
    public StagesRequestBuilder stages() {
        return new StagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stop method.
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stopApplyDecisions method.
     */
    @jakarta.annotation.Nonnull
    public StopApplyDecisionsRequestBuilder stopApplyDecisions() {
        return new StopApplyDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AccessReviewInstanceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewInstanceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/pendingAccessReviewInstances/{accessReviewInstance%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AccessReviewInstanceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessReviewInstanceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/pendingAccessReviewInstances/{accessReviewInstance%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property pendingAccessReviewInstances for users
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property pendingAccessReviewInstances for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Navigation property to get list of access reviews pending approval by reviewer.
     * @return a CompletableFuture of accessReviewInstance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> get() {
        return get(null);
    }
    /**
     * Navigation property to get list of access reviews pending approval by reviewer.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewInstance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property pendingAccessReviewInstances in users
     * @param body The request body
     * @return a CompletableFuture of accessReviewInstance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> patch(@jakarta.annotation.Nonnull final AccessReviewInstance body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property pendingAccessReviewInstances in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewInstance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> patch(@jakarta.annotation.Nonnull final AccessReviewInstance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property pendingAccessReviewInstances for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property pendingAccessReviewInstances for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Navigation property to get list of access reviews pending approval by reviewer.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Navigation property to get list of access reviews pending approval by reviewer.
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
     * Update the navigation property pendingAccessReviewInstances in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessReviewInstance body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property pendingAccessReviewInstances in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessReviewInstance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Navigation property to get list of access reviews pending approval by reviewer.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
