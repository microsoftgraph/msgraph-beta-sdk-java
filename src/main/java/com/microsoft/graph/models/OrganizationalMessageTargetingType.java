package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum OrganizationalMessageTargetingType implements ValuedEnum {
    /** Indicates that client devices are targeted by their AAD group */
    AadGroup("aadGroup"),
    /** UnknownFutureValue, Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OrganizationalMessageTargetingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessageTargetingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aadGroup": return AadGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
