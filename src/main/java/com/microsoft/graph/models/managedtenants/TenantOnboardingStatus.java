package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TenantOnboardingStatus implements ValuedEnum {
    Ineligible("ineligible"),
    InProcess("inProcess"),
    Active("active"),
    Inactive("inactive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TenantOnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TenantOnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ineligible": return Ineligible;
            case "inProcess": return InProcess;
            case "active": return Active;
            case "inactive": return Inactive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
