package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RoleAssignmentScopeType implements ValuedEnum {
    ResourceScope("resourceScope"),
    AllDevices("allDevices"),
    AllLicensedUsers("allLicensedUsers"),
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
