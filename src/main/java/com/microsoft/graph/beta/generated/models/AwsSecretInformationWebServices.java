package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsSecretInformationWebServices implements ValuedEnum {
    SecretsManager("secretsManager"),
    CertificateAuthority("certificateAuthority"),
    CloudHsm("cloudHsm"),
    CertificateManager("certificateManager"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsSecretInformationWebServices(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsSecretInformationWebServices forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "secretsManager": return SecretsManager;
            case "certificateAuthority": return CertificateAuthority;
            case "cloudHsm": return CloudHsm;
            case "certificateManager": return CertificateManager;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
