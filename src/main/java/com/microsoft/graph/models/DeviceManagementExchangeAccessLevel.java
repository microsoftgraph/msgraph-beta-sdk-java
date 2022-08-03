package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceManagementExchangeAccessLevel implements ValuedEnum {
    /** No device access rule has been configured in Exchange. */
    None("none"),
    /** Allow the device access to Exchange. */
    Allow("allow"),
    /** Block the device from accessing Exchange. */
    Block("block"),
    /** Quarantine the device in Exchange. */
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
