package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum PersonAnnualEventType implements ValuedEnum {
    Birthday("birthday"),
    Wedding("wedding"),
    Work("work"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PersonAnnualEventType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PersonAnnualEventType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "birthday": return Birthday;
            case "wedding": return Wedding;
            case "work": return Work;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
