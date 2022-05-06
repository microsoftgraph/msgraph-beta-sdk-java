package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DriverCategory implements ValuedEnum {
    Recommended("recommended"),
    PreviouslyApproved("previouslyApproved"),
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
