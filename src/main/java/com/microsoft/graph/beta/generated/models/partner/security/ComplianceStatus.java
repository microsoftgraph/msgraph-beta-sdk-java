package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ComplianceStatus implements ValuedEnum {
    Compliant("compliant"),
    Noncomplaint("noncomplaint"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ComplianceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ComplianceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "compliant": return Compliant;
            case "noncomplaint": return Noncomplaint;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
