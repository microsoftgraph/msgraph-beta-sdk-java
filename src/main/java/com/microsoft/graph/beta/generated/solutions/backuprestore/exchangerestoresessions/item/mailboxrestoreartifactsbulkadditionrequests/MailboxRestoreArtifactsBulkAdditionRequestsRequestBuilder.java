package com.microsoft.graph.beta.solutions.backuprestore.exchangerestoresessions.item.mailboxrestoreartifactsbulkadditionrequests;

import com.microsoft.graph.beta.models.MailboxRestoreArtifactsBulkAdditionRequest;
import com.microsoft.graph.beta.models.MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.solutions.backuprestore.exchangerestoresessions.item.mailboxrestoreartifactsbulkadditionrequests.count.CountRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.exchangerestoresessions.item.mailboxrestoreartifactsbulkadditionrequests.item.MailboxRestoreArtifactsBulkAdditionRequestItemRequestBuilder;
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
 * Provides operations to manage the mailboxRestoreArtifactsBulkAdditionRequests property of the microsoft.graph.exchangeRestoreSession entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailboxRestoreArtifactsBulkAdditionRequests property of the microsoft.graph.exchangeRestoreSession entity.
     * @param mailboxRestoreArtifactsBulkAdditionRequestId The unique identifier of mailboxRestoreArtifactsBulkAdditionRequest
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequestItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxRestoreArtifactsBulkAdditionRequestItemRequestBuilder byMailboxRestoreArtifactsBulkAdditionRequestId(@jakarta.annotation.Nonnull final String mailboxRestoreArtifactsBulkAdditionRequestId) {
        Objects.requireNonNull(mailboxRestoreArtifactsBulkAdditionRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailboxRestoreArtifactsBulkAdditionRequest%2Did", mailboxRestoreArtifactsBulkAdditionRequestId);
        return new MailboxRestoreArtifactsBulkAdditionRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/exchangeRestoreSessions/{exchangeRestoreSession%2Did}/mailboxRestoreArtifactsBulkAdditionRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/exchangeRestoreSessions/{exchangeRestoreSession%2Did}/mailboxRestoreArtifactsBulkAdditionRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a list of the maiboxRestoreArtifactsBulkAdditionRequest objects associated with an exchangeRestoreSession. The mailboxes property is deliberately omitted from the response body in order to limit the response size.
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/exchangerestoresession-list-mailboxrestoreartifactsbulkadditionrequests?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the maiboxRestoreArtifactsBulkAdditionRequest objects associated with an exchangeRestoreSession. The mailboxes property is deliberately omitted from the response body in order to limit the response size.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/exchangerestoresession-list-mailboxrestoreartifactsbulkadditionrequests?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MailboxRestoreArtifactsBulkAdditionRequestCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new mailboxRestoreArtifactsBulkAdditionRequest object associated with an exchangeRestoreSession. The following steps describe how to create and manage an exchangeRestoreSession with bulk artifact additions:
     * @param body The request body
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/exchangerestoresession-post-mailboxrestoreartifactsbulkadditionrequests?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailboxRestoreArtifactsBulkAdditionRequest post(@jakarta.annotation.Nonnull final MailboxRestoreArtifactsBulkAdditionRequest body) {
        return post(body, null);
    }
    /**
     * Create a new mailboxRestoreArtifactsBulkAdditionRequest object associated with an exchangeRestoreSession. The following steps describe how to create and manage an exchangeRestoreSession with bulk artifact additions:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/exchangerestoresession-post-mailboxrestoreartifactsbulkadditionrequests?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailboxRestoreArtifactsBulkAdditionRequest post(@jakarta.annotation.Nonnull final MailboxRestoreArtifactsBulkAdditionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MailboxRestoreArtifactsBulkAdditionRequest::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the maiboxRestoreArtifactsBulkAdditionRequest objects associated with an exchangeRestoreSession. The mailboxes property is deliberately omitted from the response body in order to limit the response size.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the maiboxRestoreArtifactsBulkAdditionRequest objects associated with an exchangeRestoreSession. The mailboxes property is deliberately omitted from the response body in order to limit the response size.
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
     * Create a new mailboxRestoreArtifactsBulkAdditionRequest object associated with an exchangeRestoreSession. The following steps describe how to create and manage an exchangeRestoreSession with bulk artifact additions:
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MailboxRestoreArtifactsBulkAdditionRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new mailboxRestoreArtifactsBulkAdditionRequest object associated with an exchangeRestoreSession. The following steps describe how to create and manage an exchangeRestoreSession with bulk artifact additions:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MailboxRestoreArtifactsBulkAdditionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MailboxRestoreArtifactsBulkAdditionRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the maiboxRestoreArtifactsBulkAdditionRequest objects associated with an exchangeRestoreSession. The mailboxes property is deliberately omitted from the response body in order to limit the response size.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
