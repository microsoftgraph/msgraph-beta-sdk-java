package com.microsoft.graph.devicemanagement.configmanagercollections;

import com.microsoft.graph.devicemanagement.configmanagercollections.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.configmanagercollections.getpolicysummarywithpolicyid.GetPolicySummaryWithPolicyIdRequestBuilder;
import com.microsoft.graph.devicemanagement.configmanagercollections.item.ConfigManagerCollectionItemRequestBuilder;
import com.microsoft.graph.models.ConfigManagerCollection;
import com.microsoft.graph.models.ConfigManagerCollectionCollectionResponse;
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
 * Provides operations to manage the configManagerCollections property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigManagerCollectionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configManagerCollections property of the microsoft.graph.deviceManagement entity.
     * @param configManagerCollectionId The unique identifier of configManagerCollection
     * @return a ConfigManagerCollectionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConfigManagerCollectionItemRequestBuilder byConfigManagerCollectionId(@jakarta.annotation.Nonnull final String configManagerCollectionId) {
        Objects.requireNonNull(configManagerCollectionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("configManagerCollection%2Did", configManagerCollectionId);
        return new ConfigManagerCollectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConfigManagerCollectionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigManagerCollectionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ConfigManagerCollectionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigManagerCollectionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * A list of ConfigManagerCollection
     * @return a ConfigManagerCollectionCollectionResponse
     */
    @jakarta.annotation.Nullable
    public ConfigManagerCollectionCollectionResponse get() {
        return get(null);
    }
    /**
     * A list of ConfigManagerCollection
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ConfigManagerCollectionCollectionResponse
     */
    @jakarta.annotation.Nullable
    public ConfigManagerCollectionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConfigManagerCollectionCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getPolicySummary method.
     * @param policyId Usage: policyId='{policyId}'
     * @return a GetPolicySummaryWithPolicyIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetPolicySummaryWithPolicyIdRequestBuilder getPolicySummaryWithPolicyId(@jakarta.annotation.Nonnull final String policyId) {
        Objects.requireNonNull(policyId);
        return new GetPolicySummaryWithPolicyIdRequestBuilder(pathParameters, requestAdapter, policyId);
    }
    /**
     * Create new navigation property to configManagerCollections for deviceManagement
     * @param body The request body
     * @return a ConfigManagerCollection
     */
    @jakarta.annotation.Nullable
    public ConfigManagerCollection post(@jakarta.annotation.Nonnull final ConfigManagerCollection body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to configManagerCollections for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ConfigManagerCollection
     */
    @jakarta.annotation.Nullable
    public ConfigManagerCollection post(@jakarta.annotation.Nonnull final ConfigManagerCollection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConfigManagerCollection::createFromDiscriminatorValue);
    }
    /**
     * A list of ConfigManagerCollection
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * A list of ConfigManagerCollection
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
     * Create new navigation property to configManagerCollections for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfigManagerCollection body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to configManagerCollections for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfigManagerCollection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ConfigManagerCollectionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConfigManagerCollectionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfigManagerCollectionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * A list of ConfigManagerCollection
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
