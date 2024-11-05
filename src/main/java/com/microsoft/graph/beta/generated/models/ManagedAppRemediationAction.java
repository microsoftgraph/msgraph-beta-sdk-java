package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An admin initiated action to be applied on a managed app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppRemediationAction implements ValuedEnum {
    /** Indicates the user will be blocked from accessing the app and corporate data */
    Block("block"),
    /** Indicates the corporate data will be removed from the app */
    Wipe("wipe"),
    /** Indicates user will be warned the when accessing the app */
    Warn("warn"),
    /** Indicates user will be blocked from accessing the app and corporate data if devices supports this setting */
    BlockWhenSettingIsSupported("blockWhenSettingIsSupported");
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
            case "blockWhenSettingIsSupported": return BlockWhenSettingIsSupported;
            default: return null;
        }
    }
}
