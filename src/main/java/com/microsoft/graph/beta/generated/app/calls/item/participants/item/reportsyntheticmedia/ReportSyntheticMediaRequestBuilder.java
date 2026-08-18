package com.microsoft.graph.beta.app.calls.item.participants.item.reportsyntheticmedia;

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
 * Provides operations to call the reportSyntheticMedia method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportSyntheticMediaRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReportSyntheticMediaRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportSyntheticMediaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/participants/{participant%2Did}/reportSyntheticMedia", pathParameters);
    }
    /**
     * Instantiates a new {@link ReportSyntheticMediaRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportSyntheticMediaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/calls/{call%2Did}/participants/{participant%2Did}/reportSyntheticMedia", rawUrl);
    }
    /**
     * Report synthetic media detections for a participant in a meeting call. This action is intended for certified third-party audio and video synthetic media detection bots admitted to the meeting call. The detection bot calls this action to flag a participant whose stream it identifies as AI-generated or synthetic media. The detection result is propagated to all participants via roster updates. After a successful request, the service stores the detection on the participant as a syntheticMediaDetectionInfo object in the participant&apos;s syntheticMediaDetection property and delivers it to all participants in a roster update notification. Each request with a new id creates a separate detection record; the service doesn&apos;t deduplicate or merge reports. When a participant has multiple detection records, the syntheticMediaDetection property reflects the most recent report. Third-party bots can invoke this action only when the meeting tenant administrator grants the app the Calls.ReportSyntheticMedia.All application permission. The detection bot must be admitted to the call before it can call this action. For more information about registering a calling bot and joining calls, see Calls and online meetings. The bot obtains the call ID and participant ID from the call roster and subsequent participant roster update notifications, and uses the call&apos;s id as {call-id} and the participant&apos;s id as {participant-id} in the request URL.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/participant-reportsyntheticmedia?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ReportSyntheticMediaPostRequestBody body) {
        post(body, null);
    }
    /**
     * Report synthetic media detections for a participant in a meeting call. This action is intended for certified third-party audio and video synthetic media detection bots admitted to the meeting call. The detection bot calls this action to flag a participant whose stream it identifies as AI-generated or synthetic media. The detection result is propagated to all participants via roster updates. After a successful request, the service stores the detection on the participant as a syntheticMediaDetectionInfo object in the participant&apos;s syntheticMediaDetection property and delivers it to all participants in a roster update notification. Each request with a new id creates a separate detection record; the service doesn&apos;t deduplicate or merge reports. When a participant has multiple detection records, the syntheticMediaDetection property reflects the most recent report. Third-party bots can invoke this action only when the meeting tenant administrator grants the app the Calls.ReportSyntheticMedia.All application permission. The detection bot must be admitted to the call before it can call this action. For more information about registering a calling bot and joining calls, see Calls and online meetings. The bot obtains the call ID and participant ID from the call roster and subsequent participant roster update notifications, and uses the call&apos;s id as {call-id} and the participant&apos;s id as {participant-id} in the request URL.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/participant-reportsyntheticmedia?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ReportSyntheticMediaPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Report synthetic media detections for a participant in a meeting call. This action is intended for certified third-party audio and video synthetic media detection bots admitted to the meeting call. The detection bot calls this action to flag a participant whose stream it identifies as AI-generated or synthetic media. The detection result is propagated to all participants via roster updates. After a successful request, the service stores the detection on the participant as a syntheticMediaDetectionInfo object in the participant&apos;s syntheticMediaDetection property and delivers it to all participants in a roster update notification. Each request with a new id creates a separate detection record; the service doesn&apos;t deduplicate or merge reports. When a participant has multiple detection records, the syntheticMediaDetection property reflects the most recent report. Third-party bots can invoke this action only when the meeting tenant administrator grants the app the Calls.ReportSyntheticMedia.All application permission. The detection bot must be admitted to the call before it can call this action. For more information about registering a calling bot and joining calls, see Calls and online meetings. The bot obtains the call ID and participant ID from the call roster and subsequent participant roster update notifications, and uses the call&apos;s id as {call-id} and the participant&apos;s id as {participant-id} in the request URL.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReportSyntheticMediaPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Report synthetic media detections for a participant in a meeting call. This action is intended for certified third-party audio and video synthetic media detection bots admitted to the meeting call. The detection bot calls this action to flag a participant whose stream it identifies as AI-generated or synthetic media. The detection result is propagated to all participants via roster updates. After a successful request, the service stores the detection on the participant as a syntheticMediaDetectionInfo object in the participant&apos;s syntheticMediaDetection property and delivers it to all participants in a roster update notification. Each request with a new id creates a separate detection record; the service doesn&apos;t deduplicate or merge reports. When a participant has multiple detection records, the syntheticMediaDetection property reflects the most recent report. Third-party bots can invoke this action only when the meeting tenant administrator grants the app the Calls.ReportSyntheticMedia.All application permission. The detection bot must be admitted to the call before it can call this action. For more information about registering a calling bot and joining calls, see Calls and online meetings. The bot obtains the call ID and participant ID from the call roster and subsequent participant roster update notifications, and uses the call&apos;s id as {call-id} and the participant&apos;s id as {participant-id} in the request URL.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReportSyntheticMediaPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ReportSyntheticMediaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportSyntheticMediaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportSyntheticMediaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
