package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtocolType implements ValuedEnum {
    None("none"),
    OAuth2("oAuth2"),
    Ropc("ropc"),
    WsFederation("wsFederation"),
    Saml20("saml20"),
    DeviceCode("deviceCode"),
    UnknownFutureValue("unknownFutureValue"),
    AuthenticationTransfer("authenticationTransfer"),
    NativeAuth("nativeAuth"),
    ImplicitAccessTokenAndGetResponseMode("implicitAccessTokenAndGetResponseMode"),
    ImplicitIdTokenAndGetResponseMode("implicitIdTokenAndGetResponseMode"),
    ImplicitAccessTokenAndPostResponseMode("implicitAccessTokenAndPostResponseMode"),
    ImplicitIdTokenAndPostResponseMode("implicitIdTokenAndPostResponseMode"),
    AuthorizationCodeWithoutPkce("authorizationCodeWithoutPkce"),
    AuthorizationCodeWithPkce("authorizationCodeWithPkce"),
    ClientCredentials("clientCredentials"),
    RefreshTokenGrant("refreshTokenGrant"),
    EncryptedAuthorizeResponse("encryptedAuthorizeResponse"),
    DirectUserGrant("directUserGrant"),
    Kerberos("kerberos"),
    PrtGrant("prtGrant"),
    SeamlessSso("seamlessSso"),
    PrtBrokerBased("prtBrokerBased"),
    PrtNonBrokerBased("prtNonBrokerBased"),
    OnBehalfOf("onBehalfOf"),
    SamlOnBehalfOf("samlOnBehalfOf"),
    OfficeS2S("officeS2S"),
    WsTrust("wsTrust");
    public final String value;
    ProtocolType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtocolType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "oAuth2": return OAuth2;
            case "ropc": return Ropc;
            case "wsFederation": return WsFederation;
            case "saml20": return Saml20;
            case "deviceCode": return DeviceCode;
            case "unknownFutureValue": return UnknownFutureValue;
            case "authenticationTransfer": return AuthenticationTransfer;
            case "nativeAuth": return NativeAuth;
            case "implicitAccessTokenAndGetResponseMode": return ImplicitAccessTokenAndGetResponseMode;
            case "implicitIdTokenAndGetResponseMode": return ImplicitIdTokenAndGetResponseMode;
            case "implicitAccessTokenAndPostResponseMode": return ImplicitAccessTokenAndPostResponseMode;
            case "implicitIdTokenAndPostResponseMode": return ImplicitIdTokenAndPostResponseMode;
            case "authorizationCodeWithoutPkce": return AuthorizationCodeWithoutPkce;
            case "authorizationCodeWithPkce": return AuthorizationCodeWithPkce;
            case "clientCredentials": return ClientCredentials;
            case "refreshTokenGrant": return RefreshTokenGrant;
            case "encryptedAuthorizeResponse": return EncryptedAuthorizeResponse;
            case "directUserGrant": return DirectUserGrant;
            case "kerberos": return Kerberos;
            case "prtGrant": return PrtGrant;
            case "seamlessSso": return SeamlessSso;
            case "prtBrokerBased": return PrtBrokerBased;
            case "prtNonBrokerBased": return PrtNonBrokerBased;
            case "onBehalfOf": return OnBehalfOf;
            case "samlOnBehalfOf": return SamlOnBehalfOf;
            case "officeS2S": return OfficeS2S;
            case "wsTrust": return WsTrust;
            default: return null;
        }
    }
}
