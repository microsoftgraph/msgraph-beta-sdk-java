package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum ZebraFotaNetworkType implements ValuedEnum {
    /** The device will install the update regardless of current network type. */
    Any("any"),
    /** The device will install the update only when connected to WiFi network. */
    Wifi("wifi"),
    /** The device will install the update only when connected a Cellular network. */
    Cellular("cellular"),
    /** The device will install the update when connected both WiFi and Cellular. */
    WifiAndCellular("wifiAndCellular"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaNetworkType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaNetworkType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "any": return Any;
            case "wifi": return Wifi;
            case "cellular": return Cellular;
            case "wifiAndCellular": return WifiAndCellular;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
