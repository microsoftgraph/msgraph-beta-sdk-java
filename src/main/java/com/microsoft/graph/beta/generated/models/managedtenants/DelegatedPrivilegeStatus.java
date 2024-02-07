package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegatedPrivilegeStatus implements ValuedEnum {
    None("none"),
    DelegatedAdminPrivileges("delegatedAdminPrivileges"),
    UnknownFutureValue("unknownFutureValue"),
    GranularDelegatedAdminPrivileges("granularDelegatedAdminPrivileges"),
    DelegatedAndGranularDelegetedAdminPrivileges("delegatedAndGranularDelegetedAdminPrivileges");
    public final String value;
    DelegatedPrivilegeStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedPrivilegeStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "delegatedAdminPrivileges": return DelegatedAdminPrivileges;
            case "unknownFutureValue": return UnknownFutureValue;
            case "granularDelegatedAdminPrivileges": return GranularDelegatedAdminPrivileges;
            case "delegatedAndGranularDelegetedAdminPrivileges": return DelegatedAndGranularDelegetedAdminPrivileges;
            default: return null;
        }
    }
}
