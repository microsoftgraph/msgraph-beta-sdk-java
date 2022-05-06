package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum EnrollmentAvailabilityOptions implements ValuedEnum {
    AvailableWithPrompts("availableWithPrompts"),
    AvailableWithoutPrompts("availableWithoutPrompts"),
    Unavailable("unavailable");
    public final String value;
    EnrollmentAvailabilityOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EnrollmentAvailabilityOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "availableWithPrompts": return AvailableWithPrompts;
            case "availableWithoutPrompts": return AvailableWithoutPrompts;
            case "unavailable": return Unavailable;
            default: return null;
        }
    }
}
