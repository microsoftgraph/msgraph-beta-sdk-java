package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageAuthMethod implements ValuedEnum {
    Email("email"),
    MobileSMS("mobileSMS"),
    MobileCall("mobileCall"),
    OfficePhone("officePhone"),
    SecurityQuestion("securityQuestion"),
    AppNotification("appNotification"),
    AppCode("appCode"),
    AlternateMobileCall("alternateMobileCall"),
    Fido("fido"),
    AppPassword("appPassword"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UsageAuthMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageAuthMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "mobileSMS": return MobileSMS;
            case "mobileCall": return MobileCall;
            case "officePhone": return OfficePhone;
            case "securityQuestion": return SecurityQuestion;
            case "appNotification": return AppNotification;
            case "appCode": return AppCode;
            case "alternateMobileCall": return AlternateMobileCall;
            case "fido": return Fido;
            case "appPassword": return AppPassword;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
