package com.microsoft.graph.users.item.manageddevices.item;

import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.manageddevices.item.activatedeviceesim.ActivateDeviceEsimRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.assignmentfilterevaluationstatusdetails.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.createdevicelogcollectionrequest.CreateDeviceLogCollectionRequestRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deprovision.DeprovisionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicehealthscriptstates.DeviceHealthScriptStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.disable.DisableRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.enablelostmode.EnableLostModeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.enrollnowaction.EnrollNowActionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getcloudpcremoteactionresults.GetCloudPcRemoteActionResultsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getcloudpcreviewstatus.GetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getfilevaultkey.GetFileVaultKeyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getnoncompliantsettings.GetNonCompliantSettingsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.initiatemobiledevicemanagementkeyrecovery.InitiateMobileDeviceManagementKeyRecoveryRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.initiateondemandproactiveremediation.InitiateOnDemandProactiveRemediationRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.manageddevicemobileappconfigurationstates.ManagedDeviceMobileAppConfigurationStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.overridecompliancestate.OverrideComplianceStateRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.pauseconfigurationrefresh.PauseConfigurationRefreshRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.playlostmodesound.PlayLostModeSoundRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rebootnow.RebootNowRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.reenable.ReenableRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.remotelock.RemoteLockRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.removedevicefirmwareconfigurationinterfacemanagement.RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.reprovisioncloudpc.ReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.resizecloudpc.ResizeCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.restorecloudpc.RestoreCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.retire.RetireRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.revokeapplevpplicenses.RevokeAppleVppLicensesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rotatebitlockerkeys.RotateBitLockerKeysRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rotatefilevaultkey.RotateFileVaultKeyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rotatelocaladminpassword.RotateLocalAdminPasswordRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.securitybaselinestates.SecurityBaselineStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.sendcustomnotificationtocompanyportal.SendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.setcloudpcreviewstatus.SetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.setdevicename.SetDeviceNameRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.shutdown.ShutDownRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.syncdevice.SyncDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.triggerconfigurationmanageraction.TriggerConfigurationManagerActionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.updatewindowsdeviceaccount.UpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.users.UsersRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.windowsdefenderscan.WindowsDefenderScanRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.windowsdefenderupdatesignatures.WindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.windowsprotectionstate.WindowsProtectionStateRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.wipe.WipeRequestBuilder;
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
 * Provides operations to manage the managedDevices property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the activateDeviceEsim method.
     */
    @jakarta.annotation.Nonnull
    public ActivateDeviceEsimRequestBuilder activateDeviceEsim() {
        return new ActivateDeviceEsimRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentFilterEvaluationStatusDetails property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bypassActivationLock method.
     */
    @jakarta.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cleanWindowsDevice method.
     */
    @jakarta.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createDeviceLogCollectionRequest method.
     */
    @jakarta.annotation.Nonnull
    public CreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest() {
        return new CreateDeviceLogCollectionRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deleteUserFromSharedAppleDevice method.
     */
    @jakarta.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deprovision method.
     */
    @jakarta.annotation.Nonnull
    public DeprovisionRequestBuilder deprovision() {
        return new DeprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the detectedApps property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCategory property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicyStates property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurationStates property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceHealthScriptStates property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceHealthScriptStatesRequestBuilder deviceHealthScriptStates() {
        return new DeviceHealthScriptStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disable method.
     */
    @jakarta.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disableLostMode method.
     */
    @jakarta.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enableLostMode method.
     */
    @jakarta.annotation.Nonnull
    public EnableLostModeRequestBuilder enableLostMode() {
        return new EnableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enrollNowAction method.
     */
    @jakarta.annotation.Nonnull
    public EnrollNowActionRequestBuilder enrollNowAction() {
        return new EnrollNowActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcRemoteActionResults method.
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcRemoteActionResultsRequestBuilder getCloudPcRemoteActionResults() {
        return new GetCloudPcRemoteActionResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcReviewStatus method.
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcReviewStatusRequestBuilder getCloudPcReviewStatus() {
        return new GetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFileVaultKey method.
     */
    @jakarta.annotation.Nonnull
    public GetFileVaultKeyRequestBuilder getFileVaultKey() {
        return new GetFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getNonCompliantSettings method.
     */
    @jakarta.annotation.Nonnull
    public GetNonCompliantSettingsRequestBuilder getNonCompliantSettings() {
        return new GetNonCompliantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the initiateMobileDeviceManagementKeyRecovery method.
     */
    @jakarta.annotation.Nonnull
    public InitiateMobileDeviceManagementKeyRecoveryRequestBuilder initiateMobileDeviceManagementKeyRecovery() {
        return new InitiateMobileDeviceManagementKeyRecoveryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the initiateOnDemandProactiveRemediation method.
     */
    @jakarta.annotation.Nonnull
    public InitiateOnDemandProactiveRemediationRequestBuilder initiateOnDemandProactiveRemediation() {
        return new InitiateOnDemandProactiveRemediationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the locateDevice method.
     */
    @jakarta.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the logCollectionRequests property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logoutSharedAppleDeviceActiveUser method.
     */
    @jakarta.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceMobileAppConfigurationStates property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStatesRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the overrideComplianceState method.
     */
    @jakarta.annotation.Nonnull
    public OverrideComplianceStateRequestBuilder overrideComplianceState() {
        return new OverrideComplianceStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pauseConfigurationRefresh method.
     */
    @jakarta.annotation.Nonnull
    public PauseConfigurationRefreshRequestBuilder pauseConfigurationRefresh() {
        return new PauseConfigurationRefreshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the playLostModeSound method.
     */
    @jakarta.annotation.Nonnull
    public PlayLostModeSoundRequestBuilder playLostModeSound() {
        return new PlayLostModeSoundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rebootNow method.
     */
    @jakarta.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recoverPasscode method.
     */
    @jakarta.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reenable method.
     */
    @jakarta.annotation.Nonnull
    public ReenableRequestBuilder reenable() {
        return new ReenableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the remoteLock method.
     */
    @jakarta.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeDeviceFirmwareConfigurationInterfaceManagement method.
     */
    @jakarta.annotation.Nonnull
    public RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder removeDeviceFirmwareConfigurationInterfaceManagement() {
        return new RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprovisionCloudPc method.
     */
    @jakarta.annotation.Nonnull
    public ReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the requestRemoteAssistance method.
     */
    @jakarta.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetPasscode method.
     */
    @jakarta.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resizeCloudPc method.
     */
    @jakarta.annotation.Nonnull
    public ResizeCloudPcRequestBuilder resizeCloudPc() {
        return new ResizeCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restoreCloudPc method.
     */
    @jakarta.annotation.Nonnull
    public RestoreCloudPcRequestBuilder restoreCloudPc() {
        return new RestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retire method.
     */
    @jakarta.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeAppleVppLicenses method.
     */
    @jakarta.annotation.Nonnull
    public RevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new RevokeAppleVppLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateBitLockerKeys method.
     */
    @jakarta.annotation.Nonnull
    public RotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new RotateBitLockerKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateFileVaultKey method.
     */
    @jakarta.annotation.Nonnull
    public RotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new RotateFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateLocalAdminPassword method.
     */
    @jakarta.annotation.Nonnull
    public RotateLocalAdminPasswordRequestBuilder rotateLocalAdminPassword() {
        return new RotateLocalAdminPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the securityBaselineStates property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public SecurityBaselineStatesRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendCustomNotificationToCompanyPortal method.
     */
    @jakarta.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setCloudPcReviewStatus method.
     */
    @jakarta.annotation.Nonnull
    public SetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus() {
        return new SetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setDeviceName method.
     */
    @jakarta.annotation.Nonnull
    public SetDeviceNameRequestBuilder setDeviceName() {
        return new SetDeviceNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the shutDown method.
     */
    @jakarta.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncDevice method.
     */
    @jakarta.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the triggerConfigurationManagerAction method.
     */
    @jakarta.annotation.Nonnull
    public TriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction() {
        return new TriggerConfigurationManagerActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateWindowsDeviceAccount method.
     */
    @jakarta.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the users property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderScan method.
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderUpdateSignatures method.
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsProtectionState property of the microsoft.graph.managedDevice entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipe method.
     */
    @jakarta.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property managedDevices for users
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property managedDevices for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The managed devices associated with the user.
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get() {
        return get(null);
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body The request body
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedDevice
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property managedDevices for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedDevices for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The managed devices associated with the user.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ManagedDeviceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedDeviceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The managed devices associated with the user.
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
