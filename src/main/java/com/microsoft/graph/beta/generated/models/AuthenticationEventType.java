package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationEventType implements ValuedEnum {
    TokenIssuanceStart("tokenIssuanceStart"),
    PageRenderStart("pageRenderStart"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tokenIssuanceStart": return TokenIssuanceStart;
            case "pageRenderStart": return PageRenderStart;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
