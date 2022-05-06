package microsoft.graph.devicemanagement.devicehealthscripts.areglobalscriptsavailable;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GlobalDeviceHealthScriptState;
/** Provides operations to call the areGlobalScriptsAvailable method.  */
public class AreGlobalScriptsAvailableRequestBuilder {
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Instantiates a new AreGlobalScriptsAvailableRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AreGlobalScriptsAvailableRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceHealthScripts/microsoft.graph.areGlobalScriptsAvailable()";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AreGlobalScriptsAvailableRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AreGlobalScriptsAvailableRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceHealthScripts/microsoft.graph.areGlobalScriptsAvailable()";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function areGlobalScriptsAvailable
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function areGlobalScriptsAvailable
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration requestConfig = new AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function areGlobalScriptsAvailable
     * @return a CompletableFuture of areGlobalScriptsAvailableResponse
     */
    public java.util.concurrent.CompletableFuture<AreGlobalScriptsAvailableResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AreGlobalScriptsAvailableResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function areGlobalScriptsAvailable
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of areGlobalScriptsAvailableResponse
     */
    public java.util.concurrent.CompletableFuture<AreGlobalScriptsAvailableResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AreGlobalScriptsAvailableResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function areGlobalScriptsAvailable
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of areGlobalScriptsAvailableResponse
     */
    public java.util.concurrent.CompletableFuture<AreGlobalScriptsAvailableResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AreGlobalScriptsAvailableResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new areGlobalScriptsAvailableRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public AreGlobalScriptsAvailableRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Union type wrapper for classes globalDeviceHealthScriptState  */
    public class AreGlobalScriptsAvailableResponse implements AdditionalDataHolder, Parsable {
        /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
        private Map<String, Object> _additionalData;
        /** Union type representation for type globalDeviceHealthScriptState  */
        private GlobalDeviceHealthScriptState _globalDeviceHealthScriptState;
        /**
         * Instantiates a new areGlobalScriptsAvailableResponse and sets the default values.
         * @return a void
         */
        public AreGlobalScriptsAvailableResponse() {
            this.setAdditionalData(new HashMap<>());
        }
        @javax.annotation.Nonnull
        public static AreGlobalScriptsAvailableResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            return new AreGlobalScriptsAvailableResponse();
        }
        /**
         * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
         * @return a Map<String, Object>
         */
        @javax.annotation.Nonnull
        public Map<String, Object> getAdditionalData() {
            return this._additionalData;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, Consumer<ParseNode>>
         */
        @javax.annotation.Nonnull
        public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
            final AreGlobalScriptsAvailableResponse currentObject = this;
            return new HashMap<>(1) {{
                this.put("globalDeviceHealthScriptState", (n) -> { currentObject.setGlobalDeviceHealthScriptState(n.getEnumValue(GlobalDeviceHealthScriptState.class)); });
            }};
        }
        /**
         * Gets the globalDeviceHealthScriptState property value. Union type representation for type globalDeviceHealthScriptState
         * @return a globalDeviceHealthScriptState
         */
        @javax.annotation.Nullable
        public GlobalDeviceHealthScriptState getGlobalDeviceHealthScriptState() {
            return this._globalDeviceHealthScriptState;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         * @return a void
         */
        public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            writer.writeEnumValue("globalDeviceHealthScriptState", this.getGlobalDeviceHealthScriptState());
            writer.writeAdditionalData(this.getAdditionalData());
        }
        /**
         * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
         * @param value Value to set for the AdditionalData property.
         * @return a void
         */
        public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
            this._additionalData = value;
        }
        /**
         * Sets the globalDeviceHealthScriptState property value. Union type representation for type globalDeviceHealthScriptState
         * @param value Value to set for the globalDeviceHealthScriptState property.
         * @return a void
         */
        public void setGlobalDeviceHealthScriptState(@javax.annotation.Nullable final GlobalDeviceHealthScriptState value) {
            this._globalDeviceHealthScriptState = value;
        }
    }
}
