package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkSoftwareFreshness implements ValuedEnum {
    Unknown("unknown"),
    Latest("latest"),
    UpdateAvailable("updateAvailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkSoftwareFreshness(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkSoftwareFreshness forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "latest": return Latest;
            case "updateAvailable": return UpdateAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
