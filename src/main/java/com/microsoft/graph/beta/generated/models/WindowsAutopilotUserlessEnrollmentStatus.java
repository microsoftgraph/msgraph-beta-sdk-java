package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Userless enrollment block status, indicating whether the next device enrollment will be blocked.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotUserlessEnrollmentStatus implements ValuedEnum {
    /** Unknown userless enrollment block status. Next userless enrollment may fail. This is the default value. */
    Unknown("unknown"),
    /** Indicates next userless enrollment can proceed. */
    Allowed("allowed"),
    /** Indicates next userless enrollment cannot proceed without resetting the windowsAutopilotUserlessEnrollmentStatus. */
    Blocked("blocked"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutopilotUserlessEnrollmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotUserlessEnrollmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "allowed": return Allowed;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
