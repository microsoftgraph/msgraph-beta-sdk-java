package com.microsoft.graph.devicemanagement.manageddevices.item.reprovisioncloudpc;

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
 * Provides operations to call the reprovisionCloudPc method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReprovisionCloudPcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ReprovisionCloudPcRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprovisionCloudPcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/reprovisionCloudPc", pathParameters);
    }
    /**
     * Instantiates a new ReprovisionCloudPcRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprovisionCloudPcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/reprovisionCloudPc", rawUrl);
    }
    /**
     * Reprovision a Cloud PC with an Intune managed device ID. This API is supported in the following national cloud deployments.
     * @deprecated
     * The reprovisionCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use reprovision instead as of 2023-07/reprovisionCloudPc on 2023-07-17 and will be removed 2023-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-reprovisioncloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<Void> post() {
        return post(null);
    }
    /**
     * Reprovision a Cloud PC with an Intune managed device ID. This API is supported in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The reprovisionCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use reprovision instead as of 2023-07/reprovisionCloudPc on 2023-07-17 and will be removed 2023-09-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-reprovisioncloudpc?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Reprovision a Cloud PC with an Intune managed device ID. This API is supported in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The reprovisionCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use reprovision instead as of 2023-07/reprovisionCloudPc on 2023-07-17 and will be removed 2023-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Reprovision a Cloud PC with an Intune managed device ID. This API is supported in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The reprovisionCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use reprovision instead as of 2023-07/reprovisionCloudPc on 2023-07-17 and will be removed 2023-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
     * @return a ReprovisionCloudPcRequestBuilder
     * @deprecated
     * The reprovisionCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use reprovision instead as of 2023-07/reprovisionCloudPc on 2023-07-17 and will be removed 2023-09-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ReprovisionCloudPcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReprovisionCloudPcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
