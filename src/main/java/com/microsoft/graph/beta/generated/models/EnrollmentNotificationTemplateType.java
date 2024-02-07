package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum indicates the Template type for which the enrollment notification applies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentNotificationTemplateType implements ValuedEnum {
    /** Email Notification */
    Email("email"),
    /** Push Notification */
    Push("push"),
    /** Unknown Type */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentNotificationTemplateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentNotificationTemplateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "push": return Push;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
