package com.microsoft.graph.beta.networkaccess.alerts.microsoftgraphnetworkaccessgetalertfrequencieswithstartdatetimewithenddatetime;

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
 * Provides operations to call the getAlertFrequencies method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder} and sets the default values.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param startDateTime Usage: startDateTime={startDateTime}
     */
    public MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final OffsetDateTime endDateTime, @jakarta.annotation.Nullable final OffsetDateTime startDateTime) {
        super(requestAdapter, "{+baseurl}/networkAccess/alerts/microsoft.graph.networkaccess.getAlertFrequencies(startDateTime={startDateTime},endDateTime={endDateTime}){?%24count,%24filter,%24search,%24skip,%24top}", pathParameters);
        this.pathParameters.put("endDateTime", endDateTime);
        this.pathParameters.put("startDateTime", startDateTime);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/alerts/microsoft.graph.networkaccess.getAlertFrequencies(startDateTime={startDateTime},endDateTime={endDateTime}){?%24count,%24filter,%24search,%24skip,%24top}", rawUrl);
    }
    /**
     * Invoke function getAlertFrequencies
     * @return a {@link GetAlertFrequenciesWithStartDateTimeWithEndDateTimeGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-06/PrivatePreview:NetworkAccess on 2024-09-09 and will be removed 2024-11-01
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetAlertFrequenciesWithStartDateTimeWithEndDateTimeGetResponse get() {
        return get(null);
    }
    /**
     * Invoke function getAlertFrequencies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAlertFrequenciesWithStartDateTimeWithEndDateTimeGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-06/PrivatePreview:NetworkAccess on 2024-09-09 and will be removed 2024-11-01
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetAlertFrequenciesWithStartDateTimeWithEndDateTimeGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetAlertFrequenciesWithStartDateTimeWithEndDateTimeGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke function getAlertFrequencies
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-06/PrivatePreview:NetworkAccess on 2024-09-09 and will be removed 2024-11-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getAlertFrequencies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-06/PrivatePreview:NetworkAccess on 2024-09-09 and will be removed 2024-11-01
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder}
     * @deprecated
     *  as of 2022-06/PrivatePreview:NetworkAccess on 2024-09-09 and will be removed 2024-11-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphNetworkaccessGetAlertFrequenciesWithStartDateTimeWithEndDateTimeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Invoke function getAlertFrequencies
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
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
