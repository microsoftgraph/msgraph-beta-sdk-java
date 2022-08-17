package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DriverUpdateProfileApprovalType implements ValuedEnum {
    /** This indicates a driver and firmware profile needs to be approved manually. */
    Manual("manual"),
    /** This indicates a driver and firmware profile is approved automatically. */
    Automatic("automatic");
    public final String value;
    DriverUpdateProfileApprovalType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DriverUpdateProfileApprovalType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            default: return null;
        }
    }
}
