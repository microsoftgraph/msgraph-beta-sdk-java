package com.microsoft.graph.beta.users.item.mailfolders.item.childfolders.item.messages.item.markasnotjunk;

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
 * Provides operations to call the markAsNotJunk method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkAsNotJunkRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MarkAsNotJunkRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarkAsNotJunkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/markAsNotJunk", pathParameters);
    }
    /**
     * Instantiates a new {@link MarkAsNotJunkRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarkAsNotJunkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/markAsNotJunk", rawUrl);
    }
    /**
     * Mark a message as not junk. This API removes the sender from the list of blocked senders and moves the message to the Inbox folder, when moveToInbox is true.
     * @param body The request body
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The MarkAsNotJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Not_Junk on 2025-04-25 and will be removed 2025-12-30
     * @see <a href="https://learn.microsoft.com/graph/api/message-markasnotjunk?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Message post(@jakarta.annotation.Nonnull final MarkAsNotJunkPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Mark a message as not junk. This API removes the sender from the list of blocked senders and moves the message to the Inbox folder, when moveToInbox is true.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The MarkAsNotJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Not_Junk on 2025-04-25 and will be removed 2025-12-30
     * @see <a href="https://learn.microsoft.com/graph/api/message-markasnotjunk?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Message post(@jakarta.annotation.Nonnull final MarkAsNotJunkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Message::createFromDiscriminatorValue);
    }
    /**
     * Mark a message as not junk. This API removes the sender from the list of blocked senders and moves the message to the Inbox folder, when moveToInbox is true.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The MarkAsNotJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Not_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MarkAsNotJunkPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Mark a message as not junk. This API removes the sender from the list of blocked senders and moves the message to the Inbox folder, when moveToInbox is true.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The MarkAsNotJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Not_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MarkAsNotJunkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MarkAsNotJunkRequestBuilder}
     * @deprecated
     * The MarkAsNotJunk API is deprecated and will stop working from Dec 30, 2025. Please use the ReportMessage API. as of 2022-09/Mark_As_Not_Junk on 2025-04-25 and will be removed 2025-12-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MarkAsNotJunkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MarkAsNotJunkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
