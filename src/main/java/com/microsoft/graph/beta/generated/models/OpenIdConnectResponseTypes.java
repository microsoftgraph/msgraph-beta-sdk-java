package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OpenIdConnectResponseTypes implements ValuedEnum {
    Code("code"),
    Id_token("id_token"),
    Token("token");
    public final String value;
    OpenIdConnectResponseTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OpenIdConnectResponseTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "code": return Code;
            case "id_token": return Id_token;
            case "token": return Token;
            default: return null;
        }
    }
}
