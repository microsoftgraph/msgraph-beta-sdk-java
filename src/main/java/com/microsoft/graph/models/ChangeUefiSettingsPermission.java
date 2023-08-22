package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the permission level granted to users to enable them change Uefi settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChangeUefiSettingsPermission implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfiguredOnly("notConfiguredOnly"),
    /** Prevent change of UEFI setting permission */
    None("none");
    public final String value;
    ChangeUefiSettingsPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChangeUefiSettingsPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfiguredOnly": return NotConfiguredOnly;
            case "none": return None;
            default: return null;
        }
    }
}
