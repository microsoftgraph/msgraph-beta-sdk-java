package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseSlaPolicyStatus implements ValuedEnum {
    Active("active"),
    AtRisk("atRisk"),
    Breached("breached"),
    Paused("paused"),
    CompletedMet("completedMet"),
    CompletedBreached("completedBreached"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseSlaPolicyStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseSlaPolicyStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "atRisk": return AtRisk;
            case "breached": return Breached;
            case "paused": return Paused;
            case "completedMet": return CompletedMet;
            case "completedBreached": return CompletedBreached;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
