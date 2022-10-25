package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DeviceConfigAssignmentIntent implements ValuedEnum {
    /** Ensure that the configuration profile is applied to the devices in the assignment. */
    Apply("apply"),
    /** Ensure that the configuration profile is removed from devices that have previously installed the configuration profile. */
    Remove("remove");
    public final String value;
    DeviceConfigAssignmentIntent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceConfigAssignmentIntent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apply": return Apply;
            case "remove": return Remove;
            default: return null;
        }
    }
}
