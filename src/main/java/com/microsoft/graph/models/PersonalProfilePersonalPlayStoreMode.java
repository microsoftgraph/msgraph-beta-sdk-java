package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PersonalProfilePersonalPlayStoreMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockedApps": return BlockedApps;
            case "allowedApps": return AllowedApps;
            default: return null;
        }
    }
}
