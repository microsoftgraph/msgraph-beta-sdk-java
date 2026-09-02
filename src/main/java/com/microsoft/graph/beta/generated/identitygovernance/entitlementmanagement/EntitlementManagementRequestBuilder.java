package com.microsoft.graph.beta.identitygovernance.entitlementmanagement;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.AccessPackageAssignmentApprovalsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignmentpolicies.AccessPackageAssignmentPoliciesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignmentrequests.AccessPackageAssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignmentresourceroles.AccessPackageAssignmentResourceRolesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.AccessPackageAssignmentsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogs.AccessPackageCatalogsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagecatalogswithuniquename.AccessPackageCatalogsWithUniqueNameRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresourceenvironments.AccessPackageResourceEnvironmentsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresourcerequests.AccessPackageResourceRequestsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.AccessPackageResourceRoleScopesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresources.AccessPackageResourcesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackages.AccessPackagesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackagesuggestions.AccessPackageSuggestionsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageswithuniquename.AccessPackagesWithUniqueNameRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.assignmentrequests.AssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.availableaccesspackages.AvailableAccessPackagesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.connectedorganizations.ConnectedOrganizationsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.controlconfigurations.ControlConfigurationsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.externaloriginresourceconnectors.ExternalOriginResourceConnectorsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.settings.SettingsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.subjects.SubjectsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.subjectswithobjectid.SubjectsWithObjectIdRequestBuilder;
import com.microsoft.graph.beta.models.EntitlementManagement;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessPackageAssignmentApprovals property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageAssignmentApprovalsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentApprovalsRequestBuilder accessPackageAssignmentApprovals() {
        return new AccessPackageAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentPolicies property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageAssignmentPoliciesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentPoliciesRequestBuilder accessPackageAssignmentPolicies() {
        return new AccessPackageAssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentRequests property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageAssignmentRequestsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentRequestsRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentResourceRoles property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageAssignmentResourceRolesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentResourceRolesRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignments property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageAssignmentsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentsRequestBuilder accessPackageAssignments() {
        return new AccessPackageAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageCatalogs property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageCatalogsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageCatalogsRequestBuilder accessPackageCatalogs() {
        return new AccessPackageCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceEnvironments property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageResourceEnvironmentsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageResourceEnvironmentsRequestBuilder accessPackageResourceEnvironments() {
        return new AccessPackageResourceEnvironmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceRequests property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageResourceRequestsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageResourceRequestsRequestBuilder accessPackageResourceRequests() {
        return new AccessPackageResourceRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResourceRoleScopes property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageResourceRoleScopesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageResourceRoleScopesRequestBuilder accessPackageResourceRoleScopes() {
        return new AccessPackageResourceRoleScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageResources property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageResourcesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageResourcesRequestBuilder accessPackageResources() {
        return new AccessPackageResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackages property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackagesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackagesRequestBuilder accessPackages() {
        return new AccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageSuggestions property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AccessPackageSuggestionsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AccessPackageSuggestionsRequestBuilder accessPackageSuggestions() {
        return new AccessPackageSuggestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AssignmentRequestsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AssignmentRequestsRequestBuilder assignmentRequests() {
        return new AssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the availableAccessPackages property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link AvailableAccessPackagesRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AvailableAccessPackagesRequestBuilder availableAccessPackages() {
        return new AvailableAccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectedOrganizations property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link ConnectedOrganizationsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ConnectedOrganizationsRequestBuilder connectedOrganizations() {
        return new ConnectedOrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the controlConfigurations property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link ControlConfigurationsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ControlConfigurationsRequestBuilder controlConfigurations() {
        return new ControlConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the externalOriginResourceConnectors property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link ExternalOriginResourceConnectorsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ExternalOriginResourceConnectorsRequestBuilder externalOriginResourceConnectors() {
        return new ExternalOriginResourceConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link SettingsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subjects property of the microsoft.graph.entitlementManagement entity.
     * @return a {@link SubjectsRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public SubjectsRequestBuilder subjects() {
        return new SubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageCatalogs property of the microsoft.graph.entitlementManagement entity.
     * @param uniqueName Alternate key of accessPackageCatalog
     * @return a {@link AccessPackageCatalogsWithUniqueNameRequestBuilder}
     * @deprecated
     *  as of 2022-10/PrivatePreview:MicrosofEntitlementManagementCustomextensions on 2023-03-01 and will be removed 2023-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public AccessPackageCatalogsWithUniqueNameRequestBuilder accessPackageCatalogsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new AccessPackageCatalogsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Provides operations to manage the accessPackages property of the microsoft.graph.entitlementManagement entity.
     * @param uniqueName Alternate key of accessPackage
     * @return a {@link AccessPackagesWithUniqueNameRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public AccessPackagesWithUniqueNameRequestBuilder accessPackagesWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new AccessPackagesWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new {@link EntitlementManagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link EntitlementManagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a {@link EntitlementManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EntitlementManagement get() {
        return get(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EntitlementManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EntitlementManagement get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EntitlementManagement::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @return a {@link EntitlementManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EntitlementManagement patch(@jakarta.annotation.Nonnull final EntitlementManagement body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EntitlementManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EntitlementManagement patch(@jakarta.annotation.Nonnull final EntitlementManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EntitlementManagement::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the subjects property of the microsoft.graph.entitlementManagement entity.
     * @param objectId Alternate key of accessPackageSubject
     * @return a {@link SubjectsWithObjectIdRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public SubjectsWithObjectIdRequestBuilder subjectsWithObjectId(@jakarta.annotation.Nonnull final String objectId) {
        Objects.requireNonNull(objectId);
        return new SubjectsWithObjectIdRequestBuilder(pathParameters, requestAdapter, objectId);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EntitlementManagement body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EntitlementManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link EntitlementManagementRequestBuilder}
     * @deprecated
     *  as of 2022-02/PrivatePreview:groupPeerOutlierInsights on 2021-10-21 and will be removed 2022-02-18
     */
    @jakarta.annotation.Nonnull
    @Deprecated
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
         * @return a {@link Map<String, Object>}
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
