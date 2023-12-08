package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Authentication Type Settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WifiAuthenticationType implements ValuedEnum {
    /** None */
    None("none"),
    /** User Authentication */
    User("user"),
    /** Machine Authentication */
    Machine("machine"),
    /** Machine or User Authentication */
    MachineOrUser("machineOrUser"),
    /** Guest Authentication */
    Guest("guest");
    public final String value;
    WifiAuthenticationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WifiAuthenticationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "user": return User;
            case "machine": return Machine;
            case "machineOrUser": return MachineOrUser;
            case "guest": return Guest;
            default: return null;
        }
    }
}
