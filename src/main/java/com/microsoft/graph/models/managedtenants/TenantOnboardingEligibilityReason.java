package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the tenantRelationship singleton. */
public enum TenantOnboardingEligibilityReason implements ValuedEnum {
    None("none"),
    ContractType("contractType"),
    DelegatedAdminPrivileges("delegatedAdminPrivileges"),
    UsersCount("usersCount"),
    License("license"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TenantOnboardingEligibilityReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TenantOnboardingEligibilityReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "contractType": return ContractType;
            case "delegatedAdminPrivileges": return DelegatedAdminPrivileges;
            case "usersCount": return UsersCount;
            case "license": return License;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
