package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PstnUserBlockMode implements ValuedEnum {
    Blocked("blocked"),
    Unblocked("unblocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PstnUserBlockMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PstnUserBlockMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blocked": return Blocked;
            case "unblocked": return Unblocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
