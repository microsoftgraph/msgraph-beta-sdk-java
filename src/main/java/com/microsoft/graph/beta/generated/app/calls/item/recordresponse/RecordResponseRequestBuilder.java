package com.microsoft.graph.beta.app.calls.item.recordresponse;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.RecordOperation;
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
 * Provides operations to call the recordResponse method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordResponseRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RecordResponseRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordResponseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/recordResponse", pathParameters);
    }
    /**
     * Instantiates a new {@link RecordResponseRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecordResponseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/recordResponse", rawUrl);
    }
    /**
     * Record a short audio response from the caller. A bot can use this API to capture a voice response from a caller after they&apos;re prompted for a response. For more information about how to handle operations, see commsOperation. This action isn&apos;t intended to record the entire call. The maximum length of recording is 2 minutes.The Cloud Communications Platform doesn&apos;t save the recording permanently and discards it shortly after the call ends. The bot must download the recording promptly after the recording operation finishes by using the recordingLocation value provided in the completed notification.
     * @param body The request body
     * @return a {@link RecordOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/call-record?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RecordOperation post(@jakarta.annotation.Nonnull final RecordResponsePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Record a short audio response from the caller. A bot can use this API to capture a voice response from a caller after they&apos;re prompted for a response. For more information about how to handle operations, see commsOperation. This action isn&apos;t intended to record the entire call. The maximum length of recording is 2 minutes.The Cloud Communications Platform doesn&apos;t save the recording permanently and discards it shortly after the call ends. The bot must download the recording promptly after the recording operation finishes by using the recordingLocation value provided in the completed notification.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RecordOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/call-record?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RecordOperation post(@jakarta.annotation.Nonnull final RecordResponsePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RecordOperation::createFromDiscriminatorValue);
    }
    /**
     * Record a short audio response from the caller. A bot can use this API to capture a voice response from a caller after they&apos;re prompted for a response. For more information about how to handle operations, see commsOperation. This action isn&apos;t intended to record the entire call. The maximum length of recording is 2 minutes.The Cloud Communications Platform doesn&apos;t save the recording permanently and discards it shortly after the call ends. The bot must download the recording promptly after the recording operation finishes by using the recordingLocation value provided in the completed notification.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RecordResponsePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Record a short audio response from the caller. A bot can use this API to capture a voice response from a caller after they&apos;re prompted for a response. For more information about how to handle operations, see commsOperation. This action isn&apos;t intended to record the entire call. The maximum length of recording is 2 minutes.The Cloud Communications Platform doesn&apos;t save the recording permanently and discards it shortly after the call ends. The bot must download the recording promptly after the recording operation finishes by using the recordingLocation value provided in the completed notification.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RecordResponsePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RecordResponseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordResponseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RecordResponseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
