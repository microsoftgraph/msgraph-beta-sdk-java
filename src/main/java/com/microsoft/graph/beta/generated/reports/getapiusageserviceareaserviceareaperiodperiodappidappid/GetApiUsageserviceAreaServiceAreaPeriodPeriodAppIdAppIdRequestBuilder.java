package com.microsoft.graph.beta.reports.getapiusageserviceareaserviceareaperiodperiodappidappid;

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
 * Provides operations to call the getApiUsage method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getApiUsage(serviceArea='@serviceArea',period='@period',appId='@appId'){?appId*,period*,serviceArea*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getApiUsage(serviceArea='@serviceArea',period='@period',appId='@appId'){?appId*,period*,serviceArea*}", rawUrl);
    }
    /**
     * Get the tenant and app API usage for Microsoft Graph services.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Get the tenant and app API usage for Microsoft Graph services.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Get the tenant and app API usage for Microsoft Graph services.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the tenant and app API usage for Microsoft Graph services.
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
     * @return a {@link GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetApiUsageserviceAreaServiceAreaPeriodPeriodAppIdAppIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the tenant and app API usage for Microsoft Graph services.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: appId=&apos;@appId&apos;
         */
        @jakarta.annotation.Nullable
        public String appId;
        /**
         * Usage: period=&apos;@period&apos;
         */
        @jakarta.annotation.Nullable
        public String period;
        /**
         * Usage: serviceArea=&apos;@serviceArea&apos;
         */
        @jakarta.annotation.Nullable
        public String serviceArea;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("appId", appId);
            allQueryParams.put("period", period);
            allQueryParams.put("serviceArea", serviceArea);
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
