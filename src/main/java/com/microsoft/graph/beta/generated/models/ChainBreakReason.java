package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChainBreakReason implements ValuedEnum {
    None("none"),
    IdvRevoked("idvRevoked"),
    SourceCredentialRevoked("sourceCredentialRevoked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChainBreakReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChainBreakReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "idvRevoked": return IdvRevoked;
            case "sourceCredentialRevoked": return SourceCredentialRevoked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
