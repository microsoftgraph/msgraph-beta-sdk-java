package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * App source options for macOS Gatekeeper.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSGatekeeperAppSources implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfigured("notConfigured"),
    /** Only apps from the Mac AppStore can be run. */
    MacAppStore("macAppStore"),
    /** Only apps from the Mac AppStore and identified developers can be run. */
    MacAppStoreAndIdentifiedDevelopers("macAppStoreAndIdentifiedDevelopers"),
    /** Apps from anywhere can be run. */
    Anywhere("anywhere");
    public final String value;
    MacOSGatekeeperAppSources(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSGatekeeperAppSources forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "macAppStore": return MacAppStore;
            case "macAppStoreAndIdentifiedDevelopers": return MacAppStoreAndIdentifiedDevelopers;
            case "anywhere": return Anywhere;
            default: return null;
        }
    }
}
