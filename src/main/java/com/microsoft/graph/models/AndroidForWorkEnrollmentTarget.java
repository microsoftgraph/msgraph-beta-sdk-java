package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidForWorkEnrollmentTarget implements ValuedEnum {
    None("none"),
    All("all"),
    Targeted("targeted"),
    TargetedAsEnrollmentRestrictions("targetedAsEnrollmentRestrictions");
    public final String value;
    AndroidForWorkEnrollmentTarget(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidForWorkEnrollmentTarget forValue(@javax.annotation.Nonnull final String searchValue) {
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
