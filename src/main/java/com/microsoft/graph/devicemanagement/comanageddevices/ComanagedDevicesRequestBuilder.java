package com.microsoft.graph.devicemanagement.comanageddevices;

import com.microsoft.graph.devicemanagement.comanageddevices.appdiagnosticswithupn.AppDiagnosticsWithUpnRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.bulkreprovisioncloudpc.BulkReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.bulkrestorecloudpc.BulkRestoreCloudPcRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.bulksetcloudpcreviewstatus.BulkSetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.downloadappdiagnostics.DownloadAppDiagnosticsRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.executeaction.ExecuteActionRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.item.ManagedDeviceItemRequestBuilder;
import com.microsoft.graph.devicemanagement.comanageddevices.movedevicestoou.MoveDevicesToOURequestBuilder;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ManagedDeviceCollectionResponse;
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
 * Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComanagedDevicesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the bulkReprovisionCloudPc method.
     */
    @jakarta.annotation.Nonnull
    public BulkReprovisionCloudPcRequestBuilder bulkReprovisionCloudPc() {
        return new BulkReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bulkRestoreCloudPc method.
     */
    @jakarta.annotation.Nonnull
    public BulkRestoreCloudPcRequestBuilder bulkRestoreCloudPc() {
        return new BulkRestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bulkSetCloudPcReviewStatus method.
     */
    @jakarta.annotation.Nonnull
    public BulkSetCloudPcReviewStatusRequestBuilder bulkSetCloudPcReviewStatus() {
        return new BulkSetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the downloadAppDiagnostics method.
     */
    @jakarta.annotation.Nonnull
    public DownloadAppDiagnosticsRequestBuilder downloadAppDiagnostics() {
        return new DownloadAppDiagnosticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the executeAction method.
     */
    @jakarta.annotation.Nonnull
    public ExecuteActionRequestBuilder executeAction() {
        return new ExecuteActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the moveDevicesToOU method.
     */
    @jakarta.annotation.Nonnull
    public MoveDevicesToOURequestBuilder moveDevicesToOU() {
        return new MoveDevicesToOURequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the appDiagnostics method.
     * @param upn Usage: upn='{upn}'
     * @return a AppDiagnosticsWithUpnRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AppDiagnosticsWithUpnRequestBuilder appDiagnosticsWithUpn(@jakarta.annotation.Nonnull final String upn) {
        Objects.requireNonNull(upn);
        return new AppDiagnosticsWithUpnRequestBuilder(pathParameters, requestAdapter, upn);
    }
    /**
     * Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity.
     * @param managedDeviceId The unique identifier of managedDevice
     * @return a ManagedDeviceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder byManagedDeviceId(@jakarta.annotation.Nonnull final String managedDeviceId) {
        Objects.requireNonNull(managedDeviceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", managedDeviceId);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ComanagedDevicesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComanagedDevicesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ComanagedDevicesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComanagedDevicesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The list of co-managed devices report
     * @return a CompletableFuture of ManagedDeviceCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceCollectionResponse> get() {
        return get(null);
    }
    /**
     * The list of co-managed devices report
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagedDeviceCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @return a CompletableFuture of ManagedDevice
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> post(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagedDevice
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> post(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * The list of co-managed devices report
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of co-managed devices report
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
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to comanagedDevices for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ComanagedDevicesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ComanagedDevicesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ComanagedDevicesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The list of co-managed devices report
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
