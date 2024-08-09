package com.microsoft.graph.beta.devicemanagement.comanageddevices.item;

import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.activatedeviceesim.ActivateDeviceEsimRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.assignmentfilterevaluationstatusdetails.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.changeassignments.ChangeAssignmentsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.createdevicelogcollectionrequest.CreateDeviceLogCollectionRequestRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.deprovision.DeprovisionRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.devicehealthscriptstates.DeviceHealthScriptStatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.disable.DisableRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.enablelostmode.EnableLostModeRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.enrollnowaction.EnrollNowActionRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.getcloudpcremoteactionresults.GetCloudPcRemoteActionResultsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.getcloudpcreviewstatus.GetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.getfilevaultkey.GetFileVaultKeyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.getnoncompliantsettings.GetNonCompliantSettingsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.initiatedeviceattestation.InitiateDeviceAttestationRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.initiatemobiledevicemanagementkeyrecovery.InitiateMobileDeviceManagementKeyRecoveryRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.initiateondemandproactiveremediation.InitiateOnDemandProactiveRemediationRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.manageddevicemobileappconfigurationstates.ManagedDeviceMobileAppConfigurationStatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.overridecompliancestate.OverrideComplianceStateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.pauseconfigurationrefresh.PauseConfigurationRefreshRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.playlostmodesound.PlayLostModeSoundRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.rebootnow.RebootNowRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.reenable.ReenableRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.remotelock.RemoteLockRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.removedevicefirmwareconfigurationinterfacemanagement.RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.reprovisioncloudpc.ReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.resizecloudpc.ResizeCloudPcRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.restorecloudpc.RestoreCloudPcRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.retire.RetireRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.revokeapplevpplicenses.RevokeAppleVppLicensesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.rotatebitlockerkeys.RotateBitLockerKeysRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.rotatefilevaultkey.RotateFileVaultKeyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.rotatelocaladminpassword.RotateLocalAdminPasswordRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.securitybaselinestates.SecurityBaselineStatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.sendcustomnotificationtocompanyportal.SendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.setcloudpcreviewstatus.SetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.setdevicename.SetDeviceNameRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.shutdown.ShutDownRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.syncdevice.SyncDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.triggerconfigurationmanageraction.TriggerConfigurationManagerActionRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.updatewindowsdeviceaccount.UpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.users.UsersRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.windowsdefenderscan.WindowsDefenderScanRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.windowsdefenderupdatesignatures.WindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.windowsprotectionstate.WindowsProtectionStateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.comanageddevices.item.wipe.WipeRequestBuilder;
import com.microsoft.graph.beta.models.ManagedDevice;
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
 * Provides operations to manage the comanagedDevices property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the activateDeviceEsim method.
     * @return a {@link ActivateDeviceEsimRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivateDeviceEsimRequestBuilder activateDeviceEsim() {
        return new ActivateDeviceEsimRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentFilterEvaluationStatusDetails property of the microsoft.graph.managedDevice entity.
     * @return a {@link AssignmentFilterEvaluationStatusDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bypassActivationLock method.
     * @return a {@link BypassActivationLockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changeAssignments method.
     * @return a {@link ChangeAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeAssignmentsRequestBuilder changeAssignments() {
        return new ChangeAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cleanWindowsDevice method.
     * @return a {@link CleanWindowsDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createDeviceLogCollectionRequest method.
     * @return a {@link CreateDeviceLogCollectionRequestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest() {
        return new CreateDeviceLogCollectionRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deleteUserFromSharedAppleDevice method.
     * @return a {@link DeleteUserFromSharedAppleDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deprovision method.
     * @return a {@link DeprovisionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeprovisionRequestBuilder deprovision() {
        return new DeprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the detectedApps property of the microsoft.graph.managedDevice entity.
     * @return a {@link DetectedAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCategory property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicyStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceCompliancePolicyStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurationStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceConfigurationStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceHealthScriptStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceHealthScriptStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceHealthScriptStatesRequestBuilder deviceHealthScriptStates() {
        return new DeviceHealthScriptStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disable method.
     * @return a {@link DisableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disableLostMode method.
     * @return a {@link DisableLostModeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enableLostMode method.
     * @return a {@link EnableLostModeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableLostModeRequestBuilder enableLostMode() {
        return new EnableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enrollNowAction method.
     * @return a {@link EnrollNowActionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnrollNowActionRequestBuilder enrollNowAction() {
        return new EnrollNowActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcRemoteActionResults method.
     * @return a {@link GetCloudPcRemoteActionResultsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcRemoteActionResultsRequestBuilder getCloudPcRemoteActionResults() {
        return new GetCloudPcRemoteActionResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcReviewStatus method.
     * @return a {@link GetCloudPcReviewStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcReviewStatusRequestBuilder getCloudPcReviewStatus() {
        return new GetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFileVaultKey method.
     * @return a {@link GetFileVaultKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFileVaultKeyRequestBuilder getFileVaultKey() {
        return new GetFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getNonCompliantSettings method.
     * @return a {@link GetNonCompliantSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetNonCompliantSettingsRequestBuilder getNonCompliantSettings() {
        return new GetNonCompliantSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the initiateDeviceAttestation method.
     * @return a {@link InitiateDeviceAttestationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InitiateDeviceAttestationRequestBuilder initiateDeviceAttestation() {
        return new InitiateDeviceAttestationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the initiateMobileDeviceManagementKeyRecovery method.
     * @return a {@link InitiateMobileDeviceManagementKeyRecoveryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InitiateMobileDeviceManagementKeyRecoveryRequestBuilder initiateMobileDeviceManagementKeyRecovery() {
        return new InitiateMobileDeviceManagementKeyRecoveryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the initiateOnDemandProactiveRemediation method.
     * @return a {@link InitiateOnDemandProactiveRemediationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InitiateOnDemandProactiveRemediationRequestBuilder initiateOnDemandProactiveRemediation() {
        return new InitiateOnDemandProactiveRemediationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the locateDevice method.
     * @return a {@link LocateDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the logCollectionRequests property of the microsoft.graph.managedDevice entity.
     * @return a {@link LogCollectionRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logoutSharedAppleDeviceActiveUser method.
     * @return a {@link LogoutSharedAppleDeviceActiveUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceMobileAppConfigurationStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link ManagedDeviceMobileAppConfigurationStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStatesRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the overrideComplianceState method.
     * @return a {@link OverrideComplianceStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OverrideComplianceStateRequestBuilder overrideComplianceState() {
        return new OverrideComplianceStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pauseConfigurationRefresh method.
     * @return a {@link PauseConfigurationRefreshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PauseConfigurationRefreshRequestBuilder pauseConfigurationRefresh() {
        return new PauseConfigurationRefreshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the playLostModeSound method.
     * @return a {@link PlayLostModeSoundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlayLostModeSoundRequestBuilder playLostModeSound() {
        return new PlayLostModeSoundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rebootNow method.
     * @return a {@link RebootNowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recoverPasscode method.
     * @return a {@link RecoverPasscodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reenable method.
     * @return a {@link ReenableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReenableRequestBuilder reenable() {
        return new ReenableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the remoteLock method.
     * @return a {@link RemoteLockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeDeviceFirmwareConfigurationInterfaceManagement method.
     * @return a {@link RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder removeDeviceFirmwareConfigurationInterfaceManagement() {
        return new RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprovisionCloudPc method.
     * @return a {@link ReprovisionCloudPcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the requestRemoteAssistance method.
     * @return a {@link RequestRemoteAssistanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetPasscode method.
     * @return a {@link ResetPasscodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resizeCloudPc method.
     * @return a {@link ResizeCloudPcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResizeCloudPcRequestBuilder resizeCloudPc() {
        return new ResizeCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restoreCloudPc method.
     * @return a {@link RestoreCloudPcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreCloudPcRequestBuilder restoreCloudPc() {
        return new RestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retire method.
     * @return a {@link RetireRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeAppleVppLicenses method.
     * @return a {@link RevokeAppleVppLicensesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new RevokeAppleVppLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateBitLockerKeys method.
     * @return a {@link RotateBitLockerKeysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new RotateBitLockerKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateFileVaultKey method.
     * @return a {@link RotateFileVaultKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new RotateFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rotateLocalAdminPassword method.
     * @return a {@link RotateLocalAdminPasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RotateLocalAdminPasswordRequestBuilder rotateLocalAdminPassword() {
        return new RotateLocalAdminPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the securityBaselineStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link SecurityBaselineStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityBaselineStatesRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendCustomNotificationToCompanyPortal method.
     * @return a {@link SendCustomNotificationToCompanyPortalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setCloudPcReviewStatus method.
     * @return a {@link SetCloudPcReviewStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus() {
        return new SetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setDeviceName method.
     * @return a {@link SetDeviceNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetDeviceNameRequestBuilder setDeviceName() {
        return new SetDeviceNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the shutDown method.
     * @return a {@link ShutDownRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncDevice method.
     * @return a {@link SyncDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the triggerConfigurationManagerAction method.
     * @return a {@link TriggerConfigurationManagerActionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction() {
        return new TriggerConfigurationManagerActionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateWindowsDeviceAccount method.
     * @return a {@link UpdateWindowsDeviceAccountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the users property of the microsoft.graph.managedDevice entity.
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderScan method.
     * @return a {@link WindowsDefenderScanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderUpdateSignatures method.
     * @return a {@link WindowsDefenderUpdateSignaturesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsProtectionState property of the microsoft.graph.managedDevice entity.
     * @return a {@link WindowsProtectionStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipe method.
     * @return a {@link WipeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ManagedDeviceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ManagedDeviceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/comanagedDevices/{managedDevice%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property comanagedDevices for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property comanagedDevices for deviceManagement
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
     * The list of co-managed devices report
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get() {
        return get(null);
    }
    /**
     * The list of co-managed devices report
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property comanagedDevices in deviceManagement
     * @param body The request body
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property comanagedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property comanagedDevices for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property comanagedDevices for deviceManagement
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
     * The list of co-managed devices report
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of co-managed devices report
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
     * Update the navigation property comanagedDevices in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property comanagedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link ManagedDeviceItemRequestBuilder}
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
     * The list of co-managed devices report
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
