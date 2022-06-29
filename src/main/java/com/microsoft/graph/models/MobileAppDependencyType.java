package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum MobileAppDependencyType implements ValuedEnum {
    /** Indicates that the child app should be detected before installing the parent app. */
    Detect("detect"),
    /** Indicates that the child app should be installed before installing the parent app. */
    AutoInstall("autoInstall");
    public final String value;
    MobileAppDependencyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileAppDependencyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "detect": return Detect;
            case "autoInstall": return AutoInstall;
            default: return null;
        }
    }
}
