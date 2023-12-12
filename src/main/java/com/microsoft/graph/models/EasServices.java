package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Exchange Active Sync services.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EasServices implements ValuedEnum {
    None("none"),
    /** Enables synchronization of calendars. */
    Calendars("calendars"),
    /** Enables synchronization of contacts. */
    Contacts("contacts"),
    /** Enables synchronization of email. */
    Email("email"),
    /** Enables synchronization of notes. */
    Notes("notes"),
    /** Enables synchronization of reminders. */
    Reminders("reminders");
    public final String value;
    EasServices(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EasServices forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "calendars": return Calendars;
            case "contacts": return Contacts;
            case "email": return Email;
            case "notes": return Notes;
            case "reminders": return Reminders;
            default: return null;
        }
    }
}
