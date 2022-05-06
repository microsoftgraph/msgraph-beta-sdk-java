package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ZebraFotaNetworkType implements ValuedEnum {
    Any("any"),
    Wifi("wifi"),
    Cellular("cellular"),
    WifiAndCellular("wifiAndCellular"),
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
