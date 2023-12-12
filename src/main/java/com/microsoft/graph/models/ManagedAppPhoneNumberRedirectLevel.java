package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The classes of apps that are allowed to click-to-open a phone number, for making phone calls or sending text messages.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppPhoneNumberRedirectLevel implements ValuedEnum {
    /** Sharing is allowed to all apps. */
    AllApps("allApps"),
    /** Sharing is allowed to all managed apps. */
    ManagedApps("managedApps"),
    /** Sharing is allowed to a custom app. */
    CustomApp("customApp"),
    /** Sharing between apps is blocked. */
    Blocked("blocked");
    public final String value;
    ManagedAppPhoneNumberRedirectLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppPhoneNumberRedirectLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "managedApps": return ManagedApps;
            case "customApp": return CustomApp;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
