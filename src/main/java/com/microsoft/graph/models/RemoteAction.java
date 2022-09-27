package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RemoteAction implements ValuedEnum {
    /** User initiates an unknown action. */
    Unknown("unknown"),
    /** User initiates an action to factory reset a device.  */
    FactoryReset("factoryReset"),
    /** User initiates an action to remove company data from a device.  */
    RemoveCompanyData("removeCompanyData"),
    /** User initiates an action to remove the passcode of an iOS device, or reset the passcode of Android / Windows device.  */
    ResetPasscode("resetPasscode"),
    /** User initiates an action to remote lock a device. */
    RemoteLock("remoteLock"),
    /** User initiates an action to enable lost mode on a supervised iOS device. */
    EnableLostMode("enableLostMode"),
    /** User initiates an action to disable lost mode on a supervised iOS device. */
    DisableLostMode("disableLostMode"),
    /** User initiates an action to locate a supervised iOS device. */
    LocateDevice("locateDevice"),
    /** User initiates an action to reboot a Windows device. */
    RebootNow("rebootNow"),
    /** User initiates an action to reset the pin for passport for work on windows phone device. */
    RecoverPasscode("recoverPasscode"),
    /** User initiates an action to clean up windows device. */
    CleanWindowsDevice("cleanWindowsDevice"),
    /** User initiates an action to log out current user on shared apple device. */
    LogoutSharedAppleDeviceActiveUser("logoutSharedAppleDeviceActiveUser"),
    /** User initiates an action to run quick scan on device. */
    QuickScan("quickScan"),
    /** User initiates an action to run full scan on device. */
    FullScan("fullScan"),
    /** User initiates an action to update malware signatures on device. */
    WindowsDefenderUpdateSignatures("windowsDefenderUpdateSignatures"),
    /** User initiates an action remote wipe device with keeping enrollment data. */
    FactoryResetKeepEnrollmentData("factoryResetKeepEnrollmentData"),
    /** User initiates an action to update account on device. */
    UpdateDeviceAccount("updateDeviceAccount"),
    /** User initiates an action to automatice redeploy the device */
    AutomaticRedeployment("automaticRedeployment"),
    /** User initiates an action to shut down the device. */
    ShutDown("shutDown"),
    /** User initiates an action to Rotate BitLockerKeys on the device. */
    RotateBitLockerKeys("rotateBitLockerKeys"),
    /** User initiates an action to Rotate FileVaultKey on mac. */
    RotateFileVaultKey("rotateFileVaultKey"),
    /** User initiates an action to Get FileVaultKey on mac. */
    GetFileVaultKey("getFileVaultKey"),
    /** User initiates an action to Set Device Name on the device. */
    SetDeviceName("setDeviceName"),
    /** User initiates an action to Activate eSIM on the device. */
    ActivateDeviceEsim("activateDeviceEsim");
    public final String value;
    RemoteAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RemoteAction forValue(@javax.annotation.Nonnull final String searchValue) {
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
            default: return null;
        }
    }
}
