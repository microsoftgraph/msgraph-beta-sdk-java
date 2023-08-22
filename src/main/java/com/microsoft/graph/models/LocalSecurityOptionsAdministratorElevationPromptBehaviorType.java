package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsAdministratorElevationPromptBehaviorType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Elevate without prompting. */
    ElevateWithoutPrompting("elevateWithoutPrompting"),
    /** Prompt for credentials on the secure desktop */
    PromptForCredentialsOnTheSecureDesktop("promptForCredentialsOnTheSecureDesktop"),
    /** Prompt for consent on the secure desktop */
    PromptForConsentOnTheSecureDesktop("promptForConsentOnTheSecureDesktop"),
    /** Prompt for credentials */
    PromptForCredentials("promptForCredentials"),
    /** Prompt for consent */
    PromptForConsent("promptForConsent"),
    /** Prompt for consent for non-Windows binaries */
    PromptForConsentForNonWindowsBinaries("promptForConsentForNonWindowsBinaries");
    public final String value;
    LocalSecurityOptionsAdministratorElevationPromptBehaviorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsAdministratorElevationPromptBehaviorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "elevateWithoutPrompting": return ElevateWithoutPrompting;
            case "promptForCredentialsOnTheSecureDesktop": return PromptForCredentialsOnTheSecureDesktop;
            case "promptForConsentOnTheSecureDesktop": return PromptForConsentOnTheSecureDesktop;
            case "promptForCredentials": return PromptForCredentials;
            case "promptForConsent": return PromptForConsent;
            case "promptForConsentForNonWindowsBinaries": return PromptForConsentForNonWindowsBinaries;
            default: return null;
        }
    }
}
