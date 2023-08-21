package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported values for the notification type to use.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementDerivedCredentialNotificationType implements ValuedEnum {
    /** None */
    None("none"),
    /** Company Portal */
    CompanyPortal("companyPortal"),
    /** Email */
    Email("email");
    public final String value;
    DeviceManagementDerivedCredentialNotificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementDerivedCredentialNotificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "companyPortal": return CompanyPortal;
            case "email": return Email;
            default: return null;
        }
    }
}
