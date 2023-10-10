package com.microsoft.graph.devicemanagement.manageddevices.item.devicehealthscriptstates.withidwithpolicyidwithdeviceid;

import com.microsoft.graph.models.DeviceHealthScriptPolicyState;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the deviceHealthScriptStates property of the microsoft.graph.managedDevice entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdWithPolicyIdWithDeviceIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithIdWithPolicyIdWithDeviceIdRequestBuilder and sets the default values.
     * @param deviceId Property in multi-part unique identifier of deviceHealthScriptPolicyState
     * @param id Property in multi-part unique identifier of deviceHealthScriptPolicyState
     * @param pathParameters Path parameters for the request
     * @param policyId Property in multi-part unique identifier of deviceHealthScriptPolicyState
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdWithPolicyIdWithDeviceIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String deviceId, @jakarta.annotation.Nullable final String id, @jakarta.annotation.Nullable final String policyId) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/deviceHealthScriptStates/id='{id}',policyId='{policyId}',deviceId='{deviceId}'{?%24select,%24expand}", pathParameters);
        this.pathParameters.put("deviceId", deviceId);
        this.pathParameters.put("id", id);
        this.pathParameters.put("policyId", policyId);
    }
    /**
     * Instantiates a new WithIdWithPolicyIdWithDeviceIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdWithPolicyIdWithDeviceIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}/deviceHealthScriptStates/id='{id}',policyId='{policyId}',deviceId='{deviceId}'{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property deviceHealthScriptStates for deviceManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property deviceHealthScriptStates for deviceManagement
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
     * Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @return a CompletableFuture of DeviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceHealthScriptPolicyState> get() {
        return get(null);
    }
    /**
     * Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceHealthScriptPolicyState> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceHealthScriptPolicyState::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property deviceHealthScriptStates in deviceManagement
     * @param body Contains properties for policy run state of the device health script.
     * @return a CompletableFuture of DeviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceHealthScriptPolicyState> patch(@jakarta.annotation.Nonnull final DeviceHealthScriptPolicyState body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property deviceHealthScriptStates in deviceManagement
     * @param body Contains properties for policy run state of the device health script.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceHealthScriptPolicyState
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceHealthScriptPolicyState> patch(@jakarta.annotation.Nonnull final DeviceHealthScriptPolicyState body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceHealthScriptPolicyState::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property deviceHealthScriptStates for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property deviceHealthScriptStates for deviceManagement
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
     * Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
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
     * Update the navigation property deviceHealthScriptStates in deviceManagement
     * @param body Contains properties for policy run state of the device health script.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceHealthScriptPolicyState body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property deviceHealthScriptStates in deviceManagement
     * @param body Contains properties for policy run state of the device health script.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceHealthScriptPolicyState body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a WithIdWithPolicyIdWithDeviceIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdWithPolicyIdWithDeviceIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithIdWithPolicyIdWithDeviceIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
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
