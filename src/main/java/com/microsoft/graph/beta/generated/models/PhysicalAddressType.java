package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhysicalAddressType implements ValuedEnum {
    Unknown("unknown"),
    Home("home"),
    Business("business"),
    Other("other");
    public final String value;
    PhysicalAddressType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhysicalAddressType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "home": return Home;
            case "business": return Business;
            case "other": return Other;
            default: return null;
        }
    }
}
