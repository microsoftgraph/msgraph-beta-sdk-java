package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum to describe policy&apos;s approval status for catalogitems 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsQualityUpdateApprovalStatus implements ValuedEnum {
    /** unknown status for corresponding catalog item */
    Unknown("unknown"),
    /** approved for corresponding catalog item */
    Approved("approved"),
    /** suspended for corresponding catalog item */
    Suspended("suspended"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsQualityUpdateApprovalStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsQualityUpdateApprovalStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "approved": return Approved;
            case "suspended": return Suspended;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
