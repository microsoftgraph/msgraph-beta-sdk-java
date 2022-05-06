package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum MacOSSoftwareUpdateCategory implements ValuedEnum {
    Critical("critical"),
    ConfigurationDataFile("configurationDataFile"),
    Firmware("firmware"),
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
