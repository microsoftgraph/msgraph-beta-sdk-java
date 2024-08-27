package com.microsoft.graph.beta.users.item.devices.item.commands;

import com.microsoft.graph.beta.models.Command;
import com.microsoft.graph.beta.models.CommandCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.devices.item.commands.count.CountRequestBuilder;
import com.microsoft.graph.beta.users.item.devices.item.commands.item.CommandItemRequestBuilder;
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
 * Provides operations to manage the commands property of the microsoft.graph.device entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommandsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the commands property of the microsoft.graph.device entity.
     * @param commandId The unique identifier of command
     * @return a {@link CommandItemRequestBuilder}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CommandItemRequestBuilder byCommandId(@jakarta.annotation.Nonnull final String commandId) {
        Objects.requireNonNull(commandId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("command%2Did", commandId);
        return new CommandItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CommandsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommandsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/devices/{device%2Did}/commands{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link CommandsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommandsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/devices/{device%2Did}/commands{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Set of commands sent to this device.
     * @return a {@link CommandCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CommandCollectionResponse get() {
        return get(null);
    }
    /**
     * Set of commands sent to this device.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CommandCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CommandCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CommandCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to commands for users
     * @param body The request body
     * @return a {@link Command}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Command post(@jakarta.annotation.Nonnull final Command body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to commands for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Command}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Command post(@jakarta.annotation.Nonnull final Command body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Command::createFromDiscriminatorValue);
    }
    /**
     * Set of commands sent to this device.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Set of commands sent to this device.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
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
     * Create new navigation property to commands for users
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Command body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to commands for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Command body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CommandsRequestBuilder}
     * @deprecated
     *  as of 2024-07/PrivatePreview:copilotExportAPI
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CommandsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CommandsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Set of commands sent to this device.
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
