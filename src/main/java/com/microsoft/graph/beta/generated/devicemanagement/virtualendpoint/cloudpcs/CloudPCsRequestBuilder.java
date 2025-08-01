package com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.getprovisionedcloudpcswithgroupidwithserviceplanid.GetProvisionedCloudPCsWithGroupIdWithServicePlanIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.item.CloudPCItemRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.retrievecloudpccountbystatus.RetrieveCloudPcCountByStatusRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.validatebulkresize.ValidateBulkResizeRequestBuilder;
import com.microsoft.graph.beta.models.CloudPC;
import com.microsoft.graph.beta.models.CloudPCCollectionResponse;
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
 * Provides operations to manage the cloudPCs property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPCsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveCloudPcCountByStatus method.
     * @return a {@link RetrieveCloudPcCountByStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveCloudPcCountByStatusRequestBuilder retrieveCloudPcCountByStatus() {
        return new RetrieveCloudPcCountByStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateBulkResize method.
     * @return a {@link ValidateBulkResizeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidateBulkResizeRequestBuilder validateBulkResize() {
        return new ValidateBulkResizeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPCs property of the microsoft.graph.virtualEndpoint entity.
     * @param cloudPCId The unique identifier of cloudPC
     * @return a {@link CloudPCItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudPCItemRequestBuilder byCloudPCId(@jakarta.annotation.Nonnull final String cloudPCId) {
        Objects.requireNonNull(cloudPCId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPC%2Did", cloudPCId);
        return new CloudPCItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CloudPCsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link CloudPCsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List the cloudPC devices in a tenant.
     * @return a {@link CloudPCCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-cloudpcs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPCCollectionResponse get() {
        return get(null);
    }
    /**
     * List the cloudPC devices in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPCCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualendpoint-list-cloudpcs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPCCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPCCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getProvisionedCloudPCs method.
     * @param groupId Usage: groupId=&apos;{groupId}&apos;
     * @param servicePlanId Usage: servicePlanId=&apos;{servicePlanId}&apos;
     * @return a {@link GetProvisionedCloudPCsWithGroupIdWithServicePlanIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetProvisionedCloudPCsWithGroupIdWithServicePlanIdRequestBuilder getProvisionedCloudPCsWithGroupIdWithServicePlanId(@jakarta.annotation.Nonnull final String groupId, @jakarta.annotation.Nonnull final String servicePlanId) {
        Objects.requireNonNull(groupId);
        Objects.requireNonNull(servicePlanId);
        return new GetProvisionedCloudPCsWithGroupIdWithServicePlanIdRequestBuilder(pathParameters, requestAdapter, groupId, servicePlanId);
    }
    /**
     * Create new navigation property to cloudPCs for deviceManagement
     * @param body The request body
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC post(@jakarta.annotation.Nonnull final CloudPC body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to cloudPCs for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC post(@jakarta.annotation.Nonnull final CloudPC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPC::createFromDiscriminatorValue);
    }
    /**
     * List the cloudPC devices in a tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List the cloudPC devices in a tenant.
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
     * Create new navigation property to cloudPCs for deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPC body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to cloudPCs for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CloudPCsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudPCsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloudPCsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List the cloudPC devices in a tenant.
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
