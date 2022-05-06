package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyOperationStatus implements ValuedEnum {
    Unknown("unknown"),
    InProgress("inProgress"),
    Success("success"),
    Failed("failed");
    public final String value;
    GroupPolicyOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inProgress": return InProgress;
            case "success": return Success;
            case "failed": return Failed;
            default: return null;
        }
    }
}
