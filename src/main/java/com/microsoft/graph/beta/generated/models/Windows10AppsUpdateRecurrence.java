package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for App update on Windows10 recurrence.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Windows10AppsUpdateRecurrence implements ValuedEnum {
    /** Default value, specifies a single occurence. */
    None("none"),
    /** Daily. */
    Daily("daily"),
    /** Weekly. */
    Weekly("weekly"),
    /** Monthly. */
    Monthly("monthly");
    public final String value;
    Windows10AppsUpdateRecurrence(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10AppsUpdateRecurrence forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "daily": return Daily;
            case "weekly": return Weekly;
            case "monthly": return Monthly;
            default: return null;
        }
    }
}
