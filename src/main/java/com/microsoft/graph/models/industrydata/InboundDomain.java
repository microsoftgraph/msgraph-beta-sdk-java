package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InboundDomain implements ValuedEnum {
    EducationRostering("educationRostering"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InboundDomain(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InboundDomain forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "educationRostering": return EducationRostering;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
