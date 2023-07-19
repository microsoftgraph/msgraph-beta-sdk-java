package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ManagedDeviceRemoteAction implements ValuedEnum {
    /** Name of the retire action. */
    Retire("retire"),
    /** Name of the delete action. */
    Delete("delete"),
    /** Name of the full Scan action. */
    FullScan("fullScan"),
    /** Name of the Quick Scan action. */
    QuickScan("quickScan"),
    /** Signature Update action */
    SignatureUpdate("signatureUpdate"),
    /** Name of the wipe action. */
    Wipe("wipe"),
    /** Name of the Custom Text Notification action. */
    CustomTextNotification("customTextNotification"),
    /** Name of the reboot now action. */
    RebootNow("rebootNow"),
    /** Set Device Name action. */
    SetDeviceName("setDeviceName"),
    /** Sync Device action. */
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
    CollectDiagnostics("collectDiagnostics"),
    /** Name of action to initiate MDM key recovery */
    InitiateMobileDeviceManagementKeyRecovery("initiateMobileDeviceManagementKeyRecovery"),
    /** Name of action to initiate On Demand Proactive Remediation */
    InitiateOnDemandProactiveRemediation("initiateOnDemandProactiveRemediation"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
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
            case "initiateMobileDeviceManagementKeyRecovery": return InitiateMobileDeviceManagementKeyRecovery;
            case "initiateOnDemandProactiveRemediation": return InitiateOnDemandProactiveRemediation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
