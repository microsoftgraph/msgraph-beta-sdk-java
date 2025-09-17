package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Max severity of CVE
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsUpdateCveSeverityLevel implements ValuedEnum {
    /** Severity of Critical */
    Critical("critical"),
    /** Severity of Important */
    Important("important"),
    /** Severity of Moderate */
    Moderate("moderate"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsUpdateCveSeverityLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUpdateCveSeverityLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
