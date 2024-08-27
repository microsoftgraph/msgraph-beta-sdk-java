package com.microsoft.graph.beta.users.item.manageddevices.item.createdevicelogcollectionrequest;

import com.microsoft.graph.beta.models.DeviceLogCollectionResponse;
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
 * Provides operations to call the createDeviceLogCollectionRequest method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateDeviceLogCollectionRequestRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateDeviceLogCollectionRequestRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateDeviceLogCollectionRequestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}/createDeviceLogCollectionRequest", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateDeviceLogCollectionRequestRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateDeviceLogCollectionRequestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}/createDeviceLogCollectionRequest", rawUrl);
    }
    /**
     * Invoke action createDeviceLogCollectionRequest
     * @param body The request body
     * @return a {@link DeviceLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DeviceLogCollectionResponse post(@jakarta.annotation.Nonnull final CreateDeviceLogCollectionRequestPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Invoke action createDeviceLogCollectionRequest
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DeviceLogCollectionResponse post(@jakarta.annotation.Nonnull final CreateDeviceLogCollectionRequestPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceLogCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke action createDeviceLogCollectionRequest
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDeviceLogCollectionRequestPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action createDeviceLogCollectionRequest
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDeviceLogCollectionRequestPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CreateDeviceLogCollectionRequestRequestBuilder}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CreateDeviceLogCollectionRequestRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateDeviceLogCollectionRequestRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
