package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MicrosoftTunnelServerHealthStatus implements ValuedEnum {
    /** The state is unknown */
    Unknown("unknown"),
    /** The state is healthy */
    Healthy("healthy"),
    /** The state is unhealthy */
    Unhealthy("unhealthy"),
    /** The state is warning */
    Warning("warning"),
    /** The state is offline */
    Offline("offline"),
    /** The state is upgradeInProgress */
    UpgradeInProgress("upgradeInProgress"),
    /** The state is upgradeFailed */
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
