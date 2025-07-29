package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReportAction implements ValuedEnum {
    Unknown("unknown"),
    Junk("junk"),
    NotJunk("notJunk"),
    Phish("phish"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReportAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReportAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "junk": return Junk;
            case "notJunk": return NotJunk;
            case "phish": return Phish;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
