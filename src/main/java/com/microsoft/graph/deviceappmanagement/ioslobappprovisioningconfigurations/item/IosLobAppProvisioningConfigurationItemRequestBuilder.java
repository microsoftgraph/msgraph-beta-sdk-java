package com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item;

import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.assignments.item.IosLobAppProvisioningConfigurationAssignmentItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.devicestatuses.item.ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.groupassignments.GroupAssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.groupassignments.item.MobileAppProvisioningConfigGroupAssignmentItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.userstatuses.item.ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.models.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.odataerrors.ODataError;
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
/** Provides operations to manage the iosLobAppProvisioningConfigurations property of the microsoft.graph.deviceAppManagement entity. */
public class IosLobAppProvisioningConfigurationItemRequestBuilder {
    /** The assign property */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignments property */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceStatuses property */
    @javax.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The groupAssignments property */
    @javax.annotation.Nonnull
    public GroupAssignmentsRequestBuilder groupAssignments() {
        return new GroupAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** The userStatuses property */
    @javax.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceAppManagement.iosLobAppProvisioningConfigurations.item.assignments.item collection
     * @param id Unique identifier of the item
     * @return a IosLobAppProvisioningConfigurationAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IosLobAppProvisioningConfigurationAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("iosLobAppProvisioningConfigurationAssignment%2Did", id);
        return new IosLobAppProvisioningConfigurationAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IosLobAppProvisioningConfigurationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosLobAppProvisioningConfigurationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfiguration%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new IosLobAppProvisioningConfigurationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosLobAppProvisioningConfigurationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfiguration%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration requestConfig = new IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The IOS Lob App Provisioning Configurations.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The IOS Lob App Provisioning Configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration requestConfig = new IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final IosLobAppProvisioningConfiguration body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final IosLobAppProvisioningConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration requestConfig = new IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
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
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Gets an item from the com.Microsoft.Graph.deviceAppManagement.iosLobAppProvisioningConfigurations.item.deviceStatuses.item collection
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder deviceStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationDeviceStatus%2Did", id);
        return new ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The IOS Lob App Provisioning Configurations.
     * @return a CompletableFuture of iosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The IOS Lob App Provisioning Configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of iosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration> get(@javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceAppManagement.iosLobAppProvisioningConfigurations.item.groupAssignments.item collection
     * @param id Unique identifier of the item
     * @return a MobileAppProvisioningConfigGroupAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppProvisioningConfigGroupAssignmentItemRequestBuilder groupAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileAppProvisioningConfigGroupAssignment%2Did", id);
        return new MobileAppProvisioningConfigGroupAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body 
     * @return a CompletableFuture of iosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration> patch(@javax.annotation.Nonnull final IosLobAppProvisioningConfiguration body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of iosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration> patch(@javax.annotation.Nonnull final IosLobAppProvisioningConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceAppManagement.iosLobAppProvisioningConfigurations.item.userStatuses.item collection
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder userStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationUserStatus%2Did", id);
        return new ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public IosLobAppProvisioningConfigurationItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The IOS Lob App Provisioning Configurations. */
    public class IosLobAppProvisioningConfigurationItemRequestBuilderGetQueryParameters {
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
    public class IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public IosLobAppProvisioningConfigurationItemRequestBuilderGetQueryParameters queryParameters = new IosLobAppProvisioningConfigurationItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public IosLobAppProvisioningConfigurationItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public IosLobAppProvisioningConfigurationItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
