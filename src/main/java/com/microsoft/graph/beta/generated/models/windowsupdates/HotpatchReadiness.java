package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HotpatchReadiness implements ValuedEnum {
    Ready("ready"),
    NotReady("notReady"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HotpatchReadiness(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HotpatchReadiness forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ready": return Ready;
            case "notReady": return NotReady;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
