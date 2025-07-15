package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the supported channel types for an Apple setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationAppleApplicabilityConstraint implements ValuedEnum {
    /** Not supported. */
    NotSupported("notSupported"),
    /** Available on device channel. */
    DeviceChannel("deviceChannel"),
    /** Available on user channel. */
    UserChannel("userChannel"),
    /** Requires supervised devices. */
    RequireSupervised("requireSupervised"),
    /** Requires a DEP enrolled macOS device. */
    RequireDepEnrolled("requireDepEnrolled"),
    /** Requires user-approved enrolled macOS device. */
    RequireUserApproved("requireUserApproved"),
    /** Allowed for user enrolled devices. */
    AllowUserEnrollment("allowUserEnrollment"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationAppleApplicabilityConstraint(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationAppleApplicabilityConstraint forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSupported": return NotSupported;
            case "deviceChannel": return DeviceChannel;
            case "userChannel": return UserChannel;
            case "requireSupervised": return RequireSupervised;
            case "requireDepEnrolled": return RequireDepEnrolled;
            case "requireUserApproved": return RequireUserApproved;
            case "allowUserEnrollment": return AllowUserEnrollment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
