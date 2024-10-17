package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type of possible leaf certificate statuses. These statuses indicate whether certificates are active and usable or unusable if they have been revoked or expired.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityLeafCertificateStatus implements ValuedEnum {
    /** Default. Unknown or invalid status. */
    Unknown("unknown"),
    /** Certificate is active, indicating it is in its validity period and not revoked. */
    Active("active"),
    /** Certificate has been revoked by its issuing certification authority. */
    Revoked("revoked"),
    /** Certificate has expired. */
    Expired("expired"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityLeafCertificateStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityLeafCertificateStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "active": return Active;
            case "revoked": return Revoked;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
