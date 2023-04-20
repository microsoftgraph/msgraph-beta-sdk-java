package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Configuration manager client state */
public enum ConfigurationManagerClientState implements ValuedEnum {
    /** Configuration manager agent is older than 1806 or not installed or this device has not checked into Intune for over 30 days. */
    Unknown("unknown"),
    /** The configuration manager agent is installed but may not be showing up in the configuration manager console yet. Wait a few hours for it to refresh. */
    Installed("installed"),
    /** This device was able to check in with the configuration manager service successfully. */
    Healthy("healthy"),
    /** The configuration manager agent failed to install. */
    InstallFailed("installFailed"),
    /** The update from version x to version y of the configuration manager agent failed.  */
    UpdateFailed("updateFailed"),
    /** The configuration manager agent was able to reach the configuration manager service in the past but is now no longer able to.  */
    CommunicationError("communicationError");
    public final String value;
    ConfigurationManagerClientState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConfigurationManagerClientState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "installed": return Installed;
            case "healthy": return Healthy;
            case "installFailed": return InstallFailed;
            case "updateFailed": return UpdateFailed;
            case "communicationError": return CommunicationError;
            default: return null;
        }
    }
}
