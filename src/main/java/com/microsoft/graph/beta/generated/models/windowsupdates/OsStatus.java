package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OsStatus implements ValuedEnum {
    EndOfServicing("endOfServicing"),
    InServicing("inServicing"),
    NearEndOfServicing("nearEndOfServicing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OsStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OsStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "endOfServicing": return EndOfServicing;
            case "inServicing": return InServicing;
            case "nearEndOfServicing": return NearEndOfServicing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
