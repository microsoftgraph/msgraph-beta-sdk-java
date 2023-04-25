package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SingleSignOnMode implements ValuedEnum {
    None("none"),
    OnPremisesKerberos("onPremisesKerberos"),
    Saml("saml"),
    PingHeaderBased("pingHeaderBased"),
    AadHeaderBased("aadHeaderBased"),
    OAuthToken("oAuthToken"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SingleSignOnMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SingleSignOnMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "onPremisesKerberos": return OnPremisesKerberos;
            case "saml": return Saml;
            case "pingHeaderBased": return PingHeaderBased;
            case "aadHeaderBased": return AadHeaderBased;
            case "oAuthToken": return OAuthToken;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
