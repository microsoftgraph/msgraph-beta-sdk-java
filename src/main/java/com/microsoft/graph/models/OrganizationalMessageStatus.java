package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OrganizationalMessageStatus implements ValuedEnum {
    /** Indicates that the message has been scheduled for a future date */
    Scheduled("scheduled"),
    /** Indicates that the message is currently live and being presented to clients */
    Active("active"),
    /** Indicates that the message has been displayed to users already and is no longer active */
    Completed("completed"),
    /** Indicates that the message has been cancelled and will not be shown */
    Cancelled("cancelled"),
    /** UnknownFutureValue, Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OrganizationalMessageStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessageStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduled": return Scheduled;
            case "active": return Active;
            case "completed": return Completed;
            case "cancelled": return Cancelled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
