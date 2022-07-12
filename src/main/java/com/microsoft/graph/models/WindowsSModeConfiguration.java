package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum WindowsSModeConfiguration implements ValuedEnum {
    /** This option will remove all restrictions to unlock S mode - default */
    NoRestriction("noRestriction"),
    /** This option will block the user to unlock the device from S mode */
    Block("block"),
    /** This option will unlock the device from S mode */
    Unlock("unlock");
    public final String value;
    WindowsSModeConfiguration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsSModeConfiguration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noRestriction": return NoRestriction;
            case "block": return Block;
            case "unlock": return Unlock;
            default: return null;
        }
    }
}
