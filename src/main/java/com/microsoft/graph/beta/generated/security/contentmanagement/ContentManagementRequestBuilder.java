package com.microsoft.graph.beta.security.contentmanagement;

import com.microsoft.graph.beta.security.contentmanagement.repositories.RepositoriesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /security/contentManagement
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the repositories property of the microsoft.graph.contentManagementRoot entity.
     * @return a {@link RepositoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RepositoriesRequestBuilder repositories() {
        return new RepositoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ContentManagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement", pathParameters);
    }
    /**
     * Instantiates a new {@link ContentManagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/contentManagement", rawUrl);
    }
}
