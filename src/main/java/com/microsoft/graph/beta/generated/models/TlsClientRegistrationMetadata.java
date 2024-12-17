package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TlsClientRegistrationMetadata implements ValuedEnum {
    Tls_client_auth_subject_dn("tls_client_auth_subject_dn"),
    Tls_client_auth_san_dns("tls_client_auth_san_dns"),
    Tls_client_auth_san_uri("tls_client_auth_san_uri"),
    Tls_client_auth_san_ip("tls_client_auth_san_ip"),
    Tls_client_auth_san_email("tls_client_auth_san_email"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TlsClientRegistrationMetadata(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TlsClientRegistrationMetadata forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tls_client_auth_subject_dn": return Tls_client_auth_subject_dn;
            case "tls_client_auth_san_dns": return Tls_client_auth_san_dns;
            case "tls_client_auth_san_uri": return Tls_client_auth_san_uri;
            case "tls_client_auth_san_ip": return Tls_client_auth_san_ip;
            case "tls_client_auth_san_email": return Tls_client_auth_san_email;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
