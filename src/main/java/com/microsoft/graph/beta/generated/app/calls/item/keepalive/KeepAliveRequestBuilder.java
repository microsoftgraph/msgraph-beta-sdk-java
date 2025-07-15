package com.microsoft.graph.beta.app.calls.item.keepalive;

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
 * Provides operations to call the keepAlive method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeepAliveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link KeepAliveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KeepAliveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/keepAlive", pathParameters);
    }
    /**
     * Instantiates a new {@link KeepAliveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KeepAliveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/keepAlive", rawUrl);
    }
    /**
     * Make a request to this API every 15 to 45 minutes to ensure that an ongoing call remains active. A call that doesn&apos;t receive this request within 45 minutes is considered inactive and ends. At least one successful request must be made within 45 minutes of the previous request, or the start of the call. We recommend that you send a request in shorter time intervals (every 15 minutes). Make sure that these requests are successful to prevent the call from timing out and ending. Attempting to send a request to a call that ended results in a 404 Not Found error. The resources related to the call should be cleaned up on the application side.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void post() {
        post(null);
    }
    /**
     * Make a request to this API every 15 to 45 minutes to ensure that an ongoing call remains active. A call that doesn&apos;t receive this request within 45 minutes is considered inactive and ends. At least one successful request must be made within 45 minutes of the previous request, or the start of the call. We recommend that you send a request in shorter time intervals (every 15 minutes). Make sure that these requests are successful to prevent the call from timing out and ending. Attempting to send a request to a call that ended results in a 404 Not Found error. The resources related to the call should be cleaned up on the application side.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Make a request to this API every 15 to 45 minutes to ensure that an ongoing call remains active. A call that doesn&apos;t receive this request within 45 minutes is considered inactive and ends. At least one successful request must be made within 45 minutes of the previous request, or the start of the call. We recommend that you send a request in shorter time intervals (every 15 minutes). Make sure that these requests are successful to prevent the call from timing out and ending. Attempting to send a request to a call that ended results in a 404 Not Found error. The resources related to the call should be cleaned up on the application side.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Make a request to this API every 15 to 45 minutes to ensure that an ongoing call remains active. A call that doesn&apos;t receive this request within 45 minutes is considered inactive and ends. At least one successful request must be made within 45 minutes of the previous request, or the start of the call. We recommend that you send a request in shorter time intervals (every 15 minutes). Make sure that these requests are successful to prevent the call from timing out and ending. Attempting to send a request to a call that ended results in a 404 Not Found error. The resources related to the call should be cleaned up on the application side.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link KeepAliveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KeepAliveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new KeepAliveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
