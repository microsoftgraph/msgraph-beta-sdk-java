package com.microsoft.graph.reports.getoffice365groupsactivitygroupcountswithperiod;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the getOffice365GroupsActivityGroupCounts method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param period Usage: period='{period}'
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String period) {
        super(requestAdapter, "{+baseurl}/reports/getOffice365GroupsActivityGroupCounts(period='{period}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", pathParameters);
        this.pathParameters.put("period", period);
    }
    /**
     * Instantiates a new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getOffice365GroupsActivityGroupCounts(period='{period}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", rawUrl);
    }
    /**
     * Invoke function getOffice365GroupsActivityGroupCounts
     * @return a CompletableFuture of GetOffice365GroupsActivityGroupCountsWithPeriodGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetOffice365GroupsActivityGroupCountsWithPeriodGetResponse> get() {
        return get(null);
    }
    /**
     * Invoke function getOffice365GroupsActivityGroupCounts
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of GetOffice365GroupsActivityGroupCountsWithPeriodGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetOffice365GroupsActivityGroupCountsWithPeriodGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, GetOffice365GroupsActivityGroupCountsWithPeriodGetResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function getOffice365GroupsActivityGroupCounts
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getOffice365GroupsActivityGroupCounts
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Invoke function getOffice365GroupsActivityGroupCounts
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
