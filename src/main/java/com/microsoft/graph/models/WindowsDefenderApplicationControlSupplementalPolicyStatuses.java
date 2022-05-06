package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum WindowsDefenderApplicationControlSupplementalPolicyStatuses implements ValuedEnum {
    Unknown("unknown"),
    Success("success"),
    TokenError("tokenError"),
    NotAuthorizedByToken("notAuthorizedByToken"),
    PolicyNotFound("policyNotFound");
    public final String value;
    WindowsDefenderApplicationControlSupplementalPolicyStatuses(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDefenderApplicationControlSupplementalPolicyStatuses forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "success": return Success;
            case "tokenError": return TokenError;
            case "notAuthorizedByToken": return NotAuthorizedByToken;
            case "policyNotFound": return PolicyNotFound;
            default: return null;
        }
    }
}
