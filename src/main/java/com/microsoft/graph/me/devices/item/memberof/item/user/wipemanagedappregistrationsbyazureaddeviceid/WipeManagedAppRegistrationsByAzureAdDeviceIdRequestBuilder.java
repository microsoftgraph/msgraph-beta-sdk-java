package microsoft.graph.me.devices.item.memberof.item.user.wipemanagedappregistrationsbyazureaddeviceid;

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
/** Provides operations to call the wipeManagedAppRegistrationsByAzureAdDeviceId method. */
public class WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/devices/{device%2Did}/memberOf/{directoryObject%2Did}/microsoft.graph.user/microsoft.graph.wipeManagedAppRegistrationsByAzureAdDeviceId";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/devices/{device%2Did}/memberOf/{directoryObject%2Did}/microsoft.graph.user/microsoft.graph.wipeManagedAppRegistrationsByAzureAdDeviceId";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration requestConfig = new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new wipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilderPostRequestConfiguration() {
        }
    }
}
