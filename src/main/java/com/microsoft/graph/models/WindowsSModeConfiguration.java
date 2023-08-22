package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The possible options to configure S mode unlock
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsSModeConfiguration implements ValuedEnum {
    /** This option will remove all restrictions to unlock S mode - default */
    NoRestriction("noRestriction"),
    /** This option will block the user to unlock the device from S mode */
    Block("block"),
    /** This option will unlock the device from S mode */
    Unlock("unlock");
    public final String value;
    WindowsSModeConfiguration(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsSModeConfiguration forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noRestriction": return NoRestriction;
            case "block": return Block;
            case "unlock": return Unlock;
            default: return null;
        }
    }
}
