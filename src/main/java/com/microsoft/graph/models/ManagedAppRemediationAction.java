package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An admin initiated action to be applied on a managed app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppRemediationAction implements ValuedEnum {
    /** app and the corresponding company data to be blocked */
    Block("block"),
    /** app and the corresponding company data to be wiped */
    Wipe("wipe"),
    /** app and the corresponding user to be warned */
    Warn("warn");
    public final String value;
    ManagedAppRemediationAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppRemediationAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "wipe": return Wipe;
            case "warn": return Warn;
            default: return null;
        }
    }
}
