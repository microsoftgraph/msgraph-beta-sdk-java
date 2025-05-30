package com.microsoft.graph.beta.identity.conditionalaccess;

import com.microsoft.graph.beta.identity.conditionalaccess.authenticationcontextclassreferences.AuthenticationContextClassReferencesRequestBuilder;
import com.microsoft.graph.beta.identity.conditionalaccess.authenticationstrength.AuthenticationStrengthRequestBuilder;
import com.microsoft.graph.beta.identity.conditionalaccess.authenticationstrengths.AuthenticationStrengthsRequestBuilder;
import com.microsoft.graph.beta.identity.conditionalaccess.templates.TemplatesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identity/conditionalAccess
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the authenticationContextClassReferences property of the microsoft.graph.conditionalAccessRoot entity.
     * @return a {@link AuthenticationContextClassReferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationContextClassReferencesRequestBuilder authenticationContextClassReferences() {
        return new AuthenticationContextClassReferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationStrength property of the microsoft.graph.conditionalAccessRoot entity.
     * @return a {@link AuthenticationStrengthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthRequestBuilder authenticationStrength() {
        return new AuthenticationStrengthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationStrengths property of the microsoft.graph.conditionalAccessRoot entity.
     * @return a {@link AuthenticationStrengthsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthsRequestBuilder authenticationStrengths() {
        return new AuthenticationStrengthsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templates property of the microsoft.graph.conditionalAccessRoot entity.
     * @return a {@link TemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemplatesRequestBuilder templates() {
        return new TemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConditionalAccessRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConditionalAccessRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/conditionalAccess", pathParameters);
    }
    /**
     * Instantiates a new {@link ConditionalAccessRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConditionalAccessRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/conditionalAccess", rawUrl);
    }
}
