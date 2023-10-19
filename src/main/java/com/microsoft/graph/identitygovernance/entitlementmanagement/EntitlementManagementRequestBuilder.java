package com.microsoft.graph.identitygovernance.entitlementmanagement;

import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.AccessPackageAssignmentApprovalsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentpolicies.AccessPackageAssignmentPoliciesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentrequests.AccessPackageAssignmentRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentresourceroles.AccessPackageAssignmentResourceRolesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.AccessPackageAssignmentsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackagecatalogs.AccessPackageCatalogsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourceenvironments.AccessPackageResourceEnvironmentsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerequests.AccessPackageResourceRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.AccessPackageResourceRoleScopesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresources.AccessPackageResourcesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.AccessPackagesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.ConnectedOrganizationsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.settings.SettingsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.subjects.SubjectsRequestBuilder;
import com.microsoft.graph.models.EntitlementManagement;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessPackageAssignmentApprovals property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentApprovalsRequestBuilder accessPackageAssignmentApprovals() {
        return new AccessPackageAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentPolicies property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentPoliciesRequestBuilder accessPackageAssignmentPolicies() {
        return new AccessPackageAssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentRequests property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentRequestsRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentResourceRoles property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentResourceRolesRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignments property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentsRequestBuilder accessPackageAssignments() {
        return new AccessPackageAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageCatalogs property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageCatalogsRequestBuilder accessPackageCatalogs() {
        return new AccessPackageCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceEnvironments property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageResourceEnvironmentsRequestBuilder accessPackageResourceEnvironments() {
        return new AccessPackageResourceEnvironmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceRequests property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageResourceRequestsRequestBuilder accessPackageResourceRequests() {
        return new AccessPackageResourceRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceRoleScopes property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageResourceRoleScopesRequestBuilder accessPackageResourceRoleScopes() {
        return new AccessPackageResourceRoleScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResources property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageResourcesRequestBuilder accessPackageResources() {
        return new AccessPackageResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackages property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackagesRequestBuilder accessPackages() {
        return new AccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectedOrganizations property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ConnectedOrganizationsRequestBuilder connectedOrganizations() {
        return new ConnectedOrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subjects property of the microsoft.graph.entitlementManagement entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectsRequestBuilder subjects() {
        return new SubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a CompletableFuture of EntitlementManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get() {
        return get(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of EntitlementManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of EntitlementManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> patch(@jakarta.annotation.Nonnull final EntitlementManagement body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of EntitlementManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> patch(@jakarta.annotation.Nonnull final EntitlementManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        return requestInfo;
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EntitlementManagement body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EntitlementManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a EntitlementManagementRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EntitlementManagementRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EntitlementManagementRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entitlementManagement from identityGovernance
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
