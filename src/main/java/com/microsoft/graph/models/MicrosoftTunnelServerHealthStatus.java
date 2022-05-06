package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum MicrosoftTunnelServerHealthStatus implements ValuedEnum {
    Unknown("unknown"),
    Healthy("healthy"),
    Unhealthy("unhealthy"),
    Warning("warning"),
    Offline("offline"),
    UpgradeInProgress("upgradeInProgress"),
    UpgradeFailed("upgradeFailed");
    public final String value;
    MicrosoftTunnelServerHealthStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftTunnelServerHealthStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "healthy": return Healthy;
            case "unhealthy": return Unhealthy;
            case "warning": return Warning;
            case "offline": return Offline;
            case "upgradeInProgress": return UpgradeInProgress;
            case "upgradeFailed": return UpgradeFailed;
            default: return null;
        }
    }
}
