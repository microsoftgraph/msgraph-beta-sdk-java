package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows 10 VPN profile target types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Windows10VpnProfileTarget implements ValuedEnum {
    /** User targeted VPN profile. */
    User("user"),
    /** Device targeted VPN profile. */
    Device("device"),
    /** AutoPilot Device targeted VPN profile. */
    AutoPilotDevice("autoPilotDevice");
    public final String value;
    Windows10VpnProfileTarget(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10VpnProfileTarget forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "device": return Device;
            case "autoPilotDevice": return AutoPilotDevice;
            default: return null;
        }
    }
}
