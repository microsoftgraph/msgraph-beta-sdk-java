package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DriverCategory implements ValuedEnum {
    /** This indicates a driver is recommended by Microsoft. */
    Recommended("recommended"),
    /** This indicates a driver was recommended by Microsoft and IT admin has taken some approval action on it. */
    PreviouslyApproved("previouslyApproved"),
    /** This indicates a driver is never recommended by Microsoft. */
    Other("other");
    public final String value;
    DriverCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DriverCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recommended": return Recommended;
            case "previouslyApproved": return PreviouslyApproved;
            case "other": return Other;
            default: return null;
        }
    }
}
