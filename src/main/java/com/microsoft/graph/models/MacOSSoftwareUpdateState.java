package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum MacOSSoftwareUpdateState implements ValuedEnum {
    Success("success"),
    Downloading("downloading"),
    Downloaded("downloaded"),
    Installing("installing"),
    Idle("idle"),
    Available("available"),
    Scheduled("scheduled"),
    DownloadFailed("downloadFailed"),
    DownloadInsufficientSpace("downloadInsufficientSpace"),
    DownloadInsufficientPower("downloadInsufficientPower"),
    DownloadInsufficientNetwork("downloadInsufficientNetwork"),
    InstallInsufficientSpace("installInsufficientSpace"),
    InstallInsufficientPower("installInsufficientPower"),
    InstallFailed("installFailed"),
    CommandFailed("commandFailed");
    public final String value;
    MacOSSoftwareUpdateState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSoftwareUpdateState forValue(@javax.annotation.Nonnull final String searchValue) {
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
