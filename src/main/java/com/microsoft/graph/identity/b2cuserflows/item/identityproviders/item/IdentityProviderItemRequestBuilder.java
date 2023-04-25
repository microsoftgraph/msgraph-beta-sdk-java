package com.microsoft.graph.identity.b2cuserflows.item.identityproviders.item;

import com.microsoft.graph.identity.b2cuserflows.item.identityproviders.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identity/b2cUserFlows/{b2cIdentityUserFlow-id}/identityProviders/{identityProvider-id}
 */
public class IdentityProviderItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the collection of identityContainer entities. */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new IdentityProviderItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityProviderItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows/{b2cIdentityUserFlow%2Did}/identityProviders/{identityProvider%2Did}", pathParameters);
    }
    /**
     * Instantiates a new IdentityProviderItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityProviderItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2cUserFlows/{b2cIdentityUserFlow%2Did}/identityProviders/{identityProvider%2Did}", rawUrl);
    }
}
