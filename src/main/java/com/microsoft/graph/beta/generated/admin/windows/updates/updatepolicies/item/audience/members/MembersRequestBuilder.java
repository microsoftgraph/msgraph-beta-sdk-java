package com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members;

import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.count.CountRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.item.UpdatableAssetItemRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.microsoftgraphwindowsupdatesenrollassets.MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.microsoftgraphwindowsupdatesenrollassetsbyid.MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.microsoftgraphwindowsupdatesunenrollassets.MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.microsoftgraphwindowsupdatesunenrollassetsbyid.MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.windowsupdates.UpdatableAsset;
import com.microsoft.graph.beta.models.windowsupdates.UpdatableAssetCollectionResponse;
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
 * Provides operations to manage the members property of the microsoft.graph.windowsUpdates.deploymentAudience entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enrollAssets method.
     * @return a {@link MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder microsoftGraphWindowsUpdatesEnrollAssets() {
        return new MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enrollAssetsById method.
     * @return a {@link MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder microsoftGraphWindowsUpdatesEnrollAssetsById() {
        return new MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unenrollAssets method.
     * @return a {@link MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder microsoftGraphWindowsUpdatesUnenrollAssets() {
        return new MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unenrollAssetsById method.
     * @return a {@link MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder microsoftGraphWindowsUpdatesUnenrollAssetsById() {
        return new MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.windowsUpdates.deploymentAudience entity.
     * @param updatableAssetId The unique identifier of updatableAsset
     * @return a {@link UpdatableAssetItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdatableAssetItemRequestBuilder byUpdatableAssetId(@jakarta.annotation.Nonnull final String updatableAssetId) {
        Objects.requireNonNull(updatableAssetId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("updatableAsset%2Did", updatableAssetId);
        return new UpdatableAssetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatePolicies/{updatePolicy%2Did}/audience/members{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatePolicies/{updatePolicy%2Did}/audience/members{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Specifies the assets to include in the audience.
     * @return a {@link UpdatableAssetCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UpdatableAssetCollectionResponse get() {
        return get(null);
    }
    /**
     * Specifies the assets to include in the audience.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdatableAssetCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UpdatableAssetCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UpdatableAssetCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to members for admin
     * @param body The request body
     * @return a {@link UpdatableAsset}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset post(@jakarta.annotation.Nonnull final UpdatableAsset body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to members for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdatableAsset}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset post(@jakarta.annotation.Nonnull final UpdatableAsset body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UpdatableAsset::createFromDiscriminatorValue);
    }
    /**
     * Specifies the assets to include in the audience.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Specifies the assets to include in the audience.
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
     * Create new navigation property to members for admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatableAsset body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to members for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdatableAsset body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Specifies the assets to include in the audience.
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
