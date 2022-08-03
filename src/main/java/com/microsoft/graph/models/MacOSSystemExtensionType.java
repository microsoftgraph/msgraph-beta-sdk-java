package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MacOSSystemExtensionType implements ValuedEnum {
    /** Enables driver extensions. */
    DriverExtensionsAllowed("driverExtensionsAllowed"),
    /** Enables network extensions. */
    NetworkExtensionsAllowed("networkExtensionsAllowed"),
    /** Enables endpoint security extensions. */
    EndpointSecurityExtensionsAllowed("endpointSecurityExtensionsAllowed");
    public final String value;
    MacOSSystemExtensionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSystemExtensionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "driverExtensionsAllowed": return DriverExtensionsAllowed;
            case "networkExtensionsAllowed": return NetworkExtensionsAllowed;
            case "endpointSecurityExtensionsAllowed": return EndpointSecurityExtensionsAllowed;
            default: return null;
        }
    }
}
