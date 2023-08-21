package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Group Policy Configuration Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GroupPolicyConfigurationType implements ValuedEnum {
    /** The policy type does not tattoo the value, which means the value is removed allowing the original configuration value to be used. The policy type supercedes application configuration setting so the application is always aware of the value. The policy type prevents the user from modifying the value through the application's user interface. */
    Policy("policy"),
    /** The preference type does tattoo the value, which means the value is not removed from the registry. The preference type will overwrite the user configured-value and does not retain the previous value. The preference type does not prevent the user from modifying the value through the application's user interface. */
    Preference("preference");
    public final String value;
    GroupPolicyConfigurationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyConfigurationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "policy": return Policy;
            case "preference": return Preference;
            default: return null;
        }
    }
}
