package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RedundancyTier implements ValuedEnum {
    NoRedundancy("noRedundancy"),
    ZoneRedundancy("zoneRedundancy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RedundancyTier(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RedundancyTier forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noRedundancy": return NoRedundancy;
            case "zoneRedundancy": return ZoneRedundancy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
