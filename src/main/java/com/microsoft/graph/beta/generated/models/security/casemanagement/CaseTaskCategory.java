package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseTaskCategory implements ValuedEnum {
    Uncategorized("uncategorized"),
    Triage("triage"),
    Contain("contain"),
    Investigate("investigate"),
    Remediate("remediate"),
    Prevent("prevent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseTaskCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseTaskCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uncategorized": return Uncategorized;
            case "triage": return Triage;
            case "contain": return Contain;
            case "investigate": return Investigate;
            case "remediate": return Remediate;
            case "prevent": return Prevent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
