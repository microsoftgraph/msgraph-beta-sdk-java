package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum SignInAssistantOptions implements ValuedEnum {
    /** Not configured - wlidsvc Start will be set to SERVICE_DEMAND_START. */
    NotConfigured("notConfigured"),
    /** Disabled - wlidsvc Start will be set to SERVICE_DISABLED. */
    Disabled("disabled");
    public final String value;
    SignInAssistantOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SignInAssistantOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
