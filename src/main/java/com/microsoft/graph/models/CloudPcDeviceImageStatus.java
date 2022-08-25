package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CloudPcDeviceImageStatus implements ValuedEnum {
    Pending("pending"),
    Ready("ready"),
    Failed("failed");
    public final String value;
    CloudPcDeviceImageStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcDeviceImageStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "ready": return Ready;
            case "failed": return Failed;
            default: return null;
        }
    }
}
