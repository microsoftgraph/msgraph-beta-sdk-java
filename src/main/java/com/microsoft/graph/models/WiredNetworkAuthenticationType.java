package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum WiredNetworkAuthenticationType implements ValuedEnum {
    /** None */
    None("none"),
    /** User Authentication */
    User("user"),
    /** Machine Authentication */
    Machine("machine"),
    /** Machine or User Authentication */
    MachineOrUser("machineOrUser"),
    /** Guest Authentication */
    Guest("guest"),
    /** Sentinel member for cases where the client cannot handle the new enum values. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WiredNetworkAuthenticationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WiredNetworkAuthenticationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "user": return User;
            case "machine": return Machine;
            case "machineOrUser": return MachineOrUser;
            case "guest": return Guest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
