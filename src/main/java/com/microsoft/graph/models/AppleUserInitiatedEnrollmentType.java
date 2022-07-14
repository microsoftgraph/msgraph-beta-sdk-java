package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AppleUserInitiatedEnrollmentType implements ValuedEnum {
    /** Unknown enrollment type */
    Unknown("unknown"),
    /** Device enrollment type */
    Device("device"),
    /** User enrollment type */
    User("user");
    public final String value;
    AppleUserInitiatedEnrollmentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppleUserInitiatedEnrollmentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "device": return Device;
            case "user": return User;
            default: return null;
        }
    }
}
