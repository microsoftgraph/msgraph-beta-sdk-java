package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyType implements ValuedEnum {
    AdmxBacked("admxBacked"),
    AdmxIngested("admxIngested");
    public final String value;
    GroupPolicyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admxBacked": return AdmxBacked;
            case "admxIngested": return AdmxIngested;
            default: return null;
        }
    }
}
