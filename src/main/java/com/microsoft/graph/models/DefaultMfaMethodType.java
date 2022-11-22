package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DefaultMfaMethodType implements ValuedEnum {
    None("none"),
    MobilePhone("mobilePhone"),
    AlternateMobilePhone("alternateMobilePhone"),
    OfficePhone("officePhone"),
    MicrosoftAuthenticatorPush("microsoftAuthenticatorPush"),
    SoftwareOneTimePasscode("softwareOneTimePasscode"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DefaultMfaMethodType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefaultMfaMethodType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "mobilePhone": return MobilePhone;
            case "alternateMobilePhone": return AlternateMobilePhone;
            case "officePhone": return OfficePhone;
            case "microsoftAuthenticatorPush": return MicrosoftAuthenticatorPush;
            case "softwareOneTimePasscode": return SoftwareOneTimePasscode;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
