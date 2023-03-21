package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LegalHoldStatus implements ValuedEnum {
    Pending("Pending"),
    Error("Error"),
    Success("Success"),
    UnknownFutureValue("UnknownFutureValue");
    public final String value;
    LegalHoldStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LegalHoldStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Error": return Error;
            case "Success": return Success;
            case "UnknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
