package com.microsoft.graph.admin.windows.updates.updatableassets;

import com.microsoft.graph.admin.windows.updates.updatableassets.count.CountRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.item.UpdatableAssetItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.microsoftgraphwindowsupdatesenrollassets.MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.microsoftgraphwindowsupdatesenrollassetsbyid.MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.microsoftgraphwindowsupdatesunenrollassets.MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.microsoftgraphwindowsupdatesunenrollassetsbyid.MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.windowsupdates.UpdatableAsset;
import com.microsoft.graph.models.windowsupdates.UpdatableAssetCollectionResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity.
 */
public class UpdatableAssetsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to count the resources in the collection. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enrollAssets method. */
    @javax.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder microsoftGraphWindowsUpdatesEnrollAssets() {
        return new MicrosoftGraphWindowsUpdatesEnrollAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enrollAssetsById method. */
    @javax.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder microsoftGraphWindowsUpdatesEnrollAssetsById() {
        return new MicrosoftGraphWindowsUpdatesEnrollAssetsByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unenrollAssets method. */
    @javax.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder microsoftGraphWindowsUpdatesUnenrollAssets() {
        return new MicrosoftGraphWindowsUpdatesUnenrollAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unenrollAssetsById method. */
    @javax.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder microsoftGraphWindowsUpdatesUnenrollAssetsById() {
        return new MicrosoftGraphWindowsUpdatesUnenrollAssetsByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity.
     * @param updatableAssetId Unique identifier of the item
     * @return a UpdatableAssetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UpdatableAssetItemRequestBuilder byUpdatableAssetId(@javax.annotation.Nonnull final String updatableAssetId) {
        Objects.requireNonNull(updatableAssetId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("updatableAsset%2Did", updatableAssetId);
        return new UpdatableAssetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UpdatableAssetsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatableAssetsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatableAssets{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UpdatableAssetsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatableAssetsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatableAssets{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of updatableAsset objects and their properties. Listing updatable assets returns **updatableAsset** resources of the following derived types: azureADDevice and updatableAssetGroup. Use list azureADDevice resources or list updatableAssetGroup resources to filter and get resources of only one of the derived types.
     * @return a CompletableFuture of UpdatableAssetCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/adminwindowsupdates-list-updatableassets?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdatableAssetCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of updatableAsset objects and their properties. Listing updatable assets returns **updatableAsset** resources of the following derived types: azureADDevice and updatableAssetGroup. Use list azureADDevice resources or list updatableAssetGroup resources to filter and get resources of only one of the derived types.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UpdatableAssetCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/adminwindowsupdates-list-updatableassets?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdatableAssetCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UpdatableAssetCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new updatableAssetGroup object. The **updatableAssetGroup** resource inherits from updatableAsset.
     * @param body The request body
     * @return a CompletableFuture of updatableAsset
     * @see <a href="https://docs.microsoft.com/graph/api/adminwindowsupdates-post-updatableassets-updatableassetgroup?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdatableAsset> post(@javax.annotation.Nonnull final UpdatableAsset body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdatableAsset::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdatableAsset> executionException = new java.util.concurrent.CompletableFuture<UpdatableAsset>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new updatableAssetGroup object. The **updatableAssetGroup** resource inherits from updatableAsset.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of updatableAsset
     * @see <a href="https://docs.microsoft.com/graph/api/adminwindowsupdates-post-updatableassets-updatableassetgroup?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdatableAsset> post(@javax.annotation.Nonnull final UpdatableAsset body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdatableAsset::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdatableAsset> executionException = new java.util.concurrent.CompletableFuture<UpdatableAsset>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of updatableAsset objects and their properties. Listing updatable assets returns **updatableAsset** resources of the following derived types: azureADDevice and updatableAssetGroup. Use list azureADDevice resources or list updatableAssetGroup resources to filter and get resources of only one of the derived types.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of updatableAsset objects and their properties. Listing updatable assets returns **updatableAsset** resources of the following derived types: azureADDevice and updatableAssetGroup. Use list azureADDevice resources or list updatableAssetGroup resources to filter and get resources of only one of the derived types.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create a new updatableAssetGroup object. The **updatableAssetGroup** resource inherits from updatableAsset.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UpdatableAsset body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new updatableAssetGroup object. The **updatableAssetGroup** resource inherits from updatableAsset.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UpdatableAsset body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get a list of updatableAsset objects and their properties. Listing updatable assets returns **updatableAsset** resources of the following derived types: azureADDevice and updatableAssetGroup. Use list azureADDevice resources or list updatableAssetGroup resources to filter and get resources of only one of the derived types.
     */
    public class GetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
