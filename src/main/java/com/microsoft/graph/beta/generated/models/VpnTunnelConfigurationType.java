package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tunnels that will be present to the VPN client for configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnTunnelConfigurationType implements ValuedEnum {
    /** WiFi and Cellular Tunnels */
    WifiAndCellular("wifiAndCellular"),
    /** Cellular Tunnel Only */
    Cellular("cellular"),
    /** WiFi Tunnel Only */
    Wifi("wifi");
    public final String value;
    VpnTunnelConfigurationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnTunnelConfigurationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "wifiAndCellular": return WifiAndCellular;
            case "cellular": return Cellular;
            case "wifi": return Wifi;
            default: return null;
        }
    }
}
