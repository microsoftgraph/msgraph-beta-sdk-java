package com.microsoft.graph.beta.communications.calls.item.cancelmediaprocessing;

import com.microsoft.graph.beta.models.CancelMediaProcessingOperation;
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
 * Provides operations to call the cancelMediaProcessing method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelMediaProcessingRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CancelMediaProcessingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelMediaProcessingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/cancelMediaProcessing", pathParameters);
    }
    /**
     * Instantiates a new {@link CancelMediaProcessingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelMediaProcessingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/cancelMediaProcessing", rawUrl);
    }
    /**
     * Cancels processing for any in-progress media operations. Media operations refer to the IVR operations playPrompt and recordResponse, which are by default queued to process in order. The cancelMediaProcessing method cancels any operation that is in-process as well as operations that are queued. For example, this API can be used to clean up the IVR operation queue for a new media operation. However, it will not cancel a ubscribeToTone operation because it operates independent of any operation queue.
     * @param body The request body
     * @return a {@link CancelMediaProcessingOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/call-cancelmediaprocessing?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CancelMediaProcessingOperation post(@jakarta.annotation.Nonnull final CancelMediaProcessingPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Cancels processing for any in-progress media operations. Media operations refer to the IVR operations playPrompt and recordResponse, which are by default queued to process in order. The cancelMediaProcessing method cancels any operation that is in-process as well as operations that are queued. For example, this API can be used to clean up the IVR operation queue for a new media operation. However, it will not cancel a ubscribeToTone operation because it operates independent of any operation queue.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CancelMediaProcessingOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/call-cancelmediaprocessing?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CancelMediaProcessingOperation post(@jakarta.annotation.Nonnull final CancelMediaProcessingPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CancelMediaProcessingOperation::createFromDiscriminatorValue);
    }
    /**
     * Cancels processing for any in-progress media operations. Media operations refer to the IVR operations playPrompt and recordResponse, which are by default queued to process in order. The cancelMediaProcessing method cancels any operation that is in-process as well as operations that are queued. For example, this API can be used to clean up the IVR operation queue for a new media operation. However, it will not cancel a ubscribeToTone operation because it operates independent of any operation queue.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CancelMediaProcessingPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Cancels processing for any in-progress media operations. Media operations refer to the IVR operations playPrompt and recordResponse, which are by default queued to process in order. The cancelMediaProcessing method cancels any operation that is in-process as well as operations that are queued. For example, this API can be used to clean up the IVR operation queue for a new media operation. However, it will not cancel a ubscribeToTone operation because it operates independent of any operation queue.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CancelMediaProcessingPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CancelMediaProcessingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelMediaProcessingRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CancelMediaProcessingRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
