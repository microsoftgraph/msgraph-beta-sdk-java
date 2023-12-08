package com.microsoft.graph.beta.reports.userinsights.monthly.activeusersbreakdown.item;

import com.microsoft.graph.beta.models.ActiveUsersBreakdownMetric;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the activeUsersBreakdown property of the microsoft.graph.monthlyUserInsightMetricsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActiveUsersBreakdownMetricItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ActiveUsersBreakdownMetricItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActiveUsersBreakdownMetricItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/monthly/activeUsersBreakdown/{activeUsersBreakdownMetric%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ActiveUsersBreakdownMetricItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActiveUsersBreakdownMetricItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/userInsights/monthly/activeUsersBreakdown/{activeUsersBreakdownMetric%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Insights for the breakdown of users who were active on apps registered in the tenant for a specified period.
     * @return a ActiveUsersBreakdownMetric
     */
    @jakarta.annotation.Nullable
    public ActiveUsersBreakdownMetric get() {
        return get(null);
    }
    /**
     * Insights for the breakdown of users who were active on apps registered in the tenant for a specified period.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ActiveUsersBreakdownMetric
     */
    @jakarta.annotation.Nullable
    public ActiveUsersBreakdownMetric get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ActiveUsersBreakdownMetric::createFromDiscriminatorValue);
    }
    /**
     * Insights for the breakdown of users who were active on apps registered in the tenant for a specified period.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Insights for the breakdown of users who were active on apps registered in the tenant for a specified period.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ActiveUsersBreakdownMetricItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ActiveUsersBreakdownMetricItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActiveUsersBreakdownMetricItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Insights for the breakdown of users who were active on apps registered in the tenant for a specified period.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
