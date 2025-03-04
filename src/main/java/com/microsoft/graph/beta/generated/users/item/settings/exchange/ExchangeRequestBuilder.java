package com.microsoft.graph.beta.users.item.settings.exchange;

import com.microsoft.graph.beta.models.ExchangeSettings;
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
 * Provides operations to manage the exchange property of the microsoft.graph.userSettings entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ExchangeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExchangeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/settings/exchange{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ExchangeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExchangeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/settings/exchange{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get a list of Exchange settings, including mailboxes that belong to a user. Currently, the mailbox types supported are the user&apos;s primary and in-place archive. To learn how to get a list of users in a tenant, see List users.
     * @return a {@link ExchangeSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     * @see <a href="https://learn.microsoft.com/graph/api/usersettings-list-exchange?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ExchangeSettings get() {
        return get(null);
    }
    /**
     * Get a list of Exchange settings, including mailboxes that belong to a user. Currently, the mailbox types supported are the user&apos;s primary and in-place archive. To learn how to get a list of users in a tenant, see List users.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ExchangeSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     * @see <a href="https://learn.microsoft.com/graph/api/usersettings-list-exchange?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ExchangeSettings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ExchangeSettings::createFromDiscriminatorValue);
    }
    /**
     * Get a list of Exchange settings, including mailboxes that belong to a user. Currently, the mailbox types supported are the user&apos;s primary and in-place archive. To learn how to get a list of users in a tenant, see List users.
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
     * Get a list of Exchange settings, including mailboxes that belong to a user. Currently, the mailbox types supported are the user&apos;s primary and in-place archive. To learn how to get a list of users in a tenant, see List users.
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
     * @return a {@link ExchangeRequestBuilder}
     * @deprecated
     * Private preview for Import Export APIs as of 2021-08/PrivatePreview:importExport on 2021-08-19 and will be removed 2021-11-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ExchangeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ExchangeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of Exchange settings, including mailboxes that belong to a user. Currently, the mailbox types supported are the user&apos;s primary and in-place archive. To learn how to get a list of users in a tenant, see List users.
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
}
