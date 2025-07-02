package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RegistrationAuthMethod implements ValuedEnum {
    Email("email"),
    MobilePhone("mobilePhone"),
    OfficePhone("officePhone"),
    SecurityQuestion("securityQuestion"),
    AppNotification("appNotification"),
    AppCode("appCode"),
    AlternateMobilePhone("alternateMobilePhone"),
    Fido("fido"),
    AppPassword("appPassword"),
    UnknownFutureValue("unknownFutureValue"),
    ExternalAuthMethod("externalAuthMethod");
    public final String value;
    RegistrationAuthMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RegistrationAuthMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "mobilePhone": return MobilePhone;
            case "officePhone": return OfficePhone;
            case "securityQuestion": return SecurityQuestion;
            case "appNotification": return AppNotification;
            case "appCode": return AppCode;
            case "alternateMobilePhone": return AlternateMobilePhone;
            case "fido": return Fido;
            case "appPassword": return AppPassword;
            case "unknownFutureValue": return UnknownFutureValue;
            case "externalAuthMethod": return ExternalAuthMethod;
            default: return null;
        }
    }
}
