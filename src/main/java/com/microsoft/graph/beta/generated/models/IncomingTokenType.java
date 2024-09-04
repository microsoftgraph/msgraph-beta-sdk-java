package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncomingTokenType implements ValuedEnum {
    None("none"),
    PrimaryRefreshToken("primaryRefreshToken"),
    Saml11("saml11"),
    Saml20("saml20"),
    UnknownFutureValue("unknownFutureValue"),
    RemoteDesktopToken("remoteDesktopToken"),
    RefreshToken("refreshToken");
    public final String value;
    IncomingTokenType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncomingTokenType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "primaryRefreshToken": return PrimaryRefreshToken;
            case "saml11": return Saml11;
            case "saml20": return Saml20;
            case "unknownFutureValue": return UnknownFutureValue;
            case "remoteDesktopToken": return RemoteDesktopToken;
            case "refreshToken": return RefreshToken;
            default: return null;
        }
    }
}
