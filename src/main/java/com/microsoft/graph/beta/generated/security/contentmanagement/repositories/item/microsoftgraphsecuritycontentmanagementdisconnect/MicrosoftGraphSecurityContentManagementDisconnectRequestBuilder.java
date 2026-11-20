package com.microsoft.graph.beta.security.contentmanagement.repositories.item.microsoftgraphsecuritycontentmanagementdisconnect;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.contentmanagement.RepositoryDisconnectResult;
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
 * Provides operations to call the disconnect method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement/repositories/{contentManagementRepository%2Did}/microsoft.graph.security.contentManagement.disconnect", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement/repositories/{contentManagementRepository%2Did}/microsoft.graph.security.contentManagement.disconnect", rawUrl);
    }
    /**
     * Disconnect a repository. Always removes the connection on the Sentinel side.The provider credential is optional: when supplied, repository-side artifacts(the deployment identity and setup pipeline) are cleaned up on a best-effort basis;when omitted, or if cleanup fails, the connection is still removed and any repository-sideartifacts that could not be removed are reported in the result. Disconnecting without acredential does not stop the repository from pushing until its identity is removed.
     * @param body The request body
     * @return a {@link RepositoryDisconnectResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RepositoryDisconnectResult post(@jakarta.annotation.Nonnull final DisconnectPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Disconnect a repository. Always removes the connection on the Sentinel side.The provider credential is optional: when supplied, repository-side artifacts(the deployment identity and setup pipeline) are cleaned up on a best-effort basis;when omitted, or if cleanup fails, the connection is still removed and any repository-sideartifacts that could not be removed are reported in the result. Disconnecting without acredential does not stop the repository from pushing until its identity is removed.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RepositoryDisconnectResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RepositoryDisconnectResult post(@jakarta.annotation.Nonnull final DisconnectPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RepositoryDisconnectResult::createFromDiscriminatorValue);
    }
    /**
     * Disconnect a repository. Always removes the connection on the Sentinel side.The provider credential is optional: when supplied, repository-side artifacts(the deployment identity and setup pipeline) are cleaned up on a best-effort basis;when omitted, or if cleanup fails, the connection is still removed and any repository-sideartifacts that could not be removed are reported in the result. Disconnecting without acredential does not stop the repository from pushing until its identity is removed.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DisconnectPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Disconnect a repository. Always removes the connection on the Sentinel side.The provider credential is optional: when supplied, repository-side artifacts(the deployment identity and setup pipeline) are cleaned up on a best-effort basis;when omitted, or if cleanup fails, the connection is still removed and any repository-sideartifacts that could not be removed are reported in the result. Disconnecting without acredential does not stop the repository from pushing until its identity is removed.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DisconnectPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityContentManagementDisconnectRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
