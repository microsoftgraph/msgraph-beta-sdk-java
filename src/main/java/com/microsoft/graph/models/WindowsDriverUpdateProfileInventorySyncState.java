package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsDriverUpdateProfileInventorySyncState implements ValuedEnum {
    Pending("pending"),
    Success("success"),
    Failure("failure");
    public final String value;
    WindowsDriverUpdateProfileInventorySyncState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDriverUpdateProfileInventorySyncState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "success": return Success;
            case "failure": return Failure;
            default: return null;
        }
    }
}
