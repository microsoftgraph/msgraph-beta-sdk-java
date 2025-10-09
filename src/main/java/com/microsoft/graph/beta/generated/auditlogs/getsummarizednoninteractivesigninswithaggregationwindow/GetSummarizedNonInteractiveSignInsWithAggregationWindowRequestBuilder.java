package com.microsoft.graph.beta.auditlogs.getsummarizednoninteractivesigninswithaggregationwindow;

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
 * Provides operations to call the getSummarizedNonInteractiveSignIns method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder} and sets the default values.
     * @param aggregationWindow Usage: aggregationWindow=&apos;{aggregationWindow}&apos;
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String aggregationWindow) {
        super(requestAdapter, "{+baseurl}/auditLogs/getSummarizedNonInteractiveSignIns(aggregationWindow='{aggregationWindow}'){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
        this.pathParameters.put("aggregationWindow", aggregationWindow);
    }
    /**
     * Instantiates a new {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs/getSummarizedNonInteractiveSignIns(aggregationWindow='{aggregationWindow}'){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Returns aggregated non-interactive sign-in event counts grouped by user, application, IP address, and time window, with drill-down capability using individual requestIds via the /signIns endpoint. This includes autonomous agent sign-in events.
     * @return a {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/auditlogroot-getsummarizednoninteractivesignins?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowGetResponse get() {
        return get(null);
    }
    /**
     * Returns aggregated non-interactive sign-in event counts grouped by user, application, IP address, and time window, with drill-down capability using individual requestIds via the /signIns endpoint. This includes autonomous agent sign-in events.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/auditlogroot-getsummarizednoninteractivesignins?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetSummarizedNonInteractiveSignInsWithAggregationWindowGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns aggregated non-interactive sign-in event counts grouped by user, application, IP address, and time window, with drill-down capability using individual requestIds via the /signIns endpoint. This includes autonomous agent sign-in events.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns aggregated non-interactive sign-in event counts grouped by user, application, IP address, and time window, with drill-down capability using individual requestIds via the /signIns endpoint. This includes autonomous agent sign-in events.
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
     * @return a {@link GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetSummarizedNonInteractiveSignInsWithAggregationWindowRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns aggregated non-interactive sign-in event counts grouped by user, application, IP address, and time window, with drill-down capability using individual requestIds via the /signIns endpoint. This includes autonomous agent sign-in events.
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
