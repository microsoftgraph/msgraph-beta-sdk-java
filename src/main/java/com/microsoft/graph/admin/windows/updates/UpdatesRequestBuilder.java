package com.microsoft.graph.admin.windows.updates;

import com.microsoft.graph.admin.windows.updates.catalog.CatalogRequestBuilder;
import com.microsoft.graph.admin.windows.updates.deploymentaudiences.DeploymentAudiencesRequestBuilder;
import com.microsoft.graph.admin.windows.updates.deploymentaudiences.item.DeploymentAudienceItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.deployments.DeploymentsRequestBuilder;
import com.microsoft.graph.admin.windows.updates.deployments.item.DeploymentItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.resourceconnections.item.ResourceConnectionItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.resourceconnections.ResourceConnectionsRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.item.UpdatableAssetItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.UpdatableAssetsRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatepolicies.item.UpdatePolicyItemRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatepolicies.UpdatePoliciesRequestBuilder;
import com.microsoft.graph.models.AdminWindowsUpdates;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the updates property of the microsoft.graph.adminWindows entity.
 */
public class UpdatesRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the catalog property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public CatalogRequestBuilder catalog() {
        return new CatalogRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deploymentAudiences property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public DeploymentAudiencesRequestBuilder deploymentAudiences() {
        return new DeploymentAudiencesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deployments property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public DeploymentsRequestBuilder deployments() {
        return new DeploymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the resourceConnections property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public ResourceConnectionsRequestBuilder resourceConnections() {
        return new ResourceConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public UpdatableAssetsRequestBuilder updatableAssets() {
        return new UpdatableAssetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the updatePolicies property of the microsoft.graph.adminWindowsUpdates entity. */
    @javax.annotation.Nonnull
    public UpdatePoliciesRequestBuilder updatePolicies() {
        return new UpdatePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UpdatesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UpdatesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property updates for admin
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property updates for admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the deploymentAudiences property of the microsoft.graph.adminWindowsUpdates entity.
     * @param id Unique identifier of the item
     * @return a DeploymentAudienceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeploymentAudienceItemRequestBuilder deploymentAudiences(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deploymentAudience%2Did", id);
        return new DeploymentAudienceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deployments property of the microsoft.graph.adminWindowsUpdates entity.
     * @param id Unique identifier of the item
     * @return a DeploymentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeploymentItemRequestBuilder deployments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deployment%2Did", id);
        return new DeploymentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @return a CompletableFuture of adminWindowsUpdates
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdminWindowsUpdates> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdminWindowsUpdates::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdminWindowsUpdates> executionException = new java.util.concurrent.CompletableFuture<AdminWindowsUpdates>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of adminWindowsUpdates
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdminWindowsUpdates> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdminWindowsUpdates::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdminWindowsUpdates> executionException = new java.util.concurrent.CompletableFuture<AdminWindowsUpdates>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @return a CompletableFuture of adminWindowsUpdates
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdminWindowsUpdates> patch(@javax.annotation.Nonnull final AdminWindowsUpdates body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdminWindowsUpdates::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdminWindowsUpdates> executionException = new java.util.concurrent.CompletableFuture<AdminWindowsUpdates>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of adminWindowsUpdates
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdminWindowsUpdates> patch(@javax.annotation.Nonnull final AdminWindowsUpdates body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdminWindowsUpdates::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdminWindowsUpdates> executionException = new java.util.concurrent.CompletableFuture<AdminWindowsUpdates>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the resourceConnections property of the microsoft.graph.adminWindowsUpdates entity.
     * @param id Unique identifier of the item
     * @return a ResourceConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceConnectionItemRequestBuilder resourceConnections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceConnection%2Did", id);
        return new ResourceConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property updates for admin
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property updates for admin
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
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
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
     * Update the navigation property updates in admin
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AdminWindowsUpdates body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property updates in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AdminWindowsUpdates body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity.
     * @param id Unique identifier of the item
     * @return a UpdatableAssetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UpdatableAssetItemRequestBuilder updatableAssets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("updatableAsset%2Did", id);
        return new UpdatableAssetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the updatePolicies property of the microsoft.graph.adminWindowsUpdates entity.
     * @param id Unique identifier of the item
     * @return a UpdatePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UpdatePolicyItemRequestBuilder updatePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("updatePolicy%2Did", id);
        return new UpdatePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
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
