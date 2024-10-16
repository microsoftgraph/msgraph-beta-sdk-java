package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type of possible certification authority statuses. These statuses indicate whether a certification authority is currently able to issue certificates or temporarily paused or permanently revoked.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityStatus implements ValuedEnum {
    /** Default. Indicates certification authority has an unknown or invalid status. */
    Unknown("unknown"),
    /** Indicates certification authority is active and can issue certificates. */
    Active("active"),
    /** Indicates certification authority has been paused from issuing certificates. Paused certification authorities can be put back in an active status to continue issuing certificates. */
    Paused("paused"),
    /** Indicates certification authority has been revoked. This is a permanent state that cannot be changed. */
    Revoked("revoked"),
    /** Indicates certification authority certificate signing request has been created and can be downloaded for signing and then be uploaded. */
    SigningPending("signingPending"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "active": return Active;
            case "paused": return Paused;
            case "revoked": return Revoked;
            case "signingPending": return SigningPending;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
