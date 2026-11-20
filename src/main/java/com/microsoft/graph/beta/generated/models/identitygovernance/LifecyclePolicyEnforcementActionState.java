package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyEnforcementActionState implements ValuedEnum {
    None("none"),
    WarningStateEnabled("warningStateEnabled"),
    NonComplianceNotificationSent("nonComplianceNotificationSent"),
    FirstNotificationSent("firstNotificationSent"),
    SecondNotificationSent("secondNotificationSent"),
    FinalNotificationSent("finalNotificationSent"),
    Disabled("disabled"),
    Deleted("deleted"),
    ComplianceRestored("complianceRestored"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyEnforcementActionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyEnforcementActionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "warningStateEnabled": return WarningStateEnabled;
            case "nonComplianceNotificationSent": return NonComplianceNotificationSent;
            case "firstNotificationSent": return FirstNotificationSent;
            case "secondNotificationSent": return SecondNotificationSent;
            case "finalNotificationSent": return FinalNotificationSent;
            case "disabled": return Disabled;
            case "deleted": return Deleted;
            case "complianceRestored": return ComplianceRestored;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
