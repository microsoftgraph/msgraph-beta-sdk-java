package com.microsoft.graph.beta.sites.item.pages.item.graphsitepage;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SitePage;
import com.microsoft.graph.beta.sites.item.pages.item.graphsitepage.canvaslayout.CanvasLayoutRequestBuilder;
import com.microsoft.graph.beta.sites.item.pages.item.graphsitepage.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.beta.sites.item.pages.item.graphsitepage.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.beta.sites.item.pages.item.graphsitepage.webparts.WebPartsRequestBuilder;
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
 * Casts the previous resource to sitePage.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphSitePageRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the canvasLayout property of the microsoft.graph.sitePage entity.
     * @return a {@link CanvasLayoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CanvasLayoutRequestBuilder canvasLayout() {
        return new CanvasLayoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link CreatedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link LastModifiedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the webParts property of the microsoft.graph.sitePage entity.
     * @return a {@link WebPartsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WebPartsRequestBuilder webParts() {
        return new WebPartsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GraphSitePageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphSitePageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/pages/{baseSitePage%2Did}/graph.sitePage{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphSitePageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphSitePageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/pages/{baseSitePage%2Did}/graph.sitePage{?%24expand,%24select}", rawUrl);
    }
    /**
     * Returns the metadata for a sitePage in the site pages list in a site.
     * @return a {@link SitePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sitepage-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SitePage get() {
        return get(null);
    }
    /**
     * Returns the metadata for a sitePage in the site pages list in a site.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SitePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sitepage-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SitePage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SitePage::createFromDiscriminatorValue);
    }
    /**
     * Returns the metadata for a sitePage in the site pages list in a site.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the metadata for a sitePage in the site pages list in a site.
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
     * @return a {@link GraphSitePageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphSitePageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphSitePageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns the metadata for a sitePage in the site pages list in a site.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
