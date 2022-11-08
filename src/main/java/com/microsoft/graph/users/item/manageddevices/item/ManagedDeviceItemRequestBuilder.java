package com.microsoft.graph.users.item.manageddevices.item;

import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.manageddevices.item.activatedeviceesim.ActivateDeviceEsimRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.assignmentfilterevaluationstatusdetails.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.assignmentfilterevaluationstatusdetails.item.AssignmentFilterEvaluationStatusDetailsItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.createdevicelogcollectionrequest.CreateDeviceLogCollectionRequestRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.createremotehelpsession.CreateRemoteHelpSessionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deprovision.DeprovisionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.detectedapps.item.DetectedAppItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.devicecompliancepolicystates.item.DeviceCompliancePolicyStateItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.deviceconfigurationstates.item.DeviceConfigurationStateItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.disable.DisableRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.enablelostmode.EnableLostModeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.endremotehelpsession.EndRemoteHelpSessionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.enrollnowaction.EnrollNowActionRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getcloudpcremoteactionresults.GetCloudPcRemoteActionResultsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getcloudpcreviewstatus.GetCloudPcReviewStatusRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getfilevaultkey.GetFileVaultKeyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getnoncompliantsettings.GetNonCompliantSettingsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.getoemwarranty.GetOemWarrantyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.initiatemobiledevicemanagementkeyrecovery.InitiateMobileDeviceManagementKeyRecoveryRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.logcollectionrequests.item.DeviceLogCollectionResponseItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.manageddevicemobileappconfigurationstates.item.ManagedDeviceMobileAppConfigurationStateItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.manageddevicemobileappconfigurationstates.ManagedDeviceMobileAppConfigurationStatesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.overridecompliancestate.OverrideComplianceStateRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.playlostmodesound.PlayLostModeSoundRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rebootnow.RebootNowRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.reenable.ReenableRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.remotelock.RemoteLockRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.removedevicefirmwareconfigurationinterfacemanagement.RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.reprovisioncloudpc.ReprovisionCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.requestremotehelpsessionaccess.RequestRemoteHelpSessionAccessRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.resizecloudpc.ResizeCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.restorecloudpc.RestoreCloudPcRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.retire.RetireRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.retrieveremotehelpsessionwithsessionkey.RetrieveRemoteHelpSessionWithSessionKeyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.revokeapplevpplicenses.RevokeAppleVppLicensesRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rotatebitlockerkeys.RotateBitLockerKeysRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.rotatefilevaultkey.RotateFileVaultKeyRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.securitybaselinestates.item.SecurityBaselineStateItemRequestBuilder;
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
/** Provides operations to manage the managedDevices property of the microsoft.graph.user entity. */
public class ManagedDeviceItemRequestBuilder {
    /** Provides operations to call the activateDeviceEsim method. */
    @javax.annotation.Nonnull
    public ActivateDeviceEsimRequestBuilder activateDeviceEsim() {
        return new ActivateDeviceEsimRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentFilterEvaluationStatusDetails property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the bypassActivationLock method. */
    @javax.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the cleanWindowsDevice method. */
    @javax.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createDeviceLogCollectionRequest method. */
    @javax.annotation.Nonnull
    public CreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest() {
        return new CreateDeviceLogCollectionRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createRemoteHelpSession method. */
    @javax.annotation.Nonnull
    public CreateRemoteHelpSessionRequestBuilder createRemoteHelpSession() {
        return new CreateRemoteHelpSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the deleteUserFromSharedAppleDevice method. */
    @javax.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the deprovision method. */
    @javax.annotation.Nonnull
    public DeprovisionRequestBuilder deprovision() {
        return new DeprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the detectedApps property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCategory property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicyStates property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationStates property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the disable method. */
    @javax.annotation.Nonnull
    public DisableRequestBuilder disable() {
        return new DisableRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the disableLostMode method. */
    @javax.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enableLostMode method. */
    @javax.annotation.Nonnull
    public EnableLostModeRequestBuilder enableLostMode() {
        return new EnableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the endRemoteHelpSession method. */
    @javax.annotation.Nonnull
    public EndRemoteHelpSessionRequestBuilder endRemoteHelpSession() {
        return new EndRemoteHelpSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the enrollNowAction method. */
    @javax.annotation.Nonnull
    public EnrollNowActionRequestBuilder enrollNowAction() {
        return new EnrollNowActionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the initiateMobileDeviceManagementKeyRecovery method. */
    @javax.annotation.Nonnull
    public InitiateMobileDeviceManagementKeyRecoveryRequestBuilder initiateMobileDeviceManagementKeyRecovery() {
        return new InitiateMobileDeviceManagementKeyRecoveryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the locateDevice method. */
    @javax.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the logCollectionRequests property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the logoutSharedAppleDeviceActiveUser method. */
    @javax.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceMobileAppConfigurationStates property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStatesRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the overrideComplianceState method. */
    @javax.annotation.Nonnull
    public OverrideComplianceStateRequestBuilder overrideComplianceState() {
        return new OverrideComplianceStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the playLostModeSound method. */
    @javax.annotation.Nonnull
    public PlayLostModeSoundRequestBuilder playLostModeSound() {
        return new PlayLostModeSoundRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the rebootNow method. */
    @javax.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the recoverPasscode method. */
    @javax.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reenable method. */
    @javax.annotation.Nonnull
    public ReenableRequestBuilder reenable() {
        return new ReenableRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the remoteLock method. */
    @javax.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the removeDeviceFirmwareConfigurationInterfaceManagement method. */
    @javax.annotation.Nonnull
    public RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder removeDeviceFirmwareConfigurationInterfaceManagement() {
        return new RemoveDeviceFirmwareConfigurationInterfaceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reprovisionCloudPc method. */
    @javax.annotation.Nonnull
    public ReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ReprovisionCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the requestRemoteAssistance method. */
    @javax.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the requestRemoteHelpSessionAccess method. */
    @javax.annotation.Nonnull
    public RequestRemoteHelpSessionAccessRequestBuilder requestRemoteHelpSessionAccess() {
        return new RequestRemoteHelpSessionAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the resetPasscode method. */
    @javax.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the resizeCloudPc method. */
    @javax.annotation.Nonnull
    public ResizeCloudPcRequestBuilder resizeCloudPc() {
        return new ResizeCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the restoreCloudPc method. */
    @javax.annotation.Nonnull
    public RestoreCloudPcRequestBuilder restoreCloudPc() {
        return new RestoreCloudPcRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the retire method. */
    @javax.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the revokeAppleVppLicenses method. */
    @javax.annotation.Nonnull
    public RevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new RevokeAppleVppLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the rotateBitLockerKeys method. */
    @javax.annotation.Nonnull
    public RotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new RotateBitLockerKeysRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the rotateFileVaultKey method. */
    @javax.annotation.Nonnull
    public RotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new RotateFileVaultKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the securityBaselineStates property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public SecurityBaselineStatesRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sendCustomNotificationToCompanyPortal method. */
    @javax.annotation.Nonnull
    public SendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal() {
        return new SendCustomNotificationToCompanyPortalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the setCloudPcReviewStatus method. */
    @javax.annotation.Nonnull
    public SetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus() {
        return new SetCloudPcReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the setDeviceName method. */
    @javax.annotation.Nonnull
    public SetDeviceNameRequestBuilder setDeviceName() {
        return new SetDeviceNameRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the shutDown method. */
    @javax.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the syncDevice method. */
    @javax.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the triggerConfigurationManagerAction method. */
    @javax.annotation.Nonnull
    public TriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction() {
        return new TriggerConfigurationManagerActionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the updateWindowsDeviceAccount method. */
    @javax.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the users property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the windowsDefenderScan method. */
    @javax.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the windowsDefenderUpdateSignatures method. */
    @javax.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsProtectionState property of the microsoft.graph.managedDevice entity. */
    @javax.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the wipe method. */
    @javax.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentFilterEvaluationStatusDetails property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a AssignmentFilterEvaluationStatusDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AssignmentFilterEvaluationStatusDetailsItemRequestBuilder assignmentFilterEvaluationStatusDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("assignmentFilterEvaluationStatusDetails%2Did", id);
        return new AssignmentFilterEvaluationStatusDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedDeviceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/managedDevices/{managedDevice%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property managedDevices for users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedDevices for users
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
     * Update the navigation property managedDevices in users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDevice body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedDevices in users
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
        requestInfo.addRequestHeader("Accept", "application/json");
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
     * Delete navigation property managedDevices for users
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property managedDevices for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the detectedApps property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a DetectedAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DetectedAppItemRequestBuilder detectedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("detectedApp%2Did", id);
        return new DetectedAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicyStates property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicyStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyStateItemRequestBuilder deviceCompliancePolicyStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicyState%2Did", id);
        return new DeviceCompliancePolicyStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurationStates property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationStateItemRequestBuilder deviceConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationState%2Did", id);
        return new DeviceConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The managed devices associated with the user.
     * @return a CompletableFuture of managedDevice
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDevice>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The managed devices associated with the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDevice
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDevice>() {{
                this.completeExceptionally(ex);
            }};
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
     * Provides operations to manage the logCollectionRequests property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a DeviceLogCollectionResponseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceLogCollectionResponseItemRequestBuilder logCollectionRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceLogCollectionResponse%2Did", id);
        return new DeviceLogCollectionResponseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceMobileAppConfigurationStates property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationStateItemRequestBuilder managedDeviceMobileAppConfigurationStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationState%2Did", id);
        return new ManagedDeviceMobileAppConfigurationStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body 
     * @return a CompletableFuture of managedDevice
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> patch(@javax.annotation.Nonnull final ManagedDevice body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDevice>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property managedDevices in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDevice
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDevice> patch(@javax.annotation.Nonnull final ManagedDevice body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDevice::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDevice>() {{
                this.completeExceptionally(ex);
            }};
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
     * Provides operations to manage the securityBaselineStates property of the microsoft.graph.managedDevice entity.
     * @param id Unique identifier of the item
     * @return a SecurityBaselineStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecurityBaselineStateItemRequestBuilder securityBaselineStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
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
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedDeviceItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The managed devices associated with the user. */
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
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedDeviceItemRequestBuilderGetQueryParameters queryParameters = new ManagedDeviceItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
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
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedDeviceItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
