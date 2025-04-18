package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Remote actions Intune supports.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemoteAction implements ValuedEnum {
    /** Indicate user initiates an unknown action. */
    Unknown("unknown"),
    /** Indicate user initiates an action to factory reset a device.  */
    FactoryReset("factoryReset"),
    /** Indicate user initiates an action to remove company data from a device.  */
    RemoveCompanyData("removeCompanyData"),
    /** Indicate user initiates an action to remove the passcode of an iOS device, or reset the passcode of Android / Windows device.  */
    ResetPasscode("resetPasscode"),
    /** Indicate user initiates an action to remote lock a device. */
    RemoteLock("remoteLock"),
    /** Indicate user initiates an action to enable lost mode on a supervised iOS device. */
    EnableLostMode("enableLostMode"),
    /** Indicate user initiates an action to disable lost mode on a supervised iOS device. */
    DisableLostMode("disableLostMode"),
    /** Indicate user initiates an action to locate a supervised iOS device. */
    LocateDevice("locateDevice"),
    /** Indicate user initiates an action to reboot the device. */
    RebootNow("rebootNow"),
    /** Indicate user initiates an action to reset the pin for passport for work on windows phone device. */
    RecoverPasscode("recoverPasscode"),
    /** Indicate user initiates an action to clean up windows device. */
    CleanWindowsDevice("cleanWindowsDevice"),
    /** Indicate user initiates an action to log out current user on shared apple device. */
    LogoutSharedAppleDeviceActiveUser("logoutSharedAppleDeviceActiveUser"),
    /** Indicate user initiates an action to run quick scan on device. */
    QuickScan("quickScan"),
    /** Indicate user initiates an action to run full scan on device. */
    FullScan("fullScan"),
    /** Indicate user initiates an action to update malware signatures on device. */
    WindowsDefenderUpdateSignatures("windowsDefenderUpdateSignatures"),
    /** Indicate user initiates an action remote wipe device with keeping enrollment data. */
    FactoryResetKeepEnrollmentData("factoryResetKeepEnrollmentData"),
    /** Indicate user initiates an action to update account on device. */
    UpdateDeviceAccount("updateDeviceAccount"),
    /** Indicate user initiates an action to automatic redeploy the device */
    AutomaticRedeployment("automaticRedeployment"),
    /** Indicate user initiates an action to shut down the device. */
    ShutDown("shutDown"),
    /** Indicate user initiates an action to Rotate BitLockerKeys on the device. */
    RotateBitLockerKeys("rotateBitLockerKeys"),
    /** Indicate user initiates an action to Rotate FileVaultKey on mac. */
    RotateFileVaultKey("rotateFileVaultKey"),
    /** Indicate user initiates an action to Get FileVaultKey on mac. */
    GetFileVaultKey("getFileVaultKey"),
    /** Indicate user initiates an action to Set Device Name on the device. */
    SetDeviceName("setDeviceName"),
    /** Indicate user initiates an action to Activate eSIM on the device. */
    ActivateDeviceEsim("activateDeviceEsim"),
    /** Indicate user initiates an action to deprovision the device. */
    Deprovision("deprovision"),
    /** Indicate user initiates an action to disable the device. */
    Disable("disable"),
    /** Indicate user initiates an action to reenable the device. */
    Reenable("reenable"),
    /** Indicate user initiates an action to move the device to a new organizational unit. */
    MoveDeviceToOrganizationalUnit("moveDeviceToOrganizationalUnit"),
    /** Add device action of InitiateMobileDeviceManagementKeyRecovery */
    InitiateMobileDeviceManagementKeyRecovery("initiateMobileDeviceManagementKeyRecovery"),
    /** Add device action of InitiateOnDemandProactiveRemediation */
    InitiateOnDemandProactiveRemediation("initiateOnDemandProactiveRemediation"),
    /** Add device action of RotateLocalAdminPassword */
    RotateLocalAdminPassword("rotateLocalAdminPassword"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Add device action of Remote Help Launch */
    LaunchRemoteHelp("launchRemoteHelp"),
    /** Revoke all Apple Vpp licenses for a device */
    RevokeAppleVppLicenses("revokeAppleVppLicenses"),
    /** Indicate IT Admin initiates an action to remove devices from Device Firmware Configuration Interface management */
    RemoveDeviceFirmwareConfigurationInterfaceManagement("removeDeviceFirmwareConfigurationInterfaceManagement"),
    /** Indicates an action has been initiated to pause configuration refresh for the device. */
    PauseConfigurationRefresh("pauseConfigurationRefresh"),
    /** Indicates remote device action to intiate Mobile Device Management (MDM) attestation if device is capable for it. */
    InitiateDeviceAttestation("initiateDeviceAttestation"),
    /** Indicates remote device action to override assignments for a Device. */
    ChangeAssignments("changeAssignments"),
    /** Indicates remote device action to delete a device from Intune portal. */
    Delete("delete");
    public final String value;
    RemoteAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemoteAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "factoryReset": return FactoryReset;
            case "removeCompanyData": return RemoveCompanyData;
            case "resetPasscode": return ResetPasscode;
            case "remoteLock": return RemoteLock;
            case "enableLostMode": return EnableLostMode;
            case "disableLostMode": return DisableLostMode;
            case "locateDevice": return LocateDevice;
            case "rebootNow": return RebootNow;
            case "recoverPasscode": return RecoverPasscode;
            case "cleanWindowsDevice": return CleanWindowsDevice;
            case "logoutSharedAppleDeviceActiveUser": return LogoutSharedAppleDeviceActiveUser;
            case "quickScan": return QuickScan;
            case "fullScan": return FullScan;
            case "windowsDefenderUpdateSignatures": return WindowsDefenderUpdateSignatures;
            case "factoryResetKeepEnrollmentData": return FactoryResetKeepEnrollmentData;
            case "updateDeviceAccount": return UpdateDeviceAccount;
            case "automaticRedeployment": return AutomaticRedeployment;
            case "shutDown": return ShutDown;
            case "rotateBitLockerKeys": return RotateBitLockerKeys;
            case "rotateFileVaultKey": return RotateFileVaultKey;
            case "getFileVaultKey": return GetFileVaultKey;
            case "setDeviceName": return SetDeviceName;
            case "activateDeviceEsim": return ActivateDeviceEsim;
            case "deprovision": return Deprovision;
            case "disable": return Disable;
            case "reenable": return Reenable;
            case "moveDeviceToOrganizationalUnit": return MoveDeviceToOrganizationalUnit;
            case "initiateMobileDeviceManagementKeyRecovery": return InitiateMobileDeviceManagementKeyRecovery;
            case "initiateOnDemandProactiveRemediation": return InitiateOnDemandProactiveRemediation;
            case "rotateLocalAdminPassword": return RotateLocalAdminPassword;
            case "unknownFutureValue": return UnknownFutureValue;
            case "launchRemoteHelp": return LaunchRemoteHelp;
            case "revokeAppleVppLicenses": return RevokeAppleVppLicenses;
            case "removeDeviceFirmwareConfigurationInterfaceManagement": return RemoveDeviceFirmwareConfigurationInterfaceManagement;
            case "pauseConfigurationRefresh": return PauseConfigurationRefresh;
            case "initiateDeviceAttestation": return InitiateDeviceAttestation;
            case "changeAssignments": return ChangeAssignments;
            case "delete": return Delete;
            default: return null;
        }
    }
}
