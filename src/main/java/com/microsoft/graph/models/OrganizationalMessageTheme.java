package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OrganizationalMessageTheme implements ValuedEnum {
    /** Indicates the Update theme */
    Update("update"),
    /** Indicates the Training theme */
    Training("training"),
    /** Indicates the Welcome to Windows theme */
    WelcomeToWindows("welcomeToWindows"),
    /** Indicates the Explore */
    Explore("explore"),
    /** UnknownFutureValue, Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OrganizationalMessageTheme(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessageTheme forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "update": return Update;
            case "training": return Training;
            case "welcomeToWindows": return WelcomeToWindows;
            case "explore": return Explore;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
