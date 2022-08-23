package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ApplicationMode implements ValuedEnum {
    Manual("manual"),
    Automatic("automatic"),
    Recommended("recommended");
    public final String value;
    ApplicationMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            case "recommended": return Recommended;
            default: return null;
        }
    }
}
