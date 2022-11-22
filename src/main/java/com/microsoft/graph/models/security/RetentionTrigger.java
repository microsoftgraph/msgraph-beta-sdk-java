package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RetentionTrigger implements ValuedEnum {
    DateLabeled("dateLabeled"),
    DateCreated("dateCreated"),
    DateModified("dateModified"),
    DateOfEvent("dateOfEvent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RetentionTrigger(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RetentionTrigger forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dateLabeled": return DateLabeled;
            case "dateCreated": return DateCreated;
            case "dateModified": return DateModified;
            case "dateOfEvent": return DateOfEvent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
