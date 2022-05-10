package microsoft.graph.deviceappmanagement;

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
import microsoft.graph.deviceappmanagement.androidmanagedappprotections.AndroidManagedAppProtectionsRequestBuilder;
import microsoft.graph.deviceappmanagement.androidmanagedappprotections.item.AndroidManagedAppProtectionItemRequestBuilder;
import microsoft.graph.deviceappmanagement.defaultmanagedappprotections.DefaultManagedAppProtectionsRequestBuilder;
import microsoft.graph.deviceappmanagement.defaultmanagedappprotections.item.DefaultManagedAppProtectionItemRequestBuilder;
import microsoft.graph.deviceappmanagement.deviceappmanagementtasks.DeviceAppManagementTasksRequestBuilder;
import microsoft.graph.deviceappmanagement.deviceappmanagementtasks.item.DeviceAppManagementTaskItemRequestBuilder;
import microsoft.graph.deviceappmanagement.enterprisecodesigningcertificates.EnterpriseCodeSigningCertificatesRequestBuilder;
import microsoft.graph.deviceappmanagement.enterprisecodesigningcertificates.item.EnterpriseCodeSigningCertificateItemRequestBuilder;
import microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.IosLobAppProvisioningConfigurationsRequestBuilder;
import microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.IosLobAppProvisioningConfigurationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.iosmanagedappprotections.IosManagedAppProtectionsRequestBuilder;
import microsoft.graph.deviceappmanagement.iosmanagedappprotections.item.IosManagedAppProtectionItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedapppolicies.item.ManagedAppPolicyItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedapppolicies.ManagedAppPoliciesRequestBuilder;
import microsoft.graph.deviceappmanagement.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import microsoft.graph.deviceappmanagement.managedappstatuses.item.ManagedAppStatusItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedappstatuses.ManagedAppStatusesRequestBuilder;
import microsoft.graph.deviceappmanagement.managedebookcategories.item.ManagedEBookCategoryItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedebookcategories.ManagedEBookCategoriesRequestBuilder;
import microsoft.graph.deviceappmanagement.managedebooks.item.ManagedEBookItemRequestBuilder;
import microsoft.graph.deviceappmanagement.managedebooks.ManagedEBooksRequestBuilder;
import microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.item.MdmWindowsInformationProtectionPolicyItemRequestBuilder;
import microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.MdmWindowsInformationProtectionPoliciesRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileappcategories.item.MobileAppCategoryItemRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileappcategories.MobileAppCategoriesRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileappconfigurations.item.ManagedDeviceMobileAppConfigurationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileappconfigurations.MobileAppConfigurationsRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileapps.item.MobileAppItemRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileapps.MobileAppsRequestBuilder;
import microsoft.graph.deviceappmanagement.policysets.item.PolicySetItemRequestBuilder;
import microsoft.graph.deviceappmanagement.policysets.PolicySetsRequestBuilder;
import microsoft.graph.deviceappmanagement.sideloadingkeys.item.SideLoadingKeyItemRequestBuilder;
import microsoft.graph.deviceappmanagement.sideloadingkeys.SideLoadingKeysRequestBuilder;
import microsoft.graph.deviceappmanagement.symanteccodesigningcertificate.SymantecCodeSigningCertificateRequestBuilder;
import microsoft.graph.deviceappmanagement.syncmicrosoftstoreforbusinessapps.SyncMicrosoftStoreForBusinessAppsRequestBuilder;
import microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.item.TargetedManagedAppConfigurationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.TargetedManagedAppConfigurationsRequestBuilder;
import microsoft.graph.deviceappmanagement.vpptokens.item.VppTokenItemRequestBuilder;
import microsoft.graph.deviceappmanagement.vpptokens.VppTokensRequestBuilder;
import microsoft.graph.deviceappmanagement.wdacsupplementalpolicies.item.WindowsDefenderApplicationControlSupplementalPolicyItemRequestBuilder;
import microsoft.graph.deviceappmanagement.wdacsupplementalpolicies.WdacSupplementalPoliciesRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations.item.WindowsInformationProtectionDeviceRegistrationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations.WindowsInformationProtectionDeviceRegistrationsRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.item.WindowsInformationProtectionPolicyItemRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.WindowsInformationProtectionPoliciesRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectionwipeactions.item.WindowsInformationProtectionWipeActionItemRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsinformationprotectionwipeactions.WindowsInformationProtectionWipeActionsRequestBuilder;
import microsoft.graph.deviceappmanagement.windowsmanagementapp.WindowsManagementAppRequestBuilder;
import microsoft.graph.models.DeviceAppManagement;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the deviceAppManagement singleton. */
public class DeviceAppManagementRequestBuilder {
    /** The androidManagedAppProtections property */
    @javax.annotation.Nonnull
    public AndroidManagedAppProtectionsRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The defaultManagedAppProtections property */
    @javax.annotation.Nonnull
    public DefaultManagedAppProtectionsRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceAppManagementTasks property */
    @javax.annotation.Nonnull
    public DeviceAppManagementTasksRequestBuilder deviceAppManagementTasks() {
        return new DeviceAppManagementTasksRequestBuilder(pathParameters, requestAdapter);
    }
    /** The enterpriseCodeSigningCertificates property */
    @javax.annotation.Nonnull
    public EnterpriseCodeSigningCertificatesRequestBuilder enterpriseCodeSigningCertificates() {
        return new EnterpriseCodeSigningCertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The iosLobAppProvisioningConfigurations property */
    @javax.annotation.Nonnull
    public IosLobAppProvisioningConfigurationsRequestBuilder iosLobAppProvisioningConfigurations() {
        return new IosLobAppProvisioningConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The iosManagedAppProtections property */
    @javax.annotation.Nonnull
    public IosManagedAppProtectionsRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppPolicies property */
    @javax.annotation.Nonnull
    public ManagedAppPoliciesRequestBuilder managedAppPolicies() {
        return new ManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppRegistrations property */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppStatuses property */
    @javax.annotation.Nonnull
    public ManagedAppStatusesRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedEBookCategories property */
    @javax.annotation.Nonnull
    public ManagedEBookCategoriesRequestBuilder managedEBookCategories() {
        return new ManagedEBookCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedEBooks property */
    @javax.annotation.Nonnull
    public ManagedEBooksRequestBuilder managedEBooks() {
        return new ManagedEBooksRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mdmWindowsInformationProtectionPolicies property */
    @javax.annotation.Nonnull
    public MdmWindowsInformationProtectionPoliciesRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileAppCategories property */
    @javax.annotation.Nonnull
    public MobileAppCategoriesRequestBuilder mobileAppCategories() {
        return new MobileAppCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileAppConfigurations property */
    @javax.annotation.Nonnull
    public MobileAppConfigurationsRequestBuilder mobileAppConfigurations() {
        return new MobileAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileApps property */
    @javax.annotation.Nonnull
    public MobileAppsRequestBuilder mobileApps() {
        return new MobileAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The policySets property */
    @javax.annotation.Nonnull
    public PolicySetsRequestBuilder policySets() {
        return new PolicySetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The sideLoadingKeys property */
    @javax.annotation.Nonnull
    public SideLoadingKeysRequestBuilder sideLoadingKeys() {
        return new SideLoadingKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /** The symantecCodeSigningCertificate property */
    @javax.annotation.Nonnull
    public SymantecCodeSigningCertificateRequestBuilder symantecCodeSigningCertificate() {
        return new SymantecCodeSigningCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The syncMicrosoftStoreForBusinessApps property */
    @javax.annotation.Nonnull
    public SyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new SyncMicrosoftStoreForBusinessAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The targetedManagedAppConfigurations property */
    @javax.annotation.Nonnull
    public TargetedManagedAppConfigurationsRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The vppTokens property */
    @javax.annotation.Nonnull
    public VppTokensRequestBuilder vppTokens() {
        return new VppTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wdacSupplementalPolicies property */
    @javax.annotation.Nonnull
    public WdacSupplementalPoliciesRequestBuilder wdacSupplementalPolicies() {
        return new WdacSupplementalPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionDeviceRegistrations property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionPolicies property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionPoliciesRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionWipeActions property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionWipeActionsRequestBuilder windowsInformationProtectionWipeActions() {
        return new WindowsInformationProtectionWipeActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsManagementApp property */
    @javax.annotation.Nonnull
    public WindowsManagementAppRequestBuilder windowsManagementApp() {
        return new WindowsManagementAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.androidManagedAppProtections.item collection
     * @param id Unique identifier of the item
     * @return a androidManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AndroidManagedAppProtectionItemRequestBuilder androidManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("androidManagedAppProtection%2Did", id);
        return new AndroidManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceAppManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceAppManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get deviceAppManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeviceAppManagementRequestBuilderGetRequestConfiguration requestConfig = new DeviceAppManagementRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceAppManagementRequestBuilderPatchRequestConfiguration requestConfig = new DeviceAppManagementRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.defaultManagedAppProtections.item collection
     * @param id Unique identifier of the item
     * @return a defaultManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DefaultManagedAppProtectionItemRequestBuilder defaultManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("defaultManagedAppProtection%2Did", id);
        return new DefaultManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.deviceAppManagementTasks.item collection
     * @param id Unique identifier of the item
     * @return a deviceAppManagementTaskItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceAppManagementTaskItemRequestBuilder deviceAppManagementTasks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceAppManagementTask%2Did", id);
        return new DeviceAppManagementTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.enterpriseCodeSigningCertificates.item collection
     * @param id Unique identifier of the item
     * @return a enterpriseCodeSigningCertificateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EnterpriseCodeSigningCertificateItemRequestBuilder enterpriseCodeSigningCertificates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("enterpriseCodeSigningCertificate%2Did", id);
        return new EnterpriseCodeSigningCertificateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get deviceAppManagement
     * @return a CompletableFuture of deviceAppManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAppManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of deviceAppManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.iosLobAppProvisioningConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a iosLobAppProvisioningConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IosLobAppProvisioningConfigurationItemRequestBuilder iosLobAppProvisioningConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("iosLobAppProvisioningConfiguration%2Did", id);
        return new IosLobAppProvisioningConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.iosManagedAppProtections.item collection
     * @param id Unique identifier of the item
     * @return a iosManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IosManagedAppProtectionItemRequestBuilder iosManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("iosManagedAppProtection%2Did", id);
        return new IosManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.managedAppPolicies.item collection
     * @param id Unique identifier of the item
     * @return a managedAppPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppPolicyItemRequestBuilder managedAppPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppPolicy%2Did", id);
        return new ManagedAppPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.managedAppRegistrations.item collection
     * @param id Unique identifier of the item
     * @return a managedAppRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationItemRequestBuilder managedAppRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppRegistration%2Did", id);
        return new ManagedAppRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.managedAppStatuses.item collection
     * @param id Unique identifier of the item
     * @return a managedAppStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppStatusItemRequestBuilder managedAppStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppStatus%2Did", id);
        return new ManagedAppStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.managedEBookCategories.item collection
     * @param id Unique identifier of the item
     * @return a managedEBookCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedEBookCategoryItemRequestBuilder managedEBookCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedEBookCategory%2Did", id);
        return new ManagedEBookCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.managedEBooks.item collection
     * @param id Unique identifier of the item
     * @return a managedEBookItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedEBookItemRequestBuilder managedEBooks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedEBook%2Did", id);
        return new ManagedEBookItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.mdmWindowsInformationProtectionPolicies.item collection
     * @param id Unique identifier of the item
     * @return a mdmWindowsInformationProtectionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MdmWindowsInformationProtectionPolicyItemRequestBuilder mdmWindowsInformationProtectionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mdmWindowsInformationProtectionPolicy%2Did", id);
        return new MdmWindowsInformationProtectionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.mobileAppCategories.item collection
     * @param id Unique identifier of the item
     * @return a mobileAppCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppCategoryItemRequestBuilder mobileAppCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileAppCategory%2Did", id);
        return new MobileAppCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.mobileAppConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a managedDeviceMobileAppConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder mobileAppConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfiguration%2Did", id);
        return new ManagedDeviceMobileAppConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.mobileApps.item collection
     * @param id Unique identifier of the item
     * @return a mobileAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppItemRequestBuilder mobileApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileApp%2Did", id);
        return new MobileAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceAppManagement body) {
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
     * Update deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceAppManagementRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.policySets.item collection
     * @param id Unique identifier of the item
     * @return a policySetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PolicySetItemRequestBuilder policySets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("policySet%2Did", id);
        return new PolicySetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.sideLoadingKeys.item collection
     * @param id Unique identifier of the item
     * @return a sideLoadingKeyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SideLoadingKeyItemRequestBuilder sideLoadingKeys(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sideLoadingKey%2Did", id);
        return new SideLoadingKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.targetedManagedAppConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a targetedManagedAppConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TargetedManagedAppConfigurationItemRequestBuilder targetedManagedAppConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("targetedManagedAppConfiguration%2Did", id);
        return new TargetedManagedAppConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.vppTokens.item collection
     * @param id Unique identifier of the item
     * @return a vppTokenItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public VppTokenItemRequestBuilder vppTokens(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vppToken%2Did", id);
        return new VppTokenItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.wdacSupplementalPolicies.item collection
     * @param id Unique identifier of the item
     * @return a windowsDefenderApplicationControlSupplementalPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyItemRequestBuilder wdacSupplementalPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsDefenderApplicationControlSupplementalPolicy%2Did", id);
        return new WindowsDefenderApplicationControlSupplementalPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.windowsInformationProtectionDeviceRegistrations.item collection
     * @param id Unique identifier of the item
     * @return a windowsInformationProtectionDeviceRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationItemRequestBuilder windowsInformationProtectionDeviceRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionDeviceRegistration%2Did", id);
        return new WindowsInformationProtectionDeviceRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.windowsInformationProtectionPolicies.item collection
     * @param id Unique identifier of the item
     * @return a windowsInformationProtectionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionPolicyItemRequestBuilder windowsInformationProtectionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionPolicy%2Did", id);
        return new WindowsInformationProtectionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceAppManagement.windowsInformationProtectionWipeActions.item collection
     * @param id Unique identifier of the item
     * @return a windowsInformationProtectionWipeActionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionWipeActionItemRequestBuilder windowsInformationProtectionWipeActions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionWipeAction%2Did", id);
        return new WindowsInformationProtectionWipeActionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get deviceAppManagement */
    public class DeviceAppManagementRequestBuilderGetQueryParameters {
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
    public class DeviceAppManagementRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceAppManagementRequestBuilderGetQueryParameters queryParameters = new DeviceAppManagementRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new deviceAppManagementRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceAppManagementRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceAppManagementRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new deviceAppManagementRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceAppManagementRequestBuilderPatchRequestConfiguration() {
        }
    }
}
