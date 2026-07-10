package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GranularRestoreItems implements ValuedEnum {
    Email("email"),
    Note("note"),
    Contact("contact"),
    Task("task"),
    Calendar("calendar"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GranularRestoreItems(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GranularRestoreItems forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "note": return Note;
            case "contact": return Contact;
            case "task": return Task;
            case "calendar": return Calendar;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
