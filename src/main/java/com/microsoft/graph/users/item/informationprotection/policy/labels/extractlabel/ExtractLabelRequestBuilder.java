package microsoft.graph.users.item.informationprotection.policy.labels.extractlabel;

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
import microsoft.graph.models.InformationProtectionContentLabel;
/** Provides operations to call the extractLabel method. */
public class ExtractLabelRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new ExtractLabelRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ExtractLabelRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels/microsoft.graph.extractLabel";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ExtractLabelRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ExtractLabelRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels/microsoft.graph.extractLabel";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke action extractLabel
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ExtractLabelPostRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Invoke action extractLabel
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ExtractLabelPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ExtractLabelRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ExtractLabelRequestBuilderPostRequestConfiguration requestConfig = new ExtractLabelRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke action extractLabel
     * @param body 
     * @return a CompletableFuture of InformationProtectionContentLabel
     */
    public java.util.concurrent.CompletableFuture<InformationProtectionContentLabel> post(@javax.annotation.Nonnull final ExtractLabelPostRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtectionContentLabel::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action extractLabel
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InformationProtectionContentLabel
     */
    public java.util.concurrent.CompletableFuture<InformationProtectionContentLabel> post(@javax.annotation.Nonnull final ExtractLabelPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ExtractLabelRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtectionContentLabel::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action extractLabel
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of InformationProtectionContentLabel
     */
    public java.util.concurrent.CompletableFuture<InformationProtectionContentLabel> post(@javax.annotation.Nonnull final ExtractLabelPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ExtractLabelRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, InformationProtectionContentLabel::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ExtractLabelRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new extractLabelRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public ExtractLabelRequestBuilderPostRequestConfiguration() {
        }
    }
}
