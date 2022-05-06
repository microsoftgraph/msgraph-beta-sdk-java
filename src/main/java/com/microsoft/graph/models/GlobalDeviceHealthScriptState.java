package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the areGlobalScriptsAvailable method.  */
public enum GlobalDeviceHealthScriptState implements ValuedEnum {
    NotConfigured("notConfigured"),
    Pending("pending"),
    Enabled("enabled");
    public final String value;
    GlobalDeviceHealthScriptState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GlobalDeviceHealthScriptState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "pending": return Pending;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
