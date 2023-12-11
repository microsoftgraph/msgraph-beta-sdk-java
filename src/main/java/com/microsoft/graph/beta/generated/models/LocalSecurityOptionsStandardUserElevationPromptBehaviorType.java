package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsStandardUserElevationPromptBehaviorType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Automatically deny elevation requests */
    AutomaticallyDenyElevationRequests("automaticallyDenyElevationRequests"),
    /** Prompt for credentials on the secure desktop */
    PromptForCredentialsOnTheSecureDesktop("promptForCredentialsOnTheSecureDesktop"),
    /** Prompt for credentials */
    PromptForCredentials("promptForCredentials");
    public final String value;
    LocalSecurityOptionsStandardUserElevationPromptBehaviorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsStandardUserElevationPromptBehaviorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "automaticallyDenyElevationRequests": return AutomaticallyDenyElevationRequests;
            case "promptForCredentialsOnTheSecureDesktop": return PromptForCredentialsOnTheSecureDesktop;
            case "promptForCredentials": return PromptForCredentials;
            default: return null;
        }
    }
}
