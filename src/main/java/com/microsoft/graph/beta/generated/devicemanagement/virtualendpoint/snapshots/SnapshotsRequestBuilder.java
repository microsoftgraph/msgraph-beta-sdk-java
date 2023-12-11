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
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SnapshotsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SnapshotsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
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
