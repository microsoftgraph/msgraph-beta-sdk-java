package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PstnUserBlockMode implements ValuedEnum {
    Blocked("blocked"),
    Unblocked("unblocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PstnUserBlockMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PstnUserBlockMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blocked": return Blocked;
            case "unblocked": return Unblocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
