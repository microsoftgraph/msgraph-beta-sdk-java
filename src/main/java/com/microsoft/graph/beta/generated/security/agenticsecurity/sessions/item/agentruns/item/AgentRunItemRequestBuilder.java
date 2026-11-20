package com.microsoft.graph.beta.security.agenticsecurity.sessions.item.agentruns.item;

import com.microsoft.graph.beta.models.AgentRun;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.security.agenticsecurity.sessions.item.agentruns.item.messages.MessagesRequestBuilder;
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
 * Provides operations to manage the agentRuns property of the microsoft.graph.investigationSession entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentRunItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the messages property of the microsoft.graph.agentRun entity.
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AgentRunItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgentRunItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/sessions/{investigationSession%2Did}/agentRuns/{agentRun%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AgentRunItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgentRunItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity/sessions/{investigationSession%2Did}/agentRuns/{agentRun%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get an agent run and its processing status. This operation uses the agentRun resource. List the session&apos;s agent runs to find the run id. Use that value unchanged with the same parent session identifier; the embedded agent object&apos;s key isn&apos;t the run identifier. Use this method to inspect one agent&apos;s execution. For the overall playbook state, get the parent session rather than inferring it from an individual run.
     * @return a {@link AgentRun}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/agentrun-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AgentRun get() {
        return get(null);
    }
    /**
     * Get an agent run and its processing status. This operation uses the agentRun resource. List the session&apos;s agent runs to find the run id. Use that value unchanged with the same parent session identifier; the embedded agent object&apos;s key isn&apos;t the run identifier. Use this method to inspect one agent&apos;s execution. For the overall playbook state, get the parent session rather than inferring it from an individual run.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AgentRun}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/agentrun-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AgentRun get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AgentRun::createFromDiscriminatorValue);
    }
    /**
     * Get an agent run and its processing status. This operation uses the agentRun resource. List the session&apos;s agent runs to find the run id. Use that value unchanged with the same parent session identifier; the embedded agent object&apos;s key isn&apos;t the run identifier. Use this method to inspect one agent&apos;s execution. For the overall playbook state, get the parent session rather than inferring it from an individual run.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get an agent run and its processing status. This operation uses the agentRun resource. List the session&apos;s agent runs to find the run id. Use that value unchanged with the same parent session identifier; the embedded agent object&apos;s key isn&apos;t the run identifier. Use this method to inspect one agent&apos;s execution. For the overall playbook state, get the parent session rather than inferring it from an individual run.
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
     * @return a {@link AgentRunItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgentRunItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AgentRunItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get an agent run and its processing status. This operation uses the agentRun resource. List the session&apos;s agent runs to find the run id. Use that value unchanged with the same parent session identifier; the embedded agent object&apos;s key isn&apos;t the run identifier. Use this method to inspect one agent&apos;s execution. For the overall playbook state, get the parent session rather than inferring it from an individual run.
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
