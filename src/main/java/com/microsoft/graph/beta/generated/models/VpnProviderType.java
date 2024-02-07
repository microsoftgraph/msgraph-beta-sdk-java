package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Provider type for per-app VPN.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnProviderType implements ValuedEnum {
    /** Tunnel traffic is not explicitly configured. */
    NotConfigured("notConfigured"),
    /** Tunnel traffic at the application layer. */
    AppProxy("appProxy"),
    /** Tunnel traffic at the IP layer. */
    PacketTunnel("packetTunnel");
    public final String value;
    VpnProviderType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnProviderType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "appProxy": return AppProxy;
            case "packetTunnel": return PacketTunnel;
            default: return null;
        }
    }
}
