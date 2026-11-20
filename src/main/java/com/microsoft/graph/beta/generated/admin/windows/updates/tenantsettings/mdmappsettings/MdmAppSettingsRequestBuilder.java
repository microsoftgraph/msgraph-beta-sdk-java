package com.microsoft.graph.beta.admin.windows.updates.tenantsettings.mdmappsettings;

import com.microsoft.graph.beta.admin.windows.updates.tenantsettings.mdmappsettings.count.CountRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.tenantsettings.mdmappsettings.item.MdmAppSettingMdmAppItemRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.windowsupdates.MdmAppSetting;
import com.microsoft.graph.beta.models.windowsupdates.MdmAppSettingCollectionResponse;
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
 * Provides operations to manage the mdmAppSettings property of the microsoft.graph.windowsUpdates.tenantSetting entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MdmAppSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mdmAppSettings property of the microsoft.graph.windowsUpdates.tenantSetting entity.
     * @param mdmAppSettingMdmAppId The unique identifier of mdmAppSetting
     * @return a {@link MdmAppSettingMdmAppItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MdmAppSettingMdmAppItemRequestBuilder byMdmAppSettingMdmAppId(@jakarta.annotation.Nonnull final String mdmAppSettingMdmAppId) {
        Objects.requireNonNull(mdmAppSettingMdmAppId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mdmAppSetting%2DmdmAppId", mdmAppSettingMdmAppId);
        return new MdmAppSettingMdmAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MdmAppSettingsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MdmAppSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/tenantSettings/mdmAppSettings{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MdmAppSettingsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MdmAppSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/tenantSettings/mdmAppSettings{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the mdmAppSetting resources for the current tenant.
     * @return a {@link MdmAppSettingCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-tenantsetting-list-mdmappsettings?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MdmAppSettingCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the mdmAppSetting resources for the current tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MdmAppSettingCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-tenantsetting-list-mdmappsettings?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MdmAppSettingCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MdmAppSettingCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create an mdmAppSetting resource for an MDM application in the current tenant.
     * @param body Per-MDM-application settings for a tenant, identified by a unique MDM app ID (GUID-formatted string).
     * @return a {@link MdmAppSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-tenantsetting-post-mdmappsettings?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MdmAppSetting post(@jakarta.annotation.Nonnull final MdmAppSetting body) {
        return post(body, null);
    }
    /**
     * Create an mdmAppSetting resource for an MDM application in the current tenant.
     * @param body Per-MDM-application settings for a tenant, identified by a unique MDM app ID (GUID-formatted string).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MdmAppSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-tenantsetting-post-mdmappsettings?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MdmAppSetting post(@jakarta.annotation.Nonnull final MdmAppSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MdmAppSetting::createFromDiscriminatorValue);
    }
    /**
     * Get the mdmAppSetting resources for the current tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the mdmAppSetting resources for the current tenant.
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
     * Create an mdmAppSetting resource for an MDM application in the current tenant.
     * @param body Per-MDM-application settings for a tenant, identified by a unique MDM app ID (GUID-formatted string).
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MdmAppSetting body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an mdmAppSetting resource for an MDM application in the current tenant.
     * @param body Per-MDM-application settings for a tenant, identified by a unique MDM app ID (GUID-formatted string).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MdmAppSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MdmAppSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MdmAppSettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MdmAppSettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the mdmAppSetting resources for the current tenant.
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
