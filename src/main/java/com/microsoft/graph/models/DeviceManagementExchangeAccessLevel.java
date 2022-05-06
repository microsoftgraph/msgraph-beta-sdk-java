package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExchangeAccessLevel implements ValuedEnum {
    None("none"),
    Allow("allow"),
    Block("block"),
    Quarantine("quarantine");
    public final String value;
    DeviceManagementExchangeAccessLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allow": return Allow;
            case "block": return Block;
            case "quarantine": return Quarantine;
            default: return null;
        }
    }
}
