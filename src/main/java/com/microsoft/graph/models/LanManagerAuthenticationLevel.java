package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum LanManagerAuthenticationLevel implements ValuedEnum {
    /** Send LM & NTLM responses */
    LmAndNltm("lmAndNltm"),
    /** Send LM & NTLM-use NTLMv2 session security if negotiated */
    LmNtlmAndNtlmV2("lmNtlmAndNtlmV2"),
    /** Send LM & NTLM responses only */
    LmAndNtlmOnly("lmAndNtlmOnly"),
    /** Send LM & NTLMv2 responses only */
    LmAndNtlmV2("lmAndNtlmV2"),
    /** Send LM & NTLMv2 responses only. Refuse LM */
    LmNtlmV2AndNotLm("lmNtlmV2AndNotLm"),
    /** Send LM & NTLMv2 responses only. Refuse LM & NTLM */
    LmNtlmV2AndNotLmOrNtm("lmNtlmV2AndNotLmOrNtm");
    public final String value;
    LanManagerAuthenticationLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LanManagerAuthenticationLevel forValue(@javax.annotation.Nonnull final String searchValue) {
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
