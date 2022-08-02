package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AutoRestartNotificationDismissalMethod implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Auto dismissal */
    Automatic("automatic"),
    /** User dismissal */
    User("user");
    public final String value;
    AutoRestartNotificationDismissalMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AutoRestartNotificationDismissalMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "automatic": return Automatic;
            case "user": return User;
            default: return null;
        }
    }
}
