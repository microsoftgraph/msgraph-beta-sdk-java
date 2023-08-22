package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RedundancyTier implements ValuedEnum {
    NoRedundancy("noRedundancy"),
    ZoneRedundancy("zoneRedundancy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RedundancyTier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RedundancyTier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noRedundancy": return NoRedundancy;
            case "zoneRedundancy": return ZoneRedundancy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
