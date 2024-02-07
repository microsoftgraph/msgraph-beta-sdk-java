package com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.getstorageaccountswithsubscriptionid.GetStorageAccountsWithSubscriptionIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.getsubscriptions.GetSubscriptionsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.item.CloudPcSnapshotItemRequestBuilder;
import com.microsoft.graph.beta.models.CloudPcSnapshot;
import com.microsoft.graph.beta.models.CloudPcSnapshotCollectionResponse;
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
 * Provides operations to manage the snapshots property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SnapshotsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSubscriptions method.
     */
    @jakarta.annotation.Nonnull
    public GetSubscriptionsRequestBuilder getSubscriptions() {
        return new GetSubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the snapshots property of the microsoft.graph.virtualEndpoint entity.
     * @param cloudPcSnapshotId The unique identifier of cloudPcSnapshot
     * @return a CloudPcSnapshotItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CloudPcSnapshotItemRequestBuilder byCloudPcSnapshotId(@jakarta.annotation.Nonnull final String cloudPcSnapshotId) {
        Objects.requireNonNull(cloudPcSnapshotId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcSnapshot%2Did", cloudPcSnapshotId);
        return new CloudPcSnapshotItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SnapshotsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SnapshotsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new SnapshotsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SnapshotsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a list of cloudPcSnapshot objects and their properties.
     * @return a CloudPcSnapshotCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-snapshots?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of cloudPcSnapshot objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcSnapshotCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-snapshots?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcSnapshotCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getStorageAccounts method.
     * @param subscriptionId Usage: subscriptionId='{subscriptionId}'
     * @return a GetStorageAccountsWithSubscriptionIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetStorageAccountsWithSubscriptionIdRequestBuilder getStorageAccountsWithSubscriptionId(@jakarta.annotation.Nonnull final String subscriptionId) {
        Objects.requireNonNull(subscriptionId);
        return new GetStorageAccountsWithSubscriptionIdRequestBuilder(pathParameters, requestAdapter, subscriptionId);
    }
    /**
     * Create new navigation property to snapshots for deviceManagement
     * @param body The request body
     * @return a CloudPcSnapshot
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshot post(@jakarta.annotation.Nonnull final CloudPcSnapshot body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to snapshots for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcSnapshot
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshot post(@jakarta.annotation.Nonnull final CloudPcSnapshot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcSnapshot::createFromDiscriminatorValue);
    }
    /**
     * Get a list of cloudPcSnapshot objects and their properties.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of cloudPcSnapshot objects and their properties.
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
     * Create new navigation property to snapshots for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcSnapshot body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to snapshots for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcSnapshot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a SnapshotsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SnapshotsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SnapshotsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of cloudPcSnapshot objects and their properties.
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
         * @return a Map<String, Object>
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
