package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DelegatedPrivilegeStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
