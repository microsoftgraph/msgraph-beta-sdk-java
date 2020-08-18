// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequest;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsProtectionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseRequestBuilder;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverrideComplianceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEnableLostModeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDevicePlayLostModeSoundRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceSetDeviceNameRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRotateFileVaultKeyRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceLogCollectionRequest;
import com.microsoft.graph.requests.extensions.IManagedDeviceCreateDeviceLogCollectionRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRetireRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWipeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceResetPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRemoteLockRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceDisableLostModeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceLocateDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceBypassActivationLockRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRebootNowRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceShutDownRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRecoverPasscodeRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceSyncDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderScanRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRevokeAppleVppLicensesRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRotateBitLockerKeysRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.models.extensions.ConfigurationManagerAction;
import com.microsoft.graph.requests.extensions.IManagedDeviceTriggerConfigurationManagerActionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceGetNonCompliantSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceGetFileVaultKeyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Request Builder.
 */
public interface IManagedDeviceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    ISecurityBaselineStateCollectionRequestBuilder securityBaselineStates();

    ISecurityBaselineStateRequestBuilder securityBaselineStates(final String id);

    IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates();

    IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id);

    IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates();

    IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id);

    IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder managedDeviceMobileAppConfigurationStates();

    IManagedDeviceMobileAppConfigurationStateRequestBuilder managedDeviceMobileAppConfigurationStates(final String id);

    IDetectedAppCollectionWithReferencesRequestBuilder detectedApps();

    IDetectedAppWithReferenceRequestBuilder detectedApps(final String id);

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    IDeviceCategoryRequestBuilder deviceCategory();

    /**
     * Gets the request builder for WindowsProtectionState
     *
     * @return the IWindowsProtectionStateRequestBuilder instance
     */
    IWindowsProtectionStateRequestBuilder windowsProtectionState();

    IUserCollectionRequestBuilder users();

    IUserRequestBuilder users(final String id);

    IDeviceLogCollectionResponseCollectionRequestBuilder logCollectionRequests();

    IDeviceLogCollectionResponseRequestBuilder logCollectionRequests(final String id);
    IManagedDeviceOverrideComplianceStateRequestBuilder overrideComplianceState(final AdministratorConfiguredDeviceComplianceState complianceState, final String remediationUrl);
    IManagedDeviceEnableLostModeRequestBuilder enableLostMode(final String message, final String phoneNumber, final String footer);
    IManagedDevicePlayLostModeSoundRequestBuilder playLostModeSound();
    IManagedDeviceSetDeviceNameRequestBuilder setDeviceName(final String deviceName);
    IManagedDeviceRotateFileVaultKeyRequestBuilder rotateFileVaultKey();
    IManagedDeviceCreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest(final DeviceLogCollectionRequest templateType);
    IManagedDeviceRetireRequestBuilder retire();
    IManagedDeviceWipeRequestBuilder wipe(final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode, final Boolean useProtectedWipe);
    IManagedDeviceResetPasscodeRequestBuilder resetPasscode();
    IManagedDeviceRemoteLockRequestBuilder remoteLock();
    IManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance();
    IManagedDeviceDisableLostModeRequestBuilder disableLostMode();
    IManagedDeviceLocateDeviceRequestBuilder locateDevice();
    IManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock();
    IManagedDeviceRebootNowRequestBuilder rebootNow();
    IManagedDeviceShutDownRequestBuilder shutDown();
    IManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode();
    IManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(final Boolean keepUserData);
    IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser();
    IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(final String userPrincipalName);
    IManagedDeviceSyncDeviceRequestBuilder syncDevice();
    IManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(final Boolean quickScan);
    IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures();
    IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(final UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter);
    IManagedDeviceRevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses();
    IManagedDeviceRotateBitLockerKeysRequestBuilder rotateBitLockerKeys();
    IManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(final String notificationTitle, final String notificationBody);
    IManagedDeviceTriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction(final ConfigurationManagerAction configurationManagerAction);

    IManagedDeviceGetNonCompliantSettingsCollectionRequestBuilder getNonCompliantSettings();
    IManagedDeviceGetFileVaultKeyRequestBuilder getFileVaultKey();

}
