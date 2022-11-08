package com.microsoft.graph.devicemanagement.intents.item;

import com.microsoft.graph.devicemanagement.intents.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.assignments.item.DeviceManagementIntentAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.categories.CategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.categories.item.DeviceManagementIntentSettingCategoryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.comparewithtemplateid.CompareWithTemplateIdRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.createcopy.CreateCopyRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicesettingstatesummaries.item.DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicestates.DeviceStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicestates.item.DeviceManagementIntentDeviceStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicestatesummary.DeviceStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.migratetotemplate.MigrateToTemplateRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.settings.item.DeviceManagementSettingInstanceItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.updatesettings.UpdateSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.userstates.item.DeviceManagementIntentUserStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.userstates.UserStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.userstatesummary.UserStateSummaryRequestBuilder;
import com.microsoft.graph.models.DeviceManagementIntent;
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
/** Provides operations to manage the intents property of the microsoft.graph.deviceManagement entity. */
public class DeviceManagementIntentItemRequestBuilder {
    /** Provides operations to call the assign method. */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the categories property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createCopy method. */
    @javax.annotation.Nonnull
    public CreateCopyRequestBuilder createCopy() {
        return new CreateCopyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStates property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public DeviceStatesRequestBuilder deviceStates() {
        return new DeviceStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStateSummary property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public DeviceStateSummaryRequestBuilder deviceStateSummary() {
        return new DeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the migrateToTemplate method. */
    @javax.annotation.Nonnull
    public MigrateToTemplateRequestBuilder migrateToTemplate() {
        return new MigrateToTemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the settings property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the updateSettings method. */
    @javax.annotation.Nonnull
    public UpdateSettingsRequestBuilder updateSettings() {
        return new UpdateSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userStates property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public UserStatesRequestBuilder userStates() {
        return new UserStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userStateSummary property of the microsoft.graph.deviceManagementIntent entity. */
    @javax.annotation.Nonnull
    public UserStateSummaryRequestBuilder userStateSummary() {
        return new UserStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementIntentAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentAssignment%2Did", id);
        return new DeviceManagementIntentAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementIntentSettingCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentSettingCategoryItemRequestBuilder categories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentSettingCategory%2Did", id);
        return new DeviceManagementIntentSettingCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the compare method.
     * @param templateId Usage: templateId='{templateId}'
     * @return a compareWithTemplateIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public CompareWithTemplateIdRequestBuilder compareWithTemplateId(@javax.annotation.Nonnull final String templateId) {
        Objects.requireNonNull(templateId);
        return new CompareWithTemplateIdRequestBuilder(pathParameters, requestAdapter, templateId);
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The device management intents
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderGetRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementIntent body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementIntent body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property intents for deviceManagement
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
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder deviceSettingStateSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentDeviceSettingStateSummary%2Did", id);
        return new DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStates property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementIntentDeviceStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentDeviceStateItemRequestBuilder deviceStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentDeviceState%2Did", id);
        return new DeviceManagementIntentDeviceStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The device management intents
     * @return a CompletableFuture of deviceManagementIntent
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceManagementIntent>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementIntent
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceManagementIntent>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @return a CompletableFuture of deviceManagementIntent
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> patch(@javax.annotation.Nonnull final DeviceManagementIntent body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceManagementIntent>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementIntent
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> patch(@javax.annotation.Nonnull final DeviceManagementIntent body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceManagementIntent>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementSettingInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementSettingInstanceItemRequestBuilder settings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementSettingInstance%2Did", id);
        return new DeviceManagementSettingInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the userStates property of the microsoft.graph.deviceManagementIntent entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementIntentUserStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentUserStateItemRequestBuilder userStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentUserState%2Did", id);
        return new DeviceManagementIntentUserStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The device management intents */
    public class DeviceManagementIntentItemRequestBuilderGetQueryParameters {
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
    public class DeviceManagementIntentItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceManagementIntentItemRequestBuilderGetQueryParameters queryParameters = new DeviceManagementIntentItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new DeviceManagementIntentItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceManagementIntentItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
