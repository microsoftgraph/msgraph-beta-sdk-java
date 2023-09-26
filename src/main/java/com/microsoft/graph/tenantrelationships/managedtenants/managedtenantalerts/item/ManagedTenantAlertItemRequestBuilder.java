package com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item;

import com.microsoft.graph.models.managedtenants.ManagedTenantAlert;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.alertlogs.AlertLogsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.alertrule.AlertRuleRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.apinotifications.ApiNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.emailnotifications.EmailNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.microsoftgraphmanagedtenantsadduserinputlog.MicrosoftGraphManagedTenantsAddUserInputLogRequestBuilder;
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
 * Provides operations to manage the managedTenantAlerts property of the microsoft.graph.managedTenants.managedTenant entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenantAlertItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the alertLogs property of the microsoft.graph.managedTenants.managedTenantAlert entity.
     */
    @jakarta.annotation.Nonnull
    public AlertLogsRequestBuilder alertLogs() {
        return new AlertLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alertRule property of the microsoft.graph.managedTenants.managedTenantAlert entity.
     */
    @jakarta.annotation.Nonnull
    public AlertRuleRequestBuilder alertRule() {
        return new AlertRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the apiNotifications property of the microsoft.graph.managedTenants.managedTenantAlert entity.
     */
    @jakarta.annotation.Nonnull
    public ApiNotificationsRequestBuilder apiNotifications() {
        return new ApiNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the emailNotifications property of the microsoft.graph.managedTenants.managedTenantAlert entity.
     */
    @jakarta.annotation.Nonnull
    public EmailNotificationsRequestBuilder emailNotifications() {
        return new EmailNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addUserInputLog method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphManagedTenantsAddUserInputLogRequestBuilder microsoftGraphManagedTenantsAddUserInputLog() {
        return new MicrosoftGraphManagedTenantsAddUserInputLogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ManagedTenantAlertItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedTenantAlertItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managedTenantAlerts/{managedTenantAlert%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ManagedTenantAlertItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedTenantAlertItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managedTenantAlerts/{managedTenantAlert%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
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
     * Get managedTenantAlerts from tenantRelationships
     * @return a CompletableFuture of ManagedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> get() {
        return get(null);
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body The request body
     * @return a CompletableFuture of ManagedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> patch(@jakarta.annotation.Nonnull final ManagedTenantAlert body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagedTenantAlert
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> patch(@jakarta.annotation.Nonnull final ManagedTenantAlert body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * Get managedTenantAlerts from tenantRelationships
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedTenantAlert body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedTenantAlert body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ManagedTenantAlertItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedTenantAlertItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedTenantAlertItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
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
