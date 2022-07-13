package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceManagementResourceAccessProfileIntent implements ValuedEnum {
    /** Apply the profile. */
    Apply("apply"),
    /** Remove the profile from devices that have installed the profile. */
    Remove("remove");
    public final String value;
    DeviceManagementResourceAccessProfileIntent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementResourceAccessProfileIntent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apply": return Apply;
            case "remove": return Remove;
            default: return null;
        }
    }
}
