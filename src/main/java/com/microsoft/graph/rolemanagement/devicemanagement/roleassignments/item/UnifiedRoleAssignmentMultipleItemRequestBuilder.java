package com.microsoft.graph.rolemanagement.devicemanagement.roleassignments.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.rolemanagement.devicemanagement.roleassignments.item.appscopes.AppScopesRequestBuilder;
import com.microsoft.graph.rolemanagement.devicemanagement.roleassignments.item.directoryscopes.DirectoryScopesRequestBuilder;
import com.microsoft.graph.rolemanagement.devicemanagement.roleassignments.item.principals.PrincipalsRequestBuilder;
import com.microsoft.graph.rolemanagement.devicemanagement.roleassignments.item.roledefinition.RoleDefinitionRequestBuilder;
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
 * Provides operations to manage the roleAssignments property of the microsoft.graph.rbacApplicationMultiple entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleAssignmentMultipleItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appScopes property of the microsoft.graph.unifiedRoleAssignmentMultiple entity.
     */
    @jakarta.annotation.Nonnull
    public AppScopesRequestBuilder appScopes() {
        return new AppScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directoryScopes property of the microsoft.graph.unifiedRoleAssignmentMultiple entity.
     */
    @jakarta.annotation.Nonnull
    public DirectoryScopesRequestBuilder directoryScopes() {
        return new DirectoryScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the principals property of the microsoft.graph.unifiedRoleAssignmentMultiple entity.
     */
    @jakarta.annotation.Nonnull
    public PrincipalsRequestBuilder principals() {
        return new PrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinition property of the microsoft.graph.unifiedRoleAssignmentMultiple entity.
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionRequestBuilder roleDefinition() {
        return new RoleDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UnifiedRoleAssignmentMultipleItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleAssignmentMultipleItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/deviceManagement/roleAssignments/{unifiedRoleAssignmentMultiple%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UnifiedRoleAssignmentMultipleItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleAssignmentMultipleItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/deviceManagement/roleAssignments/{unifiedRoleAssignmentMultiple%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a unifiedRoleAssignmentMultiple object of an RBAC provider.  This is applicable for a RBAC application that supports multiple principals and scopes. The following RBAC providers are currently supported:- Cloud PC - device management (Intune) This API is available in the following national cloud deployments.
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete a unifiedRoleAssignmentMultiple object of an RBAC provider.  This is applicable for a RBAC application that supports multiple principals and scopes. The following RBAC providers are currently supported:- Cloud PC - device management (Intune) This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-delete?view=graph-rest-1.0">Find more info here</a>
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
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of UnifiedRoleAssignmentMultiple
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentMultiple> get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UnifiedRoleAssignmentMultiple
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentMultiple> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleAssignmentMultiple::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update an existing unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) In contrast, unifiedRoleAssignment does not support update. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CompletableFuture of UnifiedRoleAssignmentMultiple
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentMultiple> patch(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body) {
        return patch(body, null);
    }
    /**
     * Update an existing unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) In contrast, unifiedRoleAssignment does not support update. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UnifiedRoleAssignmentMultiple
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentMultiple> patch(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleAssignmentMultiple::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete a unifiedRoleAssignmentMultiple object of an RBAC provider.  This is applicable for a RBAC application that supports multiple principals and scopes. The following RBAC providers are currently supported:- Cloud PC - device management (Intune) This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a unifiedRoleAssignmentMultiple object of an RBAC provider.  This is applicable for a RBAC application that supports multiple principals and scopes. The following RBAC providers are currently supported:- Cloud PC - device management (Intune) This API is available in the following national cloud deployments.
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
        requestInfo.headers.tryAdd("Accept", "application/json, application/json");
        return requestInfo;
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment. This API is available in the following national cloud deployments.
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
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update an existing unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) In contrast, unifiedRoleAssignment does not support update. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update an existing unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) In contrast, unifiedRoleAssignment does not support update. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UnifiedRoleAssignmentMultipleItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedRoleAssignmentMultipleItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UnifiedRoleAssignmentMultipleItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment. This API is available in the following national cloud deployments.
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
