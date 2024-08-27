package com.microsoft.graph.beta.users.item.calendars.item.calendarview.item.exceptionoccurrences.item.permanentdelete;

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
 * Provides operations to call the permanentDelete method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermanentDeleteRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PermanentDeleteRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermanentDeleteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/exceptionOccurrences/{event%2Did1}/permanentDelete", pathParameters);
    }
    /**
     * Instantiates a new {@link PermanentDeleteRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermanentDeleteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/exceptionOccurrences/{event%2Did1}/permanentDelete", rawUrl);
    }
    /**
     * Permanently delete an event and place it in the Purges folder in the dumpster in the user's mailbox. Email clients such as Outlook or the Outlook on the web can't access permanently deleted items. Unless there's a hold set on the mailbox, the items are permanently deleted after a set period of time. For more information about item retention, see Configure Deleted Item retention and Recoverable Items quotas.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     * @see <a href="https://learn.microsoft.com/graph/api/event-permanentdelete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post() {
        post(null);
    }
    /**
     * Permanently delete an event and place it in the Purges folder in the dumpster in the user's mailbox. Email clients such as Outlook or the Outlook on the web can't access permanently deleted items. Unless there's a hold set on the mailbox, the items are permanently deleted after a set period of time. For more information about item retention, see Configure Deleted Item retention and Recoverable Items quotas.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     * @see <a href="https://learn.microsoft.com/graph/api/event-permanentdelete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Permanently delete an event and place it in the Purges folder in the dumpster in the user's mailbox. Email clients such as Outlook or the Outlook on the web can't access permanently deleted items. Unless there's a hold set on the mailbox, the items are permanently deleted after a set period of time. For more information about item retention, see Configure Deleted Item retention and Recoverable Items quotas.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Permanently delete an event and place it in the Purges folder in the dumpster in the user's mailbox. Email clients such as Outlook or the Outlook on the web can't access permanently deleted items. Unless there's a hold set on the mailbox, the items are permanently deleted after a set period of time. For more information about item retention, see Configure Deleted Item retention and Recoverable Items quotas.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PermanentDeleteRequestBuilder}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public PermanentDeleteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PermanentDeleteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
