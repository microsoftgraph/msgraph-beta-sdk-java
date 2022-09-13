package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnOnDemandRuleInterfaceTypeMatch forValue(@javax.annotation.Nonnull final String searchValue) {
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
