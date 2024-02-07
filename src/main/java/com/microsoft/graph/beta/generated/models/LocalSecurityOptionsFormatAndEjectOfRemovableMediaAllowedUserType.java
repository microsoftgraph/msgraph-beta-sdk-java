package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Administrators */
    Administrators("administrators"),
    /** Administrators and Power Users */
    AdministratorsAndPowerUsers("administratorsAndPowerUsers"),
    /** Administrators and Interactive Users  */
    AdministratorsAndInteractiveUsers("administratorsAndInteractiveUsers");
    public final String value;
    LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "administrators": return Administrators;
            case "administratorsAndPowerUsers": return AdministratorsAndPowerUsers;
            case "administratorsAndInteractiveUsers": return AdministratorsAndInteractiveUsers;
            default: return null;
        }
    }
}
