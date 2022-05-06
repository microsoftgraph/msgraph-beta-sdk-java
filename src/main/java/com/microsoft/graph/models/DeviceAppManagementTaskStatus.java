package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum DeviceAppManagementTaskStatus implements ValuedEnum {
    Unknown("unknown"),
    Pending("pending"),
    Active("active"),
    Completed("completed"),
    Rejected("rejected");
    public final String value;
    DeviceAppManagementTaskStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAppManagementTaskStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "active": return Active;
            case "completed": return Completed;
            case "rejected": return Rejected;
            default: return null;
        }
    }
}
