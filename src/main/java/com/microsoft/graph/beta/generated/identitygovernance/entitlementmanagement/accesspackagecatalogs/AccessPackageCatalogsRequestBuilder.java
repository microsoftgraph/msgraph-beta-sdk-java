package com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogs;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogs.count.CountRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogs.item.AccessPackageCatalogItemRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogs.search.SearchRequestBuilder;
import com.microsoft.graph.beta.models.AccessPackageCatalog;
import com.microsoft.graph.beta.models.AccessPackageCatalogCollectionResponse;
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
 * Provides operations to manage the accessPackageCatalogs property of the microsoft.graph.entitlementManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageCatalogsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the Search method.
     * @return a {@link SearchRequestBuilder}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageCatalogs property of the microsoft.graph.entitlementManagement entity.
     * @param accessPackageCatalogId The unique identifier of accessPackageCatalog
     * @return a {@link AccessPackageCatalogItemRequestBuilder}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public AccessPackageCatalogItemRequestBuilder byAccessPackageCatalogId(@jakarta.annotation.Nonnull final String accessPackageCatalogId) {
        Objects.requireNonNull(accessPackageCatalogId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageCatalog%2Did", accessPackageCatalogId);
        return new AccessPackageCatalogItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AccessPackageCatalogsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageCatalogsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageCatalogs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AccessPackageCatalogsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageCatalogsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageCatalogs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve a list of accessPackageCatalog objects.
     * @return a {@link AccessPackageCatalogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-accesspackagecatalogs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccessPackageCatalogCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of accessPackageCatalog objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageCatalogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-accesspackagecatalogs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccessPackageCatalogCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageCatalogCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new accessPackageCatalog object.
     * @param body The request body
     * @return a {@link AccessPackageCatalog}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-accesspackagecatalogs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccessPackageCatalog post(@jakarta.annotation.Nonnull final AccessPackageCatalog body) {
        return post(body, null);
    }
    /**
     * Create a new accessPackageCatalog object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageCatalog}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-accesspackagecatalogs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccessPackageCatalog post(@jakarta.annotation.Nonnull final AccessPackageCatalog body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageCatalog::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of accessPackageCatalog objects.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of accessPackageCatalog objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new accessPackageCatalog object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageCatalog body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new accessPackageCatalog object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageCatalog body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AccessPackageCatalogsRequestBuilder}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public AccessPackageCatalogsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessPackageCatalogsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of accessPackageCatalog objects.
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
