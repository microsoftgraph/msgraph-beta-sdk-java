package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyMigrationReadiness implements ValuedEnum {
    None("none"),
    Partial("partial"),
    Complete("complete"),
    Error("error"),
    NotApplicable("notApplicable");
    public final String value;
    GroupPolicyMigrationReadiness(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyMigrationReadiness forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "partial": return Partial;
            case "complete": return Complete;
            case "error": return Error;
            case "notApplicable": return NotApplicable;
            default: return null;
        }
    }
}
