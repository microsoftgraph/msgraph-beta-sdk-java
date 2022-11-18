package com.microsoft.graph.devicemanagement.deponboardingsettings.item;

import com.microsoft.graph.devicemanagement.deponboardingsettings.item.defaultiosenrollmentprofile.DefaultIosEnrollmentProfileRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.defaultmacosenrollmentprofile.DefaultMacOsEnrollmentProfileRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.enrollmentprofiles.EnrollmentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.enrollmentprofiles.item.EnrollmentProfileItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.generateencryptionpublickey.GenerateEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.getencryptionpublickey.GetEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.ImportedAppleDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.item.ImportedAppleDeviceIdentityItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.shareforschooldatasyncservice.ShareForSchoolDataSyncServiceRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.syncwithappledeviceenrollmentprogram.SyncWithAppleDeviceEnrollmentProgramRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.unshareforschooldatasyncservice.UnshareForSchoolDataSyncServiceRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.uploaddeptoken.UploadDepTokenRequestBuilder;
import com.microsoft.graph.models.DepOnboardingSetting;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the depOnboardingSettings property of the microsoft.graph.deviceManagement entity. */
public class DepOnboardingSettingItemRequestBuilder {
    /** Provides operations to manage the defaultIosEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity. */
    @javax.annotation.Nonnull
    public DefaultIosEnrollmentProfileRequestBuilder defaultIosEnrollmentProfile() {
        return new DefaultIosEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the defaultMacOsEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity. */
    @javax.annotation.Nonnull
    public DefaultMacOsEnrollmentProfileRequestBuilder defaultMacOsEnrollmentProfile() {
        return new DefaultMacOsEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the enrollmentProfiles property of the microsoft.graph.depOnboardingSetting entity. */
    @javax.annotation.Nonnull
    public EnrollmentProfilesRequestBuilder enrollmentProfiles() {
        return new EnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the generateEncryptionPublicKey method. */
    @javax.annotation.Nonnull
    public GenerateEncryptionPublicKeyRequestBuilder generateEncryptionPublicKey() {
        return new GenerateEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the importedAppleDeviceIdentities property of the microsoft.graph.depOnboardingSetting entity. */
    @javax.annotation.Nonnull
    public ImportedAppleDeviceIdentitiesRequestBuilder importedAppleDeviceIdentities() {
        return new ImportedAppleDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the shareForSchoolDataSyncService method. */
    @javax.annotation.Nonnull
    public ShareForSchoolDataSyncServiceRequestBuilder shareForSchoolDataSyncService() {
        return new ShareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the syncWithAppleDeviceEnrollmentProgram method. */
    @javax.annotation.Nonnull
    public SyncWithAppleDeviceEnrollmentProgramRequestBuilder syncWithAppleDeviceEnrollmentProgram() {
        return new SyncWithAppleDeviceEnrollmentProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unshareForSchoolDataSyncService method. */
    @javax.annotation.Nonnull
    public UnshareForSchoolDataSyncServiceRequestBuilder unshareForSchoolDataSyncService() {
        return new UnshareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the uploadDepToken method. */
    @javax.annotation.Nonnull
    public UploadDepTokenRequestBuilder uploadDepToken() {
        return new UploadDepTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the enrollmentProfiles property of the microsoft.graph.depOnboardingSetting entity.
     * @param id Unique identifier of the item
     * @return a EnrollmentProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EnrollmentProfileItemRequestBuilder enrollmentProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("enrollmentProfile%2Did", id);
        return new EnrollmentProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DepOnboardingSetting>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DepOnboardingSetting>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getEncryptionPublicKey method.
     * @return a getEncryptionPublicKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder getEncryptionPublicKey() {
        return new GetEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the importedAppleDeviceIdentities property of the microsoft.graph.depOnboardingSetting entity.
     * @param id Unique identifier of the item
     * @return a ImportedAppleDeviceIdentityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ImportedAppleDeviceIdentityItemRequestBuilder importedAppleDeviceIdentities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("importedAppleDeviceIdentity%2Did", id);
        return new ImportedAppleDeviceIdentityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@javax.annotation.Nonnull final DepOnboardingSetting body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DepOnboardingSetting>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DepOnboardingSetting>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** This collections of multiple DEP tokens per-tenant. */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
