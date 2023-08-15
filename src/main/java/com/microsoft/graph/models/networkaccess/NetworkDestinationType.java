package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum NetworkDestinationType implements ValuedEnum {
    Url("url"),
    Fqdn("fqdn"),
    IpAddress("ipAddress"),
    IpRange("ipRange"),
    IpSubnet("ipSubnet"),
    WebCategory("webCategory"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkDestinationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NetworkDestinationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "url": return Url;
            case "fqdn": return Fqdn;
            case "ipAddress": return IpAddress;
            case "ipRange": return IpRange;
            case "ipSubnet": return IpSubnet;
            case "webCategory": return WebCategory;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
