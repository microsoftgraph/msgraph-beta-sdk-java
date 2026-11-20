package com.microsoft.graph.beta.reports.getmicrosoft365copilotusercounttrendwithperiodversionversion;

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
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getMicrosoft365CopilotUserCountTrend method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param period Usage: period=&apos;{period}&apos;
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String period) {
        super(requestAdapter, "{+baseurl}/reports/getMicrosoft365CopilotUserCountTrend(period='{period}',version='@version'){?version*}", pathParameters);
        this.pathParameters.put("period", period);
    }
    /**
     * Instantiates a new {@link GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getMicrosoft365CopilotUserCountTrend(period='{period}',version='@version'){?version*}", rawUrl);
    }
    /**
     * Get the trend in the daily number of active and enabled users of Microsoft 365 Copilot for a specified time period.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getmicrosoft365copilotusercounttrend?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Get the trend in the daily number of active and enabled users of Microsoft 365 Copilot for a specified time period.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getmicrosoft365copilotusercounttrend?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Get the trend in the daily number of active and enabled users of Microsoft 365 Copilot for a specified time period.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the trend in the daily number of active and enabled users of Microsoft 365 Copilot for a specified time period.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetMicrosoft365CopilotUserCountTrendWithPeriodversionVersionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the trend in the daily number of active and enabled users of Microsoft 365 Copilot for a specified time period.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: version=&apos;@version&apos;
         */
        @jakarta.annotation.Nullable
        public String version;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("version", version);
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
