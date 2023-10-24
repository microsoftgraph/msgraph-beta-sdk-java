package com.microsoft.graph.devicemanagement.comanageddevices.bulkreprovisioncloudpc;

import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the bulkReprovisionCloudPc method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkReprovisionCloudPcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new BulkReprovisionCloudPcRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkReprovisionCloudPcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/bulkReprovisionCloudPc", pathParameters);
    }
    /**
     * Instantiates a new BulkReprovisionCloudPcRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkReprovisionCloudPcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/bulkReprovisionCloudPc", rawUrl);
    }
    /**
     * Bulk reprovision a set of Cloud PC devices with Intune managed device IDs. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CompletableFuture of CloudPcBulkRemoteActionResult
     * @deprecated
     * The bulkReprovisionCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkReprovisionCloudPc on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulkreprovisioncloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@jakarta.annotation.Nonnull final BulkReprovisionCloudPcPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Bulk reprovision a set of Cloud PC devices with Intune managed device IDs. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CloudPcBulkRemoteActionResult
     * @deprecated
     * The bulkReprovisionCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkReprovisionCloudPc on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulkreprovisioncloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@jakarta.annotation.Nonnull final BulkReprovisionCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Bulk reprovision a set of Cloud PC devices with Intune managed device IDs. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The bulkReprovisionCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkReprovisionCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkReprovisionCloudPcPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Bulk reprovision a set of Cloud PC devices with Intune managed device IDs. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The bulkReprovisionCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkReprovisionCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkReprovisionCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a BulkReprovisionCloudPcRequestBuilder
     * @deprecated
     * The bulkReprovisionCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkReprovisionCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public BulkReprovisionCloudPcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkReprovisionCloudPcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
