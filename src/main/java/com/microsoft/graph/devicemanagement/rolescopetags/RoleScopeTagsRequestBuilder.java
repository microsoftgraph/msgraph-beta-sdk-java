package com.microsoft.graph.devicemanagement.rolescopetags;

import com.microsoft.graph.devicemanagement.rolescopetags.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.rolescopetags.getrolescopetagsbyid.GetRoleScopeTagsByIdRequestBuilder;
import com.microsoft.graph.devicemanagement.rolescopetags.hascustomrolescopetag.HasCustomRoleScopeTagRequestBuilder;
import com.microsoft.graph.devicemanagement.rolescopetags.item.RoleScopeTagItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.models.RoleScopeTagCollectionResponse;
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
 * Provides operations to manage the roleScopeTags property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleScopeTagsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getRoleScopeTagsById method.
     */
    @jakarta.annotation.Nonnull
    public GetRoleScopeTagsByIdRequestBuilder getRoleScopeTagsById() {
        return new GetRoleScopeTagsByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hasCustomRoleScopeTag method.
     */
    @jakarta.annotation.Nonnull
    public HasCustomRoleScopeTagRequestBuilder hasCustomRoleScopeTag() {
        return new HasCustomRoleScopeTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleScopeTags property of the microsoft.graph.deviceManagement entity.
     * @param roleScopeTagId The unique identifier of roleScopeTag
     * @return a RoleScopeTagItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RoleScopeTagItemRequestBuilder byRoleScopeTagId(@jakarta.annotation.Nonnull final String roleScopeTagId) {
        Objects.requireNonNull(roleScopeTagId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("roleScopeTag%2Did", roleScopeTagId);
        return new RoleScopeTagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RoleScopeTagsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleScopeTagsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/roleScopeTags{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RoleScopeTagsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleScopeTagsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/roleScopeTags{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The Role Scope Tags.
     * @return a RoleScopeTagCollectionResponse
     */
    @jakarta.annotation.Nullable
    public RoleScopeTagCollectionResponse get() {
        return get(null);
    }
    /**
     * The Role Scope Tags.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RoleScopeTagCollectionResponse
     */
    @jakarta.annotation.Nullable
    public RoleScopeTagCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RoleScopeTagCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to roleScopeTags for deviceManagement
     * @param body The request body
     * @return a RoleScopeTag
     */
    @jakarta.annotation.Nullable
    public RoleScopeTag post(@jakarta.annotation.Nonnull final RoleScopeTag body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to roleScopeTags for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RoleScopeTag
     */
    @jakarta.annotation.Nullable
    public RoleScopeTag post(@jakarta.annotation.Nonnull final RoleScopeTag body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RoleScopeTag::createFromDiscriminatorValue);
    }
    /**
     * The Role Scope Tags.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The Role Scope Tags.
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
     * Create new navigation property to roleScopeTags for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RoleScopeTag body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to roleScopeTags for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RoleScopeTag body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a RoleScopeTagsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RoleScopeTagsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RoleScopeTagsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The Role Scope Tags.
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
