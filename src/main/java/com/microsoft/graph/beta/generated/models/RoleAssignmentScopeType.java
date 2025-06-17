package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies the type of scope for a Role Assignment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RoleAssignmentScopeType implements ValuedEnum {
    /** Default. Indicates that assignments are allowed to the specified resource scopes. Resource scopes are listed as Entra ID security group IDs. */
    ResourceScope("resourceScope"),
    /** Indicates that assignments are allowed to all Intune devices. Note that this does not map to any Entra ID security group, it is internal to Intune. */
    AllDevices("allDevices"),
    /** Indicates that assignments are allowed to all Intune licensed users. Note that this does not map to any Entra ID security group, it is internal to Intune. */
    AllLicensedUsers("allLicensedUsers"),
    /** Indicates that assignments are allowed to all Intune devices and licensed users. Note that this does not map to any Entra ID security group, it is internal to Intune. */
    AllDevicesAndLicensedUsers("allDevicesAndLicensedUsers"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoleAssignmentScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoleAssignmentScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "resourceScope": return ResourceScope;
            case "allDevices": return AllDevices;
            case "allLicensedUsers": return AllLicensedUsers;
            case "allDevicesAndLicensedUsers": return AllDevicesAndLicensedUsers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
