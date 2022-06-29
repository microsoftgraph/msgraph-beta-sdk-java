package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum PhysicalAddressType implements ValuedEnum {
    Unknown("unknown"),
    Home("home"),
    Business("business"),
    Other("other");
    public final String value;
    PhysicalAddressType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PhysicalAddressType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "home": return Home;
            case "business": return Business;
            case "other": return Other;
            default: return null;
        }
    }
}
