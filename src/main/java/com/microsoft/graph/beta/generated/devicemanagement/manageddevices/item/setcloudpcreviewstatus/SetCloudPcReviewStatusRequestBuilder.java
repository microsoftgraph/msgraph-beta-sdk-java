package com.microsoft.graph.beta.devicemanagement.manageddevices.item.setcloudpcreviewstatus;

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
 * Provides operations to call the setCloudPcReviewStatus method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetCloudPcReviewStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SetCloudPcReviewStatusRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetCloudPcReviewStatusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/setCloudPcReviewStatus", pathParameters);
    }
    /**
     * Instantiates a new {@link SetCloudPcReviewStatusRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetCloudPcReviewStatusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/setCloudPcReviewStatus", rawUrl);
    }
    /**
     * Set the review status of a specific Cloud PC device. Use this API to set the review status of a Cloud PC to in review if you consider a Cloud PC as suspicious. After the review is completed, use this API again to set the Cloud PC back to a normal state.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The setCloudPcReviewStatus API is deprecated and will stop returning data on Apr 30, 2024. Please use the new setReviewStatus API as of 2024-01/setCloudPcReviewStatus on 2024-01-03 and will be removed 2023-04-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-setcloudpcreviewstatus?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final SetCloudPcReviewStatusPostRequestBody body) {
        post(body, null);
    }
    /**
     * Set the review status of a specific Cloud PC device. Use this API to set the review status of a Cloud PC to in review if you consider a Cloud PC as suspicious. After the review is completed, use this API again to set the Cloud PC back to a normal state.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The setCloudPcReviewStatus API is deprecated and will stop returning data on Apr 30, 2024. Please use the new setReviewStatus API as of 2024-01/setCloudPcReviewStatus on 2024-01-03 and will be removed 2023-04-30
     * @see <a href="https://learn.microsoft.com/graph/api/manageddevice-setcloudpcreviewstatus?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final SetCloudPcReviewStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Set the review status of a specific Cloud PC device. Use this API to set the review status of a Cloud PC to in review if you consider a Cloud PC as suspicious. After the review is completed, use this API again to set the Cloud PC back to a normal state.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The setCloudPcReviewStatus API is deprecated and will stop returning data on Apr 30, 2024. Please use the new setReviewStatus API as of 2024-01/setCloudPcReviewStatus on 2024-01-03 and will be removed 2023-04-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetCloudPcReviewStatusPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Set the review status of a specific Cloud PC device. Use this API to set the review status of a Cloud PC to in review if you consider a Cloud PC as suspicious. After the review is completed, use this API again to set the Cloud PC back to a normal state.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The setCloudPcReviewStatus API is deprecated and will stop returning data on Apr 30, 2024. Please use the new setReviewStatus API as of 2024-01/setCloudPcReviewStatus on 2024-01-03 and will be removed 2023-04-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetCloudPcReviewStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SetCloudPcReviewStatusRequestBuilder}
     * @deprecated
     * The setCloudPcReviewStatus API is deprecated and will stop returning data on Apr 30, 2024. Please use the new setReviewStatus API as of 2024-01/setCloudPcReviewStatus on 2024-01-03 and will be removed 2023-04-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public SetCloudPcReviewStatusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SetCloudPcReviewStatusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
