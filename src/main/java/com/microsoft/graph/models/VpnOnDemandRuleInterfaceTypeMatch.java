package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * VPN On-Demand Rule Connection network interface type.
 */
public enum VpnOnDemandRuleInterfaceTypeMatch implements ValuedEnum {
    /** NotConfigured */
    NotConfigured("notConfigured"),
    /** Ethernet. */
    Ethernet("ethernet"),
    /** WiFi. */
    WiFi("wiFi"),
    /** Cellular. */
    Cellular("cellular");
    public final String value;
    VpnOnDemandRuleInterfaceTypeMatch(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnOnDemandRuleInterfaceTypeMatch forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "ethernet": return Ethernet;
            case "wiFi": return WiFi;
            case "cellular": return Cellular;
            default: return null;
        }
    }
}
