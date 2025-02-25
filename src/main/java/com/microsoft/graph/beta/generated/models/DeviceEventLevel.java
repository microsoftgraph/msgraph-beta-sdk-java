package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates device event level. Possible values are: None, Verbose, Information, Warning, Error, Critical
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceEventLevel implements ValuedEnum {
    /** Indicates that the device event level is none. */
    None("none"),
    /** Indicates that the device event level is verbose. */
    Verbose("verbose"),
    /** Indicates that the device event level is information. */
    Information("information"),
    /** Indicates that the device event level is warning. */
    Warning("warning"),
    /** Indicates that the device event level is error. */
    Error("error"),
    /** Indicates that the device event level is critical. */
    Critical("critical"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceEventLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceEventLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "verbose": return Verbose;
            case "information": return Information;
            case "warning": return Warning;
            case "error": return Error;
            case "critical": return Critical;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
