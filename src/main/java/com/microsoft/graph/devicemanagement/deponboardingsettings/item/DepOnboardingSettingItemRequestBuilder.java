package com.microsoft.graph.devicemanagement.deponboardingsettings.item;

import com.microsoft.graph.devicemanagement.deponboardingsettings.item.defaultiosenrollmentprofile.DefaultIosEnrollmentProfileRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.defaultmacosenrollmentprofile.DefaultMacOsEnrollmentProfileRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.enrollmentprofiles.EnrollmentProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.generateencryptionpublickey.GenerateEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.getencryptionpublickey.GetEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.ImportedAppleDeviceIdentitiesRequestBuilder;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the depOnboardingSettings property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepOnboardingSettingItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the defaultIosEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity.
     */
    @jakarta.annotation.Nonnull
    public DefaultIosEnrollmentProfileRequestBuilder defaultIosEnrollmentProfile() {
        return new DefaultIosEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultMacOsEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity.
     */
    @jakarta.annotation.Nonnull
    public DefaultMacOsEnrollmentProfileRequestBuilder defaultMacOsEnrollmentProfile() {
        return new DefaultMacOsEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the enrollmentProfiles property of the microsoft.graph.depOnboardingSetting entity.
     */
    @jakarta.annotation.Nonnull
    public EnrollmentProfilesRequestBuilder enrollmentProfiles() {
        return new EnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the generateEncryptionPublicKey method.
     */
    @jakarta.annotation.Nonnull
    public GenerateEncryptionPublicKeyRequestBuilder generateEncryptionPublicKey() {
        return new GenerateEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEncryptionPublicKey method.
     */
    @jakarta.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder getEncryptionPublicKey() {
        return new GetEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the importedAppleDeviceIdentities property of the microsoft.graph.depOnboardingSetting entity.
     */
    @jakarta.annotation.Nonnull
    public ImportedAppleDeviceIdentitiesRequestBuilder importedAppleDeviceIdentities() {
        return new ImportedAppleDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the shareForSchoolDataSyncService method.
     */
    @jakarta.annotation.Nonnull
    public ShareForSchoolDataSyncServiceRequestBuilder shareForSchoolDataSyncService() {
        return new ShareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncWithAppleDeviceEnrollmentProgram method.
     */
    @jakarta.annotation.Nonnull
    public SyncWithAppleDeviceEnrollmentProgramRequestBuilder syncWithAppleDeviceEnrollmentProgram() {
        return new SyncWithAppleDeviceEnrollmentProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unshareForSchoolDataSyncService method.
     */
    @jakarta.annotation.Nonnull
    public UnshareForSchoolDataSyncServiceRequestBuilder unshareForSchoolDataSyncService() {
        return new UnshareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the uploadDepToken method.
     */
    @jakarta.annotation.Nonnull
    public UploadDepTokenRequestBuilder uploadDepToken() {
        return new UploadDepTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DepOnboardingSettingItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DepOnboardingSettingItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a CompletableFuture of DepOnboardingSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get() {
        return get(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DepOnboardingSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of DepOnboardingSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@jakarta.annotation.Nonnull final DepOnboardingSetting body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DepOnboardingSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> patch(@jakarta.annotation.Nonnull final DepOnboardingSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json, application/json");
        return requestInfo;
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DepOnboardingSetting body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DepOnboardingSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DepOnboardingSettingItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DepOnboardingSettingItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DepOnboardingSettingItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
