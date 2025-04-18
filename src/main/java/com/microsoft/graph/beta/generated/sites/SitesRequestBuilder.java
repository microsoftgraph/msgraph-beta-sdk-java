package com.microsoft.graph.beta.sites;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SiteCollectionResponse;
import com.microsoft.graph.beta.sites.add.AddRequestBuilder;
import com.microsoft.graph.beta.sites.count.CountRequestBuilder;
import com.microsoft.graph.beta.sites.delta.DeltaRequestBuilder;
import com.microsoft.graph.beta.sites.getallsites.GetAllSitesRequestBuilder;
import com.microsoft.graph.beta.sites.item.SiteItemRequestBuilder;
import com.microsoft.graph.beta.sites.remove.RemoveRequestBuilder;
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
 * Provides operations to manage the collection of site entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SitesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the add method.
     * @return a {@link AddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllSites method.
     * @return a {@link GetAllSitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllSitesRequestBuilder getAllSites() {
        return new GetAllSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the remove method.
     * @return a {@link RemoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveRequestBuilder remove() {
        return new RemoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     * @param siteId The unique identifier of site
     * @return a {@link SiteItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteItemRequestBuilder bySiteId(@jakarta.annotation.Nonnull final String siteId) {
        Objects.requireNonNull(siteId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", siteId);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SitesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SitesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link SitesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SitesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Search across a SharePoint tenant for sites that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @return a {@link SiteCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/site-search?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SiteCollectionResponse get() {
        return get(null);
    }
    /**
     * Search across a SharePoint tenant for sites that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SiteCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/site-search?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SiteCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SiteCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Search across a SharePoint tenant for sites that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Search across a SharePoint tenant for sites that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SitesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Search across a SharePoint tenant for sites that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
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
}
