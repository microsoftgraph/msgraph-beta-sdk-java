package com.microsoft.graph.beta.users.item.mailfolders.item.updateallmessagesreadstate;

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
 * Provides operations to call the updateAllMessagesReadState method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAllMessagesReadStateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateAllMessagesReadStateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateAllMessagesReadStateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/updateAllMessagesReadState", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateAllMessagesReadStateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateAllMessagesReadStateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/updateAllMessagesReadState", rawUrl);
    }
    /**
     * Update the read state of all messages in a mailFolder object.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-04/PrivatePreview:updateAllMessagesReadStateAPI on 2024-04-29 and will be removed 2024-06-30
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final UpdateAllMessagesReadStatePostRequestBody body) {
        post(body, null);
    }
    /**
     * Update the read state of all messages in a mailFolder object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-04/PrivatePreview:updateAllMessagesReadStateAPI on 2024-04-29 and will be removed 2024-06-30
     */
    @Deprecated
    public void post(@jakarta.annotation.Nonnull final UpdateAllMessagesReadStatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Update the read state of all messages in a mailFolder object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-04/PrivatePreview:updateAllMessagesReadStateAPI on 2024-04-29 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAllMessagesReadStatePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Update the read state of all messages in a mailFolder object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-04/PrivatePreview:updateAllMessagesReadStateAPI on 2024-04-29 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAllMessagesReadStatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UpdateAllMessagesReadStateRequestBuilder}
     * @deprecated
     *  as of 2024-04/PrivatePreview:updateAllMessagesReadStateAPI on 2024-04-29 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UpdateAllMessagesReadStateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateAllMessagesReadStateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
