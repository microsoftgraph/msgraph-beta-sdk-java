package com.microsoft.graph.beta.devicemanagement.manageddevices.item.resizecloudpc;

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
 * Provides operations to call the resizeCloudPc method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResizeCloudPcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ResizeCloudPcRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResizeCloudPcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/resizeCloudPc", pathParameters);
    }
    /**
     * Instantiates a new {@link ResizeCloudPcRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResizeCloudPcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/resizeCloudPc", rawUrl);
    }
    /**
     * Upgrade or downgrade an existing Cloud PC to another configuration with a new virtual CPU (vCPU) and storage size.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The resizeCloudPc API is deprecated and will stop returning on Oct 30, 2023. Please use resize instead as of 2023-05/resizeCloudPc
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-resizecloudpc?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final ResizeCloudPcPostRequestBody body) {
        post(body, null);
    }
    /**
     * Upgrade or downgrade an existing Cloud PC to another configuration with a new virtual CPU (vCPU) and storage size.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The resizeCloudPc API is deprecated and will stop returning on Oct 30, 2023. Please use resize instead as of 2023-05/resizeCloudPc
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-resizecloudpc?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final ResizeCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Upgrade or downgrade an existing Cloud PC to another configuration with a new virtual CPU (vCPU) and storage size.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The resizeCloudPc API is deprecated and will stop returning on Oct 30, 2023. Please use resize instead as of 2023-05/resizeCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResizeCloudPcPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Upgrade or downgrade an existing Cloud PC to another configuration with a new virtual CPU (vCPU) and storage size.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The resizeCloudPc API is deprecated and will stop returning on Oct 30, 2023. Please use resize instead as of 2023-05/resizeCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResizeCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ResizeCloudPcRequestBuilder}
     * @deprecated
     * The resizeCloudPc API is deprecated and will stop returning on Oct 30, 2023. Please use resize instead as of 2023-05/resizeCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ResizeCloudPcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ResizeCloudPcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
