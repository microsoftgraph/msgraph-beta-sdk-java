package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum OfficeSuiteInstallProgressDisplayLevel implements ValuedEnum {
    None("none"),
    Full("full");
    public final String value;
    OfficeSuiteInstallProgressDisplayLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OfficeSuiteInstallProgressDisplayLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "full": return Full;
            default: return null;
        }
    }
}
