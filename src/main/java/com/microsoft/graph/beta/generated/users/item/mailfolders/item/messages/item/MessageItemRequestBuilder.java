package com.microsoft.graph.beta.users.item.mailfolders.item.messages.item;

import com.microsoft.graph.beta.models.Message;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.copy.CopyRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.createforward.CreateForwardRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.createreply.CreateReplyRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.createreplyall.CreateReplyAllRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.forward.ForwardRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.markasjunk.MarkAsJunkRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.markasnotjunk.MarkAsNotJunkRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.mentions.MentionsRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.move.MoveRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.permanentdelete.PermanentDeleteRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.reply.ReplyRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.replyall.ReplyAllRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.reportmessage.ReportMessageRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.send.SendRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.unsubscribe.UnsubscribeRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.value.ContentRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the messages property of the microsoft.graph.mailFolder entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.message entity.
     * @return a {@link AttachmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the user entity.
     * @return a {@link ContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copy method.
     * @return a {@link CopyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CopyRequestBuilder copy() {
        return new CopyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createForward method.
     * @return a {@link CreateForwardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateForwardRequestBuilder createForward() {
        return new CreateForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createReply method.
     * @return a {@link CreateReplyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateReplyRequestBuilder createReply() {
        return new CreateReplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createReplyAll method.
     * @return a {@link CreateReplyAllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateReplyAllRequestBuilder createReplyAll() {
        return new CreateReplyAllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.message entity.
     * @return a {@link ExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the forward method.
     * @return a {@link ForwardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markAsJunk method.
     * @return a {@link MarkAsJunkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkAsJunkRequestBuilder markAsJunk() {
        return new MarkAsJunkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markAsNotJunk method.
     * @return a {@link MarkAsNotJunkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkAsNotJunkRequestBuilder markAsNotJunk() {
        return new MarkAsNotJunkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mentions property of the microsoft.graph.message entity.
     * @return a {@link MentionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MentionsRequestBuilder mentions() {
        return new MentionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the move method.
     * @return a {@link MoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveRequestBuilder move() {
        return new MoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permanentDelete method.
     * @return a {@link PermanentDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermanentDeleteRequestBuilder permanentDelete() {
        return new PermanentDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reply method.
     * @return a {@link ReplyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReplyRequestBuilder reply() {
        return new ReplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replyAll method.
     * @return a {@link ReplyAllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReplyAllRequestBuilder replyAll() {
        return new ReplyAllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reportMessage method.
     * @return a {@link ReportMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportMessageRequestBuilder reportMessage() {
        return new ReportMessageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the send method.
     * @return a {@link SendRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendRequestBuilder send() {
        return new SendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unsubscribe method.
     * @return a {@link UnsubscribeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnsubscribeRequestBuilder unsubscribe() {
        return new UnsubscribeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MessageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link MessageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property messages for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property messages for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The collection of messages in the mailFolder.
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Message get() {
        return get(null);
    }
    /**
     * The collection of messages in the mailFolder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Message get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Message::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Message patch(@jakarta.annotation.Nonnull final Message body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Message}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Message patch(@jakarta.annotation.Nonnull final Message body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Message::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property messages for users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property messages for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The collection of messages in the mailFolder.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of messages in the mailFolder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Message body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Message body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MessageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MessageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of messages in the mailFolder.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
