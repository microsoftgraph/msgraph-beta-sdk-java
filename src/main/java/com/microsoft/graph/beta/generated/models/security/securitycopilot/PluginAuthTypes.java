package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PluginAuthTypes implements ValuedEnum {
    None("none"),
    Basic("basic"),
    APIKey("aPIKey"),
    OAuthAuthorizationCodeFlow("oAuthAuthorizationCodeFlow"),
    OAuthClientCredentialsFlow("oAuthClientCredentialsFlow"),
    Aad("aad"),
    ServiceHttp("serviceHttp"),
    AadDelegated("aadDelegated"),
    OAuthPasswordGrantFlow("oAuthPasswordGrantFlow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PluginAuthTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PluginAuthTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "basic": return Basic;
            case "aPIKey": return APIKey;
            case "oAuthAuthorizationCodeFlow": return OAuthAuthorizationCodeFlow;
            case "oAuthClientCredentialsFlow": return OAuthClientCredentialsFlow;
            case "aad": return Aad;
            case "serviceHttp": return ServiceHttp;
            case "aadDelegated": return AadDelegated;
            case "oAuthPasswordGrantFlow": return OAuthPasswordGrantFlow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
