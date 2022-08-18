package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MacOSSoftwareUpdateCategory implements ValuedEnum {
    /** A critical update */
    Critical("critical"),
    /** A configuration data file update */
    ConfigurationDataFile("configurationDataFile"),
    /** A firmware update */
    Firmware("firmware"),
    /** All other update types */
    Other("other");
    public final String value;
    MacOSSoftwareUpdateCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSoftwareUpdateCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical": return Critical;
            case "configurationDataFile": return ConfigurationDataFile;
            case "firmware": return Firmware;
            case "other": return Other;
            default: return null;
        }
    }
}
