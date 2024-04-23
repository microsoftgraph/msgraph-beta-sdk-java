package com.microsoft.graph.beta.devicemanagement.comanageddevices.item.restorecloudpc;

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
 * Provides operations to call the restoreCloudPc method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestoreCloudPcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RestoreCloudPcRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RestoreCloudPcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}/restoreCloudPc", pathParameters);
    }
    /**
     * Instantiates a new {@link RestoreCloudPcRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RestoreCloudPcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}/restoreCloudPc", rawUrl);
    }
    /**
     * Restore a Cloud PC device to a previous state with an Intune managed device ID.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The restoreCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use restore instead as of 2023-07/restoreCloudPc
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-restorecloudpc?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final RestoreCloudPcPostRequestBody body) {
        post(body, null);
    }
    /**
     * Restore a Cloud PC device to a previous state with an Intune managed device ID.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The restoreCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use restore instead as of 2023-07/restoreCloudPc
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-restorecloudpc?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final RestoreCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Restore a Cloud PC device to a previous state with an Intune managed device ID.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The restoreCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use restore instead as of 2023-07/restoreCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RestoreCloudPcPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Restore a Cloud PC device to a previous state with an Intune managed device ID.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The restoreCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use restore instead as of 2023-07/restoreCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RestoreCloudPcPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RestoreCloudPcRequestBuilder}
     * @deprecated
     * The restoreCloudPc API is deprecated and will stop returning on Sep 30, 2023. Please use restore instead as of 2023-07/restoreCloudPc
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RestoreCloudPcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RestoreCloudPcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
