package com.microsoft.graph.privilegedaccess.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccess;
import com.microsoft.graph.privilegedaccess.item.resources.item.GovernanceResourceItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.resources.ResourcesRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roleassignmentrequests.item.GovernanceRoleAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roleassignmentrequests.RoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roleassignments.item.GovernanceRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roledefinitions.item.GovernanceRoleDefinitionItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.rolesettings.item.GovernanceRoleSettingItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.rolesettings.RoleSettingsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of privilegedAccess entities.
 */
public class PrivilegedAccessItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the resources property of the microsoft.graph.privilegedAccess entity. */
    @javax.annotation.Nonnull
    public ResourcesRequestBuilder resources() {
        return new ResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleAssignmentRequests property of the microsoft.graph.privilegedAccess entity. */
    @javax.annotation.Nonnull
    public RoleAssignmentRequestsRequestBuilder roleAssignmentRequests() {
        return new RoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleAssignments property of the microsoft.graph.privilegedAccess entity. */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleDefinitions property of the microsoft.graph.privilegedAccess entity. */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleSettings property of the microsoft.graph.privilegedAccess entity. */
    @javax.annotation.Nonnull
    public RoleSettingsRequestBuilder roleSettings() {
        return new RoleSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PrivilegedAccessItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccessItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PrivilegedAccessItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccessItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from privilegedAccess
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete entity from privilegedAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entity from privilegedAccess by key
     * @return a CompletableFuture of privilegedAccess
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccess> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccess::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccess> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccess>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entity from privilegedAccess by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedAccess
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccess> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccess::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccess> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccess>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @return a CompletableFuture of privilegedAccess
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccess> patch(@javax.annotation.Nonnull final PrivilegedAccess body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccess::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccess> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccess>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedAccess
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedAccess> patch(@javax.annotation.Nonnull final PrivilegedAccess body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedAccess::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PrivilegedAccess> executionException = new java.util.concurrent.CompletableFuture<PrivilegedAccess>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the resources property of the microsoft.graph.privilegedAccess entity.
     * @param id Unique identifier of the item
     * @return a GovernanceResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceResourceItemRequestBuilder resources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceResource%2Did", id);
        return new GovernanceResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentRequests property of the microsoft.graph.privilegedAccess entity.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleAssignmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentRequestItemRequestBuilder roleAssignmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleAssignmentRequest%2Did", id);
        return new GovernanceRoleAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.privilegedAccess entity.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentItemRequestBuilder roleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleAssignment%2Did", id);
        return new GovernanceRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinitions property of the microsoft.graph.privilegedAccess entity.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleDefinitionItemRequestBuilder roleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleDefinition%2Did", id);
        return new GovernanceRoleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleSettings property of the microsoft.graph.privilegedAccess entity.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleSettingItemRequestBuilder roleSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleSetting%2Did", id);
        return new GovernanceRoleSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete entity from privilegedAccess
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from privilegedAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entity from privilegedAccess by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from privilegedAccess by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final PrivilegedAccess body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final PrivilegedAccess body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entity from privilegedAccess by key
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
