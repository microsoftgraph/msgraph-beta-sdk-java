package com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item;

import com.microsoft.graph.models.GovernanceRoleAssignmentRequest;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item.resource.ResourceRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item.roledefinition.RoleDefinitionRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item.subject.SubjectRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.resources.item.roleassignmentrequests.item.updaterequest.UpdateRequestRequestBuilder;
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
 * Provides operations to manage the roleAssignmentRequests property of the microsoft.graph.governanceResource entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRoleAssignmentRequestItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the cancel method.
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resource property of the microsoft.graph.governanceRoleAssignmentRequest entity.
     */
    @jakarta.annotation.Nonnull
    public ResourceRequestBuilder resource() {
        return new ResourceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinition property of the microsoft.graph.governanceRoleAssignmentRequest entity.
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionRequestBuilder roleDefinition() {
        return new RoleDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subject property of the microsoft.graph.governanceRoleAssignmentRequest entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectRequestBuilder subject() {
        return new SubjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateRequest method.
     */
    @jakarta.annotation.Nonnull
    public UpdateRequestRequestBuilder updateRequest() {
        return new UpdateRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GovernanceRoleAssignmentRequestItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GovernanceRoleAssignmentRequestItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}/resources/{governanceResource%2Did}/roleAssignmentRequests/{governanceRoleAssignmentRequest%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new GovernanceRoleAssignmentRequestItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GovernanceRoleAssignmentRequestItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}/resources/{governanceResource%2Did}/roleAssignmentRequests/{governanceRoleAssignmentRequest%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property roleAssignmentRequests for privilegedAccess
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property roleAssignmentRequests for privilegedAccess
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
     * The collection of role assignment requests for the resource.
     * @return a CompletableFuture of GovernanceRoleAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceRoleAssignmentRequest> get() {
        return get(null);
    }
    /**
     * The collection of role assignment requests for the resource.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of GovernanceRoleAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceRoleAssignmentRequest> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, GovernanceRoleAssignmentRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property roleAssignmentRequests in privilegedAccess
     * @param body The request body
     * @return a CompletableFuture of GovernanceRoleAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceRoleAssignmentRequest> patch(@jakarta.annotation.Nonnull final GovernanceRoleAssignmentRequest body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property roleAssignmentRequests in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of GovernanceRoleAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceRoleAssignmentRequest> patch(@jakarta.annotation.Nonnull final GovernanceRoleAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, GovernanceRoleAssignmentRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property roleAssignmentRequests for privilegedAccess
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property roleAssignmentRequests for privilegedAccess
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
     * The collection of role assignment requests for the resource.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of role assignment requests for the resource.
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
     * Update the navigation property roleAssignmentRequests in privilegedAccess
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final GovernanceRoleAssignmentRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property roleAssignmentRequests in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final GovernanceRoleAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a GovernanceRoleAssignmentRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleAssignmentRequestItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GovernanceRoleAssignmentRequestItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of role assignment requests for the resource.
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
