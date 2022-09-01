package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the executeAction method. */
public enum ManagedDeviceRemoteAction implements ValuedEnum {
    Retire("retire"),
    Delete("delete"),
    FullScan("fullScan"),
    QuickScan("quickScan"),
    SignatureUpdate("signatureUpdate"),
    Wipe("wipe"),
    CustomTextNotification("customTextNotification"),
    RebootNow("rebootNow"),
    SetDeviceName("setDeviceName"),
    SyncDevice("syncDevice"),
    /** Name of the deprovision action. */
    Deprovision("deprovision"),
    /** Name of the disable action. */
    Disable("disable"),
    /** Name of the reenable action. */
    Reenable("reenable"),
    /** Name of the moveDevicesToOU action. */
    MoveDeviceToOrganizationalUnit("moveDeviceToOrganizationalUnit"),
    /** Name of action to Activate eSIM on the device. */
    ActivateDeviceEsim("activateDeviceEsim"),
    /** Name of the collectDiagnostics action. */
    CollectDiagnostics("collectDiagnostics");
    public final String value;
    ManagedDeviceRemoteAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedDeviceRemoteAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "retire": return Retire;
            case "delete": return Delete;
            case "fullScan": return FullScan;
            case "quickScan": return QuickScan;
            case "signatureUpdate": return SignatureUpdate;
            case "wipe": return Wipe;
            case "customTextNotification": return CustomTextNotification;
            case "rebootNow": return RebootNow;
            case "setDeviceName": return SetDeviceName;
            case "syncDevice": return SyncDevice;
            case "deprovision": return Deprovision;
            case "disable": return Disable;
            case "reenable": return Reenable;
            case "moveDeviceToOrganizationalUnit": return MoveDeviceToOrganizationalUnit;
            case "activateDeviceEsim": return ActivateDeviceEsim;
            case "collectDiagnostics": return CollectDiagnostics;
            default: return null;
        }
    }
}
