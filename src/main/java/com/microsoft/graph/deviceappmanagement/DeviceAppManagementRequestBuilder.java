package com.microsoft.graph.deviceappmanagement;

import com.microsoft.graph.deviceappmanagement.androidmanagedappprotections.AndroidManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.defaultmanagedappprotections.DefaultManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.deviceappmanagementtasks.DeviceAppManagementTasksRequestBuilder;
import com.microsoft.graph.deviceappmanagement.enterprisecodesigningcertificates.EnterpriseCodeSigningCertificatesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.IosLobAppProvisioningConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.iosmanagedappprotections.IosManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedapppolicies.ManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappstatuses.ManagedAppStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedebookcategories.ManagedEBookCategoriesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedebooks.ManagedEBooksRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.MdmWindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappcategories.MobileAppCategoriesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.MobileAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.MobileAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.policysets.PolicySetsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.symanteccodesigningcertificate.SymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.deviceappmanagement.syncmicrosoftstoreforbusinessapps.SyncMicrosoftStoreForBusinessAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.TargetedManagedAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.vpptokens.VppTokensRequestBuilder;
import com.microsoft.graph.deviceappmanagement.wdacsupplementalpolicies.WdacSupplementalPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations.WindowsInformationProtectionDeviceRegistrationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.WindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectionwipeactions.WindowsInformationProtectionWipeActionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsmanagedappprotections.WindowsManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsmanagementapp.WindowsManagementAppRequestBuilder;
import com.microsoft.graph.models.DeviceAppManagement;
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
 * Provides operations to manage the deviceAppManagement singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the androidManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public AndroidManagedAppProtectionsRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public DefaultManagedAppProtectionsRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceAppManagementTasks property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementTasksRequestBuilder deviceAppManagementTasks() {
        return new DeviceAppManagementTasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the enterpriseCodeSigningCertificates property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public EnterpriseCodeSigningCertificatesRequestBuilder enterpriseCodeSigningCertificates() {
        return new EnterpriseCodeSigningCertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the iosLobAppProvisioningConfigurations property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public IosLobAppProvisioningConfigurationsRequestBuilder iosLobAppProvisioningConfigurations() {
        return new IosLobAppProvisioningConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the iosManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public IosManagedAppProtectionsRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedAppPoliciesRequestBuilder managedAppPolicies() {
        return new ManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppStatuses property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedAppStatusesRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedEBookCategories property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedEBookCategoriesRequestBuilder managedEBookCategories() {
        return new ManagedEBookCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedEBooks property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedEBooksRequestBuilder managedEBooks() {
        return new ManagedEBooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mdmWindowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public MdmWindowsInformationProtectionPoliciesRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppCategories property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public MobileAppCategoriesRequestBuilder mobileAppCategories() {
        return new MobileAppCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public MobileAppConfigurationsRequestBuilder mobileAppConfigurations() {
        return new MobileAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public MobileAppsRequestBuilder mobileApps() {
        return new MobileAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the policySets property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public PolicySetsRequestBuilder policySets() {
        return new PolicySetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the symantecCodeSigningCertificate property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public SymantecCodeSigningCertificateRequestBuilder symantecCodeSigningCertificate() {
        return new SymantecCodeSigningCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncMicrosoftStoreForBusinessApps method.
     */
    @jakarta.annotation.Nonnull
    public SyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new SyncMicrosoftStoreForBusinessAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the targetedManagedAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public TargetedManagedAppConfigurationsRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the vppTokens property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public VppTokensRequestBuilder vppTokens() {
        return new VppTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the wdacSupplementalPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WdacSupplementalPoliciesRequestBuilder wdacSupplementalPolicies() {
        return new WdacSupplementalPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionDeviceRegistrations property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionPoliciesRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionWipeActions property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionWipeActionsRequestBuilder windowsInformationProtectionWipeActions() {
        return new WindowsInformationProtectionWipeActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsManagedAppProtectionsRequestBuilder windowsManagedAppProtections() {
        return new WindowsManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsManagementApp property of the microsoft.graph.deviceAppManagement entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsManagementAppRequestBuilder windowsManagementApp() {
        return new WindowsManagementAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceAppManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceAppManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get deviceAppManagement
     * @return a CompletableFuture of DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get() {
        return get(null);
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update deviceAppManagement
     * @param body The request body
     * @return a CompletableFuture of DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@jakarta.annotation.Nonnull final DeviceAppManagement body) {
        return patch(body, null);
    }
    /**
     * Update deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@jakarta.annotation.Nonnull final DeviceAppManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get deviceAppManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get deviceAppManagement
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
     * Update deviceAppManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceAppManagement body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceAppManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a DeviceAppManagementRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceAppManagementRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get deviceAppManagement
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
