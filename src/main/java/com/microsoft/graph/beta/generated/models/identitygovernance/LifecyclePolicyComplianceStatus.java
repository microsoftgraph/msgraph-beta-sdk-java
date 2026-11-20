package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyComplianceStatus implements ValuedEnum {
    NotEvaluated("notEvaluated"),
    Compliant("compliant"),
    NonCompliant("nonCompliant"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyComplianceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyComplianceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEvaluated": return NotEvaluated;
            case "compliant": return Compliant;
            case "nonCompliant": return NonCompliant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
