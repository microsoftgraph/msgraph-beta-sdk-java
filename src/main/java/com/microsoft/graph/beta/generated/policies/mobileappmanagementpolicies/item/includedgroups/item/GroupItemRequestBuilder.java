package com.microsoft.graph.beta.policies.mobileappmanagementpolicies.item.includedgroups.item;

import com.microsoft.graph.beta.policies.mobileappmanagementpolicies.item.includedgroups.item.ref.RefRequestBuilder;
import com.microsoft.graph.beta.policies.mobileappmanagementpolicies.item.includedgroups.item.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /policies/mobileAppManagementPolicies/{mobilityManagementPolicy-id}/includedGroups/{group-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of policyRoot entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The serviceProvisioningErrors property
     * @return a {@link ServiceProvisioningErrorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GroupItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/mobileAppManagementPolicies/{mobilityManagementPolicy%2Did}/includedGroups/{group%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link GroupItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/mobileAppManagementPolicies/{mobilityManagementPolicy%2Did}/includedGroups/{group%2Did}", rawUrl);
    }
}
