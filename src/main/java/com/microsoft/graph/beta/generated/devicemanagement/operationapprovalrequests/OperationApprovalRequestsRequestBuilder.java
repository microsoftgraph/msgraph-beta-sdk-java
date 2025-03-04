package com.microsoft.graph.beta.devicemanagement.operationapprovalrequests;

import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.cancelmyrequest.CancelMyRequestRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.item.OperationApprovalRequestItemRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.retrievemyrequestbyidwithid.RetrieveMyRequestByIdWithIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.retrievemyrequests.RetrieveMyRequestsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.operationapprovalrequests.retrieverequeststatus.RetrieveRequestStatusRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.OperationApprovalRequest;
import com.microsoft.graph.beta.models.OperationApprovalRequestCollectionResponse;
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
 * Provides operations to manage the operationApprovalRequests property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationApprovalRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the cancelMyRequest method.
     * @return a {@link CancelMyRequestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelMyRequestRequestBuilder cancelMyRequest() {
        return new CancelMyRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveMyRequests method.
     * @return a {@link RetrieveMyRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveMyRequestsRequestBuilder retrieveMyRequests() {
        return new RetrieveMyRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveRequestStatus method.
     * @return a {@link RetrieveRequestStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveRequestStatusRequestBuilder retrieveRequestStatus() {
        return new RetrieveRequestStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operationApprovalRequests property of the microsoft.graph.deviceManagement entity.
     * @param operationApprovalRequestId The unique identifier of operationApprovalRequest
     * @return a {@link OperationApprovalRequestItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationApprovalRequestItemRequestBuilder byOperationApprovalRequestId(@jakarta.annotation.Nonnull final String operationApprovalRequestId) {
        Objects.requireNonNull(operationApprovalRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("operationApprovalRequest%2Did", operationApprovalRequestId);
        return new OperationApprovalRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OperationApprovalRequestsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OperationApprovalRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/operationApprovalRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link OperationApprovalRequestsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OperationApprovalRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/operationApprovalRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * The Operation Approval Requests
     * @return a {@link OperationApprovalRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OperationApprovalRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * The Operation Approval Requests
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OperationApprovalRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OperationApprovalRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OperationApprovalRequestCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to operationApprovalRequests for deviceManagement
     * @param body The request body
     * @return a {@link OperationApprovalRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OperationApprovalRequest post(@jakarta.annotation.Nonnull final OperationApprovalRequest body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to operationApprovalRequests for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OperationApprovalRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OperationApprovalRequest post(@jakarta.annotation.Nonnull final OperationApprovalRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OperationApprovalRequest::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the retrieveMyRequestById method.
     * @param id Usage: id=&apos;{id}&apos;
     * @return a {@link RetrieveMyRequestByIdWithIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveMyRequestByIdWithIdRequestBuilder retrieveMyRequestByIdWithId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        return new RetrieveMyRequestByIdWithIdRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * The Operation Approval Requests
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The Operation Approval Requests
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
     * Create new navigation property to operationApprovalRequests for deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OperationApprovalRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to operationApprovalRequests for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OperationApprovalRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link OperationApprovalRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationApprovalRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OperationApprovalRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The Operation Approval Requests
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
