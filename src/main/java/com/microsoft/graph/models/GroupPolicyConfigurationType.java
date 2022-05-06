package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyConfigurationType implements ValuedEnum {
    Policy("policy"),
    Preference("preference");
    public final String value;
    GroupPolicyConfigurationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyConfigurationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "policy": return Policy;
            case "preference": return Preference;
            default: return null;
        }
    }
}
