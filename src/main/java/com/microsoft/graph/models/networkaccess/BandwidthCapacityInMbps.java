package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BandwidthCapacityInMbps implements ValuedEnum {
    Mbps250("mbps250"),
    Mbps500("mbps500"),
    Mbps750("mbps750"),
    Mbps1000("mbps1000"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BandwidthCapacityInMbps(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BandwidthCapacityInMbps forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mbps250": return Mbps250;
            case "mbps500": return Mbps500;
            case "mbps750": return Mbps750;
            case "mbps1000": return Mbps1000;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
