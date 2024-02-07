package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentNotificationBrandingOptions implements ValuedEnum {
    /** Indicates that the template has no branding. */
    None("none"),
    /** Indicates that the Company Logo is included in the notification. */
    IncludeCompanyLogo("includeCompanyLogo"),
    /** Indicates that the Company Name is included in the notification. */
    IncludeCompanyName("includeCompanyName"),
    /** Indicates that the Contact Information is included in the notification. */
    IncludeContactInformation("includeContactInformation"),
    /** Indicates that the Company Portal Link is included in the notification. */
    IncludeCompanyPortalLink("includeCompanyPortalLink"),
    /** Indicates that the DeviceDetails is included in the notification. */
    IncludeDeviceDetails("includeDeviceDetails"),
    /** unknownFutureValue for evolvable enums pattern. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentNotificationBrandingOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentNotificationBrandingOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "includeCompanyLogo": return IncludeCompanyLogo;
            case "includeCompanyName": return IncludeCompanyName;
            case "includeContactInformation": return IncludeContactInformation;
            case "includeCompanyPortalLink": return IncludeCompanyPortalLink;
            case "includeDeviceDetails": return IncludeDeviceDetails;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
