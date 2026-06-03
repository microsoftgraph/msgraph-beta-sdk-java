package com.microsoft.graph.beta.admin.reportsettings.sharepoint.enableapiusagereport;

import com.microsoft.graph.beta.models.ApiUsageReportEnablementStatus;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the enableApiUsageReport method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnableApiUsageReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EnableApiUsageReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnableApiUsageReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/reportSettings/sharePoint/enableApiUsageReport", pathParameters);
    }
    /**
     * Instantiates a new {@link EnableApiUsageReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnableApiUsageReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/reportSettings/sharePoint/enableApiUsageReport", rawUrl);
    }
    /**
     * Enable a SharePoint API usage report metric for the tenant. After you enable a metric, SharePoint starts collecting and reporting data for that specific usage metric.
     * @param body The request body
     * @return a {@link ApiUsageReportEnablementStatus}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointreportsettings-enableapiusagereport?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ApiUsageReportEnablementStatus post(@jakarta.annotation.Nonnull final EnableApiUsageReportPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Enable a SharePoint API usage report metric for the tenant. After you enable a metric, SharePoint starts collecting and reporting data for that specific usage metric.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ApiUsageReportEnablementStatus}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointreportsettings-enableapiusagereport?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ApiUsageReportEnablementStatus post(@jakarta.annotation.Nonnull final EnableApiUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ApiUsageReportEnablementStatus::createFromDiscriminatorValue);
    }
    /**
     * Enable a SharePoint API usage report metric for the tenant. After you enable a metric, SharePoint starts collecting and reporting data for that specific usage metric.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EnableApiUsageReportPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Enable a SharePoint API usage report metric for the tenant. After you enable a metric, SharePoint starts collecting and reporting data for that specific usage metric.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EnableApiUsageReportPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EnableApiUsageReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableApiUsageReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EnableApiUsageReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
