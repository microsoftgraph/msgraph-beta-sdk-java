package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsMinimumSessionSecurity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsMinimumSessionSecurity implements ValuedEnum {
    /** Send LM &amp; NTLM responses */
    None("none"),
    /** Send LM &amp; NTLM-use NTLMv2 session security if negotiated */
    RequireNtmlV2SessionSecurity("requireNtmlV2SessionSecurity"),
    /** Send LM &amp; NTLM responses only */
    Require128BitEncryption("require128BitEncryption"),
    /** Send LM &amp; NTLMv2 responses only */
    NtlmV2And128BitEncryption("ntlmV2And128BitEncryption");
    public final String value;
    LocalSecurityOptionsMinimumSessionSecurity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsMinimumSessionSecurity forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
