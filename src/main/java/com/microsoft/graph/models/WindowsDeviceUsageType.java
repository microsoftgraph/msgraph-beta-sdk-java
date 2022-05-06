package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsDeviceUsageType implements ValuedEnum {
    SingleUser("singleUser"),
    Shared("shared");
    public final String value;
    WindowsDeviceUsageType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeviceUsageType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "singleUser": return SingleUser;
            case "shared": return Shared;
            default: return null;
        }
    }
}
