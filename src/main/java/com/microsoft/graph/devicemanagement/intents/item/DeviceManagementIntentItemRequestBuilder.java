package com.microsoft.graph.devicemanagement.intents.item;

import com.microsoft.graph.devicemanagement.intents.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.categories.CategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.comparewithtemplateid.CompareWithTemplateIdRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.createcopy.CreateCopyRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicestates.DeviceStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.devicestatesummary.DeviceStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.getcustomizedsettings.GetCustomizedSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.migratetotemplate.MigrateToTemplateRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.updatesettings.UpdateSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.userstates.UserStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.intents.item.userstatesummary.UserStateSummaryRequestBuilder;
import com.microsoft.graph.models.DeviceManagementIntent;
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
 * Provides operations to manage the intents property of the microsoft.graph.deviceManagement entity.
 */
public class DeviceManagementIntentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createCopy method.
     */
    @jakarta.annotation.Nonnull
    public CreateCopyRequestBuilder createCopy() {
        return new CreateCopyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStates property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStatesRequestBuilder deviceStates() {
        return new DeviceStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStateSummary property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStateSummaryRequestBuilder deviceStateSummary() {
        return new DeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCustomizedSettings method.
     */
    @jakarta.annotation.Nonnull
    public GetCustomizedSettingsRequestBuilder getCustomizedSettings() {
        return new GetCustomizedSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the migrateToTemplate method.
     */
    @jakarta.annotation.Nonnull
    public MigrateToTemplateRequestBuilder migrateToTemplate() {
        return new MigrateToTemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateSettings method.
     */
    @jakarta.annotation.Nonnull
    public UpdateSettingsRequestBuilder updateSettings() {
        return new UpdateSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStates property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public UserStatesRequestBuilder userStates() {
        return new UserStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStateSummary property of the microsoft.graph.deviceManagementIntent entity.
     */
    @jakarta.annotation.Nonnull
    public UserStateSummaryRequestBuilder userStateSummary() {
        return new UserStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the compare method.
     * @param templateId Usage: templateId='{templateId}'
     * @return a compareWithTemplateIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CompareWithTemplateIdRequestBuilder compareWithTemplateId(@jakarta.annotation.Nonnull final String templateId) {
        Objects.requireNonNull(templateId);
        return new CompareWithTemplateIdRequestBuilder(pathParameters, requestAdapter, templateId);
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementIntentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementIntentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @return a CompletableFuture of void
     */
    @jakarta.annotation.Nonnull
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
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * The device management intents
     * @return a CompletableFuture of deviceManagementIntent
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementIntent> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementIntent>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementIntent
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementIntent> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementIntent>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceManagementIntent
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> patch(@jakarta.annotation.Nonnull final DeviceManagementIntent body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementIntent> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementIntent>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementIntent
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> patch(@jakarta.annotation.Nonnull final DeviceManagementIntent body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementIntent> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementIntent>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * The device management intents
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the navigation property intents in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementIntent body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementIntent body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * The device management intents
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
