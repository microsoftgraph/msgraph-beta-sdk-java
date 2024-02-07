package com.microsoft.graph.beta.rolemanagement.entitlementmanagement;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.RbacApplication;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.resourcenamespaces.ResourceNamespacesRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignmentapprovals.RoleAssignmentApprovalsRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignmentscheduleinstances.RoleAssignmentScheduleInstancesRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignmentschedulerequests.RoleAssignmentScheduleRequestsRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignmentschedules.RoleAssignmentSchedulesRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.RoleEligibilityScheduleInstancesRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.RoleEligibilityScheduleRequestsRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleeligibilityschedules.RoleEligibilitySchedulesRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.rolescheduleinstancesdirectoryscopeiddirectoryscopeidappscopeidappscopeidprincipalidprincipalidroledefinitionidroledefinitionid.RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleschedulesdirectoryscopeiddirectoryscopeidappscopeidappscopeidprincipalidprincipalidroledefinitionidroledefinitionid.RoleSchedulesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.entitlementmanagement.transitiveroleassignments.TransitiveRoleAssignmentsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the entitlementManagement property of the microsoft.graph.roleManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the resourceNamespaces property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public ResourceNamespacesRequestBuilder resourceNamespaces() {
        return new ResourceNamespacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentApprovals property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentApprovalsRequestBuilder roleAssignmentApprovals() {
        return new RoleAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentScheduleInstances property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentScheduleInstancesRequestBuilder roleAssignmentScheduleInstances() {
        return new RoleAssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentScheduleRequests property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentScheduleRequestsRequestBuilder roleAssignmentScheduleRequests() {
        return new RoleAssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentSchedules property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentSchedulesRequestBuilder roleAssignmentSchedules() {
        return new RoleAssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinitions property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilityScheduleInstances property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilityScheduleInstancesRequestBuilder roleEligibilityScheduleInstances() {
        return new RoleEligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilityScheduleRequests property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilityScheduleRequestsRequestBuilder roleEligibilityScheduleRequests() {
        return new RoleEligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilitySchedules property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilitySchedulesRequestBuilder roleEligibilitySchedules() {
        return new RoleEligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roleScheduleInstances method.
     */
    @jakarta.annotation.Nonnull
    public RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder roleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionId() {
        return new RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roleSchedules method.
     */
    @jakarta.annotation.Nonnull
    public RoleSchedulesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder roleSchedulesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionId() {
        return new RoleSchedulesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveRoleAssignments property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public TransitiveRoleAssignmentsRequestBuilder transitiveRoleAssignments() {
        return new TransitiveRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The RbacApplication for Entitlement Management
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication get() {
        return get(null);
    }
    /**
     * The RbacApplication for Entitlement Management
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RbacApplication::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication patch(@jakarta.annotation.Nonnull final RbacApplication body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication patch(@jakarta.annotation.Nonnull final RbacApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RbacApplication::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The RbacApplication for Entitlement Management
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The RbacApplication for Entitlement Management
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RbacApplication body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RbacApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
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
     * The RbacApplication for Entitlement Management
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
