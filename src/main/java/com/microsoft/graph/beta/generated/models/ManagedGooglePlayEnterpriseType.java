package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Bind Type of the tenant with the Google EMM API
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedGooglePlayEnterpriseType implements ValuedEnum {
    /** The enterprise type is not determined or is unknown. This value is not used. */
    EnterpriseTypeUnspecified("enterpriseTypeUnspecified"),
    /** The enterprise belongs to a managed Google domain. */
    ManagedGoogleDomain("managedGoogleDomain"),
    /** The enterprise is a managed Google Play Accounts enterprise. */
    ManagedGooglePlayAccountsEnterprise("managedGooglePlayAccountsEnterprise"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedGooglePlayEnterpriseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedGooglePlayEnterpriseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enterpriseTypeUnspecified": return EnterpriseTypeUnspecified;
            case "managedGoogleDomain": return ManagedGoogleDomain;
            case "managedGooglePlayAccountsEnterprise": return ManagedGooglePlayAccountsEnterprise;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
