package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyNextEnforcementAction implements ValuedEnum {
    NonComplianceNotification("nonComplianceNotification"),
    FirstNotification("firstNotification"),
    SecondNotification("secondNotification"),
    FinalNotification("finalNotification"),
    Disable("disable"),
    DisableNotification("disableNotification"),
    Delete("delete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyNextEnforcementAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyNextEnforcementAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "nonComplianceNotification": return NonComplianceNotification;
            case "firstNotification": return FirstNotification;
            case "secondNotification": return SecondNotification;
            case "finalNotification": return FinalNotification;
            case "disable": return Disable;
            case "disableNotification": return DisableNotification;
            case "delete": return Delete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
