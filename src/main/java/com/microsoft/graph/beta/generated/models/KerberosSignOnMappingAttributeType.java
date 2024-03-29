package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KerberosSignOnMappingAttributeType implements ValuedEnum {
    UserPrincipalName("userPrincipalName"),
    OnPremisesUserPrincipalName("onPremisesUserPrincipalName"),
    UserPrincipalUsername("userPrincipalUsername"),
    OnPremisesUserPrincipalUsername("onPremisesUserPrincipalUsername"),
    OnPremisesSAMAccountName("onPremisesSAMAccountName");
    public final String value;
    KerberosSignOnMappingAttributeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KerberosSignOnMappingAttributeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "onPremisesUserPrincipalName": return OnPremisesUserPrincipalName;
            case "userPrincipalUsername": return UserPrincipalUsername;
            case "onPremisesUserPrincipalUsername": return OnPremisesUserPrincipalUsername;
            case "onPremisesSAMAccountName": return OnPremisesSAMAccountName;
            default: return null;
        }
    }
}
