package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppDeviceThreatLevel implements ValuedEnum {
    NotConfigured("notConfigured"),
    Secured("secured"),
    Low("low"),
    Medium("medium"),
    High("high");
    public final String value;
    ManagedAppDeviceThreatLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDeviceThreatLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "secured": return Secured;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
