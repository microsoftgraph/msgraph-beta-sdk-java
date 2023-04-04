package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Exchange Active Sync services. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EasServices forValue(@javax.annotation.Nonnull final String searchValue) {
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
