package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppleUserInitiatedEnrollmentType implements ValuedEnum {
    /** Default value in case enum parsing fails */
    Unknown("unknown"),
    /** Device enrollment via the iOS Company Portal. The default user-initiated enrollment type, which does not segregate corporate and personal data. Supported on all Intune-supported iOS/iPadOS versions. */
    Device("device"),
    /** Profile-driven user enrollment via the iOS Company Portal. An enrollment type that segregates corportate and personal data. Supported on devices running iOS/iPadOS 13 and higher. */
    User("user"),
    /** Account-driven user enrollment. Users will enroll from the iOS Settings app without using the iOS Company Portal. This enrollment type segregates corporate and personal data. Supported on devices running iOS/iPadOS 15 and higher. */
    AccountDrivenUserEnrollment("accountDrivenUserEnrollment"),
    /** Device enrollment via the web. Users will enroll without using the iOS Company Portal. This enrollment type does not segregate corporate and personal data. Supported on all Intune-supported iOS/iPadOS versions. */
    WebDeviceEnrollment("webDeviceEnrollment"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppleUserInitiatedEnrollmentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppleUserInitiatedEnrollmentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "device": return Device;
            case "user": return User;
            case "accountDrivenUserEnrollment": return AccountDrivenUserEnrollment;
            case "webDeviceEnrollment": return WebDeviceEnrollment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
