package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExternalAuthenticationType implements ValuedEnum {
    Passthru("passthru"),
    AadPreAuthentication("aadPreAuthentication");
    public final String value;
    ExternalAuthenticationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExternalAuthenticationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "passthru": return Passthru;
            case "aadPreAuthentication": return AadPreAuthentication;
            default: return null;
        }
    }
}
