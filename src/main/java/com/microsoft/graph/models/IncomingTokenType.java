package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum IncomingTokenType implements ValuedEnum {
    None("none"),
    PrimaryRefreshToken("primaryRefreshToken"),
    Saml11("saml11"),
    Saml20("saml20"),
    UnknownFutureValue("unknownFutureValue"),
    RemoteDesktopToken("remoteDesktopToken");
    public final String value;
    IncomingTokenType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IncomingTokenType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "primaryRefreshToken": return PrimaryRefreshToken;
            case "saml11": return Saml11;
            case "saml20": return Saml20;
            case "unknownFutureValue": return UnknownFutureValue;
            case "remoteDesktopToken": return RemoteDesktopToken;
            default: return null;
        }
    }
}
