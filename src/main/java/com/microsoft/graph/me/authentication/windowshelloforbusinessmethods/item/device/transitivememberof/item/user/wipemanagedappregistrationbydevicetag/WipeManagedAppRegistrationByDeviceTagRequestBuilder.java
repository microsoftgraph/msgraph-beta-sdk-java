package microsoft.graph.me.authentication.windowshelloforbusinessmethods.item.device.transitivememberof.item.user.wipemanagedappregistrationbydevicetag;

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
/** Provides operations to call the wipeManagedAppRegistrationByDeviceTag method. */
public class WipeManagedAppRegistrationByDeviceTagRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new WipeManagedAppRegistrationByDeviceTagRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public WipeManagedAppRegistrationByDeviceTagRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/authentication/windowsHelloForBusinessMethods/{windowsHelloForBusinessAuthenticationMethod%2Did}/device/transitiveMemberOf/{directoryObject%2Did}/microsoft.graph.user/microsoft.graph.wipeManagedAppRegistrationByDeviceTag";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WipeManagedAppRegistrationByDeviceTagRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public WipeManagedAppRegistrationByDeviceTagRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/authentication/windowsHelloForBusinessMethods/{windowsHelloForBusinessAuthenticationMethod%2Did}/device/transitiveMemberOf/{directoryObject%2Did}/microsoft.graph.user/microsoft.graph.wipeManagedAppRegistrationByDeviceTag";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Issues a wipe operation on an app registration with specified device tag.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final WipeManagedAppRegistrationByDeviceTagPostRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Issues a wipe operation on an app registration with specified device tag.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final WipeManagedAppRegistrationByDeviceTagPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration requestConfig = new WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Issues a wipe operation on an app registration with specified device tag.
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationByDeviceTagPostRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Issues a wipe operation on an app registration with specified device tag.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationByDeviceTagPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Issues a wipe operation on an app registration with specified device tag.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> post(@javax.annotation.Nonnull final WipeManagedAppRegistrationByDeviceTagPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new wipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public WipeManagedAppRegistrationByDeviceTagRequestBuilderPostRequestConfiguration() {
        }
    }
}
