package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Used together with personalApplications to control how apps in the personal profile are allowed or blocked.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PersonalProfilePersonalPlayStoreMode implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Blocked Apps. */
    BlockedApps("blockedApps"),
    /** Allowed Apps. */
    AllowedApps("allowedApps");
    public final String value;
    PersonalProfilePersonalPlayStoreMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PersonalProfilePersonalPlayStoreMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockedApps": return BlockedApps;
            case "allowedApps": return AllowedApps;
            default: return null;
        }
    }
}
