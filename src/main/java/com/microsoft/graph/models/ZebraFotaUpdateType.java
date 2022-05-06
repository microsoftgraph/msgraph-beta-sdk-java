package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ZebraFotaUpdateType implements ValuedEnum {
    Custom("custom"),
    Latest("latest"),
    Auto("auto"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaUpdateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaUpdateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "custom": return Custom;
            case "latest": return Latest;
            case "auto": return Auto;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
