package com.microsoft.graph.beta.reports.serviceactivity.getmetricsforagentidautonomoussigninfailurewithinclusiveintervalstartdatetimewithexclusiveintervalenddatetimewithaggregationintervalinminutes;

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
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getMetricsForAgentIdAutonomousSignInFailure method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder} and sets the default values.
     * @param exclusiveIntervalEndDateTime Usage: exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime}
     * @param inclusiveIntervalStartDateTime Usage: inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final OffsetDateTime exclusiveIntervalEndDateTime, @jakarta.annotation.Nullable final OffsetDateTime inclusiveIntervalStartDateTime) {
        super(requestAdapter, "{+baseurl}/reports/serviceActivity/getMetricsForAgentIdAutonomousSignInFailure(inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime},exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime},aggregationIntervalInMinutes=@aggregationIntervalInMinutes){?%24count,%24filter,%24search,%24skip,%24top,aggregationIntervalInMinutes*}", pathParameters);
        this.pathParameters.put("exclusiveIntervalEndDateTime", exclusiveIntervalEndDateTime);
        this.pathParameters.put("inclusiveIntervalStartDateTime", inclusiveIntervalStartDateTime);
    }
    /**
     * Instantiates a new {@link GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/serviceActivity/getMetricsForAgentIdAutonomousSignInFailure(inclusiveIntervalStartDateTime={inclusiveIntervalStartDateTime},exclusiveIntervalEndDateTime={exclusiveIntervalEndDateTime},aggregationIntervalInMinutes=@aggregationIntervalInMinutes){?%24count,%24filter,%24search,%24skip,%24top,aggregationIntervalInMinutes*}", rawUrl);
    }
    /**
     * Retrieve the number of failed autonomous sign-ins by Agent IDs during a specified time period. In Agent ID autonomous sign-ins, the agent signs in and acts as itself, including both Agent ID instances and designated service principals. This metric counts attempts for which authentication wasn&apos;t completed.
     * @return a {@link GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceactivity-getmetricsforagentidautonomoussigninfailure?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse get() {
        return get(null);
    }
    /**
     * Retrieve the number of failed autonomous sign-ins by Agent IDs during a specified time period. In Agent ID autonomous sign-ins, the agent signs in and acts as itself, including both Agent ID instances and designated service principals. This metric counts attempts for which authentication wasn&apos;t completed.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceactivity-getmetricsforagentidautonomoussigninfailure?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the number of failed autonomous sign-ins by Agent IDs during a specified time period. In Agent ID autonomous sign-ins, the agent signs in and acts as itself, including both Agent ID instances and designated service principals. This metric counts attempts for which authentication wasn&apos;t completed.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the number of failed autonomous sign-ins by Agent IDs during a specified time period. In Agent ID autonomous sign-ins, the agent signs in and acts as itself, including both Agent ID instances and designated service principals. This metric counts attempts for which authentication wasn&apos;t completed.
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
     * @return a {@link GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetMetricsForAgentIdAutonomousSignInFailureWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the number of failed autonomous sign-ins by Agent IDs during a specified time period. In Agent ID autonomous sign-ins, the agent signs in and acts as itself, including both Agent ID instances and designated service principals. This metric counts attempts for which authentication wasn&apos;t completed.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: aggregationIntervalInMinutes=@aggregationIntervalInMinutes
         */
        @jakarta.annotation.Nullable
        public Integer aggregationIntervalInMinutes;
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
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
            allQueryParams.put("aggregationIntervalInMinutes", aggregationIntervalInMinutes);
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
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
