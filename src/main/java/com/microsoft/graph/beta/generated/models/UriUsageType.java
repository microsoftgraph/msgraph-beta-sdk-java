package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UriUsageType implements ValuedEnum {
    RedirectUri("redirectUri"),
    IdentifierUri("identifierUri"),
    LoginUrl("loginUrl"),
    LogoutUrl("logoutUrl"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UriUsageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UriUsageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "redirectUri": return RedirectUri;
            case "identifierUri": return IdentifierUri;
            case "loginUrl": return LoginUrl;
            case "logoutUrl": return LogoutUrl;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
