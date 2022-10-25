package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LocalSecurityOptionsInformationDisplayedOnLockScreenType forValue(@javax.annotation.Nonnull final String searchValue) {
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
