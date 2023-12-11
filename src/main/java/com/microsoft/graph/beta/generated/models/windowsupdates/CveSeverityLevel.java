package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CveSeverityLevel implements ValuedEnum {
    Critical("critical"),
    Important("important"),
    Moderate("moderate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CveSeverityLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CveSeverityLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical": return Critical;
            case "important": return Important;
            case "moderate": return Moderate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
