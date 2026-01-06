package com.microsoft.graph.beta.devicemanagement.virtualendpoint.report.retrievecloudpcclientappusagereport;

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
 * Provides operations to call the retrieveCloudPcClientAppUsageReport method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveCloudPcClientAppUsageReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveCloudPcClientAppUsageReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcClientAppUsageReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/report/retrieveCloudPcClientAppUsageReport", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveCloudPcClientAppUsageReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcClientAppUsageReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/report/retrieveCloudPcClientAppUsageReport", rawUrl);
    }
    /**
     * Retrieve related reports on Cloud PC usage, including the client application used by users to sign in to the Cloud PC device. The Remote Desktop client standalone installer (MSI) for Windows will reach end of support on March 27, 2026. Before that date, IT administrators should migrate users to Windows App to ensure continued access to remote resources through Azure Virtual Desktop, Windows 365, and Microsoft Dev Box. Learn more about preparing for the Remote Desktop Client for Windows end of support. This API enables IT administrators to check the migration status by confirming whether users are still using the legacy Remote Desktop client and identifying their last sign-in dates, thereby helping monitor progress and ensure compliance with migration requirements.
     * @param body The request body
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreport-retrievecloudpcclientappusagereport?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final RetrieveCloudPcClientAppUsageReportPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Retrieve related reports on Cloud PC usage, including the client application used by users to sign in to the Cloud PC device. The Remote Desktop client standalone installer (MSI) for Windows will reach end of support on March 27, 2026. Before that date, IT administrators should migrate users to Windows App to ensure continued access to remote resources through Azure Virtual Desktop, Windows 365, and Microsoft Dev Box. Learn more about preparing for the Remote Desktop Client for Windows end of support. This API enables IT administrators to check the migration status by confirming whether users are still using the legacy Remote Desktop client and identifying their last sign-in dates, thereby helping monitor progress and ensure compliance with migration requirements.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreport-retrievecloudpcclientappusagereport?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final RetrieveCloudPcClientAppUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Retrieve related reports on Cloud PC usage, including the client application used by users to sign in to the Cloud PC device. The Remote Desktop client standalone installer (MSI) for Windows will reach end of support on March 27, 2026. Before that date, IT administrators should migrate users to Windows App to ensure continued access to remote resources through Azure Virtual Desktop, Windows 365, and Microsoft Dev Box. Learn more about preparing for the Remote Desktop Client for Windows end of support. This API enables IT administrators to check the migration status by confirming whether users are still using the legacy Remote Desktop client and identifying their last sign-in dates, thereby helping monitor progress and ensure compliance with migration requirements.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RetrieveCloudPcClientAppUsageReportPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Retrieve related reports on Cloud PC usage, including the client application used by users to sign in to the Cloud PC device. The Remote Desktop client standalone installer (MSI) for Windows will reach end of support on March 27, 2026. Before that date, IT administrators should migrate users to Windows App to ensure continued access to remote resources through Azure Virtual Desktop, Windows 365, and Microsoft Dev Box. Learn more about preparing for the Remote Desktop Client for Windows end of support. This API enables IT administrators to check the migration status by confirming whether users are still using the legacy Remote Desktop client and identifying their last sign-in dates, thereby helping monitor progress and ensure compliance with migration requirements.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RetrieveCloudPcClientAppUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RetrieveCloudPcClientAppUsageReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveCloudPcClientAppUsageReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveCloudPcClientAppUsageReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
