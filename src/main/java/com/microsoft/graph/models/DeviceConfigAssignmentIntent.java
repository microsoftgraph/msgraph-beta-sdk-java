package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceConfigAssignmentIntent implements ValuedEnum {
    Apply("apply"),
    Remove("remove");
    public final String value;
    DeviceConfigAssignmentIntent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceConfigAssignmentIntent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apply": return Apply;
            case "remove": return Remove;
            default: return null;
        }
    }
}
