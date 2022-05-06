package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ImportedDeviceIdentityType implements ValuedEnum {
    Unknown("unknown"),
    Imei("imei"),
    SerialNumber("serialNumber");
    public final String value;
    ImportedDeviceIdentityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ImportedDeviceIdentityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "imei": return Imei;
            case "serialNumber": return SerialNumber;
            default: return null;
        }
    }
}
