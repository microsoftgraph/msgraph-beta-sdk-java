package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ConfigurationManagerClientState implements ValuedEnum {
    Unknown("unknown"),
    Installed("installed"),
    Healthy("healthy"),
    InstallFailed("installFailed"),
    UpdateFailed("updateFailed"),
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
