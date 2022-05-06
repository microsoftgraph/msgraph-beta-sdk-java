package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum DeviceAndAppManagementAssignmentFilterType implements ValuedEnum {
    None("none"),
    Include("include"),
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
