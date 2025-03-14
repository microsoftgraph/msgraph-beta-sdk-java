package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of user account on Windows that was used to performed the elevation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegeManagementEndUserType implements ValuedEnum {
    /** Default. Unable to determine the login type of the user. */
    Undetermined("undetermined"),
    /** The user who performed the elevation logged in using an Azure Active Directory (Azure AD) account. */
    AzureAd("azureAd"),
    /** The user who performed the elevation logged in using Hybrid Azure AD joined account. */
    Hybrid("hybrid"),
    /** The user who performed the elevation logged in using a Windows local account. */
    Local("local"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegeManagementEndUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegeManagementEndUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undetermined": return Undetermined;
            case "azureAd": return AzureAd;
            case "hybrid": return Hybrid;
            case "local": return Local;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
