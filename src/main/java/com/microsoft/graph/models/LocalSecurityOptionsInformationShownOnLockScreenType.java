package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsInformationShownOnLockScreenType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** User display name, domain and user names */
    UserDisplayNameDomainUser("userDisplayNameDomainUser"),
    /** User display name only */
    UserDisplayNameOnly("userDisplayNameOnly"),
    /** Do not display user information */
    DoNotDisplayUser("doNotDisplayUser");
    public final String value;
    LocalSecurityOptionsInformationShownOnLockScreenType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsInformationShownOnLockScreenType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "userDisplayNameDomainUser": return UserDisplayNameDomainUser;
            case "userDisplayNameOnly": return UserDisplayNameOnly;
            case "doNotDisplayUser": return DoNotDisplayUser;
            default: return null;
        }
    }
}
