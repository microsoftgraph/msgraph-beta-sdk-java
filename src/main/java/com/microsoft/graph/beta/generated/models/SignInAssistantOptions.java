package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Values for the SignInAssistantSettings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignInAssistantOptions implements ValuedEnum {
    /** Not configured - wlidsvc Start will be set to SERVICE_DEMAND_START. */
    NotConfigured("notConfigured"),
    /** Disabled - wlidsvc Start will be set to SERVICE_DISABLED. */
    Disabled("disabled");
    public final String value;
    SignInAssistantOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignInAssistantOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
