package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type to describe the approval type for different type of quality updates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsQualityUpdatePolicyApprovalMethodType implements ValuedEnum {
    /** The updates need manually approve. */
    Manual("manual"),
    /** The updates would be automaticaly approved. */
    Automatic("automatic"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsQualityUpdatePolicyApprovalMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsQualityUpdatePolicyApprovalMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
