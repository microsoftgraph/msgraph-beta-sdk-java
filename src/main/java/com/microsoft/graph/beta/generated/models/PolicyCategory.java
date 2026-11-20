package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyCategory implements ValuedEnum {
    NotSpecified("notSpecified"),
    WorkloadIdentity("workloadIdentity"),
    IdentityAndTenant("identityAndTenant"),
    PrivilegedAccess("privilegedAccess"),
    ZeroTrust("zeroTrust"),
    AgenticIdentity("agenticIdentity"),
    NetworkAccess("networkAccess"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "workloadIdentity": return WorkloadIdentity;
            case "identityAndTenant": return IdentityAndTenant;
            case "privilegedAccess": return PrivilegedAccess;
            case "zeroTrust": return ZeroTrust;
            case "agenticIdentity": return AgenticIdentity;
            case "networkAccess": return NetworkAccess;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
