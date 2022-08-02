package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MobileAppActionType implements ValuedEnum {
    /** Unknown result. */
    Unknown("unknown"),
    /** Application install command was sent. */
    InstallCommandSent("installCommandSent"),
    /** Application installed. */
    Installed("installed"),
    /** Application uninstalled. */
    Uninstalled("uninstalled"),
    /** User requested installation */
    UserRequestedInstall("userRequestedInstall");
    public final String value;
    MobileAppActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileAppActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "installCommandSent": return InstallCommandSent;
            case "installed": return Installed;
            case "uninstalled": return Uninstalled;
            case "userRequestedInstall": return UserRequestedInstall;
            default: return null;
        }
    }
}
