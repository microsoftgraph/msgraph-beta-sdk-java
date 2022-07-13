package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum TeamworkDeviceHealthStatus implements ValuedEnum {
    Unknown("unknown"),
    Offline("offline"),
    Critical("critical"),
    NonUrgent("nonUrgent"),
    Healthy("healthy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkDeviceHealthStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkDeviceHealthStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "offline": return Offline;
            case "critical": return Critical;
            case "nonUrgent": return NonUrgent;
            case "healthy": return Healthy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
