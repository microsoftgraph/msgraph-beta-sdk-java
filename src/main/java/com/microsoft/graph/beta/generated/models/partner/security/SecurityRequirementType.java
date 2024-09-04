package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityRequirementType implements ValuedEnum {
    MfaEnforcedForAdmins("mfaEnforcedForAdmins"),
    MfaEnforcedForAdminsOfCustomers("mfaEnforcedForAdminsOfCustomers"),
    SecurityAlertsPromptlyResolved("securityAlertsPromptlyResolved"),
    SecurityContactProvided("securityContactProvided"),
    SpendingBudgetSetForCustomerAzureSubscriptions("spendingBudgetSetForCustomerAzureSubscriptions"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityRequirementType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityRequirementType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mfaEnforcedForAdmins": return MfaEnforcedForAdmins;
            case "mfaEnforcedForAdminsOfCustomers": return MfaEnforcedForAdminsOfCustomers;
            case "securityAlertsPromptlyResolved": return SecurityAlertsPromptlyResolved;
            case "securityContactProvided": return SecurityContactProvided;
            case "spendingBudgetSetForCustomerAzureSubscriptions": return SpendingBudgetSetForCustomerAzureSubscriptions;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
