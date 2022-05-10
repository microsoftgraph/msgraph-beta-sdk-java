package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the reportRoot singleton. */
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
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RegistrationAuthMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistrationAuthMethod forValue(@javax.annotation.Nonnull final String searchValue) {
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
            default: return null;
        }
    }
}
