package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum VpnTunnelConfigurationType implements ValuedEnum {
    /** WiFi and Cellular Tunnels */
    WifiAndCellular("wifiAndCellular"),
    /** Cellular Tunnel Only */
    Cellular("cellular"),
    /** WiFi Tunnel Only */
    Wifi("wifi");
    public final String value;
    VpnTunnelConfigurationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnTunnelConfigurationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "wifiAndCellular": return WifiAndCellular;
            case "cellular": return Cellular;
            case "wifi": return Wifi;
            default: return null;
        }
    }
}
