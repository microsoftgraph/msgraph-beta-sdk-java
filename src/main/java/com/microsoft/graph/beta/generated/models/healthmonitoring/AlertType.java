package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertType implements ValuedEnum {
    Unknown("unknown"),
    MfaSignInFailure("mfaSignInFailure"),
    ManagedDeviceSignInFailure("managedDeviceSignInFailure"),
    CompliantDeviceSignInFailure("compliantDeviceSignInFailure"),
    UnknownFutureValue("unknownFutureValue"),
    ConditionalAccessBlockedSignIn("conditionalAccessBlockedSignIn"),
    SamlSignInFailure("samlSignInFailure");
    public final String value;
    AlertType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "mfaSignInFailure": return MfaSignInFailure;
            case "managedDeviceSignInFailure": return ManagedDeviceSignInFailure;
            case "compliantDeviceSignInFailure": return CompliantDeviceSignInFailure;
            case "unknownFutureValue": return UnknownFutureValue;
            case "conditionalAccessBlockedSignIn": return ConditionalAccessBlockedSignIn;
            case "samlSignInFailure": return SamlSignInFailure;
            default: return null;
        }
    }
}
