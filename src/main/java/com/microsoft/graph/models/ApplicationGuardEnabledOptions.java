package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for ApplicationGuardEnabledOptions
 */
public enum ApplicationGuardEnabledOptions implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Enabled For Edge */
    EnabledForEdge("enabledForEdge"),
    /** Enabled For Office */
    EnabledForOffice("enabledForOffice"),
    /** Enabled For Edge And Office */
    EnabledForEdgeAndOffice("enabledForEdgeAndOffice");
    public final String value;
    ApplicationGuardEnabledOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationGuardEnabledOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabledForEdge": return EnabledForEdge;
            case "enabledForOffice": return EnabledForOffice;
            case "enabledForEdgeAndOffice": return EnabledForEdgeAndOffice;
            default: return null;
        }
    }
}
