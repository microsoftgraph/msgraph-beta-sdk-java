package com.microsoft.graph.beta.security.agenticsecurity;

import com.microsoft.graph.beta.security.agenticsecurity.playbookdefinitions.PlaybookDefinitionsRequestBuilder;
import com.microsoft.graph.beta.security.agenticsecurity.sessions.SessionsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /security/agenticSecurity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgenticSecurityRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the playbookDefinitions property of the microsoft.graph.agenticSecurityRoot entity.
     * @return a {@link PlaybookDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlaybookDefinitionsRequestBuilder playbookDefinitions() {
        return new PlaybookDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sessions property of the microsoft.graph.agenticSecurityRoot entity.
     * @return a {@link SessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SessionsRequestBuilder sessions() {
        return new SessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AgenticSecurityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgenticSecurityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity", pathParameters);
    }
    /**
     * Instantiates a new {@link AgenticSecurityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgenticSecurityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/agenticSecurity", rawUrl);
    }
}
