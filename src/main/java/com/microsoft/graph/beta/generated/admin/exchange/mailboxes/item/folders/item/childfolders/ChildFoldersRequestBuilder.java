package com.microsoft.graph.beta.admin.exchange.mailboxes.item.folders.item.childfolders;

import com.microsoft.graph.beta.admin.exchange.mailboxes.item.folders.item.childfolders.count.CountRequestBuilder;
import com.microsoft.graph.beta.admin.exchange.mailboxes.item.folders.item.childfolders.delta.DeltaRequestBuilder;
import com.microsoft.graph.beta.admin.exchange.mailboxes.item.folders.item.childfolders.item.MailboxFolderItemRequestBuilder;
import com.microsoft.graph.beta.models.MailboxFolderCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the childFolders property of the microsoft.graph.mailboxFolder entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChildFoldersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the childFolders property of the microsoft.graph.mailboxFolder entity.
     * @param mailboxFolderId1 The unique identifier of mailboxFolder
     * @return a {@link MailboxFolderItemRequestBuilder}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MailboxFolderItemRequestBuilder byMailboxFolderId1(@jakarta.annotation.Nonnull final String mailboxFolderId1) {
        Objects.requireNonNull(mailboxFolderId1);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailboxFolder%2Did1", mailboxFolderId1);
        return new MailboxFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChildFoldersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChildFoldersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/exchange/mailboxes/{mailbox%2Did}/folders/{mailboxFolder%2Did}/childFolders{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ChildFoldersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChildFoldersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/exchange/mailboxes/{mailbox%2Did}/folders/{mailboxFolder%2Did}/childFolders{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the mailboxFolder collection under the specified mailboxFolder in a mailbox.
     * @return a {@link MailboxFolderCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     * @see <a href="https://learn.microsoft.com/graph/api/mailboxfolder-list-childfolders?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MailboxFolderCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the mailboxFolder collection under the specified mailboxFolder in a mailbox.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MailboxFolderCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     * @see <a href="https://learn.microsoft.com/graph/api/mailboxfolder-list-childfolders?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public MailboxFolderCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MailboxFolderCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Get the mailboxFolder collection under the specified mailboxFolder in a mailbox.
     * @return a {@link RequestInformation}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the mailboxFolder collection under the specified mailboxFolder in a mailbox.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ChildFoldersRequestBuilder}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ChildFoldersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChildFoldersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the mailboxFolder collection under the specified mailboxFolder in a mailbox.
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
}
