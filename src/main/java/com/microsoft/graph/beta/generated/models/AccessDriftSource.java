package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessDriftSource implements ValuedEnum {
    Entra("entra"),
    ExternalApplication("externalApplication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessDriftSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessDriftSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entra": return Entra;
            case "externalApplication": return ExternalApplication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
