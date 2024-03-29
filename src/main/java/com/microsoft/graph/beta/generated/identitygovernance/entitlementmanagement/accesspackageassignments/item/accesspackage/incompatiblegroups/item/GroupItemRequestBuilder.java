package com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatiblegroups.item;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatiblegroups.item.ref.RefRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatiblegroups.item.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment-id}/accessPackage/incompatibleGroups/{group-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of identityGovernance entities.
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
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage/incompatibleGroups/{group%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link GroupItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage/incompatibleGroups/{group%2Did}", rawUrl);
    }
}
