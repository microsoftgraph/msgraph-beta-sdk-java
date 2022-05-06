package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getOemWarranty method.  */
public enum WarrantyType implements ValuedEnum {
    Unknown("unknown"),
    Manufacturer("manufacturer"),
    Contractual("contractual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WarrantyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WarrantyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "manufacturer": return Manufacturer;
            case "contractual": return Contractual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
