package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum LocalSecurityOptionsMinimumSessionSecurity implements ValuedEnum {
    /** Send LM & NTLM responses */
    None("none"),
    /** Send LM & NTLM-use NTLMv2 session security if negotiated */
    RequireNtmlV2SessionSecurity("requireNtmlV2SessionSecurity"),
    /** Send LM & NTLM responses only */
    Require128BitEncryption("require128BitEncryption"),
    /** Send LM & NTLMv2 responses only */
    NtlmV2And128BitEncryption("ntlmV2And128BitEncryption");
    public final String value;
    LocalSecurityOptionsMinimumSessionSecurity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LocalSecurityOptionsMinimumSessionSecurity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "requireNtmlV2SessionSecurity": return RequireNtmlV2SessionSecurity;
            case "require128BitEncryption": return Require128BitEncryption;
            case "ntlmV2And128BitEncryption": return NtlmV2And128BitEncryption;
            default: return null;
        }
    }
}
