package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines how app messaging redirection is protected by an App Protection Policy. Default is anyApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessagingRedirectAppType implements ValuedEnum {
    /** App protection policy will allow messaging redirection to any app. */
    AnyApp("anyApp"),
    /** App protection policy will allow messaging redirection to any managed application. */
    AnyManagedApp("anyManagedApp"),
    /** App protection policy will allow messaging redirection only to specified applications in related App protection policy settings. See related settings `messagingRedirectAppDisplayName`, `messagingRedirectAppPackageId` and `messagingRedirectAppUrlScheme`. */
    SpecificApps("specificApps"),
    /** App protection policy will block messaging redirection to any app. */
    Blocked("blocked");
    public final String value;
    MessagingRedirectAppType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessagingRedirectAppType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anyApp": return AnyApp;
            case "anyManagedApp": return AnyManagedApp;
            case "specificApps": return SpecificApps;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
