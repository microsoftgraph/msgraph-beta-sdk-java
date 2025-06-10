package com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item;

import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.defaultiosenrollmentprofile.DefaultIosEnrollmentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.defaultmacosenrollmentprofile.DefaultMacOsEnrollmentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.defaulttvosenrollmentprofile.DefaultTvOSEnrollmentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.defaultvisionosenrollmentprofile.DefaultVisionOSEnrollmentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.enrollmentprofiles.EnrollmentProfilesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.generateencryptionpublickey.GenerateEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.getencryptionpublickey.GetEncryptionPublicKeyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.ImportedAppleDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.shareforschooldatasyncservice.ShareForSchoolDataSyncServiceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.syncwithappledeviceenrollmentprogram.SyncWithAppleDeviceEnrollmentProgramRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.unshareforschooldatasyncservice.UnshareForSchoolDataSyncServiceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.uploaddeptoken.UploadDepTokenRequestBuilder;
import com.microsoft.graph.beta.models.DepOnboardingSetting;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
     * @return a {@link DefaultIosEnrollmentProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultIosEnrollmentProfileRequestBuilder defaultIosEnrollmentProfile() {
        return new DefaultIosEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultMacOsEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity.
     * @return a {@link DefaultMacOsEnrollmentProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultMacOsEnrollmentProfileRequestBuilder defaultMacOsEnrollmentProfile() {
        return new DefaultMacOsEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultTvOSEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity.
     * @return a {@link DefaultTvOSEnrollmentProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultTvOSEnrollmentProfileRequestBuilder defaultTvOSEnrollmentProfile() {
        return new DefaultTvOSEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultVisionOSEnrollmentProfile property of the microsoft.graph.depOnboardingSetting entity.
     * @return a {@link DefaultVisionOSEnrollmentProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultVisionOSEnrollmentProfileRequestBuilder defaultVisionOSEnrollmentProfile() {
        return new DefaultVisionOSEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the enrollmentProfiles property of the microsoft.graph.depOnboardingSetting entity.
     * @return a {@link EnrollmentProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnrollmentProfilesRequestBuilder enrollmentProfiles() {
        return new EnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the generateEncryptionPublicKey method.
     * @return a {@link GenerateEncryptionPublicKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GenerateEncryptionPublicKeyRequestBuilder generateEncryptionPublicKey() {
        return new GenerateEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEncryptionPublicKey method.
     * @return a {@link GetEncryptionPublicKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder getEncryptionPublicKey() {
        return new GetEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the importedAppleDeviceIdentities property of the microsoft.graph.depOnboardingSetting entity.
     * @return a {@link ImportedAppleDeviceIdentitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImportedAppleDeviceIdentitiesRequestBuilder importedAppleDeviceIdentities() {
        return new ImportedAppleDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the shareForSchoolDataSyncService method.
     * @return a {@link ShareForSchoolDataSyncServiceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShareForSchoolDataSyncServiceRequestBuilder shareForSchoolDataSyncService() {
        return new ShareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncWithAppleDeviceEnrollmentProgram method.
     * @return a {@link SyncWithAppleDeviceEnrollmentProgramRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SyncWithAppleDeviceEnrollmentProgramRequestBuilder syncWithAppleDeviceEnrollmentProgram() {
        return new SyncWithAppleDeviceEnrollmentProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unshareForSchoolDataSyncService method.
     * @return a {@link UnshareForSchoolDataSyncServiceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnshareForSchoolDataSyncServiceRequestBuilder unshareForSchoolDataSyncService() {
        return new UnshareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the uploadDepToken method.
     * @return a {@link UploadDepTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadDepTokenRequestBuilder uploadDepToken() {
        return new UploadDepTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DepOnboardingSettingItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DepOnboardingSettingItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DepOnboardingSettingItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DepOnboardingSettingItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a {@link DepOnboardingSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DepOnboardingSetting get() {
        return get(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DepOnboardingSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DepOnboardingSetting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DepOnboardingSetting::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @return a {@link DepOnboardingSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DepOnboardingSetting patch(@jakarta.annotation.Nonnull final DepOnboardingSetting body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DepOnboardingSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DepOnboardingSetting patch(@jakarta.annotation.Nonnull final DepOnboardingSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DepOnboardingSetting::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DepOnboardingSetting body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DepOnboardingSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DepOnboardingSettingItemRequestBuilder}
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
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
