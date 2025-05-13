package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum type to represent approval actions of single or list of quality update policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsQualityUpdatePolicyActionType implements ValuedEnum {
    /** Enum value to represent the approval actions for quality update */
    Approve("approve"),
    /** Enum value to represent the pause actions for quality update */
    Suspend("suspend"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsQualityUpdatePolicyActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsQualityUpdatePolicyActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approve": return Approve;
            case "suspend": return Suspend;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
