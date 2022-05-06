package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicySettingScope implements ValuedEnum {
    Unknown("unknown"),
    Device("device"),
    User("user");
    public final String value;
    GroupPolicySettingScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicySettingScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "device": return Device;
            case "user": return User;
            default: return null;
        }
    }
}
