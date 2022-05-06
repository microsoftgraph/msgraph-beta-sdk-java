package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppPhoneNumberRedirectLevel implements ValuedEnum {
    AllApps("allApps"),
    ManagedApps("managedApps"),
    CustomApp("customApp"),
    Blocked("blocked");
    public final String value;
    ManagedAppPhoneNumberRedirectLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppPhoneNumberRedirectLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "managedApps": return ManagedApps;
            case "customApp": return CustomApp;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
