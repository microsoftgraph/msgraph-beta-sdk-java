package com.microsoft.graph.beta.applicationtemplates.item.instantiate;

import com.microsoft.graph.beta.models.ApplicationServicePrincipal;
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
 * Provides operations to call the instantiate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstantiateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link InstantiateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstantiateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applicationTemplates/{applicationTemplate%2Did}/instantiate", pathParameters);
    }
    /**
     * Instantiates a new {@link InstantiateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstantiateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applicationTemplates/{applicationTemplate%2Did}/instantiate", rawUrl);
    }
    /**
     * Add an instance of an application from the Microsoft Entra application gallery into your directory. For non-gallery apps, use an application template with one of the following IDs to configure different single sign-on (SSO) modes like SAML SSO and password-based SSO.
     * @param body The request body
     * @return a {@link ApplicationServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/applicationtemplate-instantiate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ApplicationServicePrincipal post(@jakarta.annotation.Nonnull final InstantiatePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Add an instance of an application from the Microsoft Entra application gallery into your directory. For non-gallery apps, use an application template with one of the following IDs to configure different single sign-on (SSO) modes like SAML SSO and password-based SSO.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ApplicationServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/applicationtemplate-instantiate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ApplicationServicePrincipal post(@jakarta.annotation.Nonnull final InstantiatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ApplicationServicePrincipal::createFromDiscriminatorValue);
    }
    /**
     * Add an instance of an application from the Microsoft Entra application gallery into your directory. For non-gallery apps, use an application template with one of the following IDs to configure different single sign-on (SSO) modes like SAML SSO and password-based SSO.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstantiatePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add an instance of an application from the Microsoft Entra application gallery into your directory. For non-gallery apps, use an application template with one of the following IDs to configure different single sign-on (SSO) modes like SAML SSO and password-based SSO.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstantiatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link InstantiateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InstantiateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InstantiateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
