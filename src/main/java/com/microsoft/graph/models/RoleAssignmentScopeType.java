package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RoleAssignmentScopeType implements ValuedEnum {
    /** Allow assignments to the specified ResourceScopes. */
    ResourceScope("resourceScope"),
    /** Allow assignments to all Intune devices. */
    AllDevices("allDevices"),
    /** Allow assignments to all Intune licensed users. */
    AllLicensedUsers("allLicensedUsers"),
    /** Allow assignments to all Intune devices and licensed users. */
    AllDevicesAndLicensedUsers("allDevicesAndLicensedUsers");
    public final String value;
    RoleAssignmentScopeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoleAssignmentScopeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "resourceScope": return ResourceScope;
            case "allDevices": return AllDevices;
            case "allLicensedUsers": return AllLicensedUsers;
            case "allDevicesAndLicensedUsers": return AllDevicesAndLicensedUsers;
            default: return null;
        }
    }
}
