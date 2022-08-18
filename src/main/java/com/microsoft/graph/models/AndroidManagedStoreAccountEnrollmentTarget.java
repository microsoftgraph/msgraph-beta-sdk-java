package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidManagedStoreAccountEnrollmentTarget implements ValuedEnum {
    None("none"),
    All("all"),
    Targeted("targeted"),
    TargetedAsEnrollmentRestrictions("targetedAsEnrollmentRestrictions");
    public final String value;
    AndroidManagedStoreAccountEnrollmentTarget(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedStoreAccountEnrollmentTarget forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "all": return All;
            case "targeted": return Targeted;
            case "targetedAsEnrollmentRestrictions": return TargetedAsEnrollmentRestrictions;
            default: return null;
        }
    }
}
