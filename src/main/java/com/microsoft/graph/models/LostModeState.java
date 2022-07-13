package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum LostModeState implements ValuedEnum {
    /** Lost mode is disabled. */
    Disabled("disabled"),
    /** Lost mode is enabled. */
    Enabled("enabled");
    public final String value;
    LostModeState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LostModeState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
