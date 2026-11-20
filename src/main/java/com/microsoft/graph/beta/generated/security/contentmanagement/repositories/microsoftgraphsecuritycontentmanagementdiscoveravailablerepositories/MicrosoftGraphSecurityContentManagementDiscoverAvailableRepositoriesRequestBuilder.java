package com.microsoft.graph.beta.security.contentmanagement.repositories.microsoftgraphsecuritycontentmanagementdiscoveravailablerepositories;

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
 * Provides operations to call the discoverAvailableRepositories method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement/repositories/microsoft.graph.security.contentManagement.discoverAvailableRepositories", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement/repositories/microsoft.graph.security.contentManagement.discoverAvailableRepositories", rawUrl);
    }
    /**
     * Discover candidate repositories the caller can connect, using a supplied provider credential.Credential is passed in the request body and is never returned; only repository metadata is.Results are transient, non-addressable discovery records: the backend exposes no stable id fora candidate repository (confirmed in source), so they are modeled as value objects, not entities.The result is a bounded set: the action returns up to 200 candidate repositories accessible to thesupplied credential. It is not paged. Paging is not offered because the credential is a write-onlyrequest-body value and an OData `@odata.nextLink` continuation is a GET that cannot carry it; thebound keeps the response size predictable. Callers who need a specific repository connect it directly.
     * @param body The request body
     * @return a {@link DiscoverAvailableRepositoriesPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DiscoverAvailableRepositoriesPostResponse post(@jakarta.annotation.Nonnull final DiscoverAvailableRepositoriesPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Discover candidate repositories the caller can connect, using a supplied provider credential.Credential is passed in the request body and is never returned; only repository metadata is.Results are transient, non-addressable discovery records: the backend exposes no stable id fora candidate repository (confirmed in source), so they are modeled as value objects, not entities.The result is a bounded set: the action returns up to 200 candidate repositories accessible to thesupplied credential. It is not paged. Paging is not offered because the credential is a write-onlyrequest-body value and an OData `@odata.nextLink` continuation is a GET that cannot carry it; thebound keeps the response size predictable. Callers who need a specific repository connect it directly.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DiscoverAvailableRepositoriesPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DiscoverAvailableRepositoriesPostResponse post(@jakarta.annotation.Nonnull final DiscoverAvailableRepositoriesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DiscoverAvailableRepositoriesPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Discover candidate repositories the caller can connect, using a supplied provider credential.Credential is passed in the request body and is never returned; only repository metadata is.Results are transient, non-addressable discovery records: the backend exposes no stable id fora candidate repository (confirmed in source), so they are modeled as value objects, not entities.The result is a bounded set: the action returns up to 200 candidate repositories accessible to thesupplied credential. It is not paged. Paging is not offered because the credential is a write-onlyrequest-body value and an OData `@odata.nextLink` continuation is a GET that cannot carry it; thebound keeps the response size predictable. Callers who need a specific repository connect it directly.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DiscoverAvailableRepositoriesPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Discover candidate repositories the caller can connect, using a supplied provider credential.Credential is passed in the request body and is never returned; only repository metadata is.Results are transient, non-addressable discovery records: the backend exposes no stable id fora candidate repository (confirmed in source), so they are modeled as value objects, not entities.The result is a bounded set: the action returns up to 200 candidate repositories accessible to thesupplied credential. It is not paged. Paging is not offered because the credential is a write-onlyrequest-body value and an OData `@odata.nextLink` continuation is a GET that cannot carry it; thebound keeps the response size predictable. Callers who need a specific repository connect it directly.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DiscoverAvailableRepositoriesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityContentManagementDiscoverAvailableRepositoriesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
