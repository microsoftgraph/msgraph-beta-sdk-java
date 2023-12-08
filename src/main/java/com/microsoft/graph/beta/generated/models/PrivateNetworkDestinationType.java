package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivateNetworkDestinationType implements ValuedEnum {
    IpAddress("ipAddress"),
    IpRange("ipRange"),
    IpRangeCidr("ipRangeCidr"),
    Fqdn("fqdn"),
    DnsSuffix("dnsSuffix"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivateNetworkDestinationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivateNetworkDestinationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ipAddress": return IpAddress;
            case "ipRange": return IpRange;
            case "ipRangeCidr": return IpRangeCidr;
            case "fqdn": return Fqdn;
            case "dnsSuffix": return DnsSuffix;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
