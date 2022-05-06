package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum LostModeState implements ValuedEnum {
    Disabled("disabled"),
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
