package com.microsoft.graph.devicemanagement.virtualendpoint.reports.getshareduselicenseusagereport;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the getSharedUseLicenseUsageReport method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetSharedUseLicenseUsageReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetSharedUseLicenseUsageReportRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSharedUseLicenseUsageReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/getSharedUseLicenseUsageReport", pathParameters);
    }
    /**
     * Instantiates a new GetSharedUseLicenseUsageReportRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSharedUseLicenseUsageReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/getSharedUseLicenseUsageReport", rawUrl);
    }
    /**
     * Get a usage report on shared-use licenses, such as servicePlanId, licenseCount, and claimedLicenseCount, for real-time, 7 days, or 28 days trend.
     * @param body The request body
     * @return a InputStream
     * @deprecated
     * The getSharedUseLicenseUsageReport API is deprecated and will stop returning on Oct 17, 2023. Please use getFrontlineReport instead. as of 2023-05/getSharedUseLicenseUsageReport on 2023-05-17 and will be removed 2023-10-17
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-getshareduselicenseusagereport?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InputStream post(@jakarta.annotation.Nonnull final GetSharedUseLicenseUsageReportPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Get a usage report on shared-use licenses, such as servicePlanId, licenseCount, and claimedLicenseCount, for real-time, 7 days, or 28 days trend.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InputStream
     * @deprecated
     * The getSharedUseLicenseUsageReport API is deprecated and will stop returning on Oct 17, 2023. Please use getFrontlineReport instead. as of 2023-05/getSharedUseLicenseUsageReport on 2023-05-17 and will be removed 2023-10-17
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-getshareduselicenseusagereport?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public InputStream post(@jakarta.annotation.Nonnull final GetSharedUseLicenseUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Get a usage report on shared-use licenses, such as servicePlanId, licenseCount, and claimedLicenseCount, for real-time, 7 days, or 28 days trend.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The getSharedUseLicenseUsageReport API is deprecated and will stop returning on Oct 17, 2023. Please use getFrontlineReport instead. as of 2023-05/getSharedUseLicenseUsageReport on 2023-05-17 and will be removed 2023-10-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetSharedUseLicenseUsageReportPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get a usage report on shared-use licenses, such as servicePlanId, licenseCount, and claimedLicenseCount, for real-time, 7 days, or 28 days trend.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The getSharedUseLicenseUsageReport API is deprecated and will stop returning on Oct 17, 2023. Please use getFrontlineReport instead. as of 2023-05/getSharedUseLicenseUsageReport on 2023-05-17 and will be removed 2023-10-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetSharedUseLicenseUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetSharedUseLicenseUsageReportRequestBuilder
     * @deprecated
     * The getSharedUseLicenseUsageReport API is deprecated and will stop returning on Oct 17, 2023. Please use getFrontlineReport instead. as of 2023-05/getSharedUseLicenseUsageReport on 2023-05-17 and will be removed 2023-10-17
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetSharedUseLicenseUsageReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetSharedUseLicenseUsageReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
