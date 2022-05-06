package microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings;

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
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.approveapps.ApproveAppsRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.completesignup.CompleteSignupRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.creategoogleplaywebtoken.CreateGooglePlayWebTokenRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.requestsignupurl.RequestSignupUrlRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.setandroiddeviceownerfullymanagedenrollmentstate.SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.syncapps.SyncAppsRequestBuilder;
import microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.unbind.UnbindRequestBuilder;
import microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettings;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the androidManagedStoreAccountEnterpriseSettings property of the microsoft.graph.deviceManagement entity.  */
public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder {
    /** The approveApps property  */
    @javax.annotation.Nonnull
    public ApproveAppsRequestBuilder approveApps() {
        return new ApproveAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The completeSignup property  */
    @javax.annotation.Nonnull
    public CompleteSignupRequestBuilder completeSignup() {
        return new CompleteSignupRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createGooglePlayWebToken property  */
    @javax.annotation.Nonnull
    public CreateGooglePlayWebTokenRequestBuilder createGooglePlayWebToken() {
        return new CreateGooglePlayWebTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The requestSignupUrl property  */
    @javax.annotation.Nonnull
    public RequestSignupUrlRequestBuilder requestSignupUrl() {
        return new RequestSignupUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setAndroidDeviceOwnerFullyManagedEnrollmentState property  */
    @javax.annotation.Nonnull
    public SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder setAndroidDeviceOwnerFullyManagedEnrollmentState() {
        return new SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The syncApps property  */
    @javax.annotation.Nonnull
    public SyncAppsRequestBuilder syncApps() {
        return new SyncAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unbind property  */
    @javax.annotation.Nonnull
    public UnbindRequestBuilder unbind() {
        return new UnbindRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Instantiates a new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/androidManagedStoreAccountEnterpriseSettings{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/androidManagedStoreAccountEnterpriseSettings{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration requestConfig = new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration requestConfig = new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body, @javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration requestConfig = new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @return a CompletableFuture of androidManagedStoreAccountEnterpriseSettings
     */
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAccountEnterpriseSettings> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of androidManagedStoreAccountEnterpriseSettings
     */
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAccountEnterpriseSettings> get(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of androidManagedStoreAccountEnterpriseSettings
     */
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAccountEnterpriseSettings> get(@javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body, @javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body, @javax.annotation.Nullable final java.util.function.Consumer<AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new androidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The singleton Android managed store account enterprise settings entity.  */
    public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetQueryParameters queryParameters = new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new androidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new androidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
