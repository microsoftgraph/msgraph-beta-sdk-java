package com.microsoft.graph.beta.serviceprincipals.item.homerealmdiscoverypolicies.item;

import com.microsoft.graph.beta.serviceprincipals.item.homerealmdiscoverypolicies.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /servicePrincipals/{servicePrincipal-id}/homeRealmDiscoveryPolicies/{homeRealmDiscoveryPolicy-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HomeRealmDiscoveryPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link HomeRealmDiscoveryPolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HomeRealmDiscoveryPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/homeRealmDiscoveryPolicies/{homeRealmDiscoveryPolicy%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link HomeRealmDiscoveryPolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HomeRealmDiscoveryPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/homeRealmDiscoveryPolicies/{homeRealmDiscoveryPolicy%2Did}", rawUrl);
    }
}
