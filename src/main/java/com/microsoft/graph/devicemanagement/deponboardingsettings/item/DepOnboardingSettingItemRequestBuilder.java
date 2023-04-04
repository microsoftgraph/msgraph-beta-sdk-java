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
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the depOnboardingSettings property of the microsoft.graph.deviceManagement entity.
 */
public class DepOnboardingSettingItemRequestBuilder extends BaseRequestBuilder {
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
    /** Provides operations to call the getEncryptionPublicKey method. */
    @javax.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder getEncryptionPublicKey() {
        return new GetEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the importedAppleDeviceIdentities property of the microsoft.graph.depOnboardingSetting entity. */
    @javax.annotation.Nonnull
    public ImportedAppleDeviceIdentitiesRequestBuilder importedAppleDeviceIdentities() {
        return new ImportedAppleDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
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
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
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
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DepOnboardingSetting> executionException = new java.util.concurrent.CompletableFuture<DepOnboardingSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
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
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DepOnboardingSetting> executionException = new java.util.concurrent.CompletableFuture<DepOnboardingSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
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
     * @param body The request body
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@javax.annotation.Nonnull final DepOnboardingSetting body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DepOnboardingSetting> executionException = new java.util.concurrent.CompletableFuture<DepOnboardingSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of depOnboardingSetting
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DepOnboardingSetting> executionException = new java.util.concurrent.CompletableFuture<DepOnboardingSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * This collections of multiple DEP tokens per-tenant.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     */
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
