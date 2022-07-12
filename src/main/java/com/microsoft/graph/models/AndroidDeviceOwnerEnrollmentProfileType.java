package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidDeviceOwnerEnrollmentProfileType implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Dedicated device. */
    DedicatedDevice("dedicatedDevice"),
    /** Fully managed. */
    FullyManaged("fullyManaged");
    public final String value;
    AndroidDeviceOwnerEnrollmentProfileType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentProfileType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "dedicatedDevice": return DedicatedDevice;
            case "fullyManaged": return FullyManaged;
            default: return null;
        }
    }
}
