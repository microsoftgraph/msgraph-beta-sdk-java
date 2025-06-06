package com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getconnectionqualityreports;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the getConnectionQualityReports method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetConnectionQualityReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetConnectionQualityReportsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetConnectionQualityReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/getConnectionQualityReports", pathParameters);
    }
    /**
     * Instantiates a new {@link GetConnectionQualityReportsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetConnectionQualityReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/getConnectionQualityReports", rawUrl);
    }
    /**
     * Get the overall connection quality reports for all devices within a current tenant during a given time period, including metrics like the average round trip time (P50), average available bandwidth, and UDP connection percentage. Get also other real-time metrics such as last connection round trip time, last connection client IP, last connection gateway, and last connection protocol.
     * @param body The request body
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2024, this API (&apos;getConnectionQualityReports&apos;) will be deprecated and no longer supported. Please use the retrieveConnectionQualityReports API. as of 2024-09/getConnectionQualityReports on 2024-09-10 and will be removed 2024-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-getconnectionqualityreports?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InputStream post(@jakarta.annotation.Nonnull final GetConnectionQualityReportsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Get the overall connection quality reports for all devices within a current tenant during a given time period, including metrics like the average round trip time (P50), average available bandwidth, and UDP connection percentage. Get also other real-time metrics such as last connection round trip time, last connection client IP, last connection gateway, and last connection protocol.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2024, this API (&apos;getConnectionQualityReports&apos;) will be deprecated and no longer supported. Please use the retrieveConnectionQualityReports API. as of 2024-09/getConnectionQualityReports on 2024-09-10 and will be removed 2024-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-getconnectionqualityreports?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InputStream post(@jakarta.annotation.Nonnull final GetConnectionQualityReportsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Get the overall connection quality reports for all devices within a current tenant during a given time period, including metrics like the average round trip time (P50), average available bandwidth, and UDP connection percentage. Get also other real-time metrics such as last connection round trip time, last connection client IP, last connection gateway, and last connection protocol.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2024, this API (&apos;getConnectionQualityReports&apos;) will be deprecated and no longer supported. Please use the retrieveConnectionQualityReports API. as of 2024-09/getConnectionQualityReports on 2024-09-10 and will be removed 2024-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetConnectionQualityReportsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get the overall connection quality reports for all devices within a current tenant during a given time period, including metrics like the average round trip time (P50), average available bandwidth, and UDP connection percentage. Get also other real-time metrics such as last connection round trip time, last connection client IP, last connection gateway, and last connection protocol.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2024, this API (&apos;getConnectionQualityReports&apos;) will be deprecated and no longer supported. Please use the retrieveConnectionQualityReports API. as of 2024-09/getConnectionQualityReports on 2024-09-10 and will be removed 2024-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetConnectionQualityReportsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetConnectionQualityReportsRequestBuilder}
     * @deprecated
     * Starting from December 31, 2024, this API (&apos;getConnectionQualityReports&apos;) will be deprecated and no longer supported. Please use the retrieveConnectionQualityReports API. as of 2024-09/getConnectionQualityReports on 2024-09-10 and will be removed 2024-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetConnectionQualityReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetConnectionQualityReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
