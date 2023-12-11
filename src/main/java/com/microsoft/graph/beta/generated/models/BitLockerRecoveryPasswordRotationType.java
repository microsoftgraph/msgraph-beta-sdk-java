package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * BitLocker recovery password rotation type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BitLockerRecoveryPasswordRotationType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Recovery password rotation off */
    Disabled("disabled"),
    /** Recovery password rotation on for Azure AD joined devices */
    EnabledForAzureAd("enabledForAzureAd"),
    /** Recovery password rotation on for both Azure AD joined and hybrid joined devices */
    EnabledForAzureAdAndHybrid("enabledForAzureAdAndHybrid");
    public final String value;
    BitLockerRecoveryPasswordRotationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BitLockerRecoveryPasswordRotationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            case "enabledForAzureAd": return EnabledForAzureAd;
            case "enabledForAzureAdAndHybrid": return EnabledForAzureAdAndHybrid;
            default: return null;
        }
    }
}
