package com.microsoft.graph.beta.users.item.mailfolders.item.childfolders.item.messages.item.markasjunk;

import com.microsoft.graph.beta.models.Message;
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
 * Provides operations to call the markAsJunk method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkAsJunkRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MarkAsJunkRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarkAsJunkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/markAsJunk", pathParameters);
    }
    /**
     * Instantiates a new {@link MarkAsJunkRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarkAsJunkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/markAsJunk", rawUrl);
    }
    /**
     * Mark a message as junk. This API adds the sender to the list of blocked senders and moves the message to the Junk Email folder, when moveToJunk is true.
     * @param body The request body
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The MarkAsJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Junk on 2025-04-25 and will be removed 2025-12-30
     * @see <a href="https://learn.microsoft.com/graph/api/message-markasjunk?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Message post(@jakarta.annotation.Nonnull final MarkAsJunkPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Mark a message as junk. This API adds the sender to the list of blocked senders and moves the message to the Junk Email folder, when moveToJunk is true.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The MarkAsJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Junk on 2025-04-25 and will be removed 2025-12-30
     * @see <a href="https://learn.microsoft.com/graph/api/message-markasjunk?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Message post(@jakarta.annotation.Nonnull final MarkAsJunkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Message::createFromDiscriminatorValue);
    }
    /**
     * Mark a message as junk. This API adds the sender to the list of blocked senders and moves the message to the Junk Email folder, when moveToJunk is true.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The MarkAsJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MarkAsJunkPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Mark a message as junk. This API adds the sender to the list of blocked senders and moves the message to the Junk Email folder, when moveToJunk is true.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The MarkAsJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MarkAsJunkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MarkAsJunkRequestBuilder}
     * @deprecated
     * The MarkAsJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MarkAsJunkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MarkAsJunkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
