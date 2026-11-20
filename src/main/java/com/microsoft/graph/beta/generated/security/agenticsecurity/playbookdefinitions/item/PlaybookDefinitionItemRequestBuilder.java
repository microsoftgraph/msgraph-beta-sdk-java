package com.microsoft.graph.beta.security.agenticsecurity.playbookdefinitions.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PlaybookDefinition;
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
 * Provides operations to manage the playbookDefinitions property of the microsoft.graph.agenticSecurityRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlaybookDefinitionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PlaybookDefinitionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlaybookDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/playbookDefinitions/{playbookDefinition%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PlaybookDefinitionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlaybookDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/playbookDefinitions/{playbookDefinition%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get a playbook definition from the catalog or the definition selected by an agentic session. This operation uses the playbookDefinition resource.
     * @return a {@link PlaybookDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/playbookdefinition-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlaybookDefinition get() {
        return get(null);
    }
    /**
     * Get a playbook definition from the catalog or the definition selected by an agentic session. This operation uses the playbookDefinition resource.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PlaybookDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/playbookdefinition-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlaybookDefinition get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PlaybookDefinition::createFromDiscriminatorValue);
    }
    /**
     * Get a playbook definition from the catalog or the definition selected by an agentic session. This operation uses the playbookDefinition resource.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a playbook definition from the catalog or the definition selected by an agentic session. This operation uses the playbookDefinition resource.
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
     * @return a {@link PlaybookDefinitionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlaybookDefinitionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PlaybookDefinitionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a playbook definition from the catalog or the definition selected by an agentic session. This operation uses the playbookDefinition resource.
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
