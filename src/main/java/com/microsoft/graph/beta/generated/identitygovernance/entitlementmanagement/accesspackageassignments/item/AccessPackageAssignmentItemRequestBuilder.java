package com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.AccessPackageRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackageassignmentpolicy.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackageassignmentrequests.AccessPackageAssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackageassignmentresourceroles.AccessPackageAssignmentResourceRolesRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.reprocess.ReprocessRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.target.TargetRequestBuilder;
import com.microsoft.graph.beta.models.AccessPackageAssignment;
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
 * Provides operations to manage the accessPackageAssignments property of the microsoft.graph.entitlementManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessPackage property of the microsoft.graph.accessPackageAssignment entity.
     * @return a {@link AccessPackageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageRequestBuilder accessPackage() {
        return new AccessPackageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentPolicy property of the microsoft.graph.accessPackageAssignment entity.
     * @return a {@link AccessPackageAssignmentPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentPolicyRequestBuilder accessPackageAssignmentPolicy() {
        return new AccessPackageAssignmentPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentRequests property of the microsoft.graph.accessPackageAssignment entity.
     * @return a {@link AccessPackageAssignmentRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentRequestsRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackageAssignmentResourceRoles property of the microsoft.graph.accessPackageAssignment entity.
     * @return a {@link AccessPackageAssignmentResourceRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentResourceRolesRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprocess method.
     * @return a {@link ReprocessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReprocessRequestBuilder reprocess() {
        return new ReprocessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the target property of the microsoft.graph.accessPackageAssignment entity.
     * @return a {@link TargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TargetRequestBuilder target() {
        return new TargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AccessPackageAssignmentItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AccessPackageAssignmentItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property accessPackageAssignments for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property accessPackageAssignments for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The assignment of an access package to a subject for a period of time.
     * @return a {@link AccessPackageAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment get() {
        return get(null);
    }
    /**
     * The assignment of an access package to a subject for a period of time.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignment::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property accessPackageAssignments in identityGovernance
     * @param body The request body
     * @return a {@link AccessPackageAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment patch(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property accessPackageAssignments in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment patch(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignment::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property accessPackageAssignments for identityGovernance
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property accessPackageAssignments for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * The assignment of an access package to a subject for a period of time.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The assignment of an access package to a subject for a period of time.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property accessPackageAssignments in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property accessPackageAssignments in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AccessPackageAssignmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessPackageAssignmentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The assignment of an access package to a subject for a period of time.
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
