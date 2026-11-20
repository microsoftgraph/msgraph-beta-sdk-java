package com.microsoft.graph.beta.security.agenticsecurity.sessions.item.messages.item;

import com.microsoft.graph.beta.models.InvestigationMessage;
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
 * Provides operations to manage the messages property of the microsoft.graph.investigationSession entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvestigationMessageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link InvestigationMessageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvestigationMessageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/sessions/{investigationSession%2Did}/messages/{investigationMessage%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link InvestigationMessageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvestigationMessageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/sessions/{investigationSession%2Did}/messages/{investigationMessage%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Read-only aggregate references to the same investigation messages contained by this session&apos;s agent runs. id maps backend messageId and is unique across the session; the canonical identity belongs to the owning run. The provider preserves owning-run authorization, list/keyed GET with $select and server-driven paging. No direct or deep insert; this schema requirement does not attest runtime implementation.
     * @return a {@link InvestigationMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InvestigationMessage get() {
        return get(null);
    }
    /**
     * Read-only aggregate references to the same investigation messages contained by this session&apos;s agent runs. id maps backend messageId and is unique across the session; the canonical identity belongs to the owning run. The provider preserves owning-run authorization, list/keyed GET with $select and server-driven paging. No direct or deep insert; this schema requirement does not attest runtime implementation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InvestigationMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InvestigationMessage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InvestigationMessage::createFromDiscriminatorValue);
    }
    /**
     * Read-only aggregate references to the same investigation messages contained by this session&apos;s agent runs. id maps backend messageId and is unique across the session; the canonical identity belongs to the owning run. The provider preserves owning-run authorization, list/keyed GET with $select and server-driven paging. No direct or deep insert; this schema requirement does not attest runtime implementation.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read-only aggregate references to the same investigation messages contained by this session&apos;s agent runs. id maps backend messageId and is unique across the session; the canonical identity belongs to the owning run. The provider preserves owning-run authorization, list/keyed GET with $select and server-driven paging. No direct or deep insert; this schema requirement does not attest runtime implementation.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link InvestigationMessageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvestigationMessageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvestigationMessageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read-only aggregate references to the same investigation messages contained by this session&apos;s agent runs. id maps backend messageId and is unique across the session; the canonical identity belongs to the owning run. The provider preserves owning-run authorization, list/keyed GET with $select and server-driven paging. No direct or deep insert; this schema requirement does not attest runtime implementation.
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
