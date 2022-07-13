package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceAndAppManagementAssignmentSource implements ValuedEnum {
    /** Direct indicates a direct assignment. */
    Direct("direct"),
    /** PolicySets indicates assignment was made via PolicySet assignment. */
    PolicySets("policySets");
    public final String value;
    DeviceAndAppManagementAssignmentSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAndAppManagementAssignmentSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "policySets": return PolicySets;
            default: return null;
        }
    }
}
