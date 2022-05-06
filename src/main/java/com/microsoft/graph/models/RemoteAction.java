package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RemoteAction implements ValuedEnum {
    Unknown("unknown"),
    FactoryReset("factoryReset"),
    RemoveCompanyData("removeCompanyData"),
    ResetPasscode("resetPasscode"),
    RemoteLock("remoteLock"),
    EnableLostMode("enableLostMode"),
    DisableLostMode("disableLostMode"),
    LocateDevice("locateDevice"),
    RebootNow("rebootNow"),
    RecoverPasscode("recoverPasscode"),
    CleanWindowsDevice("cleanWindowsDevice"),
    LogoutSharedAppleDeviceActiveUser("logoutSharedAppleDeviceActiveUser"),
    QuickScan("quickScan"),
    FullScan("fullScan"),
    WindowsDefenderUpdateSignatures("windowsDefenderUpdateSignatures"),
    FactoryResetKeepEnrollmentData("factoryResetKeepEnrollmentData"),
    UpdateDeviceAccount("updateDeviceAccount"),
    AutomaticRedeployment("automaticRedeployment"),
    ShutDown("shutDown"),
    RotateBitLockerKeys("rotateBitLockerKeys"),
    RotateFileVaultKey("rotateFileVaultKey"),
    GetFileVaultKey("getFileVaultKey"),
    SetDeviceName("setDeviceName"),
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
