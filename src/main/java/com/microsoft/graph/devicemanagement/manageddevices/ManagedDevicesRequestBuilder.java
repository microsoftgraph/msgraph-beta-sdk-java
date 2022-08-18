package microsoft.graph.devicemanagement.manageddevices;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.devicemanagement.manageddevices.appdiagnosticswithupn.AppDiagnosticsWithUpnRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.bulkreprovisioncloudpc.BulkReprovisionCloudPcRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.bulkrestorecloudpc.BulkRestoreCloudPcRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.bulksetcloudpcreviewstatus.BulkSetCloudPcReviewStatusRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.count.CountRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.downloadappdiagnostics.DownloadAppDiagnosticsRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.executeaction.ExecuteActionRequestBuilder;
import microsoft.graph.devicemanagement.manageddevices.movedevicestoou.MoveDevicesToOURequestBuilder;
import microsoft.graph.models.ManagedDevice;
import microsoft.graph.models.ManagedDeviceCollectionResponse;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity. */
public class ManagedDevicesRequestBuilder {
    /** The bulkReprovisionCloudPc property */
    @javax.annotation.Nonnull
    public BulkReprovisionCloudPcRequestBuilder bulkReprovisionCloudPc() {
        return new BulkReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The bulkRestoreCloudPc property */
    @javax.annotation.Nonnull
    public BulkRestoreCloudPcRequestBuilder bulkRestoreCloudPc() {
        return new BulkRestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The bulkSetCloudPcReviewStatus property */
    @javax.annotation.Nonnull
    public BulkSetCloudPcReviewStatusRequestBuilder bulkSetCloudPcReviewStatus() {
        return new BulkSetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** The Count property */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The downloadAppDiagnostics property */
    @javax.annotation.Nonnull
    public DownloadAppDiagnosticsRequestBuilder downloadAppDiagnostics() {
        return new DownloadAppDiagnosticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The executeAction property */
    @javax.annotation.Nonnull
    public ExecuteActionRequestBuilder executeAction() {
        return new ExecuteActionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The moveDevicesToOU property */
    @javax.annotation.Nonnull
    public MoveDevicesToOURequestBuilder moveDevicesToOU() {
        return new MoveDevicesToOURequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Provides operations to call the appDiagnostics method.
     * @param upn Usage: upn='{upn}'
     * @return a appDiagnosticsWithUpnRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppDiagnosticsWithUpnRequestBuilder appDiagnosticsWithUpn(@javax.annotation.Nonnull final String upn) {
        Objects.requireNonNull(upn);
        return new AppDiagnosticsWithUpnRequestBuilder(pathParameters, requestAdapter, upn);
    }
    /**
     * Instantiates a new ManagedDevicesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ManagedDevicesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/managedDevices{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedDevicesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ManagedDevicesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/managedDevices{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * The list of managed devices.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The list of managed devices.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ManagedDevicesRequestBuilderGetRequestConfiguration requestConfig = new ManagedDevicesRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to managedDevices for deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ManagedDevice body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to managedDevices for deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ManagedDevicesRequestBuilderPostRequestConfiguration requestConfig = new ManagedDevicesRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The list of managed devices.
     * @return a CompletableFuture of ManagedDeviceCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<ManagedDeviceCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The list of managed devices.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagedDeviceCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<ManagedDeviceCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The list of managed devices.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of ManagedDeviceCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<ManagedDeviceCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceCollectionResponse::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to managedDevices for deviceManagement
     * @param body 
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> post(@javax.annotation.Nonnull final ManagedDevice body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to managedDevices for deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> post(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to managedDevices for deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> post(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDevicesRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** The list of managed devices. */
    public class ManagedDevicesRequestBuilderGetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDevicesRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedDevicesRequestBuilderGetQueryParameters queryParameters = new ManagedDevicesRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new managedDevicesRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDevicesRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDevicesRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new managedDevicesRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDevicesRequestBuilderPostRequestConfiguration() {
        }
    }
}
