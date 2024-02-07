package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * MacOS Software Update State
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSoftwareUpdateState implements ValuedEnum {
    /** The software update successfully installed */
    Success("success"),
    /** The software update is being downloaded */
    Downloading("downloading"),
    /** The software update has been downloaded */
    Downloaded("downloaded"),
    /** The software update is being installed */
    Installing("installing"),
    /** No action is being taken on this software update */
    Idle("idle"),
    /** The software update is available on the device */
    Available("available"),
    /** The software update has been scheduled on the device */
    Scheduled("scheduled"),
    /** The software update download has failed */
    DownloadFailed("downloadFailed"),
    /** There is not enough space to download the update */
    DownloadInsufficientSpace("downloadInsufficientSpace"),
    /** There is not enough power to download the update */
    DownloadInsufficientPower("downloadInsufficientPower"),
    /** There is insufficient network capacity to download the update */
    DownloadInsufficientNetwork("downloadInsufficientNetwork"),
    /** There is not enough space to install the update */
    InstallInsufficientSpace("installInsufficientSpace"),
    /** There is not enough power to install the update */
    InstallInsufficientPower("installInsufficientPower"),
    /** Installation has failed for an unspecified reason */
    InstallFailed("installFailed"),
    /** The schedule update command has failed for an unspecified reason */
    CommandFailed("commandFailed");
    public final String value;
    MacOSSoftwareUpdateState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSoftwareUpdateState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "downloading": return Downloading;
            case "downloaded": return Downloaded;
            case "installing": return Installing;
            case "idle": return Idle;
            case "available": return Available;
            case "scheduled": return Scheduled;
            case "downloadFailed": return DownloadFailed;
            case "downloadInsufficientSpace": return DownloadInsufficientSpace;
            case "downloadInsufficientPower": return DownloadInsufficientPower;
            case "downloadInsufficientNetwork": return DownloadInsufficientNetwork;
            case "installInsufficientSpace": return InstallInsufficientSpace;
            case "installInsufficientPower": return InstallInsufficientPower;
            case "installFailed": return InstallFailed;
            case "commandFailed": return CommandFailed;
            default: return null;
        }
    }
}
