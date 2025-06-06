package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LanManagerAuthenticationLevel
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LanManagerAuthenticationLevel implements ValuedEnum {
    /** Send LM &amp; NTLM responses */
    LmAndNltm("lmAndNltm"),
    /** Send LM &amp; NTLM-use NTLMv2 session security if negotiated */
    LmNtlmAndNtlmV2("lmNtlmAndNtlmV2"),
    /** Send LM &amp; NTLM responses only */
    LmAndNtlmOnly("lmAndNtlmOnly"),
    /** Send LM &amp; NTLMv2 responses only */
    LmAndNtlmV2("lmAndNtlmV2"),
    /** Send LM &amp; NTLMv2 responses only. Refuse LM */
    LmNtlmV2AndNotLm("lmNtlmV2AndNotLm"),
    /** Send LM &amp; NTLMv2 responses only. Refuse LM &amp; NTLM */
    LmNtlmV2AndNotLmOrNtm("lmNtlmV2AndNotLmOrNtm");
    public final String value;
    LanManagerAuthenticationLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LanManagerAuthenticationLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "lmAndNltm": return LmAndNltm;
            case "lmNtlmAndNtlmV2": return LmNtlmAndNtlmV2;
            case "lmAndNtlmOnly": return LmAndNtlmOnly;
            case "lmAndNtlmV2": return LmAndNtlmV2;
            case "lmNtlmV2AndNotLm": return LmNtlmV2AndNotLm;
            case "lmNtlmV2AndNotLmOrNtm": return LmNtlmV2AndNotLmOrNtm;
            default: return null;
        }
    }
}
