package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LegalHoldStatus implements ValuedEnum {
    Pending("Pending"),
    Error("Error"),
    Success("Success"),
    UnknownFutureValue("UnknownFutureValue");
    public final String value;
    LegalHoldStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LegalHoldStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
