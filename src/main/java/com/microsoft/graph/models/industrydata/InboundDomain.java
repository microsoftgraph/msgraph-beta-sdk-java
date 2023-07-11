package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum InboundDomain implements ValuedEnum {
    EducationRostering("educationRostering"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InboundDomain(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InboundDomain forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "educationRostering": return EducationRostering;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
