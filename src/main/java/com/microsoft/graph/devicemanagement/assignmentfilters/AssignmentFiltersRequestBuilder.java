package com.microsoft.graph.devicemanagement.assignmentfilters;

import com.microsoft.graph.devicemanagement.assignmentfilters.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.enable.EnableRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.getplatformsupportedpropertieswithplatform.GetPlatformSupportedPropertiesWithPlatformRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.getstate.GetStateRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.item.DeviceAndAppManagementAssignmentFilterItemRequestBuilder;
import com.microsoft.graph.devicemanagement.assignmentfilters.validatefilter.ValidateFilterRequestBuilder;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilterCollectionResponse;
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
 * Provides operations to manage the assignmentFilters property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentFiltersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enable method.
     */
    @jakarta.annotation.Nonnull
    public EnableRequestBuilder enable() {
        return new EnableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getState method.
     */
    @jakarta.annotation.Nonnull
    public GetStateRequestBuilder getState() {
        return new GetStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateFilter method.
     */
    @jakarta.annotation.Nonnull
    public ValidateFilterRequestBuilder validateFilter() {
        return new ValidateFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentFilters property of the microsoft.graph.deviceManagement entity.
     * @param deviceAndAppManagementAssignmentFilterId The unique identifier of deviceAndAppManagementAssignmentFilter
     * @return a DeviceAndAppManagementAssignmentFilterItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceAndAppManagementAssignmentFilterItemRequestBuilder byDeviceAndAppManagementAssignmentFilterId(@jakarta.annotation.Nonnull final String deviceAndAppManagementAssignmentFilterId) {
        Objects.requireNonNull(deviceAndAppManagementAssignmentFilterId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceAndAppManagementAssignmentFilter%2Did", deviceAndAppManagementAssignmentFilterId);
        return new DeviceAndAppManagementAssignmentFilterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AssignmentFiltersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentFiltersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/assignmentFilters{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AssignmentFiltersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentFiltersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/assignmentFilters{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The list of assignment filters
     * @return a DeviceAndAppManagementAssignmentFilterCollectionResponse
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterCollectionResponse get() {
        return get(null);
    }
    /**
     * The list of assignment filters
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceAndAppManagementAssignmentFilterCollectionResponse
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, DeviceAndAppManagementAssignmentFilterCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the getPlatformSupportedProperties method.
     * @param platform Usage: platform='{platform}'
     * @return a GetPlatformSupportedPropertiesWithPlatformRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetPlatformSupportedPropertiesWithPlatformRequestBuilder getPlatformSupportedPropertiesWithPlatform(@jakarta.annotation.Nonnull final String platform) {
        Objects.requireNonNull(platform);
        return new GetPlatformSupportedPropertiesWithPlatformRequestBuilder(pathParameters, requestAdapter, platform);
    }
    /**
     * Create new navigation property to assignmentFilters for deviceManagement
     * @param body The request body
     * @return a DeviceAndAppManagementAssignmentFilter
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilter post(@jakarta.annotation.Nonnull final DeviceAndAppManagementAssignmentFilter body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to assignmentFilters for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceAndAppManagementAssignmentFilter
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilter post(@jakarta.annotation.Nonnull final DeviceAndAppManagementAssignmentFilter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * The list of assignment filters
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of assignment filters
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
     * Create new navigation property to assignmentFilters for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceAndAppManagementAssignmentFilter body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to assignmentFilters for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceAndAppManagementAssignmentFilter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AssignmentFiltersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AssignmentFiltersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignmentFiltersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The list of assignment filters
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
