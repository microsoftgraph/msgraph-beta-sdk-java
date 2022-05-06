package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DiscoverySource implements ValuedEnum {
    Unknown("unknown"),
    AdminImport("adminImport"),
    DeviceEnrollmentProgram("deviceEnrollmentProgram");
    public final String value;
    DiscoverySource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DiscoverySource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "adminImport": return AdminImport;
            case "deviceEnrollmentProgram": return DeviceEnrollmentProgram;
            default: return null;
        }
    }
}
