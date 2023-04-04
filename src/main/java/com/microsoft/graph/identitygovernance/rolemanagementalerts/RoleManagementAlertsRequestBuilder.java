package com.microsoft.graph.identitygovernance.rolemanagementalerts;

import com.microsoft.graph.identitygovernance.rolemanagementalerts.alertconfigurations.AlertConfigurationsRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.alertconfigurations.item.UnifiedRoleManagementAlertConfigurationItemRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.alertdefinitions.AlertDefinitionsRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.alertdefinitions.item.UnifiedRoleManagementAlertDefinitionItemRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.alerts.AlertsRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.alerts.item.UnifiedRoleManagementAlertItemRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.operations.item.LongRunningOperationItemRequestBuilder;
import com.microsoft.graph.identitygovernance.rolemanagementalerts.operations.OperationsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RoleManagementAlert;
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
 * Provides operations to manage the roleManagementAlerts property of the microsoft.graph.identityGovernance entity.
 */
public class RoleManagementAlertsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the alertConfigurations property of the microsoft.graph.roleManagementAlert entity. */
    @javax.annotation.Nonnull
    public AlertConfigurationsRequestBuilder alertConfigurations() {
        return new AlertConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the alertDefinitions property of the microsoft.graph.roleManagementAlert entity. */
    @javax.annotation.Nonnull
    public AlertDefinitionsRequestBuilder alertDefinitions() {
        return new AlertDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the alerts property of the microsoft.graph.roleManagementAlert entity. */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.roleManagementAlert entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alertConfigurations property of the microsoft.graph.roleManagementAlert entity.
     * @param id Unique identifier of the item
     * @return a UnifiedRoleManagementAlertConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementAlertConfigurationItemRequestBuilder alertConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementAlertConfiguration%2Did", id);
        return new UnifiedRoleManagementAlertConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the alertDefinitions property of the microsoft.graph.roleManagementAlert entity.
     * @param id Unique identifier of the item
     * @return a UnifiedRoleManagementAlertDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementAlertDefinitionItemRequestBuilder alertDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementAlertDefinition%2Did", id);
        return new UnifiedRoleManagementAlertDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.roleManagementAlert entity.
     * @param id Unique identifier of the item
     * @return a UnifiedRoleManagementAlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementAlertItemRequestBuilder alerts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementAlert%2Did", id);
        return new UnifiedRoleManagementAlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RoleManagementAlertsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleManagementAlertsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/roleManagementAlerts{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RoleManagementAlertsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleManagementAlertsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/roleManagementAlerts{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property roleManagementAlerts for identityGovernance
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
     * Delete navigation property roleManagementAlerts for identityGovernance
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
     * Get roleManagementAlerts from identityGovernance
     * @return a CompletableFuture of roleManagementAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RoleManagementAlert> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RoleManagementAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RoleManagementAlert> executionException = new java.util.concurrent.CompletableFuture<RoleManagementAlert>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get roleManagementAlerts from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of roleManagementAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RoleManagementAlert> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RoleManagementAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RoleManagementAlert> executionException = new java.util.concurrent.CompletableFuture<RoleManagementAlert>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.roleManagementAlert entity.
     * @param id Unique identifier of the item
     * @return a LongRunningOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LongRunningOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("longRunningOperation%2Did", id);
        return new LongRunningOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property roleManagementAlerts in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of roleManagementAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RoleManagementAlert> patch(@javax.annotation.Nonnull final RoleManagementAlert body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RoleManagementAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RoleManagementAlert> executionException = new java.util.concurrent.CompletableFuture<RoleManagementAlert>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property roleManagementAlerts in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of roleManagementAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RoleManagementAlert> patch(@javax.annotation.Nonnull final RoleManagementAlert body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, RoleManagementAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<RoleManagementAlert> executionException = new java.util.concurrent.CompletableFuture<RoleManagementAlert>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property roleManagementAlerts for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property roleManagementAlerts for identityGovernance
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
     * Get roleManagementAlerts from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get roleManagementAlerts from identityGovernance
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
     * Update the navigation property roleManagementAlerts in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final RoleManagementAlert body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property roleManagementAlerts in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final RoleManagementAlert body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get roleManagementAlerts from identityGovernance
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
