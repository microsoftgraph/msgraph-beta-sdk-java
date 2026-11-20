package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyEnforcementStatus implements ValuedEnum {
    NotRequired("notRequired"),
    NotStarted("notStarted"),
    Processing("processing"),
    Waiting("waiting"),
    ActionDue("actionDue"),
    Complete("complete"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyEnforcementStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyEnforcementStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notRequired": return NotRequired;
            case "notStarted": return NotStarted;
            case "processing": return Processing;
            case "waiting": return Waiting;
            case "actionDue": return ActionDue;
            case "complete": return Complete;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
