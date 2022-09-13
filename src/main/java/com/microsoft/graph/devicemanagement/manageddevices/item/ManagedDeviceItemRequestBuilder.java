package com.microsoft.graph.devicemanagement.manageddevices.item;

import com.microsoft.graph.devicemanagement.manageddevices.item.activatedeviceesim.ActivateDeviceEsimRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.assignmentfilterevaluationstatusdetails.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.assignmentfilterevaluationstatusdetails.item.AssignmentFilterEvaluationStatusDetailsItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.createdevicelogcollectionrequest.CreateDeviceLogCollectionRequestRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.createremotehelpsession.CreateRemoteHelpSessionRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deprovision.DeprovisionRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.detectedapps.item.DetectedAppItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.devicecompliancepolicystates.item.DeviceCompliancePolicyStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deviceconfigurationstates.item.DeviceConfigurationStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.disable.DisableRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.enablelostmode.EnableLostModeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.getcloudpcremoteactionresults.GetCloudPcRemoteActionResultsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.getcloudpcreviewstatus.GetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.getfilevaultkey.GetFileVaultKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.getnoncompliantsettings.GetNonCompliantSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.getoemwarranty.GetOemWarrantyRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.logcollectionrequests.item.DeviceLogCollectionResponseItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.manageddevicemobileappconfigurationstates.item.ManagedDeviceMobileAppConfigurationStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.manageddevicemobileappconfigurationstates.ManagedDeviceMobileAppConfigurationStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.overridecompliancestate.OverrideComplianceStateRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.playlostmodesound.PlayLostModeSoundRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.rebootnow.RebootNowRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.reenable.ReenableRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.remotelock.RemoteLockRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.removedevicefirmwareconfigurationinterfacemanagement.RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.reprovisioncloudpc.ReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.requestremotehelpsessionaccess.RequestRemoteHelpSessionAccessRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.resizecloudpc.ResizeCloudPcRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.restorecloudpc.RestoreCloudPcRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.retire.RetireRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.retrieveremotehelpsessionwithsessionkey.RetrieveRemoteHelpSessionWithSessionKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.revokeapplevpplicenses.RevokeAppleVppLicensesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.rotatebitlockerkeys.RotateBitLockerKeysRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.rotatefilevaultkey.RotateFileVaultKeyRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.securitybaselinestates.item.SecurityBaselineStateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.securitybaselinestates.SecurityBaselineStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.sendcustomnotificationtocompanyportal.SendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.setcloudpcreviewstatus.SetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.setdevicename.SetDeviceNameRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.shutdown.ShutDownRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.syncdevice.SyncDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.triggerconfigurationmanageraction.TriggerConfigurationManagerActionRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.updatewindowsdeviceaccount.UpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.users.UsersRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsdefenderscan.WindowsDefenderScanRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsdefenderupdatesignatures.WindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsprotectionstate.WindowsProtectionStateRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.wipe.WipeRequestBuilder;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.odataerrors.ODataError;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity. */
public class ManagedDeviceItemRequestBuilder {
    /** The activateDeviceEsim property */
    @javax.annotation.Nonnull
    public ActivateDeviceEsimRequestBuilder activateDeviceEsim() {
        return new ActivateDeviceEsimRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignmentFilterEvaluationStatusDetails property */
    @javax.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The bypassActivationLock property */
    @javax.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cleanWindowsDevice property */
    @javax.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createDeviceLogCollectionRequest property */
    @javax.annotation.Nonnull
    public CreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest() {
        return new CreateDeviceLogCollectionRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createRemoteHelpSession property */
    @javax.annotation.Nonnull
    public CreateRemoteHelpSessionRequestBuilder createRemoteHelpSession() {
        return new CreateRemoteHelpSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deleteUserFromSharedAppleDevice property */
    @javax.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deprovision property */
    @javax.annotation.Nonnull
    public DeprovisionRequestBuilder deprovision() {
        return new DeprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The detectedApps property */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCategory property */
    @javax.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicyStates property */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceConfigurationStates property */
    @javax.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The disable property */
    @javax.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The disableLostMode property */
    @javax.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The enableLostMode property */
    @javax.annotation.Nonnull
    public EnableLostModeRequestBuilder enableLostMode() {
        return new EnableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The locateDevice property */
    @javax.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logCollectionRequests property */
    @javax.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logoutSharedAppleDeviceActiveUser property */
    @javax.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDeviceMobileAppConfigurationStates property */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStatesRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The overrideComplianceState property */
    @javax.annotation.Nonnull
    public OverrideComplianceStateRequestBuilder overrideComplianceState() {
        return new OverrideComplianceStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The playLostModeSound property */
    @javax.annotation.Nonnull
    public PlayLostModeSoundRequestBuilder playLostModeSound() {
        return new PlayLostModeSoundRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rebootNow property */
    @javax.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /** The recoverPasscode property */
    @javax.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reenable property */
    @javax.annotation.Nonnull
    public ReenableRequestBuilder reenable() {
        return new ReenableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The remoteLock property */
    @javax.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** The removeDeviceFirmwareConfigurationInterfaceManagement property */
    @javax.annotation.Nonnull
    public RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder removeDeviceFirmwareConfigurationInterfaceManagement() {
        return new RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reprovisionCloudPc property */
    @javax.annotation.Nonnull
    public ReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The requestRemoteAssistance property */
    @javax.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The requestRemoteHelpSessionAccess property */
    @javax.annotation.Nonnull
    public RequestRemoteHelpSessionAccessRequestBuilder requestRemoteHelpSessionAccess() {
        return new RequestRemoteHelpSessionAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /** The resetPasscode property */
    @javax.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The resizeCloudPc property */
    @javax.annotation.Nonnull
    public ResizeCloudPcRequestBuilder resizeCloudPc() {
        return new ResizeCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The restoreCloudPc property */
    @javax.annotation.Nonnull
    public RestoreCloudPcRequestBuilder restoreCloudPc() {
        return new RestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The retire property */
    @javax.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeAppleVppLicenses property */
    @javax.annotation.Nonnull
    public RevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new RevokeAppleVppLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rotateBitLockerKeys property */
    @javax.annotation.Nonnull
    public RotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new RotateBitLockerKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /** The rotateFileVaultKey property */
    @javax.annotation.Nonnull
    public RotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new RotateFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The securityBaselineStates property */
    @javax.annotation.Nonnull
    public SecurityBaselineStatesRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendCustomNotificationToCompanyPortal property */
    @javax.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setCloudPcReviewStatus property */
    @javax.annotation.Nonnull
    public SetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus() {
        return new SetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setDeviceName property */
    @javax.annotation.Nonnull
    public SetDeviceNameRequestBuilder setDeviceName() {
        return new SetDeviceNameRequestBuilder(pathParameters, requestAdapter);
    }
    /** The shutDown property */
    @javax.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /** The syncDevice property */
    @javax.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The triggerConfigurationManagerAction property */
    @javax.annotation.Nonnull
    public TriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction() {
        return new TriggerConfigurationManagerActionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The updateWindowsDeviceAccount property */
    @javax.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The users property */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsDefenderScan property */
    @javax.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsDefenderUpdateSignatures property */
    @javax.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsProtectionState property */
    @javax.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipe property */
    @javax.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.assignmentFilterEvaluationStatusDetails.item collection
     * @param id Unique identifier of the item
     * @return a AssignmentFilterEvaluationStatusDetailsItemRequestBuilder
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
        this.urlTemplate = "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
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
        this.urlTemplate = "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
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
     * The list of managed devices.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The list of managed devices.
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
        requestInfo.addRequestHeader("Accept", "application/json");
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
     * Update the navigation property managedDevices in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDevice body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedDevices in deviceManagement
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
     * Delete navigation property managedDevices for deviceManagement
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
     * Delete navigation property managedDevices for deviceManagement
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
     * Delete navigation property managedDevices for deviceManagement
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
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.detectedApps.item collection
     * @param id Unique identifier of the item
     * @return a DetectedAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DetectedAppItemRequestBuilder detectedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("detectedApp%2Did", id);
        return new DetectedAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.deviceCompliancePolicyStates.item collection
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicyStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStateItemRequestBuilder deviceCompliancePolicyStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicyState%2Did", id);
        return new DeviceCompliancePolicyStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.deviceConfigurationStates.item collection
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationStateItemRequestBuilder deviceConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationState%2Did", id);
        return new DeviceConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The list of managed devices.
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
     * The list of managed devices.
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
     * The list of managed devices.
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
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.logCollectionRequests.item collection
     * @param id Unique identifier of the item
     * @return a DeviceLogCollectionResponseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceLogCollectionResponseItemRequestBuilder logCollectionRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceLogCollectionResponse%2Did", id);
        return new DeviceLogCollectionResponseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.managedDeviceMobileAppConfigurationStates.item collection
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStateItemRequestBuilder managedDeviceMobileAppConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationState%2Did", id);
        return new ManagedDeviceMobileAppConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property managedDevices in deviceManagement
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
     * Update the navigation property managedDevices in deviceManagement
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
     * Update the navigation property managedDevices in deviceManagement
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
     * Provides operations to call the retrieveRemoteHelpSession method.
     * @param sessionKey Usage: sessionKey='{sessionKey}'
     * @return a retrieveRemoteHelpSessionWithSessionKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public RetrieveRemoteHelpSessionWithSessionKeyRequestBuilder retrieveRemoteHelpSessionWithSessionKey(@javax.annotation.Nonnull final String sessionKey) {
        Objects.requireNonNull(sessionKey);
        return new RetrieveRemoteHelpSessionWithSessionKeyRequestBuilder(pathParameters, requestAdapter, sessionKey);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item.securityBaselineStates.item collection
     * @param id Unique identifier of the item
     * @return a SecurityBaselineStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecurityBaselineStateItemRequestBuilder securityBaselineStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("securityBaselineState%2Did", id);
        return new SecurityBaselineStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDeviceItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The list of managed devices. */
    public class ManagedDeviceItemRequestBuilderGetQueryParameters {
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
    public class ManagedDeviceItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedDeviceItemRequestBuilderGetQueryParameters queryParameters = new ManagedDeviceItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDeviceItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ManagedDeviceItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
