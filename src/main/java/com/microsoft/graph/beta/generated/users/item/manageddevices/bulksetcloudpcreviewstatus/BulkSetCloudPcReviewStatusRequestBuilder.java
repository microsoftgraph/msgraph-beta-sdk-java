package com.microsoft.graph.beta.users.item.manageddevices.bulksetcloudpcreviewstatus;

import com.microsoft.graph.beta.models.CloudPcBulkRemoteActionResult;
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
 * Provides operations to call the bulkSetCloudPcReviewStatus method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkSetCloudPcReviewStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkSetCloudPcReviewStatusRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkSetCloudPcReviewStatusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/bulkSetCloudPcReviewStatus", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkSetCloudPcReviewStatusRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkSetCloudPcReviewStatusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/bulkSetCloudPcReviewStatus", rawUrl);
    }
    /**
     * Invoke action bulkSetCloudPcReviewStatus
     * @param body The request body
     * @return a {@link CloudPcBulkRemoteActionResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The BulkSetCloudPcReviewStatus action is deprecated and will stop supporting on September 30, 2024. Please use bulk action entity api. as of 2024-05/BulkSetCloudPcReviewStatus on 2024-05-15 and will be removed 2024-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulksetcloudpcreviewstatus?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcBulkRemoteActionResult post(@jakarta.annotation.Nonnull final BulkSetCloudPcReviewStatusPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Invoke action bulkSetCloudPcReviewStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcBulkRemoteActionResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The BulkSetCloudPcReviewStatus action is deprecated and will stop supporting on September 30, 2024. Please use bulk action entity api. as of 2024-05/BulkSetCloudPcReviewStatus on 2024-05-15 and will be removed 2024-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulksetcloudpcreviewstatus?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcBulkRemoteActionResult post(@jakarta.annotation.Nonnull final BulkSetCloudPcReviewStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue);
    }
    /**
     * Invoke action bulkSetCloudPcReviewStatus
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The BulkSetCloudPcReviewStatus action is deprecated and will stop supporting on September 30, 2024. Please use bulk action entity api. as of 2024-05/BulkSetCloudPcReviewStatus on 2024-05-15 and will be removed 2024-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkSetCloudPcReviewStatusPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action bulkSetCloudPcReviewStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The BulkSetCloudPcReviewStatus action is deprecated and will stop supporting on September 30, 2024. Please use bulk action entity api. as of 2024-05/BulkSetCloudPcReviewStatus on 2024-05-15 and will be removed 2024-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkSetCloudPcReviewStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkSetCloudPcReviewStatusRequestBuilder}
     * @deprecated
     * The BulkSetCloudPcReviewStatus action is deprecated and will stop supporting on September 30, 2024. Please use bulk action entity api. as of 2024-05/BulkSetCloudPcReviewStatus on 2024-05-15 and will be removed 2024-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public BulkSetCloudPcReviewStatusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkSetCloudPcReviewStatusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
