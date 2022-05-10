package microsoft.graph.users.item.manageddevices.bulkrestorecloudpc;

import com.microsoft.kiota.HttpMethod;
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
import microsoft.graph.models.CloudPcBulkRemoteActionResult;
/** Provides operations to call the bulkRestoreCloudPc method. */
public class BulkRestoreCloudPcRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new BulkRestoreCloudPcRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public BulkRestoreCloudPcRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/managedDevices/microsoft.graph.bulkRestoreCloudPc";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new BulkRestoreCloudPcRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public BulkRestoreCloudPcRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/managedDevices/microsoft.graph.bulkRestoreCloudPc";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke action bulkRestoreCloudPc
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final BulkRestoreCloudPcRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Invoke action bulkRestoreCloudPc
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final BulkRestoreCloudPcRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<BulkRestoreCloudPcRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final BulkRestoreCloudPcRequestBuilderPostRequestConfiguration requestConfig = new BulkRestoreCloudPcRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke action bulkRestoreCloudPc
     * @param body 
     * @return a CompletableFuture of cloudPcBulkRemoteActionResult
     */
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@javax.annotation.Nonnull final BulkRestoreCloudPcRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action bulkRestoreCloudPc
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPcBulkRemoteActionResult
     */
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@javax.annotation.Nonnull final BulkRestoreCloudPcRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<BulkRestoreCloudPcRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action bulkRestoreCloudPc
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of cloudPcBulkRemoteActionResult
     */
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> post(@javax.annotation.Nonnull final BulkRestoreCloudPcRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<BulkRestoreCloudPcRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcBulkRemoteActionResult::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class BulkRestoreCloudPcRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new bulkRestoreCloudPcRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public BulkRestoreCloudPcRequestBuilderPostRequestConfiguration() {
        }
    }
}
