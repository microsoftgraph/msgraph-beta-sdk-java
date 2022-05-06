package microsoft.graph.identitygovernance.entitlementmanagement;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.AccessPackageAssignmentApprovalsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.item.ApprovalItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentpolicies.AccessPackageAssignmentPoliciesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentpolicies.item.AccessPackageAssignmentPolicyItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentrequests.AccessPackageAssignmentRequestsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentrequests.item.AccessPackageAssignmentRequestItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentresourceroles.AccessPackageAssignmentResourceRolesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentresourceroles.item.AccessPackageAssignmentResourceRoleItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.AccessPackageAssignmentsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.AccessPackageAssignmentItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackagecatalogs.AccessPackageCatalogsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackagecatalogs.item.AccessPackageCatalogItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourceenvironments.AccessPackageResourceEnvironmentsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourceenvironments.item.AccessPackageResourceEnvironmentItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerequests.AccessPackageResourceRequestsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerequests.item.AccessPackageResourceRequestItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.AccessPackageResourceRoleScopesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.item.AccessPackageResourceRoleScopeItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresources.AccessPackageResourcesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageresources.item.AccessPackageResourceItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.AccessPackagesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.AccessPackageItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.ConnectedOrganizationsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.item.ConnectedOrganizationItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.settings.SettingsRequestBuilder;
import microsoft.graph.models.EntitlementManagement;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity.  */
public class EntitlementManagementRequestBuilder {
    /** The accessPackageAssignmentApprovals property  */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentApprovalsRequestBuilder accessPackageAssignmentApprovals() {
        return new AccessPackageAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageAssignmentPolicies property  */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentPoliciesRequestBuilder accessPackageAssignmentPolicies() {
        return new AccessPackageAssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageAssignmentRequests property  */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentRequestsRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageAssignmentResourceRoles property  */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentResourceRolesRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageAssignments property  */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentsRequestBuilder accessPackageAssignments() {
        return new AccessPackageAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageCatalogs property  */
    @javax.annotation.Nonnull
    public AccessPackageCatalogsRequestBuilder accessPackageCatalogs() {
        return new AccessPackageCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageResourceEnvironments property  */
    @javax.annotation.Nonnull
    public AccessPackageResourceEnvironmentsRequestBuilder accessPackageResourceEnvironments() {
        return new AccessPackageResourceEnvironmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageResourceRequests property  */
    @javax.annotation.Nonnull
    public AccessPackageResourceRequestsRequestBuilder accessPackageResourceRequests() {
        return new AccessPackageResourceRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageResourceRoleScopes property  */
    @javax.annotation.Nonnull
    public AccessPackageResourceRoleScopesRequestBuilder accessPackageResourceRoleScopes() {
        return new AccessPackageResourceRoleScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageResources property  */
    @javax.annotation.Nonnull
    public AccessPackageResourcesRequestBuilder accessPackageResources() {
        return new AccessPackageResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackages property  */
    @javax.annotation.Nonnull
    public AccessPackagesRequestBuilder accessPackages() {
        return new AccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The connectedOrganizations property  */
    @javax.annotation.Nonnull
    public ConnectedOrganizationsRequestBuilder connectedOrganizations() {
        return new ConnectedOrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The settings property  */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignmentApprovals.item collection
     * @param id Unique identifier of the item
     * @return a approvalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApprovalItemRequestBuilder accessPackageAssignmentApprovals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("approval%2Did", id);
        return new ApprovalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignmentPolicies.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageAssignmentPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentPolicyItemRequestBuilder accessPackageAssignmentPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentPolicy%2Did", id);
        return new AccessPackageAssignmentPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignmentRequests.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageAssignmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentRequestItemRequestBuilder accessPackageAssignmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentRequest%2Did", id);
        return new AccessPackageAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignmentResourceRoles.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageAssignmentResourceRoleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentResourceRoleItemRequestBuilder accessPackageAssignmentResourceRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentResourceRole%2Did", id);
        return new AccessPackageAssignmentResourceRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentItemRequestBuilder accessPackageAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignment%2Did", id);
        return new AccessPackageAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageCatalogs.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageCatalogItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageCatalogItemRequestBuilder accessPackageCatalogs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageCatalog%2Did", id);
        return new AccessPackageCatalogItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageResourceEnvironments.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageResourceEnvironmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageResourceEnvironmentItemRequestBuilder accessPackageResourceEnvironments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResourceEnvironment%2Did", id);
        return new AccessPackageResourceEnvironmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageResourceRequests.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageResourceRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageResourceRequestItemRequestBuilder accessPackageResourceRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResourceRequest%2Did", id);
        return new AccessPackageResourceRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageResourceRoleScopes.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageResourceRoleScopeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageResourceRoleScopeItemRequestBuilder accessPackageResourceRoleScopes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResourceRoleScope%2Did", id);
        return new AccessPackageResourceRoleScopeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageResources.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageResourceItemRequestBuilder accessPackageResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResource%2Did", id);
        return new AccessPackageResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackages.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageItemRequestBuilder accessPackages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did", id);
        return new AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.connectedOrganizations.item collection
     * @param id Unique identifier of the item
     * @return a connectedOrganizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConnectedOrganizationItemRequestBuilder connectedOrganizations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connectedOrganization%2Did", id);
        return new ConnectedOrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderDeleteRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderGetRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EntitlementManagement body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EntitlementManagement body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderPatchRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a CompletableFuture of entitlementManagement
     */
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of entitlementManagement
     */
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of entitlementManagement
     */
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final EntitlementManagement body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final EntitlementManagement body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final EntitlementManagement body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class EntitlementManagementRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new entitlementManagementRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get entitlementManagement from identityGovernance  */
    public class EntitlementManagementRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class EntitlementManagementRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public EntitlementManagementRequestBuilderGetQueryParameters queryParameters = new EntitlementManagementRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new entitlementManagementRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class EntitlementManagementRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new entitlementManagementRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderPatchRequestConfiguration() {
        }
    }
}
