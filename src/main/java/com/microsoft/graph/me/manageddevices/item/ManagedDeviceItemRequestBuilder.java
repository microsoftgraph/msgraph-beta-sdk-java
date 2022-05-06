package microsoft.graph.me.manageddevices.item;

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
import microsoft.graph.me.manageddevices.item.activatedeviceesim.ActivateDeviceEsimRequestBuilder;
import microsoft.graph.me.manageddevices.item.assignmentfilterevaluationstatusdetails.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import microsoft.graph.me.manageddevices.item.assignmentfilterevaluationstatusdetails.item.AssignmentFilterEvaluationStatusDetailsItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import microsoft.graph.me.manageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import microsoft.graph.me.manageddevices.item.createdevicelogcollectionrequest.CreateDeviceLogCollectionRequestRequestBuilder;
import microsoft.graph.me.manageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import microsoft.graph.me.manageddevices.item.deprovision.DeprovisionRequestBuilder;
import microsoft.graph.me.manageddevices.item.detectedapps.DetectedAppsRequestBuilder;
import microsoft.graph.me.manageddevices.item.detectedapps.item.DetectedAppItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import microsoft.graph.me.manageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import microsoft.graph.me.manageddevices.item.devicecompliancepolicystates.item.DeviceCompliancePolicyStateItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import microsoft.graph.me.manageddevices.item.deviceconfigurationstates.item.DeviceConfigurationStateItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.disable.DisableRequestBuilder;
import microsoft.graph.me.manageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import microsoft.graph.me.manageddevices.item.enablelostmode.EnableLostModeRequestBuilder;
import microsoft.graph.me.manageddevices.item.getcloudpcremoteactionresults.GetCloudPcRemoteActionResultsRequestBuilder;
import microsoft.graph.me.manageddevices.item.getcloudpcreviewstatus.GetCloudPcReviewStatusRequestBuilder;
import microsoft.graph.me.manageddevices.item.getfilevaultkey.GetFileVaultKeyRequestBuilder;
import microsoft.graph.me.manageddevices.item.getnoncompliantsettings.GetNonCompliantSettingsRequestBuilder;
import microsoft.graph.me.manageddevices.item.getoemwarranty.GetOemWarrantyRequestBuilder;
import microsoft.graph.me.manageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import microsoft.graph.me.manageddevices.item.logcollectionrequests.item.DeviceLogCollectionResponseItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import microsoft.graph.me.manageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import microsoft.graph.me.manageddevices.item.manageddevicemobileappconfigurationstates.item.ManagedDeviceMobileAppConfigurationStateItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.manageddevicemobileappconfigurationstates.ManagedDeviceMobileAppConfigurationStatesRequestBuilder;
import microsoft.graph.me.manageddevices.item.overridecompliancestate.OverrideComplianceStateRequestBuilder;
import microsoft.graph.me.manageddevices.item.playlostmodesound.PlayLostModeSoundRequestBuilder;
import microsoft.graph.me.manageddevices.item.rebootnow.RebootNowRequestBuilder;
import microsoft.graph.me.manageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import microsoft.graph.me.manageddevices.item.reenable.ReenableRequestBuilder;
import microsoft.graph.me.manageddevices.item.remotelock.RemoteLockRequestBuilder;
import microsoft.graph.me.manageddevices.item.reprovisioncloudpc.ReprovisionCloudPcRequestBuilder;
import microsoft.graph.me.manageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import microsoft.graph.me.manageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import microsoft.graph.me.manageddevices.item.resizecloudpc.ResizeCloudPcRequestBuilder;
import microsoft.graph.me.manageddevices.item.restorecloudpc.RestoreCloudPcRequestBuilder;
import microsoft.graph.me.manageddevices.item.retire.RetireRequestBuilder;
import microsoft.graph.me.manageddevices.item.revokeapplevpplicenses.RevokeAppleVppLicensesRequestBuilder;
import microsoft.graph.me.manageddevices.item.rotatebitlockerkeys.RotateBitLockerKeysRequestBuilder;
import microsoft.graph.me.manageddevices.item.rotatefilevaultkey.RotateFileVaultKeyRequestBuilder;
import microsoft.graph.me.manageddevices.item.securitybaselinestates.item.SecurityBaselineStateItemRequestBuilder;
import microsoft.graph.me.manageddevices.item.securitybaselinestates.SecurityBaselineStatesRequestBuilder;
import microsoft.graph.me.manageddevices.item.sendcustomnotificationtocompanyportal.SendCustomNotificationToCompanyPortalRequestBuilder;
import microsoft.graph.me.manageddevices.item.setcloudpcreviewstatus.SetCloudPcReviewStatusRequestBuilder;
import microsoft.graph.me.manageddevices.item.setdevicename.SetDeviceNameRequestBuilder;
import microsoft.graph.me.manageddevices.item.shutdown.ShutDownRequestBuilder;
import microsoft.graph.me.manageddevices.item.syncdevice.SyncDeviceRequestBuilder;
import microsoft.graph.me.manageddevices.item.triggerconfigurationmanageraction.TriggerConfigurationManagerActionRequestBuilder;
import microsoft.graph.me.manageddevices.item.updatewindowsdeviceaccount.UpdateWindowsDeviceAccountRequestBuilder;
import microsoft.graph.me.manageddevices.item.users.UsersRequestBuilder;
import microsoft.graph.me.manageddevices.item.windowsdefenderscan.WindowsDefenderScanRequestBuilder;
import microsoft.graph.me.manageddevices.item.windowsdefenderupdatesignatures.WindowsDefenderUpdateSignaturesRequestBuilder;
import microsoft.graph.me.manageddevices.item.windowsprotectionstate.WindowsProtectionStateRequestBuilder;
import microsoft.graph.me.manageddevices.item.wipe.WipeRequestBuilder;
import microsoft.graph.models.ManagedDevice;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the managedDevices property of the microsoft.graph.user entity.  */
public class ManagedDeviceItemRequestBuilder {
    /** The activateDeviceEsim property  */
    @javax.annotation.Nonnull
    public ActivateDeviceEsimRequestBuilder activateDeviceEsim() {
        return new ActivateDeviceEsimRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignmentFilterEvaluationStatusDetails property  */
    @javax.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The bypassActivationLock property  */
    @javax.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cleanWindowsDevice property  */
    @javax.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createDeviceLogCollectionRequest property  */
    @javax.annotation.Nonnull
    public CreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest() {
        return new CreateDeviceLogCollectionRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deleteUserFromSharedAppleDevice property  */
    @javax.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deprovision property  */
    @javax.annotation.Nonnull
    public DeprovisionRequestBuilder deprovision() {
        return new DeprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The detectedApps property  */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCategory property  */
    @javax.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicyStates property  */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceConfigurationStates property  */
    @javax.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The disable property  */
    @javax.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The disableLostMode property  */
    @javax.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The enableLostMode property  */
    @javax.annotation.Nonnull
    public EnableLostModeRequestBuilder enableLostMode() {
        return new EnableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The locateDevice property  */
    @javax.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logCollectionRequests property  */
    @javax.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logoutSharedAppleDeviceActiveUser property  */
    @javax.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDeviceMobileAppConfigurationStates property  */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStatesRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The overrideComplianceState property  */
    @javax.annotation.Nonnull
    public OverrideComplianceStateRequestBuilder overrideComplianceState() {
        return new OverrideComplianceStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The playLostModeSound property  */
    @javax.annotation.Nonnull
    public PlayLostModeSoundRequestBuilder playLostModeSound() {
        return new PlayLostModeSoundRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rebootNow property  */
    @javax.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /** The recoverPasscode property  */
    @javax.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reenable property  */
    @javax.annotation.Nonnull
    public ReenableRequestBuilder reenable() {
        return new ReenableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The remoteLock property  */
    @javax.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reprovisionCloudPc property  */
    @javax.annotation.Nonnull
    public ReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The requestRemoteAssistance property  */
    @javax.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The resetPasscode property  */
    @javax.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The resizeCloudPc property  */
    @javax.annotation.Nonnull
    public ResizeCloudPcRequestBuilder resizeCloudPc() {
        return new ResizeCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The restoreCloudPc property  */
    @javax.annotation.Nonnull
    public RestoreCloudPcRequestBuilder restoreCloudPc() {
        return new RestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The retire property  */
    @javax.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeAppleVppLicenses property  */
    @javax.annotation.Nonnull
    public RevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new RevokeAppleVppLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rotateBitLockerKeys property  */
    @javax.annotation.Nonnull
    public RotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new RotateBitLockerKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rotateFileVaultKey property  */
    @javax.annotation.Nonnull
    public RotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new RotateFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The securityBaselineStates property  */
    @javax.annotation.Nonnull
    public SecurityBaselineStatesRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendCustomNotificationToCompanyPortal property  */
    @javax.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setCloudPcReviewStatus property  */
    @javax.annotation.Nonnull
    public SetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus() {
        return new SetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setDeviceName property  */
    @javax.annotation.Nonnull
    public SetDeviceNameRequestBuilder setDeviceName() {
        return new SetDeviceNameRequestBuilder(pathParameters, requestAdapter);
    }
    /** The shutDown property  */
    @javax.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /** The syncDevice property  */
    @javax.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The triggerConfigurationManagerAction property  */
    @javax.annotation.Nonnull
    public TriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction() {
        return new TriggerConfigurationManagerActionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The updateWindowsDeviceAccount property  */
    @javax.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /** The users property  */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsDefenderScan property  */
    @javax.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsDefenderUpdateSignatures property  */
    @javax.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsProtectionState property  */
    @javax.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipe property  */
    @javax.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.assignmentFilterEvaluationStatusDetails.item collection
     * @param id Unique identifier of the item
     * @return a assignmentFilterEvaluationStatusDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsItemRequestBuilder assignmentFilterEvaluationStatusDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("assignmentFilterEvaluationStatusDetails%2Did", id);
        return new AssignmentFilterEvaluationStatusDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ManagedDeviceItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ManagedDeviceItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property managedDevices for me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedDevices for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ManagedDeviceItemRequestBuilderDeleteRequestConfiguration requestConfig = new ManagedDeviceItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The managed devices associated with the user.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ManagedDeviceItemRequestBuilderGetRequestConfiguration requestConfig = new ManagedDeviceItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property managedDevices in me
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDevice body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedDevices in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ManagedDeviceItemRequestBuilderPatchRequestConfiguration requestConfig = new ManagedDeviceItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property managedDevices for me
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
     * Delete navigation property managedDevices for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Delete navigation property managedDevices for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.detectedApps.item collection
     * @param id Unique identifier of the item
     * @return a detectedAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DetectedAppItemRequestBuilder detectedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("detectedApp%2Did", id);
        return new DetectedAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.deviceCompliancePolicyStates.item collection
     * @param id Unique identifier of the item
     * @return a deviceCompliancePolicyStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStateItemRequestBuilder deviceCompliancePolicyStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicyState%2Did", id);
        return new DeviceCompliancePolicyStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.deviceConfigurationStates.item collection
     * @param id Unique identifier of the item
     * @return a deviceConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationStateItemRequestBuilder deviceConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationState%2Did", id);
        return new DeviceConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The managed devices associated with the user.
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of managedDevice
     */
    public java.util.concurrent.CompletableFuture<ManagedDevice> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Provides operations to call the getCloudPcRemoteActionResults method.
     * @return a getCloudPcRemoteActionResultsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetCloudPcRemoteActionResultsRequestBuilder getCloudPcRemoteActionResults() {
        return new GetCloudPcRemoteActionResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcReviewStatus method.
     * @return a getCloudPcReviewStatusRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetCloudPcReviewStatusRequestBuilder getCloudPcReviewStatus() {
        return new GetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFileVaultKey method.
     * @return a getFileVaultKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetFileVaultKeyRequestBuilder getFileVaultKey() {
        return new GetFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getNonCompliantSettings method.
     * @return a getNonCompliantSettingsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetNonCompliantSettingsRequestBuilder getNonCompliantSettings() {
        return new GetNonCompliantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOemWarranty method.
     * @return a getOemWarrantyRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOemWarrantyRequestBuilder getOemWarranty() {
        return new GetOemWarrantyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.logCollectionRequests.item collection
     * @param id Unique identifier of the item
     * @return a deviceLogCollectionResponseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceLogCollectionResponseItemRequestBuilder logCollectionRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceLogCollectionResponse%2Did", id);
        return new DeviceLogCollectionResponseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.managedDeviceMobileAppConfigurationStates.item collection
     * @param id Unique identifier of the item
     * @return a managedDeviceMobileAppConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStateItemRequestBuilder managedDeviceMobileAppConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationState%2Did", id);
        return new ManagedDeviceMobileAppConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property managedDevices in me
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ManagedDevice body) {
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
     * Update the navigation property managedDevices in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update the navigation property managedDevices in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Gets an item from the Microsoft.Graph.me.managedDevices.item.securityBaselineStates.item collection
     * @param id Unique identifier of the item
     * @return a securityBaselineStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecurityBaselineStateItemRequestBuilder securityBaselineStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("securityBaselineState%2Did", id);
        return new SecurityBaselineStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class ManagedDeviceItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new managedDeviceItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The managed devices associated with the user.  */
    public class ManagedDeviceItemRequestBuilderGetQueryParameters {
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
    public class ManagedDeviceItemRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public ManagedDeviceItemRequestBuilderGetQueryParameters queryParameters = new ManagedDeviceItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new managedDeviceItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class ManagedDeviceItemRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new managedDeviceItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
