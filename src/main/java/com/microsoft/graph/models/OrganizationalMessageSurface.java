package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum OrganizationalMessageSurface implements ValuedEnum {
    /** Indicates the message will be displayed on the Window's Action Center */
    ActionCenter("actionCenter"),
    /** Indicates the message will be displayed on the Get Started page */
    GetStarted("getStarted"),
    /** Indicates the message will be displayed to the Soft Landing which is anchored to the Windows taskbar */
    SoftLanding("softLanding"),
    /** UnknownFutureValue, Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OrganizationalMessageSurface(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessageSurface forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "actionCenter": return ActionCenter;
            case "getStarted": return GetStarted;
            case "softLanding": return SoftLanding;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
