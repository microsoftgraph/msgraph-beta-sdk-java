package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChainBreakSource implements ValuedEnum {
    None("none"),
    IdentityProtection("identityProtection"),
    AdminAction("adminAction"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChainBreakSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChainBreakSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "identityProtection": return IdentityProtection;
            case "adminAction": return AdminAction;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
