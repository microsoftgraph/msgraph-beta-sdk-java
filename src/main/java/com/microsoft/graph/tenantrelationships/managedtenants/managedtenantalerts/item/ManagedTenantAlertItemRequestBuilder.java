package com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item;

import com.microsoft.graph.models.managedtenants.ManagedTenantAlert;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.adduserinputlog.AddUserInputLogRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.alertlogs.AlertLogsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.alertlogs.item.ManagedTenantAlertLogItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.alertrule.AlertRuleRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.apinotifications.ApiNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.apinotifications.item.ManagedTenantApiNotificationItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.emailnotifications.EmailNotificationsRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.managedtenantalerts.item.emailnotifications.item.ManagedTenantEmailNotificationItemRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the managedTenantAlerts property of the microsoft.graph.managedTenants.managedTenant entity. */
public class ManagedTenantAlertItemRequestBuilder {
    /** The addUserInputLog property */
    @javax.annotation.Nonnull
    public AddUserInputLogRequestBuilder addUserInputLog() {
        return new AddUserInputLogRequestBuilder(pathParameters, requestAdapter);
    }
    /** The alertLogs property */
    @javax.annotation.Nonnull
    public AlertLogsRequestBuilder alertLogs() {
        return new AlertLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The alertRule property */
    @javax.annotation.Nonnull
    public AlertRuleRequestBuilder alertRule() {
        return new AlertRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The apiNotifications property */
    @javax.annotation.Nonnull
    public ApiNotificationsRequestBuilder apiNotifications() {
        return new ApiNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The emailNotifications property */
    @javax.annotation.Nonnull
    public EmailNotificationsRequestBuilder emailNotifications() {
        return new EmailNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managedTenantAlerts.item.alertLogs.item collection
     * @param id Unique identifier of the item
     * @return a ManagedTenantAlertLogItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantAlertLogItemRequestBuilder alertLogs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantAlertLog%2Did", id);
        return new ManagedTenantAlertLogItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managedTenantAlerts.item.apiNotifications.item collection
     * @param id Unique identifier of the item
     * @return a ManagedTenantApiNotificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantApiNotificationItemRequestBuilder apiNotifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantApiNotification%2Did", id);
        return new ManagedTenantApiNotificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagedTenantAlertItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantAlertItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/tenantRelationships/managedTenants/managedTenantAlerts/{managedTenantAlert%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedTenantAlertItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantAlertItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/tenantRelationships/managedTenants/managedTenantAlerts/{managedTenantAlert%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration requestConfig = new ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ManagedTenantAlertItemRequestBuilderGetRequestConfiguration requestConfig = new ManagedTenantAlertItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedTenantAlert body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedTenantAlert body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration requestConfig = new ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property managedTenantAlerts for tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.tenantRelationships.managedTenants.managedTenantAlerts.item.emailNotifications.item collection
     * @param id Unique identifier of the item
     * @return a ManagedTenantEmailNotificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedTenantEmailNotificationItemRequestBuilder emailNotifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedTenantEmailNotification%2Did", id);
        return new ManagedTenantEmailNotificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @return a CompletableFuture of managedTenantAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenantAlert>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get managedTenantAlerts from tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenantAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenantAlert>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body 
     * @return a CompletableFuture of managedTenantAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> patch(@javax.annotation.Nonnull final ManagedTenantAlert body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenantAlert>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property managedTenantAlerts in tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedTenantAlert
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenantAlert> patch(@javax.annotation.Nonnull final ManagedTenantAlert body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedTenantAlert::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedTenantAlert>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantAlertItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get managedTenantAlerts from tenantRelationships */
    public class ManagedTenantAlertItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedTenantAlertItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedTenantAlertItemRequestBuilderGetQueryParameters queryParameters = new ManagedTenantAlertItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ManagedTenantAlertItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantAlertItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedTenantAlertItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
