package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ChangeUefiSettingsPermission implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfiguredOnly("notConfiguredOnly"),
    /** Prevent change of UEFI setting permission */
    None("none");
    public final String value;
    ChangeUefiSettingsPermission(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChangeUefiSettingsPermission forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfiguredOnly": return NotConfiguredOnly;
            case "none": return None;
            default: return null;
        }
    }
}
