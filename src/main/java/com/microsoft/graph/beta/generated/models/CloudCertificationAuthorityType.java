package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type of possible certificate authority types. This feature supports a two-tier certification authority model with a root certification authority and one or more child issuing (intermediate) certification authorities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityType implements ValuedEnum {
    /** Default. Unknown or invalid certification authority type. */
    Unknown("unknown"),
    /** Indicates root certification authority. Can be used as the parent of an issuing certification authority. Root Certification Authority cannot issue leaf certificates. */
    RootCertificationAuthority("rootCertificationAuthority"),
    /** Indicates issuing (subordinate) certification authority. Must have a parent root certification authority. Issuing Certification Authority can issue leaf certificates. */
    IssuingCertificationAuthority("issuingCertificationAuthority"),
    /** Indicates issuing (subordinate) certification authority that has an external root certification authority. Issuing Certification Authority with external root can issue leaf certificates. */
    IssuingCertificationAuthorityWithExternalRoot("issuingCertificationAuthorityWithExternalRoot"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "rootCertificationAuthority": return RootCertificationAuthority;
            case "issuingCertificationAuthority": return IssuingCertificationAuthority;
            case "issuingCertificationAuthorityWithExternalRoot": return IssuingCertificationAuthorityWithExternalRoot;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
