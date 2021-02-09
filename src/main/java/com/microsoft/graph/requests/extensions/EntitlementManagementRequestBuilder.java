// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntitlementManagement;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceEnvironmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceEnvironmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceEnvironmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceEnvironmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectedOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectedOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectedOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectedOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntitlementManagementSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.EntitlementManagementSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management Request Builder.
 */
public class EntitlementManagementRequestBuilder extends BaseRequestBuilder implements IEntitlementManagementRequestBuilder {

    /**
     * The request builder for the EntitlementManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntitlementManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEntitlementManagementRequest instance
     */
    public IEntitlementManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEntitlementManagementRequest instance
     */
    public IEntitlementManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EntitlementManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAccessPackageAssignmentPolicyCollectionRequestBuilder accessPackageAssignmentPolicies() {
        return new AccessPackageAssignmentPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentPolicies"), getClient(), null);
    }

    public IAccessPackageAssignmentPolicyRequestBuilder accessPackageAssignmentPolicies(final String id) {
        return new AccessPackageAssignmentPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentPolicies") + "/" + id, getClient(), null);
    }
    public IAccessPackageAssignmentRequestCollectionRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentRequests"), getClient(), null);
    }

    public IAccessPackageAssignmentRequestRequestBuilder accessPackageAssignmentRequests(final String id) {
        return new AccessPackageAssignmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentRequests") + "/" + id, getClient(), null);
    }
    public IAccessPackageAssignmentResourceRoleCollectionRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRoleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentResourceRoles"), getClient(), null);
    }

    public IAccessPackageAssignmentResourceRoleRequestBuilder accessPackageAssignmentResourceRoles(final String id) {
        return new AccessPackageAssignmentResourceRoleRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentResourceRoles") + "/" + id, getClient(), null);
    }
    public IAccessPackageAssignmentCollectionRequestBuilder accessPackageAssignments() {
        return new AccessPackageAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignments"), getClient(), null);
    }

    public IAccessPackageAssignmentRequestBuilder accessPackageAssignments(final String id) {
        return new AccessPackageAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignments") + "/" + id, getClient(), null);
    }
    public IAccessPackageCatalogCollectionRequestBuilder accessPackageCatalogs() {
        return new AccessPackageCatalogCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageCatalogs"), getClient(), null);
    }

    public IAccessPackageCatalogRequestBuilder accessPackageCatalogs(final String id) {
        return new AccessPackageCatalogRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageCatalogs") + "/" + id, getClient(), null);
    }
    public IAccessPackageResourceEnvironmentCollectionRequestBuilder accessPackageResourceEnvironments() {
        return new AccessPackageResourceEnvironmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceEnvironments"), getClient(), null);
    }

    public IAccessPackageResourceEnvironmentRequestBuilder accessPackageResourceEnvironments(final String id) {
        return new AccessPackageResourceEnvironmentRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceEnvironments") + "/" + id, getClient(), null);
    }
    public IAccessPackageResourceRequestCollectionRequestBuilder accessPackageResourceRequests() {
        return new AccessPackageResourceRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRequests"), getClient(), null);
    }

    public IAccessPackageResourceRequestRequestBuilder accessPackageResourceRequests(final String id) {
        return new AccessPackageResourceRequestRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRequests") + "/" + id, getClient(), null);
    }
    public IAccessPackageResourceRoleScopeCollectionRequestBuilder accessPackageResourceRoleScopes() {
        return new AccessPackageResourceRoleScopeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRoleScopes"), getClient(), null);
    }

    public IAccessPackageResourceRoleScopeRequestBuilder accessPackageResourceRoleScopes(final String id) {
        return new AccessPackageResourceRoleScopeRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRoleScopes") + "/" + id, getClient(), null);
    }
    public IAccessPackageResourceCollectionRequestBuilder accessPackageResources() {
        return new AccessPackageResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResources"), getClient(), null);
    }

    public IAccessPackageResourceRequestBuilder accessPackageResources(final String id) {
        return new AccessPackageResourceRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResources") + "/" + id, getClient(), null);
    }
    public IAccessPackageCollectionRequestBuilder accessPackages() {
        return new AccessPackageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackages"), getClient(), null);
    }

    public IAccessPackageRequestBuilder accessPackages(final String id) {
        return new AccessPackageRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackages") + "/" + id, getClient(), null);
    }
    public IConnectedOrganizationCollectionRequestBuilder connectedOrganizations() {
        return new ConnectedOrganizationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("connectedOrganizations"), getClient(), null);
    }

    public IConnectedOrganizationRequestBuilder connectedOrganizations(final String id) {
        return new ConnectedOrganizationRequestBuilder(getRequestUrlWithAdditionalSegment("connectedOrganizations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EntitlementManagementSettings
     *
     * @return the IEntitlementManagementSettingsRequestBuilder instance
     */
    public IEntitlementManagementSettingsRequestBuilder settings() {
        return new EntitlementManagementSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }
}
