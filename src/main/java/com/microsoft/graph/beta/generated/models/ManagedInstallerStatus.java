package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * ManagedInstallerStatus
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedInstallerStatus implements ValuedEnum {
    /** Managed Installer is Disabled */
    Disabled("disabled"),
    /** Managed Installer is Enabled */
    Enabled("enabled");
    public final String value;
    ManagedInstallerStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedInstallerStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
