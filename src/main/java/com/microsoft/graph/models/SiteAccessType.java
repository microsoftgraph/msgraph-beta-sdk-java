package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SiteAccessType implements ValuedEnum {
    Block("block"),
    Full("full"),
    Limited("limited");
    public final String value;
    SiteAccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SiteAccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "full": return Full;
            case "limited": return Limited;
            default: return null;
        }
    }
}
