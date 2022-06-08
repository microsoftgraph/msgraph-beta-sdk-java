package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to group. */
public enum DeviceAndAppManagementAssignmentFilterType implements ValuedEnum {
    /** Default value. Do not use. */
    None("none"),
    /** Indicates in-filter, rule matching will offer the payload to devices. */
    Include("include"),
    /** Indicates out-filter, rule matching will not offer the payload to devices. */
    Exclude("exclude");
    public final String value;
    DeviceAndAppManagementAssignmentFilterType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAndAppManagementAssignmentFilterType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
