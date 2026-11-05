package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceClientSubstate implements ValuedEnum {
    Deferred("deferred"),
    OfferReady("offerReady"),
    Paused("paused"),
    OfferReceived("offerReceived"),
    DownloadStart("downloadStart"),
    DownloadComplete("downloadComplete"),
    InstallStart("installStart"),
    InstallComplete("installComplete"),
    RestartRequired("restartRequired"),
    RestartInitiated("restartInitiated"),
    RestartComplete("restartComplete"),
    UpdateInstalled("updateInstalled"),
    RollbackComplete("rollbackComplete"),
    UserCancelled("userCancelled"),
    DeviceCancelled("deviceCancelled"),
    Uninstall("uninstall"),
    Rollback("rollback"),
    UpdateUninstalled("updateUninstalled"),
    NotSupported("notSupported"),
    PreviousUpdateInProgress("previousUpdateInProgress"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceClientSubstate(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceClientSubstate forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deferred": return Deferred;
            case "offerReady": return OfferReady;
            case "paused": return Paused;
            case "offerReceived": return OfferReceived;
            case "downloadStart": return DownloadStart;
            case "downloadComplete": return DownloadComplete;
            case "installStart": return InstallStart;
            case "installComplete": return InstallComplete;
            case "restartRequired": return RestartRequired;
            case "restartInitiated": return RestartInitiated;
            case "restartComplete": return RestartComplete;
            case "updateInstalled": return UpdateInstalled;
            case "rollbackComplete": return RollbackComplete;
            case "userCancelled": return UserCancelled;
            case "deviceCancelled": return DeviceCancelled;
            case "uninstall": return Uninstall;
            case "rollback": return Rollback;
            case "updateUninstalled": return UpdateUninstalled;
            case "notSupported": return NotSupported;
            case "previousUpdateInProgress": return PreviousUpdateInProgress;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
