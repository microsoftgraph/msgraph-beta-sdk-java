package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StudentAgeGroup implements ValuedEnum {
    Minor("minor"),
    NotAdult("notAdult"),
    Adult("adult"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    StudentAgeGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StudentAgeGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "minor": return Minor;
            case "notAdult": return NotAdult;
            case "adult": return Adult;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
