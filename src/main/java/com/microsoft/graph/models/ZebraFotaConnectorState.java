package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ZebraFotaConnectorState implements ValuedEnum {
    /** Default value when the connector has not been setup (the feature has not been used yet). */
    None("none"),
    /** Connected state indicates that Intune is linked to Zebra Update Services for the current tenant. */
    Connected("connected"),
    /** Disconnected state indicates that the account was connected in the past and later disconnected. */
    Disconnected("disconnected"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaConnectorState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaConnectorState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
