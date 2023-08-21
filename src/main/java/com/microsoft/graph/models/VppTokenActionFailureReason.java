package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible types of reasons for an Apple Volume Purchase Program token action failure.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VppTokenActionFailureReason implements ValuedEnum {
    /** None. */
    None("none"),
    /** There was an error on Apple's service. */
    AppleFailure("appleFailure"),
    /** There was an internal error. */
    InternalError("internalError"),
    /** There was an error because the Apple Volume Purchase Program token was expired. */
    ExpiredVppToken("expiredVppToken"),
    /** There was an error because the Apple Volume Purchase Program Push Notification certificate expired. */
    ExpiredApplePushNotificationCertificate("expiredApplePushNotificationCertificate");
    public final String value;
    VppTokenActionFailureReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VppTokenActionFailureReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "appleFailure": return AppleFailure;
            case "internalError": return InternalError;
            case "expiredVppToken": return ExpiredVppToken;
            case "expiredApplePushNotificationCertificate": return ExpiredApplePushNotificationCertificate;
            default: return null;
        }
    }
}
