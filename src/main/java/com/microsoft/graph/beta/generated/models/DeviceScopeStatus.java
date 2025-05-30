package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceScopeStatus implements ValuedEnum {
    /** Indicates the device scope is not enabled and there are no calculations in progress. */
    None("none"),
    /** Indicates the device scope is enabled and report metrics data are being recalculated by the service. */
    Computing("computing"),
    /** Indicates the device scope is enabled but there is insufficient data to calculate results. The system requires information from at least 5 devices before calculations can occur. */
    InsufficientData("insufficientData"),
    /** Device scope is enabled and finished recalculating the report metric. Device scope is now ready to be used. */
    Completed("completed"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceScopeStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "computing": return Computing;
            case "insufficientData": return InsufficientData;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
