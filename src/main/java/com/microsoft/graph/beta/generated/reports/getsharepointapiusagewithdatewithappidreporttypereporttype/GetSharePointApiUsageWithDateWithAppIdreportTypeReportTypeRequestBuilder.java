package com.microsoft.graph.beta.reports.getsharepointapiusagewithdatewithappidreporttypereporttype;

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
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getSharePointApiUsage method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder} and sets the default values.
     * @param appId Usage: appId=&apos;{appId}&apos;
     * @param date Usage: date={date}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String appId, @jakarta.annotation.Nullable final OffsetDateTime date) {
        super(requestAdapter, "{+baseurl}/reports/getSharePointApiUsage(date={date},appId='{appId}',reportType='@reportType'){?reportType*}", pathParameters);
        this.pathParameters.put("appId", appId);
        this.pathParameters.put("date", date);
    }
    /**
     * Instantiates a new {@link GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getSharePointApiUsage(date={date},appId='{appId}',reportType='@reportType'){?reportType*}", rawUrl);
    }
    /**
     * Get aggregated usage data for all applications in a tenant. Specify either a period or a date, but not both. Optionally filter the results by application ID. Data is returned in CSV format by default, or in JSON format when requested through the $format query parameter. Use the optional reportType parameter to choose which usage metrics to return: egressReport (default) includes usage (UsageMB in CSV, usageMB in JSON), and throttlingReport includes throttled request counts (ThrottledRequests in CSV, throttledRequests in JSON). Each report type must be enabled (onboarded) for the tenant before its data is available. Use enableApiUsageReport to enable a report metric, disableApiUsageReport to disable it, and List apiUsageReportMetrics to check the enablement status. If you request a report type that isn&apos;t enabled for the tenant, this method returns a 403 Forbidden response with the error code accessDenied and the message &apos;Tenant is not enabled for this report type.&apos; CSV column headers use PascalCase (ThrottledRequests) while JSON properties use camelCase (throttledRequests) to maintain consistency with other Microsoft Graph reporting APIs.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getsharepointapiusage?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Get aggregated usage data for all applications in a tenant. Specify either a period or a date, but not both. Optionally filter the results by application ID. Data is returned in CSV format by default, or in JSON format when requested through the $format query parameter. Use the optional reportType parameter to choose which usage metrics to return: egressReport (default) includes usage (UsageMB in CSV, usageMB in JSON), and throttlingReport includes throttled request counts (ThrottledRequests in CSV, throttledRequests in JSON). Each report type must be enabled (onboarded) for the tenant before its data is available. Use enableApiUsageReport to enable a report metric, disableApiUsageReport to disable it, and List apiUsageReportMetrics to check the enablement status. If you request a report type that isn&apos;t enabled for the tenant, this method returns a 403 Forbidden response with the error code accessDenied and the message &apos;Tenant is not enabled for this report type.&apos; CSV column headers use PascalCase (ThrottledRequests) while JSON properties use camelCase (throttledRequests) to maintain consistency with other Microsoft Graph reporting APIs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getsharepointapiusage?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Get aggregated usage data for all applications in a tenant. Specify either a period or a date, but not both. Optionally filter the results by application ID. Data is returned in CSV format by default, or in JSON format when requested through the $format query parameter. Use the optional reportType parameter to choose which usage metrics to return: egressReport (default) includes usage (UsageMB in CSV, usageMB in JSON), and throttlingReport includes throttled request counts (ThrottledRequests in CSV, throttledRequests in JSON). Each report type must be enabled (onboarded) for the tenant before its data is available. Use enableApiUsageReport to enable a report metric, disableApiUsageReport to disable it, and List apiUsageReportMetrics to check the enablement status. If you request a report type that isn&apos;t enabled for the tenant, this method returns a 403 Forbidden response with the error code accessDenied and the message &apos;Tenant is not enabled for this report type.&apos; CSV column headers use PascalCase (ThrottledRequests) while JSON properties use camelCase (throttledRequests) to maintain consistency with other Microsoft Graph reporting APIs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get aggregated usage data for all applications in a tenant. Specify either a period or a date, but not both. Optionally filter the results by application ID. Data is returned in CSV format by default, or in JSON format when requested through the $format query parameter. Use the optional reportType parameter to choose which usage metrics to return: egressReport (default) includes usage (UsageMB in CSV, usageMB in JSON), and throttlingReport includes throttled request counts (ThrottledRequests in CSV, throttledRequests in JSON). Each report type must be enabled (onboarded) for the tenant before its data is available. Use enableApiUsageReport to enable a report metric, disableApiUsageReport to disable it, and List apiUsageReportMetrics to check the enablement status. If you request a report type that isn&apos;t enabled for the tenant, this method returns a 403 Forbidden response with the error code accessDenied and the message &apos;Tenant is not enabled for this report type.&apos; CSV column headers use PascalCase (ThrottledRequests) while JSON properties use camelCase (throttledRequests) to maintain consistency with other Microsoft Graph reporting APIs.
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
     * @return a {@link GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetSharePointApiUsageWithDateWithAppIdreportTypeReportTypeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get aggregated usage data for all applications in a tenant. Specify either a period or a date, but not both. Optionally filter the results by application ID. Data is returned in CSV format by default, or in JSON format when requested through the $format query parameter. Use the optional reportType parameter to choose which usage metrics to return: egressReport (default) includes usage (UsageMB in CSV, usageMB in JSON), and throttlingReport includes throttled request counts (ThrottledRequests in CSV, throttledRequests in JSON). Each report type must be enabled (onboarded) for the tenant before its data is available. Use enableApiUsageReport to enable a report metric, disableApiUsageReport to disable it, and List apiUsageReportMetrics to check the enablement status. If you request a report type that isn&apos;t enabled for the tenant, this method returns a 403 Forbidden response with the error code accessDenied and the message &apos;Tenant is not enabled for this report type.&apos; CSV column headers use PascalCase (ThrottledRequests) while JSON properties use camelCase (throttledRequests) to maintain consistency with other Microsoft Graph reporting APIs.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: reportType=&apos;@reportType&apos;
         */
        @jakarta.annotation.Nullable
        public String reportType;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("reportType", reportType);
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
