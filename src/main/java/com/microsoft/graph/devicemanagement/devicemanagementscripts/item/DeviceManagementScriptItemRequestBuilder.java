package com.microsoft.graph.devicemanagement.devicemanagementscripts.item;

import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.assignments.item.DeviceManagementScriptAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.devicerunstates.DeviceRunStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.devicerunstates.item.DeviceManagementScriptDeviceStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.groupassignments.GroupAssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.groupassignments.item.DeviceManagementScriptGroupAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.runsummary.RunSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.userrunstates.item.DeviceManagementScriptUserStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementscripts.item.userrunstates.UserRunStatesRequestBuilder;
import com.microsoft.graph.models.DeviceManagementScript;
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
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the deviceManagementScripts property of the microsoft.graph.deviceManagement entity.
 */
public class DeviceManagementScriptItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the assign method. */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.deviceManagementScript entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceRunStates property of the microsoft.graph.deviceManagementScript entity. */
    @javax.annotation.Nonnull
    public DeviceRunStatesRequestBuilder deviceRunStates() {
        return new DeviceRunStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the groupAssignments property of the microsoft.graph.deviceManagementScript entity. */
    @javax.annotation.Nonnull
    public GroupAssignmentsRequestBuilder groupAssignments() {
        return new GroupAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the runSummary property of the microsoft.graph.deviceManagementScript entity. */
    @javax.annotation.Nonnull
    public RunSummaryRequestBuilder runSummary() {
        return new RunSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userRunStates property of the microsoft.graph.deviceManagementScript entity. */
    @javax.annotation.Nonnull
    public UserRunStatesRequestBuilder userRunStates() {
        return new UserRunStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceManagementScript entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementScriptAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementScriptAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementScriptAssignment%2Did", id);
        return new DeviceManagementScriptAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceManagementScriptItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementScriptItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceManagementScripts/{deviceManagementScript%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceManagementScriptItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementScriptItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceManagementScripts/{deviceManagementScript%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property deviceManagementScripts for deviceManagement
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
     * Delete navigation property deviceManagementScripts for deviceManagement
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
     * Provides operations to manage the deviceRunStates property of the microsoft.graph.deviceManagementScript entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementScriptDeviceStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementScriptDeviceStateItemRequestBuilder deviceRunStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementScriptDeviceState%2Did", id);
        return new DeviceManagementScriptDeviceStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The list of device management scripts associated with the tenant.
     * @return a CompletableFuture of deviceManagementScript
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScript> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementScript::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementScript> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementScript>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The list of device management scripts associated with the tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementScript
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScript> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementScript::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementScript> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementScript>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the groupAssignments property of the microsoft.graph.deviceManagementScript entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementScriptGroupAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementScriptGroupAssignmentItemRequestBuilder groupAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementScriptGroupAssignment%2Did", id);
        return new DeviceManagementScriptGroupAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property deviceManagementScripts in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceManagementScript
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScript> patch(@javax.annotation.Nonnull final DeviceManagementScript body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementScript::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementScript> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementScript>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property deviceManagementScripts in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementScript
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScript> patch(@javax.annotation.Nonnull final DeviceManagementScript body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementScript::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagementScript> executionException = new java.util.concurrent.CompletableFuture<DeviceManagementScript>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property deviceManagementScripts for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property deviceManagementScripts for deviceManagement
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
     * The list of device management scripts associated with the tenant.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The list of device management scripts associated with the tenant.
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
     * Update the navigation property deviceManagementScripts in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementScript body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property deviceManagementScripts in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementScript body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the userRunStates property of the microsoft.graph.deviceManagementScript entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementScriptUserStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementScriptUserStateItemRequestBuilder userRunStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementScriptUserState%2Did", id);
        return new DeviceManagementScriptUserStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The list of device management scripts associated with the tenant.
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
