package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocalSecurityOptionsInformationDisplayedOnLockScreenType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** User display name, domain and user names */
    Administrators("administrators"),
    /** User display name only */
    AdministratorsAndPowerUsers("administratorsAndPowerUsers"),
    /** Do not display user information */
    AdministratorsAndInteractiveUsers("administratorsAndInteractiveUsers");
    public final String value;
    LocalSecurityOptionsInformationDisplayedOnLockScreenType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocalSecurityOptionsInformationDisplayedOnLockScreenType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
