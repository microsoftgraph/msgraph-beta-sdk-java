package com.microsoft.graph.users.item.manageddevices.bulkrestorecloudpc;

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
 * Provides operations to call the bulkRestoreCloudPc method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkRestoreCloudPcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new BulkRestoreCloudPcRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRestoreCloudPcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/bulkRestoreCloudPc", pathParameters);
    }
    /**
     * Instantiates a new BulkRestoreCloudPcRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRestoreCloudPcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/bulkRestoreCloudPc", rawUrl);
    }
    /**
     * Restore multiple Cloud PC devices with a single request that includes the IDs of Intune managed devices and a restore point date and time.
     * @param body The request body
     * @return a CompletableFuture of cloudPcBulkRemoteActionResult
     * @deprecated
     * The bulkRestoreCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkRestoreCloudPc on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulkrestorecloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@jakarta.annotation.Nonnull final BulkRestoreCloudPcPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Restore multiple Cloud PC devices with a single request that includes the IDs of Intune managed devices and a restore point date and time.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPcBulkRemoteActionResult
     * @deprecated
     * The bulkRestoreCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkRestoreCloudPc on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-bulkrestorecloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@jakarta.annotation.Nonnull final BulkRestoreCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Restore multiple Cloud PC devices with a single request that includes the IDs of Intune managed devices and a restore point date and time.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The bulkRestoreCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkRestoreCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkRestoreCloudPcPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Restore multiple Cloud PC devices with a single request that includes the IDs of Intune managed devices and a restore point date and time.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The bulkRestoreCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkRestoreCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkRestoreCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a bulkRestoreCloudPcRequestBuilder
     * @deprecated
     * The bulkRestoreCloudPc action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkRestoreCloudPc on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public BulkRestoreCloudPcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkRestoreCloudPcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
