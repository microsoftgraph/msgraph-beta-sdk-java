package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum RestrictedAppsState implements ValuedEnum {
    ProhibitedApps("prohibitedApps"),
    NotApprovedApps("notApprovedApps");
    public final String value;
    RestrictedAppsState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RestrictedAppsState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prohibitedApps": return ProhibitedApps;
            case "notApprovedApps": return NotApprovedApps;
            default: return null;
        }
    }
}
