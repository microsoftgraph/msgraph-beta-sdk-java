package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ExpirationRequirement implements ValuedEnum {
    RememberMultifactorAuthenticationOnTrustedDevices("rememberMultifactorAuthenticationOnTrustedDevices"),
    TenantTokenLifetimePolicy("tenantTokenLifetimePolicy"),
    AudienceTokenLifetimePolicy("audienceTokenLifetimePolicy"),
    SignInFrequencyPeriodicReauthentication("signInFrequencyPeriodicReauthentication"),
    NgcMfa("ngcMfa"),
    SignInFrequencyEveryTime("signInFrequencyEveryTime"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExpirationRequirement(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExpirationRequirement forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rememberMultifactorAuthenticationOnTrustedDevices": return RememberMultifactorAuthenticationOnTrustedDevices;
            case "tenantTokenLifetimePolicy": return TenantTokenLifetimePolicy;
            case "audienceTokenLifetimePolicy": return AudienceTokenLifetimePolicy;
            case "signInFrequencyPeriodicReauthentication": return SignInFrequencyPeriodicReauthentication;
            case "ngcMfa": return NgcMfa;
            case "signInFrequencyEveryTime": return SignInFrequencyEveryTime;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
