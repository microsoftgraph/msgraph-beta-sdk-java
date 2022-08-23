package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum HealthState implements ValuedEnum {
    /** Unknown state. */
    Unknown("unknown"),
    /** Healthy state. */
    Healthy("healthy"),
    /** Unhealthy state. */
    Unhealthy("unhealthy");
    public final String value;
    HealthState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static HealthState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "healthy": return Healthy;
            case "unhealthy": return Unhealthy;
            default: return null;
        }
    }
}
