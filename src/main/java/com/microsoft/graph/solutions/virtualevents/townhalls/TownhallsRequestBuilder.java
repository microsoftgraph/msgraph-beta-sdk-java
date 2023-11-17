package com.microsoft.graph.solutions.virtualevents.townhalls;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEventTownhall;
import com.microsoft.graph.models.VirtualEventTownhallCollectionResponse;
import com.microsoft.graph.solutions.virtualevents.townhalls.count.CountRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.getbyuseridandrolewithuseridwithrole.GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.getbyuserrolewithrole.GetByUserRoleWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.item.VirtualEventTownhallItemRequestBuilder;
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
 * Provides operations to manage the townhalls property of the microsoft.graph.virtualEventsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TownhallsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the townhalls property of the microsoft.graph.virtualEventsRoot entity.
     * @param virtualEventTownhallId The unique identifier of virtualEventTownhall
     * @return a VirtualEventTownhallItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VirtualEventTownhallItemRequestBuilder byVirtualEventTownhallId(@jakarta.annotation.Nonnull final String virtualEventTownhallId) {
        Objects.requireNonNull(virtualEventTownhallId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("virtualEventTownhall%2Did", virtualEventTownhallId);
        return new VirtualEventTownhallItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TownhallsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TownhallsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/townhalls{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TownhallsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TownhallsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/townhalls{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get townhalls from solutions
     * @return a VirtualEventTownhallCollectionResponse
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhallCollectionResponse get() {
        return get(null);
    }
    /**
     * Get townhalls from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VirtualEventTownhallCollectionResponse
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhallCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, VirtualEventTownhallCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the getByUserIdAndRole method.
     * @param role Usage: role='{role}'
     * @param userId Usage: userId='{userId}'
     * @return a GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder getByUserIdAndRoleWithUserIdWithRole(@jakarta.annotation.Nonnull final String role, @jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(role);
        Objects.requireNonNull(userId);
        return new GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder(pathParameters, requestAdapter, role, userId);
    }
    /**
     * Provides operations to call the getByUserRole method.
     * @param role Usage: role='{role}'
     * @return a GetByUserRoleWithRoleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetByUserRoleWithRoleRequestBuilder getByUserRoleWithRole(@jakarta.annotation.Nonnull final String role) {
        Objects.requireNonNull(role);
        return new GetByUserRoleWithRoleRequestBuilder(pathParameters, requestAdapter, role);
    }
    /**
     * Create new navigation property to townhalls for solutions
     * @param body The request body
     * @return a VirtualEventTownhall
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhall post(@jakarta.annotation.Nonnull final VirtualEventTownhall body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to townhalls for solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VirtualEventTownhall
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhall post(@jakarta.annotation.Nonnull final VirtualEventTownhall body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, VirtualEventTownhall::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get townhalls from solutions
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get townhalls from solutions
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
     * Create new navigation property to townhalls for solutions
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventTownhall body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to townhalls for solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventTownhall body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a TownhallsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TownhallsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TownhallsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get townhalls from solutions
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
